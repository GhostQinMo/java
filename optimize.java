我优化的后的代码。
protected void setScanRangeV2(CrsDivisionDTO scanDivision, T detail,TagInfo tagInfo) {
List<DealerDivisionRelationDTO> dealerDivisionRelations = getCrsDealerSaleAreaUsesDto(detail,tagInfo);
[log.info](http://log.info/)("扫码人关联的经销的行政区划信息:{} \n 扫码人的行政区划信息:{}",JsonUtil.toJson(dealerDivisionRelations),JsonUtil.toJson(scanDivision));
detail.setScanRange(checkManagementFence(scanDivision,dealerDivisionRelations) ? IN_RANGE : OUT_OF_RANGE);
}
private boolean checkManagementFence(CrsDivisionDTO scanDivision, List<DealerDivisionRelationDTO> dealerDivisionRelationDTOList) {
return dealerDivisionRelationDTOList.stream()
.anyMatch(dealerDivisionRelationDTO -> isEqualConditional(dealerDivisionRelationDTO, scanDivision));
}
private boolean isEqualConditional(DealerDivisionRelationDTO dealerDivisionRelationDTO, CrsDivisionDTO scanDivision) {
return isEqualConditionalHelper(dealerDivisionRelationDTO.getProvinceCode(), scanDivision.getProvinceCode(), dealerDivisionRelationDTO.getCityCode()) ||
isEqualConditionalHelper(dealerDivisionRelationDTO.getCityCode(), scanDivision.getCityCode(), dealerDivisionRelationDTO.getCountyCode()) ||
isEqualConditionalHelper(dealerDivisionRelationDTO.getCountyCode(), scanDivision.getCountyCode(), dealerDivisionRelationDTO.getStreetCode()) ||
isEqualConditionalHelper(dealerDivisionRelationDTO.getStreetCode(), scanDivision.getStreetCode(), "");
}
private boolean isEqualConditionalHelper(String field1, String field2, String field3) {
return StringUtils.isNotBlank(field1) && field1.equals(field2) && StringUtils.isBlank(field3);
}

优化之前的代码
public static void judgeSalesAreaIfMatch(List<SaleAreaDTO> scanSalesAreaDTOList, CrsDealerSaleAreaUsesDto crsDealerSaleAreaUsesDto) {
[log.info](http://log.info/)("流向分类(销售五段)判定saleAreaDTOList:{},crsDealerSaleAreaUsesDto:{}", scanSalesAreaDTOList, crsDealerSaleAreaUsesDto);
List<SaleAreaUsesDto> saleAreaDTOList = crsDealerSaleAreaUsesDto.getSaleAreaUsesDtoList();
if (CollectionUtils.isEmpty(scanSalesAreaDTOList)) {
return;
}
Set<String> l2DealerSalesAreaSet = saleAreaDTOList.stream().map(SaleAreaUsesDto::getL2SaleAreaCode).collect(Collectors.toSet());
Set<String> l2ScanSalesAreaSet = scanSalesAreaDTOList.stream().map(SaleAreaDTO::getL2SaleAreaCode).collect(Collectors.toSet());
boolean res1 = matchByLevel(l2DealerSalesAreaSet, l2ScanSalesAreaSet);
//跨大区
if (!res1) {
FlowDirectionJudgmentTool.getContext().setSaleAreaClassify(FlowDirectionSalesAreaEnum.CROSS_BIG_REGION);
return;
}
Set<String> l3DealerSalesAreaSet = saleAreaDTOList.stream().map(SaleAreaUsesDto::getL3SaleAreaCode).collect(Collectors.toSet());
Set<String> l3ScanSalesAreaSet = scanSalesAreaDTOList.stream().map(SaleAreaDTO::getL3SaleAreaCode).collect(Collectors.toSet());
boolean res2 = matchByLevel(l3DealerSalesAreaSet, l3ScanSalesAreaSet);
//跨区域
if (!res2) {
FlowDirectionJudgmentTool.getContext().setSaleAreaClassify(FlowDirectionSalesAreaEnum.CROSS_AREA);
return;
}
Set<String> l4DealerSalesAreaSet = saleAreaDTOList.stream().map(SaleAreaUsesDto::getL4SaleAreaCode).collect(Collectors.toSet());
Set<String> l4ScanSalesAreaSet = scanSalesAreaDTOList.stream().map(SaleAreaDTO::getL4SaleAreaCode).collect(Collectors.toSet());
boolean res3 = matchByLevel(l4DealerSalesAreaSet, l4ScanSalesAreaSet);
//跨区域
if (!res3) {
FlowDirectionJudgmentTool.getContext().setSaleAreaClassify(FlowDirectionSalesAreaEnum.CROSS_CITY_GROUP);
return;
}
Set<String> l5DealerSalesAreaSet = saleAreaDTOList.stream().map(SaleAreaUsesDto::getL5SaleAreaCode).collect(Collectors.toSet());
Set<String> l5ScanSalesAreaSet = scanSalesAreaDTOList.stream().map(SaleAreaDTO::getL5SaleAreaCode).collect(Collectors.toSet());
boolean res4 = matchByLevel(l5DealerSalesAreaSet, l5ScanSalesAreaSet);
//跨区域
if (!res4) {
FlowDirectionJudgmentTool.getContext().setSaleAreaClassify(FlowDirectionSalesAreaEnum.CROSS_CITY);
return;
}
FlowDirectionJudgmentTool.getContext().setSaleAreaClassify(FlowDirectionSalesAreaEnum.NORMAL);

private static boolean matchByLevel(Set<String> dealerSalesAreaSet, Set<String> scanSalesAreaSet) {
    Set<String> resSet = scanSalesAreaSet.stream().filter(dealerSalesAreaSet::contains).collect(Collectors.toSet());
    //这一段没有匹配的数据
    return !CollectionUtils.isEmpty(resSet);
}
}

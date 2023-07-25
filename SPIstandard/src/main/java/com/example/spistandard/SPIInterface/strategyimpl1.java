package com.example.spistandard.SPIInterface;

/**
 * @author Black_ghost
 * @title: strategyimpl1
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @vesion 1.0.0
 * @CreateDate 2023-07-25 20:12:41
 * @Description 策略的实现类
 **/
public class strategyimpl1 implements strategy {
    @Override
    public String getstratety() {
        return "买一送一";
    }
}

package com.example.spistandard.test;

import com.example.spistandard.SPIInterface.strategy;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author Black_ghost
 * @title: spitest
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @vesion 1.0.0
 * @CreateDate 2023-07-25 20:17:24
 * @Description
 **/
public class spitest {
    @Test
    public void spitest(){
        ServiceLoader<strategy>  loader=ServiceLoader.load(strategy.class);
         Iterator<strategy> iterator = loader.iterator();
         while (iterator.hasNext()){
             System.out.println("iterator.next().getstratety() = " + iterator.next().getstratety());
         }
    }
}

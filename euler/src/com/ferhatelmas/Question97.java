package com.ferhatelmas;

import java.math.BigInteger;

/**
 * Created by IntelliJ IDEA.
 * User: felmas
 * Date: 2/24/12
 * Time: 12:18 AM
 * To change this template use File | Settings | File Templates.
 */
public class Question97 {

    public static void main(String[] args) {

        BigInteger b = new BigInteger("2");
        b = b.pow(7830457).multiply(new BigInteger("28433")).add(new BigInteger("1"));
        
        String s = b.toString();

        System.out.println(s.substring(s.length()-10));

    }

}
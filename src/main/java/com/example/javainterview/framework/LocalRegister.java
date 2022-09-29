package com.example.javainterview.framework;

import java.util.HashMap;
import java.util.Map;

/**
 * @author joakims
 * @create 2022-09-18-23:05
 **/
public class LocalRegister {
    private static Map<String,Class> map = new HashMap<>();

    public static void  register(String interfaceName,Class implClass){
        map.put(interfaceName,implClass);
    }
    public static Class get(String interfaceName){
        return map.get(interfaceName);
    }
}

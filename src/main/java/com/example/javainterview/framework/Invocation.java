package com.example.javainterview.framework;

import lombok.Data;

import java.io.Serializable;

/**
 * @author joakims
 * @create 2022-09-18-18:45
 **/

@Data
public class Invocation implements Serializable {

    private String interfaceName;
    private String methodName;
    private Class[] paramType;
    private Object[] params;
}

package com.example.javainterview.framework;

import org.apache.tomcat.util.http.fileupload.IOUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author joakims
 * @create 2022-09-18-19:45
 **/
public class HttpServerHandler {
    public void handler(HttpServletRequest request, HttpServletResponse response){
        try {
            //从http中得到这个对象。
            Invocation invocation = (Invocation) new ObjectInputStream(request.getInputStream()).readObject();
            Class clazz = LocalRegister.get(invocation.getInterfaceName());
            Method method = clazz.getMethod(invocation.getMethodName(), invocation.getParamType());
            //通过方法去找到这个实例对象。通过java 反射。
            String result = (String) method.invoke(clazz.newInstance(), invocation.getParams());

//            IOUtils.write(result,response.getOutputStream());



        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        }
    }
}

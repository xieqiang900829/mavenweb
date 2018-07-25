package com.study;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println(System.getProperty("java.class.path"));//系统的classpaht路径
        //System.out.println(System.getProperty("user.dir"));//用户的当前路径


        //File file = new File("/web/WEB-INF/dispatcher-servlet.xml");

        //System.out.println(file.exists());

        String path2 = Thread.currentThread().getContextClassLoader().getResource("/").getPath();
        System.out.println("path2 = " + path2);


    }
}

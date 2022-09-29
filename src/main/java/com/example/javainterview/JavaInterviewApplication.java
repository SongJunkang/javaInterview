package com.example.javainterview;

import com.example.javainterview.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.lang.reflect.Field;

@SpringBootApplication
public class JavaInterviewApplication {


    @Autowired
    static
    User user = new User();

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(JavaInterviewApplication.class, args);
        JavaInterviewApplication mainbean = run.getBean(JavaInterviewApplication.class);

        String[] beans = run.getBeanDefinitionNames();
//        for (String beanname:beans){
//            System.out.print(beanname+"---->");
//            System.out.println(beanname.getClass());
//        }
//        查看所有bean

        System.out.println(user instanceof User);



//        Object user1 = run.getBean("user");
//        User bean2 = run.getBean(User.class);
//        System.out.println(user1);
//        System.out.println(bean2);

        // 依赖注入，给对象赋值方法，源码，反射,放入Map单例池。
        for (Field field:user.getClass().getDeclaredFields()){
            if (field.isAnnotationPresent(Autowired.class)){

            }
        }

        int i = Math.max(2, 3);
        Class<? extends User> aClass = user.getClass();


        String s1 = new String("song");//new string会生成2个对象，推荐使用，这一种，为了后序新建一个缓存。
        // 堆里，有一个字符串常量池，新开辟了一个

        String s2 = s1.intern();//先在常量池中找，如果有，那么就指向常量池，如果没有，就是指向堆。
        String s3 = "song";//s3指向常量池中的引用。
        System.out.println(s1 == s2);// false
        System.out.println(s2 == s3);// ture
        System.out.println(s1 == s3);// false
        String s = String.valueOf(123);
        System.out.println(s.getClass());

        System.out.println(s2);//song



    }

}

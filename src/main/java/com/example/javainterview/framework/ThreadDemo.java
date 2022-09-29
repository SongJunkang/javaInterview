package com.example.javainterview.framework;

/**
 * @author joakims
 * @create 2022-09-19-23:52
 **/
public class ThreadDemo {

    private static ThreadLocal threadLocal;

    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();

    }



    static class MyThread extends  Thread{
        private int ticket = 5;
        public void run(){
            while (true)
            {
                System.out.println("Thread ticket = " + ticket --);
                if (ticket < 0)
                {
                    break;
                }
            }
        }
    }

}

package com.Java_Experimentation.threads;

/**
 * @author Manoj.Mohanan Nair
 * @Date 7/26/19
 */
public class ThreadA {
    public static void main(String[] args){
        ThreadB thr = new ThreadB();
        thr.setName("manoj");
        thr.start();
        /*ThreadB ths = new ThreadB(20);
        ths.start();*/

        synchronized (thr){
            try{
                System.out.println("waiting for b to complete");
                thr.wait();
            }catch (InterruptedException e) {
                System.out.println("total is: "+ thr.total);
            }
            System.out.println("Exiting synchronized b to complete");
        }
        System.out.println("Exited the synchronized block b");
    }
}

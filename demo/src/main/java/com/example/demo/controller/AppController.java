package com.example.demo.controller;

public class AppController {

    //a+b
    public static int somma(int a , int b){
        if(a<0) {
            System.out.println("inserisci numero A >0");
            return 0;
        }
        else{
            if(b<0){
                System.out.println("inserisci numero B >0");
                return 0;
            }
        }
        return a+b;

    }

    // a-b
    public  static int sottrazione(int a , int b){
        if(a<0) {
            System.out.println("inserisci numero A >0");
            return 0;
        }
        else{
            if(b<0){
                System.out.println("inserisci numero B >0");

            }
        }
        return a-b;
    }
}
package com.campusdual.classroom;

import java.security.spec.ECField;

public class Exercise {
    public static void main(String[] args) {
        try{
            throw new RuntimeException("Excepción");
        }catch (Exception e){
            System.out.println("Excepción controlada: " + e.getMessage());

        }

    }
}

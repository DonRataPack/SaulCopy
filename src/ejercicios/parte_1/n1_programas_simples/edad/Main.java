package com.mis_ejercicios.parte_1.n2_estructuras_condicionales.edad;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        int anioNacimiento = 2001;
        int anios =  obtenerAnioActual()- anioNacimiento;
        System.out.println("Tu edad es de " + anios);
    }
    private static int obtenerAnioActual(){
        Calendar calendario = Calendar.getInstance();
        return calendario.get(Calendar.YEAR);
    }
}

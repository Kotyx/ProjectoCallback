package com.company;

public class Main {


    public static void main(String[] args) {
        Camarero camarero = new Camarero();
        // Es importante que empiece el camarero ya que se queda esperando.
        camarero.start();
    }


}

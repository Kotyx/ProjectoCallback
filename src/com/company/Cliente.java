package com.company;

public class Cliente extends Thread {

    Camarero cam;
    public Cliente(Camarero camarero){cam=camarero;}
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Cliente - Voy a esperar a que me traigan comida...");
                cam.prepararComanda();
                System.out.println("Cliente - Voy a consumir la comida en 3 segundos");
                sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

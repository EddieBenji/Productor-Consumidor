package Main;


import Thread.TransaccionBancaria;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hyuchiha
 */
public class Main {

    public static void main(String[] args) {

        TransaccionBancaria vc = new TransaccionBancaria();

        Thread Luis = new Thread(vc, "Luis");
        Thread Manuel = new Thread(vc, "Manuel");

        Luis.start();
        Manuel.start();
    }
}

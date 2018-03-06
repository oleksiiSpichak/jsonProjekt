/*
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

*/
/**
 * Created by Zver on 24.02.2018.
 *//*

public class PorotocolServer  {

    ServerSocket serv;

    public PorotocolServer() throws IOException {
    }

    public void servSocet() throws IOException {
        serv = new ServerSocket(3000);
        try {
            while (true) {
                new Handler(serv.accept()).start();
            }
        } finally {
            serv.close();
        }

    }
    public static class Handler extends Thread{

        private BufferedReader in;
        private Socket socket;

        public Handler(Socket socket){
            socket = socket;
        }


        @Override
        public void run(){
            try {
                in = new BufferedReader(new InputStreamReader(
                        socket.getInputStream()));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
   */
/* Gson gson = new GsonBuilder().create();
    Person p = gson.fromJson(reader, Person.class);
            System.out.println(p);*//*


    public class Avtorize{
        String login;
        String password;
    }


}
*/

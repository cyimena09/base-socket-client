package be.cyimena;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main2 {

    /**
     * Permet d'envoyer une chaine de caractère
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Connexion au server");
        Socket s = new Socket("192.168.1.9", 1234);
        InputStream is = s.getInputStream();
        OutputStream os = s.getOutputStream();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Donnez une chaine de caractère : ");
        String data = scanner.next();

        System.out.println("J'envoie la donnée suivante au serveur : " + data);
        PrintWriter pw = new PrintWriter(os, true);
        pw.println(data);
    }

}

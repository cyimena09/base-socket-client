package be.cyimena;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    /**
     * Permet d'envoyer un octet.
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Connexion au server");
        Socket s = new Socket("192.168.1.9", 1234);
        InputStream is = s.getInputStream();
        OutputStream os = s.getOutputStream();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Donnez un nombre : ");
        int nb = scanner.nextInt();
        System.out.println("J'envoie le nombre " + nb + " au serverur.");
        os.write(nb);
        System.out.println("J'attends la réponse du serveur ...");
        int res = is.read();
        System.out.println("La réponse du serveur est : " + res);
    }

}

package be.cyimena;

import be.cyimena.entity.Voiture;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Main3 {

    /**
     * Permet d'envoyer un objet après l'avoir Sérialisé.
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Connexion au server");
        Socket s = new Socket("192.168.1.9", 1234);
        OutputStream os = s.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(os);

        System.out.println("Envoi de l'objet ...");
        Voiture v = new Voiture("BMW", 50);
        oos.writeObject(v);
    }

}

import java.io.*;
import java.net.*;
import java.io.InputStream;



//Main du client
public class Main {

	public static void main(String[] args) {
		
		//lancement de la fen�tre de connexion
		Fenetre fenetreConexion= new Fenetre("conexion");
		fenetreConexion.setVisible(true);
		ConexionServeur conexion= new ConexionServeur();
		conexion.envoieRequete();


	}

}

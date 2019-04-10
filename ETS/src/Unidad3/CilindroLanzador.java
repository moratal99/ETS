package Unidad3;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;
/**
 * 
 * @author alumnodam
 *
 */
public class CilindroLanzador {
	/**
	 * 
	 */
	static ArrayList<Cilindro> listacilindro = new ArrayList();
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido al cilindro amig@");
		Scanner scan = new Scanner(System.in);
		leerdatos();
		mostraresultado();
	}
	/**
	 * con este metodo le mostramos los datos al usuario 
	 */
	public static void mostraresultado() {
		for (Cilindro variable: listacilindro) {
			JOptionPane.showMessageDialog(null, "El volumen del cilindro es el siguiente "+variable.CalcularVolumen());
			JOptionPane.showMessageDialog(null, "El area del cilindro es la siguiente "+variable.CalcularArea());
		}
	}
	/**
	 * con este metodo leemos los datos y le pasamos los datos a la clase 
	 */
	public static void leerdatos() {
		String radio;
		String altura;
			radio=JOptionPane.showInputDialog("Dime lo que vale la base");
			altura=JOptionPane.showInputDialog("Dime lo que vale la atlura");
		float radiocilindro = Float.parseFloat(radio);
		float alturacilindro = Float.parseFloat(altura);
		Cilindro cil;
		cil = new Cilindro(radiocilindro, alturacilindro);
		cil.setRadio(radiocilindro);
		cil.setAltura(alturacilindro);
		listacilindro.add(cil);
	}

}

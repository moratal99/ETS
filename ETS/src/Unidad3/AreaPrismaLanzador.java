package Unidad3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
/**
 * este programa va a realizar el area del prisma
 * @author alumnodam
 *
 */
public class AreaPrismaLanzador {
	static ArrayList<AreaPrismaObejto> lista = new ArrayList();
	static ArrayList<Float> listaareatotal = new ArrayList();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int contador = 3;
		System.out.println("============================");
		System.out.println(" CREACION DE OBJETOS PRISMA ");
		System.out.println("============================");
		Random aleatorio = new Random();
		leerdatos(contador, aleatorio);
		mostrar();
		mayoramenor();
			}
	/**
	 * 
	 */
	public static void mayoramenor() {
		listaareatotal.sort(null);
		Collections.reverse(listaareatotal);
		System.out.println("Las areas son las siguientes");
		System.out.println(listaareatotal);
	}
	/**
	 * 
	 */
	public static void mostrar() {
		int i = 0;
	for (AreaPrismaObejto x: lista) {
			float operacion = x.areaTotal();
			System.out.println("Creado el objeto Prisma "+(i + 1)+" con");
			System.out.println(" - Base: "+x.getBaseTriangulo());
			System.out.println(" - Altura: "+x.getAlturaPrisma());
			System.out.println(" - Area Total: "+operacion);
			System.out.println();
			listaareatotal.add(operacion);
			i++;
	}
	}
	/**
	 * 
	 * @param contador
	 * @param aleatorio
	 */
	public static void leerdatos(int contador, Random aleatorio) {
		int  mientras = 0;
		do {
			int baseTriangulo = aleatorio.nextInt(100);
			int alturaPrisma = aleatorio.nextInt(100);
			AreaPrismaObejto prisma;
			prisma = new AreaPrismaObejto(baseTriangulo,alturaPrisma);
			prisma.setBaseTriangulo(baseTriangulo);
			prisma.setAlturaPrisma(alturaPrisma);
			lista.add(prisma);
			mientras++;
		}while(mientras < contador);
	}

}

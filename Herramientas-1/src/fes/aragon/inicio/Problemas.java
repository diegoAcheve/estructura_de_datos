package fes.aragon.inicio;
import java.util.Random;
import fes.aragon.excep.IndiceFueraDeRango;
import fes.aragon.utilerias.estaticas.Arreglos;

public class Problemas {
	public static void main(String[] args) throws IndiceFueraDeRango {
		Arreglos<Integer> numeros = new Arreglos<>(10);
		Random rd = new Random();
		// Se le van a asignar valores aleatorios de 0 a 100
		
		for (int i = 0; i < numeros.longitud(); i++) {
			numeros.asignar(i, rd.nextInt(100));
		}
			numeros.imprime();	
		
		//La siguiente seccion del código regresa el numero mayor
		int aux = 0;
		int num_mayor = 0;
		for(int i = 0; i < numeros.longitud(); i++) {
			aux = numeros.recupera(i);
			if (aux > num_mayor) {
				num_mayor = aux;
			}
		}
		System.out.println(num_mayor);
		System.out.println(numeros.promedio());
		System.out.println(numeros.maximo());
		System.out.println(numeros.minimo());
	}
}


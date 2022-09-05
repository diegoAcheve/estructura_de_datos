package fes.aragon.utilerias.estaticas;

import fes.aragon.excep.IndiceFueraDeRango;

/**
* Clase que tiene funciones para ocupar arreglos de tipo Integer
*
* @author mash
*
*/
public class Arreglos <E>{
	private int indice = 0;
	private final Object[] l;
	
	public Arreglos(int numeroElementos) {
		this.l = new Object[numeroElementos];
	}
	/**
	* Método que inserta un valor de tipo Integer consecutivo
	*
	* @param x es el parámetro que se recibe para agregar a la lista
	* @throws IndiceFueraDeRango exepción que pasa cuando nos salimos fuera del
	* índice
	*/
	public void insertar(E x) throws IndiceFueraDeRango {
		if (indice < l.length) {
			l[indice] = x;
			indice++;
			} else {
			throw new IndiceFueraDeRango("Indice fuera de rango");
			}
	}
	/**
	* Método que localiza un valor en la lista, retornan el indice
	*
	* @param x valor Integer que se busca en la lista
	* @return se retorna -1 si no esta el valor de la lista, en caso contrario se
	* retorna el indice
	*/
	public Integer localiza(E x) {
		for (int i = 0; i < l.length; i++) {
			if (l[i].equals(x)) {
				return i;
				}
		}
		return -1;
	}
	/**
	* Método que recupera un elemento en el indice indicado
	*
	* @param p entero que indica el indice del elemento a devolver
	* @return E que se retorna, tomando la posición siguiente que se
	* da como parametro
	* @throws IndiceFueraDeRango excepción que se arroja cuando el indice p esta
	* fuera de los rangos del arreglo
	*/
	public E recupera(int p) throws IndiceFueraDeRango {
		if (p > l.length || p < 0) {
			throw new IndiceFueraDeRango("Indice fuera de rango");
			} else {
				@SuppressWarnings("unchecked")
				final E e=(E)l[p];
				return e;
				}
	}
	/**
	* Método que alimina un elemento en el indice indicado
	*
	* @param p entero que indica el indice del elemento a eliminar
	* @throws IndiceFueraDeRango excepción que se arroja cuando el indice p esta
	* fuera de los rangos del arreglo
	*/
	public void suprime(int p) throws IndiceFueraDeRango {
		if (p > l.length || p < 0) {
			throw new IndiceFueraDeRango("Indice fuera de rango");
			} else {
				l[p] = null;
				}
	}
	/**
	* Método que da el elemento siguiente de la posición que nos indica
	*
	* @param p entero que indica el indice del elemento a devolver
	* @return E que se retorna, tomando la posición siguiente que se
	* da como parametro
	* @throws IndiceFueraDeRango excepción que se arroja cuando el indice p esta
	* fuera de los rangos del arreglo
	*/
	public E siguiente(int p) throws IndiceFueraDeRango {
		if (p > l.length - 1 || p < 0) {
			throw new IndiceFueraDeRango("Indice fuera de rango");
			}
		@SuppressWarnings("unchecked")
		final E e=(E)l[p + 1];
		return e;
	}
	/**
	* Método que da el elemento anterior de la posición que nos indica

	*
	* @param p entero que indica el indice del elemento a devolver
	* @return Integer que se retorna Integer tomando la posición anterior que se da
	* como parametro
	* @throws IndiceFueraDeRango excepción que se arroja cuando el indice p esta
	* fuera de los rangos del arreglo
	*/
	public E anterior(int p) throws IndiceFueraDeRango {
		if (p > l.length || p < 1) {
			throw new IndiceFueraDeRango("Indice fuera de rango");
			}
		@SuppressWarnings("unchecked")
		final E e=(E)l[p - 1];
		return e;
	}
	/**
	* Méotodo que limpia el arreglo de Enteros
	*
	*/
	public void limpiar() {
		for (int i = 0; i < l.length; i++) {
			l[i] = null;
			}
	}
	/**
	* Método que regresa el primer elemento del arreglo, si no existe regresa un
	* null
	* @return retorna E o null del primer elemento del arreglo
	*/
	public E primero() {
		@SuppressWarnings("unchecked")
		final E e=(E)l[0];
		return e;
	}
	/**
	* Método que devuelve la longitud del arreglo
	* @return un entero que es la longitud del arreglo
	*/
	public Integer longitud() {
		return l.length;
	}
	/**
	* Método que imprime todos los valores del arreglo
	*/
	public void imprime() {
		for (int i = 0; i < l.length; i++) {
			System.out.print(l[i]+" ");
			}
		System.out.println();
	}
	/**
	* Método que asignara un valor en la posición indicada
	* @param p entero que indica la posición donde se inserta el valor en el arreglo
	* @param x valor que se insertara en la posicion que se indica en p
	* @throws IndiceFueraDeRango exepción que sucede cuando no estamos en el rango del arreglo
	*/
	public void asignar(int p,E x) throws IndiceFueraDeRango {
		if (p > l.length || p < 0) {
			throw new IndiceFueraDeRango("Indice fuera de rango");
			} else {
				l[p]=x;
				}
	}
	/**
	 * Método que regresa el valor promedio de los números dentro del arreglo 
	 */
	public Float promedio() {
		int suma = 0;
		for (int i = 0; i < l.length; i++) {
			suma = suma +  (int)l[i];
			}
		return (float) (suma/l.length);
	}
	/**
	 * Método que regresa el valor máximo (más alto) de los números dentro del arreglo 
	 */
	public Integer maximo(){
		int max = 0; int aux = 0;
		for(int i=0; i<l.length; i++) {
			aux = (int)l[i];
			if(aux > max) {
				max = aux;
			}
		}
		return max;
	}
	/**
	 * Método que regresa el valor mínimo (más pequeño) de los números dentro del arreglo 
	 */
	public Integer minimo() {
		int min = (int)l[0]; int aux = 0;
		for(int i=0; i<l.length; i++) {
			aux = (int)l[i];
			if(aux < min) {
				min = aux;
			}
		}
		return min;
	}
	/**
	 * Metodo que devuelve los valores del arreglo dentro del intervalo a - b
	 * @param a Entero con el valor inicial del intervalo, por lo tanto mayor a 0 y menor a 'b'
	 * @param b Entero con el valor final del intervalo, por lo tanto mayor a 'a' y menor a la longitud del arreglo
	 * @throws IndiceFueraDeRango Exepción que sucede cuando no estamos en el rango del arreglo
	 */
	public void Intervalo(int a, int b) throws IndiceFueraDeRango {
		if (a<=0 || a>=b || b>l.length) {
			throw new IndiceFueraDeRango("Indice fuera de rango");
			} else {
				for (int i = a; i < b; i++) {
					System.out.print(l[i]+" ");
					}
				System.out.println();
				}
	}
	/**
	 * Metodo que devuelve el valor medio del arreglo
	
	public Integer valormedio() {
		int medio = 0;
		
		
	}
	 */
}

//Marcos Pallas Perez
package repaso_examen_entornos;
/**
 * <h2>Gestion de notas</h2>
 * @author a023916070a
 * @version 1.0
 */
public class Repaso {
	int nota1,nota2=0;
	
	String nombre="";
	
	/**
	 * Muestra el nombre de la persona
	 */
	void mostrarNombre() {
		System.out.println(nombre);
	}
	
	
	/**
	 * 
	 * @param nota1 Primera nota en formato entero
	 * @param nota2 Segunda nota en formato entero
	 * @return Devuelve el resultado de la suma de ambas
	 */
	int suma(int nota1,int nota2) {
		int resultado=nota1+nota2;
		return resultado;
	}
	
	/**
	 * Muestra todos los datos de la persona
	 */
	void mostrarDatos() {
		System.out.println(nombre + nota1 + nota2);
	}
	
	/**
	 * Obtiene la nota
	 * @return Devuelve la primera nota
	 */
	public int getNota1() {
		return nota1;
	}


	/**
	 * Fija la primera nota 
	 * @param nota1 Indicar la nota 
	 */
	
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}


	/**
	 * Obtiene la nota
	 * @return Devuelve la segunda nota 
	 */
	public int getNota2() {
		return nota2;
	}


/**
 * fija la segunda nota 
 * @param nota2 Introduce la segunda nota
 */
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}


/**
 * Obtiene el nombre de la persona
 * @return Devuelve el nombre de la persona
 */
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


/**
 * Constructor de la Clase
 * @param nota1 Primera nota en formato entero
 * @param nota2 Segunda nota en formato entero
 * @param nombre Nombre en tipo Cadena
 */
	public Repaso(int nota1, int nota2, String nombre) {
		super();
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nombre = nombre;
	}

	public Repaso() {
		super();
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nombre = nombre;
	}



	

}

//Marcos Pallas Perez
package repaso_examen_entornos;

public class Repaso {
	int nota1,nota2=0;
	String nombre="";
	
	void mostrarNombre() {
		System.out.println(nombre);
	}
	
	int suma(int nota1,int nota2) {
		int resultado=nota1+nota2;
		return resultado;
	}
	
	void mostrarDatos() {
		System.out.println(nombre + nota1 + nota2);
	}
	public int getNota1() {
		return nota1;
	}



	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}



	public int getNota2() {
		return nota2;
	}



	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



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



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

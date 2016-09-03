import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Operacion op=new Suma(0,0);
		Scanner leer=new Scanner(System.in);
		System.out.println("Ingrese numero 1:");
		float a=leer.nextFloat();
		System.out.println("Ingrese numero 2:");
		float b=leer.nextFloat();
		System.out.println("Ingrese operacion: \n" + 
				"\t1. Suma \n " +
				"\t2. Resta \n " +
				"\t3. Multiplicacion \n " +
				"\t4. Division \n ");
		int signo=leer.nextInt();
		switch(signo){
		case 1:
			op= new Suma(a,b);
			break;
		case 2:
			op=new Resta(a,b);
			break;
		case 3:
			op=new Multiplicacion(a,b);
			break;
		case 4:
			op=new Division(a,b);
			break;	
		default:
			System.out.println("No elegiste ninguna de las opciones.");
		}
		float res=op.calcular();
		System.out.println("El resultado es: " + res);
		leer.close();
	}

}

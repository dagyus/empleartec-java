
public class Division extends Operacion {
	public Division(float a, float b) {
		super.num1=a;
		super.num2=b;
	}
	@Override
	public float calcular() {
		if(num2!=0)
			return num1/num2;
		else {
			System.out.println("Estas queriendo dividir por 0 y eso no se puede xD.");
			return 0;
		}
	}

}

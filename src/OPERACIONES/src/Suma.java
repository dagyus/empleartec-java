
public class Suma extends Operacion{

	
	public Suma(float a, float b) {
		super.num1=a;
		super.num2=b;
	}

	@Override
	public float calcular() {
		return num1+num2;
	}

}

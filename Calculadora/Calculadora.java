public class Calculadora {

	public float soma(float num1, float num2) {
		return num1 + num2;
	}
	/**
	* realiza subtracao
	*/
	public float subtracao(float num1, float num2) {
		return num1 - num2;
	}
	
	public float multiplicacao(float num1, float num2) {
		return num1 * num2;
	}
	

	// Dividir dois numeros	public float dividir(float num1, float num2) {
		if (num2 <> 0)
			return num1 / num2;
		return 0;
	}
	
}
package temp;

public class CalculadoraTestes {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		int res = calc.somar(78, 22);
		System.out.println(res);
		
		res=calc.somar(2, -3);
		System.out.println(res);
		
		res=calc.somar(2, 0);
		System.out.println(res);
		
		res=calc.somar(0, 0);
		System.out.println(res);
	}
}

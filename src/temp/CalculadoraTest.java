package temp;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(2, 18);
		
		Assert.assertEquals(20, soma);
	}
}

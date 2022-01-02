package main.br.com.adriano.service;

import java.math.BigDecimal;


public class BonusService {

	public BigDecimal calcularBonus(main.br.com.adriano.modelo.Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			valor = BigDecimal.ZERO;
		}
		return valor;
	}

}

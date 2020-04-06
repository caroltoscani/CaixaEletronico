

import static org.junit.Assert.*;

import org.junit.Test;



public class CaixaEletronicoTeste {

	
	
	@Test
	public void testVerificarValor() {
		CaixaEletronico cx = new CaixaEletronico();
		
		assertTrue(cx.verificarValor("1000"));
		assertTrue(cx.verificarValor("280"));
		assertFalse(cx.verificarValor(".80"));
		assertFalse(cx.verificarValor("18ç8"));	
		assertFalse(cx.verificarValor("1800.00"));	
		assertFalse(cx.verificarValor("999999"));	
	}

	
	@Test
	public void testCalcularNotas() {
		CaixaEletronico cx = new CaixaEletronico();
		int val = 500;
		int[][] vet;
		vet = cx.calcularNotas(val);
		assertEquals( 5, vet[0][0]);
		
	}

	
}

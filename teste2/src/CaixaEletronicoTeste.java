

import static org.junit.Assert.*;

import org.junit.Test;



public class CaixaEletronicoTeste {

	@Test
	public void testGetValor() {
		CaixaEletronico cx = new CaixaEletronico();
		//assetint val = cx.getValor();
		fail("Not yet implemented");
	}

	@Test
	public void testIniciarMenu() {
		fail("Not yet implemented");
	}

	@Test
	public void testVerificarValor() {
		CaixaEletronico cx = new CaixaEletronico();
		//adicionar as validações	
		assertTrue(cx.verificarValor("280"));
		assertFalse(cx.verificarValor(".80"));
		assertFalse(cx.verificarValor("0"));	
	}

	
	@Test
	public void testCalcularNotas() {
		CaixaEletronico cx = new CaixaEletronico();
		int val = 500;
		int[][] vet;
		vet = cx.calcularNotas(val);
		assertEquals( 5, vet[0][0]);
		
	}

	@Test
	public void testObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testWait() {
		fail("Not yet implemented");
	}

	@Test
	public void testFinalize() {
		fail("Not yet implemented");
	}

}

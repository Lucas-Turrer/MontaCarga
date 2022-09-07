package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import unlam.pb2.Mercaderia;
import unlam.pb2.Montacarga;

public class TestMontacarga {

	@Test
	public void QueSeCreaUnMontaCarga() {
		Montacarga montacargaDeposito =  new Montacarga (0, 50.00);
		
		assertNotNull(montacargaDeposito);
	}
	
	@Test
	public void QueSeCargaUnaCajaAlMontaCarga() {
		Mercaderia caja = new Mercaderia (34.50);
		Montacarga montacargaDeposito =  new Montacarga (0, 50.00);
		
		montacargaDeposito.cargarMercaderia(caja);
		
		Double valorEsperado = 34.50;
		Double valorObtenido = montacargaDeposito.getPesoActual();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void QueSeCargaUnaCajaAlMontaCargaYSubeUnPiso() {
		Mercaderia caja = new Mercaderia (34.50);
		Montacarga montacargaDeposito =  new Montacarga (0, 50.00);
		
		montacargaDeposito.cargarMercaderia(caja);
		montacargaDeposito.subirPiso(9);
		
		Integer valorEsperado = 9;
		Integer valorObtenido = montacargaDeposito.getPisoActual();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void QueSeCargaUnaCajaAlMontaCargaYNoSubeUnPiso() {
		Mercaderia caja = new Mercaderia (34.50);
		Mercaderia caja2 = new Mercaderia (34.50);
		Montacarga montacargaDeposito =  new Montacarga (0, 50.00);
		
		montacargaDeposito.cargarMercaderia(caja);
		montacargaDeposito.cargarMercaderia(caja2);
		montacargaDeposito.subirPiso(9);
		
		Integer valorEsperado = 0;
		Integer valorObtenido = montacargaDeposito.getPisoActual();
		
		assertEquals(valorEsperado, valorObtenido);
	}

}

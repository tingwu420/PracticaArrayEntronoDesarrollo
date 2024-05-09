package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class medianaNotas {

	static int[]notasValidas;
	static int[]notasNoValidas;
	@BeforeAll
	public static void inicializarDatos() {
		notasValidas= new int[]{1,2,3,4,5,6,7,8,9,10};
		notasNoValidas= new int[]{-1,11,-2,-9,20};
	}

		@Test
		public void testMedianaNota() {	        
		      float mediana = MisArrays.medianaNotas(notasValidas);
		      assertEquals(5.5,mediana);
		}
	
		@Test
		public void testMediaNovalidosNotaError() {
			assertThrows(IllegalArgumentException.class, () -> MisArrays.medianaNotas(notasNoValidas));
	              
		    }

}

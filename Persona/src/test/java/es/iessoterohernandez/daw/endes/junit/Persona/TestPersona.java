package es.iessoterohernandez.daw.endes.junit.Persona;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;

public class TestPersona {


	private Persona p;
	
	@BeforeEach
	void setUp() throws Exception{
		p = new Persona();
	}
	
	@AfterEach
	void tearDown() throws Exception{
		p = null;
	}
	
	
	@Test
	void testCalcularIMC() {
		Persona p = new Persona ("Alejandro", 15, 'H', 68, 1.78);
		assertEquals(Persona.PESO_IDEAL, p.calcularIMC(), "IMC retorna 0");
		
		p = new Persona ("Mercedes", 25, 'M', 50, 1.67);
		assertEquals(Persona.INFRAPESO, p.calcularIMC(), "IMC retorna -1");
		
		p = new Persona ("Fran", 30, 'H', 90, 1.70);
		assertEquals(Persona.SOBREPESO, p.calcularIMC(), "IMC retorna 1");
	}
	
	@Test
	Void testEsMayorDeEdad() {
		Persona p1 = new Persona ("Maria", 20, 'M', 65, 1.63);
		assertrue(p1.esMayorDeEdad());
		Persona p2 = new Persona ("Ricardo", 17, 'H', 80, 1.80);
		assertfalse(p2.esMayorDeEdad());
		return null;
	}

	private void assertfalse(boolean esMayorDeEdad) {
		// TODO Auto-generated method stub
		
	}

	private void assertrue(boolean esMayorDeEdad) {
		// TODO Auto-generated method stub
		
	}
	
/*
	@Test
	void testPersonaStringIntCharDoubleDouble() {
		Persona p3 = new Persona("Nieves", 22, 'M', 56, 155);
		assertThat(p3.getDNI(), notNullValue());
		assertEquals(p3.getSexo());
	}
	*/
	
	@Test
	void testComprobarSexo() {
		Persona p3 = new Persona("Joaquin", 40, 'H', 70, 180);
		assertEquals(p3.getSexoDef(), p3.getSexo(), "El sexo por defecto");
	}
	


}

/*generar test para los métodos públicos, refactorizar los constructores(de los constructores no hay que hacer test), y luego
los métodos públicos a privados...*/
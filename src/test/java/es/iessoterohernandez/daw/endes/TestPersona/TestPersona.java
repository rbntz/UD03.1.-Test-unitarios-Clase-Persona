package es.iessoterohernandez.daw.endes.TestPersona;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class TestPersona {
	
	private Persona persona;

	@BeforeEach
	public void init() {
		persona = new Persona("Raúl", 22, 'H', 65, 1.70);
	}
	
	@Test
	public void testCalcularPesoIdeal() {
		assertEquals(Persona.PESO_IDEAL, persona.calcularIMC());
        
        persona.setPeso(20);
        assertEquals(Persona.INFRAPESO, persona.calcularIMC());
        
        persona.setPeso(150);
        assertEquals(Persona.SOBREPESO, persona.calcularIMC());
	}
	
	@Test
	public void testMayorEdad() {
        assertTrue(persona.esMayorDeEdad());
    }

}

package test;

import copControl.Mapa;
import copControl.Posicion;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import avion.AvionSimple;

public class AvionTest {

    @Test
    public void testEsPosicionContenidaTrue() {  
        AvionSimple avionSimple = new AvionSimple(new Posicion(10, 10), new Posicion(10, 10), new Mapa());
        Posicion posicionDentroDelRadio = new Posicion(12, 12); 
        boolean resultado = avionSimple.esPosicionContenida(posicionDentroDelRadio);

        assertTrue("La posición debería estar contenida en el radio del avión.",resultado);
    }

    @Test
    public void testEsPosicionContenidaFalse() {
        AvionSimple avionSimple = new AvionSimple(new Posicion(10, 10), new Posicion(10, 10), new Mapa());
        Posicion posicionFueraDelRadio = new Posicion(20, 20); // Una posición fuera del radio
        boolean resultado = avionSimple.esPosicionContenida(posicionFueraDelRadio);

        assertFalse("La posición no debería estar contenida en el radio del avión.",resultado);
    }
}
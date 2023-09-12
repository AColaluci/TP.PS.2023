package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import copControl.Posicion;
import pista.PistaLarga;
import avion.AvionComputarizado;
import avion.AvionPesado;
import avion.AvionSimple;

public class PistaLargaTest{

    @Test
    public void testPuedeAterrizarAvionSimpleTrue() throws Exception{
        PistaLarga pista = new PistaLarga(new Posicion(1, 1));
        AvionSimple avionSimple = new AvionSimple(new Posicion(0, 0), new Posicion(50, 50), null);

        boolean puedeAterrizar = pista.puedeAterrizar(avionSimple);

        assertTrue( "Debería poder aterrizar un AvionSimple en una PistaLarga.",puedeAterrizar);
    }

    @Test
    public void testPuedeAterrizarAvionPesadoFalse() throws Exception{
        Posicion posicionEntrada = new Posicion(10, 20);
        PistaLarga pista = new PistaLarga(posicionEntrada);
        AvionPesado avionPesado = new AvionPesado(new Posicion(0, 0), new Posicion(50, 50), null);

        boolean puedeAterrizar = pista.puedeAterrizar(avionPesado);

        assertFalse("No debería poder aterrizar un AvionPesado en una PistaLarga.",puedeAterrizar);
    }

    @Test
    public void testPuedeAterrizarAvionComputarizadoTrue() throws Exception{
        Posicion posicionEntrada = new Posicion(10, 20);
        PistaLarga pista = new PistaLarga(posicionEntrada);
        AvionComputarizado avionComputarizado = new AvionComputarizado(new Posicion(0, 0), null);

        boolean puedeAterrizar = pista.puedeAterrizar(avionComputarizado);

        assertTrue("Debería poder aterrizar un AvionComputarizado en una PistaLarga.",puedeAterrizar);
    }
}
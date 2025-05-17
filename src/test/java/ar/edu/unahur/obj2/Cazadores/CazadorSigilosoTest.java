package ar.edu.unahur.obj2.Cazadores;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.Profugos.ArteMarcialProfugoDecorator;
import ar.edu.unahur.obj2.Profugos.Profugo;
import ar.edu.unahur.obj2.Profugos.ProteccionLegalProfugoDecorator;
import ar.edu.unahur.obj2.Zonas.Zona;


public class CazadorSigilosoTest {

    Cazador sigiloso = new CazadorSigiloso(40);
    Profugo profugoSimple = new Profugo(30, 26, false);
    ArteMarcialProfugoDecorator conArteMarcial = new ArteMarcialProfugoDecorator(new Profugo(30, 26, false));
    ProteccionLegalProfugoDecorator conProteccionLegal = new ProteccionLegalProfugoDecorator(new Profugo(28, 3, false));

    Zona zona = new Zona("Zona 1");

    @BeforeEach
    void setUp() {
        zona.vaciarProfugos();
        zona.agregarProfugo(profugoSimple);
        zona.agregarProfugo(conArteMarcial);
        zona.agregarProfugo(conProteccionLegal);
    }

    @Test
    void testProcesoCapturaCazadorSigiloso_CapuraAlProfugoNoDecoradoEIntimidaAlResto() {
        sigiloso.procesoCaptura(zona);
        assertEquals(1, sigiloso.getProfugosCapturados().size());
        assertEquals(2, zona.getProfugos().size());
        assertTrue(sigiloso.getProfugosCapturados().contains(profugoSimple));
        assertEquals(42, conArteMarcial.getHabilidad());

    }
}
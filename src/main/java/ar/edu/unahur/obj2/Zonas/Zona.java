package ar.edu.unahur.obj2.Zonas;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.Profugos.IProfugo;

public class Zona {
    private final String nombre;
    private List<IProfugo> profugos;

    public Zona(String nombre) {
        this.nombre = nombre;
        this.profugos = new ArrayList<>();
    }

    public Zona(String nombre, List<IProfugo> profugos) {
        this.nombre = nombre;
        this.profugos = profugos;
    }

    public void agregarProfugo(IProfugo profugo) {
        profugos.add(profugo);
    }

    public void quitarProfugo(IProfugo profugo) {
        this.profugos.remove(profugo);
    }

    public String getNombre() {
        return nombre;
    }

    public List<IProfugo> getProfugos() {
        return List.copyOf(profugos);
    }

    public void vaciarProfugos() {
        profugos.clear();
    }

}
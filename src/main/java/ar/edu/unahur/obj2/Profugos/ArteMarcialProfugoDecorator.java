package ar.edu.unahur.obj2.Profugos;

public class ArteMarcialProfugoDecorator extends ProfugoDecorator {

    public ArteMarcialProfugoDecorator(IProfugo profugo) {
        super(profugo);
    }

    @Override
    public Integer getHabilidad() {
        return Math.min(100, profugo.getHabilidad() * 2);
    }
}
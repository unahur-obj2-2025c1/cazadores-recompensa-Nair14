package ar.edu.unahur.obj2.Profugos;

public class EntrenamientoEliteProfugoDecorator extends ProfugoDecorator {

    public EntrenamientoEliteProfugoDecorator(IProfugo profugo) {
        super(profugo);
    }

    @Override
    public Boolean esNervioso() {
        return Boolean.FALSE;
    }

}
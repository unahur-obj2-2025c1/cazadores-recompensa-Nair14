package ar.edu.unahur.obj2.Cazadores;

import ar.edu.unahur.obj2.Profugos.IProfugo;

public class CazadorRural extends Cazador {

    public CazadorRural(Integer experiencia) {
        super(experiencia);
    }

    @Override
    public Boolean puedeCapturarseEspecifica(IProfugo profugo) {
        return profugo.esNervioso();
    }

    @Override
    public void intimidarParticular(IProfugo profugo) {
        profugo.volverseNervioso();
    }

}



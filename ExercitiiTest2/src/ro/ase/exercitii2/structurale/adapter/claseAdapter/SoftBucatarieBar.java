package ro.ase.exercitii2.structurale.adapter.claseAdapter;

import ro.ase.exercitii2.structurale.adapter.clasaExistenta.ISoftBucatarie;

public class SoftBucatarieBar implements ISoftBucatarie {
    private SoftBar softBar;

    public SoftBucatarieBar(SoftBar softBar) {
        this.softBar = softBar;
    }

    @Override
    public void printeazaFactura(Double sumaDePlata) {
        this.softBar.genereazaNotaPlata(sumaDePlata);
    }
}

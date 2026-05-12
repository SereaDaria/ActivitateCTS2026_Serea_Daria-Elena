package ro.ase.exercitii2.structurale.adapter.main;

import ro.ase.exercitii2.structurale.adapter.clasaExistenta.ISoftBucatarie;
import ro.ase.exercitii2.structurale.adapter.clasaExistenta.SoftBucatarie;
import ro.ase.exercitii2.structurale.adapter.claseAdapter.SoftBar;
import ro.ase.exercitii2.structurale.adapter.claseAdapter.SoftBucatarieBar;

public class Main {
    public static void main(String[] args) {
        ISoftBucatarie softBucatarie = new SoftBucatarie(1);
        softBucatarie.printeazaFactura(29.00);

        SoftBar softBar = new SoftBar();
        softBar.genereazaNotaPlata(150.00);

        SoftBar softBar2 = new SoftBar();
        ISoftBucatarie adapter = new SoftBucatarieBar(softBar2);
        adapter.printeazaFactura(200.00);
    }
}

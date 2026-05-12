package ro.ase.exercitii2.comportamentale.adapter.clasaExistenta;

public class SoftBucatarie implements ISoftBucatarie {
    private int nrFactura;

    public SoftBucatarie(int nrFactura) {
        this.nrFactura = nrFactura;
    }


    @Override
    public void printeazaFactura(Double sumaDePlata) {
        System.out.println("Factura cu numarul " + nrFactura + " si suma de plata " + sumaDePlata + " a fost printata!");
    }
}

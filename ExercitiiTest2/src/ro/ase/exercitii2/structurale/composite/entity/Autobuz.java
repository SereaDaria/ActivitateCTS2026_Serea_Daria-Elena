package ro.ase.exercitii2.structurale.composite.entity;

public class Autobuz implements IFlota{
   private String producator;
   private String model;
   private int nrLocuri;

    public Autobuz(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void afiseazaDetalii(String spatii) {
        final StringBuilder sb = new StringBuilder(spatii + "Autobuz{");
        sb.append("producator='").append(producator).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        System.out.println(sb.toString());
    }
}

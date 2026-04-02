package ro.ase.exercitii.Test6.Prototype;

public class Masina implements IMasina {
    private String modelMasina;
    private int anFabricatie;

    public Masina(String modelMasina, int anFabricatie) {
        this.modelMasina = modelMasina;
        this.anFabricatie = anFabricatie;
    }

    public String getModelMasina() {
        return modelMasina;
    }

    public void setModelMasina(String modelMasina) {
        this.modelMasina = modelMasina;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("modelMasina='").append(modelMasina).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseaza(Masina masina) {

    }
}

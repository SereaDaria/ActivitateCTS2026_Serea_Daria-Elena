package ro.ase.exercitii.Test5.SimpleFactory.Entity;

public class Sedan extends AMasina {

    public Sedan(String nrInmatriculare, String model) {
        super(nrInmatriculare, model);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sedan{");
        sb.append("nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

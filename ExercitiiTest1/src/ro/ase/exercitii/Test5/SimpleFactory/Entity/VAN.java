package ro.ase.exercitii.Test5.SimpleFactory.Entity;

public class VAN extends AMasina{

    public VAN(String nrInmatriculare, String model) {
        super(nrInmatriculare, model);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VAN{");
        sb.append("nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

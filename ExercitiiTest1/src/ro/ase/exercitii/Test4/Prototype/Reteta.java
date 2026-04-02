package ro.ase.exercitii.Test4.Prototype;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements IReteta{
   private Map<String, Double> listaMedicamente;

    public Reteta(Map<String, Double> listaMedicamente) {
        this.listaMedicamente = listaMedicamente;
    }

    public Reteta() {
    }

    @Override
    public IReteta copiaza() {
        Reteta reteta = new Reteta();
        reteta.listaMedicamente = new HashMap<String, Double>(this.listaMedicamente);

        return reteta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("listaMedicamente=").append(listaMedicamente);
        sb.append('}');
        return sb.toString();
    }
}

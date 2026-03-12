package ro.ase.seminar4.SimpleFactory.clase.transport;

import com.sun.jdi.connect.Transport;

public class Autobuz implements MijlocTransport{
    private Integer nrLinie;
    private String marca;

    public Autobuz(Integer nrLinie, String marca) {
        this.nrLinie = nrLinie;
        this.marca = marca;
    }

    @Override
    public void afiseazaTipTransport(){
        StringBuilder sb = new StringBuilder();
        sb.append("Autobuz de pe linia ").append(this.nrLinie)
        .append(" este produs de ").append(this.marca);
        System.out.println(sb.toString());
    }
}

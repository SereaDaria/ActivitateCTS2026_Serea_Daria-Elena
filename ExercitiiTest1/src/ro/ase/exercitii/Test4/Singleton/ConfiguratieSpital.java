package ro.ase.exercitii.Test4.Singleton;

public class ConfiguratieSpital {
    private int versiuneSoftware;
    private String db;

    private static ConfiguratieSpital configuratie = null;

    private ConfiguratieSpital(int versiuneSoftware, String db) {
        this.versiuneSoftware = versiuneSoftware;
        this.db = db;
    }

    public int getVersiuneSoftware() {
        return versiuneSoftware;
    }

    public String getDb() {
        return db;
    }

    public static synchronized ConfiguratieSpital getIntanta(int versiuneSoftware, String db) {
        if(configuratie == null){
            configuratie = new ConfiguratieSpital(versiuneSoftware, db);
        }
        return configuratie;
    }


    public void afiseaza(){
        final StringBuilder sb = new StringBuilder("ConfiguratieSpital{");
        sb.append("versiuneSoftware=").append(versiuneSoftware);
        sb.append(", db='").append(db).append('\'');
        sb.append('}');
        System.out.println(sb);
    }

}

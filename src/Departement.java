import java.util.Comparator;

public class Departement implements Comparable<Departement> {
    private int Id;
    private String nom;
    private int nbrEmployes;

    public Departement(){}

    public Departement(int Id, String nom, int nbrEmployes) {
        this.Id = Id;
        this.nom = nom;
        this.nbrEmployes = nbrEmployes;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNomDepartement() {
        return nom;
    }

    public void setNomDepartement(String nom) {
        this.nom = nom;
    }

    public int getNbrEmployes() {
        return nbrEmployes;
    }

    public void setNbrEmployes(int nbrEmployes) {
        this.nbrEmployes = nbrEmployes;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(obj instanceof Departement d){
            return Id == d.getId() && nom.equals(d.getNomDepartement());
        }
        return false;
    }

    @Override
    public String toString(){
        return "Departement:\tID: " + Id + "\tName: " + nom + "\tNumber Employes: " + nbrEmployes;
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = result * 31 + Id;
        result = result * 31 + nom.hashCode();
        return result;
    }

    @Override
    public int compareTo(Departement o) {
        return Id - o.getId();
    }
}
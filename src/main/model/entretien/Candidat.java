package main.model.entretien;

public class Candidat {

    private int Id;
    private String name;
    private String specialite;
    private int anneeExperience;


    public Candidat(int Id){

        this.Id=Id;
    }

    public Candidat(int Id, String name, String specialite, int anneeExperience){

        this.Id=Id;
        this.specialite= specialite;
        this.name=name;
        this.anneeExperience=anneeExperience;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Candidat candidat = (Candidat) o;

        if (Id != candidat.Id) return false;
        if (anneeExperience != candidat.anneeExperience) return false;
        if (name != null ? !name.equals(candidat.name) : candidat.name != null) return false;
        return specialite != null ? specialite.equals(candidat.specialite) : candidat.specialite == null;

    }

    @Override
    public int hashCode() {
        int result = Id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (specialite != null ? specialite.hashCode() : 0);
        result = 31 * result + anneeExperience;
        return result;
    }

    /*************************************************************/






    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public int getAnneeExperience() {
        return anneeExperience;
    }

    public void setAnneeExperience(int anneeExperience) {
        this.anneeExperience = anneeExperience;
    }
}

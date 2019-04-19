package main.model.entretien;

public class Recruteur {
    private int id;
    private String name;
    private String specialite;
    private String process;
    private int anneeExperienceEvaluation;
    private String commentaire;

    public Recruteur(int Id, String name, String specialite, int anneeExperience){
        this.id = Id;
        this.name = name;
        this.specialite = specialite;
        this.anneeExperienceEvaluation = anneeExperience;
    }

    /**********************************************************/


    public int getRecruterId(int id) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public int getAnneeExperienceEvaluation() {
        return anneeExperienceEvaluation;
    }

    public void setAnneeExperienceEvaluation(int anneeExperienceEvaluation) {
        this.anneeExperienceEvaluation = anneeExperienceEvaluation;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}
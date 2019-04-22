package main.model.entretien;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recruteur recruteur = (Recruteur) o;
        return id == recruteur.id &&
                anneeExperienceEvaluation == recruteur.anneeExperienceEvaluation &&
                Objects.equals(name, recruteur.name) &&
                Objects.equals(specialite, recruteur.specialite) &&
                Objects.equals(process, recruteur.process) &&
                Objects.equals(commentaire, recruteur.commentaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, specialite, process, anneeExperienceEvaluation, commentaire);
    }

    /**********************************************************/


    public int getRecruterId() {
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
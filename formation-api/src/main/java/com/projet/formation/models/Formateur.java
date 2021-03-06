package com.projet.formation.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Formateur implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="formateurId")
    private Long FormateurId;
    private String Nom;
    private String Prenom;
    @Column(unique=true,nullable = false)
    private String email;
    @Column(unique=true,nullable = false)
    private Long tel;
    @Column(nullable = false)
    private String type;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "organisme_id")
    private Organisme organisme;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getFormateurId() {
        return FormateurId;
    }

    public void setFormateurId(Long idFormateur) {
        FormateurId = idFormateur;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Organisme getOrganisme() {
        return organisme;
    }

    public void setOrganisme(Organisme organisme) {
        this.organisme = organisme;
    }

}

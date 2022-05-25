package com.projet.formation.Dto;

import com.projet.formation.models.Formation;
import com.projet.formation.models.Pays;
import com.projet.formation.models.Session;
import lombok.Getter;
import lombok.Setter;
import org.bongiorno.dto.support.AbstractDto;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class ParticipantDto extends AbstractDto {
    Long id ;
    String nom ;
    String prenom ;
    String email;
    String tel;
    Pays pays ;
    Set<Session> session = new HashSet<>();

//    @Override
//    public String toString() {
//        return "ParticipantDto{" +
//                "id=" + id +
//                ", nom='" + nom + '\'' +
//                ", prenom='" + prenom + '\'' +
//                ", email='" + email + '\'' +
//                ", tel='" + tel + '\'' +
//                ", pays=" + pays +
//                ", session=" + session +
//                '}';
//    }
}

import {Pays} from "./Pays";
import {Formations} from "./Formations";

export class Participants {
  id?: number;
  nom!: string ;
  prenom!: string ;
  email!: string ;
  tel?: number ;
  pays?:Pays;
  formations?: Formations;
}

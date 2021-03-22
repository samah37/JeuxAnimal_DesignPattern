public class JeuxAnimaux {
public static void main (String[] args){
    JeuxAnimaux jeuxAnimaux = new JeuxAnimaux();
    CreateurAnimal createurAnimal= new CompteurVoixAnimal();
    jeuxAnimaux.jouer(createurAnimal);
}
void jouer (CreateurAnimal animal){
    VoixAnimal cheval= animal.creerCheval();
    VoixAnimal vache= animal.creerVache();
    VoixAnimal mouton= animal.creerMouton();
    VoixAnimal chevre= new ChevreAdapter(new Chevre());

    System.out.println("");

    troupeau troupeau=new troupeau();

    troupeau.ajouter(cheval);
    troupeau.ajouter(vache);
    troupeau.ajouter(mouton);
    troupeau.ajouter(chevre);

    troupeau chevaux =new troupeau();

    VoixAnimal cheval1=animal.creerCheval();
    VoixAnimal cheval2=animal.creerCheval();
    VoixAnimal cheval3=animal.creerCheval();


    chevaux.ajouter(cheval1);
    chevaux.ajouter(cheval2);
    chevaux.ajouter(cheval3);

    troupeau.ajouter(chevaux);

    System.out.println("Apprendre la voix des Chevaux");

    VoixGenerateur voixGenerateur=new VoixGenerateur();
    troupeau.enregistrerObservateur(voixGenerateur);
    jouer(troupeau);

    jouer(chevaux);

}

void  jouer (VoixAnimal animal){animal.voix();}
}

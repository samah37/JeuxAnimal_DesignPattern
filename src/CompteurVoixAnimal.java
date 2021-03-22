public class CompteurVoixAnimal extends CreateurAnimal {
    public  VoixAnimal creerCheval(){return new CompteurVoix(new Cheval());};
    public  VoixAnimal creerMouton(){return new CompteurVoix(new Mouton());};
    public  VoixAnimal creerVache(){return new CompteurVoix(new Vache());};
}

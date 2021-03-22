public class Animals extends CreateurAnimal {
    public  VoixAnimal creerCheval(){return new Cheval();};
    public  VoixAnimal creerMouton(){return new Vache();};
    public  VoixAnimal creerVache(){return new Mouton();};
}

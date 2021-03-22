public class CompteurVoix implements  VoixAnimal {
    VoixAnimal voixAnimal;
    static int voixNombre;
    public CompteurVoix(VoixAnimal animal){this.voixAnimal= animal;}
    public void voix(){
        voixAnimal.voix();
        voixNombre++;
    }
    public static int getVoixNombre(){return voixNombre;}
    public void enregistrerObservateur(Observeur observeur){voixAnimal.enregistrerObservateur(observeur);};
    public void notifierObservateur(){voixAnimal.notifierObservateur();};
}

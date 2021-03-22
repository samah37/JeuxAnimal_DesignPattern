public class Cheval implements VoixAnimal{
    Observable Observable;

    public Cheval() {
        Observable = new Observable(this);
    }

    public void voix(){System.out.println("heiiiiin");}
    public void enregistrerObservateur (Observeur observeur){Observable.enregistrerObservateur(observeur);}

    public void notifierObservateur (){Observable.notifierObservateur();}
}

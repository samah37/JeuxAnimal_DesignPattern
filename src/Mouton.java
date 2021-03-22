public class Mouton implements VoixAnimal{
    Observable Observable;

    public Mouton() {
        Observable = new Observable(this);
    }

    public void voix(){System.out.println("Baaaaa");}
    public void enregistrerObservateur (Observeur observeur){Observable.enregistrerObservateur(observeur);}

    public void notifierObservateur (){Observable.notifierObservateur();}
}

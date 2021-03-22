public class Vache implements VoixAnimal{
    Observable Observable;

    public Vache() {
        Observable = new Observable(this);
    }

    public void voix(){System.out.println("MOO");}
    public void enregistrerObservateur (Observeur observeur){Observable.enregistrerObservateur(observeur);}

    public void notifierObservateur (){Observable.notifierObservateur();}
}


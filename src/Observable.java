import java.util.ArrayList;
import java.util.Iterator;

public class Observable  implements VoixObservable{
    ArrayList<Observeur> observeurs = new ArrayList<>();
    VoixObservable animal;
    public Observable(VoixObservable animal){this.animal = animal;}
    public void enregistrerObservateur(Observeur observeur){observeurs.add(observeur);}

    public void notifierObservateur(){
        Iterator<Observeur> iterator = observeurs.iterator();
    while (iterator.hasNext()){
        Observeur observeur= (Observeur)iterator.next();
        observeur.misajour(animal);

    }}

    public Iterator<Observeur> getObservateurs(){return observeurs.iterator();}

}

import java.util.ArrayList;
import java.util.Iterator;

public class troupeau implements VoixAnimal {
    ArrayList<VoixAnimal> animaux= new ArrayList<>();
    public void ajouter(VoixAnimal animal){animaux.add(animal);}
    public void voix(){
        Iterator<VoixAnimal> iterator= animaux.iterator();
        while (iterator.hasNext()){
            VoixAnimal animal= (VoixAnimal)iterator.next();
            animal.voix();
        }
    }
    public void enregistrerObservateur(Observeur observeur){
        Iterator<VoixAnimal> iterator= animaux.iterator();
        while(iterator.hasNext()){
            VoixAnimal animal= (VoixAnimal)iterator.next();
            animal.enregistrerObservateur(observeur);
        }
    }

    public void notifierObservateur(){
       }


}

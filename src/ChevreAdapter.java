public class ChevreAdapter implements VoixAnimal{
    Chevre chevre;
    public ChevreAdapter(Chevre chevre){
        this.chevre= chevre;
    }
    public void voix(){chevre.beler();}
    public void enregistrerObservateur (Observeur observeur){}

    public void notifierObservateur (){}
}

public class Animal {
    String species;
    String name;
    Double weight;
    Boolean alive;

    public Animal(String species) {
        this.species = species;
    }
    public void feed(){
        if(this.weight!=0.0 || this.weight>0.0 || this.alive==false)
        {
            this.weight+=0.5;
            System.out.println("Karmisz zwierzę...");
            System.out.println("Masa zwierzęcia: " + this.weight);
        }
        else {
            System.out.println("Próbujesz nakarmić martwe zwierzę czarnuchu.");
        }
    }
    public void takeForAWalk(){
        if(this.weight!=0.0 || this.weight>0.0 || this.alive==false)
        {
            this.weight-=0.5;
            System.out.println("Wyprowadzasz zwierzę na spacer...");
            System.out.println("Masa zwierzęcia: " + this.weight);
            if (this.weight==0) System.out.println("Zabiłeś zwierzę czarnuchu.");
        }
        else
        {
            this.alive=false;
            System.out.println("Próbujesz wyprowadzić martwe zwierzę czarnuchu.");
        }
    }
}

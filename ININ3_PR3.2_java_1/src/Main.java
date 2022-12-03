public class Main {
    public static void main(String[] args) {
        Car passat = new Car("vw", "passerati", 2001);
        passat.millage = 78000.0;
        System.out.println("Producent auta: " + passat.producer);
        System.out.println("Model: " + passat.model);
        System.out.println("Rok produkcji: " + passat.yearOfProduction);
        System.out.println("Przebieg: " + passat.millage);

        Car fiat = new Car("fiat","bravo", 2010);
        fiat.millage = 312321.5;
        System.out.println("Producent auta: " + fiat.producer);
        System.out.println("Model: " + fiat.model);
        System.out.println("Rok produkcji: " + fiat.yearOfProduction);
        System.out.println("Przebieg: " + fiat.millage);

        Animal antylopa = new Animal("ssak");
        antylopa.name="Antylopa";
        antylopa.weight=0.5;
        antylopa.alive=true;
        System.out.println("Gatunek: " + antylopa.species);
        System.out.println("Waga: " + antylopa.weight);
        System.out.println("Żyje: " + antylopa.alive);
        antylopa.feed();
        antylopa.takeForAWalk();
        antylopa.feed();
        antylopa.takeForAWalk();
        antylopa.takeForAWalk();
        antylopa.feed();
        antylopa.takeForAWalk();
    }
}
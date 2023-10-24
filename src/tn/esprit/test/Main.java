package tn.esprit.test;
import tn.esprit.entities.*;



public class Main {
    public static void main(String[] args) {
        Aquatic aquaticAnimal = new Aquatic("Aquatique Family", "Aquatique Animal", 5, true, "Water Habitat");

        // Animal terrestre
        Terrestrial terrestrialAnimal = new Terrestrial("Terrestrial Family", "Terrestrial Animal", 3, true, 4);

        // Dauphin (Dolphin)
        Dolphin dolphin = new Dolphin("Dolphin Family", "Dolphin", 8, true, "Ocean", 20.5f);

        // Pingouin (Penguin)
        Penguin penguin = new Penguin("Penguin Family", "Penguin", 4, true, "Antarctic", 30.0f);

        // Afficher les informations des animaux
        aquaticAnimal.swim();
        dolphin.swim();
        penguin.swim();
        // Créer des animaux
        Animal lion = new Animal("Félin", "Lion", 5, true);
        Animal elephant = new Animal("Mammifère", "Éléphant", 10, true);
        Animal crocodile = new Animal("Reptile", "Crocodile", 8, false);

        // Créer un zoo
        Zoo myZoo = new Zoo("Mon tn.esprit.entities.Zoo", "Nabeul");

        // Ajouter des animaux au zoo
        myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(crocodile);

        // Afficher des informations sur le zoo
        myZoo.displayZoo();

        // Afficher la liste des animaux dans le zoo
        myZoo.displayAnimals();

        // Supprimer un animal du zoo
        myZoo.removeAnimal(elephant);





        // Afficher à nouveau la liste des animaux après la suppression
        myZoo.displayAnimals();

        // Comparer deux zoos
        Zoo anotherZoo = new Zoo("Zoo2", "Tunis");
        anotherZoo.addAnimal(new Animal("Oiseau", "Aigle", 3, false));
// Afficher des informations sur le zoo
        anotherZoo.displayZoo();
        // Afficher la liste des animaux dans le zoo
        anotherZoo.displayAnimals();

        Zoo biggerZoo = Zoo.comparerZoo(myZoo, anotherZoo);
        System.out.println("Le zoo avec le plus d'animaux est : " + biggerZoo.getName());
    }
}

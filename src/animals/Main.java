package animals;

public class Main {
    public static void main(String[] args) {
        Perro perro=new Perro();
        Vaca vaca=new Vaca();
        Gato gato=new Gato();

        perro.emitirSonido();
        vaca.emitirSonido();
        gato.emitirSonido();

        comerAnimal(perro);
        comerAnimal(vaca);
        comerAnimal(gato);
    }

    public static void comerAnimal(Animal animal){
        if(animal instanceof Carnivoro){
            ((Carnivoro) animal).comerCarne();
        }else if(animal instanceof Herviboro){
            ((Herviboro) animal).comerHierba();
        }else{
            System.out.println("No podemos determinar que tipo de animal es!");
        }
    }
}

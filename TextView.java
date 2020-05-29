import java.awt.Color;
import java.util.List;

public class TextView implements SimulatorView{

    private List<Animal> animals;

    public TextView(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public void setColor(Class<?> animalClass, Color color) {

    }

    @Override
    public boolean isViable(Field field) {
        return false;
    }

    @Override
    public void showStatus(int step, Field field) {
        int foxes = 0;
        int rabbits = 0;

        for (Animal animal : animals) {
            if (animal.isAlive()) {
                if (animal instanceof Rabbit) {
                    rabbits++;
                } else {
                    foxes++;
                }
            }
        }
        System.out.println("Foxes -> " + foxes);
        System.out.println("Rabbits -> " + rabbits);
    }

    @Override
    public void reset() {

    }

    /*
    Implement a new class TextView that implements SimulatorView.
    TextView provides a textual view of the simulation. After every simulation step, it prints out one line in the form
     Foxes: 121 Rabbits: 266
     */


}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Animal implements Comparable<Animal>{
    private String name;
    private Integer strength;

    public Animal(String name, Integer strength) {
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("Cat",3));
        animals.add(new Animal("dog",2));
        animals.add(new Animal("elephant",45));
        for(Animal animal:animals){
            System.out.println(animal.getStrength());
        }
        System.out.println("________________________________");
        //Отсортировать лист Animal по полю strength
        Collections.sort(animals, new Comparator<Animal>() {
            public int compare(Animal a1, Animal a2) {
                return a1.strength.compareTo(a2.strength);
            }
        });
        //вывод результатов
        for(Animal animal:animals){
            System.out.println(animal.toString());
        }
    }

    public int compareTo(Animal anotherAnimal) {
        return strength.compareTo(anotherAnimal.strength);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                '}';
    }
}
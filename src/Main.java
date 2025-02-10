import com.classes.Cat;
import com.classes.Dog;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.animal_sound();

        Dog dog = new Dog();
        dog.animal_sound();
    }
}
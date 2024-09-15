package Module8_KorotaevaSA.Easy;

public class Main {
    public static void main(String[] args) {
        /*
        Создайте свой зоопарк. Для этого создайте абстрактный класс Животные. Добавьте абстрактные методы walk() и
        say(). Также создайте различных животных, которые наследуют класс Животные, например: жираф, лев, тигр, пингвин
         и т.д. Зоопарк должен уметь выводить, какие животных есть в зоопарке.
         */
        Animal[] animals = new Animal[10];
        animals[0] = new Giraffe();
        animals[1] = new Lion();
        animals[2] = new Pinguin();
        animals[3] = new Tiger();
        animals[4] = new Duck();
        animals[5] = new Fox();
        animals[6] = new Horse();
        animals[7] = new Emu();
        animals[8] = new Crow();
        animals[9] = new Cow();
        for (Animal animal : animals){
            animal.say();
            animal.walk();
        }
    }
}

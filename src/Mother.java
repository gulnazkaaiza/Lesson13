public class Mother {
    public static void main(String[] args) throws NotWantToEatException {

        Child child = new Child();
        Food[] foods = Food.values();
        for (Food food1: foods) {
            try {
                child.eat(food1);
            } catch (NotWantToEatException ex) {
                System.out.println(ex.getMessage());
            }
            finally {
                child.say();
            }
        }

    }
}
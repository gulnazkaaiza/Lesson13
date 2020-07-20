
public class Child {

    public void eat(Food food1) throws NotWantToEatException {
        switch (food1) {
            case CARROT:
            case PORRIDGE:
                tastyFood(food1);
                throw new NotWantToEatException(" Не буду кушать!");
            case APPLE:
            case ICECREAM:
                tastyFood(food1);
                System.out.println(" Вкусно!");
                break;
        }

    }
    public void say(){
        System.out.println(" Спасибо, мама!");
    }

    public void tastyFood(Food food1){
        System.out.println("Ребенок кушает: " + food1.name);
    }
}
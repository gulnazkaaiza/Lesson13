
public class Child {

    public void eat(Food food1) throws NotWantToEat {
        switch (food1) {
            case CARROT:
            case PORRIDGE:
                tastyFood(food1);
                throw new NotWantToEat(" Не буду кушать!");
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
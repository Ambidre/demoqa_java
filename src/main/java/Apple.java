public class Apple extends Fruit{

    Apple(String name, String color, String taste){
        super(name, color, taste);
    }

    @Override
    public void prepareFruit() {
        System.out.println("Помыть яблоко");
    }
}

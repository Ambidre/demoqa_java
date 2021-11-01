public class Orange extends Fruit{

    Orange(String name, String color, String taste){
        super(name, color, taste);
    }

    @Override
    public void prepare() {
        System.out.println("Почистить апельсин");
    }
}

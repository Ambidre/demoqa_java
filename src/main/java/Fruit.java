public abstract class Fruit {

    private String name;
    private String color;
    private String taste;

    public Fruit(){
        System.out.println("Fruit has been created");
    }

    public Fruit(String name, String color, String taste){
        this.name = name;
        this.color = color;
        this.taste = taste;
    }
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void eatFruit(){
        System.out.println("Съесть " + getColor() + " " + getTaste() + " " + getName());
    };

    public abstract void prepare();


}

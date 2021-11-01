public class TestFruit {
    public static void main(String[] args) {

        Apple apple = new Apple("яблоко","красное","сладкое");
        Orange orange = new Orange("апельсин","оранжевый","кислый");
        Banana banana = new Banana("банан", "желтый", "сладкий");

        apple.prepare();
        apple.eatFruit();

        orange.prepare();
        orange.eatFruit();

        banana.prepare();
        banana.eatFruit();

    }
}

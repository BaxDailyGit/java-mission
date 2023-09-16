public class MainCat {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.soundGenerally();
        cat.soundCutely();
        cat.soundAngry();

        AngryCat angryCat = new AngryCat();
        angryCat.soundGenerally();
        angryCat.soundCutely();
        angryCat.soundAngry();
    }
}
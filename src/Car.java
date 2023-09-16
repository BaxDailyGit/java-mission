public class Car {
    private String name;
    private Integer speed;


    public void speedUp() {
        this.speed++;
    }

    public void speedDown() {
        this.speed--;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //세터는 지양함.
}

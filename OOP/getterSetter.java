public class getterSetter {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.setColor("Blue");
        p.setTip(2);
        System.out.println("The color of the pen is " + p.getColor() + " and the thickness is " + p.getTip());
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() // getter
    {
        return this.tip;
    }

    void setColor(String color) { // setter
        this.color = color;
    }

    void setTip(int tip) // external object
    {
        this.tip = tip; // this refers to the current object
    }
}
// creating class and obj
package OOPs_revise.one;

public class First {
    public static void main(String args[]) {
        Pen p = new Pen();
        p.setColor("blue");
        p.setTip(8.5f);
        System.out.println(p.color);
    }
}

class Pen {
    String color;
    float tip;

    void setColor(String color) {
        this.color = color;
    }

    void setTip(float tip) {
        this.tip = tip;
    }
}
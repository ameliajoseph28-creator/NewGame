import java.awt.*;

public class Tennis {
    String name;
    Image image;
    int xpos;
    int ypos;
    double dx;
    double dy;
    int width;
    Rectangle hitbox;
    int height;
    boolean isAlive = true;
    int time = 0;
    boolean up = false;
    boolean down = false;
    boolean right = false;
    boolean left = false;
    public int[] questionnumber;
    public String[] questions;


    public Tennis() {
        hitbox = new Rectangle(xpos, ypos, width, height);
    }

    public Tennis(int xposInput, int yposInput, double dxInput, double dyInput, int widthInput, int heightInput) {
        xpos = xposInput;
        ypos = yposInput;
        dx = dxInput;
        dy = dyInput;
        width = widthInput;
        height = heightInput;
        boolean isAlive = true;

        hitbox = new Rectangle(xpos, ypos, width, height);
    }



    public static void main(String[] args) {
        Tennis practice = new Tennis();
    }
}




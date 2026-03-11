import java.awt.*;
// Amelia Joseph
public class AmericanFootball {
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

    public AmericanFootball() {
        hitbox = new Rectangle(xpos, ypos, width, height);
    }

    public AmericanFootball(int xposInput, int yposInput, double dxInput, double dyInput, int widthInput, int heightInput) {
        xpos = xposInput;
        ypos = yposInput;
        dx = dxInput;
        dy = dyInput;
        width = widthInput;
        height = heightInput;
        boolean isAlive = true;

        hitbox = new Rectangle(xpos, ypos, width, height);
    }
    // allows the footballs to move
    public void move() {
        xpos = xpos + (int) dx;
        ypos = ypos + (int) dy;
        if (xpos >= 900) {
            dx = -dx;
        }
        if (xpos <= 0) {
            dx = -dx;
        }
        if (ypos >= 600) {
            dy = -dy;
        }
        if (ypos <= 0) {
            dy = -dy;
        }
    }

        public static void main(String[] args) {
            AmericanFootball practice = new AmericanFootball();
        }
    }



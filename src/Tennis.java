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

    public void tennisquestions(){
        questionnumber = new int[10]; // collection of 10 integers
        // System.out.println(intArray[2]); // prints 0
        questionnumber[2] = 6;
        // System.out.println(intArray[2]); // prints 6

        questionnumber = new int[11];
        questions[0] = "Who is this?";
        questions[1] = "How many grand slams per year?";
        questions[2] = "What team is this?";
        questions[3] = "";
        questions[4] = "";
        questions[5] = "";
        questions[6] = "";
        questions[7] = "";
        questions[8] = "";
        questions[9] = "";
        questions[10] = "";
        for (int i=0; i<=11; i=i+1){
            System.out.println(questions[i]);
        }



    }

    public static void main(String[] args) {
        Tennis practice = new Tennis();
    }
}




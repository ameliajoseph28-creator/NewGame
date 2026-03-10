
    //vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv DON'T CHANGE! vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
// Graphics Libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    public class NewGame implements Runnable, MouseListener, KeyListener {

        //Sets the width and height of the program window
        final int WIDTH = 1000;
        final int HEIGHT = 700;


        AmericanFootball americanfootball;
        AmericanFootball americanfootball2;
        AmericanFootball americanfootball3;
        AmericanFootball americanfootball4;
        Image backgroundamericanfootballfield;
        Tennis tennisball;
        Basketball basketball;
        Image backgroundbasketballcourt;
        Soccer soccerball;
        Soccer soccerball2;
        Soccer soccerball3;
        Soccer soccerball4;
        Image backgroundsoccerpitch;
        Image background;
        BowlingBall bowlingball;
        BowlingBall bowlingball2;
        BowlingBall bowlingball3;
        BowlingBall bowlingball4;
        BowlingBall bowlingball5;
        Image gameover;
        Trophy trophy;
        Image youwin;
        Hammer hammer;
        int stage = 0;


        //Variable Definition Section
        //You can set their initial values too
        // Like Mario mario = new Mario(); //


        // Initialize your variables and construct your program objects here.
        public NewGame() { // BasicGameApp constructor
            setUpGraphics();

            //variable and objects
            //create (construct) the objects needed for the game

            americanfootball = new AmericanFootball(575, 400, 4, 8, 90, 100);
            americanfootball.image = Toolkit.getDefaultToolkit().getImage("AmericanFootball.png");
            americanfootball2 = new AmericanFootball(575,400,3,3,90,100);
            americanfootball2.image = Toolkit.getDefaultToolkit().getImage("AmericanFootball.png");
            americanfootball3 = new AmericanFootball(200,10,6,3,90,100);
            americanfootball3.image = Toolkit.getDefaultToolkit().getImage("AmericanFootball.png");
            americanfootball4 = new AmericanFootball(375,90,5,5,90,100);
            americanfootball4.image = Toolkit.getDefaultToolkit().getImage("AmericanFootball.png");
            backgroundamericanfootballfield = Toolkit.getDefaultToolkit().getImage("AmericanFootballField.jpg");
            tennisball = new Tennis(450, 800, 2, 2, 90, 100);
            tennisball.image = Toolkit.getDefaultToolkit().getImage("Tennisball.png");
            basketball = new Basketball(100, 420, 4, 10, 90, 100);
            basketball.image = Toolkit.getDefaultToolkit().getImage("Basketball.png");
            backgroundbasketballcourt = Toolkit.getDefaultToolkit().getImage("BasketballCourt.jpg");
            soccerball = new Soccer(700, 550, 5, 2, 90, 100);
            soccerball.image = Toolkit.getDefaultToolkit().getImage("SoccerBall.png");
            soccerball2 = new Soccer(20,400,6,6,90,100);
            soccerball2.image = Toolkit.getDefaultToolkit().getImage("Soccerball.png");
            soccerball3 = new Soccer(25,30,6,6,90,100);
            soccerball3.image = Toolkit.getDefaultToolkit().getImage("Soccerball.png");
            soccerball4 = new Soccer(700,350,6,6,90,100);
            soccerball4.image = Toolkit.getDefaultToolkit().getImage("Soccerball.png");
            backgroundsoccerpitch = Toolkit.getDefaultToolkit().getImage("SoccerPitch.jpg");
            bowlingball = new BowlingBall(575, 400, 6, 6, 90, 100);
            bowlingball.image = Toolkit.getDefaultToolkit().getImage("BowlingBall.png");
            bowlingball2 = new BowlingBall(500, 100, 6, 6, 90, 100);
            bowlingball2.image = Toolkit.getDefaultToolkit().getImage("BowlingBall2.png");
            bowlingball3 = new BowlingBall(400, 250, 6, 6, 90, 100);
            bowlingball3.image = Toolkit.getDefaultToolkit().getImage("BowlingBall3.png");
            bowlingball4 = new BowlingBall(100, 150, 6, 6, 90, 100);
            bowlingball4.image = Toolkit.getDefaultToolkit().getImage("BowlingBall4.png");
            bowlingball5 = new BowlingBall(700, 400, 6, 6, 90, 100);
            bowlingball5.image = Toolkit.getDefaultToolkit().getImage("BowlingBall5.png");
            gameover = Toolkit.getDefaultToolkit().getImage("gameover.png");
            trophy = new Trophy(50, 200, 8, 8, 90, 90);
            trophy.image = Toolkit.getDefaultToolkit().getImage("Trophy.png");
            youwin = Toolkit.getDefaultToolkit().getImage("YouWin.png");
            hammer = new Hammer(350, 25, 6, 6, 90, 90);
            hammer.image = Toolkit.getDefaultToolkit().getImage("Hammer.png");
            background = Toolkit.getDefaultToolkit().getImage("TennisCourt.jpg");


        }
        // end BasicGameApp constructor

        public void moveThings() {
            bowlingball.move();
            bowlingball2.move();
            bowlingball3.move();
            bowlingball4.move();
            bowlingball5.move();
            trophy.move();
            hammer.move();
            americanfootball.move();
            americanfootball2.move();
            americanfootball3.move();
            americanfootball4.move();
            soccerball.move();
            soccerball2.move();
            soccerball3.move();
            soccerball4.move();
            basketball.move();

            //call the move() code for each object  -

        }

        //Paints things on the screen using bufferStrategy
        private void render() {
            Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();

            g.clearRect(0, 0, WIDTH, HEIGHT);
            if (stage == 0) {
                g.drawImage(background, 0, 0, WIDTH, HEIGHT, null);
                g.drawImage(americanfootball.image, americanfootball.xpos, americanfootball.ypos, americanfootball.width, americanfootball.height, null);
                g.drawImage(tennisball.image, tennisball.xpos, tennisball.ypos, tennisball.width, tennisball.height, null);
                g.drawImage(basketball.image, basketball.xpos, basketball.ypos, basketball.width, basketball.height, null);
                g.drawImage(soccerball.image, soccerball.xpos, soccerball.ypos, soccerball.width, soccerball.height, null);
                g.drawImage(bowlingball.image, bowlingball.xpos, bowlingball.ypos, bowlingball.width, bowlingball.height, null);
                g.drawImage(bowlingball2.image, bowlingball2.xpos, bowlingball2.ypos, bowlingball2.width, bowlingball2.height, null);
                g.drawImage(bowlingball3.image, bowlingball3.xpos, bowlingball3.ypos, bowlingball3.width, bowlingball3.height, null);
                g.drawImage(bowlingball4.image, bowlingball4.xpos, bowlingball4.ypos, bowlingball4.width, bowlingball4.height, null);
                g.drawImage(bowlingball5.image, bowlingball5.xpos, bowlingball5.ypos, bowlingball5.width, bowlingball5.height, null);
                g.drawImage(trophy.image, trophy.xpos, trophy.ypos, trophy.width, trophy.height, null);
                g.drawImage(hammer.image, hammer.xpos, hammer.ypos, hammer.width, hammer.height, null);

                //g.drawImage(background,0,0, WIDTH, HEIGHT, null);
                //draw the images
                // Signature: drawImage(Image img, int x, int y, int width, int height, ImageObserver observer)
            } else if (stage == 1) {
                g.drawImage(backgroundamericanfootballfield, 0, 0, WIDTH, HEIGHT, null);
                g.drawImage(tennisball.image, tennisball.xpos, tennisball.ypos, tennisball.width, tennisball.height, null);
                g.drawImage(basketball.image, basketball.xpos, basketball.ypos, basketball.width, basketball.height, null);
                g.drawImage(soccerball.image, soccerball.xpos, soccerball.ypos, soccerball.width, soccerball.height, null);
                g.drawImage(bowlingball.image, bowlingball.xpos, bowlingball.ypos, bowlingball.width, bowlingball.height, null);
                g.drawImage(bowlingball2.image, bowlingball2.xpos, bowlingball2.ypos, bowlingball2.width, bowlingball2.height, null);
                g.drawImage(bowlingball3.image, bowlingball3.xpos, bowlingball3.ypos, bowlingball3.width, bowlingball3.height, null);
                g.drawImage(bowlingball4.image, bowlingball4.xpos, bowlingball4.ypos, bowlingball4.width, bowlingball4.height, null);
                g.drawImage(bowlingball5.image, bowlingball5.xpos, bowlingball5.ypos, bowlingball5.width, bowlingball5.height, null);
                g.drawImage(trophy.image, trophy.xpos, trophy.ypos, trophy.width, trophy.height, null);
                g.drawImage(americanfootball.image,americanfootball.xpos, americanfootball.ypos,americanfootball.width, americanfootball.height,null);
                g.drawImage(americanfootball2.image,americanfootball2.xpos, americanfootball2.ypos,americanfootball2.width, americanfootball2.height,null);
                g.drawImage(americanfootball3.image,americanfootball3.xpos, americanfootball3.ypos,americanfootball3.width, americanfootball3.height,null);
                g.drawImage(americanfootball4.image,americanfootball4.xpos, americanfootball4.ypos,americanfootball4.width, americanfootball4.height,null);
                g.drawImage(hammer.image, hammer.xpos, hammer.ypos, hammer.width, hammer.height, null);

            } else if (stage == 2) {
                g.drawImage(backgroundsoccerpitch, 0, 0, WIDTH, HEIGHT, null);
                g.drawImage(tennisball.image, tennisball.xpos, tennisball.ypos, tennisball.width, tennisball.height, null);
                g.drawImage(basketball.image, basketball.xpos, basketball.ypos, basketball.width, basketball.height, null);
                g.drawImage(americanfootball.image, americanfootball.xpos, americanfootball.ypos, americanfootball.width, americanfootball.height, null);
                g.drawImage(bowlingball.image, bowlingball.xpos, bowlingball.ypos, bowlingball.width, bowlingball.height, null);
                g.drawImage(bowlingball2.image, bowlingball2.xpos, bowlingball2.ypos, bowlingball2.width, bowlingball2.height, null);
                g.drawImage(bowlingball3.image, bowlingball3.xpos, bowlingball3.ypos, bowlingball3.width, bowlingball3.height, null);
                g.drawImage(bowlingball4.image, bowlingball4.xpos, bowlingball4.ypos, bowlingball4.width, bowlingball4.height, null);
                g.drawImage(bowlingball5.image, bowlingball5.xpos, bowlingball5.ypos, bowlingball5.width, bowlingball5.height, null);
                g.drawImage(trophy.image, trophy.xpos, trophy.ypos, trophy.width, trophy.height, null);
                g.drawImage(hammer.image, hammer.xpos, hammer.ypos, hammer.width, hammer.height, null);
                g.drawImage(soccerball.image,soccerball.xpos,soccerball.ypos,soccerball.width,soccerball.height,null);
                g.drawImage(soccerball2.image,soccerball2.xpos,soccerball2.ypos,soccerball2.width,soccerball2.height,null);
                g.drawImage(soccerball3.image,soccerball3.xpos,soccerball3.ypos,soccerball3.width,soccerball3.height,null);
                g.drawImage(soccerball4.image,soccerball4.xpos,soccerball4.ypos,soccerball4.width,soccerball4.height,null);
            } else if (stage == 3) {
                g.drawImage(backgroundbasketballcourt, 0, 0, WIDTH, HEIGHT, null);
                g.drawImage(americanfootball.image, americanfootball.xpos, americanfootball.ypos, americanfootball.width, americanfootball.height, null);
                g.drawImage(soccerball.image, soccerball.xpos, soccerball.ypos, soccerball.width, soccerball.height, null);
                g.drawImage(bowlingball.image, bowlingball.xpos, bowlingball.ypos, bowlingball.width, bowlingball.height, null);
                g.drawImage(bowlingball2.image, bowlingball2.xpos, bowlingball2.ypos, bowlingball2.width, bowlingball2.height, null);
                g.drawImage(bowlingball3.image, bowlingball3.xpos, bowlingball3.ypos, bowlingball3.width, bowlingball3.height, null);
                g.drawImage(bowlingball4.image, bowlingball4.xpos, bowlingball4.ypos, bowlingball4.width, bowlingball4.height, null);
                g.drawImage(bowlingball5.image, bowlingball5.xpos, bowlingball5.ypos, bowlingball5.width, bowlingball5.height, null);
                g.drawImage(trophy.image, trophy.xpos, trophy.ypos, trophy.width, trophy.height, null);
                g.drawImage(hammer.image, hammer.xpos, hammer.ypos, hammer.width, hammer.height, null);


            } else if (stage == 4) {
                g.drawImage(gameover, 0, 0, WIDTH, HEIGHT, null);

            } else if (stage == 5) {
                g.drawImage(youwin, 0, 0, WIDTH, HEIGHT, null);
            }


            // Keep the code below at the end of render()
            g.dispose();
            bufferStrategy.show();
        }


        //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv DON'T CHANGE! vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
        //Declare the variables needed for the graphics
        public JFrame frame;
        public Canvas canvas;
        public JPanel panel;
        public BufferStrategy bufferStrategy;

        // PSVM: This is the code that runs first and automatically
        public static void main(String[] args) {
            NewGame ex = new NewGame();   //creates a new instance of the game
            new Thread(ex).start();                 //creates a threads & starts up the code in the run( ) method
        }

        // main thread
        // this is the code that plays the game after you set things up
        public void run() {
            //for the moment we will loop things forever.
            while (true) {
                moveThings();  //move all the game objects
                render();  // paint the graphics
                pause(10); // sleep for 10 ms
            }
        }

        //Pauses or sleeps the computer for the amount specified in milliseconds
        public void pause(int time) {
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
            }
        }

        private Image getImage(String filename) {
            return Toolkit.getDefaultToolkit().getImage(filename);
        }

        //Graphics setup method
        private void setUpGraphics() {
            frame = new JFrame("Application Template");   //Create the program window or frame.  Names it.

            panel = (JPanel) frame.getContentPane();  //sets up a JPanel which is what goes in the frame
            panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));  //sizes the JPanel
            panel.setLayout(null);   //set the layout

            // creates a canvas which is a blank rectangular area of the screen onto which the application can draw
            // and trap input events (Mouse and Keyboard events)
            canvas = new Canvas();
            canvas.setBounds(0, 0, WIDTH, HEIGHT);
            canvas.setIgnoreRepaint(true);
            canvas.addMouseListener(this);
            panel.add(canvas);  // adds the canvas to the panel.

            // frame operations
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //makes the frame close and exit nicely
            frame.pack();  //adjusts the frame and its contents so the sizes are at their default or larger
            frame.setResizable(false);   //makes it so the frame cannot be resized
            frame.setVisible(true);      //IMPORTANT!!!  if the frame is not set to visible it will not appear on the screen!

            // sets up things so the screen displays images nicely.
            canvas.createBufferStrategy(2);
            bufferStrategy = canvas.getBufferStrategy();
            canvas.requestFocus();
            System.out.println("DONE graphic setup");
        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println(stage == 0);
            int mouseX = e.getX();
            int mouseY = e.getY();
            if (americanfootball.hitbox.contains(mouseX, mouseY)) {
                stage = 1;
                System.out.println(stage);
            } else if (soccerball.hitbox.contains(mouseX, mouseY)) {
                stage = 2;
                System.out.println(stage);
            } else if (basketball.hitbox.contains(mouseX, mouseY)) {
                stage = 3;
                System.out.println(stage);
            } else if (bowlingball.hitbox.contains(mouseX, mouseY)) {
                stage = 4;
                System.out.println(stage);
            } else if (bowlingball2.hitbox.contains(mouseX, mouseY)) {
                stage = 4;
                System.out.println(stage);
            } else if (bowlingball3.hitbox.contains(mouseX, mouseY)) {
                stage = 4;
                System.out.println(stage);
            } else if (bowlingball4.hitbox.contains(mouseX, mouseY)) {
                stage = 4;
                System.out.println(stage);
            } else if (bowlingball5.hitbox.contains(mouseX, mouseY)) {
                stage = 4;
                System.out.println(stage);
            } else if (trophy.hitbox.contains(mouseX, mouseY)) {
                stage = 5;
                System.out.println(stage);
            } else if (americanfootball2.hitbox.contains(mouseX,mouseY)) {
                stage = 4;
                System.out.println(stage);
            } else if (americanfootball3.hitbox.contains(mouseX,mouseY)) {
                stage =4;
                System.out.println(stage);
            }  else if (americanfootball4.hitbox.contains(mouseX,mouseY)){
                    stage = 4;
                    System.out.println(stage);
            } else {
                stage = 0;
                System.out.println(stage);
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            int mouseX = e.getX();
            int mouseY = e.getY();
            if (americanfootball.hitbox.contains(mouseX, mouseY)) {
                System.out.println(stage == 1);
            } else if (soccerball.hitbox.contains(mouseX, mouseY)) {
                System.out.println(stage == 2);
            } else if (basketball.hitbox.contains(mouseX, mouseY)) {
                System.out.println(stage == 3);
            } else if (bowlingball.hitbox.contains(mouseX, mouseY)) {
                System.out.println(stage == 4);
            } else if (bowlingball2.hitbox.contains(mouseX, mouseY)) {
                System.out.println(stage == 4);
            } else if (bowlingball3.hitbox.contains(mouseX, mouseY)) {
                System.out.println(stage == 4);
            } else if (bowlingball4.hitbox.contains(mouseX, mouseY)) {
                System.out.println(stage == 4);
            } else if (bowlingball5.hitbox.contains(mouseX, mouseY)) {
                System.out.println(stage == 4);
            } else if (trophy.hitbox.contains(mouseX, mouseY)) {
                System.out.println(stage == 5);
            }else if (americanfootball2.hitbox.contains(mouseX,mouseY)) {
                System.out.println(stage == 4);
            } else if (americanfootball3.hitbox.contains(mouseX,mouseY)) {
                System.out.println(stage ==4);
            }  else if (americanfootball4.hitbox.contains(mouseX,mouseY)){
                System.out.println(stage ==4);
            } else {
                System.out.println(stage == 0);
            }
        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println(e.getKeyCode());
            int key = e.getKeyCode();
            if (key == 65) { // a is pressed
                hammer.left = true;
            } else if (key == 83) { // s is pressed
                hammer.down = true;
            } else if (key == 68) { //d is pressed
                hammer.right = true;
            } else if (key == 87) { // w is pressed
                hammer.up = true;
            }

        }
            @Override
            public void keyReleased (KeyEvent e){
            int key = e.getKeyCode();
            if (key == 65) { // a is pressed
                hammer.left = false;
            } else if (key == 83) { // s is pressed
                hammer.down = false;
            } else if (key == 68) { //d is pressed
                hammer.right = false;
            } else if (key == 87) { // w is pressed
                hammer.up = false;
                }
            }
        }





//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX



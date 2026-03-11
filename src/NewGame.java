// Amelia Joseph
    //vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv DON'T CHANGE! vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
// Graphics Libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;
import java.util.Arrays;

    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    public class NewGame implements Runnable, MouseListener, KeyListener {

        //Sets the width and height of the program window
        final int WIDTH = 1000;
        final int HEIGHT = 700;


        // variable definition - sets/defines what my variables are
        AmericanFootball americanFootball;
        AmericanFootball americanFootball2;
        AmericanFootball americanFootball3;
        AmericanFootball americanFootball4;
        Image backgroundAmericanFootballField;
        Tennis tennisBall;
        Basketball basketball;
        Basketball[] basketballs;
        Image backgroundBasketballCourt;
        Soccer soccerBall;
        Soccer soccerBall2;
        Soccer soccerBall3;
        Soccer soccerBall4;
        Image backgroundSoccerPitch;
        Image background;
        BowlingBall bowlingBall;
        BowlingBall bowlingBall2;
        BowlingBall bowlingBall3;
        BowlingBall bowlingBall4;
        BowlingBall bowlingBall5;
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
            // allows me to upload the picture of my sports so it shows on the screen, and allows me to change the width, height, starting coordinates, and how fast the balls go
            // the footballs that are there to distract you
            americanFootball = new AmericanFootball(575, 400, 4, 8, 90, 100);
            americanFootball.image = Toolkit.getDefaultToolkit().getImage("AmericanFootball.png");
            americanFootball2 = new AmericanFootball(575,400,3,3,90,100);
            americanFootball2.image = Toolkit.getDefaultToolkit().getImage("AmericanFootball.png");
            americanFootball3 = new AmericanFootball(200,10,6,3,90,100);
            americanFootball3.image = Toolkit.getDefaultToolkit().getImage("AmericanFootball.png");
            americanFootball4 = new AmericanFootball(375,90,5,5,90,100);
            americanFootball4.image = Toolkit.getDefaultToolkit().getImage("AmericanFootball.png");
            backgroundAmericanFootballField = Toolkit.getDefaultToolkit().getImage("AmericanFootballField.jpg");
            basketball = new Basketball(100, 420, 4, 10, 90, 100);
            basketball.image = Toolkit.getDefaultToolkit().getImage("Basketball.png");
            // my array - allows me to have 8 balls
            basketballs = new Basketball[8];
            for (int i=0; i<basketballs.length; i++){
                basketballs[i] = new Basketball(400+(3*i), 600-(6*i), 4+i,2+i,90,100);
                basketballs[i].image = Toolkit.getDefaultToolkit().getImage("Basketball.png");
            }
            backgroundBasketballCourt = Toolkit.getDefaultToolkit().getImage("BasketballCourt.jpg");
            // the soccer balls that are there to distract you
            soccerBall = new Soccer(700, 550, 5, 2, 90, 100);
            soccerBall.image = Toolkit.getDefaultToolkit().getImage("SoccerBall.png");
            soccerBall2 = new Soccer(20,400,6,6,90,100);
            soccerBall2.image = Toolkit.getDefaultToolkit().getImage("Soccerball.png");
            soccerBall3 = new Soccer(25,30,6,6,90,100);
            soccerBall3.image = Toolkit.getDefaultToolkit().getImage("Soccerball.png");
            soccerBall4 = new Soccer(700,350,6,6,90,100);
            soccerBall4.image = Toolkit.getDefaultToolkit().getImage("Soccerball.png");
            backgroundSoccerPitch = Toolkit.getDefaultToolkit().getImage("SoccerPitch.jpg");
            // the bowling balls that if you click on - game over
            bowlingBall = new BowlingBall(575, 400, 6, 6, 90, 100);
            bowlingBall.image = Toolkit.getDefaultToolkit().getImage("BowlingBall.png");
            bowlingBall2 = new BowlingBall(500, 100, 6, 6, 90, 100);
            bowlingBall2.image = Toolkit.getDefaultToolkit().getImage("BowlingBall2.png");
            bowlingBall3 = new BowlingBall(400, 250, 6, 6, 90, 100);
            bowlingBall3.image = Toolkit.getDefaultToolkit().getImage("BowlingBall3.png");
            bowlingBall4 = new BowlingBall(100, 150, 6, 6, 90, 100);
            bowlingBall4.image = Toolkit.getDefaultToolkit().getImage("BowlingBall4.png");
            bowlingBall5 = new BowlingBall(700, 400, 6, 6, 90, 100);
            bowlingBall5.image = Toolkit.getDefaultToolkit().getImage("BowlingBall5.png");
            gameover = Toolkit.getDefaultToolkit().getImage("gameover.png");
            // the trophy that you click on to win the game
            trophy = new Trophy(50, 200, 8, 8, 90, 90);
            trophy.image = Toolkit.getDefaultToolkit().getImage("Trophy.png");
            youwin = Toolkit.getDefaultToolkit().getImage("YouWin.png");
            // the hammer that allows you to get rid of the bowling balls as well as the trophy
            hammer = new Hammer(350, 25, 6, 6, 90, 90);
            hammer.image = Toolkit.getDefaultToolkit().getImage("Hammer.png");
            background = Toolkit.getDefaultToolkit().getImage("TennisCourt.jpg");


        }
        // end BasicGameApp constructor

        public void moveThings() {
            // allows my objects to move
            bowlingBall.move();
            bowlingBall2.move();
            bowlingBall3.move();
            bowlingBall4.move();
            bowlingBall5.move();
            trophy.move();
            hammer.move();
            americanFootball.move();
            americanFootball2.move();
            americanFootball3.move();
            americanFootball4.move();
            soccerBall.move();
            soccerBall2.move();
            soccerBall3.move();
            soccerBall4.move();
            basketball.move();
            for (int i=0; i<basketballs.length; i++){
                basketballs[i].move();
            }

            //call the move() code for each object  -

        }

        public void checkCollision() {
            // if the hammer intersects with the bowling balls, then the bowling balls should disappear
            if (hammer.hitbox.intersects(bowlingBall2.hitbox)) {
                bowlingBall2.bowlingball_eaten = hammer.bowlingball_eaten + 1;
                bowlingBall2.xpos = 99999999;
                bowlingBall2.hitbox = new Rectangle(bowlingBall2.xpos, bowlingBall2.ypos, bowlingBall2.width, bowlingBall2.height);
                System.out.println(hammer.bowlingball_eaten);
                System.out.println("hammer has eaten bowlingball 2");
            } else if (hammer.hitbox.intersects(bowlingBall3.hitbox)) {
                bowlingBall3.bowlingball_eaten = hammer.bowlingball_eaten + 1;
                bowlingBall3.xpos = 99999999;
                bowlingBall3.hitbox = new Rectangle(bowlingBall3.xpos, bowlingBall3.ypos, bowlingBall3.width, bowlingBall3.height);
                System.out.println(hammer.bowlingball_eaten);
                System.out.println("hammer has eaten bowlingball 3");
            } else if (hammer.hitbox.intersects(bowlingBall4.hitbox)) {
                bowlingBall4.bowlingball_eaten = hammer.bowlingball_eaten + 1;
                bowlingBall4.xpos = 99999999;
                bowlingBall4.hitbox = new Rectangle(bowlingBall4.xpos, bowlingBall4.ypos, bowlingBall4.width, bowlingBall4.height);
                System.out.println(hammer.bowlingball_eaten);
                System.out.println("hammer has eaten bowlingball 4");
            } else if (hammer.hitbox.intersects(bowlingBall5.hitbox)) {
                bowlingBall5.bowlingball_eaten = hammer.bowlingball_eaten + 1;
                bowlingBall5.xpos = 99999999;
                bowlingBall5.hitbox = new Rectangle(bowlingBall5.xpos, bowlingBall5.ypos, bowlingBall5.width, bowlingBall5.height);
                System.out.println(hammer.bowlingball_eaten);
                System.out.println("hammer has eaten bowlingball 5");
                // if the hammer intersects with the trophy, the trophy should disapear and stage 4 should print (game over screen)
            } else if (hammer.hitbox.intersects(trophy.hitbox)){
                hammer.trophy_eaten = hammer.trophy_eaten+1;
                trophy.xpos = 999999999;
                trophy.hitbox = new Rectangle(trophy.xpos, trophy.ypos, trophy.width, trophy.height);
                System.out.println(hammer.trophy_eaten);
                System.out.println(stage = 4);
            }
        }
        //Paints things on the screen using bufferStrategy
        private void render() {
            Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();

            g.clearRect(0, 0, WIDTH, HEIGHT);
            if (stage == 0) {
                // stage 0 - starting stage, all five bowling balls, the basketball, football,and soccerball
                g.drawImage(background, 0, 0, WIDTH, HEIGHT, null);
                g.drawImage(americanFootball.image, americanFootball.xpos, americanFootball.ypos, americanFootball.width, americanFootball.height, null);
                g.drawImage(tennisBall.image, tennisBall.xpos, tennisBall.ypos, tennisBall.width, tennisBall.height, null);
                g.drawImage(basketball.image, basketball.xpos, basketball.ypos, basketball.width, basketball.height, null);
                g.drawImage(soccerBall.image, soccerBall.xpos, soccerBall.ypos, soccerBall.width, soccerBall.height, null);
                g.drawImage(bowlingBall.image, bowlingBall.xpos, bowlingBall.ypos, bowlingBall.width, bowlingBall.height, null);
                g.drawImage(bowlingBall2.image, bowlingBall2.xpos, bowlingBall2.ypos, bowlingBall2.width, bowlingBall2.height, null);
                g.drawImage(bowlingBall3.image, bowlingBall3.xpos, bowlingBall3.ypos, bowlingBall3.width, bowlingBall3.height, null);
                g.drawImage(bowlingBall4.image, bowlingBall4.xpos, bowlingBall4.ypos, bowlingBall4.width, bowlingBall4.height, null);
                g.drawImage(bowlingBall5.image, bowlingBall5.xpos, bowlingBall5.ypos, bowlingBall5.width, bowlingBall5.height, null);
                g.drawImage(trophy.image, trophy.xpos, trophy.ypos, trophy.width, trophy.height, null);
                g.drawImage(hammer.image, hammer.xpos, hammer.ypos, hammer.width, hammer.height, null);

                //g.drawImage(background,0,0, WIDTH, HEIGHT, null);
                //draw the images
                // Signature: drawImage(Image img, int x, int y, int width, int height, ImageObserver observer)
            } else if (stage == 1) {
                // stage 1 - when the position is clicked stage one will appear whihc is a football field. The five bowling balls will still be there as well as four new footballs. The background will now be a football field.
                g.drawImage(backgroundAmericanFootballField, 0, 0, WIDTH, HEIGHT, null);
                g.drawImage(tennisBall.image, tennisBall.xpos, tennisBall.ypos, tennisBall.width, tennisBall.height, null);
                g.drawImage(basketball.image, basketball.xpos, basketball.ypos, basketball.width, basketball.height, null);
                g.drawImage(soccerBall.image, soccerBall.xpos, soccerBall.ypos, soccerBall.width, soccerBall.height, null);
                g.drawImage(bowlingBall.image, bowlingBall.xpos, bowlingBall.ypos, bowlingBall.width, bowlingBall.height, null);
                g.drawImage(bowlingBall2.image, bowlingBall2.xpos, bowlingBall2.ypos, bowlingBall2.width, bowlingBall2.height, null);
                g.drawImage(bowlingBall3.image, bowlingBall3.xpos, bowlingBall3.ypos, bowlingBall3.width, bowlingBall3.height, null);
                g.drawImage(bowlingBall4.image, bowlingBall4.xpos, bowlingBall4.ypos, bowlingBall4.width, bowlingBall4.height, null);
                g.drawImage(bowlingBall5.image, bowlingBall5.xpos, bowlingBall5.ypos, bowlingBall5.width, bowlingBall5.height, null);
                g.drawImage(trophy.image, trophy.xpos, trophy.ypos, trophy.width, trophy.height, null);
                g.drawImage(americanFootball.image,americanFootball.xpos, americanFootball.ypos,americanFootball.width, americanFootball.height,null);
                g.drawImage(americanFootball2.image,americanFootball2.xpos, americanFootball2.ypos,americanFootball2.width, americanFootball2.height,null);
                g.drawImage(americanFootball3.image,americanFootball3.xpos, americanFootball3.ypos,americanFootball3.width, americanFootball3.height,null);
                g.drawImage(americanFootball4.image,americanFootball4.xpos, americanFootball4.ypos,americanFootball4.width, americanFootball4.height,null);
                g.drawImage(hammer.image, hammer.xpos, hammer.ypos, hammer.width, hammer.height, null);

            } else if (stage == 2) {
                // stage 2 - when the position is clicked stage two will apear which is a soccer field. The five bowling balls will still be there as well as four new soccer balls. The background will now be a soccer field.
                g.drawImage(backgroundSoccerPitch, 0, 0, WIDTH, HEIGHT, null);
                g.drawImage(tennisBall.image, tennisBall.xpos, tennisBall.ypos, tennisBall.width, tennisBall.height, null);
                g.drawImage(basketball.image, basketball.xpos, basketball.ypos, basketball.width, basketball.height, null);
                g.drawImage(americanFootball.image, americanFootball.xpos, americanFootball.ypos, americanFootball.width, americanFootball.height, null);
                g.drawImage(bowlingBall.image, bowlingBall.xpos, bowlingBall.ypos, bowlingBall.width, bowlingBall.height, null);
                g.drawImage(bowlingBall2.image, bowlingBall2.xpos, bowlingBall2.ypos, bowlingBall2.width, bowlingBall2.height, null);
                g.drawImage(bowlingBall3.image, bowlingBall3.xpos, bowlingBall3.ypos, bowlingBall3.width, bowlingBall3.height, null);
                g.drawImage(bowlingBall4.image, bowlingBall4.xpos, bowlingBall4.ypos, bowlingBall4.width, bowlingBall4.height, null);
                g.drawImage(bowlingBall5.image, bowlingBall5.xpos, bowlingBall5.ypos, bowlingBall5.width, bowlingBall5.height, null);
                g.drawImage(trophy.image, trophy.xpos, trophy.ypos, trophy.width, trophy.height, null);
                g.drawImage(hammer.image, hammer.xpos, hammer.ypos, hammer.width, hammer.height, null);
                g.drawImage(soccerBall.image,soccerBall.xpos,soccerBall.ypos,soccerBall.width,soccerBall.height,null);
                g.drawImage(soccerBall2.image,soccerBall2.xpos,soccerBall2.ypos,soccerBall2.width,soccerBall2.height,null);
                g.drawImage(soccerBall3.image,soccerBall3.xpos,soccerBall3.ypos,soccerBall3.width,soccerBall3.height,null);
                g.drawImage(soccerBall4.image,soccerBall4.xpos,soccerBall4.ypos,soccerBall4.width,soccerBall4.height,null);
            } else if (stage == 3) {
                // stage 3 - when the position is clicked stage three will appear which is a basketball court. The five bowling balls will still be there as well as eight new basketball balls(use of array here). The background will now be a basketball court.
                g.drawImage(backgroundBasketballCourt, 0, 0, WIDTH, HEIGHT, null);
                g.drawImage(americanFootball.image, americanFootball.xpos, americanFootball.ypos, americanFootball.width, americanFootball.height, null);
                g.drawImage(soccerBall.image, soccerBall.xpos, soccerBall.ypos, soccerBall.width, soccerBall.height, null);
                g.drawImage(bowlingBall.image, bowlingBall.xpos, bowlingBall.ypos, bowlingBall.width, bowlingBall.height, null);
                g.drawImage(bowlingBall2.image, bowlingBall2.xpos, bowlingBall2.ypos, bowlingBall2.width, bowlingBall2.height, null);
                g.drawImage(bowlingBall3.image, bowlingBall3.xpos, bowlingBall3.ypos, bowlingBall3.width, bowlingBall3.height, null);
                g.drawImage(bowlingBall4.image, bowlingBall4.xpos, bowlingBall4.ypos, bowlingBall4.width, bowlingBall4.height, null);
                g.drawImage(bowlingBall5.image, bowlingBall5.xpos, bowlingBall5.ypos, bowlingBall5.width, bowlingBall5.height, null);
                g.drawImage(trophy.image, trophy.xpos, trophy.ypos, trophy.width, trophy.height, null);
                g.drawImage(hammer.image, hammer.xpos, hammer.ypos, hammer.width, hammer.height, null);
                for (int i=0; i<basketballs.length; i++){
                    g.drawImage(basketballs[i].image,basketballs[i].xpos,basketballs[i].ypos,basketballs[i].width, basketballs[i].height, null);
                }


            } else if (stage == 4) {
                // stage 4 - the game over screen when something bad happens
                g.drawImage(gameover, 0, 0, WIDTH, HEIGHT, null);

            } else if (stage == 5) {
                // stage 5 - when you click the trophy, the "you win" screen
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
                moveThings();//move all the game objects
                checkCollision();
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
            canvas.addKeyListener(this);
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
            // when the mouse clicks _____, print out the specific stage
            System.out.println(stage == 0);
            int mouseX = e.getX();
            int mouseY = e.getY();
            if (americanFootball.hitbox.contains(mouseX, mouseY)) {
                stage = 1;
                System.out.println(stage);
            } else if (soccerBall.hitbox.contains(mouseX, mouseY)) {
                stage = 2;
                System.out.println(stage);
            } else if (basketball.hitbox.contains(mouseX, mouseY)) {
                stage = 3;
                System.out.println(stage);
            } else if (bowlingBall.hitbox.contains(mouseX, mouseY)) {
                stage = 4;
                System.out.println(stage);
            } else if (bowlingBall2.hitbox.contains(mouseX, mouseY)) {
                stage = 4;
                System.out.println(stage);
            } else if (bowlingBall3.hitbox.contains(mouseX, mouseY)) {
                stage = 4;
                System.out.println(stage);
            } else if (bowlingBall4.hitbox.contains(mouseX, mouseY)) {
                stage = 4;
                System.out.println(stage);
            } else if (bowlingBall5.hitbox.contains(mouseX, mouseY)) {
                stage = 4;
                System.out.println(stage);
            } else if (trophy.hitbox.contains(mouseX, mouseY)) {
                stage = 5;
                System.out.println(stage);
            } else if (americanFootball2.hitbox.contains(mouseX,mouseY)) {
                stage = 4;
                System.out.println(stage);
            } else if (americanFootball3.hitbox.contains(mouseX,mouseY)) {
                stage =4;
                System.out.println(stage);
            }  else if (americanFootball4.hitbox.contains(mouseX,mouseY)){
                    stage = 4;
                    System.out.println(stage);
            } else {
                stage = 0;
                System.out.println(stage);
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // when the mouse is released, print out the specific stage
            int mouseX = e.getX();
            int mouseY = e.getY();
            if (americanFootball.hitbox.contains(mouseX, mouseY)) {
                System.out.println(stage == 1);
            } else if (soccerBall.hitbox.contains(mouseX, mouseY)) {
                System.out.println(stage == 2);
            } else if (basketball.hitbox.contains(mouseX, mouseY)) {
                System.out.println(stage == 3);
            } else if (bowlingBall.hitbox.contains(mouseX, mouseY)) {
                System.out.println(stage == 4);
            } else if (bowlingBall2.hitbox.contains(mouseX, mouseY)) {
                System.out.println(stage == 4);
            } else if (bowlingBall3.hitbox.contains(mouseX, mouseY)) {
                System.out.println(stage == 4);
            } else if (bowlingBall4.hitbox.contains(mouseX, mouseY)) {
                System.out.println(stage == 4);
            } else if (bowlingBall5.hitbox.contains(mouseX, mouseY)) {
                System.out.println(stage == 4);
            } else if (trophy.hitbox.contains(mouseX, mouseY)) {
                System.out.println(stage == 5);
            }else if (americanFootball2.hitbox.contains(mouseX,mouseY)) {
                System.out.println(stage == 4);
            } else if (americanFootball3.hitbox.contains(mouseX,mouseY)) {
                System.out.println(stage ==4);
            }  else if (americanFootball4.hitbox.contains(mouseX,mouseY)){
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
            // allow the wsda keys to manouver the hammer
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
            // stop moving the hammer when the key is released
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



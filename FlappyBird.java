// package flappyBird;

// Be sure to import JFrame(the window where the game will be displayed)
import javax.swing.JFrame;

public class FlappyBird {
    // create new instance of FlappyBird called flappyBird
    public static FlappyBird flappyBird;
    
    // Set Height and Width of JFrame 
    public final int WIDTH = 800, HEIGHT = 800;

    // Set JFrame info inside the FlappyBird Function
    public FlappyBird() {
        JFrame jframe = new JFrame();
        jframe.setSize(WIDTH, HEIGHT);
        jframe.setVisible(true);
    }
    public static void main(String[] args) {
        flappyBird = new FlappyBird();
        
    }
}
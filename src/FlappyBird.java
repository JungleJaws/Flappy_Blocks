// package flappyBird;

// Import Graphics;
import java.awt.Graphics;
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

        jframe.setResizeable(false);
        jframe.setSize(WIDTH, HEIGHT);
        jframe.setVisible(true);
        // terminate program on close button
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        flappyBird = new FlappyBird();
        
    }

    public void repaint(Graphics g) {
        // TODO: Auto-generate method
    }
}
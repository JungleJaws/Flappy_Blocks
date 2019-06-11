// package flappyBird;

// Import Graphics;
import java.awt.Graphics;
import java.awt.event.ActionListener;

// Be sure to import JFrame(the window where the game will be displayed)
import javax.swing.JFrame;
// Import Timer
import javax.swing.Timer;

public class FlappyBird implements ActionListener{
    // create new instance of FlappyBird called flappyBird
    public static FlappyBird flappyBird;
    
    // Set Height and Width of JFrame 
    public final int WIDTH = 800, HEIGHT = 800;

    // Bring in the Renderer Method
    public Renderer renderer;
    // Set JFrame info inside the FlappyBird Function
    public FlappyBird() {
        JFrame jframe = new JFrame();
        Timer timer = new Timer(20, this);

        renderer = new Renderer();

        jframe.add(renderer);
        // jframe.setResizeable(false); -- causing error on load, comeback to.
        jframe.setSize(WIDTH, HEIGHT);
        jframe.setVisible(true);
        // terminate program on close button
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        renderer.repaint();
    }

    public void repaint(Graphics g) {
        // TODO: Auto-generate method
    }

    public static void main(String[] args) {
        flappyBird = new FlappyBird();
        
    }

    
}
// package flappyBird;

// Import Graphics;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

// Be sure to import JFrame(the window where the game will be displayed)
import javax.swing.JFrame;
// Import Timer
import javax.swing.Timer;

public class FlappyBird implements ActionListener, MouseListener, KeyListener{
    // create new instance of FlappyBird called flappyBird
    public static FlappyBird flappyBird;
    
    // Set Height and Width of JFrame 
    public final int WIDTH = 800, HEIGHT = 800;

    // Bring in the Renderer Method
    public Renderer renderer;
    // Set JFrame info inside the FlappyBird Function

    public Rectangle bird;
    public ArrayList<Rectangle> columns;
    public FlappyBird() {
        JFrame jframe = new JFrame();
        Timer timer = new Timer(20, this);

        renderer = new Renderer();
        rand = new Random();

        jframe.add(renderer);
        // Set Tiltle
        jframe.setTitle("Flappy Bird");
        // jframe.setResizeable(false); -- causing error on load, comeback to.
        jframe.setSize(WIDTH, HEIGHT);
        // add event listeners
        jframe.addMouseListener(this);
        jframe.addKeyListener(this);
        jframe.setVisible(true);
        // terminate program on close button
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        bird = new Rectangle(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20);
        columns = new ArrayList<Rectangle>();

        addColumn(true);
        addColumn(true);
        addColumn(true);
        addColumn(true);

        timer.start();
    }

    public void addColumn(boolean start) {
        int space = 300;
        int width = 100;
        int height = 50 + rand.nextInt(300);

        if (start) {
            columns.add(new Rectangle(WIDTH + width + columns.size() * 300, HEIGHT - height - 120, width, height));
            columns.add(new Rectangle(WIDTH + width + (columns.size() - 1) * 300, 0, width, HEIGHT - height - space));
        } else {
            columns.add(new Rectangle(columns.get(columns.size() - 1).x + 600, HEIGHT - height - 120, width, height));
            columns.add(new Rectangle(columns.get(columns.size() - 1).x, 0, width, HEIGHT - height - space));
        }
    }
    
    public void paintColumn(Graphics g, Rectangle column) {
        g.setColor(Color.green.darker());
        g.fillRect(Column.x, column.y, column.width, column.height);
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
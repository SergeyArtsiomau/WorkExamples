package GeekBrains;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class GameWindow extends JFrame {

  private static GameWindow gameWindow;
  private static Image background;
  private static Image game_over;
  private static Image drop;
  private static float dropLeft = 200;
  private static float dropTop = -100;
  private static long lastFrameTime;
  private static float dropV = 200;
  private static int score;


  public static void main(String[] args) throws IOException {

    background = ImageIO.read(new File("examples/src/main/resources/background.png"));
    game_over = ImageIO.read(new File("examples/src/main/resources/game_over.png"));
    drop = ImageIO.read(new File("examples/src/main/resources/drop.png"));
    gameWindow = new GameWindow();
    gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    gameWindow.setLocation(200, 100);
    gameWindow.setSize(906, 478);
    gameWindow.setResizable(false);
    lastFrameTime = System.nanoTime();
    final GameField gameField = new GameField();
    gameField.addMouseListener(new MouseAdapter() {
      @Override public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        float drop_right = dropLeft + drop.getWidth(null);
        float drop_bottom = dropTop + drop.getHeight(null);
        boolean is_drop = x >= dropLeft && x <= drop_right && y >= dropLeft && y <= drop_bottom;
        if (is_drop) {
          dropTop = -100;
          dropLeft = (int) (Math.random() * (gameField.getWidth() - drop.getWidth(null)));
          dropV = dropV + 20;
          score++;
          gameWindow.setTitle("Score: " + score);
        }
      }
    });
    gameWindow.add(gameField);
    gameWindow.setVisible(true);
  }

  private static void onRepaint(Graphics graphics) {
    // graphics.fillOval(10, 10, 200, 100);
    //graphics.drawLine(200, 200, 400, 300);
    long currentTime = System.nanoTime();
    float deltaTime = (currentTime - lastFrameTime) * 0.000000001f;
    lastFrameTime = currentTime;
    dropTop = dropTop + dropV * deltaTime;
    //dropLeft = dropLeft + dropV* deltaTime;
    graphics.drawImage(background, 0, 0, null);
    graphics.drawImage(drop, (int) dropLeft, (int) dropTop, null);
    if (dropTop > gameWindow.getHeight()) {
      graphics.drawImage(game_over, 280, 120, null);
    }
  }

  private static class GameField extends JPanel {

    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      onRepaint(graphics);
      repaint();
    }
  }

}

import java.awt.*;
import javax.swing.*;

public class GUI {
  
  private JLabel label;
  
  void run() {
    JFrame frame = new JFrame("HelloWorld GUI");
    label = new JLabel();
    Font bigger = new Font("Dialog", Font.PLAIN, 96);
    label.setFont(bigger);
    frame.getContentPane().add(label);
    frame.setSize(640, 480);
    frame.setVisible(true);
    update("123456");
  }
  
  public void update(String str) {
    label.setText(" " + str);
  }
      
  public static void main(String... args) {
    new GUI().run();
  }
  
  private static GUI gui;
  
  public static void updateGUI(String str) {
    if (gui == null) {
      gui = new GUI();
      gui.run();
    }
    gui.update(str);
  }  
}
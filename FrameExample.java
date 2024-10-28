import java.awt.*;
import java.awt.event.*;

public class FrameExample {
    private Frame f;
    private Button b1, b2, b3, b4;
    private TextField tf;

    public FrameExample() {
        f = new Frame("WOW SAMPLE!");
        b1 = new Button("BUTTON 1");
        b2 = new Button("BUTTON 2 ");
        b3 = new Button("BUTTON 3");
       
        tf = new TextField();
    }

    public void launchFrame() {
        f.setLayout(new FlowLayout());
        f.setSize(400, 400);
        f.setBackground(Color.black);
        
        f.add(b1);
        f.add(b2);
        f.add(b3);
       
        f.add(tf);

        f.setVisible(true);
        
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                f.dispose();
            }
        });
    }

    public static void main(String[] args) {
        FrameExample guiWindow = new FrameExample();
        guiWindow.launchFrame();
    }
}

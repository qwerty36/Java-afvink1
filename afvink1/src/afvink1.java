
import javax.swing.*;
import java.awt.FlowLayout;
public class afvink1 extends JFrame {
    private static final long serialVersionUID = 1L;
    public static void main(String[] args) {
        new afvink1().setVisible(true);
    }
    private Object color;
    private final ImageIcon img = new ImageIcon("/home/richard/img.svg");
    private afvink1() {
        super("NSA PRISM 1337 HAXTOOL");
        setSize(600, 600);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JTextField textfield = new JTextField(8);
        JButton button = new JButton("Click me if you dare");
        add(button);
        add(textfield);
    }
}
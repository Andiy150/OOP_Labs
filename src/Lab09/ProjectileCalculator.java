package Lab09;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ProjectileCalculator extends JFrame {
    private JTextField initialVelocityField;
    private JTextField angleField;
    private JButton calculateButton;
    private JTextArea resultArea;

    public ProjectileCalculator() {
        createUI();
        setTitle("Projectile Maximum Height Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void createUI() {
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(new JLabel("Initial Velocity (v0 in m/s):"));
        initialVelocityField = new JTextField(10);
        add(initialVelocityField);

        add(new JLabel("Launch Angle (α in degrees):"));
        angleField = new JTextField(10);
        add(angleField);

        calculateButton = new JButton("Calculate Maximum Height");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateMaximumHeight();
            }
        });
        add(calculateButton);

        resultArea = new JTextArea(5, 20);
        resultArea.setEditable(false);
        add(new JScrollPane(resultArea));
    }

    private void calculateMaximumHeight() {
        try {
            double v0 = Double.parseDouble(initialVelocityField.getText());
            double alphaDegrees = Double.parseDouble(angleField.getText());
            double alphaRadians = Math.toRadians(alphaDegrees);
            double maxHeight = (v0 * v0 * Math.sin(alphaRadians) * Math.sin(alphaRadians)) / (2 * 9.81);
            resultArea.setText("Maximum Height: " + maxHeight + " meters");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for velocity and angle.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
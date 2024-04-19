package main;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class GameOver {

    private final JFrame jFrame; // window
    private final JPanel jPanel; // area
    private final JLabel jLabel; // text
    private final Timer timer; // timer object

    public GameOver() {
        jFrame = new JFrame(); // create new window
        jFrame.setTitle("Game Over"); // title
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit
        jFrame.setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Icons/new_icon.png"))).getImage()); // app icon
        jFrame.setSize(400, 200); // window size
        jFrame.setLocationRelativeTo(null); // center the window on the screen
        jFrame.getContentPane().setBackground(Color.BLACK); // black background
        jFrame.setResizable(false); // cannot resize

        jPanel = new JPanel() {
            @Override protected void paintComponent(Graphics g) {
                super.paintComponent(g); // get superclass
                g.setColor(Color.BLACK); // set to black
                g.fillRect(0, 0, getWidth(), getHeight()); // paint panel black
            }};
        jPanel.setLayout(null); // sets layout manager

        jLabel = new JLabel("GAME OVER!!"); // title
        jLabel.setVerticalAlignment(SwingConstants.CENTER); // centre
        jLabel.setHorizontalAlignment(SwingConstants.CENTER); // centre
        jLabel.setForeground(Color.CYAN); // text colour
        jLabel.setFont(new Font("Arial", Font.BOLD, 30)); // format font
        jLabel.setBounds(80, 50, 240, 50); // set area
        jPanel.add(jLabel); // add label to panel

        jFrame.getContentPane().add(jPanel); // return content pane of jFrame and add JPanel
        jFrame.setVisible(true); // show window

        // show score window for 3000 milliseconds and close current frame
        timer = new Timer(3000, e -> { jFrame.dispose(); new ShowScore(); jFrame.dispose(); });
        timer.setRepeats(false); // do not repeat
        timer.start(); // start timer
    }

    public static void main(String[] args) {
        new GameOver();
    }
}

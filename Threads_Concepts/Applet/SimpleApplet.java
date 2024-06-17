package Threads_Concepts.Applet;


import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleApplet extends Applet implements ActionListener {
    private Button clickButton;
    private Label outputLabel;

    public void init() {
        clickButton = new Button("Click Me!");
        clickButton.addActionListener(this);

        outputLabel = new Label("Click the button to display a message.");

        add(clickButton);
        add(outputLabel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clickButton) {
            outputLabel.setText("Button clicked!");
        }
    }
}


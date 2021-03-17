package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class View extends JFrame
{
    public View(Controller controller)
    {
        this.controller = controller;
        setVisible(true);
        setSize(500, 400);

        menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("file");
        JMenuItem quitItem = new JMenuItem("quit");
        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        fileMenu.add(quitItem);

        stateLabel = new JLabel("0");
        ShowLabel();
        add(stateLabel);

        quitItem.addActionListener((ActionEvent e) -> {int result = JOptionPane.showConfirmDialog
                (this, "Are you sure you want to exit?", null, JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.YES_OPTION)
            System.exit(0);});
    }
    public void ShowLabel()
    {
        stateLabel.setText(String.valueOf(controller.GetState()));
    }

    private Controller controller;
    private JMenuBar menuBar;
    public JLabel stateLabel;
}

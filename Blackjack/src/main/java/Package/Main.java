package Package;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

    JFrame frame;
    final String path = "C:\\Users\\Xander\\Documents\\NetBeansProjects\\GUITesting1\\src\\main\\java\\com\\mycompany\\guitesting3\\CardIcons\\";
    final String[] SuiteNames = {"Diamonds", "Clubs", "Hearts", "Spades"};
    final String[] CardNames = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King",};

    public Main() {
        frame = new JFrame("mainGUI");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(null);

        //********Image Viewer*************************************************
        JLabel jLabelImageDisplay = new JLabel();
        jLabelImageDisplay.setIcon(new ImageIcon(path + "01.png"));
        jLabelImageDisplay.setLocation(25, 25);
        jLabelImageDisplay.setSize(80, 100);

        //********Intro Text*************************************************
        JLabel jLabelIntroText = new JLabel();
        jLabelIntroText.setText("Select which card you'd like displayed:");
        jLabelIntroText.setLocation(130, 25);
        jLabelIntroText.setSize(300, 20);

        //********Suite menu***************************************************
        JComboBox jComboBoxSuite = new JComboBox<>();
        for (int x = 0; x < SuiteNames.length; x++) {
            jComboBoxSuite.addItem(SuiteNames[x]);
        }
        jComboBoxSuite.setLocation(130, 55);
        jComboBoxSuite.setSize(80, 20);
        JLabel jLabelSuiteSelector = new JLabel();
        jLabelSuiteSelector.setText("Choose your suite");
        jLabelSuiteSelector.setLocation(240, 55);
        jLabelSuiteSelector.setSize(130, 20);

        //********Card Selector*************************************************
        JComboBox jComboBoxCard = new JComboBox<>();
        for (int x = 0; x < CardNames.length; x++) {
            jComboBoxCard.addItem(CardNames[x]);
        }
        jComboBoxCard.setLocation(130, 85);
        jComboBoxCard.setSize(80, 20);
        JLabel jLabelCardSelector = new JLabel();
        jLabelCardSelector.setText("Choose your card");
        jLabelCardSelector.setLocation(240, 85);
        jLabelCardSelector.setSize(130, 20);

        //********Go Button***************************************************
        JButton jButtonGo = new JButton();
        jButtonGo.setText("Go");
        jButtonGo.setLocation(130, 115);
        jButtonGo.setSize(50, 20);
        jButtonGo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = 0;
                int y = 0;
                int z;
                while (CardNames[x] != jComboBoxCard.getSelectedItem()) {
                    x++;
                }
                while (SuiteNames[y] != jComboBoxSuite.getSelectedItem()) {
                    y++;
                }
                z = x + 13 * y + 1;
                jLabelImageDisplay.setIcon(new ImageIcon(path + "0" + z + ".png"));
            }
        });

        //jButtonGo.addActionListener(new CustomActionListener());  //potentially dodgy bit o' code here...
        frame.add(jLabelImageDisplay);
        frame.add(jComboBoxCard);
        frame.add(jComboBoxSuite);
        frame.add(jButtonGo);
        frame.add(jLabelIntroText);
        frame.add(jLabelCardSelector);
        frame.add(jLabelSuiteSelector);
    }

    public static void main(String[] args) {
        new Main();
    }
}
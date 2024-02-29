
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

//needs massive improvements
public class CustomizeBoardScreen extends JPanel {

    private JButton go;
    private JButton quit;
    private MainWindow mw;

    public void quitButtonActionListener() {
        getMw().showCard("Two");
    }

    public void goButtonActionListener() {
        getMw().showCard("Four");
    }

    public CustomizeBoardScreen(MainWindow mw) {
        this.mw = mw;

        JLabel mess = new JLabel("Customize Board [Under Construction] ");
        add(mess);

        JLabel uc = new JLabel("Default: 8x8 board with 8 randomly generated snakes/ladders");
        add(uc);

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        go = new JButton("Start Game");
        quit = new JButton("Back");

        go.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                goButtonActionListener();
            }
        });

        quit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                quitButtonActionListener();
            }
        });

        add(go);
        add(quit);

    }

    /**
     * @return the go
     */
    public JButton getGo() {
        return go;
    }

    /**
     * @param go the go to set
     */
    public void setGo(JButton go) {
        this.go = go;
    }

    /**
     * @return the quit
     */
    public JButton getQuit() {
        return quit;
    }

    /**
     * @param quit the quit to set
     */
    public void setQuit(JButton quit) {
        this.quit = quit;
    }

    /**
     * @return the mw
     */
    public MainWindow getMw() {
        return mw;
    }

    /**
     * @param mw the mw to set
     */
    public void setMw(MainWindow mw) {
        this.mw = mw;
    }
}


import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WelcomeScreen extends JPanel {

    private JLabel title;
    private JButton go;
    private JButton quit;

    private MainWindow mw;

    public void setTitle(String t) {
        getTitle().setText(t);
    }

    public void quitButtonActionListener() {
        if (JOptionPane.showConfirmDialog(this, getARE_YOU_SURE()) == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }
    private static String ARE_YOU_SURE = "Are you sure?";

    public void goButtonActionListener() {
        getMw().showCard(getTWO());
    }
    private static String TWO = "Two";

    public WelcomeScreen(MainWindow mw) {
        this.mw = mw;

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        title = new JLabel();
        add(title);

        //add formatting here
        go = new JButton(getNEW__GAME());
        quit = new JButton(getQUIT());

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
    private static String QUIT = "Quit";
    private static String NEW__GAME = "New Game";

    /**
     * @return the title
     */
    public JLabel getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(JLabel title) {
        this.title = title;
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

    /**
     * @return the ARE_YOU_SURE
     */
    public static String getARE_YOU_SURE() {
        return ARE_YOU_SURE;
    }

    /**
     * @param aARE_YOU_SURE the ARE_YOU_SURE to set
     */
    public static void setARE_YOU_SURE(String aARE_YOU_SURE) {
        ARE_YOU_SURE = aARE_YOU_SURE;
    }

    /**
     * @return the TWO
     */
    public static String getTWO() {
        return TWO;
    }

    /**
     * @param aTWO the TWO to set
     */
    public static void setTWO(String aTWO) {
        TWO = aTWO;
    }

    /**
     * @return the QUIT
     */
    public static String getQUIT() {
        return QUIT;
    }

    /**
     * @param aQUIT the QUIT to set
     */
    public static void setQUIT(String aQUIT) {
        QUIT = aQUIT;
    }

    /**
     * @return the NEW__GAME
     */
    public static String getNEW__GAME() {
        return NEW__GAME;
    }

    /**
     * @param aNEW__GAME the NEW__GAME to set
     */
    public static void setNEW__GAME(String aNEW__GAME) {
        NEW__GAME = aNEW__GAME;
    }

}

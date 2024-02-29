
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainWindow extends JFrame {

    private JPanel cards;
    private String cardDisplayed;
    private CardLayout cl;

    private WelcomeScreen s1;
    private PlayerSelectScreen s2;
    private CustomizeBoardScreen s3;
    private BoardScreen s4;

    public void showCard(String cardName) {
        getCl().show(getCards(), cardName);
    }

    public void resetAll() {
        setS1(new WelcomeScreen(this));
        setS2(new PlayerSelectScreen(this));
        setS3(new CustomizeBoardScreen(this));
        setS4(new BoardScreen(this));

        getCards().add(getS1(), "One");
        getCards().add(getS2(), "Two");
        getCards().add(getS3(), "Three");
        getCards().add(getS4(), "Four");
    }

    //maintaining board info
    public void setBoard() {
        setS4(new BoardScreen(this));
        getCards().add(getS4(), "Four");
    }

    public MainWindow() {

        setVisible(true);

        cards = new JPanel();
        cards.setLayout(new CardLayout());
        add(cards);

        s1 = new WelcomeScreen(this);
        s1.setTitle("Snake and Ladders");

        /*
		JPanel jp2 = new JPanel(new FlowLayout());
		JLabel jl2 = new JLabel("Panel 2");
		JButton jb2 = new JButton("Go ahead!");
		jp2.add(jb2);
		jb2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				cl.show(cards, "Three");
			}
		});
		
		jp2.setSize(this.getSize());
		jp2.add(jl2);
		jp2.setVisible(true);
		
         */
        JPanel jp5 = new JPanel(new FlowLayout());
        JLabel jl5 = new JLabel("Panel 5");

        jp5.setSize(this.getSize());
        jp5.add(jl5);
        jp5.setVisible(true);

        s2 = new PlayerSelectScreen(this);
        s3 = new CustomizeBoardScreen(this);
        s4 = new BoardScreen(this);

        cards.add(s1, "One");
        cards.add(s2, "Two");
        cards.add(s3, "Three");
        cards.add(s4, "Four");

        //cards.add(jp2,"Two");
        //cards.add(jp4,"Four");
        cards.add(jp5, "Five");

        cl = (CardLayout) (cards.getLayout());

        cl.show(cards, "One");
        showCard("One");
    }

    /**
     * @return the cards
     */
    public JPanel getCards() {
        return cards;
    }

    /**
     * @param cards the cards to set
     */
    public void setCards(JPanel cards) {
        this.cards = cards;
    }

    /**
     * @return the cardDisplayed
     */
    public String getCardDisplayed() {
        return cardDisplayed;
    }

    /**
     * @param cardDisplayed the cardDisplayed to set
     */
    public void setCardDisplayed(String cardDisplayed) {
        this.cardDisplayed = cardDisplayed;
    }

    /**
     * @return the cl
     */
    public CardLayout getCl() {
        return cl;
    }

    /**
     * @param cl the cl to set
     */
    public void setCl(CardLayout cl) {
        this.cl = cl;
    }

    /**
     * @return the s1
     */
    public WelcomeScreen getS1() {
        return s1;
    }

    /**
     * @param s1 the s1 to set
     */
    public void setS1(WelcomeScreen s1) {
        this.s1 = s1;
    }

    /**
     * @return the s2
     */
    public PlayerSelectScreen getS2() {
        return s2;
    }

    /**
     * @param s2 the s2 to set
     */
    public void setS2(PlayerSelectScreen s2) {
        this.s2 = s2;
    }

    /**
     * @return the s3
     */
    public CustomizeBoardScreen getS3() {
        return s3;
    }

    /**
     * @param s3 the s3 to set
     */
    public void setS3(CustomizeBoardScreen s3) {
        this.s3 = s3;
    }

    /**
     * @return the s4
     */
    public BoardScreen getS4() {
        return s4;
    }

    /**
     * @param s4 the s4 to set
     */
    public void setS4(BoardScreen s4) {
        this.s4 = s4;
    }

}

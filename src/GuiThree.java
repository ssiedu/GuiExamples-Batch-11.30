
import java.awt.Button;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class GuiThree extends Frame implements ActionListener, ItemListener, TextListener, FocusListener, KeyListener {

    public GuiThree() {
        initComponents();
    }

    public void initComponents() {
        setLayout(new FlowLayout());
        ch=new Choice(); ch.add("MP"); ch.add("MH"); ch.add("RJ"); 
        t1 = new TextField(10);
        t2 = new TextField(10);
        b1 = new Button("Copy");
        b2 = new Button("Clear");
        b3 = new Button("Exit");
        b3.setEnabled(false);
        add(ch);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        ch.addItemListener(this);
        t1.addTextListener(this);
        b2.addFocusListener(this);
        t1.addKeyListener(this);
    }

    public static void main(String[] args) {
        GuiThree ob = new GuiThree();
        ob.setVisible(true);
        ob.setSize(500, 500);
    }

    private TextField t1, t2;
    private Button b1, b2, b3;
    private Choice ch;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String s = t1.getText();  //reading the text of t1
            t2.setText(s);          //writing the text to t2
        }else if(e.getSource()==b2){
            t1.setText("");
            t2.setText("");
        }else if(e.getSource()==b3){
            System.exit(0);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        //identify the selected item
        String s=ch.getSelectedItem();
        switch(s){
            case "MP":
                setTitle("Bhopal");
            break;
            case "MH":
                setTitle("Mumbai");
            break;
            case "RJ":
                setTitle("Jaipur");
            break;
        }
    }

    @Override
    public void textValueChanged(TextEvent e) {
        String s=t1.getText();
        if(s.equals("1")){
            t2.setText("One");
        }else if(s.equals("2")){
            t2.setText("Two");
        }else if(s.equals("3")){
            t2.setText("Three");
        }else{
            t2.setText("");
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
        b3.setEnabled(true);
    }

    @Override
    public void focusLost(FocusEvent e) {
        b3.setEnabled(false);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code=e.getKeyCode();
        if(code==KeyEvent.VK_F1){  //F1
            //converting text of t1 to capital
            String s1=t1.getText();
            String s2=s1.toUpperCase();
            t1.setText(s2);
        }else if(code==KeyEvent.VK_F2){    //F2
            String s1=t1.getText();
            String s2=s1.toLowerCase();
            t1.setText(s2);
        }else if(code==KeyEvent.VK_ESCAPE){
            t1.setText("");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
/*
    1) extends the class with Frame class.
    2) all the components are declared inside the class (not in any method) so that we can use them through out the class
    3) generates a initComponent method where components are created.
    4) generates a constructor and call the initComponents in it.
 */


import java.awt.Button;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class GuiThree extends Frame implements ActionListener, ItemListener {

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
}
/*
    1) extends the class with Frame class.
    2) all the components are declared inside the class (not in any method) so that we can use them through out the class
    3) generates a initComponent method where components are created.
    4) generates a constructor and call the initComponents in it.
 */

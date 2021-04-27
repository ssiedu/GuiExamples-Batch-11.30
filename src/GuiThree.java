
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;


public class GuiThree extends Frame {
    
    public GuiThree(){
        initComponents();
    }
    
    public void initComponents(){
        setLayout(new FlowLayout());
        t1=new TextField(10);
        t2=new TextField(10);
        b1=new Button("Copy");
        b2=new Button("Clear");
        add(t1); add(t2); add(b1); add(b2);
    }
    
    
    public static void main(String[] args) {
        GuiThree ob=new GuiThree();
        ob.setVisible(true);
        ob.setSize(500,500);
    }
    
    private TextField t1,t2;
    private Button b1,b2;
}
/*
    1) extends the class with Frame class.
    2) all the components are declared inside the class (not in any method) so that we can use them through out the class
    3) generates a initComponent method where components are created.
    4) generates a constructor and call the initComponents in it.
*/

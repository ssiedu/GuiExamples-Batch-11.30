
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class GuiTwo {
     public static void main(String[] args) {

        //step-1 (create a container)
        Frame f=new Frame();
        f.setVisible(true);
        f.setSize(500,500); //w,h
        
        //step-2 (create components)
        Label l1=new Label("Name");
        TextField t1=new TextField(10);
        Label l2=new Label("Age");
        TextField t2=new TextField(10);
        Button b1=new Button("Save");
        
        //step-3 (add the components on container)
        //adding components on container without using layout manager
        
        f.setLayout(null);
        
        l1.setSize(50, 30);
        l1.setLocation(100, 50);
        f.add(l1);
        
        t1.setSize(100,30);
        t1.setLocation(180, 50);
        f.add(t1);
        
        l2.setBounds(100, 100, 50, 30); //x,y,w,h
        t2.setBounds(180, 100, 100, 30);
        
        f.add(l2);
        f.add(t2);
        
    }
}

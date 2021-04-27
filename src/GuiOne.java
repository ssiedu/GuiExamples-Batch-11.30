
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;


public class GuiOne {

    public static void main(String[] args) {

        //step-1 (create a container)
        Frame f=new Frame();
        f.setVisible(true);
        f.setSize(400,400); //w,h
        
        //step-2 (create components)
        Label l1=new Label("Name");
        TextField t1=new TextField(10);
        Button b1=new Button("Save");
        Button b2=new Button("Cancel");
        
        //step-3 (add the components on container)
        //f.setLayout(new FlowLayout());
        //f.add("North",l1); f.add("South",t1); f.add(b1);
        //FlowLayout fL=new FlowLayout();
        //f.setLayout(fL);
        GridLayout gL=new GridLayout(2,2);  //2 rows and 2 cols
        f.setLayout(gL);
        f.add(l1); f.add(t1); f.add(b1); f.add(b2);
        f.pack();
        
    }
}

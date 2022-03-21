import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class MainFrame extends JFrame {
  // public void init() {
   //   setTitle("Hello");
     // setSize(600,400);
     // setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     // setVisible(true);
      
      
 
   // }
   public void TextAreaExample(){  
        JFrame f= new JFrame();  
        JTextArea area=new JTextArea("Welcome to My Application");  
        area.setBounds(10,30, 200,200);  
        f.add(area);  
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);  
     }  
}

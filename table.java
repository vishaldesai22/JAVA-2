import javax.swing.*;
public class table
{
    public static void main(String args[])
    {
        JFrame f = new JFrame ();
        f.setSize(400,400);
      
        f.setVisible(true);
        String data[][] ={
            {"1","11","111"},
            {"2","22","222"},
            {"3","33","333"}

        };
    
    String col[] ={"roll","mark","value"};
    JTable t = new JTable(data,col);
    JScrollPane s = new JScrollPane(t);
    f.add(s);
    
    }
}
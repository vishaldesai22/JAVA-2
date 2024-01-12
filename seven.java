
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class seven {

    public static void main(String args[]) {

        JFrame f = new JFrame();
        // f.setLayout(new FlowLayout());
        f.setSize(400, 400);
        f.setVisible(true);
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Maharashtra");
        DefaultMutableTreeNode child = new DefaultMutableTreeNode("pune");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("kolhapur");
        root.add(child);
        root.add(child2);
        JTree jt = new JTree(root);
        f.add(jt);

    }

}

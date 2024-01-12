import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class jtree {
    public static void main(String args[]) {
        JFrame f = new JFrame("frame");
        f.setTitle("example ");
        f.setVisible(true);
        f.setSize(400, 400);
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("maharashtra ");
        DefaultMutableTreeNode child = new DefaultMutableTreeNode("mumbai");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("pune");
        DefaultMutableTreeNode child3 = new DefaultMutableTreeNode("kolhapur");
        root.add(child);
        child.add(child2);
        child2.add(child3);
        JTree jt = new JTree(root);
        f.add(jt);

    }
}

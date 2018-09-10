import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class myBThreeTest {

    @Test
    public void add() {

        myThree bt = createBThree();

        bt.add(6);
        bt.add(4);
        assertTrue(bt.containsNode(6));
        assertTrue(bt.containsNode(4));
        assertFalse(bt.containsNode(42));

    }

    @Test
    public void containsNode() {
    }

    private myBThree createBThree() {
        Node root = new Node(1);
        return new myBThree(root);
    }
}

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

        myThree bt = createBThree();
        bt.add(9);
        assertTrue(bt.containsNode(9));
        assertFalse(bt.containsNode(23));
    }

    @Test
    public void delete() {
        myThree bt = createBThree();
        bt.add(9);
        assertTrue(bt.containsNode(9));
        bt.delete(9);
        assertFalse(bt.containsNode(9));
    }


    private myBThree createBThree() {
        return new myBThree(1);
    }


}

package eg.edu.alexu.csd.datastructure.queue.cs15_cs28_cs36;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;
public class ArrayBasedTest {

    @Test
    public void test() {
        Scanner scan = new Scanner (System.in);
        int no = scan.nextInt();
        ArrayBased test = new ArrayBased (no);
        
        /*testing enqueue by checking the size of the queue*/
        test.enqueue(1);
        int size = test.size();
        assertEquals(1, size);
        
        /*testing dequeue by checking the size of the queue*/
        test.enqueue(2);
        test.dequeue();
        size = test.size();
        assertEquals(1, test.size());
       
        /*testing isEmpty*/
        assertEquals(false, test.isEmpty());
        
        test.dequeue();
        assertEquals(true, test.isEmpty());
        
        /*testing size()*/
        assertEquals(0, test.size());
        
        test.enqueue(2);
        assertEquals(1, test.size());
        
        test.enqueue(3);
        test.enqueue(4);
        assertEquals(3, test.size());
        
        test.dequeue();
        assertEquals(2, test.size());
    }

}

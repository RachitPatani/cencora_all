import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AdditionSpec
{
    @BeforeEach
    public  void testBefore()
    {
        System.out.println("setting before");
    }
    @Test
    public  void testAddition()
    {
        int result=AdditionDemo.addition(2,3);
        assertEquals(5,result,"test fail");

    }
    @Test
    public void testSubs()
    {
        int result=AdditionDemo.substraction(9,4);
        assertEquals(4,result,"test fail");
    }
@Test
    public void testMul()
    {
        int result=AdditionDemo.multipy(4,4);
        assertEquals(16,result,"test fail");
    }

    @AfterEach
    public  void testAfter()
    {
        System.out.println("END");
    }
}

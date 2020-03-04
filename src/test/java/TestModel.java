import org.junit.Test;
import org.junit.*;
import model.Model;

public class TestModel {
    @Test
    public void testGetMessage()
    {
        Model model=new Model();
        String m=model.getMessage();
        Assert.assertNotNull(m);
        Assert.assertEquals(m, "Coucou les amis !!");
    }
}

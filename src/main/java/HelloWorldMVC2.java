import controller.Controller;
import model.Model;
import view.View;

public class HelloWorldMVC2 {
    public static void main(String args[]) {
        Controller c=new Controller(new Model(), new View());
        c.run();
    }
}

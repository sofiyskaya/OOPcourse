import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.Calculator;
import Model.Logging;
import View.View;

public class App {
    public static void main(String[] args) throws Exception {

        iGetView view = new View();

        iGetModel model = new Calculator();

        Controller calc = new Controller(view, model);
        
        calc.run();
    }
}
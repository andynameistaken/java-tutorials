package design_patterns.ModelViewController;

public class Test_MVC
{
    public static void main(String[] args)
    {
        CalculatorView view = new CalculatorView();
        CalculatorModel model = new CalculatorModel();
        CalculatorController controller = new CalculatorController(view, model);
        view.setVisible(true);
    }
}

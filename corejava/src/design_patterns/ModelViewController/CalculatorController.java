package design_patterns.ModelViewController;
/**
 * Controller cordinates interaction between View and Model*/
public class CalculatorController
{
    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorController(CalculatorView view, CalculatorModel model)
    {
        this.view = view;
        this.model = model;

        this.view.addCalculateListener(
                e ->
                {
                    int firstnum = 0;
                    int secondnum = 0;
                    try
                    {
                        firstnum = view.getFirstNumber();
                        secondnum = view.getSecondNumber();

                        model.addTwoNumbers(firstnum, secondnum);
                        view.setCalcSolution(model.getCalculationValue());
                    } catch (Exception ex)
                    {
                        System.out.println(ex);
                        view.displayErrorPopup("You need to add 2 integers");

                    }
                }
        );
    }
}

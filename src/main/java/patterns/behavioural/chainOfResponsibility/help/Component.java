package patterns.behavioural.chainOfResponsibility.help;

public abstract class Component implements ComponentWithContextualHelp
{
    private String tooltipText;
    protected Container container;

    @Override
    public void showHelp()
    {
        if (tooltipText != null) {
            System.out.println("Show tooltip with help: " + tooltipText);
        }
        else {
            container.showHelp();
        }
    }

    public String getTooltipText()
    {
        return tooltipText;
    }

    public void setTooltipText(String tooltipText)
    {
        this.tooltipText = tooltipText;
    }
}

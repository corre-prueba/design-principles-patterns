package patterns.behavioural.command.editor;

public class UndoCommand extends Command
{
    public UndoCommand(Application application, Editor editor)
    {
        super(application, editor);
    }

    @Override
    public void execute()
    {
        application.undo();
    }
}

package solid.liskov2;

public class WritableDocument extends Document
{
    public WritableDocument(String fileName)
    {
        super(fileName);
    }

    public void save() {
        System.out.println(this.getData() + " was saved in " + getFileName());
    }
}

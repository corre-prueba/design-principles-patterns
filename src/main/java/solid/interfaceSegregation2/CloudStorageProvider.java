package solid.interfaceSegregation2;

public interface CloudStorageProvider
{
    void storeFile(String name);
    String getFile(String name);
}

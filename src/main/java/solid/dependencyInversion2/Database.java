package solid.dependencyInversion2;

public interface Database
{
    void connect(String database);
    void insert(Entity entity);
    void update(Entity entity);
    void delete(Entity entity);
    void disconnect();
}

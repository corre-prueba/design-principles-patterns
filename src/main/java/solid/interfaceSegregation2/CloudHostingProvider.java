package solid.interfaceSegregation2;

public interface CloudHostingProvider
{
    void createServer(Region region, String serverName);
    void listServers(Region region);
}

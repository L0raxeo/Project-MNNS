package neuralNetworkSimulation.mark7.paths;

public class Path
{

    public String def;

    public int memory = 2;

    public Path(char[] neurons)
    {
        StringBuilder sBuilder = new StringBuilder();

        for (char n : neurons)
        {
            sBuilder.append(n);
        }

        def = sBuilder.toString();
    }

}

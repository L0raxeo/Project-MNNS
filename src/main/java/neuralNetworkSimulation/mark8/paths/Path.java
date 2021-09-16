package neuralNetworkSimulation.mark8.paths;

public class Path
{

    public String def;

    public int memory = 2;

    public Path(char[] neurons)
    {
        StringBuilder stringBuilder = new StringBuilder();

        for (char n : neurons)
        {
            stringBuilder.append(n);
        }

        def = stringBuilder.toString();
    }

}

package neuralNetworkSimulation.mark6.paths;

public class Path
{

    public String def;

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

package neuralNetworkSimulation.mark8.nuclei;

import neuralNetworkSimulation.mark8.paths.Path;
import neuralNetworkSimulation.mark8.utils.Utils;

import java.util.HashMap;

public class Nucleus
{

    public String def;

    /**
     * Nucleus represents connected nucleus
     * Integer represents confidence rate of corresponding nucleus
     */
    public HashMap<Nucleus, Integer> connections = new HashMap<>();

    public Nucleus(Path[] paths)
    {
        StringBuilder stringBuilder = new StringBuilder();

        for (Path p : paths)
        {
            stringBuilder.append(p.def).append(" ");

            p.memory += 3;
        }

        def = stringBuilder.toString();
    }

    public void trigger()
    {
        connections = Utils.sortHashMapByValue(connections);

        for (Nucleus n : connections.keySet())
        {
            System.out.println("Nucleus: [" + n.def + "] - Confidence Rate: [" + connections.get(n) + "%]");
        }
    }

}

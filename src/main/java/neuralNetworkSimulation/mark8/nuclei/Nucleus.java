package neuralNetworkSimulation.mark8.nuclei;

import neuralNetworkSimulation.mark8.paths.Path;

import java.util.HashMap;

public class Nucleus
{

    public String def;

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

}

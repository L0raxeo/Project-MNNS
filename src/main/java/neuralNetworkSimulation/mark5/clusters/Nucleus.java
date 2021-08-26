package neuralNetworkSimulation.mark5.clusters;

import neuralNetworkSimulation.mark5.paths.Path;

public class Nucleus
{

    public String def;

    public int memory;

    public Nucleus(Path[] paths)
    {
        StringBuilder defBuilder = new StringBuilder();

        for (Path p : paths)
        {
            defBuilder.append(p.def);
        }

        this.def = defBuilder.toString();
    }

    public void trigger()
    {
        memory *= 2;

        System.out.println("[Mark]: " + this.def);
    }

}

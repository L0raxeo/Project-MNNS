package neuralNetworkSimulation.mark8.nuclei;

import neuralNetworkSimulation.mark8.paths.Path;
import neuralNetworkSimulation.mark8.paths.PathManager;

import java.util.ArrayList;

public class NucleusManager
{

    public static ArrayList<Nucleus> nuclei = new ArrayList<>();

    public static Nucleus getNucleus(String def)
    {
        for (Nucleus n : nuclei)
        {
            if (n.def.equals(def))
            {
                return n;
            }
        }

        defineNucleus(PathManager.stringToPathArray(def));

        return null;
    }

    public static void defineNucleus(Path[] paths)
    {
        nuclei.add(new Nucleus(paths));
    }

    public static void decreaseConfidenceOfUnusedNuclei(Nucleus origin, Nucleus usedBranch)
    {
        for (Nucleus n : origin.connections.keySet())
        {
            if (n == usedBranch && origin.connections.get(n) < 100)
            {
                origin.connections.put(n, origin.connections.get(n) + 1);
            }
            else
            {
                if (origin.connections.get(n) > 0)
                {
                    origin.connections.put(n, origin.connections.get(n) - 1);
                }
            }
        }
    }

}

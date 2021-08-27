package neuralNetworkSimulation.mark5.nuclei;

import neuralNetworkSimulation.mark5.paths.Path;
import neuralNetworkSimulation.mark5.paths.PathManager;

public class NucleusManager
{

    public static void triggerNucleus(String input)
    {
        Path[] inputAsPaths = PathManager.stringToPathArray(input);

        if (inputAsPaths != null)
        {
            StringBuilder stringBuilder = new StringBuilder();

            for (Path p : inputAsPaths)
            {
                stringBuilder.append(p.def).append(" ");
            }

            System.out.println("[Mark]: " + stringBuilder);
        }
    }

}

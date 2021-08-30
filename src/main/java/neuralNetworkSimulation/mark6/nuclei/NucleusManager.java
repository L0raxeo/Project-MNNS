package neuralNetworkSimulation.mark6.nuclei;

import neuralNetworkSimulation.mark6.paths.Path;
import neuralNetworkSimulation.mark6.paths.PathManager;

public class NucleusManager
{

    public static void triggerNucleus(String input)
    {
        Path[] inputAsPaths = PathManager.stringToPathArray(input);

        if (inputAsPaths != null)
        {
            StringBuilder response = new StringBuilder();

            for (Path p : inputAsPaths)
            {
                response.append(p.def).append(" ");
            }

            System.out.println("[Mark]: " + response);
        }
    }

}

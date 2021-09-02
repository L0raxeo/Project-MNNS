package neuralNetworkSimulation.mark7.paths;

import neuralNetworkSimulation.mark7.utils.Utils;

import java.util.ArrayList;
import java.util.ListIterator;

public class PathManager
{

    public static ArrayList<Path> paths = new ArrayList<>();

    public static Path getPath(String def)
    {
        for (Path p : paths)
        {
            if (p.def.equals(def))
            {
                return p;
            }
        }

        definePath(def);

        return null;
    }

    public static void definePath(String def)
    {
        paths.add(new Path(Utils.getStringAsCharArray(def))); // Passes neurons
        System.out.println("Defining Path: " + def);
    }

    public static void forgetPath(Path path)
    {
        paths.remove(path);
    }

    public static void decreaseMemoryOfAllNeurons()
    {
        ListIterator<Path> it = paths.listIterator();

        while (it.hasNext())
        {
            try
            {
                Path p = it.next();

                p.memory--;

                if (p.memory <= 0)
                {
                    forgetPath(p);
                    System.out.println("Forgetting Path: " + p.def);
                }
            }
            catch (Exception e)
            {
                return;
            }
        }
    }

    public static Path[] stringToPathArray(String input)
    {
        String[] splitStrings = input.split(" ");
        Path[] convertedPaths = new Path[splitStrings.length];

        boolean learning = false;

        for (int i = 0; i < convertedPaths.length; i++)
        {
            Path path = getPath(splitStrings[i]);
            convertedPaths[i] = path;

            if (path == null)
                learning = true;
        }

        if (learning)
            return null;

        return convertedPaths;
    }

}

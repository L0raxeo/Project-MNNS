import neuralNetworkSimulation.mark1.NeuralNetworkM1;

import java.util.Scanner;

public class Launcher
{

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] wopr)
    {
        System.out.println("--Welcome to NNS--");
        System.out.println("Please specify simulation");

        switch (scanner.nextLine())
        {
            case "mark-I":
                new NeuralNetworkM1().wake();
                break;
            default:
                System.out.println("--Invalid simulation connection terminated--");
                break;
        }
    }

}

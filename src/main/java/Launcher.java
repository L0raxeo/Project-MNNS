import neuralNetworkSimulation.mark1.NeuralNetworkM1;
import neuralNetworkSimulation.mark2.NeuralNetworkM2;
import neuralNetworkSimulation.mark3.NeuralNetworkM3;
import neuralNetworkSimulation.mark4.NeuralNetworkM4;
import neuralNetworkSimulation.mark5.NeuralNetworkM5;
import neuralNetworkSimulation.mark6.NeuralNetworkM6;
import neuralNetworkSimulation.mark7.NeuralNetworkM7;

import java.util.Scanner;

public class Launcher
{

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] wopr)
    {
        System.out.println("--Welcome to MNNS--");
        System.out.println("Please specify simulation");

        switch (scanner.nextLine())
        {
            case "mark-I":
                new NeuralNetworkM1().wake();
                break;
            case "mark-II":
                new NeuralNetworkM2().wake();
                break;
            case "mark-III":
                new NeuralNetworkM3().wake();
                break;
            case "mark-IV":
                new NeuralNetworkM4().wake();
                break;
            case "mark-V":
                new NeuralNetworkM5().wake();
                break;
            case "mark-VI":
                new NeuralNetworkM6().wake();
                break;
            case "mark-VII":
                new NeuralNetworkM7().wake();
                break;
            default:
                System.out.println("--Invalid simulation connection terminated--");
                break;
        }
    }

}

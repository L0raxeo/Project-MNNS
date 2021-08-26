package neuralNetworkSimulation.mark5.neurons;

public class Neuron
{

    public final char code;

    public int memory;

    public Neuron(char code)
    {
        this.code = code;

        memory = 4;
    }

    public void trigger()
    {
        System.out.println("Neuron Triggers: " + code);
    }

}

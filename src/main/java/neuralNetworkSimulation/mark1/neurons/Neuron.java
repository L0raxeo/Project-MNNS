package neuralNetworkSimulation.mark1.neurons;

public class Neuron
{

    public final char code;

    public Neuron(char code)
    {
        this.code = code;
    }

    public void activate()
    {
        System.out.println(code);
    }

}

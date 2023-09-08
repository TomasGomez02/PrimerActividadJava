public class Lamparita {
    private boolean state;

    public Lamparita()
    {
        state = false;
    }

    public void encender()
    {
        state = true;
    }

    public void apagar()
    {
        state = false;
    }

    public boolean getState()
    {
        return state;   
    }

    public static void main(String[] args) throws Exception {
        Lamparita lam = new Lamparita();
        System.out.println(lam.getState());
        lam.encender();
        System.out.println(lam.getState());
    }
}

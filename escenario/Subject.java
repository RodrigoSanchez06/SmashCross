package escenario;

public interface Subject {
    public void register(Viewer viewer);
    public void remove(Viewer viewer);
    public void communicate();
}

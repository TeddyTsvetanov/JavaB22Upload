package repl_it_practiceTeddy.getter_setter;

public class Db {
    private String data;
    private int yint;

    public Db(String data, int yint) {
        this.data = data;
        this.yint = yint;
    }

    public String getData() {
        return data;
    }

    public int getYint() {
        return yint;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setYint(int yint) {
        this.yint = yint;
    }
}

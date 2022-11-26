package pt.up.fe.ldts.example4;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Supervisor extends Worker{
    Set<Worker> supervisee;

    public Supervisor(String name, String phone, String username, String password) {
        super(name, phone, username, password);
        this.supervisee = new HashSet<>();
    }

    public void addSupervisee(Worker worker) {
        supervisee.add(worker);
    }

    public boolean isSupervisee(Worker worker) {
        return supervisee.contains(worker);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker)) return false;
        if (!(o instanceof Supervisor)) return false;
        Supervisor worker = (Supervisor) o;
        return Objects.equals(getName(), worker.getName()) &&
                Objects.equals(getPhone(), worker.getPhone()) &&
                Objects.equals(getUsername(), worker.getUsername()) &&
                Objects.equals(getPassword(), worker.getPassword());
    }
}

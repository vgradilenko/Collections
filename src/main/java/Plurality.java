import java.util.HashSet;
import java.util.Set;

public class Plurality implements Operations {
    //Два множества А и В равны (А=В), если они состоят из одних и тех же элементов
    public boolean equals(Set a, Set b) {
        if (a.size() == b.size()) {
            if (a.containsAll(b)) {
                return true;
            }
        }
        return false;
    }

    //Объединением (суммой) множеств А и В называется множество А∪В,
    //элементы которого принадлежат хотя бы одному из этих множеств
    public Set union(Set a, Set b){
        Set c = new HashSet();
        c.addAll(a);
        c.addAll(b);
        return c;
    }
    //Разностью множеств А и В называется множество АВ, элементы которого
    //принадлежат множеству А, но не принадлежат множеству В
    public Set subtract(Set a, Set b) {
        Set c = new HashSet();
        c.addAll(a);
        c.removeAll(b);
        return c;
    }
    //Пересечением (произведением) множеств А и В называется множество А ∩ В,
    //элементы которого принадлежат как множеству А, так и множеству В
    public Set intersect(Set a, Set b) {
        Set c = new HashSet();
        c.addAll(a);
        c.retainAll(b);
        return c;
    }
    //Симметричной разностью множеств А и В называется множество А Δ В,
    //являющееся объединением разностей множеств АВ и ВА, то есть А Δ В = (АВ) ∪(ВА)
    public Set symmetricSubtract(Set a, Set b) {
        Set c = new HashSet();
        Set d = new HashSet();
        c.addAll(a);
        d.addAll(b);
        c.removeAll(b);
        d.removeAll(a);
        c.addAll(d);
        return c;
    }
}
package p191n8;

import java.util.LinkedList;
import java.util.List;
import p345y8.C10453g;

public class C7304d {
    public C10453g f23190a = C10453g.f33526j;
    public List<AbstractC7307g> f23191b = new LinkedList();

    public static long m17100b(long j, long j2) {
        return j2 == 0 ? j : m17100b(j2, j % j2);
    }

    public void m17101a(AbstractC7307g gVar) {
        if (m17096f(gVar.mo12960D().m17080h()) != null) {
            gVar.mo12960D().m17070s(m17098d());
        }
        this.f23191b.add(gVar);
    }

    public C10453g m17099c() {
        return this.f23190a;
    }

    public long m17098d() {
        long j = 0;
        for (AbstractC7307g gVar : this.f23191b) {
            if (j < gVar.mo12960D().m17080h()) {
                j = gVar.mo12960D().m17080h();
            }
        }
        return j + 1;
    }

    public long m17097e() {
        long g = m17095g().iterator().next().mo12960D().m17081g();
        for (AbstractC7307g gVar : m17095g()) {
            g = m17100b(gVar.mo12960D().m17081g(), g);
        }
        return g;
    }

    public AbstractC7307g m17096f(long j) {
        for (AbstractC7307g gVar : this.f23191b) {
            if (gVar.mo12960D().m17080h() == j) {
                return gVar;
            }
        }
        return null;
    }

    public List<AbstractC7307g> m17095g() {
        return this.f23191b;
    }

    public void m17094h(C10453g gVar) {
        this.f23190a = gVar;
    }

    public void m17093i(List<AbstractC7307g> list) {
        this.f23191b = list;
    }

    public String toString() {
        String str = "Movie{ ";
        for (AbstractC7307g gVar : this.f23191b) {
            str = String.valueOf(str) + "track_" + gVar.mo12960D().m17080h() + " (" + gVar.getHandler() + ") ";
        }
        return String.valueOf(str) + '}';
    }
}

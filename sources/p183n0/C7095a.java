package p183n0;

import java.util.ArrayList;
import java.util.HashSet;
import p016b1.AbstractC1129e;
import p016b1.C1130f;
import p143k0.C6037g;

public final class C7095a<T> {
    public final AbstractC1129e<ArrayList<T>> f22579a = new C1130f(10);
    public final C6037g<T, ArrayList<T>> f22580b = new C6037g<>();
    public final ArrayList<T> f22581c = new ArrayList<>();
    public final HashSet<T> f22582d = new HashSet<>();

    public void m17750a(T t, T t2) {
        if (!this.f22580b.containsKey(t) || !this.f22580b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayList = this.f22580b.get(t);
        if (arrayList == null) {
            arrayList = m17745f();
            this.f22580b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    public void m17749b(T t) {
        if (!this.f22580b.containsKey(t)) {
            this.f22580b.put(t, null);
        }
    }

    public void m17748c() {
        int size = this.f22580b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> l = this.f22580b.m21477l(i);
            if (l != null) {
                m17742i(l);
            }
        }
        this.f22580b.clear();
    }

    public boolean m17747d(T t) {
        return this.f22580b.containsKey(t);
    }

    public final void m17746e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList<T> arrayList2 = this.f22580b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m17746e(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    public final ArrayList<T> m17745f() {
        ArrayList<T> b = this.f22579a.mo38330b();
        return b == null ? new ArrayList<>() : b;
    }

    public ArrayList<T> m17744g() {
        this.f22581c.clear();
        this.f22582d.clear();
        int size = this.f22580b.size();
        for (int i = 0; i < size; i++) {
            m17746e(this.f22580b.m21480i(i), this.f22581c, this.f22582d);
        }
        return this.f22581c;
    }

    public boolean m17743h(T t) {
        int size = this.f22580b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> l = this.f22580b.m21477l(i);
            if (l != null && l.contains(t)) {
                return true;
            }
        }
        return false;
    }

    public final void m17742i(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f22579a.mo38331a(arrayList);
    }
}

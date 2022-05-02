package p345y8;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p126j$.util.Iterator;
import p126j$.util.function.Consumer;

public class C10450e<E> extends AbstractList<E> {
    public static final AbstractC10452f f33518c = AbstractC10452f.m5099a(C10450e.class);
    public List<E> f33519a;
    public Iterator<E> f33520b;

    public class C10451a implements Iterator<E>, p126j$.util.Iterator {
        public int f33521a = 0;

        public C10451a() {
        }

        @Override
        public void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override
        public void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override
        public boolean hasNext() {
            return this.f33521a < C10450e.this.f33519a.size() || C10450e.this.f33520b.hasNext();
        }

        @Override
        public E next() {
            if (this.f33521a < C10450e.this.f33519a.size()) {
                List<E> list = C10450e.this.f33519a;
                int i = this.f33521a;
                this.f33521a = i + 1;
                return list.get(i);
            }
            C10450e eVar = C10450e.this;
            eVar.f33519a.add(eVar.f33520b.next());
            return (E) next();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C10450e(List<E> list, java.util.Iterator<E> it) {
        this.f33519a = list;
        this.f33520b = it;
    }

    @Override
    public E get(int i) {
        if (this.f33519a.size() > i) {
            return this.f33519a.get(i);
        }
        if (this.f33520b.hasNext()) {
            this.f33519a.add(this.f33520b.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    public final void m5100h() {
        f33518c.mo5098b("blowup running");
        while (this.f33520b.hasNext()) {
            this.f33519a.add(this.f33520b.next());
        }
    }

    @Override
    public java.util.Iterator<E> iterator() {
        return new C10451a();
    }

    @Override
    public int size() {
        f33518c.mo5098b("potentially expensive size() call");
        m5100h();
        return this.f33519a.size();
    }
}
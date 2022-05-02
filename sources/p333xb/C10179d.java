package p333xb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import p107ha.C5060q;
import p290ub.C9489b;
import qa.C8298k;

public final class C10179d {
    public boolean f32904a;
    public AbstractC10176a f32905b;
    public final List<AbstractC10176a> f32906c = new ArrayList();
    public boolean f32907d;
    public final C10180e f32908e;
    public final String f32909f;

    public C10179d(C10180e eVar, String str) {
        C8298k.m12933e(eVar, "taskRunner");
        C8298k.m12933e(str, "name");
        this.f32908e = eVar;
        this.f32909f = str;
    }

    public static void m5831j(C10179d dVar, AbstractC10176a aVar, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        dVar.m5832i(aVar, j);
    }

    public final void m5840a() {
        if (!C9489b.f30729h || !Thread.holdsLock(this)) {
            synchronized (this.f32908e) {
                if (m5839b()) {
                    this.f32908e.m5819h(this);
                }
                C5060q qVar = C5060q.f17066a;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C8298k.m12934d(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST NOT hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    public final boolean m5839b() {
        AbstractC10176a aVar = this.f32905b;
        if (aVar != null) {
            C8298k.m12935c(aVar);
            if (aVar.m5849a()) {
                this.f32907d = true;
            }
        }
        boolean z = false;
        for (int size = this.f32906c.size() - 1; size >= 0; size--) {
            if (this.f32906c.get(size).m5849a()) {
                AbstractC10176a aVar2 = this.f32906c.get(size);
                if (C10180e.f32912j.m5816a().isLoggable(Level.FINE)) {
                    C10177b.m5843a(aVar2, this, "canceled");
                }
                this.f32906c.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final AbstractC10176a m5838c() {
        return this.f32905b;
    }

    public final boolean m5837d() {
        return this.f32907d;
    }

    public final List<AbstractC10176a> m5836e() {
        return this.f32906c;
    }

    public final String m5835f() {
        return this.f32909f;
    }

    public final boolean m5834g() {
        return this.f32904a;
    }

    public final C10180e m5833h() {
        return this.f32908e;
    }

    public final void m5832i(AbstractC10176a aVar, long j) {
        C8298k.m12933e(aVar, "task");
        synchronized (this.f32908e) {
            if (!this.f32904a) {
                if (m5830k(aVar, j, false)) {
                    this.f32908e.m5819h(this);
                }
                C5060q qVar = C5060q.f17066a;
            } else if (aVar.m5849a()) {
                if (C10180e.f32912j.m5816a().isLoggable(Level.FINE)) {
                    C10177b.m5843a(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (C10180e.f32912j.m5816a().isLoggable(Level.FINE)) {
                    C10177b.m5843a(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean m5830k(AbstractC10176a aVar, long j, boolean z) {
        String str;
        C8298k.m12933e(aVar, "task");
        aVar.m5845e(this);
        long c = this.f32908e.m5820g().mo5813c();
        long j2 = c + j;
        int indexOf = this.f32906c.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.m5847c() <= j2) {
                if (C10180e.f32912j.m5816a().isLoggable(Level.FINE)) {
                    C10177b.m5843a(aVar, this, "already scheduled");
                }
                return false;
            }
            this.f32906c.remove(indexOf);
        }
        aVar.m5844g(j2);
        if (C10180e.f32912j.m5816a().isLoggable(Level.FINE)) {
            if (z) {
                str = "run again after " + C10177b.m5842b(j2 - c);
            } else {
                str = "scheduled after " + C10177b.m5842b(j2 - c);
            }
            C10177b.m5843a(aVar, this, str);
        }
        Iterator<AbstractC10176a> it = this.f32906c.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().m5847c() - c > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = this.f32906c.size();
        }
        this.f32906c.add(i, aVar);
        return i == 0;
    }

    public final void m5829l(AbstractC10176a aVar) {
        this.f32905b = aVar;
    }

    public final void m5828m(boolean z) {
        this.f32907d = z;
    }

    public final void m5827n() {
        if (!C9489b.f30729h || !Thread.holdsLock(this)) {
            synchronized (this.f32908e) {
                this.f32904a = true;
                if (m5839b()) {
                    this.f32908e.m5819h(this);
                }
                C5060q qVar = C5060q.f17066a;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C8298k.m12934d(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST NOT hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    public String toString() {
        return this.f32909f;
    }
}

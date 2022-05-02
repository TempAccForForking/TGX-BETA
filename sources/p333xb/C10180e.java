package p333xb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p107ha.C5060q;
import p290ub.C9489b;
import qa.C8294g;
import qa.C8298k;

public final class C10180e {
    public static final Logger f32908i;
    public boolean f32911b;
    public long f32912c;
    public final AbstractC10181a f32916g;
    public static final C10182b f32909j = new C10182b(null);
    public static final C10180e f32907h = new C10180e(new C10183c(C9489b.m8536I(C9489b.f30727i + " TaskRunner", true)));
    public int f32910a = 10000;
    public final List<C10179d> f32913d = new ArrayList();
    public final List<C10179d> f32914e = new ArrayList();
    public final Runnable f32915f = new RunnableC10184d();

    public interface AbstractC10181a {
        void mo5815a(C10180e eVar);

        void mo5814b(C10180e eVar, long j);

        long mo5813c();

        void execute(Runnable runnable);
    }

    public static final class C10182b {
        public C10182b() {
        }

        public final Logger m5816a() {
            return C10180e.f32908i;
        }

        public C10182b(C8294g gVar) {
            this();
        }
    }

    public static final class C10183c implements AbstractC10181a {
        public final ThreadPoolExecutor f32917a;

        public C10183c(ThreadFactory threadFactory) {
            C8298k.m12934e(threadFactory, "threadFactory");
            this.f32917a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override
        public void mo5815a(C10180e eVar) {
            C8298k.m12934e(eVar, "taskRunner");
            eVar.notify();
        }

        @Override
        public void mo5814b(C10180e eVar, long j) {
            C8298k.m12934e(eVar, "taskRunner");
            long j2 = j / 1000000;
            long j3 = j - (1000000 * j2);
            if (j2 > 0 || j > 0) {
                eVar.wait(j2, (int) j3);
            }
        }

        @Override
        public long mo5813c() {
            return System.nanoTime();
        }

        @Override
        public void execute(Runnable runnable) {
            C8298k.m12934e(runnable, "runnable");
            this.f32917a.execute(runnable);
        }
    }

    public static final class RunnableC10184d implements Runnable {
        public RunnableC10184d() {
        }

        @Override
        public void run() {
            AbstractC10176a d;
            while (true) {
                synchronized (C10180e.this) {
                    d = C10180e.this.m5823d();
                }
                if (d != null) {
                    C10179d d2 = d.m5846d();
                    C8298k.m12936c(d2);
                    long j = -1;
                    boolean isLoggable = C10180e.f32909j.m5816a().isLoggable(Level.FINE);
                    if (isLoggable) {
                        j = d2.m5833h().m5820g().mo5813c();
                        C10177b.m5841c(d, d2, "starting");
                    }
                    try {
                        C10180e.this.m5817j(d);
                        C5060q qVar = C5060q.f17066a;
                        if (isLoggable) {
                            long c = d2.m5833h().m5820g().mo5813c() - j;
                            C10177b.m5841c(d, d2, "finished run in " + C10177b.m5842b(c));
                        }
                    } catch (Throwable th) {
                        if (isLoggable) {
                            long c2 = d2.m5833h().m5820g().mo5813c() - j;
                            C10177b.m5841c(d, d2, "failed a run in " + C10177b.m5842b(c2));
                        }
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(C10180e.class.getName());
        C8298k.m12935d(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f32908i = logger;
    }

    public C10180e(AbstractC10181a aVar) {
        C8298k.m12934e(aVar, "backend");
        this.f32916g = aVar;
    }

    public final void m5824c(AbstractC10176a aVar, long j) {
        if (!C9489b.f30726h || Thread.holdsLock(this)) {
            C10179d d = aVar.m5846d();
            C8298k.m12936c(d);
            if (d.m5838c() == aVar) {
                boolean d2 = d.m5837d();
                d.m5828m(false);
                d.m5829l(null);
                this.f32913d.remove(d);
                if (j != -1 && !d2 && !d.m5834g()) {
                    d.m5830k(aVar, j, true);
                }
                if (!d.m5836e().isEmpty()) {
                    this.f32914e.add(d);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C8298k.m12935d(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    public final AbstractC10176a m5823d() {
        boolean z;
        if (!C9489b.f30726h || Thread.holdsLock(this)) {
            while (!this.f32914e.isEmpty()) {
                long c = this.f32916g.mo5813c();
                long j = Long.MAX_VALUE;
                Iterator<C10179d> it = this.f32914e.iterator();
                AbstractC10176a aVar = null;
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    AbstractC10176a aVar2 = it.next().m5836e().get(0);
                    long max = Math.max(0L, aVar2.m5847c() - c);
                    if (max > 0) {
                        j = Math.min(max, j);
                    } else if (aVar != null) {
                        z = true;
                        break;
                    } else {
                        aVar = aVar2;
                    }
                }
                if (aVar != null) {
                    m5822e(aVar);
                    if (z || (!this.f32911b && (!this.f32914e.isEmpty()))) {
                        this.f32916g.execute(this.f32915f);
                    }
                    return aVar;
                } else if (this.f32911b) {
                    if (j < this.f32912c - c) {
                        this.f32916g.mo5815a(this);
                    }
                    return null;
                } else {
                    this.f32911b = true;
                    this.f32912c = c + j;
                    try {
                        try {
                            this.f32916g.mo5814b(this, j);
                        } catch (InterruptedException unused) {
                            m5821f();
                        }
                    } finally {
                        this.f32911b = false;
                    }
                }
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C8298k.m12935d(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    public final void m5822e(AbstractC10176a aVar) {
        if (!C9489b.f30726h || Thread.holdsLock(this)) {
            aVar.m5844g(-1L);
            C10179d d = aVar.m5846d();
            C8298k.m12936c(d);
            d.m5836e().remove(aVar);
            this.f32914e.remove(d);
            d.m5829l(aVar);
            this.f32913d.add(d);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C8298k.m12935d(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    public final void m5821f() {
        for (int size = this.f32913d.size() - 1; size >= 0; size--) {
            this.f32913d.get(size).m5839b();
        }
        for (int size2 = this.f32914e.size() - 1; size2 >= 0; size2--) {
            C10179d dVar = this.f32914e.get(size2);
            dVar.m5839b();
            if (dVar.m5836e().isEmpty()) {
                this.f32914e.remove(size2);
            }
        }
    }

    public final AbstractC10181a m5820g() {
        return this.f32916g;
    }

    public final void m5819h(C10179d dVar) {
        C8298k.m12934e(dVar, "taskQueue");
        if (!C9489b.f30726h || Thread.holdsLock(this)) {
            if (dVar.m5838c() == null) {
                if (!dVar.m5836e().isEmpty()) {
                    C9489b.m8523a(this.f32914e, dVar);
                } else {
                    this.f32914e.remove(dVar);
                }
            }
            if (this.f32911b) {
                this.f32916g.mo5815a(this);
            } else {
                this.f32916g.execute(this.f32915f);
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C8298k.m12935d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
    }

    public final C10179d m5818i() {
        int i;
        synchronized (this) {
            i = this.f32910a;
            this.f32910a = i + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('Q');
        sb2.append(i);
        return new C10179d(this, sb2.toString());
    }

    public final void m5817j(AbstractC10176a aVar) {
        if (!C9489b.f30726h || !Thread.holdsLock(this)) {
            Thread currentThread = Thread.currentThread();
            C8298k.m12935d(currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName(aVar.m5848b());
            try {
                long f = aVar.mo4943f();
                synchronized (this) {
                    m5824c(aVar, f);
                    C5060q qVar = C5060q.f17066a;
                }
                currentThread.setName(name);
            } catch (Throwable th) {
                synchronized (this) {
                    m5824c(aVar, -1L);
                    C5060q qVar2 = C5060q.f17066a;
                    currentThread.setName(name);
                    throw th;
                }
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread2 = Thread.currentThread();
            C8298k.m12935d(currentThread2, "Thread.currentThread()");
            sb2.append(currentThread2.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
    }
}
package p215p2;

import android.text.TextUtils;
import androidx.work.C1070b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.List;
import p071f2.AbstractC4234j;
import p071f2.AbstractC4239m;
import p071f2.C4223b;
import p087g2.AbstractC4454e;
import p087g2.C4451c;
import p087g2.C4455f;
import p087g2.C4456g;
import p087g2.C4458i;
import p198o2.C7554p;

public class RunnableC7995b implements Runnable {
    public static final String f26042c = AbstractC4234j.m28362f("EnqueueRunnable");
    public final C4456g f26043a;
    public final C4451c f26044b = new C4451c();

    public RunnableC7995b(C4456g gVar) {
        this.f26043a = gVar;
    }

    public static boolean m13816b(C4456g gVar) {
        boolean c = m13815c(gVar.m27618g(), gVar.m27619f(), (String[]) C4456g.m27613l(gVar).toArray(new String[0]), gVar.m27621d(), gVar.m27623b());
        gVar.m27614k();
        return c;
    }

    public static boolean m13815c(p087g2.C4458i r19, java.util.List<? extends p071f2.AbstractC4253u> r20, java.lang.String[] r21, java.lang.String r22, p071f2.EnumC4227d r23) {
        throw new UnsupportedOperationException("Method not decompiled: p215p2.RunnableC7995b.m13815c(g2.i, java.util.List, java.lang.String[], java.lang.String, f2.d):boolean");
    }

    public static boolean m13813e(C4456g gVar) {
        List<C4456g> e = gVar.m27620e();
        boolean z = false;
        if (e != null) {
            boolean z2 = false;
            for (C4456g gVar2 : e) {
                if (!gVar2.m27615j()) {
                    z2 |= m13813e(gVar2);
                } else {
                    AbstractC4234j.m28364c().mo28357h(f26042c, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", gVar2.m27622c())), new Throwable[0]);
                }
            }
            z = z2;
        }
        return m13816b(gVar) | z;
    }

    public static void m13811g(C7554p pVar) {
        C4223b bVar = pVar.f24152j;
        String str = pVar.f24145c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (bVar.m28392f() || bVar.m28389i()) {
            C1070b.C1071a aVar = new C1070b.C1071a();
            aVar.m38469c(pVar.f24147e).m38465g("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.f24145c = ConstraintTrackingWorker.class.getName();
            pVar.f24147e = aVar.m38471a();
        }
    }

    public static boolean m13810h(C4458i iVar, String str) {
        try {
            Class<?> cls = Class.forName(str);
            for (AbstractC4454e eVar : iVar.m27590r()) {
                if (cls.isAssignableFrom(eVar.getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    public boolean m13817a() {
        WorkDatabase s = this.f26043a.m27618g().m27589s();
        s.m8731c();
        try {
            boolean e = m13813e(this.f26043a);
            s.m8714t();
            return e;
        } finally {
            s.m8727g();
        }
    }

    public AbstractC4239m m13814d() {
        return this.f26044b;
    }

    public void m13812f() {
        C4458i g = this.f26043a.m27618g();
        C4455f.m27626b(g.m27595m(), g.m27589s(), g.m27590r());
    }

    @Override
    public void run() {
        try {
            if (!this.f26043a.m27617h()) {
                if (m13817a()) {
                    C8000e.m13803a(this.f26043a.m27618g().m27596l(), RescheduleReceiver.class, true);
                    m13812f();
                }
                this.f26044b.m27640a(AbstractC4239m.f14285a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f26043a));
        } catch (Throwable th) {
            this.f26044b.m27640a(new AbstractC4239m.AbstractC4241b.C4242a(th));
        }
    }
}

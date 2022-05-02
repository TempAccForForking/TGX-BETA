package p148k5;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p118i5.C5217a;
import p118i5.C5219c;
import p118i5.C5220d;
import p133j5.AbstractC5864e;
import p133j5.AbstractC5867f;
import p133j5.C5850a;
import p133j5.C5850a.AbstractC5854d;
import p133j5.C5881p;
import p143k0.C6024a;
import p148k5.C6120i;
import p163l5.C6360l0;
import p163l5.C6374q;
import p163l5.C6378r;
import p177m6.C6777m;
import p188n5.C7247e;
import p232q5.C8242b;

public final class C6093c1<O extends C5850a.AbstractC5854d> implements AbstractC5867f.AbstractC5869b, AbstractC5867f.AbstractC5870c, AbstractC6084a3 {
    @NotOnlyInitialized
    public final C5850a.AbstractC5859f f19330b;
    public final C6085b<O> f19331c;
    public final int f19335g;
    public final BinderC6088b2 f19336h;
    public boolean f19337i;
    public final C6106f f19341m;
    public final Queue<AbstractC6154p2> f19329a = new LinkedList();
    public final Set<C6167s2> f19333e = new HashSet();
    public final Map<C6120i.C6121a<?>, C6166s1> f19334f = new HashMap();
    public final List<C6098d1> f19338j = new ArrayList();
    public C5217a f19339k = null;
    public int f19340l = 0;
    public final C6172u f19332d = new C6172u();

    public C6093c1(C6106f fVar, AbstractC5864e<O> eVar) {
        Handler handler;
        Context context;
        Handler handler2;
        this.f19341m = fVar;
        handler = fVar.f19382Y;
        C5850a.AbstractC5859f n = eVar.m21915n(handler.getLooper(), this);
        this.f19330b = n;
        this.f19331c = eVar.m21919j();
        this.f19335g = eVar.m21914o();
        if (n.mo20627t()) {
            context = fVar.f19373P;
            handler2 = fVar.f19382Y;
            this.f19336h = eVar.m21913p(context, handler2);
            return;
        }
        this.f19336h = null;
    }

    public static void m21365K(C6093c1 c1Var, C6098d1 d1Var) {
        if (!c1Var.f19338j.contains(d1Var) || c1Var.f19337i) {
            return;
        }
        if (!c1Var.f19330b.mo21251a()) {
            c1Var.m21373C();
        } else {
            c1Var.m21355e();
        }
    }

    public static void m21364L(C6093c1 c1Var, C6098d1 d1Var) {
        Handler handler;
        Handler handler2;
        C5219c cVar;
        C5219c[] f;
        if (c1Var.f19338j.remove(d1Var)) {
            handler = c1Var.f19341m.f19382Y;
            handler.removeMessages(15, d1Var);
            handler2 = c1Var.f19341m.f19382Y;
            handler2.removeMessages(16, d1Var);
            cVar = d1Var.f19346b;
            ArrayList arrayList = new ArrayList(c1Var.f19329a.size());
            for (AbstractC6154p2 p2Var : c1Var.f19329a) {
                if ((p2Var instanceof AbstractC6153p1) && (f = ((AbstractC6153p1) p2Var).mo21187f(c1Var)) != null && C8242b.m13054b(f, cVar)) {
                    arrayList.add(p2Var);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AbstractC6154p2 p2Var2 = (AbstractC6154p2) arrayList.get(i);
                c1Var.f19329a.remove(p2Var2);
                p2Var2.mo21184b(new C5881p(cVar));
            }
        }
    }

    public final void m21375A() {
        Handler handler;
        C5220d dVar;
        Context context;
        Status status;
        handler = this.f19341m.f19382Y;
        C6378r.m20514d(handler);
        if (this.f19337i) {
            m21350j();
            dVar = this.f19341m.f19374Q;
            context = this.f19341m.f19373P;
            if (dVar.mo23586i(context) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            m21351i(status);
            this.f19330b.mo21248e("Timing out connection while resuming.");
        }
    }

    public final boolean m21374B() {
        return m21348l(true);
    }

    public final void m21373C() {
        Handler handler;
        C6360l0 l0Var;
        Context context;
        handler = this.f19341m.f19382Y;
        C6378r.m20514d(handler);
        if (!this.f19330b.mo21251a() && !this.f19330b.mo21247g()) {
            try {
                l0Var = this.f19341m.f19375R;
                context = this.f19341m.f19373P;
                int a = l0Var.m20555a(context, this.f19330b);
                if (a != 0) {
                    C5217a aVar = new C5217a(a, null);
                    String name = this.f19330b.getClass().getName();
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb2 = new StringBuilder(name.length() + 35 + valueOf.length());
                    sb2.append("The service for ");
                    sb2.append(name);
                    sb2.append(" is not available: ");
                    sb2.append(valueOf);
                    Log.w("GoogleApiManager", sb2.toString());
                    m21344p(aVar, null);
                    return;
                }
                C6108f1 f1Var = new C6108f1(this.f19341m, this.f19330b, this.f19331c);
                if (this.f19330b.mo20627t()) {
                    ((BinderC6088b2) C6378r.m20507k(this.f19336h)).m21386H1(f1Var);
                }
                try {
                    this.f19330b.mo21245i(f1Var);
                } catch (SecurityException e) {
                    m21344p(new C5217a(10), e);
                }
            } catch (IllegalStateException e2) {
                m21344p(new C5217a(10), e2);
            }
        }
    }

    public final void m21372D(C6167s2 s2Var) {
        Handler handler;
        handler = this.f19341m.f19382Y;
        C6378r.m20514d(handler);
        this.f19333e.add(s2Var);
    }

    public final boolean m21371E() {
        return this.f19330b.mo21251a();
    }

    @Override
    public final void mo21120E0(C5217a aVar, C5850a<?> aVar2, boolean z) {
        throw null;
    }

    public final boolean m21370F() {
        return this.f19330b.mo20627t();
    }

    public final int m21369G() {
        return this.f19335g;
    }

    public final int m21368H() {
        return this.f19340l;
    }

    public final void m21367I() {
        this.f19340l++;
    }

    public final void m21358b() {
        m21339x();
        m21347m(C5217a.f17353N);
        m21350j();
        Iterator<C6166s1> it = this.f19334f.values().iterator();
        while (it.hasNext()) {
            C6166s1 next = it.next();
            if (m21346n(next.f19539a.m21202c()) != null) {
                it.remove();
            } else {
                try {
                    next.f19539a.mo21103d(this.f19330b, new C6777m<>());
                } catch (DeadObjectException unused) {
                    mo21081q(3);
                    this.f19330b.mo21248e("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        m21355e();
        m21349k();
    }

    public final void m21357c(int i) {
        Handler handler;
        Handler handler2;
        long j;
        Handler handler3;
        Handler handler4;
        long j2;
        C6360l0 l0Var;
        m21339x();
        this.f19337i = true;
        this.f19332d.m21124e(i, this.f19330b.mo21240r());
        handler = this.f19341m.f19382Y;
        handler2 = this.f19341m.f19382Y;
        Message obtain = Message.obtain(handler2, 9, this.f19331c);
        j = this.f19341m.f19384a;
        handler.sendMessageDelayed(obtain, j);
        handler3 = this.f19341m.f19382Y;
        handler4 = this.f19341m.f19382Y;
        Message obtain2 = Message.obtain(handler4, 11, this.f19331c);
        j2 = this.f19341m.f19385b;
        handler3.sendMessageDelayed(obtain2, j2);
        l0Var = this.f19341m.f19375R;
        l0Var.m20553c();
        for (C6166s1 s1Var : this.f19334f.values()) {
            s1Var.f19541c.run();
        }
    }

    public final boolean m21356d(C5217a aVar) {
        Object obj;
        C6176v unused;
        obj = C6106f.f19368c0;
        synchronized (obj) {
            unused = this.f19341m.f19379V;
        }
        return false;
    }

    public final void m21355e() {
        ArrayList arrayList = new ArrayList(this.f19329a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC6154p2 p2Var = (AbstractC6154p2) arrayList.get(i);
            if (this.f19330b.mo21251a()) {
                if (m21354f(p2Var)) {
                    this.f19329a.remove(p2Var);
                }
            } else {
                return;
            }
        }
    }

    public final boolean m21354f(AbstractC6154p2 p2Var) {
        boolean z;
        Handler handler;
        Handler handler2;
        long j;
        Handler handler3;
        Handler handler4;
        long j2;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        long j3;
        if (!(p2Var instanceof AbstractC6153p1)) {
            m21353g(p2Var);
            return true;
        }
        AbstractC6153p1 p1Var = (AbstractC6153p1) p2Var;
        C5219c n = m21346n(p1Var.mo21187f(this));
        if (n == null) {
            m21353g(p2Var);
            return true;
        }
        String name = this.f19330b.getClass().getName();
        String b = n.m23609b();
        long c = n.m23608c();
        StringBuilder sb2 = new StringBuilder(name.length() + 77 + String.valueOf(b).length());
        sb2.append(name);
        sb2.append(" could not execute call because it requires feature (");
        sb2.append(b);
        sb2.append(", ");
        sb2.append(c);
        sb2.append(").");
        Log.w("GoogleApiManager", sb2.toString());
        z = this.f19341m.f19383Z;
        if (!z || !p1Var.mo21186g(this)) {
            p1Var.mo21184b(new C5881p(n));
            return true;
        }
        C6098d1 d1Var = new C6098d1(this.f19331c, n, null);
        int indexOf = this.f19338j.indexOf(d1Var);
        if (indexOf >= 0) {
            C6098d1 d1Var2 = this.f19338j.get(indexOf);
            handler5 = this.f19341m.f19382Y;
            handler5.removeMessages(15, d1Var2);
            handler6 = this.f19341m.f19382Y;
            handler7 = this.f19341m.f19382Y;
            Message obtain = Message.obtain(handler7, 15, d1Var2);
            j3 = this.f19341m.f19384a;
            handler6.sendMessageDelayed(obtain, j3);
            return false;
        }
        this.f19338j.add(d1Var);
        handler = this.f19341m.f19382Y;
        handler2 = this.f19341m.f19382Y;
        Message obtain2 = Message.obtain(handler2, 15, d1Var);
        j = this.f19341m.f19384a;
        handler.sendMessageDelayed(obtain2, j);
        handler3 = this.f19341m.f19382Y;
        handler4 = this.f19341m.f19382Y;
        Message obtain3 = Message.obtain(handler4, 16, d1Var);
        j2 = this.f19341m.f19385b;
        handler3.sendMessageDelayed(obtain3, j2);
        C5217a aVar = new C5217a(2, null);
        if (m21356d(aVar)) {
            return false;
        }
        this.f19341m.m21287w(aVar, this.f19335g);
        return false;
    }

    public final void m21353g(AbstractC6154p2 p2Var) {
        p2Var.mo21183c(this.f19332d, m21370F());
        try {
            p2Var.mo21182d(this);
        } catch (DeadObjectException unused) {
            mo21081q(1);
            this.f19330b.mo21248e("DeadObjectException thrown while running ApiCallRunner.");
        } catch (Throwable th) {
            throw new IllegalStateException(String.format("Error in GoogleApi implementation for client %s.", this.f19330b.getClass().getName()), th);
        }
    }

    public final void m21352h(Status status, Exception exc, boolean z) {
        Handler handler;
        handler = this.f19341m.f19382Y;
        C6378r.m20514d(handler);
        boolean z2 = false;
        boolean z3 = status == null;
        if (exc == null) {
            z2 = true;
        }
        if (z3 != z2) {
            Iterator<AbstractC6154p2> it = this.f19329a.iterator();
            while (it.hasNext()) {
                AbstractC6154p2 next = it.next();
                if (!z || next.f19497a == 2) {
                    if (status != null) {
                        next.mo21185a(status);
                    } else {
                        next.mo21184b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    public final void m21351i(Status status) {
        Handler handler;
        handler = this.f19341m.f19382Y;
        C6378r.m20514d(handler);
        m21352h(status, null, false);
    }

    public final void m21350j() {
        Handler handler;
        Handler handler2;
        if (this.f19337i) {
            handler = this.f19341m.f19382Y;
            handler.removeMessages(11, this.f19331c);
            handler2 = this.f19341m.f19382Y;
            handler2.removeMessages(9, this.f19331c);
            this.f19337i = false;
        }
    }

    public final void m21349k() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j;
        handler = this.f19341m.f19382Y;
        handler.removeMessages(12, this.f19331c);
        handler2 = this.f19341m.f19382Y;
        handler3 = this.f19341m.f19382Y;
        Message obtainMessage = handler3.obtainMessage(12, this.f19331c);
        j = this.f19341m.f19386c;
        handler2.sendMessageDelayed(obtainMessage, j);
    }

    public final boolean m21348l(boolean z) {
        Handler handler;
        handler = this.f19341m.f19382Y;
        C6378r.m20514d(handler);
        if (!this.f19330b.mo21251a() || this.f19334f.size() != 0) {
            return false;
        }
        if (this.f19332d.m21126c()) {
            if (z) {
                m21349k();
            }
            return false;
        }
        this.f19330b.mo21248e("Timing out service connection.");
        return true;
    }

    public final void m21347m(C5217a aVar) {
        for (C6167s2 s2Var : this.f19333e) {
            s2Var.m21132b(this.f19331c, aVar, C6374q.m20525a(aVar, C5217a.f17353N) ? this.f19330b.mo21246h() : null);
        }
        this.f19333e.clear();
    }

    public final C5219c m21346n(C5219c[] cVarArr) {
        if (!(cVarArr == null || cVarArr.length == 0)) {
            C5219c[] q = this.f19330b.mo21241q();
            if (q == null) {
                q = new C5219c[0];
            }
            C6024a aVar = new C6024a(q.length);
            for (C5219c cVar : q) {
                aVar.put(cVar.m23609b(), Long.valueOf(cVar.m23608c()));
            }
            for (C5219c cVar2 : cVarArr) {
                Long l = (Long) aVar.get(cVar2.m23609b());
                if (l == null || l.longValue() < cVar2.m23608c()) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    public final void m21345o(C5217a aVar) {
        Handler handler;
        handler = this.f19341m.f19382Y;
        C6378r.m20514d(handler);
        C5850a.AbstractC5859f fVar = this.f19330b;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(aVar);
        StringBuilder sb2 = new StringBuilder(name.length() + 25 + valueOf.length());
        sb2.append("onSignInFailed for ");
        sb2.append(name);
        sb2.append(" with ");
        sb2.append(valueOf);
        fVar.mo21248e(sb2.toString());
        m21344p(aVar, null);
    }

    public final void m21344p(C5217a aVar, Exception exc) {
        Handler handler;
        C6360l0 l0Var;
        boolean z;
        Status j;
        Status j2;
        Status j3;
        Handler handler2;
        Handler handler3;
        long j4;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.f19341m.f19382Y;
        C6378r.m20514d(handler);
        BinderC6088b2 b2Var = this.f19336h;
        if (b2Var != null) {
            b2Var.m21385I1();
        }
        m21339x();
        l0Var = this.f19341m.f19375R;
        l0Var.m20553c();
        m21347m(aVar);
        if ((this.f19330b instanceof C7247e) && aVar.m23616b() != 24) {
            this.f19341m.f19370M = true;
            handler5 = this.f19341m.f19382Y;
            handler6 = this.f19341m.f19382Y;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), 300000L);
        }
        if (aVar.m23616b() == 4) {
            status = C6106f.f19367b0;
            m21351i(status);
        } else if (this.f19329a.isEmpty()) {
            this.f19339k = aVar;
        } else if (exc != null) {
            handler4 = this.f19341m.f19382Y;
            C6378r.m20514d(handler4);
            m21352h(null, exc, false);
        } else {
            z = this.f19341m.f19383Z;
            if (z) {
                j2 = C6106f.m21300j(this.f19331c, aVar);
                m21352h(j2, null, true);
                if (!this.f19329a.isEmpty() && !m21356d(aVar) && !this.f19341m.m21287w(aVar, this.f19335g)) {
                    if (aVar.m23616b() == 18) {
                        this.f19337i = true;
                    }
                    if (this.f19337i) {
                        handler2 = this.f19341m.f19382Y;
                        handler3 = this.f19341m.f19382Y;
                        Message obtain = Message.obtain(handler3, 9, this.f19331c);
                        j4 = this.f19341m.f19384a;
                        handler2.sendMessageDelayed(obtain, j4);
                        return;
                    }
                    j3 = C6106f.m21300j(this.f19331c, aVar);
                    m21351i(j3);
                    return;
                }
                return;
            }
            j = C6106f.m21300j(this.f19331c, aVar);
            m21351i(j);
        }
    }

    @Override
    public final void mo21081q(int i) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f19341m.f19382Y;
        if (myLooper == handler.getLooper()) {
            m21357c(i);
            return;
        }
        handler2 = this.f19341m.f19382Y;
        handler2.post(new RunnableC6193z0(this, i));
    }

    public final void m21343r(AbstractC6154p2 p2Var) {
        Handler handler;
        handler = this.f19341m.f19382Y;
        C6378r.m20514d(handler);
        if (!this.f19330b.mo21251a()) {
            this.f19329a.add(p2Var);
            C5217a aVar = this.f19339k;
            if (aVar == null || !aVar.m23613e()) {
                m21373C();
            } else {
                m21344p(this.f19339k, null);
            }
        } else if (m21354f(p2Var)) {
            m21349k();
        } else {
            this.f19329a.add(p2Var);
        }
    }

    @Override
    public final void mo11483s(C5217a aVar) {
        m21344p(aVar, null);
    }

    @Override
    public final void mo21080t(Bundle bundle) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f19341m.f19382Y;
        if (myLooper == handler.getLooper()) {
            m21358b();
            return;
        }
        handler2 = this.f19341m.f19382Y;
        handler2.post(new RunnableC6189y0(this));
    }

    public final void m21342u() {
        Handler handler;
        handler = this.f19341m.f19382Y;
        C6378r.m20514d(handler);
        m21351i(C6106f.f19366a0);
        this.f19332d.m21125d();
        for (C6120i.C6121a aVar : (C6120i.C6121a[]) this.f19334f.keySet().toArray(new C6120i.C6121a[0])) {
            m21343r(new C6150o2(aVar, new C6777m()));
        }
        m21347m(new C5217a(4));
        if (this.f19330b.mo21251a()) {
            this.f19330b.mo21238u(new C6087b1(this));
        }
    }

    public final C5850a.AbstractC5859f m21341v() {
        return this.f19330b;
    }

    public final Map<C6120i.C6121a<?>, C6166s1> m21340w() {
        return this.f19334f;
    }

    public final void m21339x() {
        Handler handler;
        handler = this.f19341m.f19382Y;
        C6378r.m20514d(handler);
        this.f19339k = null;
    }

    public final C5217a m21338y() {
        Handler handler;
        handler = this.f19341m.f19382Y;
        C6378r.m20514d(handler);
        return this.f19339k;
    }

    public final void m21337z() {
        Handler handler;
        handler = this.f19341m.f19382Y;
        C6378r.m20514d(handler);
        if (this.f19337i) {
            m21373C();
        }
    }
}

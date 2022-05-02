package org.thunderdog.challegram;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import be.C1357a0;
import be.C1379j0;
import be.C1399s0;
import ge.C4868i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import me.C6847b2;
import me.C6924j2;
import me.C6941k2;
import me.C6984o1;
import me.RunnableC7091z1;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.C7903b;
import org.thunderdog.challegram.MainActivity;
import p037cb.C2057b;
import p037cb.C2059c;
import p038ce.C2523i5;
import p038ce.C2536ii;
import p038ce.C2546iq;
import p038ce.C2760nb;
import p038ce.C2793nv;
import p038ce.C2964ra;
import p038ce.C3034s5;
import p038ce.RunnableC2425ga;
import p038ce.View$OnClickListenerC2118a7;
import p038ce.View$OnClickListenerC2162b;
import p038ce.View$OnClickListenerC2192bl;
import p038ce.View$OnClickListenerC2204bu;
import p038ce.View$OnClickListenerC2359ew;
import p038ce.View$OnClickListenerC2364ez;
import p038ce.View$OnClickListenerC2393fk;
import p038ce.View$OnClickListenerC2665lj;
import p038ce.View$OnClickListenerC2667lk;
import p038ce.View$OnClickListenerC2942qs;
import p038ce.View$OnClickListenerC2971rh;
import p038ce.View$OnClickListenerC3062so;
import p038ce.View$OnClickListenerC3209vr;
import p038ce.View$OnClickListenerC3217vt;
import p038ce.View$OnClickListenerC3222vw;
import p038ce.View$OnClickListenerC3415zw;
import p051db.C3940f;
import p051db.C3950k;
import p082fd.C4383l;
import p082fd.C4403w;
import p108hb.C5062b;
import p108hb.C5070i;
import p139jb.AbstractC5912d;
import p139jb.AbstractC5918j;
import p141jd.C5974t0;
import p143k0.C6038h;
import p168ld.C6522y;
import p193nb.C7319d;
import p335xd.C10192g;
import p350yd.AbstractC11030u0;
import p350yd.C10534a9;
import p350yd.C10536ab;
import p350yd.C10651f1;
import p350yd.C10930q6;
import p350yd.C11008t0;
import p350yd.C11131y6;
import p350yd.HandlerC10770jj;
import p364zd.C11524j;
import td.AbstractC9323v4;
import td.C9180e2;
import td.C9188f2;
import td.C9270q1;
import td.C9312u1;

public class MainActivity extends AbstractView$OnTouchListenerC7889a implements AbstractC11030u0 {
    public Bundle f25463Q1;
    public C11131y6 f25464R1;
    public Handler f25465S1;
    public C3940f f25466T1;
    public ViewGroup f25467U1;
    public final C6038h<View$OnClickListenerC2971rh> f25468V1 = new C6038h<>();
    public boolean f25469W1;

    public class C7882a implements C3950k.AbstractC3952b {
        public C7882a() {
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            if (MainActivity.this.f25467U1 != null) {
                boolean z = false;
                C6984o1 o1Var = (C6984o1) MainActivity.this.f25467U1.getChildAt(0);
                if (f > 0.0f) {
                    z = true;
                }
                o1Var.setLooping(z);
                MainActivity.this.f25467U1.setAlpha(f);
            }
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
            if (f == 0.0f && MainActivity.this.f25467U1 != null) {
                ((C6984o1) MainActivity.this.f25467U1.getChildAt(0)).setLooping(false);
                MainActivity mainActivity = MainActivity.this;
                mainActivity.f25522V.removeView(mainActivity.f25467U1);
                MainActivity.this.f25467U1 = null;
            }
        }
    }

    public class C7883b implements AbstractView$OnTouchListenerC7889a.AbstractC7900k {
        public final String f25471a;
        public final Intent f25472b;

        public C7883b(String str, Intent intent) {
            this.f25471a = str;
            this.f25472b = intent;
        }

        @Override
        public void mo7703f(AbstractView$OnTouchListenerC7889a aVar, boolean z) {
            if (!z) {
                MainActivity.this.m14626w4(this.f25471a, this.f25472b, false);
                MainActivity.this.m14412y2(this);
            }
        }
    }

    public class C7884c implements AbstractView$OnTouchListenerC7889a.AbstractC7900k {
        public final String f25474a;
        public final Intent f25475b;

        public C7884c(String str, Intent intent) {
            this.f25474a = str;
            this.f25475b = intent;
        }

        @Override
        public void mo7703f(AbstractView$OnTouchListenerC7889a aVar, boolean z) {
            if (!z) {
                MainActivity.this.m14626w4(this.f25474a, this.f25475b, false);
                MainActivity.this.m14412y2(this);
            }
        }
    }

    public class C7885d implements AbstractC9323v4.AbstractC9337n {
        public C7885d() {
        }

        @Override
        public void mo3907a(View view, int i, C2964ra raVar, TextView textView, C2546iq iqVar) {
            int A = raVar.m32879A();
            if (A == 12 || A == 69) {
                boolean D = raVar.m32876D();
                List<C2964ra> F0 = iqVar.m34243F0();
                int i2 = 0;
                if (raVar.m32838j() == R.id.btn_selectAll) {
                    for (C2964ra raVar2 : F0) {
                        if (raVar2.m32879A() == 69 && raVar2.m32876D() != D) {
                            raVar2.m32861S(D);
                            iqVar.m34127u3(i2);
                        }
                        i2++;
                    }
                } else if (D) {
                    Iterator<C2964ra> it = F0.iterator();
                    int i3 = 0;
                    int i4 = -1;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = 1;
                            break;
                        }
                        C2964ra next = it.next();
                        if (next.m32838j() == R.id.btn_selectAll) {
                            i4 = i3;
                        }
                        if (next.m32879A() == 69 && !next.m32876D()) {
                            break;
                        }
                        i3++;
                    }
                    if (!(i2 == 0 || i4 == -1 || F0.get(i4).m32876D())) {
                        F0.get(i4).m32861S(true);
                        iqVar.m34127u3(i4);
                    }
                } else {
                    int i5 = 0;
                    for (C2964ra raVar3 : F0) {
                        if (raVar3.m32838j() != R.id.btn_selectAll) {
                            i5++;
                        } else if (raVar3.m32876D()) {
                            raVar3.m32861S(false);
                            iqVar.m34127u3(i5);
                            return;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    public class C7886e implements AbstractC11030u0 {
        public final C9180e2 f25478a;

        public C7886e(C9180e2 e2Var) {
            this.f25478a = e2Var;
        }

        @Override
        public void mo61C4(C11131y6 y6Var, int i, int i2) {
            C11008t0.m1997e(this, y6Var, i, i2);
        }

        @Override
        public void mo56G2(C11131y6 y6Var, TdApi.AuthorizationState authorizationState, int i) {
            C11008t0.m1995g(this, y6Var, authorizationState, i);
        }

        @Override
        public void mo48O(C11131y6 y6Var, boolean z, boolean z2) {
            C11008t0.m2000b(this, y6Var, z, z2);
        }

        @Override
        public void mo47O6(C10930q6 q6Var, boolean z) {
            C11008t0.m1994h(this, q6Var, z);
        }

        @Override
        public void mo29b1(C11131y6 y6Var, int i) {
            C11008t0.m1996f(this, y6Var, i);
        }

        @Override
        public void mo12p4(C11131y6 y6Var, TdApi.User user, boolean z, boolean z2) {
            int L0;
            C2546iq iqVar = this.f25478a.f29640a;
            if (iqVar != null && (L0 = iqVar.m34231L0(y6Var)) != -1) {
                this.f25478a.f29640a.m39315I(L0);
            }
        }

        @Override
        public void mo11p6(C11131y6 y6Var, int i) {
            C11008t0.m1998d(this, y6Var, i);
        }

        @Override
        public void mo4v4(C11131y6 y6Var, TdApi.User user, int i, C11131y6 y6Var2) {
            C11008t0.m1999c(this, y6Var, user, i, y6Var2);
        }
    }

    public class C7887f implements C9312u1.AbstractC9313a {
        public final int f25480a;
        public final int f25481b;
        public final Intent f25482c;

        public C7887f(int i, int i2, Intent intent) {
            this.f25480a = i;
            this.f25481b = i2;
            this.f25482c = intent;
        }

        @Override
        public void mo9486a(C9312u1 u1Var) {
            if (!u1Var.m9496q()) {
                u1Var.m9490w(this);
                MainActivity.super.onActivityResult(this.f25480a, this.f25481b, this.f25482c);
            }
        }
    }

    public static <T extends AbstractC9323v4<?>> boolean m14699F4(T t) {
        return t.mo9271db();
    }

    public void m14698G4(final String str, final C11131y6 y6Var) {
        if (this.f25526X.m9762F() != null) {
            y6Var.mo1480c().m2573Y1(new Runnable() {
                @Override
                public final void run() {
                    MainActivity.this.m14694L4(y6Var, str);
                }
            });
        }
    }

    public void m14697H4(C10930q6 q6Var) {
        m14652g5(q6Var.m2188w6());
        q6Var.m2818I4();
    }

    public void m14696I4(final C10930q6 q6Var) {
        q6Var.m2880E6();
        this.f25465S1.post(new Runnable() {
            @Override
            public final void run() {
                MainActivity.this.m14697H4(q6Var);
            }
        });
    }

    public void m14694L4(C11131y6 y6Var, String str) {
        y6Var.mo1480c().m2485dd().m3868D7(new C10534a9(this, this.f25552k0), str, null, null);
    }

    public static void m14692M4(AtomicBoolean atomicBoolean, C10930q6 q6Var) {
        if (q6Var.m2398j4(atomicBoolean.get(), false)) {
            atomicBoolean.set(true);
        }
        C6522y.m20164n().m20169i();
    }

    public static void m14690N4(C10930q6 q6Var) {
        long b3 = C4868i.m24727c2().m24734b3();
        C7903b.C7904a.m14398a(b3, q6Var.m2188w6(), "Syncing other accounts, since user launched the app.", new Object[0]);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(q6Var.m2398j4(false, false));
        C10536ab.m4667o1().m4710c3(b3, -1, null, false, false, 3, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                MainActivity.m14692M4(atomicBoolean, (C10930q6) obj);
            }
        });
    }

    public void m14688O4() {
        if (C2059c.m35734a(this)) {
            C4868i.m24727c2().m24607r2();
        }
    }

    public void m14686P4(C10930q6 q6Var) {
        if (m14409z0() == q6Var && !q6Var.m2538a7()) {
            m14630s5(false);
        }
    }

    public void m14684Q4(final C10930q6 q6Var) {
        this.f25465S1.post(new Runnable() {
            @Override
            public final void run() {
                MainActivity.this.m14686P4(q6Var);
            }
        });
    }

    public void m14682R4(final C10930q6 q6Var, boolean z) {
        if (m14409z0() != q6Var) {
            return;
        }
        if (z) {
            m14630s5(true);
        } else {
            q6Var.m2573Y1(new Runnable() {
                @Override
                public final void run() {
                    MainActivity.this.m14684Q4(q6Var);
                }
            });
        }
    }

    public void m14680S4(C11131y6 y6Var) {
        new C5974t0(this, y6Var.mo1480c(), 0L, 0L, null, false, null).m21734v().m21766Q(true).m21740o();
    }

    public void m14678T4(final C11131y6 y6Var) {
        this.f25465S1.post(new Runnable() {
            @Override
            public final void run() {
                MainActivity.this.m14680S4(y6Var);
            }
        });
    }

    public void m14676U4(final C11131y6 y6Var) {
        y6Var.mo1480c().m2573Y1(new Runnable() {
            @Override
            public final void run() {
                MainActivity.this.m14678T4(y6Var);
            }
        });
    }

    public void m14674V4(final C10930q6 q6Var, long j, long j2) {
        C10534a9 a9Var = new C10534a9(this, q6Var);
        HandlerC10770jj.C10780j jVar = new HandlerC10770jj.C10780j();
        Objects.requireNonNull(q6Var);
        HandlerC10770jj.C10780j j3 = jVar.m3366j(new Runnable() {
            @Override
            public final void run() {
                C10930q6.this.m2818I4();
            }
        });
        if (j != 0) {
            j3.m3371e(new C7319d(j2, j));
        }
        q6Var.m2485dd().m3569h7(a9Var, j2, j3);
    }

    public void m14672W4(final C10930q6 q6Var, final long j, final long j2) {
        q6Var.m2880E6();
        this.f25465S1.post(new Runnable() {
            @Override
            public final void run() {
                MainActivity.this.m14674V4(q6Var, j, j2);
            }
        });
    }

    public static void m14670X4(AbstractC5918j jVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jVar.mo1330a((C11131y6) it.next());
        }
    }

    public static boolean m14668Y4(SparseIntArray sparseIntArray, C11131y6 y6Var) {
        return sparseIntArray.get(y6Var.f35708b + 1) == y6Var.f35708b + 1;
    }

    public static boolean m14666Z4(int i, C11131y6 y6Var) {
        return y6Var.f35708b == i;
    }

    public static void m14664a5(boolean z, List list, AbstractC5918j jVar, int i, final SparseIntArray sparseIntArray) {
        List list2;
        if (z) {
            list2 = C5062b.m24158o(list, new AbstractC5912d() {
                @Override
                public final boolean mo1511a(Object obj) {
                    boolean Y4;
                    Y4 = MainActivity.m14668Y4(sparseIntArray, (C11131y6) obj);
                    return Y4;
                }
            });
        } else {
            final int i2 = sparseIntArray.get(R.id.account) - 1;
            list2 = C5062b.m24158o(list, new AbstractC5912d() {
                @Override
                public final boolean mo1511a(Object obj) {
                    boolean Z4;
                    Z4 = MainActivity.m14666Z4(i2, (C11131y6) obj);
                    return Z4;
                }
            });
        }
        if (!list2.isEmpty()) {
            jVar.mo1330a(list2);
        }
    }

    public static void m14662b5(AtomicReference atomicReference, AtomicBoolean atomicBoolean, C6924j2 j2Var) {
        if (atomicReference.get() != null) {
            C10536ab.m4667o1().m4716b1().m1531x((AbstractC11030u0) atomicReference.get());
            atomicBoolean.set(false);
        }
    }

    public static String m14660c5(int i) {
        return "nav_item_" + i;
    }

    public static boolean m14641m4(int i, AbstractC9323v4<?> v4Var) {
        switch (i) {
            case R.id.controller_fontSize:
            case R.id.controller_settings:
            case R.id.controller_storageSettings:
            case R.id.controller_wallpaper:
                return true;
            default:
                return false;
        }
    }

    public static AbstractC9323v4<?> m14634q5(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, int i, Bundle bundle, String str) {
        AbstractC9323v4<?> v4Var;
        switch (i) {
            case R.id.controller_chatSettings:
                v4Var = new View$OnClickListenerC2204bu(aVar, q6Var);
                break;
            case R.id.controller_fontSize:
            case R.id.controller_wallpaper:
                View$OnClickListenerC2971rh rhVar = new View$OnClickListenerC2971rh(aVar, q6Var);
                rhVar.m32667Lp(new View$OnClickListenerC2971rh.C2977c0(i == R.id.controller_fontSize ? 2 : 1, null, null));
                return rhVar;
            case R.id.controller_messages:
                v4Var = new View$OnClickListenerC2971rh(aVar, q6Var);
                break;
            case R.id.controller_networkStats:
                v4Var = new C2793nv(aVar, q6Var);
                break;
            case R.id.controller_newChannel:
                v4Var = new C2523i5(aVar, q6Var);
                break;
            case R.id.controller_newGroup:
                v4Var = new C3034s5(aVar, q6Var);
                break;
            case R.id.controller_notificationSettings:
                v4Var = new View$OnClickListenerC2359ew(aVar, q6Var);
                break;
            case R.id.controller_passcode:
                v4Var = new C2536ii(aVar, q6Var);
                break;
            case R.id.controller_privacyException:
                v4Var = new View$OnClickListenerC2192bl(aVar, q6Var);
                break;
            case R.id.controller_privacyKey:
                v4Var = new View$OnClickListenerC3415zw(aVar, q6Var);
                break;
            case R.id.controller_privacySettings:
                v4Var = new View$OnClickListenerC3222vw(aVar, q6Var);
                break;
            case R.id.controller_profile:
                v4Var = new View$OnClickListenerC3062so(aVar, q6Var);
                break;
            case R.id.controller_settings:
                return new View$OnClickListenerC3217vt(aVar, q6Var);
            case R.id.controller_storageSettings:
                return new View$OnClickListenerC2942qs(aVar, q6Var);
            case R.id.controller_themeSettings:
                v4Var = new View$OnClickListenerC2364ez(aVar, q6Var);
                break;
            default:
                return null;
        }
        if (!v4Var.mo9165sd(bundle, str)) {
            return null;
        }
        if ((v4Var instanceof C2536ii) || v4Var.mo9464C9() == 0 || !q6Var.m2300p6(v4Var.mo9464C9())) {
            return v4Var;
        }
        if (!(v4Var instanceof View$OnClickListenerC2971rh)) {
            return null;
        }
        C2536ii iiVar = new C2536ii(aVar, q6Var);
        TdApi.Chat L3 = q6Var.m2771L3(v4Var.mo9464C9());
        iiVar.m34316Ef(new C2536ii.C2538b(L3, q6Var.m2175x3(L3), null));
        return iiVar;
    }

    public final void m14703A4(C10930q6 q6Var, String str, Intent intent) {
        C2760nb nbVar = new C2760nb(this, this.f25464R1.mo1480c());
        if (intent != null) {
            nbVar.m33580Rh(q6Var, str, intent);
        }
        m14701D4(nbVar);
    }

    public final void m14702B4() {
        AbstractC9323v4<?> t4 = m14629t4(this.f25464R1.mo1480c());
        if (t4 != null) {
            this.f25526X.m9743Q(t4);
            this.f25526X.m9742R(new View$OnClickListenerC2393fk(this, this.f25464R1.mo1480c()), 0);
        } else if (RunnableC2425ga.m34620Df()) {
            this.f25526X.m9743Q(new View$OnClickListenerC2393fk(this, this.f25464R1.mo1480c()));
        } else {
            this.f25526X.m9743Q(new RunnableC2425ga(this));
        }
    }

    @Override
    public void mo61C4(C11131y6 y6Var, int i, int i2) {
        C11008t0.m1997e(this, y6Var, i, i2);
    }

    public final void m14701D4(C2760nb nbVar) {
        this.f25526X.m9743Q(nbVar);
    }

    public final void m14700E4() {
        C2760nb nbVar = new C2760nb(this, this.f25464R1.mo1480c());
        nbVar.get();
        this.f25526X.m9742R(nbVar, 0);
    }

    @Override
    public void mo56G2(C11131y6 y6Var, TdApi.AuthorizationState authorizationState, int i) {
        m14638n5(y6Var, authorizationState, i);
    }

    @Override
    public void mo48O(C11131y6 y6Var, boolean z, boolean z2) {
        C11008t0.m2000b(this, y6Var, z, z2);
    }

    @Override
    public void mo47O6(final C10930q6 q6Var, final boolean z) {
        this.f25465S1.post(new Runnable() {
            @Override
            public final void run() {
                MainActivity.this.m14682R4(q6Var, z);
            }
        });
    }

    @Override
    public boolean mo14547Q1() {
        return true;
    }

    @Override
    public void mo14511a2() {
        m14630s5(m14409z0().m2538a7());
    }

    @Override
    public void mo29b1(C11131y6 y6Var, int i) {
        C11008t0.m1996f(this, y6Var, i);
    }

    public void m14658d5(AbstractC9323v4<?> v4Var) {
        if (m14450q1()) {
            v4Var.get();
            v4Var.mo417Z8();
        } else if (this.f25526X.m9736X()) {
            this.f25526X.m9743Q(v4Var);
            m14700E4();
        } else {
            m14465m1();
            this.f25526X.m9718h0(v4Var);
        }
    }

    public final void m14656e5() {
        TdApi.Call L = C10536ab.m4667o1().m4713c0().m4601L();
        C10930q6 N = C10536ab.m4667o1().m4713c0().m4599N();
        if (L == null) {
            if (this.f25526X.m9736X()) {
                m14623z4(m14409z0().m2188w6(), false);
            }
            C1379j0.m37295y0(R.string.CallNoLongerActive, 0);
            return;
        }
        AbstractC9323v4<?> F = this.f25526X.m9762F();
        if (F != null && F.m9128xe() == N.m2188w6() && (F instanceof View$OnClickListenerC2162b)) {
            View$OnClickListenerC2162b bVar = (View$OnClickListenerC2162b) F;
            if (bVar.m35469Ye(L.userId)) {
                bVar.m35467af(L);
                return;
            }
        }
        View$OnClickListenerC2162b bVar2 = new View$OnClickListenerC2162b(this, N);
        bVar2.m35466bf(new View$OnClickListenerC2162b.C2168e(L));
        m14658d5(bVar2);
    }

    public void m14654f5() {
        if (this.f25526X.m9736X()) {
            m14623z4(m14409z0().m2188w6(), false);
        }
        LinkedList linkedList = new LinkedList();
        Iterator<C11131y6> it = C10536ab.m4667o1().iterator();
        while (it.hasNext()) {
            C11131y6 next = it.next();
            if (next.m1509B(true) && next.mo1480c().m2480e2().m1628k0()) {
                linkedList.add(next);
            }
        }
        if (!linkedList.isEmpty()) {
            if (linkedList.size() == 1) {
                new C5974t0(this, ((C11131y6) linkedList.get(0)).mo1480c(), 0L, 0L, null, false, null).m21734v().m21766Q(false).m21740o();
            } else {
                m14644k5(linkedList, null, null, new AbstractC5918j() {
                    @Override
                    public final void mo1330a(Object obj) {
                        MainActivity.this.m14676U4((C11131y6) obj);
                    }
                });
            }
        }
    }

    public final void m14652g5(int i) {
        if (this.f25526X.m9736X()) {
            m14623z4(i, true);
            return;
        }
        m14465m1();
        int N = this.f25526X.m9747N();
        if (!this.f25526X.m9748M().m9495r()) {
            for (int i2 = N - 2; i2 >= 1; i2--) {
                this.f25526X.m9748M().m9510c(i2);
            }
            AbstractC9323v4<?> j = this.f25526X.m9748M().m9503j(0);
            C2760nb nbVar = null;
            if (!(j.mo407R9() == R.id.controller_main && j.m9128xe() == i)) {
                nbVar = new C2760nb(this, C10536ab.m4756R0(i));
            }
            if (N > 1) {
                if (nbVar != null) {
                    this.f25526X.m9748M().m9488y(0, nbVar);
                }
                this.f25526X.m9720g0();
            } else if (nbVar != null) {
                this.f25526X.m9763E0(nbVar, false, false);
            }
        }
    }

    public final void m14650h5(int i, final long j, final long j2) {
        final C10930q6 c = C10536ab.m4664p1(i).m4745U(i).mo1480c();
        c.m2573Y1(new Runnable() {
            @Override
            public final void run() {
                MainActivity.this.m14672W4(c, j2, j);
            }
        });
    }

    public final void m14648i5(int i) {
        if (i != -1) {
            View$OnClickListenerC2667lk lkVar = new View$OnClickListenerC2667lk(this, C10536ab.m4664p1(i).m4745U(i).mo1480c());
            if (lkVar.m33894Vf() == -1) {
                if (this.f25526X.m9736X()) {
                    m14623z4(this.f25552k0.m2188w6(), false);
                }
            } else if (!(this.f25526X.m9762F() instanceof View$OnClickListenerC2667lk)) {
                m14658d5(lkVar);
            }
        }
    }

    public void m14646j5(CharSequence charSequence, String str, AbstractC5918j<C11131y6> jVar) {
        m14644k5(C10536ab.m4667o1().m4741V(), charSequence, str, jVar);
    }

    public final void m14644k5(List<C11131y6> list, CharSequence charSequence, String str, final AbstractC5918j<C11131y6> jVar) {
        m14642l5(list, charSequence, str, false, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                MainActivity.m14670X4(AbstractC5918j.this, (List) obj);
            }
        });
    }

    public void m14643l4(CharSequence charSequence, String str, AbstractC5918j<List<C11131y6>> jVar) {
        m14642l5(C10536ab.m4667o1().m4741V(), charSequence, str, true, jVar);
    }

    public final void m14642l5(final List<C11131y6> list, CharSequence charSequence, String str, final boolean z, final AbstractC5918j<List<C11131y6>> jVar) {
        C9180e2 me2;
        if (list.size() <= 1) {
            jVar.mo1330a(C5062b.m24166g(m14409z0().m2949A1()));
            return;
        }
        boolean k1 = m14409z0().m2930B4().m4680k1();
        int w6 = m14409z0().m2188w6();
        ArrayList arrayList = new ArrayList(list.size() + 2 + (z ? 1 : 0));
        arrayList.add(new C2964ra(35).m32870J(C1357a0.m37544i(12.0f)).m32875E(true));
        if (z) {
            arrayList.add(new C2964ra(12, (int) R.id.btn_selectAll, 0, (int) R.string.SelectAll, (int) R.id.btn_selectAll, k1));
        }
        boolean z2 = false;
        for (C11131y6 y6Var : list) {
            String t = y6Var.m1456t();
            int i = y6Var.f35708b;
            boolean z3 = w6 == i;
            if (z3) {
                z2 = true;
            }
            int i2 = z ? 69 : 85;
            int i3 = i + 1;
            if (z3) {
                t = C4403w.m27867j1(k1 ? R.string.LastUsedAccount : R.string.CurrentAccount, t);
            }
            arrayList.add(new C2964ra(i2, i3, 0, t, z ? y6Var.f35708b + 1 : R.id.account, z3 || (k1 && z)).m32873G(y6Var).m32865O(y6Var.m1458r()));
        }
        arrayList.add(new C2964ra(35).m32870J(C1357a0.m37544i(12.0f)).m32875E(true));
        if (!z2 && !z) {
            ((C2964ra) arrayList.get(1)).m32861S(true);
        }
        CharSequence i1 = C5070i.m24062i(charSequence) ? C4403w.m27871i1(R.string.PerformAs) : charSequence;
        String i12 = C5070i.m24062i(str) ? C4403w.m27871i1(R.string.Proceed) : str;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        final AtomicReference atomicReference = new AtomicReference();
        C9188f2 g = new C9188f2(R.id.account).m10010b(i1).m9997o(arrayList).m9993s(i12).m10000l(false).m9998n(z ? new C7885d() : null).m10002j(new AbstractC9323v4.AbstractC9343r() {
            @Override
            public final void mo1773l6(int i4, SparseIntArray sparseIntArray) {
                MainActivity.m14664a5(z, list, jVar, i4, sparseIntArray);
            }
        }).m10005g(new C6924j2.AbstractC6930f() {
            @Override
            public void mo3000j2(C6924j2 j2Var) {
                C6941k2.m18400a(this, j2Var);
            }

            @Override
            public final void mo2999y4(C6924j2 j2Var) {
                MainActivity.m14662b5(atomicReference, atomicBoolean, j2Var);
            }
        });
        AbstractC9323v4<?> F = this.f25526X.m9762F();
        if (!(F == null || (me2 = F.m9206me(g)) == null || me2.f29640a == null)) {
            C7886e eVar = new C7886e(me2);
            if (atomicBoolean.get()) {
                atomicReference.set(eVar);
                C10536ab.m4667o1().m4716b1().m1554a(eVar);
            }
        }
    }

    public void m14640m5() {
        if (C10536ab.m4667o1().m4650t0()) {
            this.f25526X.m9767C0();
            m14624y4(this.f25464R1.mo1480c(), this.f25464R1.mo1480c().m2648T1());
        }
    }

    public final View$OnClickListenerC2971rh m14639n4(C10930q6 q6Var) {
        View$OnClickListenerC2971rh rhVar = new View$OnClickListenerC2971rh(this, q6Var);
        rhVar.m32407fq(true);
        rhVar.get();
        this.f25468V1.m21467j(q6Var.m2188w6(), rhVar);
        return rhVar;
    }

    public final void m14638n5(C11131y6 y6Var, TdApi.AuthorizationState authorizationState, int i) {
        int v0;
        if (this.f25464R1.f35708b != y6Var.f35708b && (this.f25526X.m9736X() || !this.f25526X.m9762F().m9305Ya(y6Var))) {
            return;
        }
        if (this.f25526X.m9736X()) {
            m14624y4(this.f25464R1.mo1480c(), this.f25464R1.mo1480c().m2648T1());
            return;
        }
        AbstractC9323v4<?> l = this.f25526X.m9748M().m9501l();
        boolean z = true;
        if (i == 2) {
            AbstractC9323v4<?> j = this.f25526X.m9748M().m9503j(0);
            if (this.f25464R1.f35708b == y6Var.f35708b || !m14699F4(l) || m14699F4(j) || j.m9128xe() == y6Var.f35708b || l.m9128xe() != y6Var.f35708b) {
                z = false;
            }
            if (m14699F4(j) || !j.m9305Ya(y6Var)) {
                C2760nb nbVar = new C2760nb(this, y6Var.mo1480c());
                if (z) {
                    y6Var.mo1480c().m2294pc().m4122f0(this.f25464R1.mo1480c().m2294pc());
                }
                this.f25526X.m9763E0(nbVar, false, false);
            }
        } else if (i == 1 && this.f25464R1.f35708b == y6Var.f35708b && (v0 = this.f25552k0.m2930B4().m4642v0(this.f25464R1.f35708b)) != -1) {
            this.f25552k0.m2930B4().m4709d0(v0, 0);
        } else {
            AbstractC9323v4<?> t4 = m14629t4(y6Var.mo1480c());
            if (t4 == null) {
                if (C1379j0.m37361J() && authorizationState.getConstructor() == 306402531 && (l instanceof View$OnClickListenerC2393fk)) {
                    ((View$OnClickListenerC2393fk) l).m34673ng();
                }
                AbstractC9323v4<?> j2 = this.f25526X.m9748M().m9503j(0);
                if (!m14699F4(j2) && j2.m9305Ya(y6Var)) {
                    if (this.f25526X.m9741S()) {
                        AbstractC9323v4<?> K = this.f25526X.m9752K();
                        if (K == null || !K.m9305Ya(y6Var) || !K.mo9271db()) {
                            AbstractC9323v4<?> l2 = this.f25526X.m9748M().m9501l();
                            if (l2 != null && l2.m9305Ya(y6Var) && l2.mo9271db() && (l2 instanceof View$OnClickListenerC2393fk) && !((View$OnClickListenerC2393fk) l2).m34694Wf()) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    this.f25526X.m9763E0(new View$OnClickListenerC2393fk(this, y6Var.mo1480c()), true, false);
                }
            } else if (l == null || l.mo407R9() != t4.mo407R9()) {
                this.f25526X.m9718h0(t4);
            }
        }
    }

    public final void m14637o5() {
        C11131y6 k0 = C10536ab.m4667o1().m4681k0();
        this.f25464R1 = k0;
        k0.mo1480c().m2728Ne();
        m14436t3(this.f25464R1.mo1480c());
    }

    @Override
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f25526X.m9736X()) {
            this.f25526X.m9748M().m9512a(new C7887f(i, i2, intent));
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m14719i("MainActivity.onCreate", new Object[0]);
        this.f25465S1 = new Handler();
        C10536ab.m4667o1().m4716b1().m1554a(this);
        m14637o5();
        m14639n4(this.f25552k0).get();
        this.f25463Q1 = bundle;
        C4868i.C4873e K0 = C10536ab.m4667o1().m4784K0();
        if (K0 != null) {
            View$OnClickListenerC3209vr vrVar = new View$OnClickListenerC3209vr(this, this.f25552k0);
            vrVar.m31220ji(new View$OnClickListenerC3209vr.C3215f(K0));
            this.f25526X.m9743Q(vrVar);
        } else {
            m14624y4(this.f25464R1.mo1480c(), this.f25464R1.mo1480c().m2648T1());
        }
        final C10930q6 j0 = C10536ab.m4667o1().m4684j0();
        j0.m2588X1(new Runnable() {
            @Override
            public final void run() {
                MainActivity.m14690N4(C10930q6.this);
            }
        });
    }

    @Override
    public void onDestroy() {
        C10536ab.m4667o1().m4716b1().m1531x(this);
        m14635q4();
        Log.m14719i("MainActivity.onDestroy", new Object[0]);
        Log.close();
        super.onDestroy();
    }

    @Override
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String action = intent != null ? intent.getAction() : null;
        if (!C5070i.m24062i(action)) {
            m14626w4(action, intent, false);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.m14719i("MainActivity.onPause", new Object[0]);
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.m14719i("MainActivity.onResume", new Object[0]);
        this.f25552k0.m2946A4().m1400f0(this);
        C1379j0.m37372C0();
        if (!this.f25469W1 && !C4868i.m24727c2().m24711e2()) {
            this.f25469W1 = true;
            C4383l.m28061a().m28060b(new Runnable() {
                @Override
                public final void run() {
                    MainActivity.this.m14688O4();
                }
            });
        }
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC9323v4<?> v4Var = null;
        if (bundle == null) {
            super.onSaveInstanceState(null);
            return;
        }
        C9270q1 q1Var = this.f25526X;
        int N = q1Var != null ? q1Var.m9747N() : 0;
        if (N > 1) {
            while (true) {
                AbstractC9323v4<?> j = this.f25526X.m9748M().m9503j(N - 1);
                if (j == null || j.mo4348c() == this.f25464R1.mo1480c()) {
                    break;
                }
                N--;
            }
        }
        if (N > 1) {
            v4Var = this.f25526X.m9748M().m9503j(N - 1);
        }
        if (N <= 1 || v4Var == null) {
            bundle.putInt("nav_stack_type", 0);
            super.onSaveInstanceState(bundle);
            return;
        }
        bundle.putInt("nav_account_id", this.f25464R1.f35708b);
        int i = 0;
        for (int i2 = N - 1; i2 >= 0; i2--) {
            AbstractC9323v4<?> j2 = this.f25526X.m9748M().m9503j(i2);
            if (j2 != null) {
                String c5 = m14660c5(i);
                int R9 = j2.mo407R9();
                if (!m14641m4(R9, j2)) {
                    if (!j2.mo9122yd(bundle, c5 + "_")) {
                    }
                }
                bundle.putInt(c5, R9);
                i++;
            }
        }
        if (i > 0) {
            bundle.putInt("nav_stack_type", 2);
            bundle.putInt("nav_item_count", i);
        } else {
            bundle.putInt("nav_stack_type", 0);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override
    public void mo12p4(C11131y6 y6Var, TdApi.User user, boolean z, boolean z2) {
    }

    public final void m14636p5(boolean z) {
        C10651f1 W1 = this.f25552k0.m2930B4().m4735W1();
        if (W1.m4364m()) {
            W1.m4354v(this);
        }
    }

    @Override
    public void mo11p6(C11131y6 y6Var, int i) {
        C11008t0.m1998d(this, y6Var, i);
    }

    public void m14635q4() {
        for (int n = this.f25468V1.m21464n() - 1; n >= 0; n--) {
            View$OnClickListenerC2971rh o = this.f25468V1.m21463o(n);
            o.m32617Pp();
            o.mo417Z8();
            this.f25468V1.m21465l(n);
        }
    }

    public void m14633r4(int i) {
        for (int n = this.f25468V1.m21464n() - 1; n >= 0; n--) {
            if (this.f25468V1.m21468i(n) != i) {
                View$OnClickListenerC2971rh o = this.f25468V1.m21463o(n);
                o.m32617Pp();
                o.mo417Z8();
                this.f25468V1.m21465l(n);
            }
        }
    }

    public final int m14632r5(Bundle bundle) {
        int i;
        int i2;
        if (bundle == null || (i = bundle.getInt("nav_stack_type", 0)) == 0) {
            return 0;
        }
        if (!(this.f25464R1.f35708b == bundle.getInt("nav_account_id", 0) && i == 2 && (i2 = bundle.getInt("nav_item_count")) > 0)) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            String c5 = m14660c5(i4);
            int i5 = bundle.getInt(c5);
            C10930q6 c = this.f25464R1.mo1480c();
            AbstractC9323v4<?> q5 = m14634q5(this, c, i5, bundle, c5 + "_");
            if (q5 != null) {
                q5.get();
                if (i3 == 0) {
                    this.f25526X.m9743Q(q5);
                } else {
                    this.f25526X.m9742R(q5, 0);
                }
                i3++;
            }
        }
        return i3 > 0 ? 2 : 0;
    }

    public void m14631s4(boolean z) {
        C11131y6 U = C10536ab.m4667o1().m4745U(this.f25552k0.m2930B4().m4711c2(z));
        this.f25464R1 = U;
        U.mo1480c().m2728Ne();
        m14436t3(this.f25464R1.mo1480c());
    }

    public final void m14630s5(boolean z) {
        if (z || this.f25466T1 != null) {
            if (this.f25467U1 == null) {
                LinearLayout linearLayout = new LinearLayout(this);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                int i = -1;
                linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                C10192g.m5781j(linearLayout, R.id.theme_color_filling);
                linearLayout.addView(new C6984o1(this));
                C6847b2 b2Var = new C6847b2(this);
                b2Var.setTextSize(2, 22.0f);
                b2Var.setPadding(C1357a0.m37544i(12.0f), C1357a0.m37544i(14.0f), C1357a0.m37544i(12.0f), C1357a0.m37544i(14.0f));
                b2Var.setTextColor(C11524j.m217S0());
                b2Var.setGravity(17);
                C1399s0.m37178j0(b2Var, C4403w.m27871i1(R.string.Optimizing));
                linearLayout.addView(b2Var);
                C6847b2 b2Var2 = new C6847b2(this);
                b2Var2.setTextSize(2, 15.0f);
                b2Var2.setGravity(17);
                b2Var2.setPadding(C1357a0.m37544i(24.0f), 0, C1357a0.m37544i(24.0f), 0);
                b2Var2.setTextColor(C11524j.m217S0());
                b2Var2.setText(C4403w.m27871i1(R.string.OptimizingInfo));
                linearLayout.addView(b2Var2);
                RunnableC7091z1 z1Var = this.f25562p0;
                if (z1Var != null) {
                    i = this.f25522V.indexOfChild(z1Var);
                }
                this.f25522V.addView(linearLayout, i);
                this.f25467U1 = linearLayout;
                linearLayout.setAlpha(0.0f);
            }
            if (this.f25466T1 == null) {
                this.f25466T1 = new C3940f(0, new C7882a(), C2057b.f7280b, 220L);
            }
            this.f25466T1.m29578o(z ? 0L : 180L);
            this.f25466T1.m29577p(z, true);
        }
    }

    public final AbstractC9323v4<?> m14629t4(C10930q6 q6Var) {
        TdApi.AuthorizationState S1 = q6Var.m2663S1();
        int constructor = S1.getConstructor();
        if (constructor == 52643073) {
            View$OnClickListenerC2665lj ljVar = new View$OnClickListenerC2665lj(this, q6Var);
            ljVar.m33966bg(new View$OnClickListenerC2665lj.C2666a(7, (TdApi.AuthorizationStateWaitCode) S1, q6Var.m2678R1()));
            return ljVar;
        } else if (constructor == 187548796) {
            View$OnClickListenerC2665lj ljVar2 = new View$OnClickListenerC2665lj(this, q6Var);
            ljVar2.m33966bg(new View$OnClickListenerC2665lj.C2666a(5, (TdApi.AuthorizationStateWaitPassword) S1));
            return ljVar2;
        } else if (constructor != 550350511) {
            return null;
        } else {
            View$OnClickListenerC2118a7 a7Var = new View$OnClickListenerC2118a7(this, q6Var);
            a7Var.m35523sf(new View$OnClickListenerC2118a7.C2120b(0, (TdApi.AuthorizationStateWaitRegistration) S1, q6Var.m2678R1()));
            return a7Var;
        }
    }

    public final void m14695K4(C11131y6 y6Var, String str, Intent intent) {
        if (this.f25526X.m9736X()) {
            m14703A4(y6Var.mo1480c(), str, intent);
            return;
        }
        AbstractC9323v4<?> j = this.f25526X.m9748M().m9503j(0);
        if (j instanceof C2760nb) {
            ((C2760nb) j).m33580Rh(y6Var.mo1480c(), str, intent);
        }
    }

    public View$OnClickListenerC2971rh m14627u4(C10930q6 q6Var, boolean z) {
        View$OnClickListenerC2971rh e = this.f25468V1.m21472e(q6Var.m2188w6());
        if (e != null) {
            return e;
        }
        if (z) {
            return m14639n4(q6Var);
        }
        return null;
    }

    @Override
    public void mo4v4(C11131y6 y6Var, TdApi.User user, int i, C11131y6 y6Var2) {
        if (this.f25464R1.f35708b != y6Var.f35708b) {
            this.f25464R1 = y6Var;
            m14436t3(y6Var.mo1480c());
            if (i != 3 && i != 4) {
                m14633r4(y6Var.f35708b);
                AbstractC9323v4<?> F = this.f25526X.m9762F();
                if (F == null || F.mo4348c() == null || F.mo4348c().m2188w6() != y6Var.f35708b) {
                    C2760nb nbVar = new C2760nb(this, y6Var.mo1480c());
                    if (this.f25526X.m9736X()) {
                        this.f25526X.m9765D0(nbVar);
                    } else {
                        this.f25526X.m9763E0(nbVar, false, false);
                    }
                }
            }
        }
    }

    public final boolean m14626w4(java.lang.String r17, final android.content.Intent r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.thunderdog.challegram.MainActivity.m14626w4(java.lang.String, android.content.Intent, boolean):boolean");
    }

    public final void m14625x4() {
        Intent intent = getIntent();
        String action = intent != null ? intent.getAction() : null;
        if (C5070i.m24062i(action) || !m14626w4(action, intent, true)) {
            Bundle bundle = this.f25463Q1;
            if (bundle != null) {
                int r5 = m14632r5(bundle);
                this.f25463Q1 = null;
                if (r5 == 2) {
                    m14700E4();
                }
                if (r5 != 0) {
                    return;
                }
            }
            m14703A4(null, null, null);
        }
    }

    public final void m14624y4(C10930q6 q6Var, int i) {
        if (i == 1) {
            int v0 = q6Var.m2930B4().m4642v0(q6Var.m2188w6());
            if (v0 == -1) {
                m14702B4();
            } else {
                q6Var.m2930B4().m4709d0(v0, 1);
            }
        } else if (i == 2) {
            m14625x4();
        }
    }

    public void m14623z4(int i, boolean z) {
        if (this.f25526X.m9736X()) {
            C2760nb nbVar = new C2760nb(this, C10536ab.m4667o1().m4745U(i).mo1480c());
            if (z) {
                m14701D4(nbVar);
            } else {
                this.f25526X.m9743Q(nbVar);
            }
        }
    }
}

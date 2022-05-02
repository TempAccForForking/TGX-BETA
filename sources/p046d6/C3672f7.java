package p046d6;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p009a8.C0207c;
import p009a8.C0215g;
import p009a8.C0223n;
import p163l5.C6368o;
import p177m6.AbstractC6775l;
import p337y0.C10329c;
import p337y0.C10335g;

public final class C3672f7 {
    public static AbstractC3858z7<String> f12507j;
    public final String f12508a;
    public final String f12509b;
    public final AbstractC3662e7 f12510c;
    public final C0223n f12511d;
    public final AbstractC6775l<String> f12512e;
    public final AbstractC6775l<String> f12513f;
    public final String f12514g;
    public final Map<EnumC3846y4, Long> f12515h = new HashMap();
    public final Map<EnumC3846y4, Object> f12516i = new HashMap();

    public C3672f7(Context context, final C0223n nVar, AbstractC3662e7 e7Var, final String str) {
        this.f12508a = context.getPackageName();
        this.f12509b = C0207c.m42091a(context);
        this.f12511d = nVar;
        this.f12510c = e7Var;
        this.f12514g = str;
        this.f12512e = C0215g.m42087a().m42086b(new Callable() {
            @Override
            public final Object call() {
                return C6368o.m20534a().m20533b(str);
            }
        });
        C0215g a = C0215g.m42087a();
        nVar.getClass();
        this.f12513f = a.m42086b(new Callable() {
            @Override
            public final Object call() {
                return C0223n.this.m42067a();
            }
        });
    }

    public static synchronized AbstractC3858z7<String> m29835c() {
        synchronized (C3672f7.class) {
            AbstractC3858z7<String> z7Var = f12507j;
            if (z7Var != null) {
                return z7Var;
            }
            C10335g a = C10329c.m5412a(Resources.getSystem().getConfiguration());
            C3831w7 w7Var = new C3831w7();
            for (int i = 0; i < a.m5402d(); i++) {
                w7Var.m29739c(C0207c.m42090b(a.m5403c(i)));
            }
            AbstractC3858z7<String> d = w7Var.m29738d();
            f12507j = d;
            return d;
        }
    }

    public final void m29837a(C3682g7 g7Var, EnumC3846y4 y4Var, String str) {
        String str2;
        g7Var.m29828d(y4Var);
        String a = g7Var.m29831a();
        C3749n6 n6Var = new C3749n6();
        n6Var.m29806b(this.f12508a);
        n6Var.m29805c(this.f12509b);
        n6Var.m29800h(m29835c());
        n6Var.m29801g(Boolean.TRUE);
        n6Var.m29797k(a);
        n6Var.m29798j(str);
        if (this.f12513f.mo19066p()) {
            str2 = this.f12513f.mo19070l();
        } else {
            str2 = this.f12511d.m42067a();
        }
        n6Var.m29799i(str2);
        n6Var.m29804d(10);
        g7Var.m29827e(n6Var);
        this.f12510c.mo29809a(g7Var);
    }

    public final void m29836b(C3777q7 q7Var, final EnumC3846y4 y4Var) {
        EnumC3738m4 m4Var;
        EnumC3792s4 s4Var;
        String str;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f12515h.get(y4Var) == null || elapsedRealtime - this.f12515h.get(y4Var).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            this.f12515h.put(y4Var, Long.valueOf(elapsedRealtime));
            int i = q7Var.f12788a;
            int i2 = q7Var.f12789b;
            int i3 = q7Var.f12790c;
            int i4 = q7Var.f12791d;
            int i5 = q7Var.f12792e;
            long j = q7Var.f12793f;
            int i6 = q7Var.f12794g;
            C3783r4 r4Var = new C3783r4();
            if (i == -1) {
                m4Var = EnumC3738m4.BITMAP;
            } else if (i == 35) {
                m4Var = EnumC3738m4.YUV_420_888;
            } else if (i == 842094169) {
                m4Var = EnumC3738m4.YV12;
            } else if (i == 16) {
                m4Var = EnumC3738m4.NV16;
            } else if (i != 17) {
                m4Var = EnumC3738m4.UNKNOWN_FORMAT;
            } else {
                m4Var = EnumC3738m4.NV21;
            }
            r4Var.m29771d(m4Var);
            if (i2 == 1) {
                s4Var = EnumC3792s4.BITMAP;
            } else if (i2 == 2) {
                s4Var = EnumC3792s4.BYTEARRAY;
            } else if (i2 == 3) {
                s4Var = EnumC3792s4.BYTEBUFFER;
            } else if (i2 != 4) {
                s4Var = EnumC3792s4.ANDROID_MEDIA_IMAGE;
            } else {
                s4Var = EnumC3792s4.FILEPATH;
            }
            r4Var.m29769f(s4Var);
            r4Var.m29772c(Integer.valueOf(i3));
            r4Var.m29770e(Integer.valueOf(i4));
            r4Var.m29768g(Integer.valueOf(i5));
            r4Var.m29773b(Long.valueOf(j));
            r4Var.m29767h(Integer.valueOf(i6));
            C3801t4 j2 = r4Var.m29765j();
            C3620a5 a5Var = new C3620a5();
            a5Var.m29856d(j2);
            final C3682g7 c = C3682g7.m29829c(a5Var);
            if (this.f12512e.mo19066p()) {
                str = this.f12512e.mo19070l();
            } else {
                str = C6368o.m20534a().m20533b(this.f12514g);
            }
            final String str2 = str;
            C0215g.m42084d().execute(new Runnable(c, y4Var, str2, null) {
                public final C3682g7 f12370M;
                public final EnumC3846y4 f12372b;
                public final String f12373c;

                @Override
                public final void run() {
                    C3672f7.this.m29837a(this.f12370M, this.f12372b, this.f12373c);
                }
            });
        }
    }
}

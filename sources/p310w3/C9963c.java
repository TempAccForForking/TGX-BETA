package p310w3;

import com.google.android.exoplayer2.extractor.AbstractC3470g;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p020b5.C1186a;
import p020b5.C1189b0;
import p270t3.AbstractC8958f;
import p270t3.AbstractC8959g;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8965l;
import p270t3.C8971q;

public final class C9963c implements AbstractC8958f {
    public static final AbstractC8965l f32363q = C9962b.f32362b;
    public AbstractC8960h f32369f;
    public boolean f32371h;
    public long f32372i;
    public int f32373j;
    public int f32374k;
    public int f32375l;
    public long f32376m;
    public boolean f32377n;
    public C9961a f32378o;
    public C9967f f32379p;
    public final C1189b0 f32364a = new C1189b0(4);
    public final C1189b0 f32365b = new C1189b0(9);
    public final C1189b0 f32366c = new C1189b0(11);
    public final C1189b0 f32367d = new C1189b0();
    public final C9964d f32368e = new C9964d();
    public int f32370g = 1;

    public static AbstractC8958f[] m6409h() {
        return new AbstractC8958f[]{new C9963c()};
    }

    @Override
    public void mo1153a() {
    }

    @Override
    public void mo1152b(long j, long j2) {
        if (j == 0) {
            this.f32370g = 1;
            this.f32371h = false;
        } else {
            this.f32370g = 3;
        }
        this.f32373j = 0;
    }

    @RequiresNonNull({"extractorOutput"})
    public final void m6411d() {
        if (!this.f32377n) {
            this.f32369f.mo6042a(new AbstractC3470g.C3472b(-9223372036854775807L));
            this.f32377n = true;
        }
    }

    @Override
    public int mo1149e(AbstractC8959g gVar, C8971q qVar) {
        C1186a.m38182h(this.f32369f);
        while (true) {
            int i = this.f32370g;
            if (i != 1) {
                if (i == 2) {
                    m6404n(gVar);
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    } else if (m6406l(gVar)) {
                        return 0;
                    }
                } else if (!m6405m(gVar)) {
                    return -1;
                }
            } else if (!m6407k(gVar)) {
                return -1;
            }
        }
    }

    @Override
    public void mo1148f(AbstractC8960h hVar) {
        this.f32369f = hVar;
    }

    public final long m6410g() {
        if (this.f32371h) {
            return this.f32372i + this.f32376m;
        }
        if (this.f32368e.m6403d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f32376m;
    }

    public final C1189b0 m6408i(AbstractC8959g gVar) {
        if (this.f32375l > this.f32367d.m38141b()) {
            C1189b0 b0Var = this.f32367d;
            b0Var.m38146N(new byte[Math.max(b0Var.m38141b() * 2, this.f32375l)], 0);
        } else {
            this.f32367d.m38144P(0);
        }
        this.f32367d.m38145O(this.f32375l);
        gVar.readFully(this.f32367d.m38139d(), 0, this.f32375l);
        return this.f32367d;
    }

    @Override
    public boolean mo1144j(AbstractC8959g gVar) {
        gVar.mo10806q(this.f32364a.m38139d(), 0, 3);
        this.f32364a.m38144P(0);
        if (this.f32364a.m38153G() != 4607062) {
            return false;
        }
        gVar.mo10806q(this.f32364a.m38139d(), 0, 2);
        this.f32364a.m38144P(0);
        if ((this.f32364a.m38150J() & 250) != 0) {
            return false;
        }
        gVar.mo10806q(this.f32364a.m38139d(), 0, 4);
        this.f32364a.m38144P(0);
        int n = this.f32364a.m38129n();
        gVar.mo10809m();
        gVar.mo10812h(n);
        gVar.mo10806q(this.f32364a.m38139d(), 0, 4);
        this.f32364a.m38144P(0);
        return this.f32364a.m38129n() == 0;
    }

    @RequiresNonNull({"extractorOutput"})
    public final boolean m6407k(AbstractC8959g gVar) {
        boolean z = false;
        if (!gVar.mo10814d(this.f32365b.m38139d(), 0, 9, true)) {
            return false;
        }
        this.f32365b.m38144P(0);
        this.f32365b.m38143Q(4);
        int D = this.f32365b.m38156D();
        boolean z2 = (D & 4) != 0;
        if ((D & 1) != 0) {
            z = true;
        }
        if (z2 && this.f32378o == null) {
            this.f32378o = new C9961a(this.f32369f.mo6039r(8, 1));
        }
        if (z && this.f32379p == null) {
            this.f32379p = new C9967f(this.f32369f.mo6039r(9, 2));
        }
        this.f32369f.mo6040m();
        this.f32373j = (this.f32365b.m38129n() - 9) + 4;
        this.f32370g = 2;
        return true;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput"})
    public final boolean m6406l(p270t3.AbstractC8959g r10) {
        throw new UnsupportedOperationException("Method not decompiled: p310w3.C9963c.m6406l(t3.g):boolean");
    }

    public final boolean m6405m(AbstractC8959g gVar) {
        if (!gVar.mo10814d(this.f32366c.m38139d(), 0, 11, true)) {
            return false;
        }
        this.f32366c.m38144P(0);
        this.f32374k = this.f32366c.m38156D();
        this.f32375l = this.f32366c.m38153G();
        this.f32376m = this.f32366c.m38153G();
        this.f32376m = ((this.f32366c.m38156D() << 24) | this.f32376m) * 1000;
        this.f32366c.m38143Q(3);
        this.f32370g = 4;
        return true;
    }

    public final void m6404n(AbstractC8959g gVar) {
        gVar.mo10808n(this.f32373j);
        this.f32373j = 0;
        this.f32370g = 3;
    }
}
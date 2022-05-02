package p174m3;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import p020b5.C1186a;
import p020b5.C1193d0;
import p020b5.C1198g;
import p020b5.C1216l0;
import p020b5.C1230s;
import p032c5.AbstractC1621k;
import p032c5.AbstractC1622l;
import p032c5.AbstractC1642z;
import p032c5.C1607b0;
import p032c5.C1631o;
import p045d5.AbstractC3601a;
import p073f4.AbstractC4268f;
import p073f4.C4260a;
import p174m3.AbstractC6618i2;
import p174m3.AbstractC6689s;
import p174m3.C6558b;
import p174m3.C6564b3;
import p174m3.C6581d;
import p174m3.C6654n2;
import p186n3.C7122h1;
import p187n4.AbstractC7230t;
import p187n4.C7233t0;
import p199o3.AbstractC7634s;
import p199o3.C7602e;
import p199o3.C7616h;
import p216p3.C8024e;
import p216p3.C8028h;
import p217p4.AbstractC8048l;
import p217p4.C8032b;
import p356z4.C11272n;

@Deprecated
public class C6721y2 extends AbstractC6588e implements AbstractC6689s {
    public int f21078A;
    public int f21079B;
    public C8024e f21080C;
    public C8024e f21081D;
    public int f21082E;
    public C7602e f21083F;
    public float f21084G;
    public boolean f21085H;
    public List<C8032b> f21086I;
    public boolean f21087J;
    public boolean f21088K;
    public C1193d0 f21089L;
    public boolean f21090M;
    public boolean f21091N;
    public C6658o f21092O;
    public C1607b0 f21093P;
    public final AbstractC6696s2[] f21094b;
    public final C1198g f21095c;
    public final Context f21096d;
    public final C6726z0 f21097e;
    public final SurfaceHolder$CallbackC6723b f21098f;
    public final C6724c f21099g;
    public final CopyOnWriteArraySet<AbstractC6618i2.AbstractC6624e> f21100h;
    public final C7122h1 f21101i;
    public final C6558b f21102j;
    public final C6581d f21103k;
    public final C6564b3 f21104l;
    public final C6650m3 f21105m;
    public final C6657n3 f21106n;
    public final long f21107o;
    public C6600g1 f21108p;
    public C6600g1 f21109q;
    public AudioTrack f21110r;
    public Object f21111s;
    public Surface f21112t;
    public SurfaceHolder f21113u;
    public SphericalGLSurfaceView f21114v;
    public boolean f21115w;
    public TextureView f21116x;
    public int f21117y;
    public int f21118z;

    public final class SurfaceHolder$CallbackC6723b implements AbstractC1642z, AbstractC7634s, AbstractC8048l, AbstractC4268f, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.AbstractC3481b, C6581d.AbstractC6583b, C6558b.AbstractC6560b, C6564b3.AbstractC6566b, AbstractC6618i2.AbstractC6622c, AbstractC6689s.AbstractC6690a {
        public SurfaceHolder$CallbackC6723b() {
        }

        @Override
        public void mo15425A(String str, long j, long j2) {
            C6721y2.this.f21101i.mo15425A(str, j, j2);
        }

        @Override
        public void mo15424B(C8024e eVar) {
            C6721y2.this.f21101i.mo15424B(eVar);
            C6721y2.this.f21109q = null;
            C6721y2.this.f21081D = null;
        }

        @Override
        public void mo7370C(boolean z) {
            C6637k2.m19734p(this, z);
        }

        @Override
        public void mo19334D(int i) {
            boolean k = C6721y2.this.mo19255k();
            C6721y2.this.m19367V0(k, i, C6721y2.m19381J0(k, i));
        }

        @Override
        public void mo15423E(C6600g1 g1Var, C8028h hVar) {
            C6721y2.this.f21109q = g1Var;
            C6721y2.this.f21101i.mo15423E(g1Var, hVar);
        }

        @Override
        public void mo19333F(Surface surface) {
            C6721y2.this.m19369T0(null);
        }

        @Override
        public void mo19332G(Surface surface) {
            C6721y2.this.m19369T0(surface);
        }

        @Override
        public void mo17715H(C8024e eVar) {
            C6721y2.this.f21101i.mo17715H(eVar);
            C6721y2.this.f21108p = null;
            C6721y2.this.f21080C = null;
        }

        @Override
        public void mo17711I(int i, long j) {
            C6721y2.this.f21101i.mo17711I(i, j);
        }

        @Override
        public void mo17707J(C6600g1 g1Var, C8028h hVar) {
            C6721y2.this.f21108p = g1Var;
            C6721y2.this.f21101i.mo17707J(g1Var, hVar);
        }

        @Override
        public void mo7368K(AbstractC6604g3 g3Var, int i) {
            C6637k2.m19733q(this, g3Var, i);
        }

        @Override
        public void mo7366M(boolean z, int i) {
            C6637k2.m19739k(this, z, i);
        }

        @Override
        public void mo7365N(C6693s1 s1Var) {
            C6637k2.m19744f(this, s1Var);
        }

        @Override
        public void mo19331O(int i, boolean z) {
            Iterator it = C6721y2.this.f21100h.iterator();
            while (it.hasNext()) {
                ((AbstractC6618i2.AbstractC6624e) it.next()).mo7367L(i, z);
            }
        }

        @Override
        public void mo19330P(boolean z) {
            C6685r.m19573a(this, z);
        }

        @Override
        public void mo17688Q(Object obj, long j) {
            C6721y2.this.f21101i.mo17688Q(obj, j);
            if (C6721y2.this.f21111s == obj) {
                Iterator it = C6721y2.this.f21100h.iterator();
                while (it.hasNext()) {
                    ((AbstractC6618i2.AbstractC6624e) it.next()).mo7252e();
                }
            }
        }

        @Override
        public void mo7364R(int i) {
            C6637k2.m19736n(this, i);
        }

        @Override
        public void mo15422S(C6600g1 g1Var) {
            C7616h.m15472a(this, g1Var);
        }

        @Override
        public void mo15421W(long j) {
            C6721y2.this.f21101i.mo15421W(j);
        }

        @Override
        public void mo15420Y(Exception exc) {
            C6721y2.this.f21101i.mo15420Y(exc);
        }

        @Override
        public void mo17669Z(Exception exc) {
            C6721y2.this.f21101i.mo17669Z(exc);
        }

        @Override
        public void mo15419a(boolean z) {
            if (C6721y2.this.f21085H != z) {
                C6721y2.this.f21085H = z;
                C6721y2.this.m19377M0();
            }
        }

        @Override
        public void mo7361a0(boolean z, int i) {
            C6721y2.this.m19366W0();
        }

        @Override
        public void mo19329b(C1607b0 b0Var) {
            C6721y2.this.f21093P = b0Var;
            C6721y2.this.f21101i.mo7360b(b0Var);
            Iterator it = C6721y2.this.f21100h.iterator();
            while (it.hasNext()) {
                ((AbstractC6618i2.AbstractC6624e) it.next()).mo7360b(b0Var);
            }
        }

        @Override
        public void mo7359b0(C6660o1 o1Var, int i) {
            C6637k2.m19745e(this, o1Var, i);
        }

        @Override
        public void mo7358c(C6613h2 h2Var) {
            C6637k2.m19743g(this, h2Var);
        }

        @Override
        public void mo7357c0(AbstractC6618i2 i2Var, AbstractC6618i2.C6623d dVar) {
            C6637k2.m19748b(this, i2Var, dVar);
        }

        @Override
        public void mo19328d(C4260a aVar) {
            C6721y2.this.f21101i.mo7356d(aVar);
            C6721y2.this.f21097e.m19237q1(aVar);
            Iterator it = C6721y2.this.f21100h.iterator();
            while (it.hasNext()) {
                ((AbstractC6618i2.AbstractC6624e) it.next()).mo7356d(aVar);
            }
        }

        @Override
        public void mo7355e0(C6591e2 e2Var) {
            C6637k2.m19741i(this, e2Var);
        }

        @Override
        public void mo15418f(Exception exc) {
            C6721y2.this.f21101i.mo15418f(exc);
        }

        @Override
        public void mo13720g(List<C8032b> list) {
            C6721y2.this.f21086I = list;
            Iterator it = C6721y2.this.f21100h.iterator();
            while (it.hasNext()) {
                ((AbstractC6618i2.AbstractC6624e) it.next()).mo7353g(list);
            }
        }

        @Override
        public void mo15417g0(C8024e eVar) {
            C6721y2.this.f21081D = eVar;
            C6721y2.this.f21101i.mo15417g0(eVar);
        }

        @Override
        public void mo7352h(int i) {
            C6637k2.m19742h(this, i);
        }

        @Override
        public void mo15416h0(int i, long j, long j2) {
            C6721y2.this.f21101i.mo15416h0(i, j, j2);
        }

        @Override
        public void mo19327i(int i) {
            C6658o G0 = C6721y2.m19385G0(C6721y2.this.f21104l);
            if (!G0.equals(C6721y2.this.f21092O)) {
                C6721y2.this.f21092O = G0;
                Iterator it = C6721y2.this.f21100h.iterator();
                while (it.hasNext()) {
                    ((AbstractC6618i2.AbstractC6624e) it.next()).mo7349j0(G0);
                }
            }
        }

        @Override
        public void mo7351i0(AbstractC6618i2.C6620b bVar) {
            C6637k2.m19749a(this, bVar);
        }

        @Override
        public void mo17648j(C8024e eVar) {
            C6721y2.this.f21080C = eVar;
            C6721y2.this.f21101i.mo17648j(eVar);
        }

        @Override
        public void mo7348k(boolean z) {
            C6637k2.m19746d(this, z);
        }

        @Override
        public void mo17645k0(long j, int i) {
            C6721y2.this.f21101i.mo17645k0(j, i);
        }

        @Override
        public void mo7347l(int i) {
            C6637k2.m19738l(this, i);
        }

        @Override
        public void mo7346l0(C6591e2 e2Var) {
            C6637k2.m19740j(this, e2Var);
        }

        @Override
        public void mo17640m(String str) {
            C6721y2.this.f21101i.mo17640m(str);
        }

        @Override
        public void mo7344m0(boolean z) {
            C6637k2.m19747c(this, z);
        }

        @Override
        public void mo17637n(String str, long j, long j2) {
            C6721y2.this.f21101i.mo17637n(str, j, j2);
        }

        @Override
        public void mo7343o(boolean z) {
            if (C6721y2.this.f21089L == null) {
                return;
            }
            if (z && !C6721y2.this.f21090M) {
                C6721y2.this.f21089L.m38098a(0);
                C6721y2.this.f21090M = true;
            } else if (!z && C6721y2.this.f21090M) {
                C6721y2.this.f21089L.m38097b(0);
                C6721y2.this.f21090M = false;
            }
        }

        @Override
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C6721y2.this.m19370S0(surfaceTexture);
            C6721y2.this.m19379L0(i, i2);
        }

        @Override
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C6721y2.this.m19369T0(null);
            C6721y2.this.m19379L0(0, 0);
            return true;
        }

        @Override
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C6721y2.this.m19379L0(i, i2);
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override
        public void mo7342p() {
            C6637k2.m19735o(this);
        }

        @Override
        public void mo7341q(C6644l3 l3Var) {
            C6637k2.m19731s(this, l3Var);
        }

        @Override
        public void mo17624r(C6600g1 g1Var) {
            C1631o.m36152a(this, g1Var);
        }

        @Override
        public void mo7340s(AbstractC6618i2.C6625f fVar, AbstractC6618i2.C6625f fVar2, int i) {
            C6637k2.m19737m(this, fVar, fVar2, i);
        }

        @Override
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C6721y2.this.m19379L0(i2, i3);
        }

        @Override
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (C6721y2.this.f21115w) {
                C6721y2.this.m19369T0(surfaceHolder.getSurface());
            }
        }

        @Override
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (C6721y2.this.f21115w) {
                C6721y2.this.m19369T0(null);
            }
            C6721y2.this.m19379L0(0, 0);
        }

        @Override
        public void mo7339t(C7233t0 t0Var, C11272n nVar) {
            C6637k2.m19732r(this, t0Var, nVar);
        }

        @Override
        public void mo19326v() {
            C6721y2.this.m19367V0(false, -1, 3);
        }

        @Override
        public void mo7223w(int i) {
            C6721y2.this.m19366W0();
        }

        @Override
        public void mo19325x(boolean z) {
            C6721y2.this.m19366W0();
        }

        @Override
        public void mo19324y(float f) {
            C6721y2.this.m19372Q0();
        }

        @Override
        public void mo15415z(String str) {
            C6721y2.this.f21101i.mo15415z(str);
        }
    }

    public static final class C6724c implements AbstractC1622l, AbstractC3601a, C6654n2.AbstractC6656b {
        public AbstractC3601a f21120M;
        public AbstractC1622l f21121a;
        public AbstractC3601a f21122b;
        public AbstractC1622l f21123c;

        public C6724c() {
        }

        @Override
        public void mo19323a(long j, float[] fArr) {
            AbstractC3601a aVar = this.f21120M;
            if (aVar != null) {
                aVar.mo19323a(j, fArr);
            }
            AbstractC3601a aVar2 = this.f21122b;
            if (aVar2 != null) {
                aVar2.mo19323a(j, fArr);
            }
        }

        @Override
        public void mo19322d() {
            AbstractC3601a aVar = this.f21120M;
            if (aVar != null) {
                aVar.mo19322d();
            }
            AbstractC3601a aVar2 = this.f21122b;
            if (aVar2 != null) {
                aVar2.mo19322d();
            }
        }

        @Override
        public void mo19321g(long j, long j2, C6600g1 g1Var, MediaFormat mediaFormat) {
            AbstractC1622l lVar = this.f21123c;
            if (lVar != null) {
                lVar.mo19321g(j, j2, g1Var, mediaFormat);
            }
            AbstractC1622l lVar2 = this.f21121a;
            if (lVar2 != null) {
                lVar2.mo19321g(j, j2, g1Var, mediaFormat);
            }
        }

        @Override
        public void mo15492u(int i, Object obj) {
            if (i == 7) {
                this.f21121a = (AbstractC1622l) obj;
            } else if (i == 8) {
                this.f21122b = (AbstractC3601a) obj;
            } else if (i == 10000) {
                SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
                if (sphericalGLSurfaceView == null) {
                    this.f21123c = null;
                    this.f21120M = null;
                    return;
                }
                this.f21123c = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.f21120M = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }
    }

    public C6721y2(AbstractC6689s.C6691b bVar) {
        C6721y2 y2Var;
        Throwable th;
        C1198g gVar = new C1198g();
        this.f21095c = gVar;
        try {
            Context applicationContext = bVar.f20921a.getApplicationContext();
            this.f21096d = applicationContext;
            C7122h1 h1Var = bVar.f20929i.get();
            this.f21101i = h1Var;
            this.f21089L = bVar.f20931k;
            this.f21083F = bVar.f20932l;
            this.f21117y = bVar.f20937q;
            this.f21118z = bVar.f20938r;
            this.f21085H = bVar.f20936p;
            this.f21107o = bVar.f20945y;
            SurfaceHolder$CallbackC6723b bVar2 = new SurfaceHolder$CallbackC6723b();
            this.f21098f = bVar2;
            C6724c cVar = new C6724c();
            this.f21099g = cVar;
            this.f21100h = new CopyOnWriteArraySet<>();
            Handler handler = new Handler(bVar.f20930j);
            AbstractC6696s2[] a = bVar.f20924d.get().mo19395a(handler, bVar2, bVar2, bVar2, bVar2);
            this.f21094b = a;
            this.f21084G = 1.0f;
            if (C1216l0.f4526a < 21) {
                this.f21082E = m19380K0(0);
            } else {
                this.f21082E = C1216l0.m38017C(applicationContext);
            }
            this.f21086I = Collections.emptyList();
            this.f21087J = true;
            AbstractC6618i2.C6620b.C6621a aVar = new AbstractC6618i2.C6620b.C6621a();
            int[] iArr = new int[8];
            iArr[0] = 21;
            iArr[1] = 22;
            iArr[2] = 23;
            try {
                iArr[3] = 24;
                iArr[4] = 25;
                iArr[5] = 26;
                iArr[6] = 27;
                iArr[7] = 28;
                C6726z0 z0Var = new C6726z0(a, bVar.f20926f.get(), bVar.f20925e.get(), bVar.f20927g.get(), bVar.f20928h.get(), h1Var, bVar.f20939s, bVar.f20940t, bVar.f20941u, bVar.f20942v, bVar.f20943w, bVar.f20944x, bVar.f20946z, bVar.f20922b, bVar.f20930j, this, aVar.m19767c(iArr).m19765e());
                y2Var = this;
                try {
                    y2Var.f21097e = z0Var;
                    z0Var.m19319A0(bVar2);
                    z0Var.m19216z0(bVar2);
                    long j = bVar.f20923c;
                    if (j > 0) {
                        z0Var.m19307H0(j);
                    }
                    C6558b bVar3 = new C6558b(bVar.f20921a, handler, bVar2);
                    y2Var.f21102j = bVar3;
                    bVar3.m20105b(bVar.f20935o);
                    C6581d dVar = new C6581d(bVar.f20921a, handler, bVar2);
                    y2Var.f21103k = dVar;
                    dVar.m19952m(bVar.f20933m ? y2Var.f21083F : null);
                    C6564b3 b3Var = new C6564b3(bVar.f20921a, handler, bVar2);
                    y2Var.f21104l = b3Var;
                    b3Var.m20097h(C1216l0.m37988Y(y2Var.f21083F.f24332c));
                    C6650m3 m3Var = new C6650m3(bVar.f20921a);
                    y2Var.f21105m = m3Var;
                    m3Var.m19665a(bVar.f20934n != 0);
                    C6657n3 n3Var = new C6657n3(bVar.f20921a);
                    y2Var.f21106n = n3Var;
                    n3Var.m19647a(bVar.f20934n == 2);
                    y2Var.f21092O = m19385G0(b3Var);
                    y2Var.f21093P = C1607b0.f5883N;
                    y2Var.m19373P0(1, 10, Integer.valueOf(y2Var.f21082E));
                    y2Var.m19373P0(2, 10, Integer.valueOf(y2Var.f21082E));
                    y2Var.m19373P0(1, 3, y2Var.f21083F);
                    y2Var.m19373P0(2, 4, Integer.valueOf(y2Var.f21117y));
                    y2Var.m19373P0(2, 5, Integer.valueOf(y2Var.f21118z));
                    y2Var.m19373P0(1, 9, Boolean.valueOf(y2Var.f21085H));
                    y2Var.m19373P0(2, 7, cVar);
                    y2Var.m19373P0(6, 8, cVar);
                    gVar.m38076e();
                } catch (Throwable th2) {
                    th = th2;
                    y2Var.f21095c.m38076e();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                y2Var = this;
            }
        } catch (Throwable th4) {
            th = th4;
            y2Var = this;
        }
    }

    public static C6658o m19385G0(C6564b3 b3Var) {
        return new C6658o(0, b3Var.m20101d(), b3Var.m20102c());
    }

    public static int m19381J0(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    @Override
    public void mo19393A(int i, AbstractC7230t tVar) {
        m19365X0();
        this.f21097e.m19320A(i, tVar);
    }

    @Override
    public void mo19391B(C7602e eVar, boolean z) {
        m19365X0();
        if (!this.f21091N) {
            if (!C1216l0.m37982c(this.f21083F, eVar)) {
                this.f21083F = eVar;
                m19373P0(1, 3, eVar);
                this.f21104l.m20097h(C1216l0.m37988Y(eVar.f24332c));
                this.f21101i.mo7363V(eVar);
                Iterator<AbstractC6618i2.AbstractC6624e> it = this.f21100h.iterator();
                while (it.hasNext()) {
                    it.next().mo7363V(eVar);
                }
            }
            C6581d dVar = this.f21103k;
            if (!z) {
                eVar = null;
            }
            dVar.m19952m(eVar);
            boolean k = mo19255k();
            int p = this.f21103k.m19949p(k, mo19217z());
            m19367V0(k, p, m19381J0(k, p));
        }
    }

    @Override
    public int mo19316C() {
        m19365X0();
        return this.f21097e.mo19316C();
    }

    @Override
    public int mo19314D() {
        m19365X0();
        return this.f21097e.mo19314D();
    }

    @Override
    public void mo19312E(int i) {
        m19365X0();
        this.f21097e.mo19312E(i);
    }

    @Deprecated
    public void m19387E0(AbstractC6618i2.AbstractC6622c cVar) {
        C1186a.m38185e(cVar);
        this.f21097e.m19319A0(cVar);
    }

    public void m19386F0() {
        m19365X0();
        m19374O0();
        m19369T0(null);
        m19379L0(0, 0);
    }

    @Override
    public void mo19308H(int i, int i2, int i3) {
        m19365X0();
        this.f21097e.mo19308H(i, i2, i3);
    }

    public boolean m19384H0() {
        m19365X0();
        return this.f21097e.m19309G0();
    }

    @Override
    public void mo19383I(AbstractC6618i2.AbstractC6624e eVar) {
        C1186a.m38185e(eVar);
        this.f21100h.remove(eVar);
        m19376N0(eVar);
    }

    public Looper m19382I0() {
        return this.f21097e.m19306I0();
    }

    @Override
    public C7233t0 mo19305J() {
        m19365X0();
        return this.f21097e.mo19305J();
    }

    @Override
    public int mo19303K() {
        m19365X0();
        return this.f21097e.mo19303K();
    }

    public final int m19380K0(int i) {
        AudioTrack audioTrack = this.f21110r;
        if (!(audioTrack == null || audioTrack.getAudioSessionId() == i)) {
            this.f21110r.release();
            this.f21110r = null;
        }
        if (this.f21110r == null) {
            this.f21110r = new AudioTrack(3, 4000, 4, 2, 2, 0, i);
        }
        return this.f21110r.getAudioSessionId();
    }

    @Override
    public AbstractC6604g3 mo19301L() {
        m19365X0();
        return this.f21097e.mo19301L();
    }

    public final void m19379L0(int i, int i2) {
        if (i != this.f21078A || i2 != this.f21079B) {
            this.f21078A = i;
            this.f21079B = i2;
            this.f21101i.mo7354f0(i, i2);
            Iterator<AbstractC6618i2.AbstractC6624e> it = this.f21100h.iterator();
            while (it.hasNext()) {
                it.next().mo7354f0(i, i2);
            }
        }
    }

    @Override
    public void mo19378M(AbstractC7230t tVar) {
        m19365X0();
        this.f21097e.m19299M(tVar);
    }

    public final void m19377M0() {
        this.f21101i.mo7362a(this.f21085H);
        Iterator<AbstractC6618i2.AbstractC6624e> it = this.f21100h.iterator();
        while (it.hasNext()) {
            it.next().mo7362a(this.f21085H);
        }
    }

    @Override
    public boolean mo19297N() {
        m19365X0();
        return this.f21097e.mo19297N();
    }

    @Deprecated
    public void m19376N0(AbstractC6618i2.AbstractC6622c cVar) {
        this.f21097e.m19232s1(cVar);
    }

    @Override
    public void mo19375O(TextureView textureView) {
        m19365X0();
        if (textureView == null) {
            m19386F0();
            return;
        }
        m19374O0();
        this.f21116x = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            C1230s.m37881i("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f21098f);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            m19369T0(null);
            m19379L0(0, 0);
            return;
        }
        m19370S0(surfaceTexture);
        m19379L0(textureView.getWidth(), textureView.getHeight());
    }

    public final void m19374O0() {
        if (this.f21114v != null) {
            this.f21097e.m19311E0(this.f21099g).m19649n(10000).m19650m(null).m19651l();
            this.f21114v.m30425i(this.f21098f);
            this.f21114v = null;
        }
        TextureView textureView = this.f21116x;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f21098f) {
                C1230s.m37881i("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f21116x.setSurfaceTextureListener(null);
            }
            this.f21116x = null;
        }
        SurfaceHolder surfaceHolder = this.f21113u;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f21098f);
            this.f21113u = null;
        }
    }

    @Override
    public void mo19294P(AbstractC6618i2.AbstractC6624e eVar) {
        C1186a.m38185e(eVar);
        this.f21100h.add(eVar);
        m19387E0(eVar);
    }

    public final void m19373P0(int i, int i2, Object obj) {
        AbstractC6696s2[] s2VarArr;
        for (AbstractC6696s2 s2Var : this.f21094b) {
            if (s2Var.mo19431k() == i) {
                this.f21097e.m19311E0(s2Var).m19649n(i2).m19650m(obj).m19651l();
            }
        }
    }

    @Override
    public long mo19292Q() {
        m19365X0();
        return this.f21097e.mo19292Q();
    }

    public final void m19372Q0() {
        m19373P0(1, 2, Float.valueOf(this.f21084G * this.f21103k.m19958g()));
    }

    public final void m19371R0(SurfaceHolder surfaceHolder) {
        this.f21115w = false;
        this.f21113u = surfaceHolder;
        surfaceHolder.addCallback(this.f21098f);
        Surface surface = this.f21113u.getSurface();
        if (surface == null || !surface.isValid()) {
            m19379L0(0, 0);
            return;
        }
        Rect surfaceFrame = this.f21113u.getSurfaceFrame();
        m19379L0(surfaceFrame.width(), surfaceFrame.height());
    }

    public final void m19370S0(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        m19369T0(surface);
        this.f21112t = surface;
    }

    public final void m19369T0(Object obj) {
        boolean z;
        ArrayList<C6654n2> arrayList = new ArrayList();
        AbstractC6696s2[] s2VarArr = this.f21094b;
        int length = s2VarArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= length) {
                break;
            }
            AbstractC6696s2 s2Var = s2VarArr[i];
            if (s2Var.mo19431k() == 2) {
                arrayList.add(this.f21097e.m19311E0(s2Var).m19649n(1).m19650m(obj).m19651l());
            }
            i++;
        }
        Object obj2 = this.f21111s;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                for (C6654n2 n2Var : arrayList) {
                    n2Var.m19662a(this.f21107o);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj3 = this.f21111s;
            Surface surface = this.f21112t;
            if (obj3 == surface) {
                surface.release();
                this.f21112t = null;
            }
        }
        this.f21111s = obj;
        if (z) {
            this.f21097e.m19218y1(false, C6681q.m19579j(new C6590e1(3), 1003));
        }
    }

    public void m19368U0(SurfaceHolder surfaceHolder) {
        m19365X0();
        if (surfaceHolder == null) {
            m19386F0();
            return;
        }
        m19374O0();
        this.f21115w = true;
        this.f21113u = surfaceHolder;
        surfaceHolder.addCallback(this.f21098f);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            m19369T0(null);
            m19379L0(0, 0);
            return;
        }
        m19369T0(surface);
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        m19379L0(surfaceFrame.width(), surfaceFrame.height());
    }

    public final void m19367V0(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        this.f21097e.m19220x1(z2, i3, i2);
    }

    public final void m19366W0() {
        int z = mo19217z();
        boolean z2 = true;
        if (z != 1) {
            if (z == 2 || z == 3) {
                boolean H0 = m19384H0();
                C6650m3 m3Var = this.f21105m;
                if (!mo19255k() || H0) {
                    z2 = false;
                }
                m3Var.m19664b(z2);
                this.f21106n.m19646b(mo19255k());
                return;
            } else if (z != 4) {
                throw new IllegalStateException();
            }
        }
        this.f21105m.m19664b(false);
        this.f21106n.m19646b(false);
    }

    public final void m19365X0() {
        this.f21095c.m38079b();
        if (Thread.currentThread() != m19382I0().getThread()) {
            String z = C1216l0.m37936z("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), m19382I0().getThread().getName());
            if (!this.f21087J) {
                C1230s.m37880j("SimpleExoPlayer", z, this.f21088K ? null : new IllegalStateException());
                this.f21088K = true;
                return;
            }
            throw new IllegalStateException(z);
        }
    }

    @Override
    public void mo19281a() {
        AudioTrack audioTrack;
        m19365X0();
        if (C1216l0.f4526a < 21 && (audioTrack = this.f21110r) != null) {
            audioTrack.release();
            this.f21110r = null;
        }
        this.f21102j.m20105b(false);
        this.f21104l.m20098g();
        this.f21105m.m19664b(false);
        this.f21106n.m19646b(false);
        this.f21103k.m19956i();
        this.f21097e.mo19281a();
        this.f21101i.m17708I2();
        m19374O0();
        Surface surface = this.f21112t;
        if (surface != null) {
            surface.release();
            this.f21112t = null;
        }
        if (this.f21090M) {
            ((C1193d0) C1186a.m38185e(this.f21089L)).m38097b(0);
            this.f21090M = false;
        }
        this.f21086I = Collections.emptyList();
        this.f21091N = true;
    }

    @Override
    public void mo19279b() {
        m19365X0();
        boolean k = mo19255k();
        int p = this.f21103k.m19949p(k, 2);
        m19367V0(k, p, m19381J0(k, p));
        this.f21097e.mo19279b();
    }

    @Override
    public void mo19275d(C6613h2 h2Var) {
        m19365X0();
        this.f21097e.mo19275d(h2Var);
    }

    @Override
    public void mo19362e(int i, List<AbstractC7230t> list) {
        m19365X0();
        this.f21097e.m19272e(i, list);
    }

    @Override
    public void mo19360f(float f) {
        m19365X0();
        float o = C1216l0.m37958o(f, 0.0f, 1.0f);
        if (this.f21084G != o) {
            this.f21084G = o;
            m19372Q0();
            this.f21101i.mo7338u(o);
            Iterator<AbstractC6618i2.AbstractC6624e> it = this.f21100h.iterator();
            while (it.hasNext()) {
                it.next().mo7338u(o);
            }
        }
    }

    @Override
    public long mo19267g() {
        m19365X0();
        return this.f21097e.mo19267g();
    }

    @Override
    public boolean mo19264h() {
        m19365X0();
        return this.f21097e.mo19264h();
    }

    @Override
    public long mo19261i() {
        m19365X0();
        return this.f21097e.mo19261i();
    }

    @Override
    public void mo19258j(int i, long j) {
        m19365X0();
        this.f21101i.m17712H2();
        this.f21097e.mo19258j(i, j);
    }

    @Override
    public boolean mo19255k() {
        m19365X0();
        return this.f21097e.mo19255k();
    }

    @Override
    public void mo19252l(boolean z) {
        m19365X0();
        this.f21097e.mo19252l(z);
    }

    @Override
    public int mo19249m() {
        m19365X0();
        return this.f21097e.mo19249m();
    }

    @Override
    public int mo19246n() {
        m19365X0();
        return this.f21097e.mo19246n();
    }

    @Override
    public void mo19350o(SurfaceView surfaceView) {
        m19365X0();
        if (surfaceView instanceof AbstractC1621k) {
            m19374O0();
            m19369T0(surfaceView);
            m19371R0(surfaceView.getHolder());
        } else if (surfaceView instanceof SphericalGLSurfaceView) {
            m19374O0();
            this.f21114v = (SphericalGLSurfaceView) surfaceView;
            this.f21097e.m19311E0(this.f21099g).m19649n(10000).m19650m(this.f21114v).m19651l();
            this.f21114v.m30430d(this.f21098f);
            m19369T0(this.f21114v.getVideoSurface());
            m19371R0(surfaceView.getHolder());
        } else {
            m19368U0(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    @Override
    public void mo19348p(List<AbstractC7230t> list) {
        m19365X0();
        this.f21097e.m19241p(list);
    }

    @Override
    public void mo19344s(List<AbstractC7230t> list) {
        m19365X0();
        this.f21097e.m19234s(list);
    }

    @Override
    public void mo19231t(int i, int i2) {
        m19365X0();
        this.f21097e.mo19231t(i, i2);
    }

    @Override
    public void mo19340v(boolean z) {
        m19365X0();
        int p = this.f21103k.m19949p(z, mo19217z());
        m19367V0(z, p, m19381J0(z, p));
    }

    @Override
    public long mo19222x() {
        m19365X0();
        return this.f21097e.mo19222x();
    }

    @Override
    public int mo19217z() {
        m19365X0();
        return this.f21097e.mo19217z();
    }
}
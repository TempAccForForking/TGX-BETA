package p038ce;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.C0962g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1359b;
import be.C1362c;
import be.C1363c0;
import be.C1379j0;
import be.C1399s0;
import be.C1410y;
import gd.AbstractC4718o;
import gd.C4756s;
import gd.C4779t2;
import ie.C5428t;
import ie.RunnableC5390g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.C6879f3;
import me.C7030t1;
import me.RunnableC6969m2;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.widget.SparseDrawableView;
import p037cb.C2057b;
import p037cb.C2065g;
import p038ce.x00;
import p051db.C3940f;
import p051db.C3950k;
import p053dd.C4007j;
import p080fb.C4341g;
import p082fd.C4403w;
import p108hb.C5062b;
import p108hb.C5064d;
import p108hb.C5069h;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5146u0;
import p124ib.C5320c;
import p156kd.C6238b;
import p156kd.C6243f;
import p156kd.C6257p;
import p291uc.AbstractC9622o0;
import p292ud.C9773p0;
import p335xd.C10192g;
import p350yd.C10756j9;
import p350yd.C10930q6;
import p350yd.C11031u1;
import p350yd.C11052v1;
import p364zd.C11524j;
import sc.C8731d;
import td.AbstractC9201h1;
import td.AbstractC9213j1;
import td.AbstractC9323v4;
import td.C9270q1;
import td.View$OnClickListenerC9170d1;

public class View$OnClickListenerC2667lk extends AbstractC9323v4<Void> implements AbstractC9201h1, AbstractC9213j1, View.OnClickListener, C9773p0.AbstractC9778e, C9773p0.AbstractC9779f, C10756j9.AbstractC10759c, C9773p0.AbstractC9776c, C11052v1.AbstractC11053a {
    public HandlerC2677h f9012A0;
    public boolean f9013B0;
    public boolean f9014C0;
    public long f9015D0;
    public long f9016E0;
    public long f9017F0;
    public boolean f9018G0;
    public boolean f9019H0;
    public List<TdApi.Message> f9020I0;
    public boolean f9021J0 = true;
    public C4756s f9022K0;
    public int f9023L0;
    public long f9024M0;
    public boolean f9025N0;
    public float f9026O0;
    public float f9027P0;
    public int f9028n0;
    public C2546iq f9029o0;
    public List<C2964ra> f9030p0;
    public long f9031q0;
    public C2673e f9032r0;
    public C2675f f9033s0;
    public C2670c f9034t0;
    public C6879f3 f9035u0;
    public ImageView f9036v0;
    public ImageView f9037w0;
    public ImageView f9038x0;
    public ImageView f9039y0;
    public C2676g f9040z0;

    public class C2668a extends C2546iq {
        public C2668a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo393t2(C2964ra raVar, int i, C7030t1 t1Var) {
            if (View$OnClickListenerC2667lk.this.f30167b.m2930B4().m4636w2().m7068a0()) {
                t1Var.m18058E1(C4403w.m27862k0(R.string.format_tracksAndDuration, C4403w.m27836q2(R.string.xAudios, View$OnClickListenerC2667lk.this.m33913Gf()), C1363c0.m37433h(View$OnClickListenerC2667lk.this.f9031q0)));
            } else {
                t1Var.m18057F1();
            }
        }
    }

    public class C2669b extends C0962g.AbstractC0968f {
        public final C0962g[] f9042d;

        public C2669b(C0962g[] gVarArr) {
            this.f9042d = gVarArr;
        }

        @Override
        public void mo9884B(RecyclerView.AbstractC0886d0 d0Var, int i) {
            if ((i & 12) != 0) {
                this.f9042d[0].mo8197b(d0Var.f3479a);
            }
            if (i == 4) {
                ((C4007j.AbstractC4011d) d0Var.f3479a).mo5812V0();
                View$OnClickListenerC2667lk.this.m33887Xf((C4756s) ((C2964ra) d0Var.f3479a.getTag()).m32844d());
            }
        }

        @Override
        public int mo9880k(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var) {
            int k;
            if (!View$OnClickListenerC2667lk.this.m33906Nf() && (k = d0Var.m39335k()) != -1 && k >= 1 && d0Var.m39332n() == 41) {
                return C0962g.AbstractC0968f.m38781t(3, 4);
            }
            return 0;
        }

        @Override
        public boolean mo29334q() {
            return true;
        }

        @Override
        public boolean mo9879r() {
            return true;
        }

        @Override
        public void mo9878u(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, float f, float f2, int i, boolean z) {
            if (i != 1) {
                super.mo9878u(canvas, recyclerView, d0Var, f, f2, i, z);
            }
            View view = d0Var.f3479a;
            if (view instanceof C4007j.AbstractC4011d) {
                ((C4007j.AbstractC4011d) view).setRemoveDx(f);
            }
        }

        @Override
        public boolean mo9877y(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, RecyclerView.AbstractC0886d0 d0Var2) {
            int i;
            int k = d0Var.m39335k();
            int k2 = d0Var2.m39335k();
            int Gf = View$OnClickListenerC2667lk.this.m33913Gf();
            if (k < 1 || k >= (i = Gf + 1) || k2 < 1 || k2 >= i) {
                return false;
            }
            int i2 = k - 1;
            int i3 = k2 - 1;
            if ((View$OnClickListenerC2667lk.this.f9023L0 & Log.TAG_ROUND) != 0) {
                i2 = (Gf - i2) - 1;
                i3 = (Gf - i3) - 1;
            }
            View$OnClickListenerC2667lk.this.m33899Rf(i2, i3, true);
            return true;
        }

        @Override
        public void mo9876z(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, int i, RecyclerView.AbstractC0886d0 d0Var2, int i2, int i3, int i4) {
            super.mo9876z(recyclerView, d0Var, i, d0Var2, i2, i3, i4);
            d0Var.f3479a.invalidate();
            d0Var2.f3479a.invalidate();
        }
    }

    public static class C2670c extends SparseDrawableView implements C3950k.AbstractC3952b, C4341g.AbstractC4342a {
        public View$OnClickListenerC2667lk f9045N;
        public boolean f9046O;
        public RunnableC6969m2 f9049R;
        public boolean f9051T;
        public C3940f f9052U;
        public float f9053V;
        public float f9054W;
        public C3950k f9055a0;
        public float f9057b0;
        public boolean f9059c0;
        public String f9060d0;
        public String f9061e0;
        public RunnableC5390g f9062f0;
        public RunnableC5390g f9063g0;
        public int f9064h0;
        public float f9065i0;
        public boolean f9066j0;
        public C3950k f9067k0;
        public String f9068l0;
        public String f9069m0;
        public float f9070n0;
        public float f9075s0;
        public float f9076t0;
        public C3950k f9077u0;
        public C3950k f9078v0;
        public C4756s f9079w0;
        public AbstractC9622o0 f9080x0;
        public float f9081y0;
        public long f9071o0 = -1;
        public long f9072p0 = -1;
        public int f9073q0 = -1;
        public int f9074r0 = -1;
        public final Drawable f9050S = C1362c.m37482g(getResources(), R.drawable.baseline_music_note_48);
        public Paint f9047P = new Paint(5);
        public Paint f9048Q = new Paint(5);
        public final C6238b f9056b = new C6238b(this);
        public final C6257p f9058c = new C6257p(this, 0);
        public final C6257p f9044M = new C6257p(this, 0);

        public class C2671a extends Drawable {
            public C2671a() {
            }

            @Override
            public void draw(Canvas canvas) {
                float Af = C2670c.this.f9045N.m33919Af();
                canvas.drawRect(0.0f, 0.0f, getBounds().right, Af, C1410y.m37039g(C11524j.m148w()));
                if (C2670c.this.f9045N.f9035u0.getTranslationY() != Af) {
                    C2670c.this.f9045N.f9035u0.setTranslationY(Af);
                }
                if (C2670c.this.f9045N.m33903Pf()) {
                    C2670c.this.f9045N.f9035u0.setAlpha(C2670c.this.m33841G());
                }
            }

            @Override
            public int getOpacity() {
                return 0;
            }

            @Override
            public void setAlpha(int i) {
            }

            @Override
            public void setColorFilter(ColorFilter colorFilter) {
            }
        }

        public C2670c(Context context) {
            super(context);
            RunnableC6969m2 m2Var = new RunnableC6969m2(C1379j0.m37307r(context), C1357a0.m37541i(4.0f));
            this.f9049R = m2Var;
            m2Var.m18286d(16777215);
            this.f9049R.m18289a(this);
            this.f9047P.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, C6879f3.m18691q(), C6879f3.m18690r(), (float[]) null, Shader.TileMode.CLAMP));
            float K = m33838K();
            this.f9048Q.setShader(new RadialGradient(K, K, K, 268435456, 0, Shader.TileMode.CLAMP));
            m33821f0(true);
            C2065g.m35718d(this, new C2671a());
        }

        public static int m33838K() {
            return C1357a0.m37541i(28.0f);
        }

        public final long m33846A() {
            long j = this.f9072p0;
            return (long) Math.max(0.0d, Math.min(j, j * this.f9057b0));
        }

        public final void m33845B0(float f) {
            if (this.f9076t0 != f) {
                this.f9076t0 = f;
                invalidate();
            }
        }

        public final boolean m33844C0(int i) {
            if (this.f9073q0 == i) {
                return false;
            }
            this.f9073q0 = i;
            this.f9068l0 = C1363c0.m37433h(i);
            return true;
        }

        public final float m33843E() {
            long j = this.f9072p0;
            if (j > 0) {
                long j2 = this.f9071o0;
                if (j2 > 0) {
                    return C5069h.m24089d((float) (j2 / j));
                }
            }
            return 0.0f;
        }

        public final void m33842F0(float f) {
            if (this.f9075s0 != f) {
                this.f9075s0 = f;
                invalidate();
            }
        }

        public final float m33841G() {
            return this.f9065i0;
        }

        public final int m33840J() {
            int i = C1357a0.m37541i(58.0f);
            int i2 = C1357a0.m37541i(50.0f);
            return getMeasuredWidth() - (((i + i2) + C1357a0.m37541i(13.0f)) + C1357a0.m37541i(30.0f));
        }

        public final void m33839J0(float f) {
            if (this.f9053V != f) {
                this.f9053V = f;
                invalidate();
            }
        }

        public final float m33837L() {
            float E = m33843E();
            float f = this.f9053V;
            return f == 0.0f ? E : E + ((this.f9057b0 - E) * f);
        }

        public final int m33836M() {
            RunnableC5390g gVar = this.f9063g0;
            if (gVar != null) {
                return gVar.getWidth();
            }
            return 0;
        }

        public final void m33835M0(float f) {
            if (this.f9054W != f) {
                this.f9054W = f;
                invalidate();
            }
        }

        public final void m33834O0(float f, boolean z) {
            if (z) {
                if (this.f9055a0 == null) {
                    this.f9055a0 = new C3950k(4, this, C2057b.f7280b, 90L, this.f9054W);
                }
                this.f9055a0.m29544i(f);
                return;
            }
            C3950k kVar = this.f9055a0;
            if (kVar != null) {
                kVar.m29541l(f);
            }
            m33835M0(f);
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            if (i == 0) {
                m33842F0(f);
            } else if (i == 1) {
                setCollapseFactor(f);
            } else if (i == 3) {
                m33839J0(f);
            } else if (i == 4) {
                m33835M0(f);
            } else if (i == 5) {
                m33827b0(f);
            } else if (i == 6) {
                m33845B0(f);
            }
        }

        public final void m33833Q0(boolean z, boolean z2) {
            if (this.f9051T != z) {
                this.f9051T = z;
                if (this.f9052U == null) {
                    this.f9052U = new C3940f(3, this, C2057b.f7280b, 180L, !z);
                }
                getParent().requestDisallowInterceptTouchEvent(z);
                if (!z && z2) {
                    long A = m33846A();
                    this.f9045N.mo4348c().m2930B4().m4636w2().m7077V0(this.f9079w0.getMessage(), A);
                    m33817s0(A, this.f9072p0);
                }
                this.f9052U.m29575p(z, true);
                if (m33819j0()) {
                    invalidate();
                }
            }
        }

        public final int m33832R() {
            RunnableC5390g gVar = this.f9062f0;
            if (gVar != null) {
                return gVar.getWidth();
            }
            return 0;
        }

        public void m33831S(View$OnClickListenerC2667lk lkVar) {
            this.f9045N = lkVar;
        }

        public final void m33830T(boolean z) {
            C4756s sVar = this.f9079w0;
            AbstractC9622o0 q = sVar != null ? sVar.m26335q() : null;
            this.f9080x0 = q;
            if (this.f9079w0 == null) {
                this.f9056b.m20999d();
                this.f9058c.clear();
                this.f9044M.clear();
            } else if (!z) {
                if (q != null) {
                    q.mo7955f(this.f9056b, false);
                } else {
                    this.f9056b.m20999d();
                }
                C6243f fVar = new C6243f(this.f9079w0.m26345V(), this.f9079w0.getMessage());
                fVar.m20908l0();
                fVar.mo20767t0(C1357a0.m37553B());
                fVar.m20897s0(2);
                this.f9044M.m20819G(fVar);
            }
        }

        public final boolean m33829U0(String str) {
            if (C5070i.m24067c(this.f9061e0, str)) {
                return false;
            }
            this.f9061e0 = str;
            m33824d1();
            return true;
        }

        public final void m33828W0() {
            if (!this.f9059c0) {
                this.f9059c0 = true;
                this.f9045N.m33917Cf().sendMessageDelayed(Message.obtain(this.f9045N.m33917Cf(), 1), 38L);
            }
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
        }

        @Override
        public void mo13519a() {
            m33830T(true);
        }

        public final void m33827b0(float f) {
            if (this.f9081y0 != f) {
                this.f9081y0 = f;
                this.f9049R.m18275o(f);
                invalidate();
            }
        }

        public final boolean m33826c1(String str) {
            if (C5070i.m24067c(this.f9060d0, str)) {
                return false;
            }
            this.f9060d0 = str;
            m33822e1();
            return true;
        }

        public final void m33825d0(boolean z, boolean z2) {
            boolean z3 = z2 && !this.f9046O && this.f9045N.f9021J0;
            if (this.f9066j0 != z || !z3) {
                this.f9066j0 = z;
                float f = z ? 1.0f : 0.0f;
                if (z3) {
                    if (this.f9067k0 == null) {
                        this.f9067k0 = new C3950k(1, this, C2057b.f7280b, 220L, this.f9065i0);
                    }
                    this.f9067k0.m29544i(f);
                    return;
                }
                C3950k kVar = this.f9067k0;
                if (kVar != null) {
                    kVar.m29541l(f);
                }
                setCollapseFactor(f);
            }
        }

        public final void m33824d1() {
            this.f9063g0 = C5070i.m24061i(this.f9061e0) ? null : new RunnableC5390g.C5392b(this.f9061e0, m33840J(), C1410y.m37038g0(), C5428t.AbstractC5441d.f17873D).m22868v().m22884f();
        }

        public final void m33823e0(float f) {
            if (this.f9057b0 != f) {
                this.f9057b0 = f;
                if (this.f9051T) {
                    m33828W0();
                }
                if (this.f9053V > 0.0f) {
                    invalidate();
                }
            }
        }

        public final void m33822e1() {
            this.f9062f0 = C5070i.m24061i(this.f9060d0) ? null : new RunnableC5390g.C5392b(this.f9060d0, m33840J(), C1410y.m37018q0(), C5428t.AbstractC5441d.f17872C).m22888b().m22868v().m22884f();
        }

        public void m33821f0(boolean z) {
            this.f9046O = z;
            this.f9056b.m20985r(z);
            this.f9058c.mo20251S0(z);
            this.f9044M.mo20251S0(z);
        }

        public final boolean m33820g0(int i) {
            if (this.f9074r0 == i) {
                return false;
            }
            this.f9074r0 = i;
            StringBuilder sb2 = new StringBuilder(5);
            sb2.append('-');
            C1363c0.m37431i(this.f9074r0, TimeUnit.SECONDS, false, sb2);
            String sb3 = sb2.toString();
            this.f9069m0 = sb3;
            this.f9070n0 = C7389v0.m16680T1(sb3, C1410y.m37048b0(12.0f));
            return true;
        }

        public final boolean m33819j0() {
            long j;
            long j2 = this.f9072p0;
            if (this.f9051T) {
                j = m33846A();
            } else {
                j = this.f9071o0;
            }
            int max = Math.max(0, (int) Math.floor(j / 1000.0d));
            return m33820g0(Math.max(max, (int) Math.floor(((double) j2) / 1000.0d)) - max) || m33844C0(max);
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i;
            int i2;
            float f;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            View view;
            int i10;
            Drawable drawable;
            if (this.f9079w0 != null) {
                int measuredWidth = getMeasuredWidth();
                int Af = this.f9045N.m33919Af();
                int i11 = (Af - C1357a0.m37541i(34.0f)) - C1357a0.m37541i(30.0f);
                int min = Math.min(measuredWidth, C1357a0.m37541i(480.0f));
                int i12 = measuredWidth != min ? (measuredWidth / 2) - (min / 2) : 0;
                int i13 = C1357a0.m37541i(12.0f);
                int i14 = i12 + i13;
                int i15 = min - (i13 * 2);
                int i16 = i11 - C1357a0.m37541i(22.0f);
                int i17 = C1357a0.m37541i(10.0f);
                float G = m33841G();
                float f2 = 1.0f - G;
                int i18 = C1357a0.m37541i(58.0f);
                int i19 = C1357a0.m37541i(50.0f);
                int topOffset = View$OnClickListenerC9170d1.getTopOffset() + C1357a0.m37541i(5.0f);
                int Df = Af - View$OnClickListenerC2667lk.m33916Df();
                int i20 = measuredWidth / 2;
                float i21 = topOffset + C1357a0.m37541i(5.0f) + (((i - C1357a0.m37541i(98.0f)) - (topOffset + C1357a0.m37541i(19.0f))) * f2);
                float i22 = i18 + i19 + C1357a0.m37541i(13.0f);
                float R = (((i20 - (m33832R() / 2)) - i2) * f2) + i22;
                float M = i22 + (((i20 - (m33836M() / 2)) - i2) * f2);
                RunnableC5390g gVar = this.f9062f0;
                if (gVar != null) {
                    f = G;
                    gVar.m22903t(canvas, (int) R, (int) i21);
                } else {
                    f = G;
                }
                RunnableC5390g gVar2 = this.f9063g0;
                if (gVar2 != null) {
                    gVar2.m22903t(canvas, (int) M, ((int) i21) + C1357a0.m37541i(24.0f));
                }
                int U0 = C11524j.m213U0();
                float f3 = i11;
                canvas.drawText(this.f9068l0, i12 + i17, f3, C1410y.m37046c0(12.0f, U0));
                canvas.drawText(this.f9069m0, ((i12 + min) - this.f9070n0) - i17, f3, C1410y.m37046c0(12.0f, U0));
                float f4 = i15;
                float f5 = f4 * this.f9054W;
                float f6 = f4 * this.f9076t0;
                float f7 = f4 * this.f9075s0;
                int i23 = C1357a0.m37541i(2.0f);
                int N = C11524j.m228N(R.id.theme_color_seekDone);
                if (f6 > 0.0f || f7 < f4) {
                    float f8 = i16;
                    i4 = min;
                    i6 = N;
                    i3 = topOffset;
                    i5 = measuredWidth;
                    i7 = i23;
                    canvas.drawLine(i14, f8, i15 + i14, f8, C1410y.m37053Y(C11524j.m228N(R.id.theme_color_seekEmpty), i23));
                } else {
                    i4 = min;
                    i3 = topOffset;
                    i6 = N;
                    i5 = measuredWidth;
                    i7 = i23;
                }
                float f9 = i14;
                float f10 = f9 + f6;
                float f11 = i16;
                float f12 = i7;
                canvas.drawLine(f10, f11, f9 + f7, f11, C1410y.m37053Y(C11524j.m228N(R.id.theme_color_seekReady), f12));
                canvas.drawLine(f9, f11, f9 + f5, f11, C1410y.m37053Y(i6, f12));
                float L = f9 + (f4 * m33837L());
                canvas.drawCircle(L, f11, C1357a0.m37541i(6.0f) + (C1357a0.m37541i(4.0f) * this.f9053V), C1410y.m37039g(i6));
                if (this.f9081y0 > 0.0f) {
                    int i24 = C1357a0.m37541i(4.0f);
                    int i25 = (int) L;
                    this.f9049R.m18274p(i25 - i24, i16 - i24, i25 + i24, i16 + i24);
                    this.f9049R.m18287c(canvas);
                }
                float f13 = 1.0f - f2;
                int i26 = (int) (i18 * f13);
                int i27 = (int) (i3 * f13);
                int i28 = i19 + ((int) ((i5 - i19) * f2));
                int i29 = i19 + ((int) ((Df - i19) * f2));
                int i30 = (int) (C1357a0.m37541i(4.0f) * f13);
                boolean z = f2 < 0.5f;
                if (this.f9044M.mo20246c0() || z) {
                    int i31 = i26 + i28;
                    int i32 = i27 + i29;
                    this.f9058c.mo20256K0(i26, i27, i31, i32);
                    if (this.f9058c.mo20246c0()) {
                        AbstractC9622o0 o0Var = this.f9080x0;
                        if (o0Var == null || o0Var.mo7956e(this.f9056b)) {
                            if (i30 == 0) {
                                canvas.drawRect(i26, i27, i31, i32, C1410y.m37039g(C11524j.m228N(R.id.theme_color_playerCoverPlaceholder)));
                            } else {
                                RectF a0 = C1410y.m37050a0();
                                a0.set(i26, i27, i31, i32);
                                float f14 = i30;
                                canvas.drawRoundRect(a0, f14, f14, C1410y.m37039g(C11524j.m228N(R.id.theme_color_playerCoverPlaceholder)));
                            }
                            canvas.save();
                            canvas.clipRect(i26, i27, i31, i32);
                            int I0 = this.f9058c.mo20257I0();
                            int y0 = this.f9058c.mo20227y0();
                            float max = Math.max(this.f9058c.getWidth() / getMeasuredWidth(), this.f9058c.getHeight() / getMeasuredHeight()) * ((1.5f * f) + 2.0f);
                            if (max != 1.0f) {
                                canvas.scale(max, max, I0, y0);
                            }
                            C1362c.m37487b(canvas, this.f9050S, I0 - (drawable.getMinimumWidth() / 2), y0 - (this.f9050S.getMinimumHeight() / 2), C1410y.m37061Q());
                            canvas.restore();
                        }
                        AbstractC9622o0 o0Var2 = this.f9080x0;
                        if (o0Var2 != null) {
                            i8 = i30;
                            o0Var2.mo7957b(this, canvas, this.f9056b, i26, i27, i28, i29, i30, 1.0f);
                            this.f9058c.draw(canvas);
                        }
                    }
                    i8 = i30;
                    this.f9058c.draw(canvas);
                } else {
                    i8 = i30;
                }
                int i33 = i26 + i28;
                int i34 = i29 + i27;
                this.f9044M.mo20256K0(i26, i27, i33, i34);
                this.f9044M.draw(canvas);
                int i35 = (int) (255.0f * f2);
                if (f2 > 0.0f) {
                    this.f9047P.setAlpha((int) (i35 * 0.4f));
                    canvas.save();
                    int q = C6879f3.m18691q();
                    canvas.clipRect(i26, i27, i33, i34);
                    canvas.translate(i26, i34 - q);
                    canvas.drawRect(0.0f, 0.0f, i28, q, this.f9047P);
                    int K = m33838K();
                    i9 = 2;
                    int i36 = (C1357a0.m37541i(56.0f) / 2) - K;
                    int i37 = (i5 - (C1357a0.m37541i(49.0f) / 2)) - K;
                    this.f9048Q.setAlpha(i35);
                    canvas.translate(i36 - i26, ((View$OnClickListenerC9170d1.getTopOffset() + (View$OnClickListenerC9170d1.m10066c3(false) / 2)) - K) - i10);
                    float f15 = K * 2;
                    canvas.drawRect(0.0f, 0.0f, f15, f15, this.f9048Q);
                    canvas.translate(i37 - i36, 0.0f);
                    canvas.drawRect(0.0f, 0.0f, f15, f15, this.f9048Q);
                    canvas.restore();
                } else {
                    i9 = 2;
                }
                int i38 = i8;
                if (i38 > 0) {
                    RectF a02 = C1410y.m37050a0();
                    int i39 = i38 / 2;
                    int i40 = i39 / 2;
                    a02.set(i26 - i40, i27 - i40, i33 + i40, i34 + i40);
                    float f16 = i38;
                    canvas.drawRoundRect(a02, f16, f16, C1410y.m37053Y(C11524j.m148w(), i39));
                }
                int i41 = (i4 / 5) / 6;
                int i42 = (i20 - (i4 / 2)) + i41;
                int i43 = (i4 - (i41 * 2)) / 5;
                for (int i44 = 0; i44 < 5; i44++) {
                    if (i44 == 0) {
                        view = this.f9045N.f9036v0;
                    } else if (i44 == 1) {
                        view = this.f9045N.f9039y0;
                    } else if (i44 == i9) {
                        view = this.f9045N.f9040z0;
                    } else if (i44 == 3) {
                        view = this.f9045N.f9038x0;
                    } else if (i44 == 4) {
                        view = this.f9045N.f9037w0;
                    } else {
                        throw new IllegalArgumentException("i == " + i44);
                    }
                    view.setTranslationX((i42 + (i43 / 2)) - (view.getMeasuredWidth() / i9));
                    view.setTranslationY(i - (view.getMeasuredHeight() / i9));
                    i42 += i43;
                }
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int measuredWidth = getMeasuredWidth();
            if (this.f9064h0 != measuredWidth) {
                this.f9064h0 = measuredWidth;
                m33822e1();
                m33824d1();
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int measuredWidth = getMeasuredWidth();
            int Af = (this.f9045N.m33919Af() - C1357a0.m37541i(34.0f)) - C1357a0.m37541i(30.0f);
            int min = Math.min(measuredWidth, C1357a0.m37541i(480.0f));
            int i = measuredWidth != min ? (measuredWidth / 2) - (min / 2) : 0;
            int i2 = C1357a0.m37541i(12.0f);
            int i3 = i + i2;
            int i4 = min - (i2 * 2);
            int i5 = Af - C1357a0.m37541i(22.0f);
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                int i6 = (y > this.f9045N.m33919Af() ? 1 : (y == this.f9045N.m33919Af() ? 0 : -1));
                boolean z = i6 < 0 && this.f9072p0 > 0;
                if (z) {
                    z = C7389v0.m16600o1(i3 + (i4 * m33837L()), i5, x, y, C1357a0.m37541i(22.0f));
                }
                if (z) {
                    z = this.f9045N.mo4348c().m2930B4().m4636w2().m7014x(this.f9079w0.getMessage());
                }
                if (z) {
                    m33823e0(C5069h.m24089d((x - i3) / i4));
                }
                m33833Q0(z, false);
                if (!z) {
                    if (i6 >= 0) {
                        return false;
                    }
                    if (!this.f9066j0 && this.f9045N.f9032r0.m39457X(x, y) == null) {
                        return false;
                    }
                }
                return true;
            } else if (action != 1) {
                if (action == 2) {
                    if (this.f9051T) {
                        m33823e0(this.f9045N.mo4348c().m2930B4().m4636w2().m7041k0(this.f9072p0, C5069h.m24089d((x - i3) / i4)));
                    }
                    return this.f9051T;
                } else if (action != 3 || !this.f9051T) {
                    return false;
                } else {
                    m33833Q0(false, false);
                    return true;
                }
            } else if (!this.f9051T) {
                return false;
            } else {
                m33833Q0(false, true);
                return true;
            }
        }

        public final void m33818q0() {
            if (m33819j0()) {
                invalidate();
            }
            this.f9059c0 = false;
        }

        public void m33817s0(long j, long j2) {
            C4756s sVar = this.f9079w0;
            if (sVar != null) {
                if (j2 == -1) {
                    j2 = sVar.m26264c0().duration * 1000;
                }
                if (j == -1) {
                    j = 0;
                }
                if (m33813v0(j, j2)) {
                    invalidate();
                }
            }
        }

        public final void setCollapseFactor(float f) {
            if (this.f9065i0 != f) {
                this.f9065i0 = f;
                this.f9045N.m33865ig();
                invalidate();
            }
        }

        public final boolean m33813v0(long j, long j2) {
            if (this.f9071o0 == j && this.f9072p0 == j2) {
                return false;
            }
            this.f9071o0 = j;
            this.f9072p0 = j2;
            if (!this.f9051T) {
                m33819j0();
            }
            m33834O0(m33843E(), false);
            return true;
        }

        public void m33812w0(float f, float f2, boolean z) {
            float f3 = f2 + f;
            if (z) {
                C3950k kVar = this.f9077u0;
                if (kVar == null || kVar.m29533t() != f3) {
                    float f4 = this.f9075s0;
                    long j = f3 > f4 ? 160L : 120L;
                    C3950k kVar2 = this.f9077u0;
                    if (kVar2 == null) {
                        this.f9077u0 = new C3950k(0, this, C2057b.f7280b, j, f4);
                    } else {
                        kVar2.m29528y(j);
                    }
                    this.f9077u0.m29544i(f3);
                }
                C3950k kVar3 = this.f9078v0;
                if (kVar3 == null || kVar3.m29533t() != f) {
                    float f5 = this.f9076t0;
                    long j2 = f > f5 ? 160L : 120L;
                    C3950k kVar4 = this.f9078v0;
                    if (kVar4 == null) {
                        this.f9078v0 = new C3950k(6, this, C2057b.f7280b, j2, f5);
                    } else {
                        kVar4.m29528y(j2);
                    }
                    this.f9078v0.m29544i(f);
                    return;
                }
                return;
            }
            C3950k kVar5 = this.f9077u0;
            if (kVar5 != null) {
                kVar5.m29541l(f3);
            }
            m33842F0(f3);
            C3950k kVar6 = this.f9078v0;
            if (kVar6 != null) {
                kVar6.m29541l(f);
            }
            m33845B0(f);
        }

        public void m33810x0(C4756s sVar) {
            C4756s sVar2 = this.f9079w0;
            if (sVar2 != sVar) {
                if (sVar2 != null) {
                    sVar2.m26339i(this);
                }
                this.f9079w0 = sVar;
                m33833Q0(false, false);
                long j = 0;
                boolean z = true;
                if (sVar != null) {
                    sVar.m26341c(this);
                    boolean z2 = m33829U0(sVar.m26262e0()) || m33826c1(sVar.m26261f0());
                    long M = this.f9045N.mo4348c().m2930B4().m4636w2().m7096M(sVar.m26345V(), sVar.getMessage());
                    long K = this.f9045N.mo4348c().m2930B4().m4636w2().m7100K(sVar.m26345V(), sVar.getMessage());
                    if (K == -1) {
                        K = sVar.m26264c0().duration * 1000;
                    }
                    if (M != -1) {
                        j = M;
                    }
                    if (!m33813v0(j, K) && !z2) {
                        z = false;
                    }
                    if (z) {
                        invalidate();
                    }
                } else {
                    boolean z3 = m33829U0(null) || m33826c1(null);
                    if (!m33813v0(0L, 0L) && !z3) {
                        z = false;
                    }
                    if (z) {
                        invalidate();
                    }
                }
                m33830T(false);
            }
        }
    }

    public static class C2672d extends RecyclerView.AbstractC0901o {
        public final View$OnClickListenerC2667lk f9083a;

        public C2672d(View$OnClickListenerC2667lk lkVar) {
            this.f9083a = lkVar;
        }

        @Override
        public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            RecyclerView.AbstractC0886d0 l0 = recyclerView.m39418l0(view);
            C2964ra raVar = (C2964ra) view.getTag();
            if ((l0 == null || l0.m39335k() != 0) && (raVar == null || raVar.m32876A() != 73)) {
                rect.top = 0;
            } else {
                rect.top = this.f9083a.m33848yf(recyclerView.getMeasuredWidth(), recyclerView.getMeasuredHeight());
            }
        }
    }

    public static class C2673e extends RecyclerView {
        public View$OnClickListenerC2667lk f9084u1;
        public int f9085v1;

        public class C2674a extends RecyclerView.AbstractC0910t {
            public boolean f9086a;
            public final View$OnClickListenerC2667lk f9087b;

            public C2674a(View$OnClickListenerC2667lk lkVar) {
                this.f9087b = lkVar;
            }

            @Override
            public void mo7604a(RecyclerView recyclerView, int i) {
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                this.f9086a = z;
            }

            @Override
            public void mo421b(RecyclerView recyclerView, int i, int i2) {
                if (i2 != 0 && this.f9086a) {
                    this.f9087b.m33867hg();
                }
                this.f9087b.m33853tf(i == 0 && i2 == 0);
            }
        }

        public C2673e(Context context) {
            super(context);
        }

        public void m33808G1(View$OnClickListenerC2667lk lkVar) {
            this.f9084u1 = lkVar;
            m39422k(new C2674a(lkVar));
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                if (getAlpha() == 0.0f) {
                    return true;
                }
                if (!this.f9084u1.f9021J0 && motionEvent.getY() <= this.f9084u1.m33919Af()) {
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int measuredHeight = getMeasuredHeight();
            if (this.f9085v1 != measuredHeight) {
                if (!this.f9084u1.f9021J0) {
                    this.f9084u1.m33851vf(false);
                }
                if (this.f9085v1 != 0) {
                    m39504A0();
                    if (!this.f9084u1.m33901Qf(getMeasuredWidth(), getMeasuredHeight())) {
                        this.f9084u1.f9034t0.m33825d0(true, false);
                    } else {
                        this.f9084u1.m33852uf(true);
                    }
                } else if (!this.f9084u1.m33901Qf(getMeasuredWidth(), getMeasuredHeight())) {
                    this.f9084u1.f9034t0.m33825d0(true, false);
                }
                this.f9085v1 = measuredHeight;
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return !(getAlpha() == 0.0f && motionEvent.getAction() == 0) && super.onTouchEvent(motionEvent);
        }
    }

    public static class C2675f extends FrameLayoutFix {
        public View$OnClickListenerC2667lk f9089M;

        public C2675f(Context context) {
            super(context);
        }

        public void m33807C1(View$OnClickListenerC2667lk lkVar) {
            this.f9089M = lkVar;
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.f9089M.m33848yf(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2)), Log.TAG_TDLIB_OPTIONS));
        }
    }

    public static class C2676g extends View implements C3950k.AbstractC3952b {
        public float f9090M;
        public float f9092b = -1.0f;
        public final Path f9091a = new Path();
        public C3940f f9093c = new C3940f(0, this, C2057b.f7280b, 160);

        public C2676g(Context context) {
            super(context);
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            m33806a(f);
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
        }

        public void m33806a(float f) {
            if (this.f9090M != f) {
                this.f9090M = f;
                invalidate();
            }
        }

        public void m33805b(boolean z, boolean z2) {
            this.f9093c.m29575p(z, z2);
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i = C1357a0.m37541i(18.0f);
            Path path = this.f9091a;
            float f = this.f9092b;
            float f2 = this.f9090M;
            this.f9092b = f2;
            C1359b.m37499t(canvas, getMeasuredWidth() / 2, getMeasuredHeight() / 2, i, path, f, f2, 1.0f, C11524j.m228N(R.id.theme_color_playerButton));
        }
    }

    public static class HandlerC2677h extends Handler {
        public final View$OnClickListenerC2667lk f9094a;

        public HandlerC2677h(View$OnClickListenerC2667lk lkVar) {
            super(Looper.getMainLooper());
            this.f9094a = lkVar;
        }

        @Override
        public void handleMessage(Message message) {
            this.f9094a.m33889Wf(message);
        }
    }

    public View$OnClickListenerC2667lk(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public static int m33916Df() {
        return C1357a0.m37541i(112.0f) + View$OnClickListenerC9170d1.m10066c3(false);
    }

    public boolean m33905Of(C4756s sVar, View view, int i) {
        if (i == R.id.btn_delete) {
            this.f30167b.m2930B4().m4636w2().m7089P0(sVar.getMessage(), true);
        }
        return true;
    }

    public static C2964ra m33863jg(C4756s sVar) {
        sVar.m26257j0(true);
        return new C2964ra(41, R.id.btn_custom).m32870G(sVar);
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    @Override
    public void mo9477Ac() {
        super.mo9477Ac();
        View$OnClickListenerC9170d1 d1Var = this.f30156R;
        if (d1Var != null && this.f9034t0 != null) {
            d1Var.m10088T3(this, mo418W9(), this.f9034t0.m33841G());
        }
    }

    public final int m33919Af() {
        return m33918Bf(this.f9032r0.getMeasuredWidth(), this.f9032r0.getMeasuredHeight(), m33914Ff());
    }

    @Override
    public void mo6982B3(C10930q6 q6Var, TdApi.Message message, int i, List<TdApi.Message> list, long j, int i2, int i3) {
        if (this.f9013B0) {
            this.f9013B0 = false;
            m33873eg(i, true);
            return;
        }
        List<C2964ra> list2 = this.f9030p0;
        C2964ra raVar = list2.get(list2.size() - 1);
        int size = this.f9030p0.size() - 2;
        this.f9030p0.clear();
        C5062b.m24159m(this.f9030p0, list.size() + 1);
        this.f9030p0.add(this.f9030p0.get(0));
        if (m33854sf(this.f9030p0, q6Var, message, list, j, i2) != -1) {
            this.f9030p0.add(raVar);
            int size2 = this.f9030p0.size() - 2;
            this.f9029o0.m39309L(1, Math.min(size2, size));
            if (size2 > size) {
                this.f9029o0.m39308M(size + 1, size2 - size);
            } else if (size2 < size) {
                this.f9029o0.m39307N(size + 1, size - size2);
            }
            m33875dg((C4756s) this.f9030p0.get(this.f9028n0 + 1).m32844d(), true);
            m33893Uf();
            return;
        }
        throw new IllegalStateException();
    }

    public final int m33918Bf(int i, int i2, float f) {
        int yf = m33848yf(i, i2);
        if (!m33901Qf(i, i2)) {
            return yf;
        }
        float zf = m33847zf(i, i2, f);
        int Df = m33916Df() + View$OnClickListenerC9170d1.getTopOffset();
        return Df + ((int) ((yf - Df) * zf));
    }

    public final HandlerC2677h m33917Cf() {
        if (this.f9012A0 == null) {
            synchronized (this) {
                if (this.f9012A0 == null) {
                    this.f9012A0 = new HandlerC2677h(this);
                }
            }
        }
        return this.f9012A0;
    }

    @Override
    public void mo6981E4(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: p038ce.View$OnClickListenerC2667lk.mo6981E4(int):void");
    }

    public final int m33915Ef() {
        return C9773p0.m7094N(this.f9023L0) == 4 ? R.drawable.round_repeat_one_24 : R.drawable.round_repeat_24;
    }

    public final float m33914Ff() {
        return C5069h.m24089d(this.f9026O0);
    }

    @Override
    public void mo6980G3(C10930q6 q6Var, TdApi.Message message, int i, int i2) {
        if (!this.f9025N0) {
            m33899Rf(i, i2, false);
        }
    }

    public final int m33913Gf() {
        return this.f9030p0.size() - 2;
    }

    public final void m33912Hf() {
        m33911If(m33910Jf(), true);
    }

    public final void m33911If(int i, boolean z) {
        if (i != -1) {
            int xf = m33849xf();
            int measuredHeight = this.f9032r0.getMeasuredHeight();
            int i2 = C1357a0.m37541i(65.0f);
            int Gf = m33913Gf();
            int Df = m33916Df();
            int W = (((Gf * i2) + xf) - measuredHeight) + C2139ap.m35479W(42);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f9032r0.getLayoutManager();
            int X1 = linearLayoutManager.m39549X1();
            if (X1 != -1) {
                this.f9032r0.m39496D1();
                View C = linearLayoutManager.mo39262C(X1);
                int U = C != null ? linearLayoutManager.m39231U(C) : 0;
                int i3 = X1 == 0 ? -U : (-U) + xf + ((X1 - 1) * i2);
                int max = Math.max(0, Math.min(W, (((xf + (i * i2)) - Df) - ((measuredHeight - Df) / 2)) + (i2 / 2)));
                if (z) {
                    ((AbstractC4718o) this.f9030p0.get(i + 1).m32844d()).m26327y();
                }
                this.f9032r0.mo8024v1(0, max - i3);
            }
        }
    }

    @Override
    public void mo419J(int i, View view) {
        if (i == R.id.menu_btn_more) {
            C5320c cVar = new C5320c(3);
            C5146u0 u0Var = new C5146u0(3);
            TdApi.Message message = this.f9022K0.getMessage();
            if (C4779t2.m25598T2(C4779t2.m25494j1(message))) {
                cVar.m23284a(R.id.btn_saveFile);
                u0Var.m23816a(R.string.SaveToMusic);
            }
            if (message.chatId != 0) {
                cVar.m23284a(R.id.btn_share);
                u0Var.m23816a(R.string.Share);
                cVar.m23284a(R.id.btn_showInChat);
                u0Var.m23816a(R.string.ShowInChat);
            }
            if (this.f9030p0.size() > 5 && this.f9021J0) {
                cVar.m23284a(R.id.btn_showInPlaylist);
                u0Var.m23816a(R.string.PlayListHighlight);
            }
            if (this.f30167b.m2930B4().m4636w2().m7016w()) {
                cVar.m23284a(R.id.btn_reverseOrder);
                u0Var.m23816a(R.string.PlayListReverse);
            }
            m9302Yd(cVar.m23280e(), u0Var.m23813d(), 0);
        }
    }

    public final int m33910Jf() {
        if (this.f9022K0 == null) {
            return -1;
        }
        int size = this.f9030p0.size();
        TdApi.Message message = this.f9022K0.getMessage();
        for (int i = 1; i < size - 1; i++) {
            C2964ra raVar = this.f9030p0.get(i);
            if (raVar.m32844d() == this.f9022K0 || C9773p0.m7114D(message, ((AbstractC4718o) raVar.m32844d()).getMessage())) {
                return i - 1;
            }
        }
        return -1;
    }

    public final boolean m33909Kf() {
        return this.f9022K0 != null && this.f30167b.m2930B4().m4636w2().m7092O(this.f30167b, this.f9022K0.getMessage()) == 3;
    }

    public final boolean m33908Lf() {
        return (this.f9023L0 & 6) != 0;
    }

    @Override
    public void mo6979M4(C10930q6 q6Var, TdApi.Message message, int i, boolean z) {
        if ((this.f9023L0 & Log.TAG_ROUND) != 0) {
            i = (m33913Gf() - i) - 1;
        }
        this.f9029o0.m34147n1(i + 1);
        m33855rf(-((TdApi.MessageAudio) message.content).audio.duration);
    }

    @Override
    public boolean mo9386Me() {
        return true;
    }

    public final boolean m33907Mf() {
        return (this.f9023L0 & 1) != 0;
    }

    @Override
    public void mo8864N0(int i) {
        switch (i) {
            case R.id.btn_reverseOrder:
                this.f30167b.m2930B4().m4636w2().m7040k1();
                return;
            case R.id.btn_saveFile:
                C4779t2.C4786e f1 = C4779t2.m25522f1(this.f9022K0.getMessage());
                if (f1 != null) {
                    C4779t2.m25566Y4(f1);
                    return;
                }
                return;
            case R.id.btn_share:
                x00 x00Var = new x00(this.f30165a, this.f30167b);
                x00Var.m30994Vi(new x00.C3281m(this.f9022K0.getMessage()).m30888A(true));
                x00Var.m30960ej();
                return;
            case R.id.btn_showInChat:
                TdApi.Message message = this.f9022K0.getMessage();
                if (C4779t2.m25727A3(message)) {
                    this.f30167b.m2485dd().m3898A7(this, message);
                    return;
                } else {
                    this.f30167b.m2485dd().m3459s7(this, message, null);
                    return;
                }
            case R.id.btn_showInPlaylist:
                m33912Hf();
                return;
            default:
                return;
        }
    }

    @Override
    public int mo9383N9() {
        return C5064d.m24128d(-1, C11524j.m228N(R.id.theme_color_headerLightIcon), this.f9034t0.m33841G());
    }

    public final boolean m33906Nf() {
        return m33913Gf() <= 1;
    }

    public final boolean m33903Pf() {
        return m33901Qf(this.f9032r0.getMeasuredWidth(), this.f9032r0.getMeasuredHeight());
    }

    public final boolean m33901Qf(int i, int i2) {
        int Df = m33916Df();
        if ((i2 != 0 ? i / i2 : 0.0f) > 0.7f) {
            return false;
        }
        int topOffset = View$OnClickListenerC9170d1.getTopOffset();
        return (topOffset + ((i2 - topOffset) / 2)) + Df > Df / 2;
    }

    @Override
    public void mo6978R0(C10930q6 q6Var, List<TdApi.Message> list, boolean z) {
        C4756s sVar;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        boolean z2 = false;
        int i = 1;
        boolean z3 = (this.f9023L0 & Log.TAG_ROUND) != 0;
        long j = 0;
        while (true) {
            size--;
            if (size >= 0) {
                AbstractC4718o<?> X = AbstractC4718o.m26343X(this.f30165a, q6Var, list.get(z3 ? size : (list.size() - 1) - size));
                if ((X instanceof C4756s) && X.m26330v() == 7) {
                    arrayList.add(m33863jg((C4756s) X));
                    j += sVar.m26264c0().duration;
                } else {
                    return;
                }
            } else if (!arrayList.isEmpty()) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f9032r0.getLayoutManager();
                int X1 = linearLayoutManager.m39549X1();
                int max = X1 != -1 ? Math.max(1, X1) : -1;
                View I = linearLayoutManager.m39251I(max);
                int U = I != null ? linearLayoutManager.m39231U(I) : 0;
                if (z3 != z) {
                    z2 = true;
                }
                if (z2) {
                    i = this.f9030p0.size() - 1;
                }
                this.f9030p0.addAll(i, arrayList);
                this.f9029o0.m39308M(i, arrayList.size());
                if (!z2 && max != -1) {
                    linearLayoutManager.m39522z2(max + list.size(), U);
                }
                m33855rf(j);
                return;
            } else {
                return;
            }
        }
    }

    @Override
    public void mo3954R2(C10930q6 q6Var, int i, int i2, TdApi.File file) {
        if (i2 == 2 && file != null) {
            m33877cg(file);
        }
    }

    @Override
    public int mo407R9() {
        return R.id.controller_playback;
    }

    public final void m33899Rf(int i, int i2, boolean z) {
        if (i != i2) {
            if (z) {
                this.f9025N0 = true;
                this.f30167b.m2930B4().m4636w2().m7050h0(i, i2);
                this.f9025N0 = false;
            }
            if ((this.f9023L0 & Log.TAG_ROUND) != 0) {
                int Gf = m33913Gf();
                i = (Gf - i) - 1;
                i2 = (Gf - i2) - 1;
            }
            this.f9029o0.m34114y1(i + 1, i2 + 1);
        }
    }

    @Override
    public boolean mo8863S8(C9270q1 q1Var, float f, float f2) {
        if (f2 >= m33916Df() + View$OnClickListenerC9170d1.getTopOffset() && this.f9026O0 != 0.0f) {
            return !this.f9021J0 && f2 < ((float) m33919Af());
        }
        return true;
    }

    public final ImageView m33897Sf(int i, int i2, boolean z) {
        ImageView imageView = new ImageView(mo4347s());
        imageView.setId(i);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(i2);
        imageView.setLayoutParams(FrameLayoutFix.m18008s1(C1357a0.m37541i(64.0f), C1357a0.m37541i(48.0f)));
        int i3 = z ? R.id.theme_color_playerButtonActive : R.id.theme_color_playerButton;
        imageView.setColorFilter(C11524j.m228N(i3));
        imageView.setOnClickListener(this);
        m9184q8(imageView, i3);
        return imageView;
    }

    public final void m33895Tf(float f, float f2) {
        if (m33901Qf(this.f9032r0.getMeasuredWidth(), this.f9032r0.getMeasuredHeight()) && f != f2) {
            if ((f >= 0.0f && f <= 1.0f) || (f2 >= 0.0f && f2 <= 1.0f)) {
                this.f9034t0.invalidate();
            }
        }
    }

    public final void m33893Uf() {
        this.f9032r0.setAlpha(m33913Gf() <= 1 ? 0.0f : 1.0f);
        this.f9029o0.m34130s3(R.id.btn_info);
    }

    @Override
    public void mo3953V0(TdApi.File file) {
        m33877cg(file);
    }

    @Override
    public void mo6973V2(C10930q6 q6Var, long j, long j2, int i, float f, long j3, long j4, boolean z) {
        C4756s sVar = this.f9022K0;
        if (sVar != null && C9773p0.m7116C(sVar.getMessage(), j, j2, i)) {
            this.f9034t0.m33817s0(j3, j4);
        }
    }

    public int m33891Vf() {
        TdApi.Message J;
        List<TdApi.Message> S = this.f30167b.m2930B4().m4636w2().m7084S();
        if (S == null || S.isEmpty() || (J = this.f30167b.m2930B4().m4636w2().m7102J()) == null) {
            return -1;
        }
        long L = this.f30167b.m2930B4().m4636w2().m7098L();
        int Q = this.f30167b.m2930B4().m4636w2().m7088Q();
        ArrayList arrayList = new ArrayList(S.size() + 2);
        arrayList.add(new C2964ra(73));
        int sf = m33854sf(arrayList, this.f30167b, J, S, L, Q);
        if (sf == -1) {
            return -1;
        }
        arrayList.add(new C2964ra(42, R.id.btn_info));
        C2668a aVar = new C2668a(this);
        this.f9029o0 = aVar;
        aVar.m34116x2(arrayList, false);
        this.f9030p0 = this.f9029o0.m34240F0();
        return sf;
    }

    @Override
    public void mo6977W3(C10930q6 q6Var, TdApi.Message message, int i) {
        AbstractC4718o<?> X = AbstractC4718o.m26343X(this.f30165a, q6Var, message);
        if ((X instanceof C4756s) && X.m26330v() == 7) {
            C4756s sVar = (C4756s) X;
            this.f9029o0.m34129t0((this.f9023L0 & Log.TAG_ROUND) != 0 ? (m33913Gf() + 1) - i : i + 1, m33863jg(sVar));
            m33855rf(sVar.m26264c0().duration);
        }
    }

    @Override
    public int mo418W9() {
        return R.id.menu_player;
    }

    public final void m33889Wf(Message message) {
        int i = message.what;
        if (i != 0) {
            boolean z = true;
            if (i == 1) {
                this.f9034t0.m33818q0();
            } else if (i == 2) {
                if (message.arg1 != 1) {
                    z = false;
                }
                m33853tf(z);
            } else if (i == 3) {
                if (message.arg1 != 1) {
                    z = false;
                }
                m33850wf(z);
            }
        } else {
            m33877cg((TdApi.File) message.obj);
        }
    }

    @Override
    public CharSequence mo9313X9() {
        return "";
    }

    public final void m33887Xf(final C4756s sVar) {
        if (this.f9022K0 != null) {
            m9261ee(C4403w.m27853m1(R.string.PlayListRemoveTrack, sVar.m26261f0() + " – " + sVar.m26262e0()), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.PlayListRemove), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_remove_circle_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view, int i) {
                    boolean Of;
                    Of = View$OnClickListenerC2667lk.this.m33905Of(sVar, view, i);
                    return Of;
                }

                @Override
                public boolean mo492Q() {
                    return C5115g0.m23935a(this);
                }

                @Override
                public Object mo491b2(int i) {
                    return C5115g0.m23934b(this, i);
                }
            });
        }
    }

    public final int m33885Yf(int i) {
        return m33883Zf(i, m33913Gf(), (this.f9023L0 & Log.TAG_ROUND) != 0);
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        this.f30167b.m2930B4().m4636w2().m7083S0(this);
        C11052v1.m1768b().m1766d(this);
        C11052v1.m1768b().m1766d(this.f9029o0);
        C1399s0.m37162q(this.f9032r0);
        this.f9034t0.m33810x0(null);
    }

    public final int m33883Zf(int i, int i2, boolean z) {
        return z ? (i2 - 1) - i : i;
    }

    public final void m33881ag(long j, long j2, long j3, boolean z, boolean z2, List<TdApi.Message> list) {
        if (!this.f9014C0) {
            this.f9014C0 = true;
            this.f9015D0 = j;
            this.f9016E0 = j2;
            this.f9017F0 = j3;
            this.f9018G0 = z;
            this.f9019H0 = z2;
            if (list == null || list.isEmpty()) {
                this.f9020I0 = null;
                return;
            }
            ArrayList arrayList = new ArrayList(list.size());
            this.f9020I0 = arrayList;
            arrayList.addAll(list);
            return;
        }
        throw new IllegalStateException();
    }

    public final void m33879bg(ImageView imageView, boolean z) {
        m9180qd(imageView);
        int i = z ? R.id.theme_color_playerButtonActive : R.id.theme_color_playerButton;
        imageView.setColorFilter(C11524j.m228N(i));
        m9184q8(imageView, i);
    }

    public final void m33877cg(TdApi.File file) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HandlerC2677h Cf = m33917Cf();
            Cf.sendMessage(Message.obtain(Cf, 0, file));
            return;
        }
        C4756s sVar = this.f9022K0;
        if (sVar != null && file.f25373id == sVar.m26263d0().f25373id) {
            this.f9034t0.m33812w0(C4779t2.m25452p1(file), C4779t2.m25438r1(file), true);
        }
    }

    @Override
    public void mo6976d7(C10930q6 q6Var, long j, long j2, long j3, boolean z, boolean z2, List<TdApi.Message> list) {
        this.f9040z0.m33805b(false, true);
        C4756s sVar = this.f9022K0;
        if (sVar != null) {
            sVar.m26256k0(false);
            m33875dg((C4756s) this.f9030p0.get(1).m32844d(), false);
            this.f9034t0.m33817s0(-1L, -1L);
        }
        m33881ag(j, j2, j3, z, z2, list);
    }

    public final void m33875dg(C4756s sVar, boolean z) {
        float f;
        C4756s sVar2 = this.f9022K0;
        if (sVar2 != sVar) {
            boolean z2 = sVar2 != null;
            if (z2) {
                this.f30167b.m2930B4().m4636w2().m7081T0(this.f30167b, this.f9022K0.getMessage(), this);
                this.f30167b.m2413i5().m4030D0(this.f9022K0.m26263d0().f25373id, this);
                if (z) {
                    this.f9022K0.m26256k0(false);
                }
            }
            this.f9022K0 = sVar;
            this.f9034t0.m33810x0(sVar);
            float f2 = 0.0f;
            if (sVar != null) {
                if (z) {
                    sVar.m26256k0(true);
                }
                this.f30167b.m2930B4().m4636w2().m7026r(this.f30167b, sVar.getMessage(), this);
                this.f30167b.m2413i5().m4034B0(sVar.m26263d0(), this);
                f2 = C4779t2.m25452p1(sVar.m26263d0());
                f = C4779t2.m25438r1(sVar.m26263d0());
            } else {
                f = 0.0f;
            }
            this.f9034t0.m33812w0(f2, f, z2);
            m33850wf(z2);
        } else if (sVar != null && z) {
            sVar.m26256k0(true);
            sVar.m26255l0(true);
        }
    }

    public final void m33873eg(int i, boolean z) {
        m33875dg((C4756s) this.f9030p0.get(m33885Yf(i) + 1).m32844d(), z);
    }

    public final void m33871fg(int i) {
        if (this.f9023L0 != i) {
            this.f9023L0 = i;
        }
    }

    @Override
    public void mo452g2() {
        C2670c cVar = this.f9034t0;
        if (cVar != null) {
            cVar.invalidate();
        }
    }

    public final void m33869gg(float f, float f2) {
        if (this.f9026O0 != f) {
            float Ff = m33914Ff();
            this.f9026O0 = f;
            m33895Tf(Ff, m33914Ff());
        }
        if (this.f9027P0 != f2) {
            this.f9027P0 = f2;
            if (!m33903Pf()) {
                this.f9035u0.setAlpha(f2);
            }
        }
    }

    @Override
    public void mo6975h6() {
        this.f9029o0.m34130s3(R.id.btn_info);
    }

    public final void m33867hg() {
        if (!this.f9021J0) {
            this.f9021J0 = true;
        }
    }

    public void m33865ig() {
        View$OnClickListenerC9170d1 d1Var = this.f30156R;
        if (d1Var != null && this.f9034t0 != null) {
            d1Var.m10088T3(this, mo418W9(), this.f9034t0.m33841G());
            this.f30156R.m10099O3(this, mo9383N9());
        }
    }

    @Override
    public void mo6974o0(C10930q6 q6Var, TdApi.Message message, int i, List<TdApi.Message> list, boolean z, int i2) {
        m33873eg(i, true);
        this.f9022K0.m26256k0(true);
    }

    @Override
    public void mo443o4() {
        C11031u1.m1981a(this);
    }

    @Override
    public View mo403oc(Context context) {
        if (this.f9029o0 != null) {
            FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
            frameLayoutFix.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
            C10192g.m5782i(frameLayoutFix, R.id.theme_color_filling, this);
            C2673e eVar = new C2673e(context);
            this.f9032r0 = eVar;
            eVar.m33808G1(this);
            this.f9032r0.setVerticalScrollBarEnabled(false);
            this.f9032r0.setLayoutManager(new LinearLayoutManager(context, 1, false));
            this.f9032r0.m39434g(new C2672d(this));
            this.f9032r0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
            this.f9032r0.setAdapter(this.f9029o0);
            this.f9032r0.setItemAnimator(new C8731d(C2057b.f7280b, 180L));
            this.f9032r0.setAlpha(m33906Nf() ? 0.0f : 1.0f);
            frameLayoutFix.addView(this.f9032r0);
            C0962g[] gVarArr = {new C0962g(new C2669b(gVarArr))};
            gVarArr[0].m38809m(this.f9032r0);
            C2675f fVar = new C2675f(context);
            this.f9033s0 = fVar;
            fVar.m33807C1(this);
            this.f9033s0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -2));
            frameLayoutFix.addView(this.f9033s0);
            C2670c cVar = new C2670c(context);
            this.f9034t0 = cVar;
            cVar.m33831S(this);
            this.f9034t0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
            this.f9033s0.addView(this.f9034t0);
            m9163t8(this.f9034t0);
            C6879f3 f3Var = new C6879f3(context);
            this.f9035u0 = f3Var;
            f3Var.setSimpleBottomTransparentShadow(true);
            this.f9035u0.setAlpha(0.0f);
            C6879f3 f3Var2 = this.f9035u0;
            f3Var2.setLayoutParams(FrameLayoutFix.m18005v1(f3Var2.getLayoutParams()));
            frameLayoutFix.addView(this.f9035u0);
            m9163t8(this.f9035u0);
            this.f9036v0 = m33897Sf(R.id.btn_shuffle, R.drawable.round_shuffle_24, m33907Mf());
            this.f9038x0 = m33897Sf(R.id.btn_next, R.drawable.round_skip_next_36, false);
            this.f9039y0 = m33897Sf(R.id.btn_previous, R.drawable.round_skip_previous_36, false);
            this.f9037w0 = m33897Sf(R.id.btn_repeat, m33915Ef(), m33908Lf());
            C2676g gVar = new C2676g(context);
            this.f9040z0 = gVar;
            gVar.setId(R.id.btn_play);
            this.f9040z0.setOnClickListener(this);
            this.f9040z0.setLayoutParams(FrameLayoutFix.m18008s1(C1357a0.m37541i(64.0f), C1357a0.m37541i(64.0f)));
            m9163t8(this.f9040z0);
            frameLayoutFix.addView(this.f9036v0);
            frameLayoutFix.addView(this.f9037w0);
            frameLayoutFix.addView(this.f9039y0);
            frameLayoutFix.addView(this.f9038x0);
            frameLayoutFix.addView(this.f9040z0);
            this.f30167b.m2930B4().m4636w2().m7028q(this, false);
            m33875dg((C4756s) this.f9030p0.get(this.f9028n0 + 1).m32844d(), true);
            C11052v1.m1768b().m1769a(this);
            C11052v1.m1768b().m1769a(this.f9029o0);
            boolean Kf = m33909Kf();
            this.f9040z0.m33805b(Kf, false);
            this.f9022K0.m26255l0(Kf);
            return frameLayoutFix;
        }
        throw new IllegalStateException("Using PlaybackController without calling prepare()");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_custom:
                this.f30167b.m2930B4().m4636w2().m7105H0(this.f30167b, ((C4756s) ((C2964ra) view.getTag()).m32844d()).getMessage(), this);
                return;
            case R.id.btn_next:
                this.f30167b.m2930B4().m4636w2().m7063c1(true);
                return;
            case R.id.btn_play:
                if (this.f9022K0 != null) {
                    this.f30167b.m2930B4().m4636w2().m7105H0(this.f30167b, this.f9022K0.getMessage(), this);
                    return;
                }
                return;
            case R.id.btn_previous:
                this.f30167b.m2930B4().m4636w2().m7063c1(false);
                return;
            case R.id.btn_repeat:
                this.f30167b.m2930B4().m4636w2().m7043j1();
                return;
            case R.id.btn_shuffle:
                this.f30167b.m2930B4().m4636w2().m7046i1(1);
                return;
            default:
                return;
        }
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        if (i == R.id.menu_player) {
            d1Var.m10065d2(linearLayout, this, 0).m9517h(R.id.theme_color_white, R.id.theme_color_headerLightIcon, this.f9034t0.m33841G());
        }
    }

    @Override
    public boolean mo6987q7(TdApi.Message message, boolean z, boolean z2, List<TdApi.Message> list, long j) {
        return true;
    }

    public final void m33855rf(long j) {
        if (j != 0) {
            this.f9031q0 += j;
        }
        m33893Uf();
    }

    @Override
    public C9773p0.C9775b mo6986s5(TdApi.Message message) {
        if (this.f9014C0) {
            int Gf = m33913Gf();
            if (Gf > 0) {
                ArrayList arrayList = new ArrayList(Gf);
                boolean z = (this.f9023L0 & Log.TAG_ROUND) != 0;
                int i = Gf;
                int i2 = -1;
                while (true) {
                    i--;
                    if (i >= 0) {
                        TdApi.Message message2 = ((C4756s) this.f9030p0.get(z ? i + 1 : Gf - i).m32844d()).getMessage();
                        if (message == message2 || C9773p0.m7114D(message, message2)) {
                            if (i2 == -1) {
                                i2 = arrayList.size();
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        arrayList.add(message2);
                    } else {
                        this.f9013B0 = true;
                        C9773p0.C9775b bVar = new C9773p0.C9775b(arrayList, i2);
                        bVar.m6992q(this.f9023L0 & 98304);
                        bVar.m6991r(this.f9015D0, this.f9016E0, this.f9017F0);
                        bVar.m6989t(this.f9020I0);
                        bVar.m6990s(this.f9018G0, this.f9019H0);
                        this.f9014C0 = false;
                        return bVar;
                    }
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public void mo9166sc() {
        super.mo9166sc();
        this.f9034t0.m33821f0(false);
        m9294a9(R.id.controller_playback);
    }

    public final int m33854sf(List<C2964ra> list, C10930q6 q6Var, TdApi.Message message, List<TdApi.Message> list2, long j, int i) {
        List<TdApi.Message> list3;
        int i2;
        C4756s sVar;
        int i3 = 1;
        boolean z = (32768 & i) != 0;
        int size = list2.size();
        long j2 = 0;
        int i4 = -1;
        while (true) {
            int i5 = size - 1;
            if (i5 >= 0) {
                if (z) {
                    list3 = list2;
                    i2 = i5;
                } else {
                    i2 = (list2.size() - i3) - i5;
                    list3 = list2;
                }
                TdApi.Message message2 = list3.get(i2);
                AbstractC4718o<?> X = AbstractC4718o.m26343X(this.f30165a, q6Var, message2);
                if (!(X instanceof C4756s) || X.m26330v() != 7) {
                    break;
                }
                if (C9773p0.m7114D(message, message2)) {
                    if (i4 == -1) {
                        i4 = list.size() - i3;
                    } else {
                        throw new IllegalStateException();
                    }
                }
                list.add(m33863jg((C4756s) X));
                j2 += sVar.m26264c0().duration;
                size = i5;
                i3 = 1;
            } else if (i4 != -1) {
                this.f9028n0 = i4;
                this.f9031q0 = j2;
                this.f9024M0 = j;
                m33871fg(i);
                return i4;
            } else {
                throw new IllegalStateException();
            }
        }
        list.clear();
        return -1;
    }

    public final void m33853tf(boolean z) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f9032r0.getLayoutManager();
        int a2 = linearLayoutManager.m39546a2();
        if (a2 != -1 && a2 + 10 >= m33913Gf()) {
            this.f30167b.m2930B4().m4636w2().m7079U0();
        }
        int X1 = linearLayoutManager.m39549X1();
        if (X1 != -1) {
            if (X1 > 0) {
                m33869gg(1.0f, 1.0f);
                if (this.f9021J0) {
                    this.f9034t0.m33825d0(true, !z);
                    return;
                }
                return;
            }
            View C = linearLayoutManager.mo39262C(X1);
            if (C != null) {
                int top = C.getTop();
                int n0 = linearLayoutManager.m39192n0(C);
                int xf = m33849xf();
                if (!(n0 == xf || top <= 0 || n0 == 0)) {
                    top = (int) (top * (xf / n0));
                }
                int Df = m33916Df() + View$OnClickListenerC9170d1.getTopOffset();
                int i = top - Df;
                if (i < 0) {
                    m33869gg(1.0f, C5069h.m24089d((-i) / C1357a0.m37541i(12.0f)));
                    if (this.f9021J0) {
                        this.f9034t0.m33825d0(true, !z);
                        return;
                    }
                    return;
                }
                int xf2 = m33849xf() - Df;
                m33869gg(C5069h.m24089d((i > xf2 || xf2 == 0) ? 0.0f : 1.0f - (i / xf2)), 0.0f);
                if (m33903Pf()) {
                    boolean z2 = false;
                    int topOffset = View$OnClickListenerC9170d1.getTopOffset() + (View$OnClickListenerC9170d1.m10066c3(false) / 2);
                    if (this.f9021J0) {
                        C2670c cVar = this.f9034t0;
                        if (i <= topOffset) {
                            z2 = true;
                        }
                        cVar.m33825d0(z2, !z);
                    }
                }
            }
        }
    }

    public final void m33852uf(boolean z) {
        m33917Cf().sendMessage(Message.obtain(m33917Cf(), 2, z ? 1 : 0, 0));
    }

    public final void m33851vf(boolean z) {
        m33917Cf().sendMessage(Message.obtain(m33917Cf(), 3, z ? 1 : 0, 0));
    }

    public final void m33850wf(boolean z) {
        if (!this.f9021J0 && Math.min(this.f9032r0.getMeasuredWidth(), this.f9032r0.getMeasuredHeight()) > 0) {
            int Jf = m33910Jf();
            if (Jf != -1) {
                int xf = m33849xf();
                int measuredHeight = this.f9032r0.getMeasuredHeight();
                int i = C1357a0.m37541i(65.0f);
                int Gf = m33913Gf();
                m33916Df();
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f9032r0.getLayoutManager();
                int i2 = Jf + 1;
                int i3 = Jf != 0 ? i : 0;
                int i4 = Jf * i;
                int i5 = (Gf * i) - ((measuredHeight - xf) - i);
                if (i4 > i5) {
                    i3 += i4 - i5;
                }
                int X1 = linearLayoutManager.m39549X1();
                View C = X1 != -1 ? linearLayoutManager.mo39262C(X1) : null;
                int U = C != null ? linearLayoutManager.m39231U(C) : 0;
                if (!z || C == null) {
                    linearLayoutManager.m39522z2(i2, xf + i3);
                    return;
                }
                int max = (-U) + (Math.max(0, X1 - 1) * i);
                if (X1 <= 0) {
                    xf = 0;
                }
                this.f9032r0.mo8024v1(0, ((i * Math.max(0, i2 - 1)) - i3) - (max + xf));
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final int m33849xf() {
        return m33848yf(this.f9032r0.getMeasuredWidth(), this.f9032r0.getMeasuredHeight());
    }

    public final int m33848yf(int i, int i2) {
        int Df = m33916Df();
        if ((i2 != 0 ? i / i2 : 0.0f) <= 0.7f) {
            View$OnClickListenerC9170d1.getTopOffset();
            int i3 = i + Df;
            if (i3 > Df / 2) {
                return i3;
            }
        }
        return Df + View$OnClickListenerC9170d1.getTopOffset();
    }

    @Override
    public void mo6972z1(C10930q6 q6Var, long j, long j2, int i, int i2) {
        C4756s sVar;
        if ((i2 == 2 || i2 == 3) && (sVar = this.f9022K0) != null && C9773p0.m7116C(sVar.getMessage(), j, j2, i)) {
            boolean z = i2 == 3;
            this.f9040z0.m33805b(z, true);
            C4756s sVar2 = this.f9022K0;
            if (sVar2 != null) {
                sVar2.m26255l0(z);
            }
        }
    }

    public final float m33847zf(int i, int i2, float f) {
        if (f >= 1.0f || !m33901Qf(i, i2)) {
            return 0.0f;
        }
        return (1.0f - f) * (1.0f - this.f9034t0.f9065i0);
    }
}
package me;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import be.C1357a0;
import be.C1362c;
import be.C1392p;
import be.C1410y;
import be.C1411z;
import gd.C4587b;
import gd.C4601c3;
import gd.C4614d3;
import gd.C4619e;
import gd.C4779t2;
import ie.C5375a;
import ie.C5380b;
import ie.RunnableC5390g;
import java.util.concurrent.TimeUnit;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p053dd.C4007j;
import p082fd.C4403w;
import p108hb.C5063c;
import p108hb.C5070i;
import p110hd.C5078d;
import p139jb.AbstractC5911c;
import p156kd.C6246h;
import p156kd.C6257p;
import p193nb.C7316a;
import p193nb.C7319d;
import p193nb.C7321e;
import p350yd.AbstractC10747j0;
import p350yd.AbstractC10817l1;
import p350yd.C10721i0;
import p350yd.C10791k1;
import p350yd.C10802kc;
import p350yd.C10930q6;
import p350yd.C11059v7;
import p350yd.C11133y7;
import p364zd.C11524j;
import td.C9357x2;
import vc.C9903a;

public class C6981o extends View$OnClickListenerC6902i implements AbstractC5911c, C4007j.AbstractC4011d, AbstractC10747j0, C11059v7.AbstractC11068i, C11059v7.AbstractC11067h, C11059v7.AbstractC11061b, AbstractC10817l1, C11059v7.AbstractC11069j, C9357x2.AbstractC9363f {
    public Drawable f22108A0;
    public int f22109B0;
    public int f22110C0;
    public C4601c3 f22111D0;
    public boolean f22112E0;
    public C4007j f22113F0;
    public C4614d3 f22114G0;
    public int f22115k0;
    public final C6257p f22116l0;
    public CharSequence f22117m0;
    public CharSequence f22118n0;
    public float f22119o0;
    public Layout f22120p0;
    public CharSequence f22121q0;
    public CharSequence f22122r0;
    public float f22123s0;
    public Layout f22124t0;
    public String f22125u0;
    public float f22126v0;
    public final C5375a f22127w0 = new C5375a.C5377b().m23019d(new C5375a.AbstractC5378c() {
        @Override
        public boolean mo8363d(C5375a aVar) {
            return C5380b.m23012a(this, aVar);
        }

        @Override
        public final void mo8362j(C5375a aVar, boolean z) {
            C6981o.this.m18201U0(aVar, z);
        }
    }).m23021b();
    public C6246h f22128x0;
    public C4587b f22129y0;
    public int f22130z0;

    public C6981o(Context context, C10930q6 q6Var) {
        super(context, q6Var);
        C6257p pVar = new C6257p(this, C9903a.m6659J0(1));
        this.f22116l0 = pVar;
        pVar.mo20256K0(C1357a0.m37541i(11.0f), C1357a0.m37541i(10.0f), C1357a0.m37541i(11.0f) + C1357a0.m37541i(52.0f), C1357a0.m37541i(10.0f) + C1357a0.m37541i(52.0f));
    }

    public void m18201U0(C5375a aVar, boolean z) {
        if (z) {
            m18189r1();
            m18190q1();
        }
        invalidate();
    }

    public void m18200W0(TdApi.User user) {
        C4601c3 c3Var = this.f22111D0;
        if (c3Var != null && c3Var.m27036p() == user.f25439id) {
            m18186v1(true);
        }
    }

    public void m18198c1(long j) {
        C4601c3 c3Var = this.f22111D0;
        if (c3Var != null && c3Var.m27043i() == j) {
            m18186v1(true);
        }
    }

    public void m18197d1(long j) {
        C4601c3 c3Var = this.f22111D0;
        if (c3Var != null && c3Var.m27047e() == j) {
            m18185z1();
        }
    }

    private void setChatImpl(C4601c3 c3Var) {
        C4601c3 c3Var2 = this.f22111D0;
        boolean z = false;
        long j = 0;
        if (c3Var2 != null) {
            if (c3Var2.m27048d() != null) {
                m18203O0(this.f22111D0.m27048d(), false, this.f22112E0);
            } else if (this.f22111D0.m27036p() != 0) {
                m18204M0(this.f22111D0.m27036p(), false, this.f22112E0);
            }
        }
        this.f22111D0 = c3Var;
        int i = this.f22115k0;
        if (c3Var != null && c3Var.m27031u()) {
            z = true;
        }
        this.f22115k0 = C5063c.m24138h(i, 8, z);
        if (c3Var != null) {
            setIsSecret(c3Var.m27032t());
            if (c3Var.m27048d() != null) {
                m18203O0(c3Var.m27048d(), true, !c3Var.m27033s());
                j = c3Var.m27048d().f25367id;
            } else if (c3Var.m27036p() != 0) {
                m18204M0(this.f22111D0.m27036p(), true, !c3Var.m27033s());
                j = C7316a.m17058c(this.f22111D0.m27036p());
            }
            m18494v0(c3Var.m27042j(), j, null);
            return;
        }
        m18494v0(null, 0L, null);
    }

    private void setMessageImpl(C4614d3 d3Var) {
        if (this.f22114G0 != null) {
            this.f21820b.m2781K9().m1818q0(this.f22114G0.m26896c().m27043i(), this);
        }
        this.f22114G0 = d3Var;
        if (d3Var != null) {
            long i = d3Var.m26896c().m27043i();
            setIsSecret(d3Var.m26896c().m27032t());
            m18493w0(d3Var.m26896c().m27042j(), i, null, new C7319d(i, d3Var.m26895d()), null);
            this.f21820b.m2781K9().m1870d0(i, this);
            return;
        }
        m18511K();
    }

    public final void m18208B1(final long j) {
        this.f21820b.m2469ed(new Runnable() {
            @Override
            public final void run() {
                C6981o.this.m18197d1(j);
            }
        });
    }

    @Override
    public void mo4076B4(long j, String[] strArr) {
        C10721i0.m4195b(this, j, strArr);
    }

    @Override
    public void mo4075C5(long j, long j2) {
        C10721i0.m4178s(this, j, j2);
    }

    @Override
    public void mo3249D2(TdApi.NotificationSettingsScope notificationSettingsScope, TdApi.ScopeNotificationSettings scopeNotificationSettings) {
    }

    @Override
    public boolean mo1350D3() {
        return this.f22112E0;
    }

    @Override
    public void mo3248E5(TdApi.NotificationSettingsScope notificationSettingsScope) {
        C10791k1.m3309b(this, notificationSettingsScope);
    }

    @Override
    public void mo4074G5(long j, int i, boolean z) {
        C10721i0.m4173x(this, j, i, z);
    }

    @Override
    public void mo4073H0(long j, String str) {
        C10721i0.m4177t(this, j, str);
    }

    @Override
    public void mo1349J3(long j, TdApi.UserStatus userStatus, boolean z) {
        C4601c3 c3Var = this.f22111D0;
        if (c3Var != null && c3Var.m27036p() == j) {
            m18185z1();
        }
    }

    @Override
    public void mo4072K3(long j, boolean z) {
        C10721i0.m4188i(this, j, z);
    }

    @Override
    public void mo4071L0(long j, int i) {
        m18208B1(j);
    }

    public final void m18204M0(long j, boolean z, boolean z2) {
        if (z) {
            this.f22112E0 = z2;
            this.f21820b.m2480e2().m1646f2(j, this);
            return;
        }
        this.f21820b.m2480e2().m1595s2(j, this);
    }

    public final void m18203O0(TdApi.Chat chat, boolean z, boolean z2) {
        if (z) {
            this.f21820b.m2781K9().m1870d0(chat.f25367id, this);
            this.f21820b.m2781K9().m1846j0(chat.f25367id, this);
        } else {
            this.f21820b.m2781K9().m1818q0(chat.f25367id, this);
            this.f21820b.m2781K9().m1794w0(chat.f25367id, this);
        }
        switch (chat.type.getConstructor()) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                if (z) {
                    this.f21820b.m2480e2().m1654d2(C7316a.m17045p(chat.f25367id), this);
                    return;
                } else {
                    this.f21820b.m2480e2().m1603q2(C7316a.m17045p(chat.f25367id), this);
                    return;
                }
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                if (z) {
                    this.f22112E0 = z2;
                    this.f21820b.m2480e2().m1646f2(C4779t2.m25458o2(chat.type), this);
                    return;
                }
                this.f21820b.m2480e2().m1595s2(C4779t2.m25458o2(chat.type), this);
                return;
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                if (z) {
                    this.f21820b.m2480e2().m1662b2(C7316a.m17048m(chat.f25367id), this);
                    return;
                } else {
                    this.f21820b.m2480e2().m1611o2(C7316a.m17048m(chat.f25367id), this);
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public void mo1348P1(final TdApi.User user) {
        this.f21820b.m2469ed(new Runnable() {
            @Override
            public final void run() {
                C6981o.this.m18200W0(user);
            }
        });
    }

    public boolean m18202Q0() {
        return this.f22124t0 != null;
    }

    @Override
    public void mo4070R1(long j, boolean z) {
        m18187u1(j);
    }

    @Override
    public void mo5812V0() {
        if (this.f22113F0 == null) {
            this.f22113F0 = new C4007j(this, R.drawable.baseline_delete_24);
        }
        this.f22113F0.m29340c();
    }

    @Override
    public void mo4069V5(long j, long j2, int i, boolean z) {
        m18187u1(j);
    }

    @Override
    public void mo4068W(long j, TdApi.ChatActionBar chatActionBar) {
        C10721i0.m4196a(this, j, chatActionBar);
    }

    @Override
    public void mo1566W2(TdApi.BasicGroup basicGroup, boolean z) {
        m18208B1(C7316a.m17060a(basicGroup.f25363id));
    }

    @Override
    public void mo4067Y(long j, TdApi.Message message) {
        C10721i0.m4175v(this, j, message);
    }

    @Override
    public void mo4066a0(long j, TdApi.MessageSender messageSender) {
        C10721i0.m4191f(this, j, messageSender);
    }

    @Override
    public void mo4501a3() {
        this.f22116l0.mo20249Z();
        setChatImpl(null);
        setMessageImpl(null);
    }

    public void m18199b() {
        this.f22116l0.mo20247b();
    }

    @Override
    public void mo4065c2(long j, TdApi.DraftMessage draftMessage) {
        C10721i0.m4190g(this, j, draftMessage);
    }

    @Override
    public void mo4064c4(long j, TdApi.ChatPhotoInfo chatPhotoInfo) {
        m18187u1(j);
    }

    public final void m18196e1(int i) {
        if (C4403w.m27984G2()) {
            int i2 = C1357a0.m37541i(11.0f);
            int i3 = i - i2;
            this.f22116l0.mo20256K0(i3 - C1357a0.m37541i(52.0f), C1357a0.m37541i(10.0f), i3, C1357a0.m37541i(10.0f) + C1357a0.m37541i(52.0f));
            return;
        }
        this.f22116l0.mo20256K0(C1357a0.m37541i(11.0f), C1357a0.m37541i(10.0f), C1357a0.m37541i(11.0f) + C1357a0.m37541i(52.0f), C1357a0.m37541i(10.0f) + C1357a0.m37541i(52.0f));
    }

    @Override
    public void mo4063e7(long j, int i) {
        C10721i0.m4186k(this, j, i);
    }

    public void m18195f() {
        this.f22116l0.mo20245f();
    }

    @Override
    public void mo8098f1(View view, Rect rect) {
        if (this.f22118n0 != null) {
            int i = C1357a0.m37541i(72.0f);
            int i2 = (C1357a0.m37541i(28.0f) + C1357a0.m37541i(1.0f)) - C1357a0.m37541i(16.0f);
            boolean z = true;
            if ((this.f22115k0 & 1) == 0) {
                z = false;
            }
            int E0 = C7389v0.m16741E0(C9903a.m6645n1(z).getFontMetricsInt()) + i2;
            Layout layout = this.f22120p0;
            rect.set(i, i2, ((int) (layout != null ? layout.getLineCount() > 0 ? this.f22120p0.getLineWidth(0) : 0.0f : this.f22119o0)) + i, E0);
        }
    }

    public void m18194g1(C6246h hVar, C4587b.C4588a aVar) {
        C4587b bVar = null;
        if (aVar != null) {
            bVar = new C4587b(C9903a.m6657O0(1) / 2.0f, aVar, null);
        }
        m18193i1(hVar, bVar);
    }

    @Override
    public void mo1556h0(long j, TdApi.SupergroupFullInfo supergroupFullInfo) {
        m18208B1(C7316a.m17059b(j));
    }

    @Override
    public void mo4062h1(long j, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        C10721i0.m4184m(this, j, chatJoinRequestsInfo);
    }

    public void m18193i1(C6246h hVar, C4587b bVar) {
        this.f22128x0 = hVar;
        this.f22129y0 = bVar;
        this.f22116l0.m20819G(hVar);
    }

    @Override
    public void mo1565i4(long j, TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        m18208B1(C7316a.m17060a(j));
    }

    @Override
    public void mo4061i5(long j, String str) {
        m18187u1(j);
    }

    @Override
    public void mo3247l4(long j, TdApi.ChatNotificationSettings chatNotificationSettings) {
        m18187u1(j);
    }

    @Override
    public void mo4060m0(long j, int i, boolean z) {
        C10721i0.m4174w(this, j, i, z);
    }

    public void m18192n1(TdApi.File file, C4587b bVar) {
        C6246h hVar;
        if (file != null) {
            C6246h hVar2 = this.f22128x0;
            if (hVar2 == null || C7321e.m16996L0(hVar2.m20910k()) != file.f25373id) {
                C6246h hVar3 = new C6246h(this.f21820b, file);
                hVar3.mo20767t0(C9903a.getDefaultAvatarCacheSize());
                hVar = hVar3;
            } else {
                hVar = this.f22128x0;
            }
        } else {
            hVar = null;
        }
        m18193i1(hVar, bVar);
    }

    public void m18191o1(int i, int i2) {
        int i3 = this.f22130z0;
        if (i3 != i || this.f22109B0 != i2) {
            this.f22109B0 = i2;
            if (i3 != i) {
                boolean z = true;
                boolean z2 = i3 != 0;
                this.f22130z0 = i;
                this.f22108A0 = mo14042X(i, 0);
                if (i == 0) {
                    z = false;
                }
                if (z2 != z) {
                    m18190q1();
                }
            }
            invalidate();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int timePaddingRight;
        float f;
        float f2;
        TextPaint textPaint;
        float f3;
        float f4;
        C4007j jVar = this.f22113F0;
        if (jVar != null) {
            jVar.m29338e(canvas);
        }
        int measuredWidth = getMeasuredWidth();
        boolean G2 = C4403w.m27984G2();
        m18196e1(measuredWidth);
        boolean z = true;
        if (this.f22128x0 != null) {
            if (this.f22116l0.mo20246c0()) {
                this.f22116l0.mo20228u0(canvas, C9903a.m6659J0(1));
            }
            this.f22116l0.draw(canvas);
        } else {
            C4587b bVar = this.f22129y0;
            if (bVar != null) {
                bVar.m27215a(canvas, this.f22116l0.mo20257I0(), this.f22116l0.mo20227y0());
            }
        }
        if (this.f22118n0 != null) {
            int i = this.f22115k0;
            boolean z2 = (i & 2) != 0;
            if ((i & 1) == 0) {
                z = false;
            }
            TextPaint n1 = C9903a.m6645n1(z);
            int i2 = C1357a0.m37541i(72.0f);
            if (z2) {
                textPaint = n1;
                C1362c.m37485d(canvas, C1392p.m37226j(), i2 - C1357a0.m37541i(6.0f), C1357a0.m37541i(12.0f), C1410y.m37074F(), measuredWidth, G2);
                i2 += C1357a0.m37541i(15.0f);
                textPaint.setColor(C11524j.m228N(R.id.theme_color_textSecure));
            } else {
                textPaint = n1;
            }
            int i3 = i2;
            int i4 = C1357a0.m37541i(28.0f) + C1357a0.m37541i(1.0f);
            Layout layout = this.f22120p0;
            if (layout != null) {
                int color = layout.getPaint().getColor();
                this.f22120p0.getPaint().setColor(textPaint.getColor());
                canvas.save();
                if (G2) {
                    f4 = measuredWidth - i3;
                    if (this.f22120p0.getLineCount() > 0) {
                        f3 = this.f22120p0.getLineLeft(0) + this.f22120p0.getLineWidth(0);
                        canvas.translate(f4 - f3, i4 - C1357a0.m37541i(16.0f));
                        this.f22120p0.draw(canvas);
                        canvas.restore();
                        this.f22120p0.getPaint().setColor(color);
                    }
                    f3 = 0.0f;
                    canvas.translate(f4 - f3, i4 - C1357a0.m37541i(16.0f));
                    this.f22120p0.draw(canvas);
                    canvas.restore();
                    this.f22120p0.getPaint().setColor(color);
                } else {
                    f4 = i3;
                    if (this.f22120p0.getLineCount() > 0) {
                        f3 = this.f22120p0.getLineLeft(0);
                        canvas.translate(f4 - f3, i4 - C1357a0.m37541i(16.0f));
                        this.f22120p0.draw(canvas);
                        canvas.restore();
                        this.f22120p0.getPaint().setColor(color);
                    }
                    f3 = 0.0f;
                    canvas.translate(f4 - f3, i4 - C1357a0.m37541i(16.0f));
                    this.f22120p0.draw(canvas);
                    canvas.restore();
                    this.f22120p0.getPaint().setColor(color);
                }
            } else {
                canvas.drawText((String) this.f22118n0, G2 ? (measuredWidth - i3) - this.f22119o0 : i3, i4, textPaint);
            }
            if (z2 || this.f22120p0 != null) {
                textPaint.setColor(C11524j.m217S0());
            }
        }
        int i5 = -C1357a0.m37541i(1.0f);
        if (this.f22122r0 != null) {
            int i6 = C1357a0.m37541i(72.0f);
            if (this.f22130z0 != 0) {
                i6 += C1357a0.m37541i(20.0f);
            }
            int i7 = C1357a0.m37541i(54.0f) + i5;
            if (this.f22124t0 != null) {
                int i8 = i7 - C1357a0.m37541i(14.5f);
                canvas.save();
                if (G2) {
                    f2 = measuredWidth - i6;
                    if (this.f22124t0.getLineCount() > 0) {
                        f = this.f22124t0.getLineLeft(0) + this.f22124t0.getLineWidth(0);
                        canvas.translate(f2 - f, i8);
                        C1410y.m37030k0(C11524j.m228N(R.id.theme_color_textLight));
                        this.f22124t0.draw(canvas);
                        canvas.restore();
                        C1410y.m37030k0(C11524j.m228N(R.id.theme_color_textLight));
                    }
                    f = 0.0f;
                    canvas.translate(f2 - f, i8);
                    C1410y.m37030k0(C11524j.m228N(R.id.theme_color_textLight));
                    this.f22124t0.draw(canvas);
                    canvas.restore();
                    C1410y.m37030k0(C11524j.m228N(R.id.theme_color_textLight));
                } else {
                    f2 = i6;
                    if (this.f22124t0.getLineCount() > 0) {
                        f = this.f22124t0.getLineLeft(0);
                        canvas.translate(f2 - f, i8);
                        C1410y.m37030k0(C11524j.m228N(R.id.theme_color_textLight));
                        this.f22124t0.draw(canvas);
                        canvas.restore();
                        C1410y.m37030k0(C11524j.m228N(R.id.theme_color_textLight));
                    }
                    f = 0.0f;
                    canvas.translate(f2 - f, i8);
                    C1410y.m37030k0(C11524j.m228N(R.id.theme_color_textLight));
                    this.f22124t0.draw(canvas);
                    canvas.restore();
                    C1410y.m37030k0(C11524j.m228N(R.id.theme_color_textLight));
                }
            } else {
                canvas.drawText((String) this.f22122r0, G2 ? (measuredWidth - i6) - this.f22123s0 : i6, i7, C1410y.m37030k0((this.f22115k0 & 4) != 0 ? C11524j.m228N(R.id.theme_color_textNeutral) : C11524j.m213U0()));
            }
        }
        if (this.f22130z0 != 0) {
            C1362c.m37485d(canvas, this.f22108A0, C1357a0.m37541i(72.0f), C1357a0.m37541i(this.f22130z0 == R.drawable.baseline_call_missed_18 ? 40.0f : 39.0f) + i5, C1411z.m36998b(this.f22109B0), measuredWidth, G2);
        }
        String str = this.f22125u0;
        if (str != null) {
            canvas.drawText(str, G2 ? C9903a.getTimePaddingRight() : (measuredWidth - timePaddingRight) - this.f22126v0, C1357a0.m37541i(28.0f), C9903a.getTimePaint());
        }
        C5375a aVar = this.f22127w0;
        int timePaddingRight2 = C9903a.getTimePaddingRight();
        aVar.m23039d(canvas, G2 ? timePaddingRight2 + C1357a0.m37541i(11.5f) : (measuredWidth - timePaddingRight2) - C1357a0.m37541i(11.5f), getMeasuredHeight() / 2.0f, G2 ? 3 : 5, 1.0f);
        C4007j jVar2 = this.f22113F0;
        if (jVar2 != null) {
            jVar2.m29339d(canvas);
            this.f22113F0.m29341b(canvas);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (this.f22110C0 != measuredWidth) {
            this.f22110C0 = measuredWidth;
            m18196e1(measuredWidth);
            m18189r1();
            m18190q1();
        }
    }

    public final void m18190q1() {
        Layout Q;
        int measuredWidth = getMeasuredWidth();
        if (measuredWidth <= 0 || C5070i.m24061i(this.f22121q0)) {
            this.f22122r0 = null;
            this.f22123s0 = 0.0f;
            return;
        }
        float i = (measuredWidth - C1357a0.m37541i(72.0f)) - C9903a.getTimePaddingRight();
        if (this.f22130z0 != 0) {
            i -= C1357a0.m37541i(18.0f);
        }
        float j = i - this.f22127w0.m23035j(C1357a0.m37541i(8.0f) + C1357a0.m37541i(23.0f));
        CharSequence ellipsize = TextUtils.ellipsize(C5078d.m23986z().m24024I(this.f22121q0), C1410y.m37032j0(), j, TextUtils.TruncateAt.END);
        this.f22122r0 = ellipsize;
        if (!(ellipsize instanceof String)) {
            this.f22124t0 = C7389v0.m16694Q(this.f22122r0, (int) Math.max(C1357a0.m37551D(), j), C1410y.m37032j0());
            this.f22123s0 = Q.getWidth();
            return;
        }
        this.f22124t0 = null;
        this.f22123s0 = C7389v0.m16680T1(ellipsize, C1410y.m37032j0());
    }

    @Override
    public void mo4059q6(long j, boolean z) {
        C10721i0.m4189h(this, j, z);
    }

    public final void m18189r1() {
        Layout Q;
        int measuredWidth = getMeasuredWidth();
        CharSequence charSequence = this.f22117m0;
        if (measuredWidth <= 0 || C5070i.m24061i(charSequence)) {
            this.f22118n0 = null;
            this.f22119o0 = 0.0f;
            return;
        }
        float i = (measuredWidth - C1357a0.m37541i(72.0f)) - C9903a.getTimePaddingRight();
        float f = this.f22126v0;
        if (f != 0.0f) {
            i -= f + C9903a.getTimePaddingLeft();
        }
        if ((this.f22115k0 & 2) != 0) {
            i -= C1357a0.m37541i(15.0f);
        }
        float j = i - this.f22127w0.m23035j(C1357a0.m37541i(8.0f) + C1357a0.m37541i(23.0f));
        boolean z = (this.f22115k0 & 2) != 0;
        CharSequence ellipsize = TextUtils.ellipsize(C5078d.m23986z().m24024I(charSequence), C9903a.m6645n1(z), j, TextUtils.TruncateAt.END);
        this.f22118n0 = ellipsize;
        if (!(ellipsize instanceof String)) {
            this.f22120p0 = C7389v0.m16694Q(this.f22118n0, C1357a0.m37551D(), C9903a.m6645n1(z));
            this.f22119o0 = Q.getWidth();
            return;
        }
        this.f22120p0 = null;
        this.f22119o0 = C7389v0.m16680T1(ellipsize, C9903a.m6645n1(z));
    }

    public void m18188s1(int i, boolean z, boolean z2) {
        this.f22127w0.m23026u(i, z, z2);
    }

    @Override
    public void mo4058s2(long j, boolean z) {
        C10721i0.m4192e(this, j, z);
    }

    @Override
    public void mo4057s4(long j, String str) {
        C10721i0.m4193d(this, j, str);
    }

    public void setCallItem(C4619e eVar) {
        long m = eVar.m26849m();
        TdApi.User v2 = this.f21820b.m2480e2().m1583v2(m);
        m18493w0(null, eVar.m26859c(), null, new C7319d(eVar.m26859c(), eVar.m26857e()), null);
        setTime(C4403w.m27932T2(eVar.m26858d(), TimeUnit.SECONDS));
        setTitle(C4779t2.m25451p2(m, v2));
        m18191o1(eVar.m26853i(), eVar.m26851k());
        setSubtitle(eVar.m26855g());
        boolean z = (v2 == null || v2.profilePhoto == null) ? false : true;
        C4587b bVar = null;
        TdApi.File file = z ? v2.profilePhoto.small : null;
        if (!z && v2 != null) {
            bVar = this.f21820b.m2480e2().m1709N2(v2, true, C9903a.m6657O0(1) / 2.0f, null);
        }
        m18192n1(file, bVar);
        invalidate();
    }

    public void setChat(C4601c3 c3Var) {
        if (c3Var == this.f22111D0) {
            this.f22116l0.m20819G(this.f22128x0);
            return;
        }
        if (this.f22114G0 != null) {
            setMessageImpl(null);
        }
        setChatImpl(c3Var);
        if (c3Var != null) {
            m18186v1(false);
        }
    }

    public void setIsOnline(boolean z) {
        int h = C5063c.m24138h(this.f22115k0, 4, z);
        if (this.f22115k0 != h) {
            this.f22115k0 = h;
            invalidate();
        }
    }

    public void setIsSecret(boolean z) {
        int h = C5063c.m24138h(this.f22115k0, 2, z);
        if (this.f22115k0 != h) {
            this.f22115k0 = h;
            m18189r1();
            invalidate();
        }
    }

    public void setMessage(C4614d3 d3Var) {
        C4587b bVar = null;
        C6246h hVar = null;
        if (this.f22111D0 != null) {
            setChatImpl(null);
        } else if (this.f22114G0 == d3Var) {
            C6257p pVar = this.f22116l0;
            if (d3Var != null) {
                hVar = d3Var.m26898a();
            }
            pVar.m20819G(hVar);
            return;
        }
        setMessageImpl(d3Var);
        if (d3Var != null) {
            TdApi.Message e = d3Var.m26894e();
            this.f22115k0 = C5063c.m24138h(this.f22115k0, 8, d3Var.m26896c().m27031u());
            setTime(C4403w.m27924V2(e.date, TimeUnit.SECONDS));
            setTitle(d3Var.m26896c().m27038n());
            setSubtitle(d3Var.m26893f());
            m18188s1(0, this.f22127w0.m23030p(), false);
            C6246h a = d3Var.m26898a();
            if (d3Var.m26897b() != null) {
                bVar = new C4587b(C9903a.m6657O0(1) / 2.0f, d3Var.m26897b(), null);
            }
            m18193i1(a, bVar);
            invalidate();
        }
    }

    @Override
    public void setRemoveDx(float f) {
        if (this.f22113F0 == null) {
            this.f22113F0 = new C4007j(this, R.drawable.baseline_delete_24);
        }
        this.f22113F0.m29337f(f);
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!C5070i.m24067c(this.f22121q0, charSequence)) {
            this.f22121q0 = charSequence;
            m18190q1();
        }
    }

    public void setTime(String str) {
        if (!C5070i.m24067c(this.f22125u0, str)) {
            this.f22125u0 = str;
            float T1 = C7389v0.m16680T1(str, C9903a.getTimePaint());
            if (this.f22126v0 != T1) {
                this.f22126v0 = T1;
                m18189r1();
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!C5070i.m24067c(this.f22117m0, charSequence)) {
            this.f22117m0 = charSequence;
            this.f22115k0 = C5063c.m24138h(this.f22115k0, 1, charSequence != null && RunnableC5390g.m22983M0(charSequence.toString()));
            m18189r1();
        }
    }

    @Override
    public void mo1555t0(TdApi.Supergroup supergroup) {
        m18208B1(C7316a.m17059b(supergroup.f25425id));
    }

    @Override
    public void mo4056t7(long j, TdApi.ChatPermissions chatPermissions) {
        C10721i0.m4183n(this, j, chatPermissions);
    }

    public final void m18187u1(final long j) {
        this.f21820b.m2469ed(new Runnable() {
            @Override
            public final void run() {
                C6981o.this.m18198c1(j);
            }
        });
    }

    @Override
    public void mo4055u3(long j, TdApi.VideoChat videoChat) {
        C10721i0.m4172y(this, j, videoChat);
    }

    @Override
    public void mo1335u7(long j, TdApi.UserFullInfo userFullInfo) {
        C11133y7.m1438a(this, j, userFullInfo);
    }

    public final void m18186v1(boolean z) {
        if (z) {
            this.f22111D0.m27056I();
        }
        setTitle(this.f22111D0.m27038n());
        m18185z1();
        m18194g1(this.f22111D0.m27050b(), this.f22111D0.m27049c());
        setTime(null);
        m18188s1(this.f22111D0.m27037o(), !this.f22111D0.m27028x(), z);
    }

    @Override
    public void mo4054w1(long j, boolean z) {
        C10721i0.m4194c(this, j, z);
    }

    @Override
    public void mo4053w6(long j, TdApi.ChatPosition chatPosition, boolean z, boolean z2, boolean z3) {
        C10721i0.m4181p(this, j, chatPosition, z, z2, z3);
    }

    @Override
    public void mo3246x1(long j) {
        C10791k1.m3310a(this, j);
    }

    @Override
    public void mo4052y1(long j, long j2) {
        C10721i0.m4179r(this, j, j2);
    }

    @Override
    public void mo3245z0() {
        C10791k1.m3308c(this);
    }

    public final void m18185z1() {
        C4601c3 c3Var = this.f22111D0;
        if (c3Var != null) {
            boolean z = false;
            if (C5070i.m24061i(c3Var.m27045g())) {
                long p = this.f22111D0.m27036p();
                if (this.f22111D0.m27033s()) {
                    setSubtitle(this.f22111D0.m27035q());
                } else {
                    int i = (p > 0L ? 1 : (p == 0L ? 0 : -1));
                    C10802kc xc = this.f21820b.m2166xc();
                    String charSequence = (i != 0 ? xc.m3292q(p) : xc.m3296m(this.f22111D0.m27043i())).toString();
                    if (this.f22111D0.m27030v()) {
                        String R2 = i != 0 ? this.f21820b.m2480e2().m1694R2(p) : this.f21820b.m2462f4(this.f22111D0.m27043i());
                        if (!C5070i.m24061i(R2)) {
                            charSequence = "@" + R2 + ", " + charSequence;
                        }
                    }
                    setSubtitle(charSequence);
                }
                if (!this.f21820b.m2379k7(p) && this.f21820b.m2480e2().m1621m0(p)) {
                    z = true;
                }
                setIsOnline(z);
            } else {
                setSubtitle(this.f22111D0.m27045g());
                setIsOnline(false);
            }
            invalidate();
        }
    }
}
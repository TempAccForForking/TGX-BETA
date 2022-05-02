package me;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.View;
import be.C1357a0;
import be.C1410y;
import gd.C4587b;
import gd.C4779t2;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p139jb.AbstractC5911c;
import p156kd.C6246h;
import p156kd.C6257p;
import p350yd.C10930q6;
import p364zd.C11524j;
import vc.C9903a;

public class C7040u3 extends View implements AbstractC5911c {
    public int f22333N;
    public final Paint f22334a;
    public final C6257p[] f22335b = new C6257p[3];
    public final Rect f22336c = new Rect();
    public final C4587b[] f22332M = new C4587b[3];

    public C7040u3(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f22334a = paint;
        int i = 0;
        setWillNotDraw(false);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        while (true) {
            C6257p[] pVarArr = this.f22335b;
            if (i < pVarArr.length) {
                pVarArr[i] = m18038a();
                i++;
            } else {
                return;
            }
        }
    }

    public final C6257p m18038a() {
        C6257p pVar = new C6257p(this, 1);
        pVar.mo20259D0(0);
        pVar.mo20245f();
        return pVar;
    }

    @Override
    public void mo4501a3() {
        for (C6257p pVar : this.f22335b) {
            pVar.mo20247b();
        }
    }

    public final void m18037b(Canvas canvas, C6257p pVar) {
        canvas.drawCircle(pVar.mo20257I0(), pVar.mo20227y0(), pVar.m20796t() + C1357a0.m37541i(2.0f), this.f22334a);
        canvas.drawCircle(pVar.mo20257I0(), pVar.mo20227y0(), pVar.m20796t(), C1410y.m37039g(C11524j.m241G0()));
    }

    public final void m18036c(Canvas canvas, int i, C6257p pVar) {
        if (i != 0 || this.f22333N != 2) {
            if ((i == 2 || this.f22333N != 1) && this.f22333N != 3) {
                m18037b(canvas, pVar);
                C4587b[] bVarArr = this.f22332M;
                if (bVarArr[i] != null) {
                    bVarArr[i].m27215a(canvas, pVar.mo20257I0(), pVar.mo20227y0());
                }
                pVar.draw(canvas);
            }
        }
    }

    public final void m18035d(long[] jArr, int i, C10930q6 q6Var, C6257p pVar) {
        if (jArr.length > i) {
            TdApi.User a4 = q6Var.m2541a4(jArr[i]);
            if (a4 == null || C4779t2.m25415u3(a4.profilePhoto)) {
                this.f22332M[i] = new C4587b(12.0f, new C4587b.C4588a(C4779t2.m25674I0(a4, q6Var.m2519ba()), C4779t2.m25701E1(a4)), null);
                pVar.m20819G(null);
                return;
            }
            this.f22332M[i] = null;
            C6246h hVar = new C6246h(q6Var, a4.profilePhoto.small);
            hVar.mo20767t0(C9903a.getDefaultAvatarCacheSize());
            pVar.m20819G(hVar);
            return;
        }
        this.f22332M[i] = null;
        pVar.m20819G(null);
    }

    public final void m18034e(C6257p pVar, int i, int i2, int i3, int i4) {
        pVar.mo20256K0(i, i3, i2, i4);
        pVar.mo20259D0(Math.min(pVar.getWidth(), pVar.getHeight()) / 2);
    }

    public void m18033f(C10930q6 q6Var, TdApi.Users users) {
        long[] jArr = users.userIds;
        int i = 0;
        while (true) {
            C6257p[] pVarArr = this.f22335b;
            if (i < pVarArr.length) {
                m18035d(jArr, i, q6Var, pVarArr[i]);
                i++;
            } else {
                m18032g(jArr);
                return;
            }
        }
    }

    public final void m18032g(long[] jArr) {
        if (jArr.length == 1) {
            C4587b[] bVarArr = this.f22332M;
            bVarArr[2] = bVarArr[0];
            C6257p[] pVarArr = this.f22335b;
            pVarArr[2].m20819G(pVarArr[0].m20798r());
            this.f22333N = 1;
        } else if (jArr.length == 2) {
            C4587b[] bVarArr2 = this.f22332M;
            bVarArr2[2] = bVarArr2[1];
            bVarArr2[1] = bVarArr2[0];
            C6257p[] pVarArr2 = this.f22335b;
            pVarArr2[2].m20819G(pVarArr2[1].m20798r());
            C6257p[] pVarArr3 = this.f22335b;
            pVarArr3[1].m20819G(pVarArr3[0].m20798r());
            this.f22333N = 2;
        } else if (jArr.length == 0) {
            this.f22333N = 3;
        } else {
            this.f22333N = 0;
        }
        invalidate();
    }

    @Override
    public void onDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        for (int length = this.f22335b.length - 1; length >= 0; length--) {
            m18036c(canvas, length, this.f22335b[length]);
        }
        canvas.restore();
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int measuredHeight = getMeasuredHeight() - getPaddingBottom();
        float i3 = C1357a0.m37541i(24.0f);
        float f = i3 / 2.0f;
        float f2 = i3 / 4.0f;
        this.f22336c.set(paddingLeft, paddingTop, measuredWidth, measuredHeight);
        int centerY = (int) (this.f22336c.centerY() - f);
        int centerY2 = (int) (this.f22336c.centerY() + f);
        float f3 = 3.0f * f;
        m18034e(this.f22335b[0], (int) ((this.f22336c.centerX() - f3) + f2), (int) ((this.f22336c.centerX() - f) + f2), centerY, centerY2);
        m18034e(this.f22335b[1], (int) (this.f22336c.centerX() - f), (int) (this.f22336c.centerX() + f), centerY, centerY2);
        m18034e(this.f22335b[2], (int) ((this.f22336c.centerX() + f) - f2), (int) ((this.f22336c.centerX() + f3) - f2), centerY, centerY2);
    }
}
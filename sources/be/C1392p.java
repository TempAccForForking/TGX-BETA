package be;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import org.thunderdog.challegram.R;
import p108hb.C5063c;
import p143k0.C6035e;

public class C1392p {
    public static Bitmap f5061a = null;
    public static Drawable f5062b = null;
    public static Drawable f5063c = null;
    public static Drawable f5064d = null;
    public static Drawable f5065e = null;
    public static C6035e<Drawable> f5066f = null;
    public static float f5067g = 6.0f;
    public static float f5068h = 6.0f;
    public static float f5069i = 3.0f;
    public static float f5070j = 6.0f;

    public static Drawable m37235a(int i) {
        return m37222n(R.drawable.deproko_baseline_notifications_off_24, i);
    }

    public static int m37234b() {
        return C1357a0.m37541i(18.0f);
    }

    public static Drawable m37233c() {
        if (f5062b == null) {
            f5062b = C1362c.m37482g(C1379j0.m37372B(), R.drawable.baseline_bookmark_24);
        }
        return f5062b;
    }

    public static Drawable m37232d() {
        if (f5063c == null) {
            f5063c = C1362c.m37482g(C1379j0.m37372B(), R.drawable.deproko_baseline_verify_chat_24);
        }
        return f5063c;
    }

    public static Drawable m37231e(int i) {
        return m37222n(R.drawable.deproko_baseline_clock_24, i);
    }

    public static int m37230f() {
        return C1357a0.m37541i(12.0f);
    }

    public static Drawable m37229g(int i) {
        return m37222n(R.drawable.deproko_baseline_check_double_24, i);
    }

    public static int m37228h() {
        return C1357a0.m37541i(12.0f);
    }

    public static Bitmap m37227i() {
        if (f5061a == null) {
            f5061a = BitmapFactory.decodeResource(C1379j0.m37372B(), R.drawable.bg_livepin);
        }
        return f5061a;
    }

    public static Drawable m37226j() {
        if (f5064d == null) {
            f5064d = C1362c.m37482g(C1379j0.m37372B(), R.drawable.deproko_baseline_lock_24);
        }
        return f5064d;
    }

    public static Drawable m37225k() {
        if (f5065e == null) {
            f5065e = C1362c.m37482g(C1379j0.m37372B(), R.drawable.deproko_baseline_lock_18);
        }
        return f5065e;
    }

    public static Drawable m37224l(int i) {
        return m37222n(R.drawable.deproko_baseline_check_single_24, i);
    }

    public static int m37223m() {
        return C1357a0.m37541i(18.0f);
    }

    public static Drawable m37222n(int i, int i2) {
        if (i2 == 0) {
            return null;
        }
        if (i != R.drawable.deproko_baseline_notifications_off_24) {
            switch (i) {
                case R.drawable.deproko_baseline_check_double_24:
                case R.drawable.deproko_baseline_check_single_24:
                case R.drawable.deproko_baseline_clock_24:
                    break;
                default:
                    return null;
            }
        }
        long f = C5063c.m24140f(i, i2);
        C6035e<Drawable> eVar = f5066f;
        if (eVar == null) {
            f5066f = new C6035e<>();
            Drawable g = C1362c.m37482g(C1379j0.m37372B(), i);
            f5066f.m21500k(f, g);
            return g;
        }
        Drawable f2 = eVar.m21505f(f);
        if (f2 != null) {
            return f2;
        }
        Drawable g2 = C1362c.m37482g(C1379j0.m37372B(), i);
        f5066f.m21500k(f, g2);
        return g2;
    }

    public static void m37221o() {
        f5061a = null;
        f5062b = null;
        f5063c = null;
        f5064d = null;
        f5065e = null;
        C6035e<Drawable> eVar = f5066f;
        if (eVar != null) {
            eVar.m21509b();
        }
        f5061a = null;
    }
}
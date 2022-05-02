package be;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.StateSet;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p110hd.C5078d;
import p110hd.C5087h;
import p110hd.C5088i;
import p111he.C5130n;
import p256s0.C8614h;

public class C1362c {
    public static final int[] f4972a = {16842919};
    public static final int[] f4973b = {16842913};
    public static final int[] f4974c = {16843518};

    public static Drawable m37491a(Context context, Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
        return new BitmapDrawable(bitmap);
    }

    public static void m37490b(Canvas canvas, Drawable drawable, float f, float f2, Paint paint) {
        int i;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int minimumWidth = drawable.getMinimumWidth();
            int minimumHeight = drawable.getMinimumHeight();
            boolean z = false;
            if (!(bounds.top == 0 && bounds.left == 0 && bounds.right == minimumWidth && bounds.bottom == minimumHeight)) {
                drawable.setBounds(0, 0, minimumWidth, minimumHeight);
            }
            m37479m(drawable, paint);
            if (!(f == 0.0f && f2 == 0.0f)) {
                z = true;
            }
            if (z) {
                i = C1399s0.m37202V(canvas);
                canvas.translate(f, f2);
            } else {
                i = -1;
            }
            drawable.draw(canvas);
            if (z) {
                C1399s0.m37204T(canvas, i);
            }
        }
    }

    public static void m37489c(Canvas canvas, Drawable drawable, float f, float f2, Paint paint) {
        m37490b(canvas, drawable, f - (drawable.getMinimumWidth() / 2.0f), f2 - (drawable.getMinimumHeight() / 2.0f), paint);
    }

    public static void m37488d(Canvas canvas, Drawable drawable, float f, float f2, Paint paint, int i, boolean z) {
        if (z) {
            m37490b(canvas, drawable, (i - f) - drawable.getMinimumWidth(), f2, paint);
        } else {
            m37490b(canvas, drawable, f, f2, paint);
        }
    }

    public static Drawable m37487e(String str) {
        C5088i q = C5078d.m23987z().m23996q(str);
        if (q == null) {
            return null;
        }
        return new C5087h(q);
    }

    public static Drawable m37486f(int i) {
        return m37485g(C1379j0.m37375B(), i);
    }

    public static Drawable m37485g(Resources resources, int i) {
        Drawable k = m37481k(resources, i);
        if (k != null) {
            return k.mutate();
        }
        return null;
    }

    public static Bitmap m37484h(int i) {
        if (Build.VERSION.SDK_INT < 21) {
            return BitmapFactory.decodeResource(C1379j0.m37318n().getResources(), i);
        }
        Drawable f = m37486f(i);
        Bitmap createBitmap = Bitmap.createBitmap(f.getIntrinsicWidth(), f.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        f.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        f.draw(canvas);
        return createBitmap;
    }

    public static Drawable m37483i(Drawable drawable, Drawable drawable2) {
        C5130n nVar = new C5130n();
        nVar.addState(f4972a, drawable2);
        nVar.addState(f4973b, drawable2);
        nVar.addState(f4974c, drawable2);
        if (drawable != null) {
            nVar.addState(StateSet.WILD_CARD, drawable);
        }
        return nVar;
    }

    public static Drawable m37482j(int i) {
        return m37481k(C1379j0.m37375B(), i);
    }

    public static Drawable m37481k(Resources resources, int i) {
        if (i == 0) {
            return null;
        }
        Drawable d = C8614h.m11918d(resources, i, null);
        if (d != null) {
            return d;
        }
        throw new Resources.NotFoundException("res == " + i);
    }

    public static boolean m37480l(int i) {
        if (!C4403w.m27986G2()) {
            return false;
        }
        switch (i) {
            case R.drawable.baseline_arrow_forward_24:
            case R.drawable.baseline_content_copy_24:
            case R.drawable.baseline_forward_24:
            case R.drawable.baseline_reply_24:
            case R.drawable.baseline_share_24:
            case R.drawable.deproko_baseline_send_24:
                return true;
            default:
                return false;
        }
    }

    public static void m37479m(Drawable drawable, Paint paint) {
        if (paint != null) {
            int alpha = paint.getAlpha();
            ColorFilter colorFilter = paint.getColorFilter();
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getPaint().getColorFilter() != colorFilter) {
                    drawable.setColorFilter(colorFilter);
                }
                bitmapDrawable.setAlpha(alpha);
                return;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 21 && colorFilter != drawable.getColorFilter()) {
                drawable.setColorFilter(colorFilter);
            }
            if (i >= 19 && alpha != drawable.getAlpha()) {
                drawable.setAlpha(alpha);
            }
        }
    }

    public static void m37478n(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT < 21) {
            drawable.setAlpha(i);
        } else if (drawable.getAlpha() != i) {
            drawable.setAlpha(i);
        }
    }

    public static Bitmap m37477o(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        canvas.setBitmap(null);
        return createBitmap;
    }
}

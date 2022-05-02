package p280u0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public class C9414d extends Drawable implements Drawable.Callback, AbstractC9413c, AbstractC9412b {
    public static final PorterDuff.Mode f30467P = PorterDuff.Mode.SRC_IN;
    public C9416f f30468M;
    public boolean f30469N;
    public Drawable f30470O;
    public int f30471a;
    public PorterDuff.Mode f30472b;
    public boolean f30473c;

    public C9414d(C9416f fVar, Resources resources) {
        this.f30468M = fVar;
        m8747e(resources);
    }

    @Override
    public final void mo8750a(Drawable drawable) {
        Drawable drawable2 = this.f30470O;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f30470O = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C9416f fVar = this.f30468M;
            if (fVar != null) {
                fVar.f30476b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override
    public final Drawable mo8749b() {
        return this.f30470O;
    }

    public boolean mo8745c() {
        return true;
    }

    public final C9416f m8748d() {
        return new C9416f(this.f30468M);
    }

    @Override
    public void draw(Canvas canvas) {
        this.f30470O.draw(canvas);
    }

    public final void m8747e(Resources resources) {
        Drawable.ConstantState constantState;
        C9416f fVar = this.f30468M;
        if (fVar != null && (constantState = fVar.f30476b) != null) {
            mo8750a(constantState.newDrawable(resources));
        }
    }

    public final boolean m8746f(int[] iArr) {
        if (!mo8745c()) {
            return false;
        }
        C9416f fVar = this.f30468M;
        ColorStateList colorStateList = fVar.f30477c;
        PorterDuff.Mode mode = fVar.f30478d;
        if (colorStateList == null || mode == null) {
            this.f30473c = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f30473c && colorForState == this.f30471a && mode == this.f30472b)) {
                setColorFilter(colorForState, mode);
                this.f30471a = colorForState;
                this.f30472b = mode;
                this.f30473c = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C9416f fVar = this.f30468M;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f30470O.getChangingConfigurations();
    }

    @Override
    public Drawable.ConstantState getConstantState() {
        C9416f fVar = this.f30468M;
        if (fVar == null || !fVar.m8743a()) {
            return null;
        }
        this.f30468M.f30475a = getChangingConfigurations();
        return this.f30468M;
    }

    @Override
    public Drawable getCurrent() {
        return this.f30470O.getCurrent();
    }

    @Override
    public int getIntrinsicHeight() {
        return this.f30470O.getIntrinsicHeight();
    }

    @Override
    public int getIntrinsicWidth() {
        return this.f30470O.getIntrinsicWidth();
    }

    @Override
    public int getLayoutDirection() {
        return C9411a.m8763e(this.f30470O);
    }

    @Override
    public int getMinimumHeight() {
        return this.f30470O.getMinimumHeight();
    }

    @Override
    public int getMinimumWidth() {
        return this.f30470O.getMinimumWidth();
    }

    @Override
    public int getOpacity() {
        return this.f30470O.getOpacity();
    }

    @Override
    public boolean getPadding(Rect rect) {
        return this.f30470O.getPadding(rect);
    }

    @Override
    public int[] getState() {
        return this.f30470O.getState();
    }

    @Override
    public Region getTransparentRegion() {
        return this.f30470O.getTransparentRegion();
    }

    @Override
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public boolean isAutoMirrored() {
        return C9411a.m8761g(this.f30470O);
    }

    @Override
    public boolean isStateful() {
        C9416f fVar;
        ColorStateList colorStateList = (!mo8745c() || (fVar = this.f30468M) == null) ? null : fVar.f30477c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f30470O.isStateful();
    }

    @Override
    public void jumpToCurrentState() {
        this.f30470O.jumpToCurrentState();
    }

    @Override
    public Drawable mutate() {
        if (!this.f30469N && super.mutate() == this) {
            this.f30468M = m8748d();
            Drawable drawable = this.f30470O;
            if (drawable != null) {
                drawable.mutate();
            }
            C9416f fVar = this.f30468M;
            if (fVar != null) {
                Drawable drawable2 = this.f30470O;
                fVar.f30476b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f30469N = true;
        }
        return this;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f30470O;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override
    public boolean onLayoutDirectionChanged(int i) {
        return C9411a.m8756l(this.f30470O, i);
    }

    @Override
    public boolean onLevelChange(int i) {
        return this.f30470O.setLevel(i);
    }

    @Override
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override
    public void setAlpha(int i) {
        this.f30470O.setAlpha(i);
    }

    @Override
    public void setAutoMirrored(boolean z) {
        C9411a.m8759i(this.f30470O, z);
    }

    @Override
    public void setChangingConfigurations(int i) {
        this.f30470O.setChangingConfigurations(i);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f30470O.setColorFilter(colorFilter);
    }

    @Override
    public void setDither(boolean z) {
        this.f30470O.setDither(z);
    }

    @Override
    public void setFilterBitmap(boolean z) {
        this.f30470O.setFilterBitmap(z);
    }

    @Override
    public boolean setState(int[] iArr) {
        return m8746f(iArr) || this.f30470O.setState(iArr);
    }

    @Override
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        this.f30468M.f30477c = colorStateList;
        m8746f(getState());
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        this.f30468M.f30478d = mode;
        m8746f(getState());
    }

    @Override
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f30470O.setVisible(z, z2);
    }

    @Override
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public C9414d(Drawable drawable) {
        this.f30468M = m8748d();
        mo8750a(drawable);
    }
}

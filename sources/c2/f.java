package c2;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import u0.a;
import u0.b;

public abstract class f extends Drawable implements b {
    public Drawable f4337a;

    @Override
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            a.a(drawable, theme);
        }
    }

    @Override
    public void clearColorFilter() {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override
    public Drawable getCurrent() {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return drawable.getCurrent();
        }
        return super.getCurrent();
    }

    @Override
    public int getMinimumHeight() {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    @Override
    public int getMinimumWidth() {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    @Override
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    @Override
    public int[] getState() {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return drawable.getState();
        }
        return super.getState();
    }

    @Override
    public Region getTransparentRegion() {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    @Override
    public void jumpToCurrentState() {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            a.h(drawable);
        }
    }

    @Override
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        return super.onLevelChange(i10);
    }

    @Override
    public void setChangingConfigurations(int i10) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            drawable.setChangingConfigurations(i10);
        } else {
            super.setChangingConfigurations(i10);
        }
    }

    @Override
    public void setColorFilter(int i10, PorterDuff.Mode mode) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            drawable.setColorFilter(i10, mode);
        } else {
            super.setColorFilter(i10, mode);
        }
    }

    @Override
    public void setFilterBitmap(boolean z10) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            drawable.setFilterBitmap(z10);
        }
    }

    @Override
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            a.j(drawable, f10, f11);
        }
    }

    @Override
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            a.k(drawable, i10, i11, i12, i13);
        }
    }

    @Override
    public boolean setState(int[] iArr) {
        Drawable drawable = this.f4337a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return super.setState(iArr);
    }
}

package me;

import android.view.View;
import p037cb.C2057b;
import p051db.C3950k;
import p156kd.C6257p;

public class C6935j3 implements C3950k.AbstractC3952b {
    public C3950k f21914M;
    public boolean f21915N;
    public final View f21916a;
    public final C6257p f21917b;
    public float f21918c;

    public interface AbstractC6936a {
        void mo17753j(float f);
    }

    public C6935j3(View view, C6257p pVar) {
        this.f21916a = view;
        this.f21917b = pVar;
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        m18403c(f);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public float m18405a() {
        return this.f21918c;
    }

    public boolean m18404b() {
        return this.f21915N;
    }

    public final void m18403c(float f) {
        if (this.f21918c != f) {
            this.f21918c = f;
            this.f21916a.invalidate();
            View view = this.f21916a;
            if (view instanceof AbstractC6936a) {
                ((AbstractC6936a) view).mo17753j(f);
            }
        }
    }

    public void m18402d(boolean z, boolean z2) {
        if (this.f21915N != z) {
            this.f21915N = z;
            float f = z ? 1.0f : 0.0f;
            if (z2) {
                if (this.f21914M == null) {
                    this.f21914M = new C3950k(0, this, C2057b.f7280b, 180L, this.f21918c);
                }
                this.f21914M.m29546i(f);
                return;
            }
            C3950k kVar = this.f21914M;
            if (kVar != null) {
                kVar.m29543l(f);
            }
            m18403c(f);
        }
    }
}

package i6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import b6.a;
import b6.c;
import u5.b;

public final class r extends a implements e {
    public r(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
    }

    @Override
    public final void B(p pVar) {
        Parcel r10 = r();
        c.e(r10, pVar);
        t(9, r10);
    }

    @Override
    public final void c() {
        t(3, r());
    }

    @Override
    public final void f() {
        t(4, r());
    }

    @Override
    public final void g() {
        t(5, r());
    }

    @Override
    public final void i(Bundle bundle) {
        Parcel r10 = r();
        c.d(r10, bundle);
        t(2, r10);
    }

    @Override
    public final b s() {
        Parcel q10 = q(8, r());
        b r10 = b.a.r(q10.readStrongBinder());
        q10.recycle();
        return r10;
    }
}

package p007a6;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import p272t5.AbstractC8983b;

public final class C0191d extends C0188a implements AbstractC0193f {
    public C0191d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override
    public final AbstractC8983b mo42118y0(Bitmap bitmap) {
        Parcel s = m42126s();
        C0190c.m42121d(s, bitmap);
        Parcel q = m42127q(6, s);
        AbstractC8983b s2 = AbstractC8983b.AbstractBinderC8984a.m10769s(q.readStrongBinder());
        q.recycle();
        return s2;
    }
}
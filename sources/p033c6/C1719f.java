package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C1719f implements Parcelable.Creator<C1704e> {
    @Override
    public final C1704e createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            int k = C6750b.m19140k(q);
            if (k == 2) {
                i = C6750b.m19132s(parcel, q);
            } else if (k != 3) {
                C6750b.m19128w(parcel, q);
            } else {
                z = C6750b.m19139l(parcel, q);
            }
        }
        C6750b.m19141j(parcel, x);
        return new C1704e(i, z);
    }

    @Override
    public final C1704e[] newArray(int i) {
        return new C1704e[i];
    }
}
package p163l5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p176m5.C6750b;

public final class C6320a0 implements Parcelable.Creator<C6390v> {
    @Override
    public final C6390v createFromParcel(Parcel parcel) {
        int x = C6750b.m19128x(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19135q(parcel);
            int k = C6750b.m19141k(q);
            if (k == 1) {
                i = C6750b.m19133s(parcel, q);
            } else if (k != 2) {
                C6750b.m19129w(parcel, q);
            } else {
                arrayList = C6750b.m19143i(parcel, q, C6371p.CREATOR);
            }
        }
        C6750b.m19142j(parcel, x);
        return new C6390v(i, arrayList);
    }

    @Override
    public final C6390v[] newArray(int i) {
        return new C6390v[i];
    }
}

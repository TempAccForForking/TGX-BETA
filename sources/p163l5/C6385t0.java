package p163l5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p176m5.C6750b;

public final class C6385t0 implements Parcelable.Creator<C6382s0> {
    @Override
    public final C6382s0 createFromParcel(Parcel parcel) {
        int x = C6750b.m19128x(parcel);
        int i = 0;
        Scope[] scopeArr = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19135q(parcel);
            int k = C6750b.m19141k(q);
            if (k == 1) {
                i = C6750b.m19133s(parcel, q);
            } else if (k == 2) {
                i2 = C6750b.m19133s(parcel, q);
            } else if (k == 3) {
                i3 = C6750b.m19133s(parcel, q);
            } else if (k != 4) {
                C6750b.m19129w(parcel, q);
            } else {
                scopeArr = (Scope[]) C6750b.m19144h(parcel, q, Scope.CREATOR);
            }
        }
        C6750b.m19142j(parcel, x);
        return new C6382s0(i, i2, i3, scopeArr);
    }

    @Override
    public final C6382s0[] newArray(int i) {
        return new C6382s0[i];
    }
}

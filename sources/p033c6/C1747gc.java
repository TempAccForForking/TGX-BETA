package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C1747gc implements Parcelable.Creator<C1732fc> {
    @Override
    public final C1732fc createFromParcel(Parcel parcel) {
        int x = C6750b.m19128x(parcel);
        int i = 0;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19135q(parcel);
            if (C6750b.m19141k(q) != 1) {
                C6750b.m19129w(parcel, q);
            } else {
                i = C6750b.m19133s(parcel, q);
            }
        }
        C6750b.m19142j(parcel, x);
        return new C1732fc(i);
    }

    @Override
    public final C1732fc[] newArray(int i) {
        return new C1732fc[i];
    }
}

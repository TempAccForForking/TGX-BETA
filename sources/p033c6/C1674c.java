package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C1674c implements Parcelable.Creator<C2018zc> {
    @Override
    public final C2018zc createFromParcel(Parcel parcel) {
        int x = C6750b.m19128x(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19135q(parcel);
            int k = C6750b.m19141k(q);
            if (k == 2) {
                str = C6750b.m19147e(parcel, q);
            } else if (k != 3) {
                C6750b.m19129w(parcel, q);
            } else {
                str2 = C6750b.m19147e(parcel, q);
            }
        }
        C6750b.m19142j(parcel, x);
        return new C2018zc(str, str2);
    }

    @Override
    public final C2018zc[] newArray(int i) {
        return new C2018zc[i];
    }
}

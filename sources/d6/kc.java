package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class kc implements Parcelable.Creator<vb> {
    @Override
    public final vb createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            switch (b.k(q10)) {
                case 1:
                    str = b.e(parcel, q10);
                    break;
                case 2:
                    str2 = b.e(parcel, q10);
                    break;
                case 3:
                    str3 = b.e(parcel, q10);
                    break;
                case 4:
                    str4 = b.e(parcel, q10);
                    break;
                case 5:
                    str5 = b.e(parcel, q10);
                    break;
                case 6:
                    str6 = b.e(parcel, q10);
                    break;
                case 7:
                    str7 = b.e(parcel, q10);
                    break;
                case 8:
                    str8 = b.e(parcel, q10);
                    break;
                case 9:
                    str9 = b.e(parcel, q10);
                    break;
                case 10:
                    str10 = b.e(parcel, q10);
                    break;
                case 11:
                    str11 = b.e(parcel, q10);
                    break;
                case 12:
                    str12 = b.e(parcel, q10);
                    break;
                case 13:
                    str13 = b.e(parcel, q10);
                    break;
                case 14:
                    str14 = b.e(parcel, q10);
                    break;
                default:
                    b.w(parcel, q10);
                    break;
            }
        }
        b.j(parcel, x10);
        return new vb(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    @Override
    public final vb[] newArray(int i10) {
        return new vb[i10];
    }
}

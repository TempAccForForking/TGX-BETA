package w5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class b extends Binder implements IInterface {
    public b(String str) {
        attachInterface(this, str);
    }

    public boolean E1(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        return E1(i10, parcel, parcel2, i11);
    }
}

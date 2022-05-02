package p230q3;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import p020b5.C1216l0;
import p230q3.C8182h;

public final class C8160c0 {

    public static final class C8161a {
        public static boolean m13338a(Throwable th) {
            return th instanceof DeniedByServerException;
        }

        public static boolean m13337b(Throwable th) {
            return th instanceof NotProvisionedException;
        }
    }

    public static final class C8162b {
        public static boolean m13336a(Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        public static int m13335b(Throwable th) {
            return C1216l0.m37999N(C1216l0.m37998O(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    public static final class C8163c {
        public static boolean m13334a(Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    public static int m13339a(Exception exc, int i) {
        int i2 = C1216l0.f4526a;
        if (i2 >= 21 && C8162b.m13336a(exc)) {
            return C8162b.m13335b(exc);
        }
        if (i2 >= 23 && C8163c.m13334a(exc)) {
            return 6006;
        }
        if (i2 >= 18 && C8161a.m13337b(exc)) {
            return 6002;
        }
        if (i2 >= 18 && C8161a.m13338a(exc)) {
            return 6007;
        }
        if (exc instanceof C8210o0) {
            return 6001;
        }
        if (exc instanceof C8182h.C8187e) {
            return 6003;
        }
        if (exc instanceof C8200l0) {
            return 6008;
        }
        if (i == 1) {
            return 6006;
        }
        if (i == 2) {
            return 6004;
        }
        if (i == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }
}
package p236q9;

import java.nio.ShortBuffer;
import p123ia.C5300j0;

public interface AbstractC8281a {
    public static final C8282a f26765a = C8282a.f26766a;

    public static final class C8282a {
        public static final C8282a f26766a = new C8282a();

        public final AbstractC8281a m12952a(int i, int i2) {
            if (!C5300j0.m23375e(1, 2).contains(Integer.valueOf(i))) {
                throw new IllegalStateException(("Input channel count not supported: " + i).toString());
            } else if (!C5300j0.m23375e(1, 2).contains(Integer.valueOf(i2))) {
                throw new IllegalStateException(("Input channel count not supported: " + i).toString());
            } else if (i < i2) {
                return new C8285d();
            } else {
                if (i > i2) {
                    return new C8283b();
                }
                return new C8284c();
            }
        }
    }

    void mo12951a(ShortBuffer shortBuffer, ShortBuffer shortBuffer2);

    int mo12950b(int i);
}

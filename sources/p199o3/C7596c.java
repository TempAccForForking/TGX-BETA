package p199o3;

import java.nio.ByteBuffer;
import org.thunderdog.challegram.Log;
import p020b5.C1187a0;
import p020b5.C1189b0;
import p174m3.C6600g1;
import p230q3.C8201m;

public final class C7596c {
    public static final int[] f24315a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, Log.TAG_VOICE};

    public static final class C7598b {
        public final int f24316a;
        public final int f24317b;
        public final int f24318c;
        public final int f24319d;
        public final int f24320e;

        public C7598b(int i, int i2, int i3, int i4, int i5) {
            this.f24316a = i;
            this.f24318c = i2;
            this.f24317b = i3;
            this.f24319d = i4;
            this.f24320e = i5;
        }
    }

    public static void m15549a(int i, C1189b0 b0Var) {
        b0Var.m38148L(7);
        byte[] d = b0Var.m38139d();
        d[0] = -84;
        d[1] = 64;
        d[2] = -1;
        d[3] = -1;
        d[4] = (byte) ((i >> 16) & 255);
        d[5] = (byte) ((i >> 8) & 255);
        d[6] = (byte) (i & 255);
    }

    public static C6600g1 m15548b(C1189b0 b0Var, String str, String str2, C8201m mVar) {
        b0Var.m38143Q(1);
        return new C6600g1.C6602b().m19875S(str).m19858e0("audio/ac4").m19886H(2).m19856f0(((b0Var.m38156D() & 32) >> 5) == 1 ? 48000 : 44100).m19881M(mVar).m19872V(str2).m19889E();
    }

    public static int m15547c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return m15546d(new C1187a0(bArr)).f24320e;
    }

    public static p199o3.C7596c.C7598b m15546d(p020b5.C1187a0 r10) {
        throw new UnsupportedOperationException("Method not decompiled: p199o3.C7596c.m15546d(b5.a0):o3.c$b");
    }

    public static int m15545e(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i3 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i3 == 65535) {
            i3 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return i3 + i2;
    }

    public static int m15544f(C1187a0 a0Var, int i) {
        int i2 = 0;
        while (true) {
            int h = i2 + a0Var.m38173h(i);
            if (!a0Var.m38174g()) {
                return h;
            }
            i2 = (h + 1) << i;
        }
    }
}
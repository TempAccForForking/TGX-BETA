package p005a4;

import org.thunderdog.challegram.Log;
import p020b5.C1216l0;

public final class C0093d {

    public static final class C0095b {
        public final long[] f313a;
        public final int[] f314b;
        public final int f315c;
        public final long[] f316d;
        public final int[] f317e;
        public final long f318f;

        public C0095b(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.f313a = jArr;
            this.f314b = iArr;
            this.f315c = i;
            this.f316d = jArr2;
            this.f317e = iArr2;
            this.f318f = j;
        }
    }

    public static C0095b m42378a(int i, long[] jArr, int[] iArr, long j) {
        int i2 = Log.TAG_LUX / i;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += C1216l0.m37967l(i4, i2);
        }
        long[] jArr2 = new long[i3];
        int[] iArr2 = new int[i3];
        long[] jArr3 = new long[i3];
        int[] iArr3 = new int[i3];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            int i9 = iArr[i8];
            long j2 = jArr[i8];
            while (i9 > 0) {
                int min = Math.min(i2, i9);
                jArr2[i6] = j2;
                iArr2[i6] = i * min;
                i7 = Math.max(i7, iArr2[i6]);
                jArr3[i6] = i5 * j;
                iArr3[i6] = 1;
                j2 += iArr2[i6];
                i5 += min;
                i9 -= min;
                i6++;
            }
        }
        return new C0095b(jArr2, iArr2, i7, jArr3, iArr3, j * i5);
    }
}

package p025bc;

import org.thunderdog.challegram.Log;
import qa.C8294g;
import qa.C8298k;

public final class C1352m {
    public static final C1353a f4932c = new C1353a(null);
    public int f4933a;
    public final int[] f4934b = new int[10];

    public static final class C1353a {
        public C1353a() {
        }

        public C1353a(C8294g gVar) {
            this();
        }
    }

    public final int m37575a(int i) {
        return this.f4934b[i];
    }

    public final int m37574b() {
        if ((this.f4933a & 2) != 0) {
            return this.f4934b[1];
        }
        return -1;
    }

    public final int m37573c() {
        if ((this.f4933a & Log.TAG_YOUTUBE) != 0) {
            return this.f4934b[7];
        }
        return 65535;
    }

    public final int m37572d() {
        if ((this.f4933a & 16) != 0) {
            return this.f4934b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int m37571e(int i) {
        return (this.f4933a & 32) != 0 ? this.f4934b[5] : i;
    }

    public final boolean m37570f(int i) {
        return ((1 << i) & this.f4933a) != 0;
    }

    public final void m37569g(C1352m mVar) {
        C8298k.m12933e(mVar, "other");
        for (int i = 0; i < 10; i++) {
            if (mVar.m37570f(i)) {
                m37568h(i, mVar.m37575a(i));
            }
        }
    }

    public final C1352m m37568h(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f4934b;
            if (i < iArr.length) {
                this.f4933a = (1 << i) | this.f4933a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    public final int m37567i() {
        return Integer.bitCount(this.f4933a);
    }
}

package p124ib;

import p108hb.C5062b;

public final class C5324g implements Cloneable {
    public long[] f17502a;
    public int[] f17503b;
    public int f17504c;

    public C5324g() {
        this(10);
    }

    public void m23258a() {
        this.f17504c = 0;
    }

    public C5324g clone() {
        C5324g gVar = null;
        try {
            C5324g gVar2 = (C5324g) super.clone();
            try {
                gVar2.f17502a = (long[]) this.f17502a.clone();
                gVar2.f17503b = (int[]) this.f17503b.clone();
                return gVar2;
            } catch (CloneNotSupportedException unused) {
                gVar = gVar2;
                return gVar;
            }
        } catch (CloneNotSupportedException unused2) {
        }
    }

    public void m23256c(long j) {
        int b = C5318a.m23299b(this.f17502a, this.f17504c, j);
        if (b >= 0) {
            m23251h(b);
        }
    }

    public int m23255d(long j) {
        return m23254e(j, 0);
    }

    public int m23254e(long j, int i) {
        int b = C5318a.m23299b(this.f17502a, this.f17504c, j);
        return b < 0 ? i : this.f17503b[b];
    }

    public long m23253f(int i) {
        return this.f17502a[i];
    }

    public void m23252g(long j, int i) {
        int b = C5318a.m23299b(this.f17502a, this.f17504c, j);
        if (b >= 0) {
            this.f17503b[b] = i;
            return;
        }
        int i2 = ~b;
        this.f17502a = C5318a.m23294g(this.f17502a, this.f17504c, i2, j);
        this.f17503b = C5318a.m23295f(this.f17503b, this.f17504c, i2, i);
        this.f17504c++;
    }

    public void m23251h(int i) {
        long[] jArr = this.f17502a;
        int i2 = i + 1;
        System.arraycopy(jArr, i2, jArr, i, this.f17504c - i2);
        int[] iArr = this.f17503b;
        System.arraycopy(iArr, i2, iArr, i, this.f17504c - i2);
        this.f17504c--;
    }

    public int m23250i() {
        return this.f17504c;
    }

    public int m23249j(int i) {
        return this.f17503b[i];
    }

    public String toString() {
        if (m23250i() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f17504c * 28);
        sb2.append('{');
        for (int i = 0; i < this.f17504c; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            sb2.append(m23253f(i));
            sb2.append('=');
            sb2.append(m23249j(i));
        }
        sb2.append('}');
        return sb2.toString();
    }

    public C5324g(int i) {
        if (i == 0) {
            this.f17502a = C5062b.f17069b;
            this.f17503b = C5062b.f17068a;
        } else {
            int e = C5318a.m23296e(i);
            this.f17502a = new long[e];
            this.f17503b = new int[e];
        }
        this.f17504c = 0;
    }
}
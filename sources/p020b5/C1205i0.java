package p020b5;

public final class C1205i0 {
    public long f4510a;
    public long f4511b;
    public long f4512c;
    public final ThreadLocal<Long> f4513d = new ThreadLocal<>();

    public C1205i0(long j) {
        m38047g(j);
    }

    public static long m38048f(long j) {
        return (j * 1000000) / 90000;
    }

    public static long m38046h(long j) {
        return (j * 90000) / 1000000;
    }

    public synchronized long m38053a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f4511b == -9223372036854775807L) {
            long j2 = this.f4510a;
            if (j2 == 9223372036854775806L) {
                j2 = ((Long) C1186a.m38185e(this.f4513d.get())).longValue();
            }
            this.f4511b = j2 - j;
            notifyAll();
        }
        this.f4512c = j;
        return j + this.f4511b;
    }

    public synchronized long m38052b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.f4512c;
        if (j2 != -9223372036854775807L) {
            long h = m38046h(j2);
            long j3 = (4294967296L + h) / 8589934592L;
            long j4 = ((j3 - 1) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - h) < Math.abs(j - h)) {
                j = j4;
            }
        }
        return m38053a(m38048f(j));
    }

    public synchronized long m38051c() {
        long j;
        j = this.f4510a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public synchronized long m38050d() {
        long j;
        long j2 = this.f4512c;
        if (j2 != -9223372036854775807L) {
            j = j2 + this.f4511b;
        } else {
            j = m38051c();
        }
        return j;
    }

    public synchronized long m38049e() {
        return this.f4511b;
    }

    public synchronized void m38047g(long j) {
        this.f4510a = j;
        this.f4511b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f4512c = -9223372036854775807L;
    }
}
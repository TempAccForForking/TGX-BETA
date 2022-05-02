package p032c5;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import org.thunderdog.challegram.Log;
import p020b5.C1186a;
import p020b5.C1210j0;
import p020b5.C1216l0;
import p020b5.C1230s;
import p020b5.C1233v;
import p020b5.C1234w;
import p032c5.AbstractC1642z;
import p039d.C3563j;
import p059e4.AbstractC4134l;
import p059e4.AbstractC4140o;
import p059e4.AbstractC4143q;
import p059e4.C4138m;
import p059e4.C4139n;
import p059e4.C4148v;
import p174m3.C6600g1;
import p174m3.C6612h1;
import p174m3.C6681q;
import p174m3.C6701t2;
import p216p3.C8024e;
import p216p3.C8026g;
import p216p3.C8028h;

public class C1618j extends AbstractC4140o {
    public static final int[] f5965X1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean f5966Y1;
    public static boolean f5967Z1;
    public int f5968A1;
    public boolean f5969B1;
    public boolean f5970C1;
    public boolean f5971D1;
    public long f5972E1;
    public long f5973F1;
    public long f5974G1;
    public int f5975H1;
    public int f5976I1;
    public int f5977J1;
    public long f5978K1;
    public long f5979L1;
    public long f5980M1;
    public int f5981N1;
    public int f5982O1;
    public int f5983P1;
    public int f5984Q1;
    public float f5985R1;
    public C1607b0 f5986S1;
    public boolean f5987T1;
    public int f5988U1;
    public C1620b f5989V1;
    public AbstractC1622l f5990W1;
    public final Context f5991o1;
    public final C1624n f5992p1;
    public final AbstractC1642z.C1643a f5993q1;
    public final long f5994r1;
    public final int f5995s1;
    public final boolean f5996t1;
    public C1619a f5997u1;
    public boolean f5998v1;
    public boolean f5999w1;
    public Surface f6000x1;
    public C1611f f6001y1;
    public boolean f6002z1;

    public static final class C1619a {
        public final int f6003a;
        public final int f6004b;
        public final int f6005c;

        public C1619a(int i, int i2, int i3) {
            this.f6003a = i;
            this.f6004b = i2;
            this.f6005c = i3;
        }
    }

    public final class C1620b implements AbstractC4134l.AbstractC4137c, Handler.Callback {
        public final Handler f6006a;

        public C1620b(AbstractC4134l lVar) {
            Handler v = C1216l0.m37944v(this);
            this.f6006a = v;
            lVar.mo28652o(this, v);
        }

        @Override
        public void mo28810a(AbstractC4134l lVar, long j, long j2) {
            if (C1216l0.f4526a < 30) {
                this.f6006a.sendMessageAtFrontOfQueue(Message.obtain(this.f6006a, 0, (int) (j >> 32), (int) j));
                return;
            }
            m36186b(j);
        }

        public final void m36186b(long j) {
            C1618j jVar = C1618j.this;
            if (this == jVar.f5989V1) {
                if (j == Long.MAX_VALUE) {
                    jVar.m36213O1();
                    return;
                }
                try {
                    jVar.m36214N1(j);
                } catch (C6681q e) {
                    C1618j.this.m28747e1(e);
                }
            }
        }

        @Override
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            m36186b(C1216l0.m38012E0(message.arg1, message.arg2));
            return true;
        }
    }

    public C1618j(Context context, AbstractC4134l.AbstractC4136b bVar, AbstractC4143q qVar, long j, boolean z, Handler handler, AbstractC1642z zVar, int i) {
        this(context, bVar, qVar, j, z, handler, zVar, i, 30.0f);
    }

    public static List<C4139n> m36227A1(AbstractC4143q qVar, C6600g1 g1Var, boolean z, boolean z2) {
        Pair<Integer, Integer> p;
        String str = g1Var.f20575U;
        if (str == null) {
            return Collections.emptyList();
        }
        List<C4139n> t = C4148v.m28680t(qVar.mo28717a(str, z, z2), g1Var);
        if ("video/dolby-vision".equals(str) && (p = C4148v.m28684p(g1Var)) != null) {
            int intValue = ((Integer) p.first).intValue();
            if (intValue == 16 || intValue == 256) {
                t.addAll(qVar.mo28717a("video/hevc", z, z2));
            } else if (intValue == 512) {
                t.addAll(qVar.mo28717a("video/avc", z, z2));
            }
        }
        return Collections.unmodifiableList(t);
    }

    public static int m36226B1(C4139n nVar, C6600g1 g1Var) {
        if (g1Var.f20576V == -1) {
            return m36189x1(nVar, g1Var);
        }
        int size = g1Var.f20577W.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += g1Var.f20577W.get(i2).length;
        }
        return g1Var.f20576V + i;
    }

    public static boolean m36224D1(long j) {
        return j < -30000;
    }

    public static boolean m36223E1(long j) {
        return j < -500000;
    }

    public static void m36209S1(AbstractC4134l lVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        lVar.mo28663d(bundle);
    }

    public static void m36193t1(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    public static boolean m36192u1() {
        return "NVIDIA".equals(C1216l0.f4528c);
    }

    public static boolean m36190w1() {
        throw new UnsupportedOperationException("Method not decompiled: p032c5.C1618j.m36190w1():boolean");
    }

    public static int m36189x1(p059e4.C4139n r10, p174m3.C6600g1 r11) {
        throw new UnsupportedOperationException("Method not decompiled: p032c5.C1618j.m36189x1(e4.n, m3.g1):int");
    }

    public static Point m36188y1(C4139n nVar, C6600g1 g1Var) {
        int[] iArr;
        int i = g1Var.f20582a0;
        int i2 = g1Var.f20580Z;
        boolean z = i > i2;
        int i3 = z ? i : i2;
        if (z) {
            i = i2;
        }
        float f = i / i3;
        for (int i4 : f5965X1) {
            int i5 = (int) (i4 * f);
            if (i4 <= i3 || i5 <= i) {
                break;
            }
            if (C1216l0.f4526a >= 21) {
                int i6 = z ? i5 : i4;
                if (!z) {
                    i4 = i5;
                }
                Point b = nVar.m28806b(i6, i4);
                if (nVar.m28788t(b.x, b.y, g1Var.f20584b0)) {
                    return b;
                }
            } else {
                try {
                    int l = C1216l0.m37964l(i4, 16) * 16;
                    int l2 = C1216l0.m37964l(i5, 16) * 16;
                    if (l * l2 <= C4148v.m28704M()) {
                        int i7 = z ? l2 : l;
                        if (!z) {
                            l = l2;
                        }
                        return new Point(i7, l);
                    }
                } catch (C4148v.C4151c unused) {
                }
            }
        }
        return null;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    public MediaFormat m36225C1(C6600g1 g1Var, String str, C1619a aVar, float f, boolean z, int i) {
        Pair<Integer, Integer> p;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", g1Var.f20580Z);
        mediaFormat.setInteger("height", g1Var.f20582a0);
        C1233v.m37871e(mediaFormat, g1Var.f20577W);
        C1233v.m37873c(mediaFormat, "frame-rate", g1Var.f20584b0);
        C1233v.m37872d(mediaFormat, "rotation-degrees", g1Var.f20586c0);
        C1233v.m37874b(mediaFormat, g1Var.f20590g0);
        if ("video/dolby-vision".equals(g1Var.f20575U) && (p = C4148v.m28684p(g1Var)) != null) {
            C1233v.m37872d(mediaFormat, "profile", ((Integer) p.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f6003a);
        mediaFormat.setInteger("max-height", aVar.f6004b);
        C1233v.m37872d(mediaFormat, "max-input-size", aVar.f6005c);
        if (C1216l0.f4526a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            m36193t1(mediaFormat, i);
        }
        return mediaFormat;
    }

    public boolean m36222F1(long j, boolean z) {
        int Q = m19916Q(j);
        if (Q == 0) {
            return false;
        }
        C8024e eVar = this.f14014j1;
        eVar.f26122i++;
        int i = this.f5977J1 + Q;
        if (z) {
            eVar.f26119f += i;
        } else {
            m36200b2(i);
        }
        m28734m0();
        return true;
    }

    public final void m36221G1() {
        if (this.f5975H1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f5993q1.m36134n(this.f5975H1, elapsedRealtime - this.f5974G1);
            this.f5975H1 = 0;
            this.f5974G1 = elapsedRealtime;
        }
    }

    public void m36220H1() {
        this.f5971D1 = true;
        if (!this.f5969B1) {
            this.f5969B1 = true;
            this.f5993q1.m36151A(this.f6000x1);
            this.f6002z1 = true;
        }
    }

    @Override
    public void mo13719I() {
        m36195r1();
        m36196q1();
        this.f6002z1 = false;
        this.f5992p1.m36179g();
        this.f5989V1 = null;
        try {
            super.mo13719I();
        } finally {
            this.f5993q1.m36135m(this.f14014j1);
        }
    }

    public final void m36219I1() {
        int i = this.f5981N1;
        if (i != 0) {
            this.f5993q1.m36150B(this.f5980M1, i);
            this.f5980M1 = 0L;
            this.f5981N1 = 0;
        }
    }

    @Override
    public void mo15518J(boolean z, boolean z2) {
        super.mo15518J(z, z2);
        boolean z3 = m19922D().f21050a;
        C1186a.m38184f(!z3 || this.f5988U1 != 0);
        if (this.f5987T1 != z3) {
            this.f5987T1 = z3;
            m28762W0();
        }
        this.f5993q1.m36133o(this.f14014j1);
        this.f5992p1.m36178h();
        this.f5970C1 = z2;
        this.f5971D1 = false;
    }

    @Override
    public void mo15517J0(Exception exc) {
        C1230s.m37886d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f5993q1.m36149C(exc);
    }

    public final void m36218J1() {
        int i = this.f5982O1;
        if (i != -1 || this.f5983P1 != -1) {
            C1607b0 b0Var = this.f5986S1;
            if (b0Var == null || b0Var.f5886a != i || b0Var.f5887b != this.f5983P1 || b0Var.f5888c != this.f5984Q1 || b0Var.f5885M != this.f5985R1) {
                C1607b0 b0Var2 = new C1607b0(this.f5982O1, this.f5983P1, this.f5984Q1, this.f5985R1);
                this.f5986S1 = b0Var2;
                this.f5993q1.m36148D(b0Var2);
            }
        }
    }

    @Override
    public void mo13718K(long j, boolean z) {
        super.mo13718K(j, z);
        m36196q1();
        this.f5992p1.m36174l();
        this.f5978K1 = -9223372036854775807L;
        this.f5972E1 = -9223372036854775807L;
        this.f5976I1 = 0;
        if (z) {
            m36208T1();
        } else {
            this.f5973F1 = -9223372036854775807L;
        }
    }

    @Override
    public void mo15516K0(String str, long j, long j2) {
        this.f5993q1.m36137k(str, j, j2);
        this.f5998v1 = m36194s1(str);
        this.f5999w1 = ((C4139n) C1186a.m38185e(m28728q0())).m28794n();
        if (C1216l0.f4526a >= 23 && this.f5987T1) {
            this.f5989V1 = new C1620b((AbstractC4134l) C1186a.m38185e(m28729p0()));
        }
    }

    public final void m36217K1() {
        if (this.f6002z1) {
            this.f5993q1.m36151A(this.f6000x1);
        }
    }

    @Override
    @TargetApi(17)
    public void mo15515L() {
        try {
            super.mo15515L();
        } finally {
            if (this.f6001y1 != null) {
                m36212P1();
            }
        }
    }

    @Override
    public void mo15514L0(String str) {
        this.f5993q1.m36136l(str);
    }

    public final void m36216L1() {
        C1607b0 b0Var = this.f5986S1;
        if (b0Var != null) {
            this.f5993q1.m36148D(b0Var);
        }
    }

    @Override
    public void mo15513M() {
        super.mo15513M();
        this.f5975H1 = 0;
        this.f5974G1 = SystemClock.elapsedRealtime();
        this.f5979L1 = SystemClock.elapsedRealtime() * 1000;
        this.f5980M1 = 0L;
        this.f5981N1 = 0;
        this.f5992p1.m36173m();
    }

    @Override
    public C8028h mo15512M0(C6612h1 h1Var) {
        C8028h M0 = super.mo15512M0(h1Var);
        this.f5993q1.m36132p(h1Var.f20668b, M0);
        return M0;
    }

    public final void m36215M1(long j, long j2, C6600g1 g1Var) {
        AbstractC1622l lVar = this.f5990W1;
        if (lVar != null) {
            lVar.mo19321g(j, j2, g1Var, m28726t0());
        }
    }

    @Override
    public void mo15511N() {
        this.f5973F1 = -9223372036854775807L;
        m36221G1();
        m36219I1();
        this.f5992p1.m36172n();
        super.mo15511N();
    }

    @Override
    public void mo15510N0(C6600g1 g1Var, MediaFormat mediaFormat) {
        int i;
        int i2;
        AbstractC4134l p0 = m28729p0();
        if (p0 != null) {
            p0.mo28658i(this.f5968A1);
        }
        if (this.f5987T1) {
            this.f5982O1 = g1Var.f20580Z;
            this.f5983P1 = g1Var.f20582a0;
        } else {
            C1186a.m38185e(mediaFormat);
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z) {
                i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                i = mediaFormat.getInteger("width");
            }
            this.f5982O1 = i;
            if (z) {
                i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                i2 = mediaFormat.getInteger("height");
            }
            this.f5983P1 = i2;
        }
        float f = g1Var.f20587d0;
        this.f5985R1 = f;
        if (C1216l0.f4526a >= 21) {
            int i3 = g1Var.f20586c0;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.f5982O1;
                this.f5982O1 = this.f5983P1;
                this.f5983P1 = i4;
                this.f5985R1 = 1.0f / f;
            }
        } else {
            this.f5984Q1 = g1Var.f20586c0;
        }
        this.f5992p1.m36177i(g1Var.f20584b0);
    }

    public void m36214N1(long j) {
        m28731n1(j);
        m36218J1();
        this.f14014j1.f26118e++;
        m36220H1();
        mo28772O0(j);
    }

    @Override
    public void mo28772O0(long j) {
        super.mo28772O0(j);
        if (!this.f5987T1) {
            this.f5977J1--;
        }
    }

    public final void m36213O1() {
        m28749d1();
    }

    @Override
    public void mo15509P0() {
        super.mo15509P0();
        m36196q1();
    }

    public final void m36212P1() {
        Surface surface = this.f6000x1;
        C1611f fVar = this.f6001y1;
        if (surface == fVar) {
            this.f6000x1 = null;
        }
        fVar.release();
        this.f6001y1 = null;
    }

    @Override
    public void mo15508Q0(C8026g gVar) {
        boolean z = this.f5987T1;
        if (!z) {
            this.f5977J1++;
        }
        if (C1216l0.f4526a < 23 && z) {
            m36214N1(gVar.f26126N);
        }
    }

    public void m36211Q1(AbstractC4134l lVar, int i, long j) {
        m36218J1();
        C1210j0.m38035a("releaseOutputBuffer");
        lVar.mo28659h(i, true);
        C1210j0.m38033c();
        this.f5979L1 = SystemClock.elapsedRealtime() * 1000;
        this.f14014j1.f26118e++;
        this.f5976I1 = 0;
        m36220H1();
    }

    public void m36210R1(AbstractC4134l lVar, int i, long j, long j2) {
        m36218J1();
        C1210j0.m38035a("releaseOutputBuffer");
        lVar.mo28662e(i, j2);
        C1210j0.m38033c();
        this.f5979L1 = SystemClock.elapsedRealtime() * 1000;
        this.f14014j1.f26118e++;
        this.f5976I1 = 0;
        m36220H1();
    }

    @Override
    public boolean mo15507S0(long j, long j2, AbstractC4134l lVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C6600g1 g1Var) {
        long j4;
        boolean z3;
        C1186a.m38185e(lVar);
        if (this.f5972E1 == -9223372036854775807L) {
            this.f5972E1 = j;
        }
        if (j3 != this.f5978K1) {
            this.f5992p1.m36176j(j3);
            this.f5978K1 = j3;
        }
        long x0 = m28724x0();
        long j5 = j3 - x0;
        if (!z || z2) {
            double y0 = m28723y0();
            boolean z4 = mo19479i() == 2;
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            long j6 = (long) ((j3 - j) / y0);
            if (z4) {
                j6 -= elapsedRealtime - j2;
            }
            if (this.f6000x1 != this.f6001y1) {
                long j7 = elapsedRealtime - this.f5979L1;
                if (this.f5971D1 ? this.f5969B1 : !z4 && !this.f5970C1) {
                    j4 = j7;
                    z3 = false;
                } else {
                    j4 = j7;
                    z3 = true;
                }
                if (this.f5973F1 == -9223372036854775807L && j >= x0 && (z3 || (z4 && m36203Y1(j6, j4)))) {
                    long nanoTime = System.nanoTime();
                    m36215M1(j5, nanoTime, g1Var);
                    if (C1216l0.f4526a >= 21) {
                        m36210R1(lVar, i, j5, nanoTime);
                    } else {
                        m36211Q1(lVar, i, j5);
                    }
                    m36199c2(j6);
                    return true;
                }
                if (z4 && j != this.f5972E1) {
                    long nanoTime2 = System.nanoTime();
                    long b = this.f5992p1.m36184b((j6 * 1000) + nanoTime2);
                    long j8 = (b - nanoTime2) / 1000;
                    boolean z5 = this.f5973F1 != -9223372036854775807L;
                    if (m36205W1(j8, j2, z2) && m36222F1(j, z5)) {
                        return false;
                    }
                    if (m36204X1(j8, j2, z2)) {
                        if (z5) {
                            m36201a2(lVar, i, j5);
                        } else {
                            m36191v1(lVar, i, j5);
                        }
                        m36199c2(j8);
                        return true;
                    } else if (C1216l0.f4526a >= 21) {
                        if (j8 < 50000) {
                            m36215M1(j5, b, g1Var);
                            m36210R1(lVar, i, j5, b);
                            m36199c2(j8);
                            return true;
                        }
                    } else if (j8 < 30000) {
                        if (j8 > 11000) {
                            try {
                                Thread.sleep((j8 - 10000) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        m36215M1(j5, b, g1Var);
                        m36211Q1(lVar, i, j5);
                        m36199c2(j8);
                        return true;
                    }
                }
                return false;
            } else if (!m36224D1(j6)) {
                return false;
            } else {
                m36201a2(lVar, i, j5);
                m36199c2(j6);
                return true;
            }
        } else {
            m36201a2(lVar, i, j5);
            return true;
        }
    }

    @Override
    public C8028h mo15506T(C4139n nVar, C6600g1 g1Var, C6600g1 g1Var2) {
        C8028h e = nVar.m28803e(g1Var, g1Var2);
        int i = e.f26139e;
        int i2 = g1Var2.f20580Z;
        C1619a aVar = this.f5997u1;
        if (i2 > aVar.f6003a || g1Var2.f20582a0 > aVar.f6004b) {
            i |= Log.TAG_CRASH;
        }
        if (m36226B1(nVar, g1Var2) > this.f5997u1.f6005c) {
            i |= 64;
        }
        int i3 = i;
        return new C8028h(nVar.f13952a, g1Var, g1Var2, i3 != 0 ? 0 : e.f26138d, i3);
    }

    public final void m36208T1() {
        this.f5973F1 = this.f5994r1 > 0 ? SystemClock.elapsedRealtime() + this.f5994r1 : -9223372036854775807L;
    }

    public final void m36207U1(Object obj) {
        C1611f fVar = obj instanceof Surface ? (Surface) obj : null;
        if (fVar == null) {
            C1611f fVar2 = this.f6001y1;
            if (fVar2 != null) {
                fVar = fVar2;
            } else {
                C4139n q0 = m28728q0();
                if (q0 != null && m36202Z1(q0)) {
                    fVar = C1611f.m36247c(this.f5991o1, q0.f13958g);
                    this.f6001y1 = fVar;
                }
            }
        }
        if (this.f6000x1 != fVar) {
            this.f6000x1 = fVar;
            this.f5992p1.m36171o(fVar);
            this.f6002z1 = false;
            int i = mo19479i();
            AbstractC4134l p0 = m28729p0();
            if (p0 != null) {
                if (C1216l0.f4526a < 23 || fVar == null || this.f5998v1) {
                    m28762W0();
                    m28774H0();
                } else {
                    m36206V1(p0, fVar);
                }
            }
            if (fVar == null || fVar == this.f6001y1) {
                m36195r1();
                m36196q1();
                return;
            }
            m36216L1();
            m36196q1();
            if (i == 2) {
                m36208T1();
            }
        } else if (fVar != null && fVar != this.f6001y1) {
            m36216L1();
            m36217K1();
        }
    }

    public void m36206V1(AbstractC4134l lVar, Surface surface) {
        lVar.mo28655l(surface);
    }

    public boolean m36205W1(long j, long j2, boolean z) {
        return m36223E1(j) && !z;
    }

    public boolean m36204X1(long j, long j2, boolean z) {
        return m36224D1(j) && !z;
    }

    @Override
    public void mo28759Y0() {
        super.mo28759Y0();
        this.f5977J1 = 0;
    }

    public boolean m36203Y1(long j, long j2) {
        return m36224D1(j) && j2 > 100000;
    }

    public final boolean m36202Z1(C4139n nVar) {
        return C1216l0.f4526a >= 23 && !this.f5987T1 && !m36194s1(nVar.f13952a) && (!nVar.f13958g || C1611f.m36248b(this.f5991o1));
    }

    public void m36201a2(AbstractC4134l lVar, int i, long j) {
        C1210j0.m38035a("skipVideoBuffer");
        lVar.mo28659h(i, false);
        C1210j0.m38033c();
        this.f14014j1.f26119f++;
    }

    @Override
    public String mo11838b() {
        return "MediaCodecVideoRenderer";
    }

    public void m36200b2(int i) {
        C8024e eVar = this.f14014j1;
        eVar.f26120g += i;
        this.f5975H1 += i;
        int i2 = this.f5976I1 + i;
        this.f5976I1 = i2;
        eVar.f26121h = Math.max(i2, eVar.f26121h);
        int i3 = this.f5995s1;
        if (i3 > 0 && this.f5975H1 >= i3) {
            m36221G1();
        }
    }

    public void m36199c2(long j) {
        this.f14014j1.m13783a(j);
        this.f5980M1 += j;
        this.f5981N1++;
    }

    @Override
    public C4138m mo28750d0(Throwable th, C4139n nVar) {
        return new C1617i(th, nVar, this.f6000x1);
    }

    @Override
    public boolean mo13705f() {
        C1611f fVar;
        if (super.mo13705f() && (this.f5969B1 || (((fVar = this.f6001y1) != null && this.f6000x1 == fVar) || m28729p0() == null || this.f5987T1))) {
            this.f5973F1 = -9223372036854775807L;
            return true;
        } else if (this.f5973F1 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f5973F1) {
                return true;
            }
            this.f5973F1 = -9223372036854775807L;
            return false;
        }
    }

    @Override
    public boolean mo28741h1(C4139n nVar) {
        return this.f6000x1 != null || m36202Z1(nVar);
    }

    @Override
    public int mo15500j1(AbstractC4143q qVar, C6600g1 g1Var) {
        int i = 0;
        if (!C1234w.m37858m(g1Var.f20575U)) {
            return C6701t2.m19437a(0);
        }
        boolean z = g1Var.f20578X != null;
        List<C4139n> A1 = m36227A1(qVar, g1Var, z, false);
        if (z && A1.isEmpty()) {
            A1 = m36227A1(qVar, g1Var, false, false);
        }
        if (A1.isEmpty()) {
            return C6701t2.m19437a(1);
        }
        if (!AbstractC4140o.m28737k1(g1Var)) {
            return C6701t2.m19437a(2);
        }
        C4139n nVar = A1.get(0);
        boolean m = nVar.m28795m(g1Var);
        int i2 = nVar.m28793o(g1Var) ? 16 : 8;
        if (m) {
            List<C4139n> A12 = m36227A1(qVar, g1Var, z, true);
            if (!A12.isEmpty()) {
                C4139n nVar2 = A12.get(0);
                if (nVar2.m28795m(g1Var) && nVar2.m28793o(g1Var)) {
                    i = 32;
                }
            }
        }
        return C6701t2.m19436b(m ? 4 : 3, i2, i);
    }

    @Override
    public void mo19473q(float f, float f2) {
        super.mo19473q(f, f2);
        this.f5992p1.m36175k(f);
    }

    public final void m36196q1() {
        AbstractC4134l p0;
        this.f5969B1 = false;
        if (C1216l0.f4526a >= 23 && this.f5987T1 && (p0 = m28729p0()) != null) {
            this.f5989V1 = new C1620b(p0);
        }
    }

    @Override
    public boolean mo28727r0() {
        return this.f5987T1 && C1216l0.f4526a < 23;
    }

    public final void m36195r1() {
        this.f5986S1 = null;
    }

    @Override
    public float mo15495s0(float f, C6600g1 g1Var, C6600g1[] g1VarArr) {
        float f2 = -1.0f;
        for (C6600g1 g1Var2 : g1VarArr) {
            float f3 = g1Var2.f20584b0;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    public boolean m36194s1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C1618j.class) {
            if (!f5966Y1) {
                f5967Z1 = m36190w1();
                f5966Y1 = true;
            }
        }
        return f5967Z1;
    }

    @Override
    public void mo15492u(int i, Object obj) {
        if (i == 1) {
            m36207U1(obj);
        } else if (i == 7) {
            this.f5990W1 = (AbstractC1622l) obj;
        } else if (i == 10) {
            int intValue = ((Integer) obj).intValue();
            if (this.f5988U1 != intValue) {
                this.f5988U1 = intValue;
                if (this.f5987T1) {
                    m28762W0();
                }
            }
        } else if (i == 4) {
            this.f5968A1 = ((Integer) obj).intValue();
            AbstractC4134l p0 = m28729p0();
            if (p0 != null) {
                p0.mo28658i(this.f5968A1);
            }
        } else if (i != 5) {
            super.mo15492u(i, obj);
        } else {
            this.f5992p1.m36169q(((Integer) obj).intValue());
        }
    }

    @Override
    public List<C4139n> mo15491u0(AbstractC4143q qVar, C6600g1 g1Var, boolean z) {
        return m36227A1(qVar, g1Var, z, this.f5987T1);
    }

    public void m36191v1(AbstractC4134l lVar, int i, long j) {
        C1210j0.m38035a("dropVideoBuffer");
        lVar.mo28659h(i, false);
        C1210j0.m38033c();
        m36200b2(1);
    }

    @Override
    @TargetApi(17)
    public AbstractC4134l.C4135a mo15488w0(C4139n nVar, C6600g1 g1Var, MediaCrypto mediaCrypto, float f) {
        C1611f fVar = this.f6001y1;
        if (!(fVar == null || fVar.f5935a == nVar.f13958g)) {
            m36212P1();
        }
        String str = nVar.f13954c;
        C1619a z1 = m36187z1(nVar, g1Var, m19919G());
        this.f5997u1 = z1;
        MediaFormat C1 = m36225C1(g1Var, str, z1, f, this.f5996t1, this.f5987T1 ? this.f5988U1 : 0);
        if (this.f6000x1 == null) {
            if (m36202Z1(nVar)) {
                if (this.f6001y1 == null) {
                    this.f6001y1 = C1611f.m36247c(this.f5991o1, nVar.f13958g);
                }
                this.f6000x1 = this.f6001y1;
            } else {
                throw new IllegalStateException();
            }
        }
        return AbstractC4134l.C4135a.m28811b(nVar, C1, g1Var, this.f6000x1, mediaCrypto);
    }

    @Override
    @TargetApi(C3563j.f11980P3)
    public void mo28722z0(C8026g gVar) {
        if (this.f5999w1) {
            ByteBuffer byteBuffer = (ByteBuffer) C1186a.m38185e(gVar.f26127O);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    m36209S1(m28729p0(), bArr);
                }
            }
        }
    }

    public C1619a m36187z1(C4139n nVar, C6600g1 g1Var, C6600g1[] g1VarArr) {
        int x1;
        int i = g1Var.f20580Z;
        int i2 = g1Var.f20582a0;
        int B1 = m36226B1(nVar, g1Var);
        if (g1VarArr.length == 1) {
            if (!(B1 == -1 || (x1 = m36189x1(nVar, g1Var)) == -1)) {
                B1 = Math.min((int) (B1 * 1.5f), x1);
            }
            return new C1619a(i, i2, B1);
        }
        int length = g1VarArr.length;
        boolean z = false;
        for (int i3 = 0; i3 < length; i3++) {
            C6600g1 g1Var2 = g1VarArr[i3];
            if (g1Var.f20590g0 != null && g1Var2.f20590g0 == null) {
                g1Var2 = g1Var2.m19901b().m19884J(g1Var.f20590g0).m19889E();
            }
            if (nVar.m28803e(g1Var, g1Var2).f26138d != 0) {
                int i4 = g1Var2.f20580Z;
                z |= i4 == -1 || g1Var2.f20582a0 == -1;
                i = Math.max(i, i4);
                i2 = Math.max(i2, g1Var2.f20582a0);
                B1 = Math.max(B1, m36226B1(nVar, g1Var2));
            }
        }
        if (z) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Resolutions unknown. Codec max resolution: ");
            sb2.append(i);
            sb2.append("x");
            sb2.append(i2);
            C1230s.m37881i("MediaCodecVideoRenderer", sb2.toString());
            Point y1 = m36188y1(nVar, g1Var);
            if (y1 != null) {
                i = Math.max(i, y1.x);
                i2 = Math.max(i2, y1.y);
                B1 = Math.max(B1, m36189x1(nVar, g1Var.m19901b().m19848j0(i).m19877Q(i2).m19889E()));
                StringBuilder sb3 = new StringBuilder(57);
                sb3.append("Codec max resolution adjusted to: ");
                sb3.append(i);
                sb3.append("x");
                sb3.append(i2);
                C1230s.m37881i("MediaCodecVideoRenderer", sb3.toString());
            }
        }
        return new C1619a(i, i2, B1);
    }

    public C1618j(Context context, AbstractC4134l.AbstractC4136b bVar, AbstractC4143q qVar, long j, boolean z, Handler handler, AbstractC1642z zVar, int i, float f) {
        super(2, bVar, qVar, z, f);
        this.f5994r1 = j;
        this.f5995s1 = i;
        Context applicationContext = context.getApplicationContext();
        this.f5991o1 = applicationContext;
        this.f5992p1 = new C1624n(applicationContext);
        this.f5993q1 = new AbstractC1642z.C1643a(handler, zVar);
        this.f5996t1 = m36192u1();
        this.f5973F1 = -9223372036854775807L;
        this.f5982O1 = -1;
        this.f5983P1 = -1;
        this.f5985R1 = -1.0f;
        this.f5968A1 = 1;
        this.f5988U1 = 0;
        m36195r1();
    }
}
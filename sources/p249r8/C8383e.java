package p249r8;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import p258s2.C8630c;
import p258s2.C8632e;
import p258s2.C8634g;

@AbstractC8385g(tags = {4})
public class C8383e extends AbstractC8380b {
    public static Logger f27222n = Logger.getLogger(C8383e.class.getName());
    public int f27223d;
    public int f27224e;
    public int f27225f;
    public int f27226g;
    public long f27227h;
    public long f27228i;
    public C8384f f27229j;
    public C8377a f27230k;
    public List<C8391m> f27231l = new ArrayList();
    public byte[] f27232m;

    @Override
    public void mo12590e(ByteBuffer byteBuffer) {
        int a;
        this.f27223d = C8632e.m11862n(byteBuffer);
        int n = C8632e.m11862n(byteBuffer);
        this.f27224e = n >>> 2;
        this.f27225f = (n >> 1) & 1;
        this.f27226g = C8632e.m11866j(byteBuffer);
        this.f27227h = C8632e.m11865k(byteBuffer);
        this.f27228i = C8632e.m11865k(byteBuffer);
        if (byteBuffer.remaining() > 2) {
            int position = byteBuffer.position();
            AbstractC8380b a2 = C8390l.m12594a(this.f27223d, byteBuffer);
            int position2 = byteBuffer.position() - position;
            Logger logger = f27222n;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a2);
            sb2.append(" - DecoderConfigDescr1 read: ");
            sb2.append(position2);
            sb2.append(", size: ");
            sb2.append(a2 != null ? Integer.valueOf(a2.m12637a()) : null);
            logger.finer(sb2.toString());
            if (a2 != null && position2 < (a = a2.m12637a())) {
                byte[] bArr = new byte[a - position2];
                this.f27232m = bArr;
                byteBuffer.get(bArr);
            }
            if (a2 instanceof C8384f) {
                this.f27229j = (C8384f) a2;
            }
            if (a2 instanceof C8377a) {
                this.f27230k = (C8377a) a2;
            }
        }
        while (byteBuffer.remaining() > 2) {
            long position3 = byteBuffer.position();
            AbstractC8380b a3 = C8390l.m12594a(this.f27223d, byteBuffer);
            long position4 = byteBuffer.position() - position3;
            Logger logger2 = f27222n;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a3);
            sb3.append(" - DecoderConfigDescr2 read: ");
            sb3.append(position4);
            sb3.append(", size: ");
            sb3.append(a3 != null ? Integer.valueOf(a3.m12637a()) : null);
            logger2.finer(sb3.toString());
            if (a3 instanceof C8391m) {
                this.f27231l.add((C8391m) a3);
            }
        }
    }

    public C8377a m12629f() {
        return this.f27230k;
    }

    public long m12628g() {
        return this.f27228i;
    }

    public int m12627h() {
        return this.f27226g;
    }

    public C8384f m12626i() {
        return this.f27229j;
    }

    public long m12625j() {
        return this.f27227h;
    }

    public int m12624k() {
        return this.f27223d;
    }

    public List<C8391m> m12623l() {
        return this.f27231l;
    }

    public int m12622m() {
        return this.f27224e;
    }

    public int m12621n() {
        return this.f27225f;
    }

    public ByteBuffer m12620o() {
        ByteBuffer allocate = ByteBuffer.allocate(m12619p());
        C8634g.m11851j(allocate, 4);
        C8634g.m11851j(allocate, m12619p() - 2);
        C8634g.m11851j(allocate, this.f27223d);
        C8634g.m11851j(allocate, (this.f27224e << 2) | (this.f27225f << 1) | 1);
        C8634g.m11855f(allocate, this.f27226g);
        C8634g.m11854g(allocate, this.f27227h);
        C8634g.m11854g(allocate, this.f27228i);
        C8377a aVar = this.f27230k;
        if (aVar != null) {
            allocate.put(aVar.m12643n().array());
        }
        return allocate;
    }

    public int m12619p() {
        C8377a aVar = this.f27230k;
        return (aVar == null ? 0 : aVar.m12642o()) + 15;
    }

    public void m12618q(C8377a aVar) {
        this.f27230k = aVar;
    }

    public void m12617r(long j) {
        this.f27228i = j;
    }

    public void m12616s(int i) {
        this.f27226g = i;
    }

    public void m12615t(long j) {
        this.f27227h = j;
    }

    @Override
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DecoderConfigDescriptor");
        sb2.append("{objectTypeIndication=");
        sb2.append(this.f27223d);
        sb2.append(", streamType=");
        sb2.append(this.f27224e);
        sb2.append(", upStream=");
        sb2.append(this.f27225f);
        sb2.append(", bufferSizeDB=");
        sb2.append(this.f27226g);
        sb2.append(", maxBitRate=");
        sb2.append(this.f27227h);
        sb2.append(", avgBitRate=");
        sb2.append(this.f27228i);
        sb2.append(", decoderSpecificInfo=");
        sb2.append(this.f27229j);
        sb2.append(", audioSpecificInfo=");
        sb2.append(this.f27230k);
        sb2.append(", configDescriptorDeadBytes=");
        byte[] bArr = this.f27232m;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb2.append(C8630c.m11880b(bArr));
        sb2.append(", profileLevelIndicationDescriptors=");
        List<C8391m> list = this.f27231l;
        sb2.append(list == null ? "null" : Arrays.asList(list).toString());
        sb2.append('}');
        return sb2.toString();
    }

    public void m12614u(int i) {
        this.f27223d = i;
    }

    public void m12613v(int i) {
        this.f27224e = i;
    }
}
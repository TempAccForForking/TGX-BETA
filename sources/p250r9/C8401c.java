package p250r9;

import java.nio.ByteBuffer;
import p107ha.C5060q;
import pa.AbstractC8088l;
import qa.C8298k;

public class C8401c {
    public final ByteBuffer f27279a;
    public final long f27280b;
    public final AbstractC8088l<Boolean, C5060q> f27281c;

    public C8401c(ByteBuffer byteBuffer, long j, AbstractC8088l<? super Boolean, C5060q> lVar) {
        C8298k.m12933e(byteBuffer, "buffer");
        C8298k.m12933e(lVar, "release");
        this.f27279a = byteBuffer;
        this.f27280b = j;
        this.f27281c = lVar;
    }

    public final ByteBuffer m12572a() {
        return this.f27279a;
    }

    public final AbstractC8088l<Boolean, C5060q> m12571b() {
        return this.f27281c;
    }

    public final long m12570c() {
        return this.f27280b;
    }
}

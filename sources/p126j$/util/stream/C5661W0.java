package p126j$.util.stream;

import p126j$.util.AbstractC5466E;
import p126j$.util.AbstractC5468G;
import p126j$.util.function.AbstractC5531m;
import p126j$.util.function.Consumer;

public final class C5661W0 extends AbstractC5673Z0 implements AbstractC5602J0 {
    public C5661W0(AbstractC5602J0 j0, AbstractC5602J0 j02) {
        super(j0, j02);
    }

    @Override
    public void mo22176a(Consumer consumer) {
        AbstractC5572D0.m22404s(this, consumer);
    }

    public void mo22154n(Double[] dArr, int i) {
        AbstractC5572D0.m22408p(this, dArr, i);
    }

    public double[] mo22347g(int i) {
        return new double[i];
    }

    public AbstractC5602J0 mo22151q(long j, long j2, AbstractC5531m mVar) {
        return AbstractC5572D0.m22401v(this, j, j2);
    }

    @Override
    public AbstractC5466E mo42629spliterator() {
        return new C5743n1(this);
    }

    @Override
    public AbstractC5468G mo42629spliterator() {
        return new C5743n1(this);
    }
}
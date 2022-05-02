package p289u9;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p107ha.C5046f;
import p107ha.C5048h;
import p107ha.C5060q;
import p123ia.C5304n;
import p123ia.C5312v;
import p289u9.AbstractC9475i;
import p316w9.C10007i;
import pa.AbstractC8077a;
import qa.AbstractC8299l;
import qa.C8294g;
import qa.C8298k;

public final class C9464d {
    public static final C9466b f30691e = new C9466b(null);
    public final C10007i f30692a;
    public AbstractC9475i.C9477b<Object> f30693b;
    public int f30694c;
    public final List<AbstractC9480j<Object, AbstractC9461b, Object, AbstractC9461b>> f30695d;

    public static final class C9465a<D, C extends AbstractC9461b> {
        public final List<AbstractC9480j<?, ?, ?, ?>> f30696a;

        public C9465a() {
            this(null, 1, null);
        }

        public C9465a(List<? extends AbstractC9480j<?, ?, ?, ?>> list) {
            C8298k.m12933e(list, "steps");
            this.f30696a = list;
        }

        public final List<AbstractC9480j<?, ?, ?, ?>> m8575a() {
            return this.f30696a;
        }

        public final <NewData, NewChannel extends AbstractC9461b> C9465a<NewData, NewChannel> m8574b(AbstractC9480j<D, C, NewData, NewChannel> jVar) {
            C8298k.m12933e(jVar, "step");
            return new C9465a<>(C5312v.m23338K(this.f30696a, jVar));
        }

        public C9465a(List list, int i, C8294g gVar) {
            this((i & 1) != 0 ? C5304n.m23367f() : list);
        }
    }

    public static final class C9466b {

        public static final class C9467a extends AbstractC8299l implements AbstractC8077a<C9465a<C5060q, AbstractC9461b>> {
            public static final C9467a f30697b = new C9467a();

            public C9467a() {
                super(0);
            }

            public final C9465a<C5060q, AbstractC9461b> mo4925b() {
                return new C9465a<>(null, 1, null);
            }
        }

        public C9466b() {
        }

        public static C9464d m8572b(C9466b bVar, String str, AbstractC8077a aVar, int i, Object obj) {
            if ((i & 2) != 0) {
                aVar = C9467a.f30697b;
            }
            return bVar.m8573a(str, aVar);
        }

        public final C9464d m8573a(String str, AbstractC8077a<? extends C9465a<?, AbstractC9461b>> aVar) {
            C8298k.m12933e(str, "name");
            C8298k.m12933e(aVar, "builder");
            List<AbstractC9480j<?, ?, ?, ?>> a = aVar.mo4925b().m8575a();
            Objects.requireNonNull(a, "null cannot be cast to non-null type kotlin.collections.List<com.otaliastudios.transcoder.internal.pipeline.AnyStep /* = com.otaliastudios.transcoder.internal.pipeline.Step<kotlin.Any, com.otaliastudios.transcoder.internal.pipeline.Channel, kotlin.Any, com.otaliastudios.transcoder.internal.pipeline.Channel> */>");
            return new C9464d(str, a, null);
        }

        public C9466b(C8294g gVar) {
            this();
        }
    }

    public C9464d(String str, List<? extends AbstractC9480j<Object, AbstractC9461b, Object, AbstractC9461b>> list) {
        this.f30695d = list;
        this.f30692a = new C10007i("Pipeline(" + str + ')');
        this.f30693b = new AbstractC9475i.C9477b<>(C5060q.f17066a);
        for (C5048h hVar : C5312v.m23337L(C5312v.m23324Y(list))) {
            ((AbstractC9480j) hVar.m24197a()).mo5856i(((AbstractC9480j) hVar.m24196b()).mo5860e());
        }
    }

    public final AbstractC9475i<C5060q> m8578a() {
        C10007i iVar = this.f30692a;
        iVar.m6262h("execute(): starting. head=" + this.f30694c + " steps=" + this.f30695d.size() + " remaining=" + (this.f30695d.size() - this.f30694c));
        int i = this.f30694c;
        AbstractC9475i.C9477b<Object> bVar = this.f30693b;
        int i2 = 0;
        for (Object obj : this.f30695d) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C5304n.m23359n();
            }
            AbstractC9480j<Object, AbstractC9461b, Object, AbstractC9461b> jVar = (AbstractC9480j) obj;
            if (i2 >= i) {
                bVar = m8577b(bVar, jVar, i == 0 || i2 != i);
                if (bVar == null) {
                    C10007i iVar2 = this.f30692a;
                    iVar2.m6262h("execute(): step " + C9482k.m8555a(jVar) + " (#" + i2 + '/' + this.f30695d.size() + ") is waiting. headState=" + this.f30693b + " headIndex=" + this.f30694c);
                    return AbstractC9475i.C9479d.f30718a;
                } else if (bVar instanceof AbstractC9475i.C9476a) {
                    C10007i iVar3 = this.f30692a;
                    iVar3.m6267c("execute(): EOS from " + C9482k.m8555a(jVar) + " (#" + i2 + '/' + this.f30695d.size() + ").");
                    this.f30693b = bVar;
                    this.f30694c = i3;
                }
            }
            i2 = i3;
        }
        if (!this.f30695d.isEmpty() && !(bVar instanceof AbstractC9475i.C9476a)) {
            return new AbstractC9475i.C9477b(C5060q.f17066a);
        }
        return new AbstractC9475i.C9476a(C5060q.f17066a);
    }

    public final AbstractC9475i.C9477b<Object> m8577b(AbstractC9475i.C9477b<Object> bVar, AbstractC9480j<Object, AbstractC9461b, Object, AbstractC9461b> jVar, boolean z) {
        AbstractC9475i<Object> g = jVar.mo5858g(bVar, z);
        if (g instanceof AbstractC9475i.C9477b) {
            return (AbstractC9475i.C9477b) g;
        }
        if (g instanceof AbstractC9475i.C9478c) {
            return m8577b(bVar, jVar, false);
        }
        if (g instanceof AbstractC9475i.C9479d) {
            return null;
        }
        throw new C5046f();
    }

    public final void m8576c() {
        Iterator<T> it = this.f30695d.iterator();
        while (it.hasNext()) {
            ((AbstractC9480j) it.next()).mo5861a();
        }
    }

    public C9464d(String str, List list, C8294g gVar) {
        this(str, list);
    }
}

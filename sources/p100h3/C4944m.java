package p100h3;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import p018b3.AbstractC1159m;
import p030c3.AbstractC1538e;
import p030c3.AbstractC1539f;
import p030c3.AbstractC1541g;
import p030c3.AbstractC1549m;
import p058e3.C4118a;
import p116i3.AbstractC5179c;
import p116i3.AbstractC5196i;
import p131j3.AbstractC5843b;
import p131j3.C5842a;
import p146k3.AbstractC6045a;

public class C4944m {
    public final Context f16839a;
    public final AbstractC1538e f16840b;
    public final AbstractC5179c f16841c;
    public final AbstractC4950s f16842d;
    public final Executor f16843e;
    public final AbstractC5843b f16844f;
    public final AbstractC6045a f16845g;

    public C4944m(Context context, AbstractC1538e eVar, AbstractC5179c cVar, AbstractC4950s sVar, Executor executor, AbstractC5843b bVar, AbstractC6045a aVar) {
        this.f16839a = context;
        this.f16840b = eVar;
        this.f16841c = cVar;
        this.f16842d = sVar;
        this.f16843e = executor;
        this.f16844f = bVar;
        this.f16845g = aVar;
    }

    public Iterable m24410f(AbstractC1159m mVar) {
        return this.f16841c.mo23672m0(mVar);
    }

    public Object m24409g(AbstractC1541g gVar, Iterable iterable, AbstractC1159m mVar, int i) {
        if (gVar.mo36506c() == AbstractC1541g.EnumC1542a.TRANSIENT_ERROR) {
            this.f16841c.mo23670r0(iterable);
            this.f16842d.mo24393a(mVar, i + 1);
            return null;
        }
        this.f16841c.mo23673k(iterable);
        if (gVar.mo36506c() == AbstractC1541g.EnumC1542a.OK) {
            this.f16841c.mo23676F(mVar, this.f16845g.mo21443a() + gVar.mo36507b());
        }
        if (!this.f16841c.mo23671o0(mVar)) {
            return null;
        }
        this.f16842d.mo24392b(mVar, 1, true);
        return null;
    }

    public Object m24408h(AbstractC1159m mVar, int i) {
        this.f16842d.mo24393a(mVar, i + 1);
        return null;
    }

    public void m24407i(final AbstractC1159m mVar, final int i, Runnable runnable) {
        try {
            try {
                AbstractC5843b bVar = this.f16844f;
                final AbstractC5179c cVar = this.f16841c;
                Objects.requireNonNull(cVar);
                bVar.mo21946m(new AbstractC5843b.AbstractC5844a() {
                    @Override
                    public final Object mo21945a() {
                        return Integer.valueOf(AbstractC5179c.this.mo23674f());
                    }
                });
                if (!m24411e()) {
                    this.f16844f.mo21946m(new AbstractC5843b.AbstractC5844a() {
                        @Override
                        public final Object mo21945a() {
                            Object h;
                            h = C4944m.this.m24408h(mVar, i);
                            return h;
                        }
                    });
                } else {
                    m24406j(mVar, i);
                }
            } catch (C5842a unused) {
                this.f16842d.mo24393a(mVar, i + 1);
            }
        } finally {
            runnable.run();
        }
    }

    public boolean m24411e() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f16839a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void m24406j(final AbstractC1159m mVar, final int i) {
        AbstractC1541g a;
        AbstractC1549m a2 = this.f16840b.mo36494a(mVar.mo38266b());
        final Iterable<AbstractC5196i> iterable = (Iterable) this.f16844f.mo21946m(new AbstractC5843b.AbstractC5844a() {
            @Override
            public final Object mo21945a() {
                Iterable f;
                f = C4944m.this.m24410f(mVar);
                return f;
            }
        });
        if (iterable.iterator().hasNext()) {
            if (a2 == null) {
                C4118a.m28886a("Uploader", "Unknown backend for %s, deleting event batch for it...", mVar);
                a = AbstractC1541g.m36508a();
            } else {
                ArrayList arrayList = new ArrayList();
                for (AbstractC5196i iVar : iterable) {
                    arrayList.add(iVar.mo23625b());
                }
                a = a2.mo1177a(AbstractC1539f.m36514a().mo36510b(arrayList).mo36509c(mVar.mo38265c()).mo36511a());
            }
            final AbstractC1541g gVar = a;
            this.f16844f.mo21946m(new AbstractC5843b.AbstractC5844a() {
                @Override
                public final Object mo21945a() {
                    Object g;
                    g = C4944m.this.m24409g(gVar, iterable, mVar, i);
                    return g;
                }
            });
        }
    }

    public void m24405k(final AbstractC1159m mVar, final int i, final Runnable runnable) {
        this.f16843e.execute(new Runnable() {
            @Override
            public final void run() {
                C4944m.this.m24407i(mVar, i, runnable);
            }
        });
    }
}

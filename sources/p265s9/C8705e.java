package p265s9;

import p065ea.AbstractC4177b;
import p192n9.EnumC7313d;
import p289u9.AbstractC9463c;
import p289u9.AbstractC9475i;
import qa.C8298k;

public final class C8705e extends AbstractC9463c<C8704d, AbstractC8703c> {
    public final EnumC7313d f28048c;
    public final AbstractC4177b f28049d;

    public C8705e(EnumC7313d dVar, AbstractC4177b bVar) {
        C8298k.m12934e(dVar, "track");
        C8298k.m12934e(bVar, "interpolator");
        this.f28048c = dVar;
        this.f28049d = bVar;
    }

    @Override
    public AbstractC9475i<C8704d> mo5858g(AbstractC9475i.C9477b<C8704d> bVar, boolean z) {
        C8298k.m12934e(bVar, "state");
        if (bVar instanceof AbstractC9475i.C9476a) {
            return bVar;
        }
        bVar.m8558a().m11711c().f4677c = this.f28049d.mo15003a(this.f28048c, bVar.m8558a().m11711c().f4677c);
        return bVar;
    }
}
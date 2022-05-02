package p052dc;

import cc.C2073d;
import cc.C2083h;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import p052dc.C3987j;
import p278tb.EnumC9064a0;
import qa.C8294g;
import qa.C8298k;

public final class C3984i implements AbstractC3989k {
    public static final C3986b f13363b = new C3986b(null);
    public static final C3987j.AbstractC3988a f13362a = new C3985a();

    public static final class C3985a implements C3987j.AbstractC3988a {
        @Override
        public boolean mo29421a(SSLSocket sSLSocket) {
            C8298k.m12934e(sSLSocket, "sslSocket");
            return C2073d.f7307f.m35705c() && Conscrypt.isConscrypt(sSLSocket);
        }

        @Override
        public AbstractC3989k mo29420b(SSLSocket sSLSocket) {
            C8298k.m12934e(sSLSocket, "sslSocket");
            return new C3984i();
        }
    }

    public static final class C3986b {
        public C3986b() {
        }

        public final C3987j.AbstractC3988a m29423a() {
            return C3984i.f13362a;
        }

        public C3986b(C8294g gVar) {
            this();
        }
    }

    @Override
    public boolean mo29419a(SSLSocket sSLSocket) {
        C8298k.m12934e(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override
    public boolean mo29418b() {
        return C2073d.f7307f.m35705c();
    }

    @Override
    public String mo29417c(SSLSocket sSLSocket) {
        C8298k.m12934e(sSLSocket, "sslSocket");
        if (mo29419a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override
    public void mo29416d(SSLSocket sSLSocket, String str, List<? extends EnumC9064a0> list) {
        C8298k.m12934e(sSLSocket, "sslSocket");
        C8298k.m12934e(list, "protocols");
        if (mo29419a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = C2083h.f7326c.m35679b(list).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }
}
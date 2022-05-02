package p133j5;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p118i5.C5219c;
import p133j5.AbstractC5867f;
import p133j5.C5850a.AbstractC5854d;
import p148k5.AbstractC6101e;
import p148k5.AbstractC6134l;
import p163l5.AbstractC6325c;
import p163l5.AbstractC6355k;
import p163l5.C6336e;
import p163l5.C6378r;

public final class C5850a<O extends AbstractC5854d> {
    public final AbstractC5851a<?, O> f18721a;
    public final C5860g<?> f18722b;
    public final String f18723c;

    public static abstract class AbstractC5851a<T extends AbstractC5859f, O> extends AbstractC5858e<T, O> {
        @RecentlyNonNull
        @Deprecated
        public T mo21893c(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull C6336e eVar, @RecentlyNonNull O o, @RecentlyNonNull AbstractC5867f.AbstractC5869b bVar, @RecentlyNonNull AbstractC5867f.AbstractC5870c cVar) {
            return mo17210d(context, looper, eVar, o, bVar, cVar);
        }

        @RecentlyNonNull
        public T mo17210d(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull C6336e eVar, @RecentlyNonNull O o, @RecentlyNonNull AbstractC6101e eVar2, @RecentlyNonNull AbstractC6134l lVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface AbstractC5852b {
    }

    public static class C5853c<C extends AbstractC5852b> {
    }

    public interface AbstractC5854d {
        @RecentlyNonNull
        public static final C5857c f18724a = new C5857c(null);

        public interface AbstractC5855a extends AbstractC5854d {
            @RecentlyNonNull
            Account m21933b();
        }

        public interface AbstractC5856b extends AbstractC5854d {
            @RecentlyNullable
            GoogleSignInAccount m21932a();
        }

        public static final class C5857c implements AbstractC5854d {
            public C5857c() {
            }

            public C5857c(C5882q qVar) {
            }
        }
    }

    public static abstract class AbstractC5858e<T extends AbstractC5852b, O> {
        @RecentlyNonNull
        public List<Scope> m21931a(O o) {
            return Collections.emptyList();
        }

        public int m21930b() {
            return Integer.MAX_VALUE;
        }
    }

    public interface AbstractC5859f extends AbstractC5852b {
        boolean mo21250a();

        boolean mo21249b();

        Set<Scope> mo20582d();

        void mo21247e(@RecentlyNonNull String str);

        boolean mo21246g();

        @RecentlyNonNull
        String mo21245h();

        void mo21244i(@RecentlyNonNull AbstractC6325c.AbstractC6328c cVar);

        void mo905j();

        void mo21243m(@RecentlyNonNull String str, FileDescriptor fileDescriptor, @RecentlyNonNull PrintWriter printWriter, String[] strArr);

        void mo21242n(AbstractC6355k kVar, Set<Scope> set);

        boolean mo21241o();

        int mo939p();

        @RecentlyNonNull
        C5219c[] mo21240q();

        @RecentlyNullable
        String mo21239r();

        @RecentlyNonNull
        Intent mo21238s();

        boolean mo20626t();

        void mo21237u(@RecentlyNonNull AbstractC6325c.AbstractC6330e eVar);
    }

    public static final class C5860g<C extends AbstractC5859f> extends C5853c<C> {
    }

    public <C extends AbstractC5859f> C5850a(@RecentlyNonNull String str, @RecentlyNonNull AbstractC5851a<C, O> aVar, @RecentlyNonNull C5860g<C> gVar) {
        C6378r.m20505l(aVar, "Cannot construct an Api with a null ClientBuilder");
        C6378r.m20505l(gVar, "Cannot construct an Api with a null ClientKey");
        this.f18723c = str;
        this.f18721a = aVar;
        this.f18722b = gVar;
    }

    @RecentlyNonNull
    public final AbstractC5858e<?, O> m21937a() {
        return this.f18721a;
    }

    @RecentlyNonNull
    public final AbstractC5851a<?, O> m21936b() {
        return this.f18721a;
    }

    @RecentlyNonNull
    public final C5853c<?> m21935c() {
        return this.f18722b;
    }

    @RecentlyNonNull
    public final String m21934d() {
        return this.f18723c;
    }
}
package p018b3;

import java.util.concurrent.Executor;
import p043d3.AbstractC3589b;
import p043d3.C3591d;

public final class C1153j implements AbstractC3589b<Executor> {

    public static final class C1154a {
        public static final C1153j f4380a = new C1153j();
    }

    public static C1153j m38284a() {
        return C1154a.f4380a;
    }

    public static Executor m38283b() {
        return (Executor) C3591d.m29917c(AbstractC1152i.m38285a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public Executor get() {
        return m38283b();
    }
}

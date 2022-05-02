package p020b5;

import android.text.TextUtils;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

public final class C1186a {
    @Pure
    public static void m38189a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @Pure
    public static void m38188b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @Pure
    public static int m38187c(int i, int i2, int i3) {
        if (i >= i2 && i < i3) {
            return i;
        }
        throw new IndexOutOfBoundsException();
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static String m38186d(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T m38185e(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    @Pure
    public static void m38184f(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @Pure
    public static void m38183g(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T m38182h(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException();
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T m38181i(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
}
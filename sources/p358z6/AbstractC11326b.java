package p358z6;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p343y6.C10433i;

public abstract class AbstractC11326b<T> extends AbstractC11403r0<T> {
    public EnumC11328b f36255a = EnumC11328b.NOT_READY;
    @NullableDecl
    public T f36256b;

    public static class C11327a {
        public static final int[] f36257a;

        static {
            int[] iArr = new int[EnumC11328b.values().length];
            f36257a = iArr;
            try {
                iArr[EnumC11328b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36257a[EnumC11328b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum EnumC11328b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public abstract T mo697a();

    @CanIgnoreReturnValue
    public final T m893b() {
        this.f36255a = EnumC11328b.DONE;
        return null;
    }

    public final boolean m892c() {
        this.f36255a = EnumC11328b.FAILED;
        this.f36256b = mo697a();
        if (this.f36255a == EnumC11328b.DONE) {
            return false;
        }
        this.f36255a = EnumC11328b.READY;
        return true;
    }

    @Override
    @CanIgnoreReturnValue
    public final boolean hasNext() {
        C10433i.m5124n(this.f36255a != EnumC11328b.FAILED);
        int i = C11327a.f36257a[this.f36255a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return m892c();
        }
        return true;
    }

    @Override
    @CanIgnoreReturnValue
    public final T next() {
        if (hasNext()) {
            this.f36255a = EnumC11328b.NOT_READY;
            T t = this.f36256b;
            this.f36256b = null;
            return t;
        }
        throw new NoSuchElementException();
    }
}

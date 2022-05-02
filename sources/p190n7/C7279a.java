package p190n7;

import java.util.Objects;
import p190n7.AbstractC7295l;

public final class C7279a extends AbstractC7295l {
    public final String f23129a;
    public final long f23130b;
    public final long f23131c;

    public static final class C7281b extends AbstractC7295l.AbstractC7296a {
        public String f23132a;
        public Long f23133b;
        public Long f23134c;

        @Override
        public AbstractC7295l mo17128a() {
            String str = "";
            if (this.f23132a == null) {
                str = str + " token";
            }
            if (this.f23133b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f23134c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new C7279a(this.f23132a, this.f23133b.longValue(), this.f23134c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public AbstractC7295l.AbstractC7296a mo17127b(String str) {
            Objects.requireNonNull(str, "Null token");
            this.f23132a = str;
            return this;
        }

        @Override
        public AbstractC7295l.AbstractC7296a mo17126c(long j) {
            this.f23134c = Long.valueOf(j);
            return this;
        }

        @Override
        public AbstractC7295l.AbstractC7296a mo17125d(long j) {
            this.f23133b = Long.valueOf(j);
            return this;
        }
    }

    @Override
    public String mo17131b() {
        return this.f23129a;
    }

    @Override
    public long mo17130c() {
        return this.f23131c;
    }

    @Override
    public long mo17129d() {
        return this.f23130b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7295l)) {
            return false;
        }
        AbstractC7295l lVar = (AbstractC7295l) obj;
        return this.f23129a.equals(lVar.mo17131b()) && this.f23130b == lVar.mo17129d() && this.f23131c == lVar.mo17130c();
    }

    public int hashCode() {
        long j = this.f23130b;
        long j2 = this.f23131c;
        return ((((this.f23129a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f23129a + ", tokenExpirationTimestamp=" + this.f23130b + ", tokenCreationTimestamp=" + this.f23131c + "}";
    }

    public C7279a(String str, long j, long j2) {
        this.f23129a = str;
        this.f23130b = j;
        this.f23131c = j2;
    }
}
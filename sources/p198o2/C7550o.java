package p198o2;

import androidx.work.C1070b;
import p281u1.AbstractC9418b;
import p281u1.AbstractC9421e;
import p281u1.AbstractC9433k;
import p323x1.AbstractC10074f;

public final class C7550o implements AbstractC7549n {
    public final AbstractC9421e f24134a;
    public final AbstractC9418b<C7548m> f24135b;
    public final AbstractC9433k f24136c;
    public final AbstractC9433k f24137d;

    public class C7551a extends AbstractC9418b<C7548m> {
        public C7551a(AbstractC9421e eVar) {
            super(eVar);
        }

        @Override
        public String mo8674d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        public void mo8741g(AbstractC10074f fVar, C7548m mVar) {
            String str = mVar.f24132a;
            if (str == null) {
                fVar.mo5374d0(1);
            } else {
                fVar.mo5373q(1, str);
            }
            byte[] m = C1070b.m38472m(mVar.f24133b);
            if (m == null) {
                fVar.mo5374d0(2);
            } else {
                fVar.mo5375N(2, m);
            }
        }
    }

    public class C7552b extends AbstractC9433k {
        public C7552b(AbstractC9421e eVar) {
            super(eVar);
        }

        @Override
        public String mo8674d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    public class C7553c extends AbstractC9433k {
        public C7553c(AbstractC9421e eVar) {
            super(eVar);
        }

        @Override
        public String mo8674d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public C7550o(AbstractC9421e eVar) {
        this.f24134a = eVar;
        this.f24135b = new C7551a(eVar);
        this.f24136c = new C7552b(eVar);
        this.f24137d = new C7553c(eVar);
    }

    @Override
    public void mo15705a(String str) {
        this.f24134a.m8732b();
        AbstractC10074f a = this.f24136c.m8677a();
        if (str == null) {
            a.mo5374d0(1);
        } else {
            a.mo5373q(1, str);
        }
        this.f24134a.m8731c();
        try {
            a.mo5371u();
            this.f24134a.m8714t();
        } finally {
            this.f24134a.m8727g();
            this.f24136c.m8672f(a);
        }
    }

    @Override
    public void mo15704b() {
        this.f24134a.m8732b();
        AbstractC10074f a = this.f24137d.m8677a();
        this.f24134a.m8731c();
        try {
            a.mo5371u();
            this.f24134a.m8714t();
        } finally {
            this.f24134a.m8727g();
            this.f24137d.m8672f(a);
        }
    }
}

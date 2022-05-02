package p163l5;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p118i5.C5217a;
import p163l5.AbstractC6325c;
import p327x5.HandlerC10104h;

public final class HandlerC6324b1 extends HandlerC10104h {
    public final AbstractC6325c f19861a;

    public HandlerC6324b1(AbstractC6325c cVar, Looper looper) {
        super(looper);
        this.f19861a = cVar;
    }

    public static final void m20671a(Message message) {
        AbstractC6332c1 c1Var = (AbstractC6332c1) message.obj;
        c1Var.mo20481a();
        c1Var.m20619d();
    }

    public static final boolean m20670b(Message message) {
        int i = message.what;
        return i == 2 || i == 1 || i == 7;
    }

    @Override
    public final void handleMessage(Message message) {
        AbstractC6325c.AbstractC6326a aVar;
        AbstractC6325c.AbstractC6326a aVar2;
        C5217a aVar3;
        C5217a aVar4;
        boolean z;
        if (this.f19861a.f19892l0.get() == message.arg1) {
            int i = message.what;
            if ((i == 1 || i == 7 || ((i == 4 && !this.f19861a.m20623x()) || message.what == 5)) && !this.f19861a.m20640g()) {
                m20671a(message);
                return;
            }
            int i2 = message.what;
            PendingIntent pendingIntent = null;
            if (i2 == 4) {
                this.f19861a.f19889i0 = new C5217a(message.arg2);
                if (AbstractC6325c.m20646b0(this.f19861a)) {
                    z = this.f19861a.f19890j0;
                    if (!z) {
                        this.f19861a.m20633k0(3, null);
                        return;
                    }
                }
                aVar4 = this.f19861a.f19889i0;
                C5217a aVar5 = aVar4 != null ? this.f19861a.f19889i0 : new C5217a(8);
                this.f19861a.f19876Y.mo20622b(aVar5);
                this.f19861a.m20660O(aVar5);
            } else if (i2 == 5) {
                aVar3 = this.f19861a.f19889i0;
                C5217a aVar6 = aVar3 != null ? this.f19861a.f19889i0 : new C5217a(8);
                this.f19861a.f19876Y.mo20622b(aVar6);
                this.f19861a.m20660O(aVar6);
            } else if (i2 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) obj;
                }
                C5217a aVar7 = new C5217a(message.arg2, pendingIntent);
                this.f19861a.f19876Y.mo20622b(aVar7);
                this.f19861a.m20660O(aVar7);
            } else if (i2 == 6) {
                this.f19861a.m20633k0(5, null);
                aVar = this.f19861a.f19884d0;
                if (aVar != null) {
                    aVar2 = this.f19861a.f19884d0;
                    aVar2.mo20578q(message.arg2);
                }
                this.f19861a.m20659P(message.arg2);
                AbstractC6325c.m20639g0(this.f19861a, 5, 1, null);
            } else if (i2 == 2 && !this.f19861a.m20649a()) {
                m20671a(message);
            } else if (m20670b(message)) {
                ((AbstractC6332c1) message.obj).m20620c();
            } else {
                int i3 = message.what;
                StringBuilder sb2 = new StringBuilder(45);
                sb2.append("Don't know how to handle message: ");
                sb2.append(i3);
                Log.wtf("GmsClient", sb2.toString(), new Exception());
            }
        } else if (m20670b(message)) {
            m20671a(message);
        }
    }
}
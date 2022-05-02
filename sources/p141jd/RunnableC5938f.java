package p141jd;

import be.C1379j0;
import gd.AbstractC4718o;
import gd.C4747r;
import gd.C4779t2;
import gd.C4791t4;
import ie.RunnableC5390g;
import java.util.ArrayList;
import java.util.Iterator;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import p038ce.View$OnClickListenerC2971rh;
import p108hb.C5070i;
import p141jd.C5976u;
import p193nb.C7316a;
import p291uc.C9678w2;
import p350yd.C11059v7;

public class RunnableC5938f implements Client.AbstractC7865g, Runnable, C5976u.AbstractC5986j, C11059v7.AbstractC11068i, C11059v7.AbstractC11061b, C11059v7.AbstractC11067h {
    public int f18846M;
    public C4791t4 f18847N;
    public long f18848O;
    public ArrayList<AbstractC4718o<?>> f18849P;
    public String f18850Q;
    public C5976u.AbstractC5988l f18851R;
    public boolean f18852S;
    public String f18853T;
    public String f18854U;
    public ArrayList<AbstractC4718o<?>> f18855V;
    public boolean f18856W;
    public long f18857X;
    public TdApi.Message f18858Y;
    public int f18859Z;
    public int f18860a;
    public final View$OnClickListenerC2971rh f18861b;
    public long f18862c;

    public RunnableC5938f(View$OnClickListenerC2971rh rhVar, TdApi.Chat chat) {
        this.f18861b = rhVar;
        if (chat != null) {
            this.f18862c = chat.f25370id;
            int constructor = chat.type.getConstructor();
            if (constructor == -1472570774) {
                this.f18846M = 2;
                this.f18848O = C7316a.m17045p(chat.f25370id);
            } else if (constructor == 973884508) {
                this.f18846M = 1;
                this.f18848O = C7316a.m17048m(chat.f25370id);
            } else if (constructor == 1579049844) {
                this.f18846M = 0;
                this.f18848O = C4779t2.m25466n2(chat);
            }
            m21834q();
            m21833r(chat.replyMarkupMessageId);
            return;
        }
        m21833r(0L);
    }

    public void m21839l(TdApi.BasicGroup basicGroup) {
        m21852C(!C4779t2.m25507h3(basicGroup.status));
    }

    public void m21838m(TdApi.Message message) {
        m21827x(message, true);
    }

    public void m21837n(TdApi.Supergroup supergroup) {
        m21852C(!C4779t2.m25507h3(supergroup.status));
    }

    public void m21836o() {
        String str;
        C5976u.AbstractC5988l lVar = this.f18851R;
        if (lVar != null && (str = this.f18850Q) != null && !this.f18852S) {
            lVar.mo21606a(str);
            this.f18850Q = null;
            this.f18851R = null;
        }
    }

    public void m21835p() {
        m21827x(null, true);
    }

    public final void m21854A(TdApi.UserFullInfo userFullInfo) {
        if (userFullInfo != null) {
            if (!C5070i.m24062i(userFullInfo.description) && !this.f18861b.m32219ui()) {
                C9678w2 nk = this.f18861b.m32308nk();
                long j = this.f18862c;
                String str = userFullInfo.description;
                this.f18847N = new C4791t4(nk, j, new TdApi.FormattedText(str, RunnableC5390g.m22997G(str, 15)));
            }
            if (userFullInfo.commands.length > 0) {
                ArrayList<AbstractC4718o<?>> arrayList = new ArrayList<>(userFullInfo.commands.length);
                for (TdApi.BotCommand botCommand : userFullInfo.commands) {
                    arrayList.add(new C4747r(this.f18861b.mo4347s(), this.f18861b.mo4348c(), this.f18848O, botCommand));
                }
                this.f18849P = arrayList;
                this.f18861b.mo4348c().m2469ed(this);
            } else if (this.f18847N != null) {
                this.f18861b.mo4348c().m2469ed(this);
            }
        }
    }

    public final void m21853B() {
        this.f18854U = null;
        this.f18853T = null;
        this.f18855V = null;
    }

    public final void m21852C(boolean z) {
        if (this.f18856W != z) {
            this.f18856W = z;
            m21827x(z ? null : this.f18858Y, false);
        }
    }

    public final boolean m21851D(long j) {
        TdApi.ChatMemberStatus K3 = this.f18861b.mo4348c().m2787K3(j);
        return K3 != null && !C4779t2.m25507h3(K3);
    }

    public void m21850E(long j, long j2) {
        if (j2 == 0) {
            this.f18861b.mo4348c().m2469ed(new Runnable() {
                @Override
                public final void run() {
                    RunnableC5938f.this.m21835p();
                }
            });
        } else {
            this.f18861b.mo4348c().m2270r4().m14783o(new TdApi.GetMessage(j, j2), this);
        }
    }

    @Override
    public void mo1348P1(TdApi.User user) {
    }

    @Override
    public void mo1566W2(final TdApi.BasicGroup basicGroup, boolean z) {
        this.f18861b.mo4348c().m2469ed(new Runnable() {
            @Override
            public final void run() {
                RunnableC5938f.this.m21839l(basicGroup);
            }
        });
    }

    @Override
    public ArrayList<AbstractC4718o<?>> mo21607a(String str, String str2, C5976u.AbstractC5988l lVar) {
        ArrayList<AbstractC4718o<?>> arrayList = null;
        if ((this.f18860a & 2) == 0) {
            this.f18850Q = str2;
            this.f18851R = lVar;
            this.f18852S = true;
            return null;
        }
        ArrayList<AbstractC4718o<?>> arrayList2 = this.f18849P;
        String str3 = this.f18853T;
        if (!(str3 == null || this.f18854U == null || !str.startsWith(str3))) {
            arrayList2 = this.f18855V;
        }
        if (arrayList2 != null) {
            Iterator<AbstractC4718o<?>> it = arrayList2.iterator();
            while (it.hasNext()) {
                C4747r rVar = (C4747r) it.next();
                if (rVar.m26271d0(str)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>(arrayList2.size());
                    }
                    arrayList.add(rVar);
                }
            }
        }
        this.f18854U = str2;
        this.f18853T = str;
        this.f18855V = arrayList;
        return arrayList;
    }

    public void m21844g() {
        this.f18860a |= 1;
        int i = this.f18846M;
        if (i == 0) {
            this.f18861b.mo4348c().m2480e2().m1702P1(this.f18848O, this);
        } else if (i == 1) {
            this.f18861b.mo4348c().m2480e2().m1611o2(this.f18848O, this);
        } else if (i == 2) {
            this.f18861b.mo4348c().m2480e2().m1603q2(this.f18848O, this);
        }
    }

    public AbstractC4718o<?> m21843h(String str) {
        ArrayList<AbstractC4718o<?>> arrayList = this.f18849P;
        if (arrayList == null) {
            return null;
        }
        Iterator<AbstractC4718o<?>> it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC4718o<?> next = it.next();
            if ((next instanceof C4747r) && str.equals(((C4747r) next).m26274a0())) {
                return next;
            }
        }
        return null;
    }

    @Override
    public void mo1556h0(long j, TdApi.SupergroupFullInfo supergroupFullInfo) {
        m21825z(supergroupFullInfo);
    }

    public AbstractC4718o<?> m21842i() {
        return m21843h("/help");
    }

    @Override
    public void mo1565i4(long j, TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        m21829v(basicGroupFullInfo);
    }

    public AbstractC4718o<?> m21841j() {
        return m21843h("/settings");
    }

    public boolean m21840k() {
        ArrayList<AbstractC4718o<?>> arrayList = this.f18849P;
        return arrayList != null && !arrayList.isEmpty();
    }

    public final void m21834q() {
        int i = this.f18846M;
        if (i == 0) {
            this.f18861b.mo4348c().m2480e2().m1720L(this.f18848O, this);
            m21854A(this.f18861b.mo4348c().m2480e2().m1745E2(this.f18848O));
        } else if (i == 1) {
            this.f18861b.mo4348c().m2480e2().m1662b2(this.f18848O, this);
            m21829v(this.f18861b.mo4348c().m2480e2().m1708O(this.f18848O));
        } else if (i == 2) {
            this.f18861b.mo4348c().m2480e2().m1654d2(this.f18848O, this);
            m21825z(this.f18861b.mo4348c().m2480e2().m1634i2(this.f18848O));
        }
    }

    public final void m21833r(long j) {
        if (this.f18857X == 0 && j != 0) {
            this.f18861b.mo4348c().m2270r4().m14783o(new TdApi.GetMessage(this.f18862c, j), this);
        }
    }

    @Override
    public void run() {
        int i = this.f18860a;
        if ((i & 1) == 0) {
            this.f18860a = i | 2;
            if (!(this.f18850Q == null || this.f18851R == null || !this.f18852S)) {
                m21853B();
                this.f18851R.mo21606a(this.f18850Q);
                this.f18850Q = null;
                this.f18851R = null;
            }
            View$OnClickListenerC2971rh rhVar = this.f18861b;
            if (rhVar != null) {
                if (this.f18847N != null) {
                    rhVar.m32308nk().m7756R2(this.f18847N);
                } else {
                    rhVar.m32308nk().m7698g0();
                }
                this.f18861b.m32197vr((this.f18859Z > 0 || this.f18846M == 0) && m21840k());
            }
        }
    }

    public void m21832s(long j) {
        if (this.f18857X == j) {
            this.f18861b.mo4348c().m2270r4().m14783o(new TdApi.DeleteChatReplyMarkup(this.f18862c, j), this);
        }
    }

    public final void m21831t(TdApi.BotCommands[] botCommandsArr) {
        TdApi.User v2;
        ArrayList<AbstractC4718o<?>> arrayList = new ArrayList<>();
        int i = 0;
        for (TdApi.BotCommands botCommands : botCommandsArr) {
            if (!(botCommands.commands.length == 0 || (v2 = this.f18861b.mo4348c().m2480e2().m1583v2(botCommands.botUserId)) == null)) {
                i++;
                for (TdApi.BotCommand botCommand : botCommands.commands) {
                    arrayList.add(new C4747r(this.f18861b.mo4347s(), this.f18861b.mo4348c(), v2, botCommand));
                }
            }
        }
        int i2 = this.f18859Z;
        this.f18859Z = i;
        this.f18849P = arrayList;
        if (i > 0 || i2 > 0) {
            this.f18861b.mo4348c().m2469ed(this);
        }
        this.f18861b.mo4348c().m2469ed(new Runnable() {
            @Override
            public final void run() {
                RunnableC5938f.this.m21836o();
            }
        });
    }

    @Override
    public void mo1555t0(final TdApi.Supergroup supergroup) {
        this.f18861b.mo4348c().m2469ed(new Runnable() {
            @Override
            public final void run() {
                RunnableC5938f.this.m21837n(supergroup);
            }
        });
    }

    @Override
    public void mo255t2(TdApi.Object object) {
        if ((this.f18860a & 1) == 0) {
            int constructor = object.getConstructor();
            if (constructor != -1679978726) {
                if (constructor == 1435961258) {
                    final TdApi.Message message = (TdApi.Message) object;
                    this.f18861b.mo4348c().m2469ed(new Runnable() {
                        @Override
                        public final void run() {
                            RunnableC5938f.this.m21838m(message);
                        }
                    });
                }
            } else if (this.f18846M != 2) {
                C1379j0.m37305t0(object);
            } else {
                Log.m14709w("Cannot get bots for supergroup: %s", C4779t2.m25379z5(object));
            }
        }
    }

    public final void m21830u(TdApi.Message message, boolean z) {
        if (z) {
            this.f18861b.m32537Vq();
            this.f18861b.m32445cr(message, false, false);
        } else if (this.f18846M == 0) {
            this.f18861b.m32445cr(message, false, false);
        }
        if (message != null) {
            this.f18861b.mo4348c().m2270r4().m14783o(new TdApi.DeleteChatReplyMarkup(this.f18862c, message.f25409id), this);
        }
    }

    @Override
    public void mo1335u7(long j, TdApi.UserFullInfo userFullInfo) {
        m21854A(userFullInfo);
    }

    public final void m21829v(TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        if (basicGroupFullInfo != null) {
            m21831t(basicGroupFullInfo.botCommands);
        }
    }

    public final void m21828w(long j, boolean z) {
        this.f18861b.m32672Lk(z);
        if (j != 0) {
            this.f18861b.mo4348c().m2270r4().m14783o(new TdApi.DeleteChatReplyMarkup(this.f18862c, j), this);
        }
    }

    public final void m21827x(TdApi.Message message, boolean z) {
        TdApi.ReplyMarkup replyMarkup = null;
        if (z) {
            this.f18858Y = message;
            if (this.f18856W || (message != null && m21851D(message.chatId))) {
                this.f18856W = true;
                message = null;
            }
        }
        if (message != null) {
            replyMarkup = message.replyMarkup;
        }
        long j = message == null ? 0L : message.f25409id;
        if ((this.f18860a & 1) == 0) {
            if (j > this.f18857X) {
                this.f18857X = j;
            } else if (j != 0) {
                return;
            }
            if (j == 0 || replyMarkup == null) {
                this.f18861b.mo8377l1();
                return;
            }
            int constructor = replyMarkup.getConstructor();
            if (constructor == -691252879) {
                m21828w(j, ((TdApi.ReplyMarkupRemoveKeyboard) replyMarkup).isPersonal);
            } else if (constructor == -64985802) {
                m21826y(j, (TdApi.ReplyMarkupShowKeyboard) replyMarkup);
                int i = this.f18846M;
                if (i == 1 || i == 2) {
                    this.f18861b.m32445cr(message, false, false);
                }
            } else if (constructor == 1101461919) {
                m21830u(message, ((TdApi.ReplyMarkupForceReply) replyMarkup).isPersonal);
            }
        }
    }

    public final void m21826y(long j, TdApi.ReplyMarkupShowKeyboard replyMarkupShowKeyboard) {
        this.f18861b.m32524Wq(j, replyMarkupShowKeyboard);
    }

    public final void m21825z(TdApi.SupergroupFullInfo supergroupFullInfo) {
        if (supergroupFullInfo != null) {
            m21831t(supergroupFullInfo.botCommands);
        }
    }
}

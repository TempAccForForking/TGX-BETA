package p363zc;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1363c0;
import cd.C2104l;
import gd.C4618d7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import me.C6998q0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.widget.EmbeddableStickerView;
import p037cb.C2057b;
import p038ce.C2139ap;
import p038ce.C2546iq;
import p038ce.C2964ra;
import p038ce.View$OnClickListenerC2855p0;
import p038ce.View$OnClickListenerC3021s;
import p082fd.C4403w;
import p108hb.C5062b;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5132o;
import p350yd.C10534a9;
import p350yd.C10930q6;
import p350yd.C11031u1;
import p350yd.C11052v1;
import p363zc.C11493p;
import sc.C8731d;
import td.AbstractC9323v4;

public class C11493p implements C11052v1.AbstractC11053a, Client.AbstractC7865g {
    public boolean f36490M;
    public boolean f36491N;
    public String f36492O;
    public final AbstractC9323v4<?> f36493P;
    public final long f36494Q;
    public final String f36495R;
    public final boolean f36496S;
    public final boolean f36497T;
    public final boolean f36498U;
    public RecyclerView f36499V;
    public C2546iq f36500W;
    public ArrayList<C4618d7> f36501a;
    public final ArrayList<TdApi.ChatJoinRequest> f36502b = new ArrayList<>();
    public int f36503c;

    public class C11494a extends C2546iq {
        public C11494a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        public boolean m430B3(View view, C5132o oVar) {
            View$OnClickListenerC2855p0 p0Var = new View$OnClickListenerC2855p0(C11493p.this.m487C(), C11493p.this.m458c0());
            p0Var.m33195Hh(new View$OnClickListenerC2855p0.C2860d(C11493p.this.f36494Q, C11493p.this.m458c0().m2519ba(), null, null, C11493p.this.m458c0().m2787K3(C11493p.this.f36494Q).getConstructor() == -160019714));
            C11493p.this.f36493P.m9291ac(p0Var);
            return true;
        }

        public void m429C3(C4618d7 d7Var, View view) {
            C11493p.this.m433y(d7Var);
        }

        public void m428E3(C4618d7 d7Var, View view) {
            C11493p.this.m486D(d7Var);
        }

        public void m427F3(C6998q0 q0Var, View view) {
            C11493p.this.m468V(q0Var);
        }

        @Override
        public void mo426p2(C2964ra raVar, int i, EmbeddableStickerView embeddableStickerView, boolean z) {
            TdApi.Sticker sticker = (TdApi.Sticker) raVar.m32847d();
            embeddableStickerView.setSticker(new C2104l(C11493p.this.m458c0(), sticker, "😎", sticker.type));
            embeddableStickerView.setCaptionText(C1363c0.m37428l(C11493p.this.f36493P, C4403w.m27867j1(C11493p.this.f36498U ? R.string.InviteLinkRequestsHintChannel : R.string.InviteLinkRequestsHint, "tg://need_update_for_some_feature"), new C5132o.AbstractC5133a() {
                @Override
                public final boolean mo490a(View view, C5132o oVar) {
                    boolean B3;
                    B3 = C11493p.C11494a.this.m430B3(view, oVar);
                    return B3;
                }
            }));
        }

        @Override
        public void mo423z2(C2964ra raVar, int i, final C6998q0 q0Var, boolean z) {
            ArrayList arrayList = C11493p.this.f36501a;
            if (!C11493p.this.f36496S && !C11493p.this.f36497T && !C11493p.this.m483G()) {
                i -= 3;
            }
            final C4618d7 d7Var = (C4618d7) arrayList.get(i);
            q0Var.setTag(d7Var);
            q0Var.m18125E1().m18143f(d7Var.m26884f(), d7Var.m26883g());
            q0Var.m18125E1().m18140i(d7Var.m26879k(), d7Var.m26874p());
            q0Var.m18125E1().m18141h(R.drawable.baseline_person_add_16, new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    C11493p.C11494a.this.m429C3(d7Var, view);
                }
            });
            q0Var.m18126D1().setImageResource(R.drawable.baseline_close_24);
            q0Var.setIconClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    C11493p.C11494a.this.m428E3(d7Var, view);
                }
            });
            q0Var.setTextClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    C11493p.C11494a.this.m427F3(q0Var, view);
                }
            });
        }
    }

    public class C11495b extends RecyclerView.AbstractC0910t {
        public C11495b() {
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            if ((C11493p.this.f36496S || C11493p.this.f36493P.m9339Ta()) && C11493p.this.f36490M && !C11493p.this.f36491N && C11493p.this.f36501a != null && !C11493p.this.f36501a.isEmpty() && C11493p.this.f36503c != 0 && ((LinearLayoutManager) recyclerView.getLayoutManager()).m39549a2() + 10 >= C11493p.this.f36501a.size()) {
                C11493p.this.m470T();
            }
        }
    }

    public C11493p(AbstractC9323v4<?> v4Var, long j, String str) {
        this.f36493P = v4Var;
        this.f36494Q = j;
        this.f36495R = str;
        this.f36496S = v4Var instanceof View$OnClickListenerC11497r;
        this.f36497T = str != null && !str.isEmpty();
        this.f36498U = v4Var.mo4348c().m2784K6(j);
    }

    public void m481I(C4618d7 d7Var, TdApi.Object object) {
        m462a0(d7Var);
    }

    public boolean m480J(final C4618d7 d7Var, View view, int i) {
        if (i != R.id.btn_approveChatRequest) {
            return true;
        }
        m458c0().m2270r4().m14783o(new TdApi.ProcessChatJoinRequest(this.f36494Q, d7Var.m26871s(), true), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C11493p.this.m481I(d7Var, object);
            }
        });
        return true;
    }

    public void m479K(C4618d7 d7Var, TdApi.Object object) {
        m462a0(d7Var);
    }

    public boolean m478L(final C4618d7 d7Var, View view, int i) {
        if (i != R.id.btn_declineChatRequest) {
            return true;
        }
        m458c0().m2270r4().m14783o(new TdApi.ProcessChatJoinRequest(this.f36494Q, d7Var.m26871s(), false), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C11493p.this.m479K(d7Var, object);
            }
        });
        return true;
    }

    public void m477M(ArrayList arrayList, TdApi.ChatJoinRequests chatJoinRequests) {
        if (!this.f36493P.m9347Sa()) {
            this.f36501a = arrayList;
            int length = chatJoinRequests.requests.length;
            this.f36503c = length;
            this.f36490M = length <= chatJoinRequests.totalCount;
            m489A();
            this.f36493P.m9204n9();
            m456d0(false);
        }
    }

    public void m476N(TdApi.Object object) {
        TdApi.ChatJoinRequest[] chatJoinRequestArr;
        if (object.getConstructor() == 1291680519) {
            this.f36502b.clear();
            final TdApi.ChatJoinRequests chatJoinRequests = (TdApi.ChatJoinRequests) object;
            final ArrayList arrayList = new ArrayList(chatJoinRequests.requests.length);
            for (TdApi.ChatJoinRequest chatJoinRequest : chatJoinRequests.requests) {
                this.f36502b.add(chatJoinRequest);
                arrayList.add(m464Z(m458c0(), chatJoinRequest, arrayList));
            }
            m458c0().m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C11493p.this.m477M(arrayList, chatJoinRequests);
                }
            });
        }
    }

    public boolean m475O(C4618d7 d7Var, View view, int i) {
        if (i == R.id.btn_approveChatRequest) {
            m433y(d7Var);
            return true;
        } else if (i == R.id.btn_declineChatRequest) {
            m486D(d7Var);
            return true;
        } else if (i != R.id.btn_openChat) {
            return true;
        } else {
            m465Y(d7Var);
            return true;
        }
    }

    public void m474P(TdApi.ChatJoinRequests chatJoinRequests, ArrayList arrayList) {
        if (!this.f36493P.m9347Sa()) {
            boolean z = false;
            this.f36491N = false;
            int length = this.f36503c + chatJoinRequests.requests.length;
            this.f36503c = length;
            if (length <= chatJoinRequests.totalCount) {
                z = true;
            }
            this.f36490M = z;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (m482H(((C4618d7) arrayList.get(size)).m26871s()) != -1) {
                    arrayList.remove(size);
                }
            }
            m432z(arrayList);
        }
    }

    public void m473Q() {
        m456d0(false);
    }

    public void m472R(C4618d7 d7Var) {
        int indexOf = this.f36501a.indexOf(d7Var);
        if (indexOf != -1) {
            m456d0(true);
            this.f36501a.remove(indexOf);
            this.f36502b.remove(indexOf);
            C2546iq iqVar = this.f36500W;
            if (!this.f36496S && !this.f36497T && !m483G()) {
                indexOf += 3;
            }
            iqVar.m34150n1(indexOf);
            m466X();
            m458c0().m2485dd().postDelayed(new Runnable() {
                @Override
                public final void run() {
                    C11493p.this.m473Q();
                }
            }, 500L);
        }
    }

    public static C4618d7 m464Z(C10930q6 q6Var, TdApi.ChatJoinRequest chatJoinRequest, ArrayList<C4618d7> arrayList) {
        C4618d7 d7Var = new C4618d7(q6Var, q6Var.m2480e2().m1583v2(chatJoinRequest.userId));
        d7Var.m26893A();
        d7Var.m26864z(C4403w.m27867j1(R.string.InviteLinkRequestSince, C4403w.m27976J0(chatJoinRequest.date, TimeUnit.SECONDS)));
        d7Var.m26866x(arrayList);
        return d7Var;
    }

    public final void m489A() {
        ArrayList arrayList = new ArrayList();
        if (!this.f36496S && !this.f36497T && !m483G()) {
            arrayList.add(new C2964ra(14));
            arrayList.add(new C2964ra(130).m32873G(m458c0().m2365l5("😎")));
            arrayList.add(new C2964ra(2));
        }
        ArrayList<C4618d7> arrayList2 = this.f36501a;
        if (arrayList2 != null) {
            arrayList.ensureCapacity(arrayList2.size());
            Iterator<C4618d7> it = this.f36501a.iterator();
            while (it.hasNext()) {
                arrayList.add(new C2964ra(131, R.id.user, 0, 0).m32866N(it.next().m26882h()));
            }
        }
        arrayList.add(new C2964ra(3));
        if (this.f36496S && !this.f36490M && !m483G()) {
            arrayList.add(new C2964ra(9, 0, 0, this.f36498U ? R.string.InviteLinkRequestsHintChannel : R.string.InviteLinkRequestsHint));
        }
        this.f36500W.m34119x2(arrayList, false);
    }

    public final void m488B() {
        if (this.f36496S) {
            ((View$OnClickListenerC11497r) this.f36493P).m412tg();
        }
    }

    public final AbstractView$OnTouchListenerC7889a m487C() {
        return this.f36493P.mo4347s();
    }

    public final void m486D(final C4618d7 d7Var) {
        this.f36493P.m9261ee(C4403w.m27855m1(R.string.AreYouSureDeclineJoinRequest, d7Var.m26879k()), new int[]{R.id.btn_declineChatRequest, R.id.btn_cancel}, new String[]{C4403w.m27871i1(R.string.InviteLinkActionDeclineAction), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean L;
                L = C11493p.this.m478L(d7Var, view, i);
                return L;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23936a(this);
            }

            @Override
            public Object mo491b2(int i) {
                return C5115g0.m23935b(this, i);
            }
        });
    }

    public void m485E() {
        C11052v1.m1768b().m1766d(this);
    }

    public int m484F(int i) {
        return (C2139ap.m35482W(131) * i) + C1357a0.m37544i(48.0f) + C2139ap.m35482W(2);
    }

    public boolean m483G() {
        String str = this.f36492O;
        return str != null && !str.isEmpty();
    }

    public final int m482H(long j) {
        ArrayList<C4618d7> arrayList = this.f36501a;
        if (arrayList == null) {
            return -1;
        }
        int i = 0;
        Iterator<C4618d7> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().m26871s() == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void m471S() {
        m458c0().m2270r4().m14783o(new TdApi.GetChatJoinRequests(this.f36494Q, this.f36495R, this.f36492O, null, 20), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C11493p.this.m476N(object);
            }
        });
    }

    public final void m470T() {
        if (!this.f36491N && this.f36490M && !this.f36502b.isEmpty()) {
            this.f36491N = true;
            Client r4 = m458c0().m2270r4();
            long j = this.f36494Q;
            String str = this.f36495R;
            String str2 = this.f36492O;
            ArrayList<TdApi.ChatJoinRequest> arrayList = this.f36502b;
            r4.m14783o(new TdApi.GetChatJoinRequests(j, str, str2, arrayList.get(arrayList.size() - 1), 20), this);
        }
    }

    public boolean m469U() {
        return this.f36501a == null;
    }

    public void m468V(View view) {
        final C4618d7 d7Var;
        if (view.getId() == R.id.user && (d7Var = (C4618d7) view.getTag()) != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C4403w.m27890d3(d7Var.m26879k(), C4403w.m27845p()));
            int indexOf = this.f36501a.indexOf(d7Var);
            if (indexOf != -1) {
                TdApi.ChatJoinRequest chatJoinRequest = this.f36502b.get(indexOf);
                if (!chatJoinRequest.bio.isEmpty()) {
                    spannableStringBuilder.append((CharSequence) "\n\n").append(C4403w.m27890d3(this.f36502b.get(this.f36501a.indexOf(d7Var)).bio, C4403w.m27943R1()));
                }
                spannableStringBuilder.append((CharSequence) "\n").append(C4403w.m27890d3(C4403w.m27867j1(R.string.InviteLinkRequestSince, C4403w.m27976J0(chatJoinRequest.date, TimeUnit.SECONDS)), C4403w.m27943R1()));
            }
            AbstractC9323v4<?> v4Var = this.f36493P;
            int[] iArr = {R.id.btn_approveChatRequest, R.id.btn_declineChatRequest, R.id.btn_openChat};
            String[] strArr = new String[3];
            strArr[0] = C4403w.m27871i1(this.f36498U ? R.string.InviteLinkActionAcceptChannel : R.string.InviteLinkActionAccept);
            strArr[1] = C4403w.m27871i1(R.string.InviteLinkActionDeclineAction);
            strArr[2] = C4403w.m27871i1(R.string.InviteLinkActionWrite);
            v4Var.m9261ee(spannableStringBuilder, iArr, strArr, new int[]{3, 2, 1}, new int[]{R.drawable.baseline_person_add_24, R.drawable.baseline_delete_24, R.drawable.baseline_person_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view2, int i) {
                    boolean O;
                    O = C11493p.this.m475O(d7Var, view2, i);
                    return O;
                }

                @Override
                public boolean mo492Q() {
                    return C5115g0.m23936a(this);
                }

                @Override
                public Object mo491b2(int i) {
                    return C5115g0.m23935b(this, i);
                }
            });
        }
    }

    public void m467W(Context context, RecyclerView recyclerView) {
        this.f36500W = new C11494a(this.f36493P);
        recyclerView.m39425k(new C11495b());
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setOverScrollMode(2);
        recyclerView.setAdapter(this.f36500W);
        this.f36499V = recyclerView;
        m456d0(true);
        C11052v1.m1768b().m1769a(this);
        this.f36500W.m34116y2(new C2964ra[]{new C2964ra(15)}, false);
        m471S();
    }

    public final void m466X() {
        if (this.f36496S) {
            ((View$OnClickListenerC11497r) this.f36493P).m410vg();
            return;
        }
        AbstractC9323v4<?> v4Var = this.f36493P;
        if (v4Var instanceof View$OnClickListenerC3021s) {
            ((View$OnClickListenerC3021s) v4Var).m32121Bg();
            if (this.f36500W.m34227N0(R.id.user) == -1) {
                this.f36493P.m9298Zb();
            }
        }
    }

    public final void m465Y(C4618d7 d7Var) {
        m488B();
        m458c0().m2485dd().m3429v7(new C10534a9(m487C(), m458c0()), d7Var.m26871s(), null);
    }

    public final void m462a0(final C4618d7 d7Var) {
        this.f36493P.m9135wd(new Runnable() {
            @Override
            public final void run() {
                C11493p.this.m472R(d7Var);
            }
        });
    }

    public void m460b0(String str) {
        if (!Objects.equals(this.f36492O, str)) {
            if (str != null && str.isEmpty()) {
                str = null;
            }
            this.f36491N = false;
            this.f36503c = 0;
            this.f36492O = str;
            m471S();
        }
    }

    public final C10930q6 m458c0() {
        return this.f36493P.mo4348c();
    }

    public final void m456d0(boolean z) {
        this.f36499V.setItemAnimator(z ? new C8731d(C2057b.f7280b, 180L) : null);
    }

    @Override
    public void mo452g2() {
        this.f36500W.m34189b3(R.id.user);
    }

    @Override
    public void mo443o4() {
        C11031u1.m1981a(this);
    }

    @Override
    public void mo255t2(TdApi.Object object) {
        TdApi.ChatJoinRequest[] chatJoinRequestArr;
        if (object.getConstructor() == 1291680519) {
            final TdApi.ChatJoinRequests chatJoinRequests = (TdApi.ChatJoinRequests) object;
            final ArrayList arrayList = new ArrayList(chatJoinRequests.requests.length);
            for (TdApi.ChatJoinRequest chatJoinRequest : chatJoinRequests.requests) {
                this.f36502b.add(chatJoinRequest);
                arrayList.add(m464Z(m458c0(), chatJoinRequest, this.f36501a));
            }
            if (!arrayList.isEmpty()) {
                m458c0().m2485dd().post(new Runnable() {
                    @Override
                    public final void run() {
                        C11493p.this.m474P(chatJoinRequests, arrayList);
                    }
                });
            }
        }
    }

    public final void m433y(final C4618d7 d7Var) {
        AbstractC9323v4<?> v4Var = this.f36493P;
        CharSequence m1 = C4403w.m27855m1(R.string.AreYouSureAcceptJoinRequest, d7Var.m26879k(), m458c0().m2691Q3(this.f36494Q));
        int[] iArr = {R.id.btn_approveChatRequest, R.id.btn_cancel};
        String[] strArr = new String[2];
        strArr[0] = C4403w.m27871i1(this.f36498U ? R.string.InviteLinkActionAcceptChannel : R.string.InviteLinkActionAccept);
        strArr[1] = C4403w.m27871i1(R.string.Cancel);
        v4Var.m9261ee(m1, iArr, strArr, new int[]{3, 1}, new int[]{R.drawable.baseline_person_add_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean J;
                J = C11493p.this.m480J(d7Var, view, i);
                return J;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23936a(this);
            }

            @Override
            public Object mo491b2(int i) {
                return C5115g0.m23935b(this, i);
            }
        });
    }

    public final void m432z(ArrayList<C4618d7> arrayList) {
        if (!arrayList.isEmpty()) {
            int size = this.f36501a.size();
            ArrayList<C4618d7> arrayList2 = this.f36501a;
            arrayList2.ensureCapacity(arrayList2.size() + arrayList.size());
            this.f36501a.addAll(arrayList);
            List<C2964ra> F0 = this.f36500W.m34243F0();
            int i = 2;
            C5062b.m24160m(F0, F0.size() + arrayList.size() + (!this.f36490M ? 2 : 0));
            Iterator<C4618d7> it = arrayList.iterator();
            while (it.hasNext()) {
                F0.add(F0.size() - 1, new C2964ra(131, R.id.user, 0, 0).m32866N(it.next().m26871s()));
            }
            if (!this.f36490M) {
                F0.add(new C2964ra(3));
                if (!m483G()) {
                    F0.add(new C2964ra(9, 0, 0, R.string.InviteLinkRequestsHint));
                }
            }
            C2546iq iqVar = this.f36500W;
            int size2 = arrayList.size();
            if (this.f36490M) {
                i = 0;
            }
            iqVar.m39311M(size, size2 + i);
        }
    }
}

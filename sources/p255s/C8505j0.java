package p255s;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import androidx.camera.core.AbstractC0620m3;
import androidx.camera.core.AbstractC0658u;
import androidx.camera.core.C0662u1;
import androidx.lifecycle.AbstractC0856o;
import androidx.lifecycle.C0852l;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p016b1.C1132h;
import p255s.C8505j0;
import p266t.C8906m0;
import p266t.C8927z;
import p293v.C9812g;
import p321x.C10059h;
import p336y.AbstractC10194a0;
import p336y.AbstractC10227g;
import p336y.AbstractC10234h;
import p336y.C10317x1;
import p351z.C11179b;

public final class C8505j0 implements AbstractC10194a0 {
    public final String f27598a;
    public final C8927z f27599b;
    public C8564t f27602e;
    public final C10317x1 f27607j;
    public final AbstractC10227g f27608k;
    public final C8906m0 f27609l;
    public final Object f27601d = new Object();
    public C8506a<Integer> f27603f = null;
    public C8506a<AbstractC0620m3> f27604g = null;
    public List<Pair<AbstractC10234h, Executor>> f27606i = null;
    public final C10059h f27600c = new C10059h(this);
    public final C8506a<AbstractC0658u> f27605h = new C8506a<>(AbstractC0658u.m40664a(AbstractC0658u.EnumC0660b.CLOSED));

    public static class C8506a<T> extends C0852l<T> {
        public LiveData<T> f27610m;
        public T f27611n;

        public C8506a(T t) {
            this.f27611n = t;
        }

        @Override
        public T mo12251e() {
            LiveData<T> liveData = this.f27610m;
            return liveData == null ? this.f27611n : liveData.mo12251e();
        }

        @Override
        public <S> void mo12250n(LiveData<S> liveData, AbstractC0856o<? super S> oVar) {
            throw new UnsupportedOperationException();
        }

        public void m12249p(LiveData<T> liveData) {
            LiveData liveData2 = (LiveData<T>) this.f27610m;
            if (liveData2 != null) {
                super.m39640o(liveData2);
            }
            this.f27610m = liveData;
            super.mo12250n(liveData, new AbstractC0856o() {
                @Override
                public final void mo5597a(Object obj) {
                    C8505j0.C8506a.this.mo15730m(obj);
                }
            });
        }
    }

    public C8505j0(String str, C8906m0 m0Var) {
        String str2 = (String) C1132h.m38325e(str);
        this.f27598a = str2;
        this.f27609l = m0Var;
        C8927z c = m0Var.m10978c(str2);
        this.f27599b = c;
        this.f27607j = C9812g.m6819a(str, c);
        this.f27608k = new C8456d(str, c);
    }

    @Override
    public String mo5778a() {
        return this.f27598a;
    }

    @Override
    public void mo5777b(Executor executor, AbstractC10234h hVar) {
        synchronized (this.f27601d) {
            C8564t tVar = this.f27602e;
            if (tVar == null) {
                if (this.f27606i == null) {
                    this.f27606i = new ArrayList();
                }
                this.f27606i.add(new Pair<>(hVar, executor));
                return;
            }
            tVar.m12113t(executor, hVar);
        }
    }

    @Override
    public Integer mo5776c() {
        Integer num = (Integer) this.f27599b.m10951a(CameraCharacteristics.LENS_FACING);
        C1132h.m38325e(num);
        int intValue = num.intValue();
        if (intValue != 0) {
            return intValue != 1 ? null : 1;
        }
        return 0;
    }

    @Override
    public String mo12262d() {
        return m12256l() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override
    public int mo12261e(int i) {
        Integer valueOf = Integer.valueOf(m12257k());
        int b = C11179b.m1313b(i);
        Integer c = mo5776c();
        boolean z = true;
        if (c == null || 1 != c.intValue()) {
            z = false;
        }
        return C11179b.m1314a(b, valueOf.intValue(), z);
    }

    @Override
    public boolean mo12260f() {
        Boolean bool = (Boolean) this.f27599b.m10951a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        C1132h.m38325e(bool);
        return bool.booleanValue();
    }

    @Override
    public void mo5775g(AbstractC10234h hVar) {
        synchronized (this.f27601d) {
            C8564t tVar = this.f27602e;
            if (tVar == null) {
                List<Pair<AbstractC10234h, Executor>> list = this.f27606i;
                if (list != null) {
                    Iterator<Pair<AbstractC10234h, Executor>> it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next().first == hVar) {
                            it.remove();
                        }
                    }
                    return;
                }
                return;
            }
            tVar.m12134W(hVar);
        }
    }

    @Override
    public C10317x1 mo5774h() {
        return this.f27607j;
    }

    @Override
    public LiveData<AbstractC0620m3> mo12259i() {
        synchronized (this.f27601d) {
            C8564t tVar = this.f27602e;
            if (tVar == null) {
                if (this.f27604g == null) {
                    this.f27604g = new C8506a<>(C8453c3.m12431e(this.f27599b));
                }
                return this.f27604g;
            }
            C8506a<AbstractC0620m3> aVar = this.f27604g;
            if (aVar != null) {
                return aVar;
            }
            return tVar.m12151F().m12430f();
        }
    }

    public C8927z m12258j() {
        return this.f27599b;
    }

    public int m12257k() {
        Integer num = (Integer) this.f27599b.m10951a(CameraCharacteristics.SENSOR_ORIENTATION);
        C1132h.m38325e(num);
        return num.intValue();
    }

    public int m12256l() {
        Integer num = (Integer) this.f27599b.m10951a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        C1132h.m38325e(num);
        return num.intValue();
    }

    public void m12255m(C8564t tVar) {
        synchronized (this.f27601d) {
            this.f27602e = tVar;
            C8506a<AbstractC0620m3> aVar = this.f27604g;
            if (aVar != null) {
                aVar.m12249p(tVar.m12151F().m12430f());
            }
            C8506a<Integer> aVar2 = this.f27603f;
            if (aVar2 != null) {
                aVar2.m12249p(this.f27602e.m12153D().m11997f());
            }
            List<Pair<AbstractC10234h, Executor>> list = this.f27606i;
            if (list != null) {
                for (Pair<AbstractC10234h, Executor> pair : list) {
                    this.f27602e.m12113t((Executor) pair.second, (AbstractC10234h) pair.first);
                }
                this.f27606i = null;
            }
        }
        m12254n();
    }

    public final void m12254n() {
        m12253o();
    }

    public final void m12253o() {
        String str;
        int l = m12256l();
        if (l == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (l == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (l == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (l == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (l != 4) {
            str = "Unknown value: " + l;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        C0662u1.m40652e("Camera2CameraInfo", "Device Level: " + str);
    }

    public void m12252p(LiveData<AbstractC0658u> liveData) {
        this.f27605h.m12249p(liveData);
    }
}

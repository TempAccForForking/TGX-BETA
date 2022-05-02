package gd;

import org.drinkless.p210td.libcore.telegram.TdApi;
import p156kd.C6246h;
import p168ld.C6503j;
import p350yd.C10930q6;

public class C4623e3 {
    public TdApi.Animation f15343a;
    public C6503j f15344b;
    public C6246h f15345c;

    public C4623e3(C10930q6 q6Var, TdApi.Animation animation) {
        this.f15343a = animation;
        C6246h D5 = C4779t2.m25705D5(q6Var, animation.thumbnail);
        this.f15345c = D5;
        if (D5 != null) {
            D5.m20898s0(2);
            this.f15345c.m20918g0(false);
        }
        C6503j jVar = new C6503j(q6Var, animation);
        this.f15344b = jVar;
        jVar.m20298I(2);
    }

    public TdApi.Animation m26842a() {
        return this.f15343a;
    }

    public C6503j m26841b() {
        return this.f15344b;
    }

    public int m26840c() {
        return this.f15343a.animation.f25376id;
    }

    public C6246h m26839d() {
        return this.f15345c;
    }

    public int m26838e() {
        TdApi.Animation animation = this.f15343a;
        int i = animation.height;
        if (i != 0) {
            return i;
        }
        TdApi.Thumbnail thumbnail = animation.thumbnail;
        if (thumbnail != null) {
            return thumbnail.height;
        }
        return 0;
    }

    public int m26837f() {
        TdApi.Animation animation = this.f15343a;
        int i = animation.width;
        if (i != 0) {
            return i;
        }
        TdApi.Thumbnail thumbnail = animation.thumbnail;
        if (thumbnail != null) {
            return thumbnail.width;
        }
        return 0;
    }
}

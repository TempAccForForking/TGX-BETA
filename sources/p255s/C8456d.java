package p255s;

import androidx.camera.core.C0662u1;
import p266t.C8927z;
import p293v.C9810e;
import p293v.C9812g;
import p306w.C9925c;
import p336y.AbstractC10227g;

public class C8456d implements AbstractC10227g {
    public final boolean f27440a;
    public final int f27441b;
    public final C9925c f27442c;

    public C8456d(String str, C8927z zVar) {
        boolean z;
        int i;
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            C0662u1.m40646k("Camera2CamcorderProfileProvider", "Camera id is not an integer: " + str + ", unable to create CamcorderProfileProvider");
            z = false;
            i = -1;
        }
        this.f27440a = z;
        this.f27441b = i;
        this.f27442c = new C9925c((C9810e) C9812g.m6819a(str, zVar).m5479b(C9810e.class));
    }
}

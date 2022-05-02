package p215p2;

import android.content.ComponentName;
import android.content.Context;
import p071f2.AbstractC4234j;

public class C8000e {
    public static final String f26053a = AbstractC4234j.m28362f("PackageManagerHelper");

    public static void m13803a(Context context, Class<?> cls, boolean z) {
        String str = "enabled";
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            AbstractC4234j c = AbstractC4234j.m28364c();
            String str2 = f26053a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z ? str : "disabled";
            c.mo28361a(str2, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e) {
            AbstractC4234j c2 = AbstractC4234j.m28364c();
            String str3 = f26053a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z) {
                str = "disabled";
            }
            objArr2[1] = str;
            c2.mo28361a(str3, String.format("%s could not be %s", objArr2), e);
        }
    }
}

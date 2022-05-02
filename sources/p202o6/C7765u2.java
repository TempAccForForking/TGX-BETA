package p202o6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import p233q6.C8260d;
import p262s6.C8646a;

public final class C7765u2 {
    public static final C8646a f24865d = new C8646a("PackMetadataManager");
    public final C7688f0 f24866a;
    public final C7775w2 f24867b;
    public final C8260d f24868c;

    public C7765u2(C7688f0 f0Var, C7775w2 w2Var, C8260d dVar) {
        this.f24866a = f0Var;
        this.f24867b = w2Var;
        this.f24868c = dVar;
    }

    public final String m15114a(String str) {
        if (this.f24868c.m13017a("assetOnlyUpdates") && this.f24866a.m15246f(str)) {
            int a = this.f24867b.m15109a();
            C7688f0 f0Var = this.f24866a;
            File x = f0Var.m15228x(str, a, f0Var.m15234r(str));
            try {
                if (!x.exists()) {
                    return String.valueOf(a);
                }
                FileInputStream fileInputStream = new FileInputStream(x);
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                String property = properties.getProperty("moduleVersionTag");
                return property == null ? String.valueOf(a) : property;
            } catch (IOException unused) {
                f24865d.m11816b("Failed to read pack version tag for pack %s", str);
            }
        }
        return "";
    }

    public final void m15113b(String str, int i, long j, String str2) {
        if (str2 == null || str2.isEmpty()) {
            str2 = String.valueOf(i);
        }
        Properties properties = new Properties();
        properties.put("moduleVersionTag", str2);
        File x = this.f24866a.m15228x(str, i, j);
        x.getParentFile().mkdirs();
        x.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(x);
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}

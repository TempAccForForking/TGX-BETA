package qa;

import p332xa.AbstractC10169b;
import p332xa.AbstractC10170c;
import p332xa.AbstractC10171d;
import p332xa.AbstractC10172e;

public class C8308u {
    public AbstractC10171d m12915a(C8296i iVar) {
        return iVar;
    }

    public AbstractC10169b m12914b(Class cls) {
        return new C8291e(cls);
    }

    public AbstractC10170c m12913c(Class cls, String str) {
        return new C8303p(cls, str);
    }

    public AbstractC10172e m12912d(AbstractC8300m mVar) {
        return mVar;
    }

    public String m12911e(AbstractC8295h hVar) {
        String obj = hVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String m12910f(AbstractC8299l lVar) {
        return m12911e(lVar);
    }
}

package p337y0;

import android.os.LocaleList;
import java.util.Locale;

public final class C10338j implements AbstractC10337i {
    public final LocaleList f33203a;

    public C10338j(LocaleList localeList) {
        this.f33203a = localeList;
    }

    @Override
    public Object mo5399a() {
        return this.f33203a;
    }

    public boolean equals(Object obj) {
        return this.f33203a.equals(((AbstractC10337i) obj).mo5399a());
    }

    @Override
    public Locale get(int i) {
        return this.f33203a.get(i);
    }

    public int hashCode() {
        return this.f33203a.hashCode();
    }

    @Override
    public int size() {
        return this.f33203a.size();
    }

    public String toString() {
        return this.f33203a.toString();
    }
}

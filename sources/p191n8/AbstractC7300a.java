package p191n8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p264s8.AbstractC8693b;

public abstract class AbstractC7300a implements AbstractC7307g {
    public String f23177a;
    public List<C7303c> f23178b = new ArrayList();
    public Map<AbstractC8693b, long[]> f23179c = new HashMap();

    public AbstractC7300a(String str) {
        this.f23177a = str;
    }

    @Override
    public String mo17091b() {
        return this.f23177a;
    }

    @Override
    public long mo17090g() {
        long j = 0;
        for (long j2 : mo12957R()) {
            j += j2;
        }
        return j;
    }

    @Override
    public List<C7303c> mo17089i() {
        return this.f23178b;
    }

    @Override
    public Map<AbstractC8693b, long[]> mo17088x() {
        return this.f23179c;
    }
}

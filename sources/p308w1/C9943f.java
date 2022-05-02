package p308w1;

import android.database.Cursor;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p323x1.AbstractC10066b;

public class C9943f {
    public final String f32320a;
    public final Map<String, C9944a> f32321b;
    public final Set<C9945b> f32322c;
    public final Set<C9947d> f32323d;

    public static class C9944a {
        public final String f32324a;
        public final String f32325b;
        public final int f32326c;
        public final boolean f32327d;
        public final int f32328e;
        public final String f32329f;
        public final int f32330g;

        public C9944a(String str, String str2, boolean z, int i, String str3, int i2) {
            this.f32324a = str;
            this.f32325b = str2;
            this.f32327d = z;
            this.f32328e = i;
            this.f32326c = m6443a(str2);
            this.f32329f = str3;
            this.f32330g = i2;
        }

        public static int m6443a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean m6442b() {
            return this.f32328e > 0;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C9944a aVar = (C9944a) obj;
            if (Build.VERSION.SDK_INT >= 20) {
                if (this.f32328e != aVar.f32328e) {
                    return false;
                }
            } else if (m6442b() != aVar.m6442b()) {
                return false;
            }
            if (!this.f32324a.equals(aVar.f32324a) || this.f32327d != aVar.f32327d) {
                return false;
            }
            if (this.f32330g == 1 && aVar.f32330g == 2 && (str3 = this.f32329f) != null && !str3.equals(aVar.f32329f)) {
                return false;
            }
            if (this.f32330g == 2 && aVar.f32330g == 1 && (str2 = aVar.f32329f) != null && !str2.equals(this.f32329f)) {
                return false;
            }
            int i = this.f32330g;
            return (i == 0 || i != aVar.f32330g || ((str = this.f32329f) == null ? aVar.f32329f == null : str.equals(aVar.f32329f))) && this.f32326c == aVar.f32326c;
        }

        public int hashCode() {
            return (((((this.f32324a.hashCode() * 31) + this.f32326c) * 31) + (this.f32327d ? 1231 : 1237)) * 31) + this.f32328e;
        }

        public String toString() {
            return "Column{name='" + this.f32324a + "', type='" + this.f32325b + "', affinity='" + this.f32326c + "', notNull=" + this.f32327d + ", primaryKeyPosition=" + this.f32328e + ", defaultValue='" + this.f32329f + "'}";
        }
    }

    public static class C9945b {
        public final String f32331a;
        public final String f32332b;
        public final String f32333c;
        public final List<String> f32334d;
        public final List<String> f32335e;

        public C9945b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f32331a = str;
            this.f32332b = str2;
            this.f32333c = str3;
            this.f32334d = Collections.unmodifiableList(list);
            this.f32335e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C9945b bVar = (C9945b) obj;
            if (this.f32331a.equals(bVar.f32331a) && this.f32332b.equals(bVar.f32332b) && this.f32333c.equals(bVar.f32333c) && this.f32334d.equals(bVar.f32334d)) {
                return this.f32335e.equals(bVar.f32335e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f32331a.hashCode() * 31) + this.f32332b.hashCode()) * 31) + this.f32333c.hashCode()) * 31) + this.f32334d.hashCode()) * 31) + this.f32335e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f32331a + "', onDelete='" + this.f32332b + "', onUpdate='" + this.f32333c + "', columnNames=" + this.f32334d + ", referenceColumnNames=" + this.f32335e + '}';
        }
    }

    public static class C9946c implements Comparable<C9946c> {
        public final String f32336M;
        public final int f32337a;
        public final int f32338b;
        public final String f32339c;

        public C9946c(int i, int i2, String str, String str2) {
            this.f32337a = i;
            this.f32338b = i2;
            this.f32339c = str;
            this.f32336M = str2;
        }

        public int compareTo(C9946c cVar) {
            int i = this.f32337a - cVar.f32337a;
            return i == 0 ? this.f32338b - cVar.f32338b : i;
        }
    }

    public static class C9947d {
        public final String f32340a;
        public final boolean f32341b;
        public final List<String> f32342c;

        public C9947d(String str, boolean z, List<String> list) {
            this.f32340a = str;
            this.f32341b = z;
            this.f32342c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C9947d dVar = (C9947d) obj;
            if (this.f32341b != dVar.f32341b || !this.f32342c.equals(dVar.f32342c)) {
                return false;
            }
            if (this.f32340a.startsWith("index_")) {
                return dVar.f32340a.startsWith("index_");
            }
            return this.f32340a.equals(dVar.f32340a);
        }

        public int hashCode() {
            return ((((this.f32340a.startsWith("index_") ? -1184239155 : this.f32340a.hashCode()) * 31) + (this.f32341b ? 1 : 0)) * 31) + this.f32342c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f32340a + "', unique=" + this.f32341b + ", columns=" + this.f32342c + '}';
        }
    }

    public C9943f(String str, Map<String, C9944a> map, Set<C9945b> set, Set<C9947d> set2) {
        this.f32320a = str;
        this.f32321b = Collections.unmodifiableMap(map);
        this.f32322c = Collections.unmodifiableSet(set);
        this.f32323d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static C9943f m6449a(AbstractC10066b bVar, String str) {
        return new C9943f(str, m6448b(bVar, str), m6446d(bVar, str), m6444f(bVar, str));
    }

    public static Map<String, C9944a> m6448b(AbstractC10066b bVar, String str) {
        Cursor S = bVar.mo5393S("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (S.getColumnCount() > 0) {
                int columnIndex = S.getColumnIndex("name");
                int columnIndex2 = S.getColumnIndex("type");
                int columnIndex3 = S.getColumnIndex("notnull");
                int columnIndex4 = S.getColumnIndex("pk");
                int columnIndex5 = S.getColumnIndex("dflt_value");
                while (S.moveToNext()) {
                    String string = S.getString(columnIndex);
                    hashMap.put(string, new C9944a(string, S.getString(columnIndex2), S.getInt(columnIndex3) != 0, S.getInt(columnIndex4), S.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            S.close();
        }
    }

    public static List<C9946c> m6447c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C9946c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static Set<C9945b> m6446d(AbstractC10066b bVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor S = bVar.mo5393S("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = S.getColumnIndex("id");
            int columnIndex2 = S.getColumnIndex("seq");
            int columnIndex3 = S.getColumnIndex("table");
            int columnIndex4 = S.getColumnIndex("on_delete");
            int columnIndex5 = S.getColumnIndex("on_update");
            List<C9946c> c = m6447c(S);
            int count = S.getCount();
            for (int i = 0; i < count; i++) {
                S.moveToPosition(i);
                if (S.getInt(columnIndex2) == 0) {
                    int i2 = S.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (C9946c cVar : c) {
                        if (cVar.f32337a == i2) {
                            arrayList.add(cVar.f32339c);
                            arrayList2.add(cVar.f32336M);
                        }
                    }
                    hashSet.add(new C9945b(S.getString(columnIndex3), S.getString(columnIndex4), S.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            S.close();
        }
    }

    public static C9947d m6445e(AbstractC10066b bVar, String str, boolean z) {
        Cursor S = bVar.mo5393S("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = S.getColumnIndex("seqno");
            int columnIndex2 = S.getColumnIndex("cid");
            int columnIndex3 = S.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1)) {
                TreeMap treeMap = new TreeMap();
                while (S.moveToNext()) {
                    if (S.getInt(columnIndex2) >= 0) {
                        int i = S.getInt(columnIndex);
                        treeMap.put(Integer.valueOf(i), S.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new C9947d(str, z, arrayList);
            }
            return null;
        } finally {
            S.close();
        }
    }

    public static Set<C9947d> m6444f(AbstractC10066b bVar, String str) {
        Cursor S = bVar.mo5393S("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = S.getColumnIndex("name");
            int columnIndex2 = S.getColumnIndex("origin");
            int columnIndex3 = S.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1)) {
                HashSet hashSet = new HashSet();
                while (S.moveToNext()) {
                    if ("c".equals(S.getString(columnIndex2))) {
                        String string = S.getString(columnIndex);
                        boolean z = true;
                        if (S.getInt(columnIndex3) != 1) {
                            z = false;
                        }
                        C9947d e = m6445e(bVar, string, z);
                        if (e == null) {
                            return null;
                        }
                        hashSet.add(e);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            S.close();
        }
    }

    public boolean equals(Object obj) {
        Set<C9947d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9943f fVar = (C9943f) obj;
        String str = this.f32320a;
        if (str == null ? fVar.f32320a != null : !str.equals(fVar.f32320a)) {
            return false;
        }
        Map<String, C9944a> map = this.f32321b;
        if (map == null ? fVar.f32321b != null : !map.equals(fVar.f32321b)) {
            return false;
        }
        Set<C9945b> set2 = this.f32322c;
        if (set2 == null ? fVar.f32322c != null : !set2.equals(fVar.f32322c)) {
            return false;
        }
        Set<C9947d> set3 = this.f32323d;
        if (set3 == null || (set = fVar.f32323d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f32320a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, C9944a> map = this.f32321b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<C9945b> set = this.f32322c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "TableInfo{name='" + this.f32320a + "', columns=" + this.f32321b + ", foreignKeys=" + this.f32322c + ", indices=" + this.f32323d + '}';
    }
}
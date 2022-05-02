package p046d6;

public final class C3669f4 {
    public static int m29839a(int i, int i2, String str) {
        String str2;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            str2 = C3680g5.m29831a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append("negative size: ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        } else {
            str2 = C3680g5.m29831a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(str2);
    }

    public static int m29838b(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m29836d(i, i2, "index"));
    }

    public static void m29837c(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = m29836d(i, i3, "start index");
            } else {
                str = (i2 < 0 || i2 > i3) ? m29836d(i2, i3, "end index") : C3680g5.m29831a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static String m29836d(int i, int i2, String str) {
        if (i < 0) {
            return C3680g5.m29831a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C3680g5.m29831a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i2);
        throw new IllegalArgumentException(sb2.toString());
    }
}
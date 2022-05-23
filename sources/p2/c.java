package p2;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import o2.d;
import x1.b;

public class c {
    public final WorkDatabase f20410a;

    public c(WorkDatabase workDatabase) {
        this.f20410a = workDatabase;
    }

    public static void a(Context context, b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i10 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i11 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            bVar.e();
            try {
                bVar.N("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                bVar.N("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                sharedPreferences.edit().clear().apply();
                bVar.L();
            } finally {
                bVar.W();
            }
        }
    }

    public int b() {
        int c10;
        synchronized (c.class) {
            c10 = c("next_alarm_manager_id");
        }
        return c10;
    }

    public final int c(String str) {
        this.f20410a.c();
        try {
            Long b10 = this.f20410a.z().b(str);
            int i10 = 0;
            int intValue = b10 != null ? b10.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i10 = intValue + 1;
            }
            e(str, i10);
            this.f20410a.t();
            return intValue;
        } finally {
            this.f20410a.g();
        }
    }

    public int d(int i10, int i11) {
        synchronized (c.class) {
            int c10 = c("next_job_scheduler_id");
            if (c10 >= i10 && c10 <= i11) {
                i10 = c10;
            }
            e("next_job_scheduler_id", i10 + 1);
        }
        return i10;
    }

    public final void e(String str, int i10) {
        this.f20410a.z().a(new d(str, i10));
    }
}

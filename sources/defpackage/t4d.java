package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class t4d extends xs9 {
    public final Context c;

    public t4d(Context context, int i, int i2) {
        super(i, i2);
        this.c = context;
    }

    @Override // defpackage.xs9
    public final void a(sze szeVar) {
        szeVar.getClass();
        if (this.b >= 10) {
            szeVar.c1(new Object[]{"reschedule_needed", 1});
        } else {
            this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}

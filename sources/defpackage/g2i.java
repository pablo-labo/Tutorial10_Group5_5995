package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.measurement.internal.zzn;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class g2i implements Runnable {
    public final /* synthetic */ zzn a;
    public final /* synthetic */ h1i b;

    public g2i(h1i h1iVar, zzn zznVar) {
        this.b = h1iVar;
        this.a = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fei feiVar = this.b.a;
        feiVar.F();
        if (feiVar.j0 != null) {
            ArrayList arrayList = new ArrayList();
            feiVar.k0 = arrayList;
            arrayList.addAll(feiVar.j0);
        }
        wgh wghVarZ = feiVar.z();
        zzn zznVar = this.a;
        String str = zznVar.a;
        fib.f(str);
        wghVarZ.b();
        wghVarZ.g();
        try {
            SQLiteDatabase sQLiteDatabaseM = wghVarZ.m();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseM.delete("apps", "app_id=?", strArr) + sQLiteDatabaseM.delete("events", "app_id=?", strArr) + sQLiteDatabaseM.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseM.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseM.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseM.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseM.delete("queue", "app_id=?", strArr) + sQLiteDatabaseM.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseM.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseM.delete("default_event_params", "app_id=?", strArr);
            if (iDelete > 0) {
                wghVarZ.zzr().c0.c("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e) {
            wghVarZ.zzr().f.c("Error resetting analytics data. appId, error", ewh.l(str), e);
        }
        if (zznVar.W) {
            feiVar.s(zznVar);
        }
    }
}

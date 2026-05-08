package defpackage;

import android.util.Log;
import defpackage.z9e;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class x23 implements z9e {
    public final ce3 a;
    public final w23 b;

    public x23(ce3 ce3Var, oa5 oa5Var) {
        this.a = ce3Var;
        this.b = new w23(oa5Var);
    }

    @Override // defpackage.z9e
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.z9e
    public final void b(z9e.b bVar) {
        String str = "App Quality Sessions session changed: " + bVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        w23 w23Var = this.b;
        String str2 = bVar.a;
        synchronized (w23Var) {
            if (!Objects.equals(w23Var.c, str2)) {
                w23.a(w23Var.a, w23Var.b, str2);
                w23Var.c = str2;
            }
        }
    }

    public final void c(String str) {
        w23 w23Var = this.b;
        synchronized (w23Var) {
            if (!Objects.equals(w23Var.b, str)) {
                w23.a(w23Var.a, str, w23Var.c);
                w23Var.b = str;
            }
        }
    }
}

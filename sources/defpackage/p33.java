package defpackage;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class p33 implements Callable<Boolean> {
    public final /* synthetic */ q33 a;

    public p33(q33 q33Var) {
        this.a = q33Var;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() {
        g33 g33Var = this.a.g;
        r33 r33Var = g33Var.c;
        oa5 oa5Var = (oa5) r33Var.b;
        String str = (String) r33Var.a;
        oa5Var.getClass();
        boolean z = true;
        if (new File(oa5Var.b, str).exists()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
            }
            oa5 oa5Var2 = (oa5) r33Var.b;
            oa5Var2.getClass();
            new File(oa5Var2.b, str).delete();
        } else {
            String strE = g33Var.e();
            if (strE == null || !g33Var.j.d(strE)) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}

package defpackage;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class o33 implements Callable<Boolean> {
    public final /* synthetic */ q33 a;

    public o33(q33 q33Var) {
        this.a = q33Var;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() {
        try {
            r33 r33Var = this.a.e;
            oa5 oa5Var = (oa5) r33Var.b;
            String str = (String) r33Var.a;
            oa5Var.getClass();
            boolean zDelete = new File(oa5Var.b, str).delete();
            if (!zDelete) {
                Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
            }
            return Boolean.valueOf(zDelete);
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
            return Boolean.FALSE;
        }
    }
}

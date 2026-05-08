package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class x14 implements ntc {
    public final Context a;
    public final q81 b;
    public final int c;

    public x14(Context context, q81 q81Var) {
        int i;
        this.a = context;
        this.b = q81Var;
        synchronized (q81Var) {
            i = q81Var.b;
        }
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ntc
    public final boolean b(UnsatisfiedLinkError unsatisfiedLinkError, ene[] eneVarArr) {
        int i;
        q81 q81Var = this.b;
        Context context = this.a;
        String str = context.getApplicationInfo().sourceDir;
        if (new File(str).exists() && q81Var.a(str)) {
            for (int i2 = 0; i2 < eneVarArr.length; i2++) {
                Object[] objArr = eneVarArr[i2];
                if (objArr instanceof mtc) {
                    eneVarArr[i2] = ((mtc) objArr).b(context);
                }
            }
            return true;
        }
        int i3 = this.c;
        synchronized (q81Var) {
            i = q81Var.b;
        }
        if (i3 == i) {
            return false;
        }
        Log.w("soloader.recovery.DetectDataAppMove", "Context was updated (perhaps by another thread)");
        return true;
    }
}

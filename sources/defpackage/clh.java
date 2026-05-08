package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class clh implements Runnable {
    public final /* synthetic */ nv8 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ yoh c;

    public clh(yoh yohVar, nv8 nv8Var, String str) {
        this.a = nv8Var;
        this.b = str;
        this.c = yohVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yoh yohVar = this.c;
        int i = yohVar.b;
        nv8 nv8Var = this.a;
        if (i > 0) {
            Bundle bundle = yohVar.c;
            nv8Var.onCreate(bundle != null ? bundle.getBundle(this.b) : null);
        }
        if (yohVar.b >= 2) {
            nv8Var.onStart();
        }
        if (yohVar.b >= 3) {
            nv8Var.onResume();
        }
        if (yohVar.b >= 4) {
            nv8Var.onStop();
        }
        if (yohVar.b >= 5) {
            nv8Var.onDestroy();
        }
    }
}

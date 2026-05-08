package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import defpackage.j4d;
import defpackage.xhe;

/* JADX INFO: loaded from: classes.dex */
public final class lm3 implements fp2 {
    public final Context a;
    public final j4d.b b;

    public lm3(Context context, j4d.b bVar) {
        this.a = context.getApplicationContext();
        this.b = bVar;
    }

    @Override // defpackage.xv8
    public final void f() {
        xhe xheVarA = xhe.a(this.a);
        j4d.b bVar = this.b;
        synchronized (xheVarA) {
            xheVarA.b.add(bVar);
            xheVarA.b();
        }
    }

    @Override // defpackage.xv8
    public final void onDestroy() {
    }

    @Override // defpackage.xv8
    public final void onStop() {
        xhe xheVarA = xhe.a(this.a);
        j4d.b bVar = this.b;
        synchronized (xheVarA) {
            xheVarA.b.remove(bVar);
            if (xheVarA.c && xheVarA.b.isEmpty()) {
                xhe.c cVar = xheVarA.a;
                ((ConnectivityManager) cVar.c.get()).unregisterNetworkCallback(cVar.d);
                xheVarA.c = false;
            }
        }
    }
}

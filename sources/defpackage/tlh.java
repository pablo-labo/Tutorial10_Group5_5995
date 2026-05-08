package defpackage;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class tlh extends Binder {
    public final ke0 a;

    public tlh(ke0 ke0Var) {
        this.a = ke0Var;
    }

    public final void a(amh amhVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "service received new intent via bind strategy");
        }
        ((ywh) this.a.a).d(amhVar.a).addOnCompleteListener(r0i.a, new aza(amhVar));
    }
}

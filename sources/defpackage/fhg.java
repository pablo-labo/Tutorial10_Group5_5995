package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fhg implements Runnable {
    public final /* synthetic */ ihg a;
    public final /* synthetic */ v31 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ fhg(ihg ihgVar, v31 v31Var, int i, Runnable runnable) {
        this.a = ihgVar;
        this.b = v31Var;
        this.c = i;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v31 v31Var = this.b;
        int i = this.c;
        Runnable runnable = this.d;
        ihg ihgVar = this.a;
        c2f c2fVar = ihgVar.f;
        try {
            try {
                q05 q05Var = ihgVar.c;
                Objects.requireNonNull(q05Var);
                c2fVar.h(new tf2(q05Var, 8));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ihgVar.a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    c2fVar.h(new uj9(ihgVar, v31Var, i));
                } else {
                    ihgVar.a(v31Var, i);
                }
                runnable.run();
            } catch (SynchronizationException unused) {
                ihgVar.d.a(v31Var, i + 1);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}

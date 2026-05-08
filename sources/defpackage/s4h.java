package defpackage;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.work.c;
import defpackage.z39;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class s4h implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ t4h b;

    public s4h(t4h t4hVar, String str) {
        this.b = t4hVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"SyntheticAccessor"})
    public final void run() {
        String str = this.a;
        t4h t4hVar = this.b;
        r3h r3hVar = t4hVar.e;
        try {
            try {
                c.a aVar = t4hVar.f0.get();
                if (aVar == null) {
                    z39.d().b(t4h.h0, r3hVar.c + " returned a null result. Treating it as a failure.");
                } else {
                    z39.d().a(t4h.h0, r3hVar.c + " returned a " + aVar + ".");
                    t4hVar.W = aVar;
                }
                t4hVar.b();
            } catch (InterruptedException e) {
                e = e;
                z39.d().c(t4h.h0, str + " failed because it threw an exception/error", e);
                t4hVar.b();
            } catch (CancellationException e2) {
                z39 z39VarD = z39.d();
                String str2 = t4h.h0;
                String str3 = str + " was cancelled";
                if (((z39.a) z39VarD).c <= 4) {
                    Log.i(str2, str3, e2);
                }
                t4hVar.b();
            } catch (ExecutionException e3) {
                e = e3;
                z39.d().c(t4h.h0, str + " failed because it threw an exception/error", e);
                t4hVar.b();
            }
        } catch (Throwable th) {
            t4hVar.b();
            throw th;
        }
    }
}

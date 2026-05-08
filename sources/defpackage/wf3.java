package defpackage;

import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.x;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.ndk.internal.DatadogNdkCrashHandler;
import com.datadog.android.ndk.internal.NdkCrashHandler;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wf3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wf3(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                DatadogNdkCrashHandler.handleNdkCrash$lambda$1((DatadogNdkCrashHandler) obj3, (FeatureSdkCore) obj2, (NdkCrashHandler.ReportTarget) obj);
                break;
            case 1:
                s sVar = (s) obj3;
                x.d dVar = (x.d) obj2;
                r.e eVar = (r.e) obj;
                if (!sVar.k()) {
                    dVar.a(sVar.t, eVar);
                }
                break;
            default:
                ebe ebeVar = (ebe) obj2;
                try {
                    try {
                        ebeVar.n(((wu0) obj).apply(aw5.J1((hz8) obj3)));
                    } catch (Throwable th) {
                        ebeVar.m(th);
                        return;
                    }
                } catch (Error e) {
                    e = e;
                    ebeVar.m(e);
                    return;
                } catch (CancellationException unused) {
                    ebeVar.cancel(false);
                } catch (RuntimeException e2) {
                    e = e2;
                    ebeVar.m(e);
                    return;
                } catch (ExecutionException e3) {
                    e = e3;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    ebeVar.m(e);
                    return;
                }
                break;
        }
    }
}

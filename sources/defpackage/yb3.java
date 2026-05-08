package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import androidx.media3.exoplayer.hls.playlist.a;
import androidx.media3.session.j;
import androidx.media3.session.q;
import androidx.media3.session.q.b;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.v;
import androidx.media3.session.v.b;
import androidx.media3.session.x;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yb3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yb3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                zb3 zb3Var = (zb3) obj2;
                Runnable runnable = (Runnable) obj;
                Process.setThreadPriority(zb3Var.c);
                StrictMode.ThreadPolicy threadPolicy = zb3Var.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                break;
            case 1:
                a.b bVar = (a.b) obj2;
                bVar.X = false;
                bVar.d((Uri) obj);
                break;
            case 2:
                iq4 iq4Var = (iq4) obj2;
                iq4Var.getClass();
                AtomicBoolean atomicBoolean = iq4Var.c;
                p05 p05Var = iq4Var.m;
                p05Var.c((rqf) obj);
                if (p05Var.size() >= iq4Var.u.a() && atomicBoolean.compareAndSet(false, true)) {
                    try {
                        p05Var.b(iq4Var.D, iq4Var.E);
                        iq4Var.a(iq4Var.y.get());
                    } catch (Throwable th) {
                        atomicBoolean.set(false);
                        c49.b(iq4Var.a, "Received error during emission process: %s", th);
                        return;
                    }
                    break;
                }
                break;
            case 3:
                ((s) obj2).g.m1((r.d) obj, Integer.MIN_VALUE, 7, x.o1(new s40()));
                break;
            default:
                v vVar = (v) obj2;
                r rVar = (r) obj;
                s sVar = rVar.a;
                q qVarA = vVar.a();
                v vVar2 = qVarA.a;
                HashMap map = qVarA.V;
                if (!map.containsKey(rVar)) {
                    q.b bVar2 = qVarA.new b(vVar2, rVar);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("androidx.media3.session.MediaNotificationManager", true);
                    aae aaeVar = sVar.j;
                    aaeVar.getClass();
                    Bundle bundle2 = Bundle.EMPTY;
                    String str = vjg.a;
                    if (Looper.myLooper() == null) {
                        Looper.getMainLooper();
                    }
                    Bundle bundle3 = new Bundle(bundle);
                    Looper mainLooper = Looper.getMainLooper();
                    mainLooper.getClass();
                    sg9 sg9Var = new sg9(mainLooper);
                    vjg.T(new Handler(mainLooper), new ky0(2, sg9Var, new j(vVar2, aaeVar, bundle3, bVar2, mainLooper, sg9Var, aaeVar.a.g() ? new ws1(new androidx.media3.datasource.b(vVar2)) : null)));
                    map.put(rVar, new q.a(sg9Var));
                    sg9Var.a(new j37(qVarA, sg9Var, bVar2, rVar, 1), qVarA.e);
                }
                sVar.v = vVar.new b();
                break;
        }
    }
}

package defpackage;

import android.os.Looper;
import android.os.Process;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.j;
import androidx.media3.session.j;
import androidx.media3.session.l;
import androidx.media3.session.q;
import com.datadog.android.rum.internal.monitor.DatadogRumMonitor;
import com.facebook.react.devsupport.LogBoxModule;
import com.indeed.android.jobsearch.LaunchActivity;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zf3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zf3(dh6 dh6Var, int i) {
        this.a = 3;
        this.b = dh6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                DatadogRumMonitor.keepAliveRunnable$lambda$0((DatadogRumMonitor) obj);
                return;
            case 1:
                i34 i34Var = (i34) obj;
                i34Var.g.b.edit().putBoolean("inspector_debug", !r0.b.getBoolean("inspector_debug", false)).apply();
                i34Var.b.b();
                return;
            case 2:
                j jVar = (j) obj;
                try {
                    synchronized (jVar) {
                    }
                    try {
                        jVar.a.m(jVar.c, jVar.d);
                        jVar.a(true);
                        return;
                    } catch (Throwable th) {
                        jVar.a(true);
                        throw th;
                    }
                } catch (ExoPlaybackException e) {
                    zkd.x("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    l5.r(e);
                    return;
                }
            case 3:
                Iterator it = ((dh6) obj).a.iterator();
                while (it.hasNext()) {
                    ((eh6) it.next()).a();
                }
                return;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                int i2 = LaunchActivity.e1;
                ((pk3) pnb.B(launchActivity).a(null, fwc.a.b(pk3.class), null)).c.e(launchActivity, launchActivity.a1);
                return;
            case 5:
                LogBoxModule.show$lambda$0((LogBoxModule) obj);
                return;
            case 6:
                androidx.media3.session.j jVar2 = ((l) obj).b;
                jVar2.getClass();
                ka2.q(Looper.myLooper() == jVar2.e.getLooper());
                q.b bVar = jVar2.d;
                bVar.getClass();
                j.a.C();
                bVar.x();
                return;
            default:
                Runnable runnable = (Runnable) obj;
                try {
                    Process.setThreadPriority(10);
                    break;
                } catch (Throwable unused) {
                }
                runnable.run();
                return;
        }
    }

    public /* synthetic */ zf3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj2;
    }

    public /* synthetic */ zf3(l lVar, l.c cVar) {
        this.a = 6;
        this.b = lVar;
    }

    public /* synthetic */ zf3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}

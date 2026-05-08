package defpackage;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.android.volley.VolleyError;
import defpackage.r15;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class tfa extends Thread {
    public final BlockingQueue<m3d<?>> a;
    public final gfa b;
    public final ts1 c;
    public final o6d d;
    public volatile boolean e = false;

    public tfa(PriorityBlockingQueue priorityBlockingQueue, gfa gfaVar, ts1 ts1Var, o6d o6dVar) {
        this.a = priorityBlockingQueue;
        this.b = gfaVar;
        this.c = ts1Var;
        this.d = o6dVar;
    }

    private void a() throws InterruptedException {
        m3d<?> m3dVarTake = this.a.take();
        o6d o6dVar = this.d;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        m3dVarTake.sendEvent(3);
        try {
            try {
                m3dVarTake.addMarker("network-queue-take");
                if (m3dVarTake.isCanceled()) {
                    m3dVarTake.finish("network-discard-cancelled");
                    m3dVarTake.notifyListenerResponseNotUsable();
                    return;
                }
                TrafficStats.setThreadStatsTag(m3dVarTake.getTrafficStatsTag());
                wga wgaVarA = ((qc1) this.b).a(m3dVarTake);
                m3dVarTake.addMarker("network-http-complete");
                if (wgaVarA.e && m3dVarTake.hasHadResponseDelivered()) {
                    m3dVarTake.finish("not-modified");
                    m3dVarTake.notifyListenerResponseNotUsable();
                    return;
                }
                l6d<?> networkResponse = m3dVarTake.parseNetworkResponse(wgaVarA);
                m3dVarTake.addMarker("network-parse-complete");
                if (m3dVarTake.shouldCache() && networkResponse.b != null) {
                    ((w54) this.c).f(m3dVarTake.getCacheKey(), networkResponse.b);
                    m3dVarTake.addMarker("network-cache-written");
                }
                m3dVarTake.markDelivered();
                ((r15) o6dVar).a(m3dVarTake, networkResponse, null);
                m3dVarTake.notifyListenerResponseReceived(networkResponse);
            } catch (VolleyError e) {
                e.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                VolleyError networkError = m3dVarTake.parseNetworkError(e);
                r15 r15Var = (r15) o6dVar;
                r15Var.getClass();
                m3dVarTake.addMarker("post-error");
                r15Var.a.execute(new r15.b(m3dVarTake, new l6d(networkError), null));
                m3dVarTake.notifyListenerResponseNotUsable();
            } catch (Exception e2) {
                Log.e("Volley", jtg.a("Unhandled exception %s", e2.toString()), e2);
                VolleyError volleyError = new VolleyError(e2);
                volleyError.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                r15 r15Var2 = (r15) o6dVar;
                r15Var2.getClass();
                m3dVarTake.addMarker("post-error");
                r15Var2.a.execute(new r15.b(m3dVarTake, new l6d(volleyError), null));
                m3dVarTake.notifyListenerResponseNotUsable();
            }
        } finally {
            m3dVarTake.sendEvent(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                jtg.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}

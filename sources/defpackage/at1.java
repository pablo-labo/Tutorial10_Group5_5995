package defpackage;

import android.os.Process;
import defpackage.ts1;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class at1 extends Thread {
    public static final boolean V = jtg.a;
    public final BlockingQueue<m3d<?>> a;
    public final BlockingQueue<m3d<?>> b;
    public final ts1 c;
    public final o6d d;
    public volatile boolean e = false;
    public final vtg f;

    public at1(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, ts1 ts1Var, o6d o6dVar) {
        this.a = priorityBlockingQueue;
        this.b = priorityBlockingQueue2;
        this.c = ts1Var;
        this.d = o6dVar;
        this.f = new vtg(this, priorityBlockingQueue2, o6dVar);
    }

    private void a() throws InterruptedException {
        m3d<?> m3dVarTake = this.a.take();
        m3dVarTake.addMarker("cache-queue-take");
        m3dVarTake.sendEvent(1);
        try {
            if (m3dVarTake.isCanceled()) {
                m3dVarTake.finish("cache-discard-canceled");
                return;
            }
            ts1.a aVarA = ((w54) this.c).a(m3dVarTake.getCacheKey());
            if (aVarA == null) {
                m3dVarTake.addMarker("cache-miss");
                if (!this.f.a(m3dVarTake)) {
                    this.b.put(m3dVarTake);
                }
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i = 0;
            if (aVarA.e < jCurrentTimeMillis) {
                m3dVarTake.addMarker("cache-hit-expired");
                m3dVarTake.setCacheEntry(aVarA);
                if (!this.f.a(m3dVarTake)) {
                    this.b.put(m3dVarTake);
                }
                return;
            }
            m3dVarTake.addMarker("cache-hit");
            l6d<?> networkResponse = m3dVarTake.parseNetworkResponse(new wga(aVarA.a, aVarA.g));
            m3dVarTake.addMarker("cache-hit-parsed");
            if (networkResponse.c == null) {
                if (aVarA.f < jCurrentTimeMillis) {
                    m3dVarTake.addMarker("cache-hit-refresh-needed");
                    m3dVarTake.setCacheEntry(aVarA);
                    networkResponse.d = true;
                    boolean zA = this.f.a(m3dVarTake);
                    o6d o6dVar = this.d;
                    if (zA) {
                        ((r15) o6dVar).a(m3dVarTake, networkResponse, null);
                    } else {
                        ((r15) o6dVar).a(m3dVarTake, networkResponse, new zs1(i, this, m3dVarTake));
                    }
                } else {
                    ((r15) this.d).a(m3dVarTake, networkResponse, null);
                }
                return;
            }
            m3dVarTake.addMarker("cache-parsing-failed");
            ts1 ts1Var = this.c;
            String cacheKey = m3dVarTake.getCacheKey();
            w54 w54Var = (w54) ts1Var;
            synchronized (w54Var) {
                ts1.a aVarA2 = w54Var.a(cacheKey);
                if (aVarA2 != null) {
                    aVarA2.f = 0L;
                    aVarA2.e = 0L;
                    w54Var.f(cacheKey, aVarA2);
                }
            }
            m3dVarTake.setCacheEntry(null);
            if (!this.f.a(m3dVarTake)) {
                this.b.put(m3dVarTake);
            }
        } finally {
            m3dVarTake.sendEvent(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (V) {
            jtg.d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        ((w54) this.c).d();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                jtg.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}

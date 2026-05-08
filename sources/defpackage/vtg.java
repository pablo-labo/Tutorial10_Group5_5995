package defpackage;

import defpackage.m3d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class vtg implements m3d.b {
    public final HashMap a = new HashMap();
    public final o6d b;
    public final at1 c;
    public final BlockingQueue<m3d<?>> d;

    public vtg(at1 at1Var, BlockingQueue<m3d<?>> blockingQueue, o6d o6dVar) {
        this.b = o6dVar;
        this.c = at1Var;
        this.d = blockingQueue;
    }

    public final synchronized boolean a(m3d<?> m3dVar) {
        try {
            String cacheKey = m3dVar.getCacheKey();
            boolean zContainsKey = this.a.containsKey(cacheKey);
            HashMap map = this.a;
            if (!zContainsKey) {
                map.put(cacheKey, null);
                m3dVar.setNetworkRequestCompleteListener(this);
                if (jtg.a) {
                    jtg.b("new request, sending to network %s", cacheKey);
                }
                return false;
            }
            List arrayList = (List) map.get(cacheKey);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            m3dVar.addMarker("waiting-for-response");
            arrayList.add(m3dVar);
            this.a.put(cacheKey, arrayList);
            if (jtg.a) {
                jtg.b("Request for cacheKey=%s is in flight, putting on hold.", cacheKey);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(m3d<?> m3dVar) {
        BlockingQueue<m3d<?>> blockingQueue;
        try {
            String cacheKey = m3dVar.getCacheKey();
            List list = (List) this.a.remove(cacheKey);
            if (list != null && !list.isEmpty()) {
                if (jtg.a) {
                    jtg.d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), cacheKey);
                }
                m3d<?> m3dVar2 = (m3d) list.remove(0);
                this.a.put(cacheKey, list);
                m3dVar2.setNetworkRequestCompleteListener(this);
                if (this.c != null && (blockingQueue = this.d) != null) {
                    try {
                        blockingQueue.put(m3dVar2);
                    } catch (InterruptedException e) {
                        jtg.c("Couldn't add request to queue. %s", e.toString());
                        Thread.currentThread().interrupt();
                        at1 at1Var = this.c;
                        at1Var.e = true;
                        at1Var.interrupt();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

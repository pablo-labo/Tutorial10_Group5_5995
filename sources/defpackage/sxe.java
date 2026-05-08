package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class sxe implements jn6 {
    public volatile boolean a = false;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final LinkedBlockingQueue<txe> c = new LinkedBlockingQueue<>();

    @Override // defpackage.jn6
    public final synchronized e49 a(String str) {
        rxe rxeVar;
        rxeVar = (rxe) this.b.get(str);
        if (rxeVar == null) {
            rxeVar = new rxe(str, this.c, this.a);
            this.b.put(str, rxeVar);
        }
        return rxeVar;
    }
}

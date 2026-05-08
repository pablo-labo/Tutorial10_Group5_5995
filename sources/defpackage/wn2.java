package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class wn2 {
    public static final wn2 b = new wn2();
    public volatile Map<String, bo2> a = new ConcurrentHashMap();

    static {
        AtomicReferenceFieldUpdater.newUpdater(wn2.class, Map.class, "a");
    }

    public final void a(String str, int i, Object obj) {
        this.a.put(str, new bo2(str, i, obj));
    }
}

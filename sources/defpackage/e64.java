package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class e64 {
    public final HashMap a = new HashMap();
    public final b b = new b();

    public static class a {
        public final ReentrantLock a = new ReentrantLock();
        public int b;
    }

    public static class b {
        public final ArrayDeque a = new ArrayDeque();
    }

    public final void a(String str) {
        a aVar;
        synchronized (this) {
            try {
                Object obj = this.a.get(str);
                beb.e(obj, "Argument must not be null");
                aVar = (a) obj;
                int i = aVar.b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.b);
                }
                int i2 = i - 1;
                aVar.b = i2;
                if (i2 == 0) {
                    a aVar2 = (a) this.a.remove(str);
                    if (!aVar2.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                    b bVar = this.b;
                    synchronized (bVar.a) {
                        try {
                            if (bVar.a.size() < 10) {
                                bVar.a.offer(aVar2);
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.a.unlock();
    }
}

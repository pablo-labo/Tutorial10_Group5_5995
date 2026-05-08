package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class f15 {
    public static final a c = new a();
    public static final LinkedHashMap d = new LinkedHashMap();
    public final ReentrantLock a;
    public final t23 b;

    public static final class a {
    }

    public f15(String str, boolean z) {
        ReentrantLock reentrantLock;
        t23 t23Var;
        str.getClass();
        synchronized (c) {
            try {
                LinkedHashMap linkedHashMap = d;
                Object reentrantLock2 = linkedHashMap.get(str);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    linkedHashMap.put(str, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = reentrantLock;
        if (z) {
            str.getClass();
            t23Var = new t23();
            t23Var.a = str.concat(".lck");
        } else {
            t23Var = null;
        }
        this.b = t23Var;
    }
}

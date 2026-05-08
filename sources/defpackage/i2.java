package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i2 {
    public static /* synthetic */ boolean a(Unsafe unsafe, j2 j2Var, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(j2Var, j, obj, obj2)) {
            if (unsafe.getObject(j2Var, j) != obj) {
                return false;
            }
        }
        return true;
    }
}

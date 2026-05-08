package defpackage;

import defpackage.j2;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g2 {
    public static /* synthetic */ boolean a(Unsafe unsafe, j2 j2Var, long j, j2.k kVar, j2.k kVar2) {
        while (!unsafe.compareAndSwapObject(j2Var, j, kVar, kVar2)) {
            if (unsafe.getObject(j2Var, j) != kVar) {
                return false;
            }
        }
        return true;
    }
}

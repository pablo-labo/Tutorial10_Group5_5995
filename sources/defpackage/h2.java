package defpackage;

import defpackage.j2;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h2 {
    public static /* synthetic */ boolean a(Unsafe unsafe, j2 j2Var, long j, j2.d dVar, j2.d dVar2) {
        while (!unsafe.compareAndSwapObject(j2Var, j, dVar, dVar2)) {
            if (unsafe.getObject(j2Var, j) != dVar) {
                return false;
            }
        }
        return true;
    }
}

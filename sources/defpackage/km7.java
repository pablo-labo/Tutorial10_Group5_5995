package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class km7 {
    public final xed a;
    public final ztf b;
    public final LinkedHashMap c;
    public final ReentrantLock d;
    public final oz0 e;
    public final zr0 f;
    public final Object g;

    public static abstract class a {
        public abstract void a(Set<String> set);
    }

    public km7(xed xedVar, HashMap map, HashMap map2, String... strArr) {
        this.a = xedVar;
        ztf ztfVar = new ztf(xedVar, map, map2, strArr, xedVar.k, new lm7(1, this, km7.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0));
        this.b = ztfVar;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new oz0(this);
        this.f = new zr0(this);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.g = new Object();
        ztfVar.k = new xh(this, 7);
    }

    public final vi5<Set<String>> a(String[] strArr, boolean z) {
        ztf ztfVar = this.b;
        Pair<String[], int[]> pairH = ztfVar.h(strArr);
        String[] strArrA = pairH.a();
        int[] iArrB = pairH.b();
        strArrA.getClass();
        iArrB.getClass();
        return new kjd(new buf(ztfVar, iArrB, z, strArrA, null));
    }

    public final Object b(c1f c1fVar) {
        Object objG;
        xed xedVar = this.a;
        return ((!xedVar.q() || xedVar.u()) && (objG = this.b.g(c1fVar)) == g13.a) ? objG : j6g.a;
    }
}

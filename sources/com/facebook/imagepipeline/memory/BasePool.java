package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import defpackage.bo9;
import defpackage.s55;
import defpackage.sfb;
import defpackage.uz;
import defpackage.wab;
import defpackage.web;
import defpackage.wfb;
import defpackage.wn1;
import defpackage.xfb;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BasePool<V> implements sfb<V> {
    public final a V;
    public final a W;
    public final xfb X;
    public final Class<?> a = getClass();
    public final bo9 b;
    public final wfb c;
    public final SparseArray<wn1<V>> d;
    public final Set<V> e;
    public final boolean f;

    public static class InvalidSizeException extends RuntimeException {
        public InvalidSizeException(Integer num) {
            super("Invalid size: " + num.toString());
        }
    }

    public static class PoolSizeViolationException extends RuntimeException {
    }

    public static class a {
        public int a;
        public int b;

        public final void a(int i) {
            int i2;
            int i3 = this.b;
            if (i3 < i || (i2 = this.a) <= 0) {
                s55.r("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.b), Integer.valueOf(this.a));
            } else {
                this.a = i2 - 1;
                this.b = i3 - i;
            }
        }
    }

    public BasePool(bo9 bo9Var, wfb wfbVar, xfb xfbVar) {
        bo9Var.getClass();
        this.b = bo9Var;
        wfbVar.getClass();
        this.c = wfbVar;
        xfbVar.getClass();
        this.X = xfbVar;
        SparseArray<wn1<V>> sparseArray = new SparseArray<>();
        this.d = sparseArray;
        SparseIntArray sparseIntArray = new SparseIntArray(0);
        synchronized (this) {
            try {
                sparseArray.clear();
                SparseIntArray sparseIntArray2 = wfbVar.c;
                if (sparseIntArray2 != null) {
                    for (int i = 0; i < sparseIntArray2.size(); i++) {
                        int iKeyAt = sparseIntArray2.keyAt(i);
                        int iValueAt = sparseIntArray2.valueAt(i);
                        int i2 = sparseIntArray.get(iKeyAt, 0);
                        SparseArray<wn1<V>> sparseArray2 = this.d;
                        int iH = h(iKeyAt);
                        this.c.getClass();
                        sparseArray2.put(iKeyAt, new wn1<>(iH, iValueAt, i2));
                    }
                    this.f = false;
                } else {
                    this.f = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e = Collections.newSetFromMap(new IdentityHashMap());
        this.W = new a();
        this.V = new a();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    @Override // defpackage.a6d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(V r8) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.BasePool.a(java.lang.Object):void");
    }

    public abstract V b(int i);

    public final synchronized boolean c(int i) {
        wfb wfbVar = this.c;
        int i2 = wfbVar.a;
        int i3 = this.V.b;
        if (i > i2 - i3) {
            this.X.getClass();
            return false;
        }
        int i4 = wfbVar.b;
        if (i > i4 - (i3 + this.W.b)) {
            m(i4 - i);
        }
        if (i <= i2 - (this.V.b + this.W.b)) {
            return true;
        }
        this.X.getClass();
        return false;
    }

    public abstract void d(V v);

    public final synchronized wn1<V> e(int i) {
        try {
            wn1<V> wn1Var = this.d.get(i);
            if (wn1Var == null && this.f) {
                s55.a.getClass();
                if (wab.p(2)) {
                    s55.i(this.a, Integer.valueOf(i), "creating new bucket %s");
                }
                int iH = h(i);
                this.c.getClass();
                wn1<V> wn1Var2 = new wn1<>(iH, Integer.MAX_VALUE, 0);
                this.d.put(i, wn1Var2);
                return wn1Var2;
            }
            return wn1Var;
        } finally {
        }
    }

    public abstract int f(int i);

    public abstract int g(V v);

    @Override // defpackage.sfb
    public final V get(int i) throws Throwable {
        V vB;
        V vI;
        boolean zP = wab.p(2);
        synchronized (this) {
            try {
                web.i(!j() || this.W.b == 0);
            } finally {
            }
        }
        int iF = f(i);
        synchronized (this) {
            try {
                wn1<V> wn1VarE = e(iF);
                if (wn1VarE != null && (vI = i(wn1VarE)) != null) {
                    web.i(this.e.add(vI));
                    int iG = g(vI);
                    int iH = h(iG);
                    a aVar = this.V;
                    aVar.a++;
                    aVar.b += iH;
                    this.W.a(iH);
                    this.X.getClass();
                    l();
                    s55.a.getClass();
                    if (zP) {
                        s55.j(this.a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(vI)), Integer.valueOf(iG));
                    }
                    return vI;
                }
                int iH2 = h(iF);
                if (!c(iH2)) {
                    int i2 = this.c.a;
                    int i3 = this.V.b;
                    int i4 = this.W.b;
                    StringBuilder sbF = uz.f("Pool hard cap violation? Hard cap = ", i2, " Used size = ", i3, " Free size = ");
                    sbF.append(i4);
                    sbF.append(" Request size = ");
                    sbF.append(iH2);
                    throw new PoolSizeViolationException(sbF.toString());
                }
                a aVar2 = this.V;
                aVar2.a++;
                aVar2.b += iH2;
                if (wn1VarE != null) {
                    wn1VarE.d++;
                }
                try {
                    vB = b(iF);
                } catch (Throwable th) {
                    synchronized (this) {
                        this.V.a(iH2);
                        wn1<V> wn1VarE2 = e(iF);
                        if (wn1VarE2 != null) {
                            web.i(wn1VarE2.d > 0);
                            wn1VarE2.d--;
                        }
                        if (Error.class.isInstance(th)) {
                            throw ((Throwable) Error.class.cast(th));
                        }
                        if (RuntimeException.class.isInstance(th)) {
                            throw ((Throwable) RuntimeException.class.cast(th));
                        }
                        vB = null;
                    }
                }
                synchronized (this) {
                    try {
                        web.i(this.e.add(vB));
                        synchronized (this) {
                            if (j()) {
                                m(this.c.b);
                            }
                        }
                        return vB;
                    } finally {
                    }
                }
                this.X.getClass();
                l();
                s55.a.getClass();
                if (zP) {
                    s55.j(this.a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(vB)), Integer.valueOf(iF));
                }
                return vB;
            } finally {
            }
        }
    }

    public abstract int h(int i);

    public synchronized V i(wn1<V> wn1Var) {
        V vA;
        vA = wn1Var.a();
        if (vA != null) {
            wn1Var.d++;
        }
        return vA;
    }

    public final synchronized boolean j() {
        boolean z;
        z = this.V.b + this.W.b > this.c.b;
        if (z) {
            this.X.getClass();
        }
        return z;
    }

    public boolean k(V v) {
        v.getClass();
        return true;
    }

    @SuppressLint({"InvalidAccessToGuardedField"})
    public final void l() {
        boolean zP = wab.p(2);
        wab wabVar = s55.a;
        wabVar.getClass();
        if (zP) {
            a aVar = this.V;
            Integer numValueOf = Integer.valueOf(aVar.a);
            Integer numValueOf2 = Integer.valueOf(aVar.b);
            a aVar2 = this.W;
            Integer numValueOf3 = Integer.valueOf(aVar2.a);
            Integer numValueOf4 = Integer.valueOf(aVar2.b);
            wabVar.getClass();
            if (zP) {
                wab.t(2, this.a.getSimpleName(), String.format(null, "Used = (%d, %d); Free = (%d, %d)", numValueOf, numValueOf2, numValueOf3, numValueOf4));
            }
        }
    }

    public final synchronized void m(int i) {
        boolean zP = wab.p(2);
        synchronized (this) {
            try {
                int i2 = this.V.b;
                int i3 = this.W.b;
                int iMin = Math.min((i2 + i3) - i, i3);
                if (iMin <= 0) {
                    return;
                }
                s55.a.getClass();
                if (zP) {
                    s55.k(this.a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i), Integer.valueOf(this.V.b + this.W.b), Integer.valueOf(iMin));
                }
                l();
                for (int i4 = 0; i4 < this.d.size() && iMin > 0; i4++) {
                    wn1<V> wn1VarValueAt = this.d.valueAt(i4);
                    wn1VarValueAt.getClass();
                    while (iMin > 0) {
                        V vA = wn1VarValueAt.a();
                        if (vA == null) {
                            break;
                        }
                        d(vA);
                        int i5 = wn1VarValueAt.a;
                        iMin -= i5;
                        this.W.a(i5);
                    }
                }
                l();
                s55.a.getClass();
                if (zP) {
                    s55.j(this.a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i), Integer.valueOf(this.V.b + this.W.b));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes3.dex */
public final class k22<E> extends myd<k22<E>> {
    public final go1<E> e;
    public final /* synthetic */ AtomicReferenceArray f;

    public k22(long j, k22<E> k22Var, go1<E> go1Var, int i) {
        super(j, k22Var, i);
        this.e = go1Var;
        this.f = new AtomicReferenceArray(ko1.b * 2);
    }

    @Override // defpackage.myd
    public final int g() {
        return ko1.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0047, code lost:
    
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004a, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004c, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // defpackage.myd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r5, defpackage.v03 r6) {
        /*
            r4 = this;
            int r6 = defpackage.ko1.b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            int r6 = r5 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.f
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.l(r5)
            boolean r1 = r6 instanceof defpackage.ttg
            go1<E> r2 = r4.e
            r3 = 0
            if (r1 != 0) goto L50
            boolean r1 = r6 instanceof defpackage.utg
            if (r1 == 0) goto L21
            goto L50
        L21:
            ux0 r1 = defpackage.ko1.j
            if (r6 == r1) goto L47
            ux0 r1 = defpackage.ko1.k
            if (r6 != r1) goto L2a
            goto L47
        L2a:
            ux0 r1 = defpackage.ko1.g
            if (r6 == r1) goto L11
            ux0 r1 = defpackage.ko1.f
            if (r6 != r1) goto L33
            goto L11
        L33:
            ux0 r4 = defpackage.ko1.i
            if (r6 == r4) goto L6a
            ux0 r4 = defpackage.ko1.d
            if (r6 != r4) goto L3c
            goto L6a
        L3c:
            ux0 r4 = defpackage.ko1.l
            if (r6 != r4) goto L41
            goto L6a
        L41:
            java.lang.String r4 = "unexpected state: "
            defpackage.ja.i(r6, r4)
            return
        L47:
            r4.n(r5, r3)
            if (r0 == 0) goto L6a
            r2.getClass()
            return
        L50:
            if (r0 == 0) goto L55
            ux0 r1 = defpackage.ko1.j
            goto L57
        L55:
            ux0 r1 = defpackage.ko1.k
        L57:
            boolean r6 = r4.k(r5, r6, r1)
            if (r6 == 0) goto L11
            r4.n(r5, r3)
            r6 = r0 ^ 1
            r4.m(r5, r6)
            if (r0 == 0) goto L6a
            r2.getClass()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k22.h(int, v03):void");
    }

    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object l(int i) {
        return this.f.get((i * 2) + 1);
    }

    public final void m(int i, boolean z) {
        if (z) {
            go1<E> go1Var = this.e;
            go1Var.getClass();
            go1Var.K((this.c * ((long) ko1.b)) + ((long) i));
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.f.set(i * 2, obj);
    }

    public final void o(int i, Object obj) {
        this.f.set((i * 2) + 1, obj);
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public class o29 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(o29.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(o29.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(o29.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public /* synthetic */ class a extends j4c {
        @Override // defpackage.j4c, defpackage.rf8
        public final Object get() {
            return this.receiver.getClass().getSimpleName();
        }
    }

    public final boolean b(o29 o29Var, int i) {
        while (true) {
            o29 o29VarD = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            if (o29VarD == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    o29VarD = (o29) obj;
                    if (!o29VarD.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(o29VarD);
                }
            }
            if (o29VarD instanceof ky8) {
                return (((ky8) o29VarD).d & i) == 0 && o29VarD.b(o29Var, i);
            }
            atomicReferenceFieldUpdater.set(o29Var, o29VarD);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
            atomicReferenceFieldUpdater2.set(o29Var, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(o29VarD, this, o29Var)) {
                if (atomicReferenceFieldUpdater2.get(o29VarD) != this) {
                    break;
                }
            }
            o29Var.e(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        r6 = ((defpackage.r1d) r6).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.o29 d() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.o29.b
            java.lang.Object r1 = r0.get(r9)
            o29 r1 = (defpackage.o29) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.o29.a
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            goto L1c
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
        L1c:
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.g()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            boolean r7 = r6 instanceof defpackage.r1d
            if (r7 == 0) goto L4b
            if (r4 == 0) goto L44
            r1d r6 = (defpackage.r1d) r6
            o29 r6 = r6.a
        L35:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L3d
            r3 = r4
            goto La
        L3d:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L35
            goto L0
        L44:
            java.lang.Object r3 = r0.get(r3)
            o29 r3 = (defpackage.o29) r3
            goto Lb
        L4b:
            r6.getClass()
            r4 = r6
            o29 r4 = (defpackage.o29) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o29.d():o29");
    }

    public final void e(o29 o29Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            o29 o29Var2 = (o29) atomicReferenceFieldUpdater.get(o29Var);
            if (a.get(this) != o29Var) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(o29Var, o29Var2, this)) {
                if (atomicReferenceFieldUpdater.get(o29Var) != o29Var2) {
                    break;
                }
            }
            if (g()) {
                o29Var.d();
                return;
            }
            return;
        }
    }

    public final o29 f() {
        Object obj = a.get(this);
        r1d r1dVar = obj instanceof r1d ? (r1d) obj : null;
        if (r1dVar != null) {
            return r1dVar.a;
        }
        obj.getClass();
        return (o29) obj;
    }

    public boolean g() {
        return a.get(this) instanceof r1d;
    }

    public String toString() {
        return new a(this, pi3.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + pi3.f(this);
    }
}

package defpackage;

import defpackage.qu2;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y03 extends q1 implements qu2 {
    public static final a b = new a(qu2.a.a, new wa(5));

    public static final class a extends r1<qu2, y03> {
    }

    public y03() {
        super(qu2.a.a);
    }

    public boolean A1(v03 v03Var) {
        return !(this instanceof w5g);
    }

    @Override // defpackage.qu2
    public final void B0(lu2<?> lu2Var) {
        lu2Var.getClass();
        v64 v64Var = (v64) lu2Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v64.W;
        while (atomicReferenceFieldUpdater.get(v64Var) == mh2.W) {
        }
        Object obj = atomicReferenceFieldUpdater.get(v64Var);
        qw1 qw1Var = obj instanceof qw1 ? (qw1) obj : null;
        if (qw1Var != null) {
            qw1Var.m();
        }
    }

    public y03 E1(int i) {
        h4.g(i);
        return new qw8(this, i);
    }

    @Override // defpackage.qu2
    public final v64 K0(pu2 pu2Var) {
        return new v64(this, pu2Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to y03 for r2v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.q1, defpackage.v03
    public final defpackage.v03 P(v03.b<?> r3) {
        /*
            r2 = this;
            r3.getClass()
            boolean r0 = r3 instanceof defpackage.r1
            if (r0 == 0) goto L1e
            r1 r3 = (defpackage.r1) r3
            v03$b<?> r0 = r2.a
            if (r0 == r3) goto L13
            v03$b<?> r1 = r3.b
            if (r1 != r0) goto L12
            goto L13
        L12:
            return r2
        L13:
            kotlin.jvm.functions.Function1<v03$a, E extends B> r3 = r3.a
            java.lang.Object r3 = r3.invoke(r2)
            v03$a r3 = (v03.a) r3
            if (r3 == 0) goto L24
            goto L22
        L1e:
            qu2$a r0 = qu2.a.a
            if (r0 != r3) goto L24
        L22:
            vr4 r2 = defpackage.vr4.a
        L24:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y03.P(v03$b):v03");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to y03 for r3v3 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.q1, defpackage.v03
    public final <E extends v03.a> E h1(v03.b<E> r4) {
        /*
            r3 = this;
            r4.getClass()
            boolean r0 = r4 instanceof defpackage.r1
            r1 = 0
            if (r0 == 0) goto L1f
            r1 r4 = (defpackage.r1) r4
            v03$b<?> r0 = r3.a
            if (r0 == r4) goto L14
            v03$b<?> r2 = r4.b
            if (r2 != r0) goto L13
            goto L14
        L13:
            return r1
        L14:
            kotlin.jvm.functions.Function1<v03$a, E extends B> r4 = r4.a
            java.lang.Object r3 = r4.invoke(r3)
            v03$a r3 = (v03.a) r3
            if (r3 == 0) goto L24
            return r3
        L1f:
            qu2$a r0 = qu2.a.a
            if (r0 != r4) goto L24
            return r3
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y03.h1(v03$b):v03$a");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + pi3.f(this);
    }

    public abstract void v1(v03 v03Var, Runnable runnable);

    public void w1(v03 v03Var, Runnable runnable) {
        mh2.y(this, v03Var, runnable);
    }
}

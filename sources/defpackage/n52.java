package defpackage;

import defpackage.hv1;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public class n52 extends mv5 implements m52 {
    public final boolean t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n52(t52 t52Var, uq2 uq2Var, lf0 lf0Var, boolean z, hv1.a aVar, qne qneVar) {
        super(lf0Var, aVar, t52Var, uq2Var, toe.e, qneVar);
        if (t52Var == null) {
            D0(0);
            throw null;
        }
        if (lf0Var == null) {
            D0(1);
            throw null;
        }
        if (aVar == null) {
            D0(2);
            throw null;
        }
        if (qneVar == null) {
            D0(3);
            throw null;
        }
        this.t0 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void D0(int r8) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n52.D0(int):void");
    }

    @Override // defpackage.mv5, defpackage.hv1
    public final void C0(Collection<? extends hv1> collection) {
        if (collection != null) {
            return;
        }
        D0(22);
        throw null;
    }

    @Override // defpackage.mv5
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public n52 M0(lf0 lf0Var, hv1.a aVar, aj3 aj3Var, kv5 kv5Var, n8a n8aVar, qne qneVar) {
        if (aj3Var == null) {
            D0(23);
            throw null;
        }
        if (aVar == null) {
            D0(24);
            throw null;
        }
        if (lf0Var == null) {
            D0(25);
            throw null;
        }
        hv1.a aVar2 = hv1.a.a;
        if (aVar == aVar2 || aVar == hv1.a.d) {
            return new n52((t52) aj3Var, this, lf0Var, this.t0, aVar2, qneVar);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + aj3Var + "\nkind: " + aVar);
    }

    @Override // defpackage.dj3, defpackage.aj3
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public final t52 d() {
        t52 t52Var = (t52) super.d();
        if (t52Var != null) {
            return t52Var;
        }
        D0(17);
        throw null;
    }

    public final void X0(List list, e04 e04Var) {
        if (list == null) {
            D0(13);
            throw null;
        }
        if (e04Var != null) {
            Y0(list, e04Var, d().p());
        } else {
            D0(14);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y0(java.util.List r12, defpackage.e04 r13, java.util.List r14) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L61
            if (r13 == 0) goto L5b
            if (r14 == 0) goto L55
            t52 r1 = r11.d()
            boolean r2 = r1.y()
            if (r2 == 0) goto L21
            aj3 r1 = r1.d()
            boolean r2 = r1 instanceof defpackage.t52
            if (r2 == 0) goto L21
            t52 r1 = (defpackage.t52) r1
            hsc r1 = r1.J0()
            r4 = r1
            goto L22
        L21:
            r4 = r0
        L22:
            t52 r1 = r11.d()
            java.util.List r2 = r1.Y()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L3e
            java.util.List r1 = r1.Y()
            if (r1 == 0) goto L38
        L36:
            r5 = r1
            goto L43
        L38:
            r11 = 15
            D0(r11)
            throw r0
        L3e:
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            if (r1 == 0) goto L4f
            goto L36
        L43:
            r8 = 0
            ax9 r9 = defpackage.ax9.b
            r3 = 0
            r2 = r11
            r7 = r12
            r10 = r13
            r6 = r14
            r2.P0(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L4f:
            r11 = 16
            D0(r11)
            throw r0
        L55:
            r11 = 12
            D0(r11)
            throw r0
        L5b:
            r11 = 11
            D0(r11)
            throw r0
        L61:
            r11 = 10
            D0(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n52.Y0(java.util.List, e04, java.util.List):void");
    }

    @Override // defpackage.hv1
    public final hv1 Z(t52 t52Var, ax9 ax9Var, ws3 ws3Var) {
        return (m52) super.L0(t52Var, ax9Var, ws3Var);
    }

    @Override // defpackage.mv5, defpackage.dj3, defpackage.bj3, defpackage.aj3
    public final m52 a() {
        m52 m52Var = (m52) super.a();
        if (m52Var != null) {
            return m52Var;
        }
        D0(19);
        throw null;
    }

    @Override // defpackage.mv5, defpackage.qxe
    public final m52 b(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return (m52) super.b(typeSubstitutor);
        }
        D0(20);
        throw null;
    }

    @Override // defpackage.uq2
    public final boolean c0() {
        return this.t0;
    }

    @Override // defpackage.uq2
    public final t52 d0() {
        t52 t52VarD = d();
        if (t52VarD != null) {
            return t52VarD;
        }
        D0(18);
        throw null;
    }

    @Override // defpackage.mv5, defpackage.hv1
    public final Collection<? extends kv5> m() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        D0(21);
        throw null;
    }

    @Override // defpackage.mv5, defpackage.aj3
    public final <R, D> R o0(ej3<R, D> ej3Var, D d) {
        return (R) ej3Var.p(this, d);
    }
}

package androidx.compose.ui.focus;

import android.os.Trace;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.ae7;
import defpackage.an5;
import defpackage.cf7;
import defpackage.gu5;
import defpackage.ie7;
import defpackage.im5;
import defpackage.iv4;
import defpackage.j4a;
import defpackage.j6g;
import defpackage.joa;
import defpackage.koa;
import defpackage.l;
import defpackage.lm5;
import defpackage.luc;
import defpackage.mj8;
import defpackage.mm5;
import defpackage.nm2;
import defpackage.nm5;
import defpackage.nx9;
import defpackage.om2;
import defpackage.om5;
import defpackage.pm8;
import defpackage.qx9;
import defpackage.r6;
import defpackage.ria;
import defpackage.sl5;
import defpackage.sm5;
import defpackage.um2;
import defpackage.us3;
import defpackage.wl7;
import defpackage.xm5;
import defpackage.ym5;
import defpackage.zs3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class FocusTargetNode extends e.c implements nm2, an5, joa, nx9 {
    public final Function2<xm5, xm5, j6g> d0;
    public boolean e0;
    public boolean f0;
    public final int g0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;", "Lqx9;", "Landroidx/compose/ui/focus/FocusTargetNode;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FocusTargetElement extends qx9<FocusTargetNode> {
        public static final FocusTargetElement b = new FocusTargetElement();

        private FocusTargetElement() {
        }

        @Override // defpackage.qx9
        public final e.c a() {
            return new FocusTargetNode(0, null, 7);
        }

        @Override // defpackage.qx9
        public final /* bridge */ /* synthetic */ void b(e.c cVar) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return 1739042953;
        }
    }

    public static final class a extends mj8 implements gu5<j6g> {
        final /* synthetic */ luc<lm5> $focusProperties;
        final /* synthetic */ FocusTargetNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(luc<lm5> lucVar, FocusTargetNode focusTargetNode) {
            super(0);
            this.$focusProperties = lucVar;
            this.this$0 = focusTargetNode;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [T, nm5] */
        @Override // defpackage.gu5
        public final j6g invoke() {
            this.$focusProperties.element = this.this$0.d2();
            return j6g.a;
        }
    }

    public FocusTargetNode() {
        throw null;
    }

    public FocusTargetNode(int i, Function2 function2, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        this.d0 = (i2 & 2) != 0 ? null : function2;
        this.g0 = i;
    }

    @Override // defpackage.an5
    public final boolean A(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zU = false;
            if (!d2().a) {
                return false;
            }
            int iOrdinal = ie7.t(this, i).ordinal();
            if (iOrdinal == 0) {
                zU = ie7.u(this);
            } else if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    zU = true;
                } else if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return zU;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.e.c
    public final boolean R1() {
        return false;
    }

    @Override // androidx.compose.ui.e.c
    public final void V1() {
        int iOrdinal = P().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                l.g();
                return;
            }
        }
        im5 focusOwner = us3.g(this).getFocusOwner();
        focusOwner.p(8, true, false);
        focusOwner.h();
    }

    @Override // androidx.compose.ui.e.c
    public final void W1() {
        if (P().a()) {
            us3.g(this).getFocusOwner().p(8, true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [j4a] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [j4a] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void c2(ym5 ym5Var, ym5 ym5Var2) {
        ria riaVar;
        Function2<xm5, xm5, j6g> function2;
        im5 focusOwner = us3.g(this).getFocusOwner();
        FocusTargetNode focusTargetNodeF = focusOwner.f();
        if (!ym5Var.equals(ym5Var2) && (function2 = this.d0) != null) {
            function2.invoke(ym5Var, ym5Var2);
        }
        e.c cVar = this.a;
        if (!cVar.c0) {
            ae7.b("visitAncestors called on an unattached node");
        }
        e.c cVar2 = this.a;
        pm8 pm8VarF = us3.f(this);
        while (pm8VarF != null) {
            if ((pm8VarF.t0.f.d & 5120) != 0) {
                while (cVar2 != null) {
                    int i = cVar2.c;
                    if ((i & 5120) != 0) {
                        if (cVar2 != cVar && (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ?? B = cVar2;
                            ?? j4aVar = 0;
                            while (B != 0) {
                                if (B instanceof sl5) {
                                    sl5 sl5Var = (sl5) B;
                                    if (focusTargetNodeF == focusOwner.f()) {
                                        sl5Var.X(ym5Var2);
                                    }
                                } else if ((B.c & 4096) != 0 && (B instanceof zs3)) {
                                    e.c cVar3 = ((zs3) B).e0;
                                    int i2 = 0;
                                    B = B;
                                    j4aVar = j4aVar;
                                    while (cVar3 != null) {
                                        if ((cVar3.c & 4096) != 0) {
                                            i2++;
                                            j4aVar = j4aVar;
                                            if (i2 == 1) {
                                                B = cVar3;
                                            } else {
                                                if (j4aVar == 0) {
                                                    j4aVar = new j4a(new e.c[16]);
                                                }
                                                if (B != 0) {
                                                    j4aVar.b(B);
                                                    B = 0;
                                                }
                                                j4aVar.b(cVar3);
                                            }
                                        }
                                        cVar3 = cVar3.f;
                                        B = B;
                                        j4aVar = j4aVar;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                B = us3.b(j4aVar);
                            }
                        }
                    }
                    cVar2 = cVar2.e;
                }
            }
            pm8VarF = pm8VarF.K();
            cVar2 = (pm8VarF == null || (riaVar = pm8VarF.t0) == null) ? null : riaVar.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [j4a] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [j4a] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public final nm5 d2() {
        boolean z;
        ria riaVar;
        nm5 nm5Var = new nm5();
        nm5Var.a = true;
        sm5 sm5Var = sm5.b;
        nm5Var.b = sm5Var;
        nm5Var.c = sm5Var;
        nm5Var.d = sm5Var;
        nm5Var.e = sm5Var;
        nm5Var.f = sm5Var;
        nm5Var.g = sm5Var;
        nm5Var.h = sm5Var;
        nm5Var.i = sm5Var;
        nm5Var.j = iv4.c;
        nm5Var.k = mm5.b;
        int i = this.g0;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((cf7) om2.a(this, um2.m)).a() == 1);
        } else {
            if (i != 2) {
                r6.g("Unknown Focusability");
                return null;
            }
            z = false;
        }
        nm5Var.a = z;
        e.c cVar = this.a;
        if (!cVar.c0) {
            ae7.b("visitAncestors called on an unattached node");
        }
        e.c cVar2 = this.a;
        pm8 pm8VarF = us3.f(this);
        loop0: while (pm8VarF != null) {
            if ((pm8VarF.t0.f.d & 3072) != 0) {
                while (cVar2 != null) {
                    int i2 = cVar2.c;
                    if ((i2 & 3072) != 0) {
                        if (cVar2 != cVar && (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            ?? j4aVar = 0;
                            ?? B = cVar2;
                            while (B != 0) {
                                if (B instanceof om5) {
                                    ((om5) B).V(nm5Var);
                                } else if ((B.c & 2048) != 0 && (B instanceof zs3)) {
                                    e.c cVar3 = ((zs3) B).e0;
                                    int i3 = 0;
                                    B = B;
                                    j4aVar = j4aVar;
                                    while (cVar3 != null) {
                                        if ((cVar3.c & 2048) != 0) {
                                            i3++;
                                            j4aVar = j4aVar;
                                            if (i3 == 1) {
                                                B = cVar3;
                                            } else {
                                                if (j4aVar == 0) {
                                                    j4aVar = new j4a(new e.c[16]);
                                                }
                                                if (B != 0) {
                                                    j4aVar.b(B);
                                                    B = 0;
                                                }
                                                j4aVar.b(cVar3);
                                            }
                                        }
                                        cVar3 = cVar3.f;
                                        B = B;
                                        j4aVar = j4aVar;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                B = us3.b(j4aVar);
                            }
                        }
                    }
                    cVar2 = cVar2.e;
                }
            }
            pm8VarF = pm8VarF.K();
            cVar2 = (pm8VarF == null || (riaVar = pm8VarF.t0) == null) ? null : riaVar.e;
        }
        return nm5Var;
    }

    @Override // defpackage.an5
    /* JADX INFO: renamed from: e2, reason: merged with bridge method [inline-methods] */
    public final ym5 P() {
        im5 focusOwner;
        FocusTargetNode focusTargetNodeF;
        ria riaVar;
        boolean z = this.c0;
        ym5 ym5Var = ym5.d;
        if (!z || (focusTargetNodeF = (focusOwner = us3.g(this).getFocusOwner()).f()) == null) {
            return ym5Var;
        }
        if (this == focusTargetNodeF) {
            return focusOwner.j() ? ym5.c : ym5.a;
        }
        if (focusTargetNodeF.c0) {
            if (!focusTargetNodeF.a.c0) {
                ae7.b("visitAncestors called on an unattached node");
            }
            e.c cVar = focusTargetNodeF.a.e;
            pm8 pm8VarF = us3.f(focusTargetNodeF);
            while (pm8VarF != null) {
                if ((pm8VarF.t0.f.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                    while (cVar != null) {
                        if ((cVar.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                            e.c cVarB = cVar;
                            j4a j4aVar = null;
                            while (cVarB != null) {
                                if (cVarB instanceof FocusTargetNode) {
                                    if (this == ((FocusTargetNode) cVarB)) {
                                        return ym5.b;
                                    }
                                } else if ((cVarB.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 && (cVarB instanceof zs3)) {
                                    int i = 0;
                                    for (e.c cVar2 = ((zs3) cVarB).e0; cVar2 != null; cVar2 = cVar2.f) {
                                        if ((cVar2.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                                            i++;
                                            if (i == 1) {
                                                cVarB = cVar2;
                                            } else {
                                                if (j4aVar == null) {
                                                    j4aVar = new j4a(new e.c[16]);
                                                }
                                                if (cVarB != null) {
                                                    j4aVar.b(cVarB);
                                                    cVarB = null;
                                                }
                                                j4aVar.b(cVar2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                cVarB = us3.b(j4aVar);
                            }
                        }
                        cVar = cVar.e;
                    }
                }
                pm8VarF = pm8VarF.K();
                cVar = (pm8VarF == null || (riaVar = pm8VarF.t0) == null) ? null : riaVar.e;
            }
        }
        return ym5Var;
    }

    public final void f2() {
        int iOrdinal = P().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                l.g();
                return;
            }
        }
        luc lucVar = new luc();
        koa.a(this, new a(lucVar, this));
        T t = lucVar.element;
        if (t == 0) {
            wl7.g("focusProperties");
            throw null;
        }
        if (((lm5) t).d()) {
            return;
        }
        us3.g(this).getFocusOwner().t(true);
    }

    @Override // defpackage.joa
    public final void u0() {
        f2();
    }
}

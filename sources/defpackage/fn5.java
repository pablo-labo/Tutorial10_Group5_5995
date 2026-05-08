package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusTargetNode;
import defpackage.b1;
import defpackage.ex7;
import defpackage.kab;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class fn5 extends zs3 implements c5e, z96, nm2, joa, jtf {
    public static final a l0 = new a();
    public d3a f0;
    public final Function1<Boolean, j6g> g0;
    public zl5 h0;
    public kab.a i0;
    public tia j0;
    public final an5 k0;

    public static final class a {
    }

    public /* synthetic */ class b extends qv5 implements gu5<Boolean> {
        @Override // defpackage.gu5
        public final Boolean invoke() {
            return Boolean.valueOf(((fn5) this.receiver).k0.A(7));
        }
    }

    @uh3(c = "androidx.compose.foundation.FocusableNode$emitWithFallback$1", f = "Focusable.kt", l = {316}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ o74 $handler;
        final /* synthetic */ ci7 $interaction;
        final /* synthetic */ d3a $this_emitWithFallback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d3a d3aVar, ci7 ci7Var, o74 o74Var, lu2<? super c> lu2Var) {
            super(2, lu2Var);
            this.$this_emitWithFallback = d3aVar;
            this.$interaction = ci7Var;
            this.$handler = o74Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new c(this.$this_emitWithFallback, this.$interaction, this.$handler, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                d3a d3aVar = this.$this_emitWithFallback;
                ci7 ci7Var = this.$interaction;
                this.label = 1;
                Object objA = d3aVar.a(ci7Var, this);
                g13 g13Var = g13.a;
                if (objA == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            o74 o74Var = this.$handler;
            if (o74Var != null) {
                o74Var.dispose();
            }
            return j6g.a;
        }
    }

    public fn5() {
        throw null;
    }

    public fn5(d3a d3aVar, int i, b1.b bVar) {
        this.f0 = d3aVar;
        this.g0 = bVar;
        FocusTargetNode focusTargetNode = new FocusTargetNode(i, new gn5(2, this, fn5.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0), 4);
        c2(focusTargetNode);
        this.k0 = focusTargetNode;
    }

    @Override // defpackage.jtf
    public final Object E() {
        return l0;
    }

    @Override // defpackage.c5e
    public final void F0(s5e s5eVar) {
        boolean zA = this.k0.P().a();
        qf8<Object>[] qf8VarArr = o5e.a;
        r5e<Boolean> r5eVar = k5e.k;
        qf8<Object> qf8Var = o5e.a[4];
        s5eVar.a(r5eVar, Boolean.valueOf(zA));
        s5eVar.a(v4e.v, new r5(null, new b(0, this, fn5.class, "requestFocus", "requestFocus()Z", 0)));
    }

    @Override // androidx.compose.ui.e.c
    public final boolean R1() {
        return false;
    }

    @Override // androidx.compose.ui.e.c
    public final void W1() {
        kab.a aVar = this.i0;
        if (aVar != null) {
            aVar.release();
        }
        this.i0 = null;
    }

    public final void f2(d3a d3aVar, ci7 ci7Var) {
        if (!this.c0) {
            d3aVar.c(ci7Var);
        } else {
            ex7 ex7Var = (ex7) ((eu2) Q1()).a.h1(ex7.a.a);
            u63.Y(Q1(), null, null, new c(d3aVar, ci7Var, ex7Var != null ? ex7Var.d0(new w34(2, d3aVar, ci7Var)) : null, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [j4a] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [j4a] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v5 */
    public final in5 g2() {
        jtf jtfVar;
        ria riaVar;
        if (this.c0) {
            if (!this.a.c0) {
                ae7.b("visitAncestors called on an unattached node");
            }
            e.c cVar = this.a.e;
            pm8 pm8VarF = us3.f(this);
            loop0: while (true) {
                if (pm8VarF == null) {
                    jtfVar = null;
                    break;
                }
                if ((pm8VarF.t0.f.d & 262144) != 0) {
                    while (cVar != null) {
                        if ((cVar.c & 262144) != 0) {
                            ?? B = cVar;
                            ?? j4aVar = 0;
                            while (B != 0) {
                                if (B instanceof jtf) {
                                    jtfVar = (jtf) B;
                                    if (in5.f0 == jtfVar.E()) {
                                        break loop0;
                                    }
                                } else if ((B.c & 262144) != 0 && (B instanceof zs3)) {
                                    e.c cVar2 = ((zs3) B).e0;
                                    int i = 0;
                                    B = B;
                                    j4aVar = j4aVar;
                                    while (cVar2 != null) {
                                        if ((cVar2.c & 262144) != 0) {
                                            i++;
                                            j4aVar = j4aVar;
                                            if (i == 1) {
                                                B = cVar2;
                                            } else {
                                                if (j4aVar == 0) {
                                                    j4aVar = new j4a(new e.c[16]);
                                                }
                                                if (B != 0) {
                                                    j4aVar.b(B);
                                                    B = 0;
                                                }
                                                j4aVar.b(cVar2);
                                            }
                                        }
                                        cVar2 = cVar2.f;
                                        B = B;
                                        j4aVar = j4aVar;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                B = us3.b(j4aVar);
                            }
                        }
                        cVar = cVar.e;
                    }
                }
                pm8VarF = pm8VarF.K();
                cVar = (pm8VarF == null || (riaVar = pm8VarF.t0) == null) ? null : riaVar.e;
            }
            if (jtfVar instanceof in5) {
                return (in5) jtfVar;
            }
        }
        return null;
    }

    public final void h2(d3a d3aVar) {
        zl5 zl5Var;
        if (wl7.b(this.f0, d3aVar)) {
            return;
        }
        d3a d3aVar2 = this.f0;
        if (d3aVar2 != null && (zl5Var = this.h0) != null) {
            d3aVar2.c(new am5(zl5Var));
        }
        this.h0 = null;
        this.f0 = d3aVar;
    }

    @Override // defpackage.z96
    public final void n0(tia tiaVar) {
        in5 in5VarG2;
        this.j0 = tiaVar;
        if (this.k0.P().a()) {
            if (!tiaVar.f1().c0) {
                in5 in5VarG22 = g2();
                if (in5VarG22 != null) {
                    in5VarG22.c2(null);
                    return;
                }
                return;
            }
            tia tiaVar2 = this.j0;
            if (tiaVar2 == null || !tiaVar2.f1().c0 || (in5VarG2 = g2()) == null) {
                return;
            }
            in5VarG2.c2(this.j0);
        }
    }

    @Override // defpackage.joa
    public final void u0() {
        luc lucVar = new luc();
        koa.a(this, new gx(3, lucVar, this));
        kab kabVar = (kab) lucVar.element;
        if (this.k0.P().a()) {
            kab.a aVar = this.i0;
            if (aVar != null) {
                aVar.release();
            }
            this.i0 = kabVar != null ? kabVar.a() : null;
        }
    }
}

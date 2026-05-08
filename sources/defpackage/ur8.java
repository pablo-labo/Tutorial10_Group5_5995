package defpackage;

import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ur8 extends e.c implements c5e {
    public gu5<? extends c> d0;
    public rr8 e0;
    public dwa f0;
    public boolean g0;
    public boolean h0;
    public lrd i0;
    public final fj j0 = new fj(this, 8);
    public na0 k0;

    @uh3(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2", f = "LazyLayoutSemantics.kt", l = {213}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ int $index;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$index = i;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return ur8.this.new a(this.$index, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                rr8 rr8Var = ur8.this.e0;
                int i2 = this.$index;
                this.label = 1;
                Object objF = rr8Var.f(i2, this);
                g13 g13Var = g13.a;
                if (objF == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    public ur8(gu5<? extends c> gu5Var, rr8 rr8Var, dwa dwaVar, boolean z, boolean z2) {
        this.d0 = gu5Var;
        this.e0 = rr8Var;
        this.f0 = dwaVar;
        this.g0 = z;
        this.h0 = z2;
        c2();
    }

    @Override // defpackage.c5e
    public final void F0(s5e s5eVar) {
        o5e.k(s5eVar);
        s5eVar.a(k5e.L, this.j0);
        dwa dwaVar = this.f0;
        lrd lrdVar = this.i0;
        if (dwaVar == dwa.a) {
            if (lrdVar == null) {
                wl7.g("scrollAxisRange");
                throw null;
            }
            r5e<lrd> r5eVar = k5e.u;
            qf8<Object> qf8Var = o5e.a[12];
            s5eVar.a(r5eVar, lrdVar);
        } else {
            if (lrdVar == null) {
                wl7.g("scrollAxisRange");
                throw null;
            }
            r5e<lrd> r5eVar2 = k5e.t;
            qf8<Object> qf8Var2 = o5e.a[11];
            s5eVar.a(r5eVar2, lrdVar);
        }
        na0 na0Var = this.k0;
        if (na0Var != null) {
            s5eVar.a(v4e.f, new r5(null, na0Var));
        }
        s5eVar.a(v4e.B, new r5(null, new n5e(new qr(this, 10))));
        o5e.d(s5eVar, this.e0.c());
    }

    @Override // androidx.compose.ui.e.c
    public final boolean R1() {
        return false;
    }

    public final void c2() {
        this.i0 = new lrd(new a1(this, 17), new fk0(this, 11), this.h0);
        this.k0 = this.g0 ? new na0(this, 12) : null;
    }
}

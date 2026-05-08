package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.i8f;

/* JADX INFO: loaded from: classes.dex */
public final class ub2 implements PointerInputEventHandler {
    public final /* synthetic */ tb2 a;

    @uh3(c = "androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1$3", f = "Clickable.kt", l = {1121}, m = "invokeSuspend")
    public static final class a extends c1f implements wu5<dmb, ooa, lu2<? super j6g>, Object> {
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ tb2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(tb2 tb2Var, lu2<? super a> lu2Var) {
            super(3, lu2Var);
            this.this$0 = tb2Var;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            Object objD;
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                dmb dmbVar = (dmb) this.L$0;
                long j = this.J$0;
                tb2 tb2Var = this.this$0;
                if (tb2Var.k0) {
                    this.label = 1;
                    d3a d3aVar = tb2Var.f0;
                    Object obj2 = g13.a;
                    if (d3aVar == null || (objD = f13.d(new e1(dmbVar, j, d3aVar, tb2Var, null), this)) != obj2) {
                        objD = j6g.a;
                    }
                    if (objD == obj2) {
                        return obj2;
                    }
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

        @Override // defpackage.wu5
        public final Object q(dmb dmbVar, ooa ooaVar, lu2<? super j6g> lu2Var) {
            long j = ooaVar.a;
            a aVar = new a(this.this$0, lu2Var);
            aVar.L$0 = dmbVar;
            aVar.J$0 = j;
            return aVar.invokeSuspend(j6g.a);
        }
    }

    public ub2(tb2 tb2Var) {
        this.a = tb2Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(efb efbVar, lu2<? super j6g> lu2Var) {
        tb2 tb2Var = this.a;
        wi wiVar = (!tb2Var.k0 || tb2Var.z0 == null) ? null : new wi(tb2Var, 2);
        a aVar = new a(tb2Var, null);
        tv tvVar = new tv(tb2Var, 4);
        i8f.a aVar2 = i8f.a;
        Object objD = f13.d(new o8f(efbVar, aVar, wiVar, null, tvVar, null), lu2Var);
        g13 g13Var = g13.a;
        if (objD != g13Var) {
            objD = j6g.a;
        }
        return objD == g13Var ? objD : j6g.a;
    }
}

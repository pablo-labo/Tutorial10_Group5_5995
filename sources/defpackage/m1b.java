package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.pager.PagerKt$pagerSemantics$performForwardPaging$1", f = "Pager.kt", l = {545}, m = "invokeSuspend")
public final class m1b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ e2b $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1b(e2b e2bVar, lu2<? super m1b> lu2Var) {
        super(2, lu2Var);
        this.$state = e2bVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new m1b(this.$state, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((m1b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object objF;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            e2b e2bVar = this.$state;
            this.label = 1;
            t1b t1bVar = h2b.a;
            int iK = e2bVar.k() + 1;
            int iO = e2bVar.o();
            Object obj2 = g13.a;
            if (iK >= iO || (objF = e2bVar.f(e2bVar.k() + 1, zd0.c(0.0f, null, 7), this)) != obj2) {
                objF = j6g.a;
            }
            if (objF == obj2) {
                return obj2;
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

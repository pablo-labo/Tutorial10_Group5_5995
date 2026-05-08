package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.countryselector.ChangeCountrySelectorViewModel$refreshData$1", f = "ChangeCountrySelectorViewModel.kt", l = {93}, m = "invokeSuspend")
public final class g12 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ h12 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g12(h12 h12Var, lu2<? super g12> lu2Var) {
        super(2, lu2Var);
        this.this$0 = h12Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new g12(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((g12) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            yba ybaVarH = this.this$0.h();
            k30 k30Var = new k30(this.this$0, 4);
            this.label = 1;
            Object objH = yba.h(ybaVarH, k30Var, null, this, 6);
            g13 g13Var = g13.a;
            if (objH == g13Var) {
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

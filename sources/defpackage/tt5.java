package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.bottomnav.fsdv.FsdvWebViewFragment$setupTopNav$1$1$1$1$2$1", f = "FsdvWebViewFragment.kt", l = {}, m = "invokeSuspend")
public final class tt5 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ ut5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt5(ut5 ut5Var, lu2<? super tt5> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ut5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new tt5(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((tt5) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        kt5 kt5Var = (kt5) this.this$0.h0.getValue();
        ut5 ut5Var = this.this$0;
        vv vvVar = new vv(ut5Var, 7);
        oa oaVar = new oa(ut5Var, 10);
        kt5Var.f = vvVar;
        kt5Var.V = oaVar;
        kt5Var.e = true;
        kt5Var.l();
        return j6g.a;
    }
}

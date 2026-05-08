package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.domain.usecase.NonIALogoutUseCase$invoke$2", f = "NonIALogoutUseCase.kt", l = {18}, m = "invokeSuspend")
public final class dka extends c1f implements Function2<wi5<? super j6g>, lu2<? super j6g>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ eka this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dka(eka ekaVar, lu2<? super dka> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ekaVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        dka dkaVar = new dka(this.this$0, lu2Var);
        dkaVar.L$0 = obj;
        return dkaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<? super j6g> wi5Var, lu2<? super j6g> lu2Var) {
        return ((dka) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        wi5 wi5Var = (wi5) this.L$0;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            this.this$0.a.u("myjobs_noJobsTimeStamp");
            this.this$0.a.u("myjobs_crossJobsTimeStamp");
            this.this$0.a.d();
            j6g j6gVar = j6g.a;
            this.L$0 = null;
            this.label = 1;
            Object objA = wi5Var.a(j6gVar, this);
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
        return j6g.a;
    }
}

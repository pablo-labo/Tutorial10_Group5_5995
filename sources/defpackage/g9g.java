package defpackage;

import defpackage.f9g;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.domain.usecase.UpdateInvitationStatusUseCase$invoke$2", f = "UpdateInvitationStatusUseCase.kt", l = {20}, m = "invokeSuspend")
public final class g9g extends c1f implements Function2<wi5<? super j6g>, lu2<? super j6g>, Object> {
    final /* synthetic */ f9g.a $param;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f9g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9g(f9g f9gVar, f9g.a aVar, lu2<? super g9g> lu2Var) {
        super(2, lu2Var);
        this.this$0 = f9gVar;
        this.$param = aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        g9g g9gVar = new g9g(this.this$0, this.$param, lu2Var);
        g9gVar.L$0 = obj;
        return g9gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<? super j6g> wi5Var, lu2<? super j6g> lu2Var) {
        return ((g9g) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        wi5 wi5Var = (wi5) this.L$0;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            this.this$0.a.p(this.$param.a);
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

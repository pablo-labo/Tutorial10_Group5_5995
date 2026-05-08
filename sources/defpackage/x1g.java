package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.tare.uiplugin.UIPMessagingEventsImpl$1$1$2", f = "UIPMessagingEventsImpl.kt", l = {69}, m = "invokeSuspend")
public final class x1g extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ z1g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1g(z1g z1gVar, lu2<? super x1g> lu2Var) {
        super(2, lu2Var);
        this.this$0 = z1gVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new x1g(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((x1g) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            z1g z1gVar = this.this$0;
            wy2 wy2Var = new wy2(20);
            this.label = 1;
            Object objF = z1gVar.f(wy2Var, this);
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

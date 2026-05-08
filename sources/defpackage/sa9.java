package defpackage;

import defpackage.z1g;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.tare.uiplugin.ManagedJob$job$1", f = "UIPMessagingEventsImpl.kt", l = {236}, m = "invokeSuspend")
public final class sa9 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ ta9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa9(ta9 ta9Var, lu2<? super sa9> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ta9Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new sa9(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((sa9) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            z1g.b bVar = this.this$0.a;
            this.label = 1;
            Object objInvoke = bVar.invoke(this);
            g13 g13Var = g13.a;
            if (objInvoke == g13Var) {
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

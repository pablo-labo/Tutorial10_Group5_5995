package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.eventlog.IndeedEventLogging$emit$1", f = "IndeedEventLogging.kt", l = {130}, m = "invokeSuspend")
public final class t87 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ eke $event;
    Object L$0;
    int label;
    final /* synthetic */ s87 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t87(s87 s87Var, eke ekeVar, lu2<? super t87> lu2Var) {
        super(2, lu2Var);
        this.this$0 = s87Var;
        this.$event = ekeVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new t87(this.this$0, this.$event, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((t87) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        r87 r87Var;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            r87Var = (r87) this.this$0.c.getValue();
            s87 s87Var = this.this$0;
            this.L$0 = r87Var;
            this.label = 1;
            obj = s87Var.a(this);
            g13 g13Var = g13.a;
            if (obj == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r87Var = (r87) this.L$0;
            r7d.b(obj);
        }
        r87Var.c = (hz4) obj;
        this.$event.b((r87) this.this$0.c.getValue());
        return j6g.a;
    }
}

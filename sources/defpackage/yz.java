package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.util.AgeSignalManager$1", f = "AgeSignalManager.kt", l = {74}, m = "invokeSuspend")
public final class yz extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ g00 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz(g00 g00Var, lu2<? super yz> lu2Var) {
        super(2, lu2Var);
        this.this$0 = g00Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new yz(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((yz) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            g00 g00Var = this.this$0;
            this.label = 1;
            obj = g00Var.a(this);
            g13 g13Var = g13.a;
            if (obj == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        i00 i00Var = (i00) obj;
        if (i00Var != null) {
            g00 g00Var2 = this.this$0;
            g00Var2.b(i00Var);
            gse gseVar = g00Var2.f;
            gseVar.getClass();
            gseVar.m(null, i00Var);
        }
        return j6g.a;
    }
}

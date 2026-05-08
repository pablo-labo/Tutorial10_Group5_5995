package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.domain.usecase.GetEmployerJobViewStatus$invoke$2", f = "GetEmployerJobViewStatus.kt", l = {13}, m = "invokeSuspend")
public final class f06 extends c1f implements Function2<wi5<? super Map<String, ? extends String>>, lu2<? super j6g>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g06 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f06(g06 g06Var, lu2<? super f06> lu2Var) {
        super(2, lu2Var);
        this.this$0 = g06Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        f06 f06Var = new f06(this.this$0, lu2Var);
        f06Var.L$0 = obj;
        return f06Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<? super Map<String, ? extends String>> wi5Var, lu2<? super j6g> lu2Var) {
        return ((f06) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        wi5 wi5Var = (wi5) this.L$0;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            Map<String, String> mapF = this.this$0.a.F();
            this.L$0 = null;
            this.label = 1;
            Object objA = wi5Var.a(mapF, this);
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

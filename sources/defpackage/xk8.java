package defpackage;

import com.indeed.android.jobsearch.LaunchActivity;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.LaunchActivity$trackOnAppStart$1", f = "LaunchActivity.kt", l = {755}, m = "invokeSuspend")
public final class xk8 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ luc<Map<String, String>> $extraProperties;
    int label;
    final /* synthetic */ LaunchActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk8(LaunchActivity launchActivity, luc<Map<String, String>> lucVar, lu2<? super xk8> lu2Var) {
        super(2, lu2Var);
        this.this$0 = launchActivity;
        this.$extraProperties = lucVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new xk8(this.this$0, this.$extraProperties, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((xk8) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            sl0 sl0Var = sl0.a;
            boolean z = this.this$0.R0 == 1;
            Map<String, String> map = this.$extraProperties.element;
            this.label = 1;
            Object objN = sl0Var.n(z, map, this);
            g13 g13Var = g13.a;
            if (objN == g13Var) {
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

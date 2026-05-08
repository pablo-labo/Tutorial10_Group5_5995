package defpackage;

import com.indeed.android.ghostwriter.services.GhostwriterRetrofitApiResolver;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.ghostwriter.services.GhostwriterTasks$getScheduleApplyJobs$scheduleApplyJobsResponse$1", f = "GhostwriterTasks.kt", l = {93}, m = "invokeSuspend")
public final class k86 extends c1f implements Function1<lu2<? super m6d<List<? extends ep0>>>, Object> {
    int label;
    final /* synthetic */ r86 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k86(r86 r86Var, lu2<? super k86> lu2Var) {
        super(1, lu2Var);
        this.this$0 = r86Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new k86(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super m6d<List<? extends ep0>>> lu2Var) {
        return ((k86) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                r7d.b(obj);
                return obj;
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        GhostwriterRetrofitApiResolver ghostwriterRetrofitApiResolverC = this.this$0.c();
        this.label = 1;
        Object applications = ghostwriterRetrofitApiResolverC.getApplications(this);
        g13 g13Var = g13.a;
        return applications == g13Var ? g13Var : applications;
    }
}

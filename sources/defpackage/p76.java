package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.ghostwriter.debug.GhostwriterDebugScreenKt$GhostwriterDebugScreen$9$1$1", f = "GhostwriterDebugScreen.kt", l = {161}, m = "invokeSuspend")
public final class p76 extends c1f implements Function1<lu2<? super j6g>, Object> {
    final /* synthetic */ g4a<Boolean> $isRefreshing$delegate;
    final /* synthetic */ gu5<List<vnd>> $onClickFetchAutoAppliedJobs;
    final /* synthetic */ g4a<List<vnd>> $scheduleApplyJobs$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p76(gu5<? extends List<vnd>> gu5Var, g4a<Boolean> g4aVar, g4a<List<vnd>> g4aVar2, lu2<? super p76> lu2Var) {
        super(1, lu2Var);
        this.$onClickFetchAutoAppliedJobs = gu5Var;
        this.$isRefreshing$delegate = g4aVar;
        this.$scheduleApplyJobs$delegate = g4aVar2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new p76(this.$onClickFetchAutoAppliedJobs, this.$isRefreshing$delegate, this.$scheduleApplyJobs$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super j6g> lu2Var) {
        return ((p76) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            this.$isRefreshing$delegate.setValue(Boolean.TRUE);
            this.$scheduleApplyJobs$delegate.setValue(this.$onClickFetchAutoAppliedJobs.invoke());
            this.label = 1;
            Object objB = ls3.b(500L, this);
            g13 g13Var = g13.a;
            if (objB == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        this.$isRefreshing$delegate.setValue(Boolean.FALSE);
        return j6g.a;
    }
}

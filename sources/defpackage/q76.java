package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.ghostwriter.debug.GhostwriterDebugScreenKt$GhostwriterDebugScreen$9$3$1$1$1$1$1", f = "GhostwriterDebugScreen.kt", l = {177}, m = "invokeSuspend")
public final class q76 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ String $applicationId;
    final /* synthetic */ g4a<Boolean> $bottomSheetIsVisible$delegate;
    final /* synthetic */ gu5<List<vnd>> $onClickFetchAutoAppliedJobs;
    final /* synthetic */ Function2<String, lu2<? super Boolean>, Object> $onDeleteApplication;
    final /* synthetic */ g4a<List<vnd>> $scheduleApplyJobs$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q76(Function2<? super String, ? super lu2<? super Boolean>, ? extends Object> function2, String str, gu5<? extends List<vnd>> gu5Var, g4a<Boolean> g4aVar, g4a<List<vnd>> g4aVar2, lu2<? super q76> lu2Var) {
        super(2, lu2Var);
        this.$onDeleteApplication = function2;
        this.$applicationId = str;
        this.$onClickFetchAutoAppliedJobs = gu5Var;
        this.$bottomSheetIsVisible$delegate = g4aVar;
        this.$scheduleApplyJobs$delegate = g4aVar2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new q76(this.$onDeleteApplication, this.$applicationId, this.$onClickFetchAutoAppliedJobs, this.$bottomSheetIsVisible$delegate, this.$scheduleApplyJobs$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((q76) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            n76.g(this.$bottomSheetIsVisible$delegate, false);
            Function2<String, lu2<? super Boolean>, Object> function2 = this.$onDeleteApplication;
            String str = this.$applicationId;
            this.label = 1;
            Object objInvoke = function2.invoke(str, this);
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
        this.$scheduleApplyJobs$delegate.setValue(this.$onClickFetchAutoAppliedJobs.invoke());
        return j6g.a;
    }
}

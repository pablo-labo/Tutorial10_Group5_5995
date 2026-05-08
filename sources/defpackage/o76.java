package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.ghostwriter.debug.GhostwriterDebugScreenKt$GhostwriterDebugScreen$6$1$1$1", f = "GhostwriterDebugScreen.kt", l = {123}, m = "invokeSuspend")
public final class o76 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ s98 $json;
    final /* synthetic */ xu5<String, String, String, lu2<? super j6g>, Object> $onClickStartAutoApply;
    final /* synthetic */ vnd $scheduleApplyJob;
    final /* synthetic */ ljg $userPersona;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o76(xu5<? super String, ? super String, ? super String, ? super lu2<? super j6g>, ? extends Object> xu5Var, vnd vndVar, ljg ljgVar, s98 s98Var, lu2<? super o76> lu2Var) {
        super(2, lu2Var);
        this.$onClickStartAutoApply = xu5Var;
        this.$scheduleApplyJob = vndVar;
        this.$userPersona = ljgVar;
        this.$json = s98Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new o76(this.$onClickStartAutoApply, this.$scheduleApplyJob, this.$userPersona, this.$json, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((o76) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        String strB;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            xu5<String, String, String, lu2<? super j6g>, Object> xu5Var = this.$onClickStartAutoApply;
            String str = this.$scheduleApplyJob.a;
            ljg ljgVar = this.$userPersona;
            if (ljgVar == null) {
                strB = "{}";
            } else {
                s98 s98Var = this.$json;
                s98Var.getClass();
                strB = s98Var.b(ljg.Companion.serializer(), ljgVar);
            }
            this.label = 1;
            Object objJ = xu5Var.j(str, "", strB, this);
            g13 g13Var = g13.a;
            if (objJ == g13Var) {
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

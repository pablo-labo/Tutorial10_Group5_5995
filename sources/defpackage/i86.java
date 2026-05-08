package defpackage;

import com.indeed.android.ghostwriter.services.GhostwriterRetrofitApiResolver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.ghostwriter.services.GhostwriterTasks$deleteApplication$deleteApplicationResponse$1", f = "GhostwriterTasks.kt", l = {189}, m = "invokeSuspend")
public final class i86 extends c1f implements Function1<lu2<? super m6d<j6g>>, Object> {
    final /* synthetic */ String $applicationId;
    int label;
    final /* synthetic */ r86 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i86(r86 r86Var, String str, lu2<? super i86> lu2Var) {
        super(1, lu2Var);
        this.this$0 = r86Var;
        this.$applicationId = str;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new i86(this.this$0, this.$applicationId, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super m6d<j6g>> lu2Var) {
        return ((i86) create(lu2Var)).invokeSuspend(j6g.a);
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
        String str = this.$applicationId;
        this.label = 1;
        Object objDeleteApplication = ghostwriterRetrofitApiResolverC.deleteApplication(str, this);
        g13 g13Var = g13.a;
        return objDeleteApplication == g13Var ? g13Var : objDeleteApplication;
    }
}

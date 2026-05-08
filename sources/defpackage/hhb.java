package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.postapply.PostApplyBannerKt$PostApplyBanner$5$1$1", f = "PostApplyBanner.kt", l = {101}, m = "invokeSuspend")
public final class hhb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ gu5<j6g> $onAppear;
    final /* synthetic */ gu5<j6g> $onTimeout;
    final /* synthetic */ long $timeoutMillis;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhb(gu5<j6g> gu5Var, long j, gu5<j6g> gu5Var2, lu2<? super hhb> lu2Var) {
        super(2, lu2Var);
        this.$onAppear = gu5Var;
        this.$timeoutMillis = j;
        this.$onTimeout = gu5Var2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new hhb(this.$onAppear, this.$timeoutMillis, this.$onTimeout, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((hhb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            this.$onAppear.invoke();
            long j = this.$timeoutMillis;
            this.label = 1;
            Object objB = ls3.b(j, this);
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
        this.$onTimeout.invoke();
        return j6g.a;
    }
}

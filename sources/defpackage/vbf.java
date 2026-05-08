package defpackage;

import com.indeed.android.jobsearch.backend.api.termsconsent.TermsConsentRetrofitApiResolver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.backend.tasks.TermsConsentTasks$recordUserConsentForTerms$2", f = "TermsConsentTasks.kt", l = {17}, m = "invokeSuspend")
public final class vbf extends c1f implements Function1<lu2<? super m6d<j6g>>, Object> {
    int label;
    final /* synthetic */ wbf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vbf(wbf wbfVar, lu2<? super vbf> lu2Var) {
        super(1, lu2Var);
        this.this$0 = wbfVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new vbf(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super m6d<j6g>> lu2Var) {
        return ((vbf) create(lu2Var)).invokeSuspend(j6g.a);
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
        TermsConsentRetrofitApiResolver termsConsentRetrofitApiResolverC = this.this$0.c();
        ubf ubfVar = new ubf(r03.p(d93.f()));
        this.label = 1;
        Object objRecordUserConsentForTerms = termsConsentRetrofitApiResolverC.recordUserConsentForTerms(ubfVar, this);
        g13 g13Var = g13.a;
        return objRecordUserConsentForTerms == g13Var ? g13Var : objRecordUserConsentForTerms;
    }
}

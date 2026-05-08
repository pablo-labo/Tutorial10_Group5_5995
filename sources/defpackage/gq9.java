package defpackage;

import com.indeed.android.rnmessaging.api.MessagingRetrofitApiResolver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.rnmessaging.api.MessagingApiClient$reportSpam$3", f = "MessagingApiClient.kt", l = {53}, m = "invokeSuspend")
public final class gq9 extends c1f implements Function1<lu2<? super m6d<j6g>>, Object> {
    final /* synthetic */ String $additionalInfo;
    final /* synthetic */ String $base64ConvId;
    final /* synthetic */ String $reportType;
    int label;
    final /* synthetic */ iq9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq9(iq9 iq9Var, String str, String str2, String str3, lu2<? super gq9> lu2Var) {
        super(1, lu2Var);
        this.this$0 = iq9Var;
        this.$base64ConvId = str;
        this.$reportType = str2;
        this.$additionalInfo = str3;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new gq9(this.this$0, this.$base64ConvId, this.$reportType, this.$additionalInfo, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super m6d<j6g>> lu2Var) {
        return ((gq9) create(lu2Var)).invokeSuspend(j6g.a);
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
        MessagingRetrofitApiResolver messagingRetrofitApiResolver = this.this$0.a;
        String str = this.$base64ConvId;
        z2d z2dVar = new z2d(this.$reportType, this.$additionalInfo);
        this.label = 1;
        Object objReportSpam = messagingRetrofitApiResolver.reportSpam(str, z2dVar, this);
        g13 g13Var = g13.a;
        return objReportSpam == g13Var ? g13Var : objReportSpam;
    }
}

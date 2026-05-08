package defpackage;

import com.indeed.android.myjobs.data.model.BrandedAdsLoggingRequestParams;
import com.indeed.android.myjobs.data.remote.api.BrandedAdsLoggingApiService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.data.repository.BrandedAdsRemoteRepositoryImpl$logBrandedAds$2", f = "BrandedAdsRemoteRepositoryImpl.kt", l = {27}, m = "invokeSuspend")
public final class em1 extends c1f implements Function1<lu2<? super m6d<j6g>>, Object> {
    final /* synthetic */ BrandedAdsLoggingRequestParams $params;
    int label;
    final /* synthetic */ fm1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em1(fm1 fm1Var, BrandedAdsLoggingRequestParams brandedAdsLoggingRequestParams, lu2<? super em1> lu2Var) {
        super(1, lu2Var);
        this.this$0 = fm1Var;
        this.$params = brandedAdsLoggingRequestParams;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new em1(this.this$0, this.$params, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super m6d<j6g>> lu2Var) {
        return ((em1) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            BrandedAdsLoggingApiService brandedAdsLoggingApiService = this.this$0.k0;
            String flowPage = this.$params.getFlowPage();
            String flowType = this.$params.getFlowType();
            String logType = this.$params.getLogType();
            String creativeKey = this.$params.getCreativeKey();
            String mobtk = this.$params.getMobtk();
            String fccKey = this.$params.getFccKey();
            String logLabel = this.$params.getLogLabel();
            String reason = this.$params.getReason();
            this.label = 1;
            obj = brandedAdsLoggingApiService.logBrandedAds(flowPage, flowType, logType, creativeKey, mobtk, fccKey, logLabel, reason, this);
            g13 g13Var = g13.a;
            if (obj == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        return (m6d) obj;
    }
}

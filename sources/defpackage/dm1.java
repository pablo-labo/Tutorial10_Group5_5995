package defpackage;

import com.indeed.android.myjobs.data.model.BrandedAdsApiRequestParams;
import com.indeed.android.myjobs.data.model.BrandedAdsApiResponse;
import com.indeed.android.myjobs.data.remote.api.BrandedAdsApiService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.data.repository.BrandedAdsRemoteRepositoryImpl$getBrandedAds$2", f = "BrandedAdsRemoteRepositoryImpl.kt", l = {18}, m = "invokeSuspend")
public final class dm1 extends c1f implements Function1<lu2<? super m6d<BrandedAdsApiResponse>>, Object> {
    final /* synthetic */ BrandedAdsApiRequestParams $params;
    int label;
    final /* synthetic */ fm1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm1(fm1 fm1Var, BrandedAdsApiRequestParams brandedAdsApiRequestParams, lu2<? super dm1> lu2Var) {
        super(1, lu2Var);
        this.this$0 = fm1Var;
        this.$params = brandedAdsApiRequestParams;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new dm1(this.this$0, this.$params, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super m6d<BrandedAdsApiResponse>> lu2Var) {
        return ((dm1) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            BrandedAdsApiService brandedAdsApiService = this.this$0.j0;
            String flowPage = this.$params.getFlowPage();
            String flowType = this.$params.getFlowType();
            this.label = 1;
            obj = brandedAdsApiService.getBrandedAds(flowPage, flowType, this);
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

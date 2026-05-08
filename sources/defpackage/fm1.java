package defpackage;

import com.indeed.android.myjobs.data.model.BrandedAdsApiRequestParams;
import com.indeed.android.myjobs.data.model.BrandedAdsLoggingRequestParams;
import com.indeed.android.myjobs.data.remote.api.BrandedAdsApiService;
import com.indeed.android.myjobs.data.remote.api.BrandedAdsLoggingApiService;

/* JADX INFO: loaded from: classes3.dex */
public final class fm1 extends ypd implements cm1 {
    public final BrandedAdsApiService j0;
    public final BrandedAdsLoggingApiService k0;

    public fm1(BrandedAdsApiService brandedAdsApiService, BrandedAdsLoggingApiService brandedAdsLoggingApiService) {
        super(18);
        this.j0 = brandedAdsApiService;
        this.k0 = brandedAdsLoggingApiService;
    }

    @Override // defpackage.cm1
    public final vi5 a(BrandedAdsApiRequestParams brandedAdsApiRequestParams, b06 b06Var) {
        return ypd.z(new dm1(this, brandedAdsApiRequestParams, null));
    }

    @Override // defpackage.cm1
    public final vi5 p(BrandedAdsLoggingRequestParams brandedAdsLoggingRequestParams, y29 y29Var) {
        return ypd.z(new em1(this, brandedAdsLoggingRequestParams, null));
    }
}

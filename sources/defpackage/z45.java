package defpackage;

import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.backendservices.common.api.b;
import com.indeed.android.jobsearch.backend.api.external.ExternalRetrofitApiResolver;
import com.indeed.android.jobsearch.backend.tasks.NewJobsCountResponse;
import defpackage.bad;
import defpackage.xh8;
import kotlin.jvm.functions.Function2;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* JADX INFO: loaded from: classes2.dex */
public final class z45 implements y45, xh8 {
    public final p87 a;
    public final ExternalRetrofitApiResolver b;

    public z45(p87 p87Var, OkHttpClient okHttpClient, String str) {
        p87Var.getClass();
        okHttpClient.getClass();
        this.a = p87Var;
        ra8 ra8VarA = sa8.a(new xr(4));
        str = str == null ? p87Var.h() : str;
        bad.b bVar = new bad.b();
        bVar.b = okHttpClient;
        bVar.a(str);
        MediaType.e.getClass();
        bVar.d.add(ewa.q(ra8VarA, MediaType.Companion.a("application/json")));
        ExternalRetrofitApiResolver externalRetrofitApiResolver = (ExternalRetrofitApiResolver) bVar.b().b(ExternalRetrofitApiResolver.class);
        externalRetrofitApiResolver.getClass();
        this.b = externalRetrofitApiResolver;
    }

    public final wg0<NewJobsCountResponse> T(String str, String str2, String str3, long j, Function2<? super ApiError, ? super Request, j6g> function2) {
        str2.getClass();
        str3.getClass();
        return j(this.b.getNewJobsCount(str, str2, str3, j), function2);
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // com.indeed.android.backendservices.common.api.b
    public final <ResponseType> wg0<ResponseType> j(av1<ResponseType> av1Var, Function2<? super ApiError, ? super Request, j6g> function2) {
        av1Var.getClass();
        m6d<ResponseType> m6dVarB = av1Var.b();
        m6dVarB.getClass();
        return b.a.b(this, m6dVarB, function2);
    }
}

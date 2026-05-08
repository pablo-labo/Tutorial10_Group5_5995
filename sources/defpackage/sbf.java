package defpackage;

import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.backendservices.common.api.b;
import com.indeed.android.jobsearch.backend.api.termsconsent.TermsConsentRetrofitApiResolver;
import defpackage.bad;
import defpackage.xh8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* JADX INFO: loaded from: classes2.dex */
public final class sbf implements rbf, xh8 {
    public final p87 a;
    public final TermsConsentRetrofitApiResolver b;

    public sbf(p87 p87Var, OkHttpClient okHttpClient) {
        okHttpClient.getClass();
        this.a = p87Var;
        ra8 ra8VarA = sa8.a(new bj(8));
        bad.b bVar = new bad.b();
        bVar.b = okHttpClient;
        bVar.a("https://secure.indeed.com/");
        MediaType.e.getClass();
        bVar.d.add(ewa.q(ra8VarA, MediaType.Companion.a("application/json")));
        TermsConsentRetrofitApiResolver termsConsentRetrofitApiResolver = (TermsConsentRetrofitApiResolver) bVar.b().b(TermsConsentRetrofitApiResolver.class);
        termsConsentRetrofitApiResolver.getClass();
        this.b = termsConsentRetrofitApiResolver;
    }

    @Override // defpackage.tbf
    public final TermsConsentRetrofitApiResolver c() {
        return this.b;
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // com.indeed.android.backendservices.common.api.b
    public final <ResponseType> Object r(Function1<? super lu2<? super m6d<ResponseType>>, ? extends Object> function1, Function2<? super ApiError, ? super Request, j6g> function2, lu2<? super wg0<ResponseType>> lu2Var) {
        return b.a.a(this, function1, function2, lu2Var);
    }
}

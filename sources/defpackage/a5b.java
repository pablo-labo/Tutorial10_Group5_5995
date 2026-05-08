package defpackage;

import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.backendservices.common.api.b;
import com.indeed.android.jobsearch.backend.api.passport.PassportRetrofitApiResolver;
import defpackage.bad;
import defpackage.xh8;
import kotlin.jvm.functions.Function2;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* JADX INFO: loaded from: classes2.dex */
public final class a5b implements z4b, xh8 {
    public final p87 a;
    public final OkHttpClient b;
    public final ra8 c;

    public a5b(p87 p87Var, OkHttpClient okHttpClient) {
        okHttpClient.getClass();
        this.a = p87Var;
        this.b = okHttpClient;
        this.c = sa8.a(new hu(11));
    }

    @Override // defpackage.b5b
    public final PassportRetrofitApiResolver c() {
        String strF = this.a.f();
        bad.b bVar = new bad.b();
        bVar.c(this.b);
        bVar.a(strF);
        MediaType.e.getClass();
        bVar.d.add(ewa.q(this.c, MediaType.Companion.a("application/json")));
        PassportRetrofitApiResolver passportRetrofitApiResolver = (PassportRetrofitApiResolver) bVar.b().b(PassportRetrofitApiResolver.class);
        passportRetrofitApiResolver.getClass();
        return passportRetrofitApiResolver;
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

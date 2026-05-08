package defpackage;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes2.dex */
public final class bsa implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request.Builder builderB = realInterceptorChain.e.b();
        builderB.d("indeed-api-key", "87a0749e1d2ea18f2cfe899d32d63a9a5d417e571991de20daaa66fb7bee8ad6");
        builderB.d("indeed-co", d93.a());
        builderB.d("indeed-locale", r03.p(d93.f()));
        return realInterceptorChain.b(builderB.b());
    }
}

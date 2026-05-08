package defpackage;

import defpackage.c87;
import defpackage.xh8;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes2.dex */
public final class c83 implements Interceptor, xh8 {
    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request.Builder builderB = realInterceptorChain.e.b();
        d2f d2fVar = c87.a;
        String strA = c87.a.a(ez2.W);
        if (strA != null && strA.length() != 0) {
            builderB.a("Cookie", "CSRF=".concat(strA));
            builderB.d("X-Xsrf-Token", strA);
        }
        return realInterceptorChain.b(builderB.b());
    }
}

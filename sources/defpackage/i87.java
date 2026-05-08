package defpackage;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes2.dex */
public final class i87 implements Interceptor {
    public final g87 a;

    public i87(g87 g87Var) {
        g87Var.getClass();
        this.a = g87Var;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request.Builder builderB = realInterceptorChain.e.b();
        String strB = this.a.b();
        if (strB != null) {
            builderB.d("Device-ID", strB);
        }
        return realInterceptorChain.b(builderB.b());
    }
}

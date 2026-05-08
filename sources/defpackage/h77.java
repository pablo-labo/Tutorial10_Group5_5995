package defpackage;

import defpackage.xh8;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes2.dex */
public final class h77 implements Interceptor, xh8 {
    public final d2f a = new d2f(new la(this, 12));

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request.Builder builderB = realInterceptorChain.e.b();
        builderB.d("indeed-app-info", (String) this.a.getValue());
        return realInterceptorChain.b(builderB.b());
    }
}

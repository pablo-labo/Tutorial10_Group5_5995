package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes2.dex */
public final class i77 implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.e;
        ep5 ep5Var = ep5.a;
        ArrayList arrayListH1 = z92.h1(ep5Var.c(), ep5Var.a());
        ep5Var.f();
        String strW0 = z92.W0(z92.h1(arrayListH1, u63.b0(null)), ",", null, null, new wd(4), 30);
        if (strW0.length() == 0) {
            return realInterceptorChain.b(request);
        }
        Request.Builder builderB = request.b();
        builderB.d("indeed-prforce-groups", strW0);
        return realInterceptorChain.b(builderB.b());
    }
}

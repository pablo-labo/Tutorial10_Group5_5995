package defpackage;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kq9 implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.e;
        Request.Builder builderB = request.b();
        HttpUrl.Builder builderF = request.a.f();
        builderF.a("clientApp", "MESSAGES_NATIVE_ANDROID");
        builderF.a("hl", ((ep7) cr8.p(ep7.class)).b().b);
        builderF.a("co", ((ep7) cr8.p(ep7.class)).b().a);
        builderB.a = builderF.b();
        String strE = ((pp7) cr8.p(pp7.class)).e();
        if (strE != null) {
            builderB.a("Cookie", "CTK=".concat(strE));
        }
        return realInterceptorChain.b(builderB.b());
    }
}

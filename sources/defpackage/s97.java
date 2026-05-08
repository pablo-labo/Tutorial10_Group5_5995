package defpackage;

import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes2.dex */
public final class s97 implements Interceptor {
    public final gu5<String> a;

    public s97(gu5<String> gu5Var) {
        this.a = gu5Var;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request.Builder builderB = realInterceptorChain.e.b();
        builderB.d(DataOkHttpUploader.HEADER_USER_AGENT, this.a.invoke());
        return realInterceptorChain.b(builderB.b());
    }
}

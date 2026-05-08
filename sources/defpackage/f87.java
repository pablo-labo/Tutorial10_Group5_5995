package defpackage;

import com.indeed.android.jobsearch.backend.util.a;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes2.dex */
public final class f87 implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request.Builder builderB = realInterceptorChain.e.b();
        String strA = a.a();
        if (strA == null) {
            strA = "";
        }
        if (strA.length() > 0) {
            builderB.d("indeed-ctk", strA);
        }
        return realInterceptorChain.b(builderB.b());
    }
}

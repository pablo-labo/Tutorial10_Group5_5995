package defpackage;

import defpackage.c87;
import defpackage.xh8;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes2.dex */
public final class lee implements Interceptor, xh8 {
    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request.Builder builderB = realInterceptorChain.e.b();
        boolean z = this instanceof ai8;
        d2f d2fVar = c87.a;
        String strA = c87.a.a(ez2.c);
        String strA2 = c87.a.a(ez2.d);
        if (strA != null && strA.length() != 0 && strA2 != null && strA2.length() != 0) {
            builderB.d("Cookie", t40.l("SHOE=", strA, "; SOCK=", strA2));
        }
        return realInterceptorChain.b(builderB.b());
    }
}

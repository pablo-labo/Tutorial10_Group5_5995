package defpackage;

import com.indeed.android.jobsearch.backend.util.a;
import defpackage.c87;
import defpackage.xh8;
import java.util.StringJoiner;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes2.dex */
public final class u35 implements Interceptor, xh8 {
    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.e;
        Request.Builder builderB = request.b();
        StringJoiner stringJoiner = new StringJoiner("; ");
        boolean z = this instanceof ai8;
        d2f d2fVar = c87.a;
        String strA = c87.a.a(ez2.c);
        String strA2 = c87.a.a(ez2.d);
        if (strA != null && strA.length() != 0 && strA2 != null && strA2.length() != 0) {
            stringJoiner.add("SHOE=" + strA + "; SOCK=" + strA2);
        }
        String strA3 = request.c.a("Cookie");
        if (strA3 != null && strA3.length() != 0) {
            stringJoiner.add(strA3);
        }
        String strA4 = a.a();
        if (strA4 != null && strA4.length() != 0) {
            stringJoiner.add("CTK=".concat(strA4));
        }
        String string = stringJoiner.toString();
        string.getClass();
        if (string.length() > 0) {
            String string2 = stringJoiner.toString();
            string2.getClass();
            builderB.d("Cookie", string2);
        }
        return realInterceptorChain.b(builderB.b());
    }
}

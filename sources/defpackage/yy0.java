package defpackage;

import com.indeed.android.jobsearch.backend.tasks.ConvertCookiesResponse;
import defpackage.c87;
import defpackage.xh8;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes2.dex */
public final class yy0 implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        String str;
        qpd qpdVarD;
        Class<c87> cls;
        iwc iwcVar;
        qpd qpdVarD2;
        Class<c87> cls2;
        iwc iwcVar2;
        qpd qpdVarD3;
        Class<z4b> cls3;
        iwc iwcVar3;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request.Builder builderB = realInterceptorChain.e.b();
        xh8 xh8Var = zma.a;
        synchronized (xh8Var) {
            try {
                str = null;
                if (xh8Var instanceof ai8) {
                    qpdVarD = ((ai8) xh8Var).d();
                    cls = c87.class;
                    iwcVar = fwc.a;
                } else {
                    qpdVarD = (qpd) xh8.a.a().a.b;
                    cls = c87.class;
                    iwcVar = fwc.a;
                }
                d2f d2fVar = c87.a;
                String strA = c87.a.a(ez2.c);
                if (xh8Var instanceof ai8) {
                    qpdVarD2 = ((ai8) xh8Var).d();
                    cls2 = c87.class;
                    iwcVar2 = fwc.a;
                } else {
                    qpdVarD2 = (qpd) xh8.a.a().a.b;
                    cls2 = c87.class;
                    iwcVar2 = fwc.a;
                }
                String strA2 = c87.a.a(ez2.d);
                if (strA != null && strA.length() != 0 && strA2 != null && strA2.length() != 0) {
                    if (!wl7.b(zma.e, strA) || !wl7.b(zma.f, strA2)) {
                        zma.c = null;
                    }
                    zma.e = strA;
                    zma.f = strA2;
                    String str2 = zma.c;
                    if (str2 == null || str2.length() == 0 || zma.d < System.currentTimeMillis() + 60000) {
                        if (xh8Var instanceof ai8) {
                            qpdVarD3 = ((ai8) xh8Var).d();
                            cls3 = z4b.class;
                            iwcVar3 = fwc.a;
                        } else {
                            qpdVarD3 = (qpd) xh8.a.a().a.b;
                            cls3 = z4b.class;
                            iwcVar3 = fwc.a;
                        }
                        ConvertCookiesResponse convertCookiesResponse = (ConvertCookiesResponse) ((z4b) qpdVarD3.a(null, iwcVar3.b(cls3), null)).z(new jm0(10)).b();
                        if (convertCookiesResponse != null) {
                            zma.c = convertCookiesResponse.a;
                            zma.d = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(convertCookiesResponse.b);
                            str = convertCookiesResponse.a;
                        }
                    } else {
                        str = zma.c;
                    }
                }
            } catch (Exception e) {
                ArrayList arrayList = lz2.a;
                lz2.b("OAuthTokenHolder", "Error retrieving convert cookies response, returning null", false, e);
            } finally {
            }
        }
        if (str != null && str.length() != 0) {
            builderB.d("Authorization", "Bearer ".concat(str));
        }
        return realInterceptorChain.b(builderB.b());
    }
}

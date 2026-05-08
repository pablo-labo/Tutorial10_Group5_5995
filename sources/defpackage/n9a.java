package defpackage;

import android.os.Trace;
import com.datadog.android.log.Logger;
import com.datadog.android.okhttp.trace.TracingInterceptor;
import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import defpackage.pgd;
import defpackage.s87;
import defpackage.xh8;
import java.util.ArrayList;
import kotlin.Lazy;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes2.dex */
public final class n9a implements Interceptor, xh8 {
    public final Lazy a;
    public final Lazy b;
    public final pnb c;
    public final pxc d;

    public static final class a extends mj8 implements gu5<Logger> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n9a n9aVar) {
            super(0);
            this.$this_inject = n9aVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [com.datadog.android.log.Logger, java.lang.Object] */
        @Override // defpackage.gu5
        public final Logger invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(Logger.class), a9cVar);
        }
    }

    public static final class b extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n9a n9aVar) {
            super(0);
            this.$this_inject = n9aVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public n9a() {
        a aVar = new a(this);
        qt8 qt8Var = qt8.a;
        this.a = boa.E(qt8Var, aVar);
        this.b = boa.E(qt8Var, new b(this));
        this.c = new pnb(22);
        this.d = new pxc(".*\"operationName\":\\s*\"(\\w+)\".*");
    }

    public final void a(Request request, Response response, Exception exc, long j, String str, pgd pgdVar, String str2) {
        String strA;
        String strA2;
        String strA3;
        Long lC;
        pgd.n0 n0Var = pgdVar.a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = response != null ? response.Z : j;
        if (response != null) {
            jCurrentTimeMillis = response.a0;
        }
        long j3 = jCurrentTimeMillis;
        long j4 = j3 - j2;
        long length = 0;
        long j5 = response != null ? response.d : 0L;
        String strConcat = exc != null ? "Native HTTP Metrics - Request Failed: ".concat(exc.getClass().getSimpleName()) : "Native HTTP Metrics";
        Lazy<s87> lazy = s87.f;
        gz4 gz4Var = (gz4) this.b.getValue();
        HttpUrl httpUrl = request.a;
        Headers headers = request.c;
        String str3 = httpUrl.i;
        String str4 = request.b;
        long size = headers.size();
        String strA4 = headers.a("referer");
        long size2 = response != null ? response.f.size() : 0L;
        long jLongValue = (response == null || (strA3 = response.f.a("Content-Length")) == null || (lC = vve.C(strA3)) == null) ? 0L : lC.longValue();
        if (response == null || (strA = response.f.a(TracingInterceptor.HEADER_CT)) == null) {
            strA = exc != null ? "Error" : ViewUtilsKt.UNKNOWN_DESTINATION_URL;
        }
        String str5 = strA;
        if (response != null && (strA2 = response.f.a("Set-Cookie")) != null) {
            length = strA2.length();
        }
        String strA5 = n0Var.a();
        this.c.getClass();
        str4.getClass();
        s87.a.a(gz4Var, new g9a(str3, str4, j2, size, strA4, j3, size2, jLongValue, str5, length, j5, j4, strConcat, strA5, str2));
        pi3.i((Logger) this.a.getValue(), request.b, j4, j5, str, n0Var.a(), str2);
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws Exception {
        n9a n9aVar;
        ie9 ie9VarB;
        Response response;
        n9a n9aVar2;
        Exception exc;
        Response response2;
        Exception exc2;
        Request request = ((RealInterceptorChain) chain).e;
        String str = request.a.i;
        pgd pgdVarB = yhg.a.b(str, str);
        String str2 = "";
        if (wl7.b(pgdVarB, pgd.k.b)) {
            try {
                zn1 zn1Var = new zn1();
                RequestBody requestBody = request.d;
                if (requestBody != null) {
                    requestBody.writeTo(zn1Var);
                }
                n9aVar = this;
                try {
                    ke9 ke9VarA = n9aVar.d.a(zn1Var.z1(), 0);
                    if (ke9VarA != null && (ie9VarB = ke9VarA.c.b(1)) != null) {
                        str2 = ie9VarB.a;
                    }
                } catch (Exception e) {
                    e = e;
                    ArrayList arrayList = lz2.a;
                    lz2.b("NativeHttpMetricsInterceptor", "error logging operationName from graphQL request", false, e);
                }
            } catch (Exception e2) {
                e = e2;
                n9aVar = this;
            }
        } else {
            n9aVar = this;
        }
        String str3 = str2;
        String strB = request.a.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String[] strArr = {"apiCall", pgdVarB.a.a(), strB, str3};
        md2 md2Var = new md2(2);
        md2Var.b("appTrace");
        md2Var.c(strArr);
        ArrayList arrayList2 = (ArrayList) md2Var.a;
        Trace.beginSection(jpf.g(z92.W0(u63.a0(arrayList2.toArray(new String[arrayList2.size()])), "|", null, null, null, 62)));
        try {
            try {
                Response responseB = ((RealInterceptorChain) chain).b(((RealInterceptorChain) chain).e);
                Trace.endSection();
                exc = null;
                n9aVar2 = n9aVar;
                response = responseB;
            } catch (Exception e3) {
                ArrayList arrayList3 = lz2.a;
                lz2.b("NativeHttpMetricsInterceptor", "Network request failed, logging metrics for failure", false, e3);
                Trace.endSection();
                n9a n9aVar3 = n9aVar;
                response = null;
                n9aVar2 = n9aVar3;
                exc = e3;
            }
            try {
                n9aVar2.a(request, response, exc, jCurrentTimeMillis, str, pgdVarB, str3);
                response2 = response;
                exc2 = exc;
            } catch (Exception e4) {
                response2 = response;
                exc2 = exc;
                ArrayList arrayList4 = lz2.a;
                lz2.b("NativeHttpMetricsInterceptor", "Failed to log HTTP metrics", false, e4);
            }
            if (exc2 != null) {
                throw exc2;
            }
            response2.getClass();
            return response2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}

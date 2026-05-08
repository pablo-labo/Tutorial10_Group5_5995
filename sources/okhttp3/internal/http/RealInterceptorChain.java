package okhttp3.internal.http;

import defpackage.r6;
import defpackage.v40;
import defpackage.wl7;
import java.util.ArrayList;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.ExchangeFinder;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/Interceptor$Chain;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RealInterceptorChain implements Interceptor.Chain {
    public final RealCall a;
    public final ArrayList b;
    public final int c;
    public final Exchange d;
    public final Request e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public RealInterceptorChain(RealCall realCall, ArrayList arrayList, int i, Exchange exchange, Request request, int i2, int i3, int i4) {
        request.getClass();
        this.a = realCall;
        this.b = arrayList;
        this.c = i;
        this.d = exchange;
        this.e = request;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public static RealInterceptorChain c(RealInterceptorChain realInterceptorChain, int i, Exchange exchange, Request request, int i2) {
        if ((i2 & 1) != 0) {
            i = realInterceptorChain.c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            exchange = realInterceptorChain.d;
        }
        Exchange exchange2 = exchange;
        if ((i2 & 4) != 0) {
            request = realInterceptorChain.e;
        }
        Request request2 = request;
        int i4 = realInterceptorChain.f;
        int i5 = realInterceptorChain.g;
        int i6 = realInterceptorChain.h;
        request2.getClass();
        return new RealInterceptorChain(realInterceptorChain.a, realInterceptorChain.b, i3, exchange2, request2, i4, i5, i6);
    }

    @Override // okhttp3.Interceptor.Chain
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Request getE() {
        return this.e;
    }

    @Override // okhttp3.Interceptor.Chain
    public final Response b(Request request) {
        request.getClass();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i >= size) {
            r6.g("Check failed.");
            return null;
        }
        this.i++;
        Exchange exchange = this.d;
        if (exchange != null) {
            ExchangeFinder exchangeFinder = exchange.c;
            HttpUrl httpUrl = request.a;
            exchangeFinder.getClass();
            httpUrl.getClass();
            HttpUrl httpUrl2 = exchangeFinder.b.i;
            if (httpUrl.e != httpUrl2.e || !wl7.b(httpUrl.d, httpUrl2.d)) {
                v40.o("network interceptor ", arrayList.get(i - 1), " must retain the same host and port");
                return null;
            }
            if (this.i != 1) {
                v40.o("network interceptor ", arrayList.get(i - 1), " must call proceed() exactly once");
                return null;
            }
        }
        int i2 = i + 1;
        RealInterceptorChain realInterceptorChainC = c(this, i2, null, request, 58);
        Interceptor interceptor = (Interceptor) arrayList.get(i);
        Response responseIntercept = interceptor.intercept(realInterceptorChainC);
        if (responseIntercept == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (exchange != null && i2 < arrayList.size() && realInterceptorChainC.i != 1) {
            v40.o("network interceptor ", interceptor, " must call proceed() exactly once");
            return null;
        }
        if (responseIntercept.V != null) {
            return responseIntercept;
        }
        v40.o("interceptor ", interceptor, " returned a response with no body");
        return null;
    }
}

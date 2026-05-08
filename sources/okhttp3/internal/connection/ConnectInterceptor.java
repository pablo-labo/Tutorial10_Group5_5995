package okhttp3.internal.connection;

import defpackage.j6g;
import defpackage.r40;
import defpackage.wl7;
import java.io.IOException;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/ConnectInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ConnectInterceptor implements Interceptor {
    public static final ConnectInterceptor a = new ConnectInterceptor();

    private ConnectInterceptor() {
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        RealCall realCall = realInterceptorChain.a;
        synchronized (realCall) {
            if (!realCall.d0) {
                throw new IllegalStateException("released");
            }
            if (realCall.c0) {
                throw new IllegalStateException("Check failed.");
            }
            if (realCall.b0) {
                throw new IllegalStateException("Check failed.");
            }
            j6g j6gVar = j6g.a;
        }
        ExchangeFinder exchangeFinder = realCall.X;
        exchangeFinder.getClass();
        OkHttpClient okHttpClient = realCall.a;
        okHttpClient.getClass();
        try {
            Exchange exchange = new Exchange(realCall, realCall.e, exchangeFinder, exchangeFinder.a(realInterceptorChain.f, realInterceptorChain.g, realInterceptorChain.h, okHttpClient.f, !wl7.b(realInterceptorChain.e.b, "GET")).j(okHttpClient, realInterceptorChain));
            realCall.a0 = exchange;
            realCall.f0 = exchange;
            synchronized (realCall) {
                realCall.b0 = true;
                realCall.c0 = true;
            }
            if (!realCall.e0) {
                return RealInterceptorChain.c(realInterceptorChain, 0, exchange, null, 61).b(realInterceptorChain.e);
            }
            r40.h("Canceled");
            return null;
        } catch (IOException e) {
            exchangeFinder.b(e);
            throw new RouteException(e);
        } catch (RouteException e2) {
            exchangeFinder.b(e2.getLastConnectException());
            throw e2;
        }
    }
}

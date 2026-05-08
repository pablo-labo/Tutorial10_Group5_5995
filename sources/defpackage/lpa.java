package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.imagepipeline.backends.okhttp3.OkHttpNetworkFetcherException;
import defpackage.aga;
import defpackage.xr1;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes2.dex */
public class lpa extends ka6 {
    public final OkHttpClient d;
    public final ExecutorService e;
    public final CacheControl f;

    public static final class a extends n85 {
        public long f;
        public long g;
        public long h;

        public a() {
            throw null;
        }
    }

    public lpa(OkHttpClient okHttpClient) {
        ExecutorService executorServiceA = okHttpClient.a.a();
        this.d = okHttpClient;
        this.e = executorServiceA;
        CacheControl.Builder builder = new CacheControl.Builder();
        builder.b = true;
        this.f = builder.a();
    }

    public static final void J1(lpa lpaVar, Call call, Exception exc, aga.a aVar) {
        if (call.getE0()) {
            aVar.a();
        } else {
            aVar.b(exc);
        }
    }

    public static final IOException K1(lpa lpaVar, String str, Response response) {
        Response response2 = response.W;
        return new IOException(str, new OkHttpNetworkFetcherException(response2 != null ? Integer.valueOf(response2.d) : null, response2 != null ? response2.f : null));
    }

    @Override // defpackage.ka6
    public final void K0(n85 n85Var) {
        a aVar = (a) n85Var;
        aVar.getClass();
        aVar.h = SystemClock.elapsedRealtime();
    }

    @Override // defpackage.ka6
    /* JADX INFO: renamed from: L1, reason: merged with bridge method [inline-methods] */
    public void e0(a aVar, aga.a aVar2) {
        aVar.getClass();
        aVar.f = SystemClock.elapsedRealtime();
        ppb ppbVar = aVar.b;
        Uri uri = ppbVar.Q().b;
        uri.getClass();
        try {
            Request.Builder builder = new Request.Builder();
            builder.g(uri.toString());
            builder.e("GET", null);
            CacheControl cacheControl = this.f;
            if (cacheControl != null) {
                builder.c(cacheControl);
            }
            xr1 xr1Var = ppbVar.Q().j;
            if (xr1Var != null) {
                d2f d2fVar = xr1.c;
                builder.a("Range", String.format(null, "bytes=%s-%s", Arrays.copyOf(new Object[]{xr1.a.a(xr1Var.a), xr1.a.a(xr1Var.b)}, 2)));
            }
            M1(aVar, aVar2, builder.b());
        } catch (Exception e) {
            aVar2.b(e);
        }
    }

    public final void M1(a aVar, aga.a aVar2, Request request) {
        aVar.getClass();
        OkHttpClient okHttpClient = this.d;
        okHttpClient.getClass();
        RealCall realCall = new RealCall(okHttpClient, request, false);
        aVar.b.v(new mpa(realCall, this));
        realCall.R0(new npa(aVar, this, aVar2));
    }

    @Override // defpackage.ka6
    public final n85 T(xq2 xq2Var, ppb ppbVar) {
        xq2Var.getClass();
        ppbVar.getClass();
        return new a(xq2Var, ppbVar);
    }

    @Override // defpackage.ka6
    public final Map m0(n85 n85Var, int i) {
        a aVar = (a) n85Var;
        aVar.getClass();
        return lc9.a0(new Pair("queue_time", String.valueOf(aVar.g - aVar.f)), new Pair("fetch_time", String.valueOf(aVar.h - aVar.g)), new Pair("total_time", String.valueOf(aVar.h - aVar.f)), new Pair("image_size", String.valueOf(i)));
    }
}

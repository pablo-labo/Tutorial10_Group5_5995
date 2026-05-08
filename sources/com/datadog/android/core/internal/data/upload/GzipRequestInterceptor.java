package com.datadog.android.core.internal.data.upload;

import com.datadog.android.api.InternalLogger;
import defpackage.gu5;
import defpackage.ie6;
import defpackage.ro1;
import defpackage.tqc;
import defpackage.u63;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/GzipRequestInterceptor;", "Lokhttp3/Interceptor;", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "(Lcom/datadog/android/api/InternalLogger;)V", GzipRequestInterceptor.ENCODING_GZIP, "Lokhttp3/RequestBody;", "body", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class GzipRequestInterceptor implements Interceptor {
    private static final String ENCODING_GZIP = "gzip";
    private static final String HEADER_ENCODING = "Content-Encoding";
    private final InternalLogger internalLogger;

    public GzipRequestInterceptor(InternalLogger internalLogger) {
        internalLogger.getClass();
        this.internalLogger = internalLogger;
    }

    private final RequestBody gzip(final RequestBody body) {
        return new RequestBody() { // from class: com.datadog.android.core.internal.data.upload.GzipRequestInterceptor.gzip.1
            @Override // okhttp3.RequestBody
            public long contentLength() {
                return -1L;
            }

            @Override // okhttp3.RequestBody
            /* JADX INFO: renamed from: contentType */
            public MediaType getC() {
                return body.getC();
            }

            @Override // okhttp3.RequestBody
            public void writeTo(ro1 sink) throws Throwable {
                sink.getClass();
                tqc tqcVar = new tqc(new ie6(sink));
                body.writeTo(tqcVar);
                tqcVar.close();
            }
        };
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        Request e = chain.getE();
        RequestBody requestBody = e.d;
        if (requestBody == null || e.c.a(HEADER_ENCODING) != null || (requestBody instanceof MultipartBody)) {
            return chain.b(e);
        }
        try {
            Request.Builder builderB = e.b();
            builderB.d(HEADER_ENCODING, ENCODING_GZIP);
            builderB.e(e.b, gzip(requestBody));
            e = builderB.b();
        } catch (Exception e2) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) GzipRequestInterceptor$intercept$compressedRequest$1.INSTANCE, (Throwable) e2, false, (Map) null, 48, (Object) null);
        }
        return chain.b(e);
    }
}

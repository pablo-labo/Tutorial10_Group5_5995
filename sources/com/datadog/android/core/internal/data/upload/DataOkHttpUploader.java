package com.datadog.android.core.internal.data.upload;

import android.net.TrafficStats;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.net.Request;
import com.datadog.android.api.net.RequestExecutionContext;
import com.datadog.android.api.net.RequestFactory;
import com.datadog.android.api.storage.RawBatchEvent;
import com.datadog.android.core.internal.data.upload.UploadStatus;
import com.datadog.android.core.internal.persistence.BatchId;
import com.datadog.android.core.internal.system.AndroidInfoProvider;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.d2f;
import defpackage.gu5;
import defpackage.mj8;
import defpackage.u63;
import defpackage.v40;
import defpackage.wl7;
import defpackage.wve;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0001;B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\tH\u0002J\u0010\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020+H\u0002J\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0018H\u0002J\u0018\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u00102\u0006\u0010#\u001a\u00020$H\u0002J\u0012\u00101\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\tH\u0002J2\u00102\u001a\u00020\u00162\u0006\u00103\u001a\u0002042\f\u00105\u001a\b\u0012\u0004\u0012\u000207062\b\u00108\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010\u0018H\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001d\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u001c¨\u0006<"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/DataOkHttpUploader;", "Lcom/datadog/android/core/internal/data/upload/DataUploader;", "requestFactory", "Lcom/datadog/android/api/net/RequestFactory;", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "callFactory", "Lokhttp3/Call$Factory;", "sdkVersion", "", "androidInfoProvider", "Lcom/datadog/android/core/internal/system/AndroidInfoProvider;", "(Lcom/datadog/android/api/net/RequestFactory;Lcom/datadog/android/api/InternalLogger;Lokhttp3/Call$Factory;Ljava/lang/String;Lcom/datadog/android/core/internal/system/AndroidInfoProvider;)V", "getAndroidInfoProvider", "()Lcom/datadog/android/core/internal/system/AndroidInfoProvider;", "attempts", "", "getCallFactory", "()Lokhttp3/Call$Factory;", "getInternalLogger", "()Lcom/datadog/android/api/InternalLogger;", "previousUploadStatus", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "previousUploadedBatchId", "Lcom/datadog/android/core/internal/persistence/BatchId;", "getRequestFactory", "()Lcom/datadog/android/api/net/RequestFactory;", "getSdkVersion", "()Ljava/lang/String;", "userAgent", "getUserAgent", "userAgent$delegate", "Lkotlin/Lazy;", "buildOkHttpRequest", "Lokhttp3/Request;", "request", "Lcom/datadog/android/api/net/Request;", "executeUploadRequest", "isValidHeaderValue", "", "value", "isValidHeaderValueChar", "c", "", "resolveExecutionContext", "Lcom/datadog/android/api/net/RequestExecutionContext;", "batchID", "responseCodeToUploadStatus", "code", "sanitizeHeaderValue", "upload", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lcom/datadog/android/api/context/DatadogContext;", "batch", "", "Lcom/datadog/android/api/storage/RawBatchEvent;", "batchMeta", "", "batchId", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class DataOkHttpUploader implements DataUploader {
    public static final String HEADER_USER_AGENT = "User-Agent";
    public static final int HTTP_ACCEPTED = 202;
    public static final int HTTP_BAD_GATEWAY = 502;
    public static final int HTTP_BAD_REQUEST = 400;
    public static final int HTTP_CLIENT_TIMEOUT = 408;
    public static final int HTTP_ENTITY_TOO_LARGE = 413;
    public static final int HTTP_FORBIDDEN = 403;
    public static final int HTTP_GATEWAY_TIMEOUT = 504;
    public static final int HTTP_INSUFFICIENT_STORAGE = 507;
    public static final int HTTP_INTERNAL_ERROR = 500;
    public static final int HTTP_TOO_MANY_REQUESTS = 429;
    public static final int HTTP_UNAUTHORIZED = 401;
    public static final int HTTP_UNAVAILABLE = 503;
    public static final String SYSTEM_UA = "http.agent";
    public static final String WARNING_USER_AGENT_HEADER_RESERVED = "Ignoring provided User-Agent header, because it is reserved.";
    private final AndroidInfoProvider androidInfoProvider;
    private volatile int attempts;
    private final Call.Factory callFactory;
    private final InternalLogger internalLogger;
    private volatile UploadStatus previousUploadStatus;
    private volatile BatchId previousUploadedBatchId;
    private final RequestFactory requestFactory;
    private final String sdkVersion;

    /* JADX INFO: renamed from: userAgent$delegate, reason: from kotlin metadata */
    private final Lazy userAgent;

    /* JADX INFO: renamed from: com.datadog.android.core.internal.data.upload.DataOkHttpUploader$responseCodeToUploadStatus$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05131 extends mj8 implements gu5<String> {
        final /* synthetic */ int $code;
        final /* synthetic */ Request $request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05131(int i, Request request) {
            super(0);
            this.$code = i;
            this.$request = request;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return v40.c(this.$code, "Unexpected status code ", " on upload request: ", this.$request.getDescription());
        }
    }

    public DataOkHttpUploader(RequestFactory requestFactory, InternalLogger internalLogger, Call.Factory factory, String str, AndroidInfoProvider androidInfoProvider) {
        requestFactory.getClass();
        internalLogger.getClass();
        factory.getClass();
        str.getClass();
        androidInfoProvider.getClass();
        this.requestFactory = requestFactory;
        this.internalLogger = internalLogger;
        this.callFactory = factory;
        this.sdkVersion = str;
        this.androidInfoProvider = androidInfoProvider;
        this.attempts = 1;
        this.userAgent = new d2f(new DataOkHttpUploader$userAgent$2(this));
    }

    private final okhttp3.Request buildOkHttpRequest(Request request) {
        MediaType mediaTypeA = null;
        if (request.getContentType() != null) {
            MediaType.Companion companion = MediaType.e;
            String contentType = request.getContentType();
            companion.getClass();
            contentType.getClass();
            try {
                mediaTypeA = MediaType.Companion.a(contentType);
            } catch (IllegalArgumentException unused) {
            }
        }
        Request.Builder builder = new Request.Builder();
        builder.g(request.getUrl());
        builder.e("POST", RequestBody.Companion.d(RequestBody.INSTANCE, request.getBody(), mediaTypeA, 0, 6));
        for (Map.Entry<String, String> entry : request.getHeaders().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = key.toLowerCase(locale);
            lowerCase.getClass();
            if (lowerCase.equals("user-agent")) {
                InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, (gu5) AnonymousClass1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            } else {
                builder.a(key, value);
            }
        }
        builder.a(HEADER_USER_AGENT, getUserAgent());
        return builder.b();
    }

    private final UploadStatus executeUploadRequest(com.datadog.android.api.net.Request request) {
        Object next;
        Iterator<T> it = request.getHeaders().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wve.E((String) ((Map.Entry) next).getKey(), "DD-API-KEY", true)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        String str = entry != null ? (String) entry.getValue() : null;
        if (str != null && (str.length() == 0 || !isValidHeaderValue(str))) {
            return new UploadStatus.InvalidTokenError(0);
        }
        okhttp3.Request requestBuildOkHttpRequest = buildOkHttpRequest(request);
        TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
        Response responseB = this.callFactory.c(requestBuildOkHttpRequest).b();
        responseB.close();
        return responseCodeToUploadStatus(responseB.d, request);
    }

    private final String getUserAgent() {
        return (String) this.userAgent.getValue();
    }

    private final boolean isValidHeaderValue(String value) {
        for (int i = 0; i < value.length(); i++) {
            if (!isValidHeaderValueChar(value.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private final boolean isValidHeaderValueChar(char c) {
        if (c != '\t') {
            return ' ' <= c && c < 127;
        }
        return true;
    }

    private final RequestExecutionContext resolveExecutionContext(BatchId batchID) {
        Integer numValueOf = null;
        if (batchID == null || this.previousUploadedBatchId == null || !wl7.b(this.previousUploadedBatchId, batchID)) {
            this.attempts = 1;
        } else {
            this.attempts++;
            UploadStatus uploadStatus = this.previousUploadStatus;
            if (uploadStatus != null) {
                numValueOf = Integer.valueOf(uploadStatus.getCode());
            }
        }
        this.previousUploadedBatchId = batchID;
        return new RequestExecutionContext(this.attempts, numValueOf);
    }

    private final UploadStatus responseCodeToUploadStatus(int code, com.datadog.android.api.net.Request request) {
        if (code == 202) {
            return new UploadStatus.Success(code);
        }
        if (code != 403) {
            if (code != 408) {
                if (code != 413) {
                    if (code != 429) {
                        if (code != 500 && code != 507) {
                            if (code != 400) {
                                if (code != 401) {
                                    switch (code) {
                                        case HTTP_BAD_GATEWAY /* 502 */:
                                        case HTTP_UNAVAILABLE /* 503 */:
                                        case HTTP_GATEWAY_TIMEOUT /* 504 */:
                                            break;
                                        default:
                                            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new C05131(code, request), (Throwable) null, false, (Map) null, 56, (Object) null);
                                            return new UploadStatus.UnknownHttpError(code);
                                    }
                                }
                            }
                        }
                        return new UploadStatus.HttpServerError(code);
                    }
                }
                return new UploadStatus.HttpClientError(code);
            }
            return new UploadStatus.HttpClientRateLimiting(code);
        }
        return new UploadStatus.InvalidTokenError(code);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String sanitizeHeaderValue(String value) throws IOException {
        String string;
        if (value != null) {
            StringBuilder sb = new StringBuilder();
            int length = value.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = value.charAt(i);
                if (isValidHeaderValueChar(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            string = sb.toString();
        } else {
            string = null;
        }
        return string == null ? "" : string;
    }

    public final AndroidInfoProvider getAndroidInfoProvider() {
        return this.androidInfoProvider;
    }

    public final Call.Factory getCallFactory() {
        return this.callFactory;
    }

    public final InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    public final RequestFactory getRequestFactory() {
        return this.requestFactory;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @Override // com.datadog.android.core.internal.data.upload.DataUploader
    public UploadStatus upload(DatadogContext context, List<RawBatchEvent> batch, byte[] batchMeta, BatchId batchId) {
        UploadStatus unknownException;
        context.getClass();
        batch.getClass();
        RequestExecutionContext requestExecutionContextResolveExecutionContext = resolveExecutionContext(batchId);
        try {
            com.datadog.android.api.net.Request requestCreate = this.requestFactory.create(context, requestExecutionContextResolveExecutionContext, batch, batchMeta);
            if (requestCreate == null) {
                return new UploadStatus.RequestCreationError(null);
            }
            try {
                unknownException = executeUploadRequest(requestCreate);
            } catch (UnknownHostException e) {
                InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) new DataOkHttpUploader$upload$uploadStatus$1(context), (Throwable) e, false, (Map) null, 48, (Object) null);
                unknownException = new UploadStatus.DNSError(e);
            } catch (IOException e2) {
                InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) DataOkHttpUploader$upload$uploadStatus$2.INSTANCE, (Throwable) e2, false, (Map) null, 48, (Object) null);
                unknownException = new UploadStatus.NetworkError(e2);
            } catch (Throwable th) {
                InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) DataOkHttpUploader$upload$uploadStatus$3.INSTANCE, th, false, (Map) null, 48, (Object) null);
                unknownException = new UploadStatus.UnknownException(th);
            }
            UploadStatus uploadStatus = unknownException;
            uploadStatus.logStatus(requestCreate.getDescription(), requestCreate.getBody().length, this.internalLogger, requestExecutionContextResolveExecutionContext.getAttemptNumber(), requestCreate.getId());
            this.previousUploadStatus = uploadStatus;
            return uploadStatus;
        } catch (Exception e3) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY), (gu5) DataOkHttpUploader$upload$request$1.INSTANCE, (Throwable) e3, false, (Map) null, 48, (Object) null);
            return new UploadStatus.RequestCreationError(e3);
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.data.upload.DataOkHttpUploader$buildOkHttpRequest$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return DataOkHttpUploader.WARNING_USER_AGENT_HEADER_RESERVED;
        }
    }
}

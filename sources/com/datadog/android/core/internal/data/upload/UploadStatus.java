package com.datadog.android.core.internal.data.upload;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.b0;
import defpackage.gu5;
import defpackage.l;
import defpackage.mj8;
import defpackage.u63;
import defpackage.w40;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 '2\u00020\u0001:\r'()*+,-./0123B)\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0016\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J9\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&\u0082\u0001\f456789:;<=>?¨\u0006@"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "", "", "shouldRetry", "", "code", "", RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(ZILjava/lang/Throwable;)V", "", "Lcom/datadog/android/api/InternalLogger$Target;", "resolveInternalLogTarget", "()Ljava/util/List;", "Lcom/datadog/android/api/InternalLogger$Level;", "resolveInternalLogLevel", "()Lcom/datadog/android/api/InternalLogger$Level;", "", "requestId", "byteSize", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "requestAttempts", "buildStatusMessage", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;I)Ljava/lang/String;", "Lcom/datadog/android/api/InternalLogger;", "logger", "attempts", "Lj6g;", "logStatus", "(Ljava/lang/String;ILcom/datadog/android/api/InternalLogger;ILjava/lang/String;)V", "Z", "getShouldRetry", "()Z", "I", "getCode", "()I", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "Companion", "DNSError", "HttpClientError", "HttpClientRateLimiting", "HttpRedirection", "HttpServerError", "InvalidTokenError", "NetworkError", "RequestCreationError", "Success", "UnknownException", "UnknownHttpError", "UnknownStatus", "Lcom/datadog/android/core/internal/data/upload/UploadStatus$DNSError;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus$HttpClientError;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus$HttpClientRateLimiting;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus$HttpRedirection;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus$HttpServerError;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus$InvalidTokenError;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus$NetworkError;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus$RequestCreationError;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus$Success;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus$UnknownException;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus$UnknownHttpError;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus$UnknownStatus;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public abstract class UploadStatus {
    public static final String ATTEMPTS_LOG_MESSAGE_FORMAT = " This request was attempted %d time(s).";
    public static final int UNKNOWN_RESPONSE_CODE = 0;
    private final int code;
    private final boolean shouldRetry;
    private final Throwable throwable;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadStatus$DNSError;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", RumFeature.EVENT_THROWABLE_PROPERTY, "", "(Ljava/lang/Throwable;)V", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class DNSError extends UploadStatus {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DNSError(Throwable th) {
            super(true, 0, th, 2, null);
            th.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadStatus$HttpClientError;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "responseCode", "", "(I)V", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class HttpClientError extends UploadStatus {
        public HttpClientError(int i) {
            super(false, i, null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadStatus$HttpClientRateLimiting;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "responseCode", "", "(I)V", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class HttpClientRateLimiting extends UploadStatus {
        public HttpClientRateLimiting(int i) {
            super(true, i, null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadStatus$HttpRedirection;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "responseCode", "", "(I)V", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class HttpRedirection extends UploadStatus {
        public HttpRedirection(int i) {
            super(false, i, null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadStatus$HttpServerError;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "responseCode", "", "(I)V", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class HttpServerError extends UploadStatus {
        public HttpServerError(int i) {
            super(true, i, null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadStatus$InvalidTokenError;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "responseCode", "", "(I)V", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class InvalidTokenError extends UploadStatus {
        public InvalidTokenError(int i) {
            super(false, i, null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadStatus$NetworkError;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", RumFeature.EVENT_THROWABLE_PROPERTY, "", "(Ljava/lang/Throwable;)V", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class NetworkError extends UploadStatus {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(Throwable th) {
            super(true, 0, th, 2, null);
            th.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadStatus$RequestCreationError;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", RumFeature.EVENT_THROWABLE_PROPERTY, "", "(Ljava/lang/Throwable;)V", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class RequestCreationError extends UploadStatus {
        public RequestCreationError(Throwable th) {
            super(false, 0, th, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadStatus$Success;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "responseCode", "", "(I)V", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Success extends UploadStatus {
        public Success(int i) {
            super(false, i, null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadStatus$UnknownException;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", RumFeature.EVENT_THROWABLE_PROPERTY, "", "(Ljava/lang/Throwable;)V", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class UnknownException extends UploadStatus {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownException(Throwable th) {
            super(true, 0, th, 2, null);
            th.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadStatus$UnknownHttpError;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "responseCode", "", "(I)V", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class UnknownHttpError extends UploadStatus {
        public UnknownHttpError(int i) {
            super(false, i, null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadStatus$UnknownStatus;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "()V", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class UnknownStatus extends UploadStatus {
        public static final UnknownStatus INSTANCE = new UnknownStatus();

        private UnknownStatus() {
            super(false, 0, null, 4, null);
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.data.upload.UploadStatus$logStatus$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        final /* synthetic */ int $attempts;
        final /* synthetic */ int $byteSize;
        final /* synthetic */ String $context;
        final /* synthetic */ String $requestId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, int i, String str2, int i2) {
            super(0);
            this.$requestId = str;
            this.$byteSize = i;
            this.$context = str2;
            this.$attempts = i2;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            UploadStatus uploadStatus = UploadStatus.this;
            return uploadStatus.buildStatusMessage(this.$requestId, this.$byteSize, this.$context, uploadStatus.getThrowable(), this.$attempts);
        }
    }

    public /* synthetic */ UploadStatus(boolean z, int i, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : th, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildStatusMessage(String requestId, int byteSize, String context, Throwable throwable, int requestAttempts) {
        StringBuilder sb = new StringBuilder();
        if (requestId == null) {
            sb.append("Batch [" + byteSize + " bytes] (" + context + ")");
        } else {
            StringBuilder sbH = w40.h(byteSize, "Batch ", requestId, " [", " bytes] (");
            sbH.append(context);
            sbH.append(")");
            sb.append(sbH.toString());
        }
        if (this instanceof DNSError) {
            sb.append(" failed because of a DNS error");
        } else if (this instanceof HttpClientError) {
            sb.append(" failed because of a processing error or invalid data");
        } else if (this instanceof HttpClientRateLimiting) {
            sb.append(" failed because of an intake rate limitation");
        } else if (this instanceof HttpRedirection) {
            sb.append(" failed because of a network redirection");
        } else if (this instanceof HttpServerError) {
            sb.append(" failed because of a server processing error");
        } else if (this instanceof InvalidTokenError) {
            sb.append(" failed because your token is invalid");
        } else if (this instanceof NetworkError) {
            sb.append(" failed because of a network error");
        } else if (this instanceof RequestCreationError) {
            sb.append(" failed because of an error when creating the request");
        } else if (this instanceof UnknownException) {
            sb.append(" failed because of an unknown error");
        } else if (this instanceof UnknownHttpError) {
            sb.append(" failed because of an unexpected HTTP error (status code = " + this.code + ")");
        } else if (this instanceof UnknownStatus) {
            sb.append(" status is unknown");
        } else if (this instanceof Success) {
            sb.append(" sent successfully.");
        }
        if (throwable != null) {
            sb.append(" (");
            sb.append(throwable.getClass().getName());
            sb.append(": ");
            sb.append(throwable.getMessage());
            sb.append(")");
        }
        if (this.shouldRetry) {
            sb.append("; we will retry later.");
        } else if (!(this instanceof Success)) {
            sb.append("; the batch was dropped.");
        }
        if (this instanceof InvalidTokenError) {
            sb.append(" Make sure that the provided token still exists and you're targeting the relevant Datadog site.");
        }
        sb.append(String.format(Locale.US, ATTEMPTS_LOG_MESSAGE_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(requestAttempts), Integer.valueOf(this.code)}, 2)));
        return sb.toString();
    }

    public static /* synthetic */ void logStatus$default(UploadStatus uploadStatus, String str, int i, InternalLogger internalLogger, int i2, String str2, int i3, Object obj) {
        if (obj != null) {
            b0.u("Super calls with default arguments not supported in this target, function: logStatus");
            return;
        }
        if ((i3 & 16) != 0) {
            str2 = null;
        }
        uploadStatus.logStatus(str, i, internalLogger, i2, str2);
    }

    private final InternalLogger.Level resolveInternalLogLevel() {
        if (this instanceof HttpClientError ? true : this instanceof HttpServerError ? true : this instanceof InvalidTokenError ? true : this instanceof RequestCreationError ? true : this instanceof UnknownException ? true : this instanceof UnknownHttpError) {
            return InternalLogger.Level.ERROR;
        }
        if (this instanceof DNSError ? true : this instanceof HttpClientRateLimiting ? true : this instanceof HttpRedirection ? true : this instanceof UnknownStatus ? true : this instanceof NetworkError) {
            return InternalLogger.Level.WARN;
        }
        if (this instanceof Success) {
            return InternalLogger.Level.INFO;
        }
        l.g();
        return null;
    }

    private final List<InternalLogger.Target> resolveInternalLogTarget() {
        if (this instanceof HttpClientError ? true : this instanceof HttpClientRateLimiting ? true : this instanceof UnknownStatus) {
            return u63.a0(InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY);
        }
        if (this instanceof DNSError ? true : this instanceof HttpRedirection ? true : this instanceof HttpServerError ? true : this instanceof InvalidTokenError ? true : this instanceof NetworkError ? true : this instanceof RequestCreationError ? true : this instanceof Success ? true : this instanceof UnknownException ? true : this instanceof UnknownHttpError) {
            return u63.Z(InternalLogger.Target.USER);
        }
        l.g();
        return null;
    }

    public final int getCode() {
        return this.code;
    }

    public final boolean getShouldRetry() {
        return this.shouldRetry;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final void logStatus(String context, int byteSize, InternalLogger logger, int attempts, String requestId) {
        context.getClass();
        logger.getClass();
        InternalLogger.DefaultImpls.log$default(logger, resolveInternalLogLevel(), (List) resolveInternalLogTarget(), (gu5) new AnonymousClass1(requestId, byteSize, context, attempts), (Throwable) null, false, (Map) null, 56, (Object) null);
    }

    private UploadStatus(boolean z, int i, Throwable th) {
        this.shouldRetry = z;
        this.code = i;
        this.throwable = th;
    }

    public /* synthetic */ UploadStatus(boolean z, int i, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, th);
    }
}

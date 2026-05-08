package com.indeed.android.backendservices.common.api;

import androidx.annotation.Keep;
import com.indeed.android.backendservices.common.api.a;
import defpackage.akb;
import defpackage.p81;
import defpackage.wl7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0001*B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0014\u001a\u00060\bj\u0002`\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J>\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\b\u0002\u0010\n\u001a\u00060\bj\u0002`\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0013R\u001e\u0010\n\u001a\u00060\bj\u0002`\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0015¨\u0006+"}, d2 = {"Lcom/indeed/android/backendservices/common/api/ApiError;", "Lp81;", "Lcom/indeed/android/backendservices/common/api/a;", "errorType", "", "msg", "Lcom/indeed/android/backendservices/common/api/ErrorData;", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "<init>", "(Lcom/indeed/android/backendservices/common/api/a;Ljava/lang/String;Lcom/indeed/android/backendservices/common/api/ErrorData;Ljava/lang/Exception;)V", "description", "()Ljava/lang/String;", "component1", "()Lcom/indeed/android/backendservices/common/api/a;", "component2", "component3", "()Lcom/indeed/android/backendservices/common/api/ErrorData;", "component4", "()Ljava/lang/Exception;", "copy", "(Lcom/indeed/android/backendservices/common/api/a;Ljava/lang/String;Lcom/indeed/android/backendservices/common/api/ErrorData;Ljava/lang/Exception;)Lcom/indeed/android/backendservices/common/api/ApiError;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/indeed/android/backendservices/common/api/a;", "getErrorType", "Ljava/lang/String;", "getMsg", "Lcom/indeed/android/backendservices/common/api/ErrorData;", "getError", "Ljava/lang/Exception;", "getCause", "Companion", "a", "backendservices_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ApiError implements p81 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final Exception cause;
    private final ErrorData error;
    private final a errorType;
    private final String msg;

    /* JADX INFO: renamed from: com.indeed.android.backendservices.common.api.ApiError$a, reason: from kotlin metadata */
    public static final class Companion {
        public static ApiError a(p81 p81Var) {
            p81Var.getClass();
            if (p81Var instanceof ApiError) {
                return (ApiError) p81Var;
            }
            return new ApiError(a.c.d, "converted from BaseApiError", null, p81Var.getCause(), 4, null);
        }
    }

    public ApiError(a aVar, String str, ErrorData errorData, Exception exc) {
        aVar.getClass();
        str.getClass();
        exc.getClass();
        this.errorType = aVar;
        this.msg = str;
        this.error = errorData;
        this.cause = exc;
    }

    public static /* synthetic */ ApiError copy$default(ApiError apiError, a aVar, String str, ErrorData errorData, Exception exc, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = apiError.errorType;
        }
        if ((i & 2) != 0) {
            str = apiError.msg;
        }
        if ((i & 4) != 0) {
            errorData = apiError.error;
        }
        if ((i & 8) != 0) {
            exc = apiError.cause;
        }
        return apiError.copy(aVar, str, errorData, exc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final a getErrorType() {
        return this.errorType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ErrorData getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Exception getCause() {
        return this.cause;
    }

    public final ApiError copy(a errorType, String msg, ErrorData error, Exception cause) {
        errorType.getClass();
        msg.getClass();
        cause.getClass();
        return new ApiError(errorType, msg, error, cause);
    }

    public final String description() {
        StringBuilder sb = new StringBuilder();
        a aVar = this.errorType;
        sb.append(aVar.b + " (" + aVar.a() + ") ");
        String str = this.msg;
        StringBuilder sb2 = new StringBuilder("- msg: \"");
        sb2.append(str);
        sb2.append("\"");
        sb.append(sb2.toString());
        sb.append(", cause: " + getCause());
        if (this.error != null) {
            sb.append(", ");
            sb.append(this.error.getCode() + ": " + this.error.getMessage() + "\n");
        }
        return sb.toString();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiError)) {
            return false;
        }
        ApiError apiError = (ApiError) other;
        return wl7.b(this.errorType, apiError.errorType) && wl7.b(this.msg, apiError.msg) && wl7.b(this.error, apiError.error) && wl7.b(this.cause, apiError.cause);
    }

    @Override // defpackage.p81
    public Exception getCause() {
        return this.cause;
    }

    public final ErrorData getError() {
        return this.error;
    }

    public final a getErrorType() {
        return this.errorType;
    }

    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        int iD = akb.d(this.errorType.hashCode() * 31, 31, this.msg);
        ErrorData errorData = this.error;
        return this.cause.hashCode() + ((iD + (errorData == null ? 0 : errorData.hashCode())) * 31);
    }

    public String toString() {
        return "ApiError(errorType=" + this.errorType + ", msg=" + this.msg + ", error=" + this.error + ", cause=" + this.cause + ")";
    }

    public /* synthetic */ ApiError(a aVar, String str, ErrorData errorData, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : errorData, exc);
    }
}

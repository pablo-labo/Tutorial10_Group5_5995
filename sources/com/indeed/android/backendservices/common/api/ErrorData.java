package com.indeed.android.backendservices.common.api;

import androidx.annotation.Keep;
import defpackage.akb;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/indeed/android/backendservices/common/api/ErrorData;", "", "message", "", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getCode", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "backendservices_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ErrorData {
    private final String code;
    private final String message;

    public ErrorData(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.message = str;
        this.code = str2;
    }

    public static /* synthetic */ ErrorData copy$default(ErrorData errorData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = errorData.message;
        }
        if ((i & 2) != 0) {
            str2 = errorData.code;
        }
        return errorData.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    public final ErrorData copy(String message, String code) {
        message.getClass();
        code.getClass();
        return new ErrorData(message, code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorData)) {
            return false;
        }
        ErrorData errorData = (ErrorData) other;
        return wl7.b(this.message, errorData.message) && wl7.b(this.code, errorData.code);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.code.hashCode() + (this.message.hashCode() * 31);
    }

    public String toString() {
        return akb.k("ErrorData(message=", this.message, ", code=", this.code, ")");
    }
}

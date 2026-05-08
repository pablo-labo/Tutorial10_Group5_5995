package com.indeed.android.myjobs.data.model;

import defpackage.l6;
import defpackage.u40;
import defpackage.wl7;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/indeed/android/myjobs/data/model/ServiceResult;", "", "statusCode", "", "errorName", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStatusCode", "()Ljava/lang/String;", "getErrorName", "getErrorMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ServiceResult {
    public static final int $stable = 0;
    private final String errorMessage;
    private final String errorName;
    private final String statusCode;

    public ServiceResult(String str, String str2, String str3) {
        this.statusCode = str;
        this.errorName = str2;
        this.errorMessage = str3;
    }

    public static /* synthetic */ ServiceResult copy$default(ServiceResult serviceResult, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serviceResult.statusCode;
        }
        if ((i & 2) != 0) {
            str2 = serviceResult.errorName;
        }
        if ((i & 4) != 0) {
            str3 = serviceResult.errorMessage;
        }
        return serviceResult.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorName() {
        return this.errorName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final ServiceResult copy(String statusCode, String errorName, String errorMessage) {
        return new ServiceResult(statusCode, errorName, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceResult)) {
            return false;
        }
        ServiceResult serviceResult = (ServiceResult) other;
        return wl7.b(this.statusCode, serviceResult.statusCode) && wl7.b(this.errorName, serviceResult.errorName) && wl7.b(this.errorMessage, serviceResult.errorMessage);
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getErrorName() {
        return this.errorName;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        String str = this.statusCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorMessage;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.statusCode;
        String str2 = this.errorName;
        return l6.i(u40.f("ServiceResult(statusCode=", str, ", errorName=", str2, ", errorMessage="), this.errorMessage, ")");
    }
}

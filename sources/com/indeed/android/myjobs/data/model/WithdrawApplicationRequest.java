package com.indeed.android.myjobs.data.model;

import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import defpackage.akb;
import defpackage.wl7;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/indeed/android/myjobs/data/model/WithdrawApplicationRequest;", "", RumEventDeserializer.EVENT_TYPE_ACTION, "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getCause", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WithdrawApplicationRequest {
    public static final int $stable = 0;
    private final String action;
    private final String cause;

    public WithdrawApplicationRequest(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.action = str;
        this.cause = str2;
    }

    public static /* synthetic */ WithdrawApplicationRequest copy$default(WithdrawApplicationRequest withdrawApplicationRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = withdrawApplicationRequest.action;
        }
        if ((i & 2) != 0) {
            str2 = withdrawApplicationRequest.cause;
        }
        return withdrawApplicationRequest.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCause() {
        return this.cause;
    }

    public final WithdrawApplicationRequest copy(String action, String cause) {
        action.getClass();
        cause.getClass();
        return new WithdrawApplicationRequest(action, cause);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithdrawApplicationRequest)) {
            return false;
        }
        WithdrawApplicationRequest withdrawApplicationRequest = (WithdrawApplicationRequest) other;
        return wl7.b(this.action, withdrawApplicationRequest.action) && wl7.b(this.cause, withdrawApplicationRequest.cause);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getCause() {
        return this.cause;
    }

    public int hashCode() {
        return this.cause.hashCode() + (this.action.hashCode() * 31);
    }

    public String toString() {
        return akb.k("WithdrawApplicationRequest(action=", this.action, ", cause=", this.cause, ")");
    }
}

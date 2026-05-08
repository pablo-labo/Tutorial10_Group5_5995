package com.indeed.android.myjobs.data.model;

import com.datadog.android.ndk.internal.NdkCrashLog;
import defpackage.wl7;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/indeed/android/myjobs/data/model/UserJobStatus;", "", "status", "", NdkCrashLog.TIMESTAMP_KEY_NAME, "", "<init>", "(Ljava/lang/String;J)V", "getStatus", "()Ljava/lang/String;", "getTimestamp", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserJobStatus {
    public static final int $stable = 0;
    private final String status;
    private final long timestamp;

    public UserJobStatus(String str, long j) {
        str.getClass();
        this.status = str;
        this.timestamp = j;
    }

    public static /* synthetic */ UserJobStatus copy$default(UserJobStatus userJobStatus, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userJobStatus.status;
        }
        if ((i & 2) != 0) {
            j = userJobStatus.timestamp;
        }
        return userJobStatus.copy(str, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final UserJobStatus copy(String status, long timestamp) {
        status.getClass();
        return new UserJobStatus(status, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserJobStatus)) {
            return false;
        }
        UserJobStatus userJobStatus = (UserJobStatus) other;
        return wl7.b(this.status, userJobStatus.status) && this.timestamp == userJobStatus.timestamp;
    }

    public final String getStatus() {
        return this.status;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + (this.status.hashCode() * 31);
    }

    public String toString() {
        return "UserJobStatus(status=" + this.status + ", timestamp=" + this.timestamp + ")";
    }
}

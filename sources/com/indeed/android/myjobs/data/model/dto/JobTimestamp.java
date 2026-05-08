package com.indeed.android.myjobs.data.model.dto;

import com.datadog.android.ndk.internal.NdkCrashLog;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/indeed/android/myjobs/data/model/dto/JobTimestamp;", "", "jobKey", "", NdkCrashLog.TIMESTAMP_KEY_NAME, "", "<init>", "(Ljava/lang/String;J)V", "getJobKey", "()Ljava/lang/String;", "getTimestamp", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JobTimestamp {
    public static final int $stable = 0;
    private final String jobKey;
    private final long timestamp;

    public JobTimestamp(String str, long j) {
        str.getClass();
        this.jobKey = str;
        this.timestamp = j;
    }

    public static /* synthetic */ JobTimestamp copy$default(JobTimestamp jobTimestamp, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jobTimestamp.jobKey;
        }
        if ((i & 2) != 0) {
            j = jobTimestamp.timestamp;
        }
        return jobTimestamp.copy(str, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getJobKey() {
        return this.jobKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final JobTimestamp copy(String jobKey, long timestamp) {
        jobKey.getClass();
        return new JobTimestamp(jobKey, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JobTimestamp)) {
            return false;
        }
        JobTimestamp jobTimestamp = (JobTimestamp) other;
        return wl7.b(this.jobKey, jobTimestamp.jobKey) && this.timestamp == jobTimestamp.timestamp;
    }

    public final String getJobKey() {
        return this.jobKey;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + (this.jobKey.hashCode() * 31);
    }

    public String toString() {
        return "JobTimestamp(jobKey=" + this.jobKey + ", timestamp=" + this.timestamp + ")";
    }
}

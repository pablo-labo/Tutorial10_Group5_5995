package com.datadog.android.ndk.internal;

import defpackage.ab8;
import defpackage.akb;
import defpackage.hh2;
import defpackage.ia;
import defpackage.ka8;
import defpackage.q6;
import defpackage.wl7;
import defpackage.xa8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u0000 &2\u00020\u0001:\u0001&B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003JL\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\r\u0010#\u001a\u00020\bH\u0000¢\u0006\u0002\b$J\t\u0010%\u001a\u00020\bHÖ\u0001R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, d2 = {"Lcom/datadog/android/ndk/internal/NdkCrashLog;", "", NdkCrashLog.SIGNAL_KEY_NAME, "", NdkCrashLog.TIMESTAMP_KEY_NAME, "", "timeSinceAppStartMs", "signalName", "", "message", "stacktrace", "(IJLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getSignal", "()I", "getSignalName", "getStacktrace", "getTimeSinceAppStartMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(IJLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/ndk/internal/NdkCrashLog;", "equals", "", "other", "hashCode", "toJson", "toJson$dd_sdk_android_core_release", "toString", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class NdkCrashLog {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String MESSAGE_KEY_NAME = "message";
    public static final String SIGNAL_KEY_NAME = "signal";
    public static final String SIGNAL_NAME_KEY_NAME = "signal_name";
    public static final String STACKTRACE_KEY_NAME = "stacktrace";
    public static final String TIMESTAMP_KEY_NAME = "timestamp";
    public static final String TIME_SINCE_APP_START_MS_NAME = "time_since_app_start_ms";
    private final String message;
    private final int signal;
    private final String signalName;
    private final String stacktrace;
    private final Long timeSinceAppStartMs;
    private final long timestamp;

    public NdkCrashLog(int i, long j, Long l, String str, String str2, String str3) {
        q6.m(str, str2, str3);
        this.signal = i;
        this.timestamp = j;
        this.timeSinceAppStartMs = l;
        this.signalName = str;
        this.message = str2;
        this.stacktrace = str3;
    }

    public static /* synthetic */ NdkCrashLog copy$default(NdkCrashLog ndkCrashLog, int i, long j, Long l, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ndkCrashLog.signal;
        }
        if ((i2 & 2) != 0) {
            j = ndkCrashLog.timestamp;
        }
        if ((i2 & 4) != 0) {
            l = ndkCrashLog.timeSinceAppStartMs;
        }
        if ((i2 & 8) != 0) {
            str = ndkCrashLog.signalName;
        }
        if ((i2 & 16) != 0) {
            str2 = ndkCrashLog.message;
        }
        if ((i2 & 32) != 0) {
            str3 = ndkCrashLog.stacktrace;
        }
        return ndkCrashLog.copy(i, j, l, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSignal() {
        return this.signal;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getTimeSinceAppStartMs() {
        return this.timeSinceAppStartMs;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSignalName() {
        return this.signalName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStacktrace() {
        return this.stacktrace;
    }

    public final NdkCrashLog copy(int signal, long timestamp, Long timeSinceAppStartMs, String signalName, String message, String stacktrace) {
        signalName.getClass();
        message.getClass();
        stacktrace.getClass();
        return new NdkCrashLog(signal, timestamp, timeSinceAppStartMs, signalName, message, stacktrace);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NdkCrashLog)) {
            return false;
        }
        NdkCrashLog ndkCrashLog = (NdkCrashLog) other;
        return this.signal == ndkCrashLog.signal && this.timestamp == ndkCrashLog.timestamp && wl7.b(this.timeSinceAppStartMs, ndkCrashLog.timeSinceAppStartMs) && wl7.b(this.signalName, ndkCrashLog.signalName) && wl7.b(this.message, ndkCrashLog.message) && wl7.b(this.stacktrace, ndkCrashLog.stacktrace);
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getSignal() {
        return this.signal;
    }

    public final String getSignalName() {
        return this.signalName;
    }

    public final String getStacktrace() {
        return this.stacktrace;
    }

    public final Long getTimeSinceAppStartMs() {
        return this.timeSinceAppStartMs;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iD = ia.d(Integer.hashCode(this.signal) * 31, 31, this.timestamp);
        Long l = this.timeSinceAppStartMs;
        return this.stacktrace.hashCode() + akb.d(akb.d((iD + (l == null ? 0 : l.hashCode())) * 31, 31, this.signalName), 31, this.message);
    }

    public final String toJson$dd_sdk_android_core_release() {
        ab8 ab8Var = new ab8();
        ab8Var.j(Integer.valueOf(this.signal), SIGNAL_KEY_NAME);
        ab8Var.l(SIGNAL_NAME_KEY_NAME, this.signalName);
        ab8Var.j(Long.valueOf(this.timestamp), TIMESTAMP_KEY_NAME);
        ab8Var.j(this.timeSinceAppStartMs, TIME_SINCE_APP_START_MS_NAME);
        ab8Var.l("message", this.message);
        ab8Var.l("stacktrace", this.stacktrace);
        String string = ab8Var.toString();
        string.getClass();
        return string;
    }

    public String toString() {
        int i = this.signal;
        long j = this.timestamp;
        Long l = this.timeSinceAppStartMs;
        String str = this.signalName;
        String str2 = this.message;
        String str3 = this.stacktrace;
        StringBuilder sb = new StringBuilder("NdkCrashLog(signal=");
        sb.append(i);
        sb.append(", timestamp=");
        sb.append(j);
        sb.append(", timeSinceAppStartMs=");
        sb.append(l);
        sb.append(", signalName=");
        sb.append(str);
        ia.r(sb, ", message=", str2, ", stacktrace=", str3);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/datadog/android/ndk/internal/NdkCrashLog$Companion;", "", "()V", "MESSAGE_KEY_NAME", "", "SIGNAL_KEY_NAME", "SIGNAL_NAME_KEY_NAME", "STACKTRACE_KEY_NAME", "TIMESTAMP_KEY_NAME", "TIME_SINCE_APP_START_MS_NAME", "fromJson", "Lcom/datadog/android/ndk/internal/NdkCrashLog;", "jsonString", "fromJson$dd_sdk_android_core_release", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NdkCrashLog fromJson$dd_sdk_android_core_release(String jsonString) {
            jsonString.getClass();
            ab8 ab8VarD = hh2.A(jsonString).d();
            int iB = ab8VarD.m(NdkCrashLog.SIGNAL_KEY_NAME).b();
            long jE = ab8VarD.m(NdkCrashLog.TIMESTAMP_KEY_NAME).e();
            ka8 ka8VarM = ab8VarD.m(NdkCrashLog.TIME_SINCE_APP_START_MS_NAME);
            Long lValueOf = null;
            if (ka8VarM != null && !(ka8VarM instanceof xa8)) {
                lValueOf = Long.valueOf(ka8VarM.e());
            }
            String strG = ab8VarD.m(NdkCrashLog.SIGNAL_NAME_KEY_NAME).g();
            strG.getClass();
            String strG2 = ab8VarD.m("message").g();
            strG2.getClass();
            String strG3 = ab8VarD.m("stacktrace").g();
            strG3.getClass();
            return new NdkCrashLog(iB, jE, lValueOf, strG, strG2, strG3);
        }

        private Companion() {
        }
    }
}

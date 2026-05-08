package com.indeed.android.myjobs.data.model.dto;

import com.datadog.android.ndk.internal.NdkCrashLog;
import defpackage.akb;
import defpackage.ia;
import defpackage.u40;
import defpackage.w20;
import defpackage.wl7;
import defpackage.z3;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/indeed/android/myjobs/data/model/dto/LogEventData;", "", "tk", "", "logType", "application", "moduleName", NdkCrashLog.TIMESTAMP_KEY_NAME, "dataJson", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTk", "()Ljava/lang/String;", "getLogType", "getApplication", "getModuleName", "getTimestamp", "getDataJson", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LogEventData {
    public static final int $stable = 0;
    private final String application;
    private final String dataJson;
    private final String logType;
    private final String moduleName;
    private final String timestamp;
    private final String tk;

    public LogEventData(String str, String str2, String str3, String str4, String str5, String str6) {
        w20.p(str, str2, str3, str4, str5);
        str6.getClass();
        this.tk = str;
        this.logType = str2;
        this.application = str3;
        this.moduleName = str4;
        this.timestamp = str5;
        this.dataJson = str6;
    }

    public static /* synthetic */ LogEventData copy$default(LogEventData logEventData, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = logEventData.tk;
        }
        if ((i & 2) != 0) {
            str2 = logEventData.logType;
        }
        if ((i & 4) != 0) {
            str3 = logEventData.application;
        }
        if ((i & 8) != 0) {
            str4 = logEventData.moduleName;
        }
        if ((i & 16) != 0) {
            str5 = logEventData.timestamp;
        }
        if ((i & 32) != 0) {
            str6 = logEventData.dataJson;
        }
        String str7 = str5;
        String str8 = str6;
        return logEventData.copy(str, str2, str3, str4, str7, str8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTk() {
        return this.tk;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLogType() {
        return this.logType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getApplication() {
        return this.application;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getModuleName() {
        return this.moduleName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDataJson() {
        return this.dataJson;
    }

    public final LogEventData copy(String tk, String logType, String application, String moduleName, String timestamp, String dataJson) {
        w20.p(tk, logType, application, moduleName, timestamp);
        dataJson.getClass();
        return new LogEventData(tk, logType, application, moduleName, timestamp, dataJson);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogEventData)) {
            return false;
        }
        LogEventData logEventData = (LogEventData) other;
        return wl7.b(this.tk, logEventData.tk) && wl7.b(this.logType, logEventData.logType) && wl7.b(this.application, logEventData.application) && wl7.b(this.moduleName, logEventData.moduleName) && wl7.b(this.timestamp, logEventData.timestamp) && wl7.b(this.dataJson, logEventData.dataJson);
    }

    public final String getApplication() {
        return this.application;
    }

    public final String getDataJson() {
        return this.dataJson;
    }

    public final String getLogType() {
        return this.logType;
    }

    public final String getModuleName() {
        return this.moduleName;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final String getTk() {
        return this.tk;
    }

    public int hashCode() {
        return this.dataJson.hashCode() + akb.d(akb.d(akb.d(akb.d(this.tk.hashCode() * 31, 31, this.logType), 31, this.application), 31, this.moduleName), 31, this.timestamp);
    }

    public String toString() {
        String str = this.tk;
        String str2 = this.logType;
        String str3 = this.application;
        String str4 = this.moduleName;
        String str5 = this.timestamp;
        String str6 = this.dataJson;
        StringBuilder sbF = u40.f("LogEventData(tk=", str, ", logType=", str2, ", application=");
        ia.r(sbF, str3, ", moduleName=", str4, ", timestamp=");
        return z3.n(sbF, str5, ", dataJson=", str6, ")");
    }
}

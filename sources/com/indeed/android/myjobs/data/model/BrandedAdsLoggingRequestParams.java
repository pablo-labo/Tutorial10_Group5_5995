package com.indeed.android.myjobs.data.model;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.akb;
import defpackage.ia;
import defpackage.u40;
import defpackage.w20;
import defpackage.wl7;
import defpackage.z3;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J[\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006%"}, d2 = {"Lcom/indeed/android/myjobs/data/model/BrandedAdsLoggingRequestParams;", "", "logType", "", "creativeKey", "mobtk", "fccKey", "flowPage", "flowType", "logLabel", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLogType", "()Ljava/lang/String;", "getCreativeKey", "getMobtk", "getFccKey", "getFlowPage", "getFlowType", "getLogLabel", "getReason", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BrandedAdsLoggingRequestParams {
    public static final int $stable = 0;
    private final String creativeKey;
    private final String fccKey;
    private final String flowPage;
    private final String flowType;
    private final String logLabel;
    private final String logType;
    private final String mobtk;
    private final String reason;

    public BrandedAdsLoggingRequestParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        w20.p(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        this.logType = str;
        this.creativeKey = str2;
        this.mobtk = str3;
        this.fccKey = str4;
        this.flowPage = str5;
        this.flowType = str6;
        this.logLabel = str7;
        this.reason = str8;
    }

    public static /* synthetic */ BrandedAdsLoggingRequestParams copy$default(BrandedAdsLoggingRequestParams brandedAdsLoggingRequestParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = brandedAdsLoggingRequestParams.logType;
        }
        if ((i & 2) != 0) {
            str2 = brandedAdsLoggingRequestParams.creativeKey;
        }
        if ((i & 4) != 0) {
            str3 = brandedAdsLoggingRequestParams.mobtk;
        }
        if ((i & 8) != 0) {
            str4 = brandedAdsLoggingRequestParams.fccKey;
        }
        if ((i & 16) != 0) {
            str5 = brandedAdsLoggingRequestParams.flowPage;
        }
        if ((i & 32) != 0) {
            str6 = brandedAdsLoggingRequestParams.flowType;
        }
        if ((i & 64) != 0) {
            str7 = brandedAdsLoggingRequestParams.logLabel;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            str8 = brandedAdsLoggingRequestParams.reason;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return brandedAdsLoggingRequestParams.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLogType() {
        return this.logType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCreativeKey() {
        return this.creativeKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMobtk() {
        return this.mobtk;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFccKey() {
        return this.fccKey;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFlowPage() {
        return this.flowPage;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFlowType() {
        return this.flowType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLogLabel() {
        return this.logLabel;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final BrandedAdsLoggingRequestParams copy(String logType, String creativeKey, String mobtk, String fccKey, String flowPage, String flowType, String logLabel, String reason) {
        w20.p(logType, creativeKey, mobtk, fccKey, flowPage);
        flowType.getClass();
        logLabel.getClass();
        return new BrandedAdsLoggingRequestParams(logType, creativeKey, mobtk, fccKey, flowPage, flowType, logLabel, reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrandedAdsLoggingRequestParams)) {
            return false;
        }
        BrandedAdsLoggingRequestParams brandedAdsLoggingRequestParams = (BrandedAdsLoggingRequestParams) other;
        return wl7.b(this.logType, brandedAdsLoggingRequestParams.logType) && wl7.b(this.creativeKey, brandedAdsLoggingRequestParams.creativeKey) && wl7.b(this.mobtk, brandedAdsLoggingRequestParams.mobtk) && wl7.b(this.fccKey, brandedAdsLoggingRequestParams.fccKey) && wl7.b(this.flowPage, brandedAdsLoggingRequestParams.flowPage) && wl7.b(this.flowType, brandedAdsLoggingRequestParams.flowType) && wl7.b(this.logLabel, brandedAdsLoggingRequestParams.logLabel) && wl7.b(this.reason, brandedAdsLoggingRequestParams.reason);
    }

    public final String getCreativeKey() {
        return this.creativeKey;
    }

    public final String getFccKey() {
        return this.fccKey;
    }

    public final String getFlowPage() {
        return this.flowPage;
    }

    public final String getFlowType() {
        return this.flowType;
    }

    public final String getLogLabel() {
        return this.logLabel;
    }

    public final String getLogType() {
        return this.logType;
    }

    public final String getMobtk() {
        return this.mobtk;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        int iD = akb.d(akb.d(akb.d(akb.d(akb.d(akb.d(this.logType.hashCode() * 31, 31, this.creativeKey), 31, this.mobtk), 31, this.fccKey), 31, this.flowPage), 31, this.flowType), 31, this.logLabel);
        String str = this.reason;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.logType;
        String str2 = this.creativeKey;
        String str3 = this.mobtk;
        String str4 = this.fccKey;
        String str5 = this.flowPage;
        String str6 = this.flowType;
        String str7 = this.logLabel;
        String str8 = this.reason;
        StringBuilder sbF = u40.f("BrandedAdsLoggingRequestParams(logType=", str, ", creativeKey=", str2, ", mobtk=");
        ia.r(sbF, str3, ", fccKey=", str4, ", flowPage=");
        ia.r(sbF, str5, ", flowType=", str6, ", logLabel=");
        return z3.n(sbF, str7, ", reason=", str8, ")");
    }
}

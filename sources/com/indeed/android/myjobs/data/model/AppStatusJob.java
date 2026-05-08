package com.indeed.android.myjobs.data.model;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.akb;
import defpackage.ia;
import defpackage.p6;
import defpackage.u40;
import defpackage.w20;
import defpackage.wl7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bQ\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b&\u0010'J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\bHÆ\u0003J\t\u0010T\u001a\u00020\bHÆ\u0003J\t\u0010U\u001a\u00020\bHÆ\u0003J\t\u0010V\u001a\u00020\bHÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u000eHÆ\u0003J\t\u0010Y\u001a\u00020\u0010HÆ\u0003J\t\u0010Z\u001a\u00020\u0012HÆ\u0003J\t\u0010[\u001a\u00020\bHÆ\u0003J\t\u0010\\\u001a\u00020\bHÆ\u0003J\t\u0010]\u001a\u00020\bHÆ\u0003J\t\u0010^\u001a\u00020\bHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010a\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0002\u0010AJ\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010d\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010FJ\u000b\u0010e\u001a\u0004\u0018\u00010 HÆ\u0003J\u0010\u0010f\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010FJ\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010i\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010FJ\u0010\u0010j\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010FJ¾\u0002\u0010k\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u0010lJ\u0013\u0010m\u001a\u00020\b2\b\u0010n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010o\u001a\u00020\u001bHÖ\u0001J\t\u0010p\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010.R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010.R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010)R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b9\u0010.R\u0011\u0010\u0014\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b:\u0010.R\u0011\u0010\u0015\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b;\u0010.R\u0011\u0010\u0016\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b<\u0010.R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010)R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\n\n\u0002\u0010B\u001a\u0004\b@\u0010AR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010)R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010)R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010G\u001a\u0004\bE\u0010FR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0015\u0010!\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010G\u001a\u0004\bJ\u0010FR\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u0010)R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u0010)R\u0015\u0010$\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010G\u001a\u0004\bM\u0010FR\u0015\u0010%\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010G\u001a\u0004\bN\u0010F¨\u0006q"}, d2 = {"Lcom/indeed/android/myjobs/data/model/AppStatusJob;", "", "appTk", "", "jobTitle", "jobKey", "jobUrl", "jobExpired", "", "jobReported", "jobFraudulent", "withdrawn", "location", "company", "Lcom/indeed/android/myjobs/data/model/Company;", "statuses", "Lcom/indeed/android/myjobs/data/model/Statuses;", "applyTime", "", "indeedApplyable", "hasIaAppId", "hasApplicationPreview", "hasInterviewNowAccess", "applicantsCountRange", "Lcom/indeed/android/myjobs/data/model/ApplicantsCountRange;", "normalizedJobTitle", "employerEstimatedResponseDays", "", "encryptedIaAppId", "encryptedAdvCandId", "applicationDraftExpiryTime", "evnt5722Data", "Lcom/indeed/android/myjobs/data/model/EVNT5722Data;", "sortingTimeStamp", "partnerName", "nexusWorkflowResumeUrl", "nexusWorkflowStartTimestampMs", "nexusWorkflowExpiresAtMs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;Lcom/indeed/android/myjobs/data/model/Company;Lcom/indeed/android/myjobs/data/model/Statuses;JZZZZLcom/indeed/android/myjobs/data/model/ApplicantsCountRange;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/indeed/android/myjobs/data/model/EVNT5722Data;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getAppTk", "()Ljava/lang/String;", "getJobTitle", "getJobKey", "getJobUrl", "getJobExpired", "()Z", "getJobReported", "getJobFraudulent", "getWithdrawn", "getLocation", "getCompany", "()Lcom/indeed/android/myjobs/data/model/Company;", "getStatuses", "()Lcom/indeed/android/myjobs/data/model/Statuses;", "getApplyTime", "()J", "getIndeedApplyable", "getHasIaAppId", "getHasApplicationPreview", "getHasInterviewNowAccess", "getApplicantsCountRange", "()Lcom/indeed/android/myjobs/data/model/ApplicantsCountRange;", "getNormalizedJobTitle", "getEmployerEstimatedResponseDays", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEncryptedIaAppId", "getEncryptedAdvCandId", "getApplicationDraftExpiryTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEvnt5722Data", "()Lcom/indeed/android/myjobs/data/model/EVNT5722Data;", "getSortingTimeStamp", "getPartnerName", "getNexusWorkflowResumeUrl", "getNexusWorkflowStartTimestampMs", "getNexusWorkflowExpiresAtMs", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;Lcom/indeed/android/myjobs/data/model/Company;Lcom/indeed/android/myjobs/data/model/Statuses;JZZZZLcom/indeed/android/myjobs/data/model/ApplicantsCountRange;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/indeed/android/myjobs/data/model/EVNT5722Data;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/indeed/android/myjobs/data/model/AppStatusJob;", "equals", "other", "hashCode", "toString", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AppStatusJob {
    public static final int $stable = 0;
    private final String appTk;
    private final ApplicantsCountRange applicantsCountRange;
    private final Long applicationDraftExpiryTime;
    private final long applyTime;
    private final Company company;
    private final Integer employerEstimatedResponseDays;
    private final String encryptedAdvCandId;
    private final String encryptedIaAppId;
    private final EVNT5722Data evnt5722Data;
    private final boolean hasApplicationPreview;
    private final boolean hasIaAppId;
    private final boolean hasInterviewNowAccess;
    private final boolean indeedApplyable;
    private final boolean jobExpired;
    private final boolean jobFraudulent;
    private final String jobKey;
    private final boolean jobReported;
    private final String jobTitle;
    private final String jobUrl;
    private final String location;
    private final Long nexusWorkflowExpiresAtMs;
    private final String nexusWorkflowResumeUrl;
    private final Long nexusWorkflowStartTimestampMs;
    private final String normalizedJobTitle;
    private final String partnerName;
    private final Long sortingTimeStamp;
    private final Statuses statuses;
    private final boolean withdrawn;

    public /* synthetic */ AppStatusJob(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5, Company company, Statuses statuses, long j, boolean z5, boolean z6, boolean z7, boolean z8, ApplicantsCountRange applicantsCountRange, String str6, Integer num, String str7, String str8, Long l, EVNT5722Data eVNT5722Data, Long l2, String str9, String str10, Long l3, Long l4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, z, z2, z3, z4, str5, company, statuses, j, z5, z6, z7, z8, applicantsCountRange, str6, num, str7, str8, l, eVNT5722Data, l2, (i & 16777216) != 0 ? null : str9, (i & 33554432) != 0 ? null : str10, (i & 67108864) != 0 ? null : l3, (i & 134217728) != 0 ? null : l4);
    }

    public static /* synthetic */ AppStatusJob copy$default(AppStatusJob appStatusJob, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5, Company company, Statuses statuses, long j, boolean z5, boolean z6, boolean z7, boolean z8, ApplicantsCountRange applicantsCountRange, String str6, Integer num, String str7, String str8, Long l, EVNT5722Data eVNT5722Data, Long l2, String str9, String str10, Long l3, Long l4, int i, Object obj) {
        Long l5;
        Long l6;
        String str11 = (i & 1) != 0 ? appStatusJob.appTk : str;
        String str12 = (i & 2) != 0 ? appStatusJob.jobTitle : str2;
        String str13 = (i & 4) != 0 ? appStatusJob.jobKey : str3;
        String str14 = (i & 8) != 0 ? appStatusJob.jobUrl : str4;
        boolean z9 = (i & 16) != 0 ? appStatusJob.jobExpired : z;
        boolean z10 = (i & 32) != 0 ? appStatusJob.jobReported : z2;
        boolean z11 = (i & 64) != 0 ? appStatusJob.jobFraudulent : z3;
        boolean z12 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? appStatusJob.withdrawn : z4;
        String str15 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? appStatusJob.location : str5;
        Company company2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? appStatusJob.company : company;
        Statuses statuses2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? appStatusJob.statuses : statuses;
        long j2 = (i & 2048) != 0 ? appStatusJob.applyTime : j;
        boolean z13 = (i & 4096) != 0 ? appStatusJob.indeedApplyable : z5;
        String str16 = str11;
        boolean z14 = (i & 8192) != 0 ? appStatusJob.hasIaAppId : z6;
        boolean z15 = (i & 16384) != 0 ? appStatusJob.hasApplicationPreview : z7;
        boolean z16 = (i & 32768) != 0 ? appStatusJob.hasInterviewNowAccess : z8;
        ApplicantsCountRange applicantsCountRange2 = (i & 65536) != 0 ? appStatusJob.applicantsCountRange : applicantsCountRange;
        String str17 = (i & 131072) != 0 ? appStatusJob.normalizedJobTitle : str6;
        Integer num2 = (i & 262144) != 0 ? appStatusJob.employerEstimatedResponseDays : num;
        String str18 = (i & 524288) != 0 ? appStatusJob.encryptedIaAppId : str7;
        String str19 = (i & 1048576) != 0 ? appStatusJob.encryptedAdvCandId : str8;
        Long l7 = (i & 2097152) != 0 ? appStatusJob.applicationDraftExpiryTime : l;
        EVNT5722Data eVNT5722Data2 = (i & 4194304) != 0 ? appStatusJob.evnt5722Data : eVNT5722Data;
        Long l8 = (i & 8388608) != 0 ? appStatusJob.sortingTimeStamp : l2;
        String str20 = (i & 16777216) != 0 ? appStatusJob.partnerName : str9;
        String str21 = (i & 33554432) != 0 ? appStatusJob.nexusWorkflowResumeUrl : str10;
        Long l9 = (i & 67108864) != 0 ? appStatusJob.nexusWorkflowStartTimestampMs : l3;
        if ((i & 134217728) != 0) {
            l6 = l9;
            l5 = appStatusJob.nexusWorkflowExpiresAtMs;
        } else {
            l5 = l4;
            l6 = l9;
        }
        return appStatusJob.copy(str16, str12, str13, str14, z9, z10, z11, z12, str15, company2, statuses2, j2, z13, z14, z15, z16, applicantsCountRange2, str17, num2, str18, str19, l7, eVNT5722Data2, l8, str20, str21, l6, l5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppTk() {
        return this.appTk;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Company getCompany() {
        return this.company;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Statuses getStatuses() {
        return this.statuses;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getApplyTime() {
        return this.applyTime;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIndeedApplyable() {
        return this.indeedApplyable;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getHasIaAppId() {
        return this.hasIaAppId;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getHasApplicationPreview() {
        return this.hasApplicationPreview;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getHasInterviewNowAccess() {
        return this.hasInterviewNowAccess;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final ApplicantsCountRange getApplicantsCountRange() {
        return this.applicantsCountRange;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getNormalizedJobTitle() {
        return this.normalizedJobTitle;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Integer getEmployerEstimatedResponseDays() {
        return this.employerEstimatedResponseDays;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getJobTitle() {
        return this.jobTitle;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getEncryptedIaAppId() {
        return this.encryptedIaAppId;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getEncryptedAdvCandId() {
        return this.encryptedAdvCandId;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Long getApplicationDraftExpiryTime() {
        return this.applicationDraftExpiryTime;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final EVNT5722Data getEvnt5722Data() {
        return this.evnt5722Data;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Long getSortingTimeStamp() {
        return this.sortingTimeStamp;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getPartnerName() {
        return this.partnerName;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getNexusWorkflowResumeUrl() {
        return this.nexusWorkflowResumeUrl;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Long getNexusWorkflowStartTimestampMs() {
        return this.nexusWorkflowStartTimestampMs;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Long getNexusWorkflowExpiresAtMs() {
        return this.nexusWorkflowExpiresAtMs;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getJobKey() {
        return this.jobKey;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getJobUrl() {
        return this.jobUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getJobExpired() {
        return this.jobExpired;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getJobReported() {
        return this.jobReported;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getJobFraudulent() {
        return this.jobFraudulent;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getWithdrawn() {
        return this.withdrawn;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    public final AppStatusJob copy(String appTk, String jobTitle, String jobKey, String jobUrl, boolean jobExpired, boolean jobReported, boolean jobFraudulent, boolean withdrawn, String location, Company company, Statuses statuses, long applyTime, boolean indeedApplyable, boolean hasIaAppId, boolean hasApplicationPreview, boolean hasInterviewNowAccess, ApplicantsCountRange applicantsCountRange, String normalizedJobTitle, Integer employerEstimatedResponseDays, String encryptedIaAppId, String encryptedAdvCandId, Long applicationDraftExpiryTime, EVNT5722Data evnt5722Data, Long sortingTimeStamp, String partnerName, String nexusWorkflowResumeUrl, Long nexusWorkflowStartTimestampMs, Long nexusWorkflowExpiresAtMs) {
        w20.p(appTk, jobTitle, jobKey, jobUrl, location);
        company.getClass();
        statuses.getClass();
        return new AppStatusJob(appTk, jobTitle, jobKey, jobUrl, jobExpired, jobReported, jobFraudulent, withdrawn, location, company, statuses, applyTime, indeedApplyable, hasIaAppId, hasApplicationPreview, hasInterviewNowAccess, applicantsCountRange, normalizedJobTitle, employerEstimatedResponseDays, encryptedIaAppId, encryptedAdvCandId, applicationDraftExpiryTime, evnt5722Data, sortingTimeStamp, partnerName, nexusWorkflowResumeUrl, nexusWorkflowStartTimestampMs, nexusWorkflowExpiresAtMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppStatusJob)) {
            return false;
        }
        AppStatusJob appStatusJob = (AppStatusJob) other;
        return wl7.b(this.appTk, appStatusJob.appTk) && wl7.b(this.jobTitle, appStatusJob.jobTitle) && wl7.b(this.jobKey, appStatusJob.jobKey) && wl7.b(this.jobUrl, appStatusJob.jobUrl) && this.jobExpired == appStatusJob.jobExpired && this.jobReported == appStatusJob.jobReported && this.jobFraudulent == appStatusJob.jobFraudulent && this.withdrawn == appStatusJob.withdrawn && wl7.b(this.location, appStatusJob.location) && wl7.b(this.company, appStatusJob.company) && wl7.b(this.statuses, appStatusJob.statuses) && this.applyTime == appStatusJob.applyTime && this.indeedApplyable == appStatusJob.indeedApplyable && this.hasIaAppId == appStatusJob.hasIaAppId && this.hasApplicationPreview == appStatusJob.hasApplicationPreview && this.hasInterviewNowAccess == appStatusJob.hasInterviewNowAccess && wl7.b(this.applicantsCountRange, appStatusJob.applicantsCountRange) && wl7.b(this.normalizedJobTitle, appStatusJob.normalizedJobTitle) && wl7.b(this.employerEstimatedResponseDays, appStatusJob.employerEstimatedResponseDays) && wl7.b(this.encryptedIaAppId, appStatusJob.encryptedIaAppId) && wl7.b(this.encryptedAdvCandId, appStatusJob.encryptedAdvCandId) && wl7.b(this.applicationDraftExpiryTime, appStatusJob.applicationDraftExpiryTime) && wl7.b(this.evnt5722Data, appStatusJob.evnt5722Data) && wl7.b(this.sortingTimeStamp, appStatusJob.sortingTimeStamp) && wl7.b(this.partnerName, appStatusJob.partnerName) && wl7.b(this.nexusWorkflowResumeUrl, appStatusJob.nexusWorkflowResumeUrl) && wl7.b(this.nexusWorkflowStartTimestampMs, appStatusJob.nexusWorkflowStartTimestampMs) && wl7.b(this.nexusWorkflowExpiresAtMs, appStatusJob.nexusWorkflowExpiresAtMs);
    }

    public final String getAppTk() {
        return this.appTk;
    }

    public final ApplicantsCountRange getApplicantsCountRange() {
        return this.applicantsCountRange;
    }

    public final Long getApplicationDraftExpiryTime() {
        return this.applicationDraftExpiryTime;
    }

    public final long getApplyTime() {
        return this.applyTime;
    }

    public final Company getCompany() {
        return this.company;
    }

    public final Integer getEmployerEstimatedResponseDays() {
        return this.employerEstimatedResponseDays;
    }

    public final String getEncryptedAdvCandId() {
        return this.encryptedAdvCandId;
    }

    public final String getEncryptedIaAppId() {
        return this.encryptedIaAppId;
    }

    public final EVNT5722Data getEvnt5722Data() {
        return this.evnt5722Data;
    }

    public final boolean getHasApplicationPreview() {
        return this.hasApplicationPreview;
    }

    public final boolean getHasIaAppId() {
        return this.hasIaAppId;
    }

    public final boolean getHasInterviewNowAccess() {
        return this.hasInterviewNowAccess;
    }

    public final boolean getIndeedApplyable() {
        return this.indeedApplyable;
    }

    public final boolean getJobExpired() {
        return this.jobExpired;
    }

    public final boolean getJobFraudulent() {
        return this.jobFraudulent;
    }

    public final String getJobKey() {
        return this.jobKey;
    }

    public final boolean getJobReported() {
        return this.jobReported;
    }

    public final String getJobTitle() {
        return this.jobTitle;
    }

    public final String getJobUrl() {
        return this.jobUrl;
    }

    public final String getLocation() {
        return this.location;
    }

    public final Long getNexusWorkflowExpiresAtMs() {
        return this.nexusWorkflowExpiresAtMs;
    }

    public final String getNexusWorkflowResumeUrl() {
        return this.nexusWorkflowResumeUrl;
    }

    public final Long getNexusWorkflowStartTimestampMs() {
        return this.nexusWorkflowStartTimestampMs;
    }

    public final String getNormalizedJobTitle() {
        return this.normalizedJobTitle;
    }

    public final String getPartnerName() {
        return this.partnerName;
    }

    public final Long getSortingTimeStamp() {
        return this.sortingTimeStamp;
    }

    public final Statuses getStatuses() {
        return this.statuses;
    }

    public final boolean getWithdrawn() {
        return this.withdrawn;
    }

    public int hashCode() {
        int iF = ia.f(ia.f(ia.f(ia.f(ia.d((this.statuses.hashCode() + ((this.company.hashCode() + akb.d(ia.f(ia.f(ia.f(ia.f(akb.d(akb.d(akb.d(this.appTk.hashCode() * 31, 31, this.jobTitle), 31, this.jobKey), 31, this.jobUrl), 31, this.jobExpired), 31, this.jobReported), 31, this.jobFraudulent), 31, this.withdrawn), 31, this.location)) * 31)) * 31, 31, this.applyTime), 31, this.indeedApplyable), 31, this.hasIaAppId), 31, this.hasApplicationPreview), 31, this.hasInterviewNowAccess);
        ApplicantsCountRange applicantsCountRange = this.applicantsCountRange;
        int iHashCode = (iF + (applicantsCountRange == null ? 0 : applicantsCountRange.hashCode())) * 31;
        String str = this.normalizedJobTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.employerEstimatedResponseDays;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.encryptedIaAppId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.encryptedAdvCandId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.applicationDraftExpiryTime;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        EVNT5722Data eVNT5722Data = this.evnt5722Data;
        int iHashCode7 = (iHashCode6 + (eVNT5722Data == null ? 0 : eVNT5722Data.hashCode())) * 31;
        Long l2 = this.sortingTimeStamp;
        int iHashCode8 = (iHashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.partnerName;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nexusWorkflowResumeUrl;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l3 = this.nexusWorkflowStartTimestampMs;
        int iHashCode11 = (iHashCode10 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.nexusWorkflowExpiresAtMs;
        return iHashCode11 + (l4 != null ? l4.hashCode() : 0);
    }

    public String toString() {
        String str = this.appTk;
        String str2 = this.jobTitle;
        String str3 = this.jobKey;
        String str4 = this.jobUrl;
        boolean z = this.jobExpired;
        boolean z2 = this.jobReported;
        boolean z3 = this.jobFraudulent;
        boolean z4 = this.withdrawn;
        String str5 = this.location;
        Company company = this.company;
        Statuses statuses = this.statuses;
        long j = this.applyTime;
        boolean z5 = this.indeedApplyable;
        boolean z6 = this.hasIaAppId;
        boolean z7 = this.hasApplicationPreview;
        boolean z8 = this.hasInterviewNowAccess;
        ApplicantsCountRange applicantsCountRange = this.applicantsCountRange;
        String str6 = this.normalizedJobTitle;
        Integer num = this.employerEstimatedResponseDays;
        String str7 = this.encryptedIaAppId;
        String str8 = this.encryptedAdvCandId;
        Long l = this.applicationDraftExpiryTime;
        EVNT5722Data eVNT5722Data = this.evnt5722Data;
        Long l2 = this.sortingTimeStamp;
        String str9 = this.partnerName;
        String str10 = this.nexusWorkflowResumeUrl;
        Long l3 = this.nexusWorkflowStartTimestampMs;
        Long l4 = this.nexusWorkflowExpiresAtMs;
        StringBuilder sbF = u40.f("AppStatusJob(appTk=", str, ", jobTitle=", str2, ", jobKey=");
        ia.r(sbF, str3, ", jobUrl=", str4, ", jobExpired=");
        p6.j(sbF, z, ", jobReported=", z2, ", jobFraudulent=");
        p6.j(sbF, z3, ", withdrawn=", z4, ", location=");
        sbF.append(str5);
        sbF.append(", company=");
        sbF.append(company);
        sbF.append(", statuses=");
        sbF.append(statuses);
        sbF.append(", applyTime=");
        sbF.append(j);
        sbF.append(", indeedApplyable=");
        sbF.append(z5);
        sbF.append(", hasIaAppId=");
        sbF.append(z6);
        sbF.append(", hasApplicationPreview=");
        sbF.append(z7);
        sbF.append(", hasInterviewNowAccess=");
        sbF.append(z8);
        sbF.append(", applicantsCountRange=");
        sbF.append(applicantsCountRange);
        sbF.append(", normalizedJobTitle=");
        sbF.append(str6);
        sbF.append(", employerEstimatedResponseDays=");
        sbF.append(num);
        sbF.append(", encryptedIaAppId=");
        sbF.append(str7);
        sbF.append(", encryptedAdvCandId=");
        sbF.append(str8);
        sbF.append(", applicationDraftExpiryTime=");
        sbF.append(l);
        sbF.append(", evnt5722Data=");
        sbF.append(eVNT5722Data);
        sbF.append(", sortingTimeStamp=");
        sbF.append(l2);
        ia.r(sbF, ", partnerName=", str9, ", nexusWorkflowResumeUrl=", str10);
        sbF.append(", nexusWorkflowStartTimestampMs=");
        sbF.append(l3);
        sbF.append(", nexusWorkflowExpiresAtMs=");
        sbF.append(l4);
        sbF.append(")");
        return sbF.toString();
    }

    public AppStatusJob(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5, Company company, Statuses statuses, long j, boolean z5, boolean z6, boolean z7, boolean z8, ApplicantsCountRange applicantsCountRange, String str6, Integer num, String str7, String str8, Long l, EVNT5722Data eVNT5722Data, Long l2, String str9, String str10, Long l3, Long l4) {
        w20.p(str, str2, str3, str4, str5);
        company.getClass();
        statuses.getClass();
        this.appTk = str;
        this.jobTitle = str2;
        this.jobKey = str3;
        this.jobUrl = str4;
        this.jobExpired = z;
        this.jobReported = z2;
        this.jobFraudulent = z3;
        this.withdrawn = z4;
        this.location = str5;
        this.company = company;
        this.statuses = statuses;
        this.applyTime = j;
        this.indeedApplyable = z5;
        this.hasIaAppId = z6;
        this.hasApplicationPreview = z7;
        this.hasInterviewNowAccess = z8;
        this.applicantsCountRange = applicantsCountRange;
        this.normalizedJobTitle = str6;
        this.employerEstimatedResponseDays = num;
        this.encryptedIaAppId = str7;
        this.encryptedAdvCandId = str8;
        this.applicationDraftExpiryTime = l;
        this.evnt5722Data = eVNT5722Data;
        this.sortingTimeStamp = l2;
        this.partnerName = str9;
        this.nexusWorkflowResumeUrl = str10;
        this.nexusWorkflowStartTimestampMs = l3;
        this.nexusWorkflowExpiresAtMs = l4;
    }
}

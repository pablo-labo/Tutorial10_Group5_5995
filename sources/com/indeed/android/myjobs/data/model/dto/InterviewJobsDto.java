package com.indeed.android.myjobs.data.model.dto;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.akb;
import defpackage.ia;
import defpackage.nl7;
import defpackage.o6;
import defpackage.u40;
import defpackage.wl7;
import defpackage.zr4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\"\n\u0002\u0010\b\n\u0002\b \b\u0087\b\u0018\u0000 ]2\u00020\u0001:\u0001]Bß\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010 J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010 J\u0010\u0010+\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b+\u0010&J\u0010\u0010,\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b,\u0010&J\u0010\u0010-\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010 J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010 J\u0012\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010 J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010 J\u0010\u00107\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b7\u0010.J\u0010\u00108\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b8\u0010.J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0086\u0002\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u00102\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bHÆ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b=\u0010 J\u0010\u0010?\u001a\u00020>HÖ\u0001¢\u0006\u0004\b?\u0010@J\u001a\u0010B\u001a\u00020\u00102\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bB\u0010CR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010D\u001a\u0004\bE\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010D\u001a\u0004\bF\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010D\u001a\u0004\bG\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010D\u001a\u0004\bH\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010D\u001a\u0004\bI\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010J\u001a\u0004\bK\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bL\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bM\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\bN\u0010 R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bO\u0010 R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010J\u001a\u0004\bP\u0010&R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010J\u001a\u0004\bQ\u0010&R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010R\u001a\u0004\b\u0011\u0010.R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010S\u001a\u0004\bT\u00100R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010D\u001a\u0004\bU\u0010 R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010D\u001a\u0004\bV\u0010 R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0016\u0010W\u001a\u0004\bX\u00104R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010D\u001a\u0004\bY\u0010 R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010D\u001a\u0004\bZ\u0010 R\u0017\u0010\u0019\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0019\u0010R\u001a\u0004\b\u0019\u0010.R\u0017\u0010\u001a\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001a\u0010R\u001a\u0004\b\u001a\u0010.R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010[\u001a\u0004\b\\\u0010:¨\u0006^"}, d2 = {"Lcom/indeed/android/myjobs/data/model/dto/InterviewJobsDto;", "", "", "id", "jobKey", "title", "description", "location", "", "timeStamp", "cancelLink", "rescheduleLink", "joinLink", "status", "startTime", "endTime", "", "isIHP", "Lnl7;", "formatType", "address", "phoneNumber", "availabilityBasedScheduling", "jobLink", "interviewDuration", "isCancelLinkGenerationInProgress", "isRescheduleLinkGenerationInProgress", "", "mostLikelySuids", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLnl7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()J", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "()Z", "component14", "()Lnl7;", "component15", "component16", "component17", "()Ljava/lang/Boolean;", "component18", "component19", "component20", "component21", "component22", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLnl7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;)Lcom/indeed/android/myjobs/data/model/dto/InterviewJobsDto;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getJobKey", "getTitle", "getDescription", "getLocation", "J", "getTimeStamp", "getCancelLink", "getRescheduleLink", "getJoinLink", "getStatus", "getStartTime", "getEndTime", "Z", "Lnl7;", "getFormatType", "getAddress", "getPhoneNumber", "Ljava/lang/Boolean;", "getAvailabilityBasedScheduling", "getJobLink", "getInterviewDuration", "Ljava/util/List;", "getMostLikelySuids", "Companion", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InterviewJobsDto {
    private final String address;
    private final Boolean availabilityBasedScheduling;
    private final String cancelLink;
    private final String description;
    private final long endTime;
    private final nl7 formatType;
    private final String id;
    private final String interviewDuration;
    private final boolean isCancelLinkGenerationInProgress;
    private final boolean isIHP;
    private final boolean isRescheduleLinkGenerationInProgress;
    private final String jobKey;
    private final String jobLink;
    private final String joinLink;
    private final String location;
    private final List<String> mostLikelySuids;
    private final String phoneNumber;
    private final String rescheduleLink;
    private final long startTime;
    private final String status;
    private final long timeStamp;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ InterviewJobsDto(String str, String str2, String str3, String str4, String str5, long j, String str6, String str7, String str8, String str9, long j2, long j3, boolean z, nl7 nl7Var, String str10, String str11, Boolean bool, String str12, String str13, boolean z2, boolean z3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, j, (i & 64) != 0 ? "" : str6, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? "" : str7, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? "" : str8, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? "" : str9, j2, j3, z, nl7Var, str10, str11, bool, str12, str13, (524288 & i) != 0 ? false : z2, (1048576 & i) != 0 ? false : z3, (i & 2097152) != 0 ? zr4.a : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterviewJobsDto copy$default(InterviewJobsDto interviewJobsDto, String str, String str2, String str3, String str4, String str5, long j, String str6, String str7, String str8, String str9, long j2, long j3, boolean z, nl7 nl7Var, String str10, String str11, Boolean bool, String str12, String str13, boolean z2, boolean z3, List list, int i, Object obj) {
        List list2;
        boolean z4;
        String str14 = (i & 1) != 0 ? interviewJobsDto.id : str;
        String str15 = (i & 2) != 0 ? interviewJobsDto.jobKey : str2;
        String str16 = (i & 4) != 0 ? interviewJobsDto.title : str3;
        String str17 = (i & 8) != 0 ? interviewJobsDto.description : str4;
        String str18 = (i & 16) != 0 ? interviewJobsDto.location : str5;
        long j4 = (i & 32) != 0 ? interviewJobsDto.timeStamp : j;
        String str19 = (i & 64) != 0 ? interviewJobsDto.cancelLink : str6;
        String str20 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? interviewJobsDto.rescheduleLink : str7;
        String str21 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? interviewJobsDto.joinLink : str8;
        String str22 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? interviewJobsDto.status : str9;
        long j5 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? interviewJobsDto.startTime : j2;
        String str23 = str14;
        String str24 = str15;
        long j6 = (i & 2048) != 0 ? interviewJobsDto.endTime : j3;
        boolean z5 = (i & 4096) != 0 ? interviewJobsDto.isIHP : z;
        long j7 = j6;
        nl7 nl7Var2 = (i & 8192) != 0 ? interviewJobsDto.formatType : nl7Var;
        String str25 = (i & 16384) != 0 ? interviewJobsDto.address : str10;
        String str26 = (i & 32768) != 0 ? interviewJobsDto.phoneNumber : str11;
        Boolean bool2 = (i & 65536) != 0 ? interviewJobsDto.availabilityBasedScheduling : bool;
        String str27 = (i & 131072) != 0 ? interviewJobsDto.jobLink : str12;
        String str28 = (i & 262144) != 0 ? interviewJobsDto.interviewDuration : str13;
        boolean z6 = (i & 524288) != 0 ? interviewJobsDto.isCancelLinkGenerationInProgress : z2;
        boolean z7 = (i & 1048576) != 0 ? interviewJobsDto.isRescheduleLinkGenerationInProgress : z3;
        if ((i & 2097152) != 0) {
            z4 = z7;
            list2 = interviewJobsDto.mostLikelySuids;
        } else {
            list2 = list;
            z4 = z7;
        }
        return interviewJobsDto.copy(str23, str24, str16, str17, str18, j4, str19, str20, str21, str22, j5, j7, z5, nl7Var2, str25, str26, bool2, str27, str28, z6, z4, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsIHP() {
        return this.isIHP;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final nl7 getFormatType() {
        return this.formatType;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getAvailabilityBasedScheduling() {
        return this.availabilityBasedScheduling;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getJobLink() {
        return this.jobLink;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getInterviewDuration() {
        return this.interviewDuration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getJobKey() {
        return this.jobKey;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getIsCancelLinkGenerationInProgress() {
        return this.isCancelLinkGenerationInProgress;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final boolean getIsRescheduleLinkGenerationInProgress() {
        return this.isRescheduleLinkGenerationInProgress;
    }

    public final List<String> component22() {
        return this.mostLikelySuids;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCancelLink() {
        return this.cancelLink;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRescheduleLink() {
        return this.rescheduleLink;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getJoinLink() {
        return this.joinLink;
    }

    public final InterviewJobsDto copy(String id, String jobKey, String title, String description, String location, long timeStamp, String cancelLink, String rescheduleLink, String joinLink, String status, long startTime, long endTime, boolean isIHP, nl7 formatType, String address, String phoneNumber, Boolean availabilityBasedScheduling, String jobLink, String interviewDuration, boolean isCancelLinkGenerationInProgress, boolean isRescheduleLinkGenerationInProgress, List<String> mostLikelySuids) {
        id.getClass();
        title.getClass();
        description.getClass();
        status.getClass();
        formatType.getClass();
        mostLikelySuids.getClass();
        return new InterviewJobsDto(id, jobKey, title, description, location, timeStamp, cancelLink, rescheduleLink, joinLink, status, startTime, endTime, isIHP, formatType, address, phoneNumber, availabilityBasedScheduling, jobLink, interviewDuration, isCancelLinkGenerationInProgress, isRescheduleLinkGenerationInProgress, mostLikelySuids);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InterviewJobsDto)) {
            return false;
        }
        InterviewJobsDto interviewJobsDto = (InterviewJobsDto) other;
        return wl7.b(this.id, interviewJobsDto.id) && wl7.b(this.jobKey, interviewJobsDto.jobKey) && wl7.b(this.title, interviewJobsDto.title) && wl7.b(this.description, interviewJobsDto.description) && wl7.b(this.location, interviewJobsDto.location) && this.timeStamp == interviewJobsDto.timeStamp && wl7.b(this.cancelLink, interviewJobsDto.cancelLink) && wl7.b(this.rescheduleLink, interviewJobsDto.rescheduleLink) && wl7.b(this.joinLink, interviewJobsDto.joinLink) && wl7.b(this.status, interviewJobsDto.status) && this.startTime == interviewJobsDto.startTime && this.endTime == interviewJobsDto.endTime && this.isIHP == interviewJobsDto.isIHP && this.formatType == interviewJobsDto.formatType && wl7.b(this.address, interviewJobsDto.address) && wl7.b(this.phoneNumber, interviewJobsDto.phoneNumber) && wl7.b(this.availabilityBasedScheduling, interviewJobsDto.availabilityBasedScheduling) && wl7.b(this.jobLink, interviewJobsDto.jobLink) && wl7.b(this.interviewDuration, interviewJobsDto.interviewDuration) && this.isCancelLinkGenerationInProgress == interviewJobsDto.isCancelLinkGenerationInProgress && this.isRescheduleLinkGenerationInProgress == interviewJobsDto.isRescheduleLinkGenerationInProgress && wl7.b(this.mostLikelySuids, interviewJobsDto.mostLikelySuids);
    }

    public final String getAddress() {
        return this.address;
    }

    public final Boolean getAvailabilityBasedScheduling() {
        return this.availabilityBasedScheduling;
    }

    public final String getCancelLink() {
        return this.cancelLink;
    }

    public final String getDescription() {
        return this.description;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final nl7 getFormatType() {
        return this.formatType;
    }

    public final String getId() {
        return this.id;
    }

    public final String getInterviewDuration() {
        return this.interviewDuration;
    }

    public final String getJobKey() {
        return this.jobKey;
    }

    public final String getJobLink() {
        return this.jobLink;
    }

    public final String getJoinLink() {
        return this.joinLink;
    }

    public final String getLocation() {
        return this.location;
    }

    public final List<String> getMostLikelySuids() {
        return this.mostLikelySuids;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getRescheduleLink() {
        return this.rescheduleLink;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getStatus() {
        return this.status;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.jobKey;
        int iD = akb.d(akb.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title), 31, this.description);
        String str2 = this.location;
        int iD2 = ia.d((iD + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.timeStamp);
        String str3 = this.cancelLink;
        int iHashCode2 = (iD2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rescheduleLink;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.joinLink;
        int iHashCode4 = (this.formatType.hashCode() + ia.f(ia.d(ia.d(akb.d((iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.status), 31, this.startTime), 31, this.endTime), 31, this.isIHP)) * 31;
        String str6 = this.address;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.phoneNumber;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.availabilityBasedScheduling;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str8 = this.jobLink;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.interviewDuration;
        return this.mostLikelySuids.hashCode() + ia.f(ia.f((iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31, 31, this.isCancelLinkGenerationInProgress), 31, this.isRescheduleLinkGenerationInProgress);
    }

    public final boolean isCancelLinkGenerationInProgress() {
        return this.isCancelLinkGenerationInProgress;
    }

    public final boolean isIHP() {
        return this.isIHP;
    }

    public final boolean isRescheduleLinkGenerationInProgress() {
        return this.isRescheduleLinkGenerationInProgress;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.jobKey;
        String str3 = this.title;
        String str4 = this.description;
        String str5 = this.location;
        long j = this.timeStamp;
        String str6 = this.cancelLink;
        String str7 = this.rescheduleLink;
        String str8 = this.joinLink;
        String str9 = this.status;
        long j2 = this.startTime;
        long j3 = this.endTime;
        boolean z = this.isIHP;
        nl7 nl7Var = this.formatType;
        String str10 = this.address;
        String str11 = this.phoneNumber;
        Boolean bool = this.availabilityBasedScheduling;
        String str12 = this.jobLink;
        String str13 = this.interviewDuration;
        boolean z2 = this.isCancelLinkGenerationInProgress;
        boolean z3 = this.isRescheduleLinkGenerationInProgress;
        List<String> list = this.mostLikelySuids;
        StringBuilder sbF = u40.f("InterviewJobsDto(id=", str, ", jobKey=", str2, ", title=");
        ia.r(sbF, str3, ", description=", str4, ", location=");
        sbF.append(str5);
        sbF.append(", timeStamp=");
        sbF.append(j);
        ia.r(sbF, ", cancelLink=", str6, ", rescheduleLink=", str7);
        ia.r(sbF, ", joinLink=", str8, ", status=", str9);
        o6.p(sbF, ", startTime=", j2, ", endTime=");
        sbF.append(j3);
        sbF.append(", isIHP=");
        sbF.append(z);
        sbF.append(", formatType=");
        sbF.append(nl7Var);
        sbF.append(", address=");
        sbF.append(str10);
        sbF.append(", phoneNumber=");
        sbF.append(str11);
        sbF.append(", availabilityBasedScheduling=");
        sbF.append(bool);
        ia.r(sbF, ", jobLink=", str12, ", interviewDuration=", str13);
        sbF.append(", isCancelLinkGenerationInProgress=");
        sbF.append(z2);
        sbF.append(", isRescheduleLinkGenerationInProgress=");
        sbF.append(z3);
        sbF.append(", mostLikelySuids=");
        sbF.append(list);
        sbF.append(")");
        return sbF.toString();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/indeed/android/myjobs/data/model/dto/InterviewJobsDto$Companion;", "", "<init>", "()V", "init", "Lcom/indeed/android/myjobs/data/model/dto/InterviewJobsDto;", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterviewJobsDto init() {
            return new InterviewJobsDto("", "", "", "", "", 0L, null, null, null, null, 0L, 0L, false, nl7.a, "", "", Boolean.FALSE, "", "", false, false, zr4.a, 1573824, null);
        }

        private Companion() {
        }
    }

    public InterviewJobsDto(String str, String str2, String str3, String str4, String str5, long j, String str6, String str7, String str8, String str9, long j2, long j3, boolean z, nl7 nl7Var, String str10, String str11, Boolean bool, String str12, String str13, boolean z2, boolean z3, List<String> list) {
        str.getClass();
        str3.getClass();
        str4.getClass();
        str9.getClass();
        nl7Var.getClass();
        list.getClass();
        this.id = str;
        this.jobKey = str2;
        this.title = str3;
        this.description = str4;
        this.location = str5;
        this.timeStamp = j;
        this.cancelLink = str6;
        this.rescheduleLink = str7;
        this.joinLink = str8;
        this.status = str9;
        this.startTime = j2;
        this.endTime = j3;
        this.isIHP = z;
        this.formatType = nl7Var;
        this.address = str10;
        this.phoneNumber = str11;
        this.availabilityBasedScheduling = bool;
        this.jobLink = str12;
        this.interviewDuration = str13;
        this.isCancelLinkGenerationInProgress = z2;
        this.isRescheduleLinkGenerationInProgress = z3;
        this.mostLikelySuids = list;
    }
}

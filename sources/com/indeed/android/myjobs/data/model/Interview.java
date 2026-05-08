package com.indeed.android.myjobs.data.model;

import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.akb;
import defpackage.ia;
import defpackage.u40;
import defpackage.wl7;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\u000eHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00106\u001a\u00020\u000eHÆ\u0003J\t\u00107\u001a\u00020\u0015HÆ\u0003J\u009b\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001J\u0013\u00109\u001a\u00020\u000e2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0011\u0010\u0013\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006>"}, d2 = {"Lcom/indeed/android/myjobs/data/model/Interview;", "", "id", "", "externalInterviewId", "formatType", "status", "metadata", "Lcom/indeed/android/myjobs/data/model/Metadata;", "timeSlots", "", "Lcom/indeed/android/myjobs/data/model/TimeSlot;", "durationInMinutes", "interviewGTS", "", "outcome", SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "Lcom/indeed/android/myjobs/data/model/Actions;", "invitationNote", "availabilityBasedScheduling", "jobDetails", "Lcom/indeed/android/myjobs/data/model/JobDetails;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/indeed/android/myjobs/data/model/Metadata;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Lcom/indeed/android/myjobs/data/model/Actions;Ljava/lang/String;ZLcom/indeed/android/myjobs/data/model/JobDetails;)V", "getId", "()Ljava/lang/String;", "getExternalInterviewId", "getFormatType", "getStatus", "getMetadata", "()Lcom/indeed/android/myjobs/data/model/Metadata;", "getTimeSlots", "()Ljava/util/List;", "getDurationInMinutes", "getInterviewGTS", "()Z", "getOutcome", "getActions", "()Lcom/indeed/android/myjobs/data/model/Actions;", "getInvitationNote", "getAvailabilityBasedScheduling", "getJobDetails", "()Lcom/indeed/android/myjobs/data/model/JobDetails;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "", "toString", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Interview {
    public static final int $stable = 8;
    private final Actions actions;
    private final boolean availabilityBasedScheduling;
    private final String durationInMinutes;
    private final String externalInterviewId;
    private final String formatType;
    private final String id;
    private final boolean interviewGTS;
    private final String invitationNote;
    private final JobDetails jobDetails;
    private final Metadata metadata;
    private final String outcome;
    private final String status;
    private final List<TimeSlot> timeSlots;

    public Interview(String str, String str2, String str3, String str4, Metadata metadata, List<TimeSlot> list, String str5, boolean z, String str6, Actions actions, String str7, boolean z2, JobDetails jobDetails) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        metadata.getClass();
        jobDetails.getClass();
        this.id = str;
        this.externalInterviewId = str2;
        this.formatType = str3;
        this.status = str4;
        this.metadata = metadata;
        this.timeSlots = list;
        this.durationInMinutes = str5;
        this.interviewGTS = z;
        this.outcome = str6;
        this.actions = actions;
        this.invitationNote = str7;
        this.availabilityBasedScheduling = z2;
        this.jobDetails = jobDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Interview copy$default(Interview interview, String str, String str2, String str3, String str4, Metadata metadata, List list, String str5, boolean z, String str6, Actions actions, String str7, boolean z2, JobDetails jobDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            str = interview.id;
        }
        return interview.copy(str, (i & 2) != 0 ? interview.externalInterviewId : str2, (i & 4) != 0 ? interview.formatType : str3, (i & 8) != 0 ? interview.status : str4, (i & 16) != 0 ? interview.metadata : metadata, (i & 32) != 0 ? interview.timeSlots : list, (i & 64) != 0 ? interview.durationInMinutes : str5, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? interview.interviewGTS : z, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? interview.outcome : str6, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? interview.actions : actions, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? interview.invitationNote : str7, (i & 2048) != 0 ? interview.availabilityBasedScheduling : z2, (i & 4096) != 0 ? interview.jobDetails : jobDetails);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Actions getActions() {
        return this.actions;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getInvitationNote() {
        return this.invitationNote;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getAvailabilityBasedScheduling() {
        return this.availabilityBasedScheduling;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final JobDetails getJobDetails() {
        return this.jobDetails;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExternalInterviewId() {
        return this.externalInterviewId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFormatType() {
        return this.formatType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Metadata getMetadata() {
        return this.metadata;
    }

    public final List<TimeSlot> component6() {
        return this.timeSlots;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDurationInMinutes() {
        return this.durationInMinutes;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getInterviewGTS() {
        return this.interviewGTS;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOutcome() {
        return this.outcome;
    }

    public final Interview copy(String id, String externalInterviewId, String formatType, String status, Metadata metadata, List<TimeSlot> timeSlots, String durationInMinutes, boolean interviewGTS, String outcome, Actions actions, String invitationNote, boolean availabilityBasedScheduling, JobDetails jobDetails) {
        id.getClass();
        externalInterviewId.getClass();
        formatType.getClass();
        status.getClass();
        metadata.getClass();
        jobDetails.getClass();
        return new Interview(id, externalInterviewId, formatType, status, metadata, timeSlots, durationInMinutes, interviewGTS, outcome, actions, invitationNote, availabilityBasedScheduling, jobDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Interview)) {
            return false;
        }
        Interview interview = (Interview) other;
        return wl7.b(this.id, interview.id) && wl7.b(this.externalInterviewId, interview.externalInterviewId) && wl7.b(this.formatType, interview.formatType) && wl7.b(this.status, interview.status) && wl7.b(this.metadata, interview.metadata) && wl7.b(this.timeSlots, interview.timeSlots) && wl7.b(this.durationInMinutes, interview.durationInMinutes) && this.interviewGTS == interview.interviewGTS && wl7.b(this.outcome, interview.outcome) && wl7.b(this.actions, interview.actions) && wl7.b(this.invitationNote, interview.invitationNote) && this.availabilityBasedScheduling == interview.availabilityBasedScheduling && wl7.b(this.jobDetails, interview.jobDetails);
    }

    public final Actions getActions() {
        return this.actions;
    }

    public final boolean getAvailabilityBasedScheduling() {
        return this.availabilityBasedScheduling;
    }

    public final String getDurationInMinutes() {
        return this.durationInMinutes;
    }

    public final String getExternalInterviewId() {
        return this.externalInterviewId;
    }

    public final String getFormatType() {
        return this.formatType;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getInterviewGTS() {
        return this.interviewGTS;
    }

    public final String getInvitationNote() {
        return this.invitationNote;
    }

    public final JobDetails getJobDetails() {
        return this.jobDetails;
    }

    public final Metadata getMetadata() {
        return this.metadata;
    }

    public final String getOutcome() {
        return this.outcome;
    }

    public final String getStatus() {
        return this.status;
    }

    public final List<TimeSlot> getTimeSlots() {
        return this.timeSlots;
    }

    public int hashCode() {
        int iHashCode = (this.metadata.hashCode() + akb.d(akb.d(akb.d(this.id.hashCode() * 31, 31, this.externalInterviewId), 31, this.formatType), 31, this.status)) * 31;
        List<TimeSlot> list = this.timeSlots;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.durationInMinutes;
        int iF = ia.f((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.interviewGTS);
        String str2 = this.outcome;
        int iHashCode3 = (iF + (str2 == null ? 0 : str2.hashCode())) * 31;
        Actions actions = this.actions;
        int iHashCode4 = (iHashCode3 + (actions == null ? 0 : actions.hashCode())) * 31;
        String str3 = this.invitationNote;
        return this.jobDetails.hashCode() + ia.f((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.availabilityBasedScheduling);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.externalInterviewId;
        String str3 = this.formatType;
        String str4 = this.status;
        Metadata metadata = this.metadata;
        List<TimeSlot> list = this.timeSlots;
        String str5 = this.durationInMinutes;
        boolean z = this.interviewGTS;
        String str6 = this.outcome;
        Actions actions = this.actions;
        String str7 = this.invitationNote;
        boolean z2 = this.availabilityBasedScheduling;
        JobDetails jobDetails = this.jobDetails;
        StringBuilder sbF = u40.f("Interview(id=", str, ", externalInterviewId=", str2, ", formatType=");
        ia.r(sbF, str3, ", status=", str4, ", metadata=");
        sbF.append(metadata);
        sbF.append(", timeSlots=");
        sbF.append(list);
        sbF.append(", durationInMinutes=");
        akb.q(str5, ", interviewGTS=", ", outcome=", sbF, z);
        sbF.append(str6);
        sbF.append(", actions=");
        sbF.append(actions);
        sbF.append(", invitationNote=");
        akb.q(str7, ", availabilityBasedScheduling=", ", jobDetails=", sbF, z2);
        sbF.append(jobDetails);
        sbF.append(")");
        return sbF.toString();
    }
}

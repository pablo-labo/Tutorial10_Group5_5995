package com.indeed.android.myjobs.data.model.dto;

import com.indeed.android.myjobs.data.model.UserJobStatus;
import defpackage.akb;
import defpackage.ia;
import defpackage.k6;
import defpackage.o6;
import defpackage.p6;
import defpackage.q6;
import defpackage.u40;
import defpackage.w20;
import defpackage.wl7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\bl\b\u0087\b\u0018\u0000 \u008d\u00012\u00020\u0001:\u0002\u008d\u0001B¡\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\f\u0012\b\b\u0002\u0010\u001c\u001a\u00020\f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\f\u0012\b\b\u0002\u0010 \u001a\u00020\f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010#\u001a\u00020\f\u0012\b\b\u0002\u0010$\u001a\u00020\f\u0012\b\b\u0002\u0010%\u001a\u00020\f\u0012\b\b\u0002\u0010&\u001a\u00020\u0003\u0012\b\b\u0002\u0010'\u001a\u00020\u0003\u0012\b\b\u0002\u0010(\u001a\u00020\f\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b0\u00101J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0007HÆ\u0003J\t\u0010c\u001a\u00020\u0007HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\fHÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010h\u001a\u00020\fHÆ\u0003J\t\u0010i\u001a\u00020\fHÆ\u0003J\t\u0010j\u001a\u00020\fHÆ\u0003J\t\u0010k\u001a\u00020\fHÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010o\u001a\u00020\fHÆ\u0003J\t\u0010p\u001a\u00020\fHÆ\u0003J\u0010\u0010q\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010HJ\u000b\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010s\u001a\u00020\fHÆ\u0003J\t\u0010t\u001a\u00020\fHÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010v\u001a\u00020\u0003HÆ\u0003J\t\u0010w\u001a\u00020\fHÆ\u0003J\t\u0010x\u001a\u00020\fHÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\"HÆ\u0003J\t\u0010z\u001a\u00020\fHÆ\u0003J\t\u0010{\u001a\u00020\fHÆ\u0003J\t\u0010|\u001a\u00020\fHÆ\u0003J\t\u0010}\u001a\u00020\u0003HÆ\u0003J\t\u0010~\u001a\u00020\u0003HÆ\u0003J\t\u0010\u007f\u001a\u00020\fHÆ\u0003J\u0011\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010XJ\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010XJ¾\u0003\u0010\u0087\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\f2\b\b\u0002\u0010 \u001a\u00020\f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020\f2\b\b\u0002\u0010$\u001a\u00020\f2\b\b\u0002\u0010%\u001a\u00020\f2\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\f2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0003\u0010\u0088\u0001J\u0015\u0010\u0089\u0001\u001a\u00020\f2\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0019HÖ\u0001J\n\u0010\u008c\u0001\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u00103R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b8\u00107R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u00103R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u00103R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u00103R\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b>\u0010<R\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b?\u0010<R\u0011\u0010\u0010\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b@\u0010<R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010<\"\u0004\bA\u0010BR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\bE\u0010DR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\bF\u0010DR\u0011\u0010\u0016\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010<R\u0011\u0010\u0017\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010<R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u0010I\u001a\u0004\bG\u0010HR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u00103R\u0011\u0010\u001b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bK\u0010<R\u0011\u0010\u001c\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bL\u0010<R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u00103R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u00103R\u0011\u0010\u001f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010<R\u0011\u0010 \u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bO\u0010<R\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0011\u0010#\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010<R\u0011\u0010$\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bR\u0010<R\u0011\u0010%\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bS\u0010<R\u0011\u0010&\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u00103R\u0011\u0010'\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u00103R\u0011\u0010(\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bV\u0010<R\u0015\u0010)\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010Y\u001a\u0004\bW\u0010XR\u0013\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u00103R\u0013\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u00103R\u0013\u0010,\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b[\u00103R\u0013\u0010-\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\\\u00103R\u0015\u0010.\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010Y\u001a\u0004\b]\u0010XR\u0015\u0010/\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010Y\u001a\u0004\b^\u0010X¨\u0006\u008e\u0001"}, d2 = {"Lcom/indeed/android/myjobs/data/model/dto/SavedJobsDto;", "", "title", "", "description", "location", "timeStamp", "", "applyTime", "jobkey", "jobUrl", "hasIaAppId", "", "encryptedIaAppId", "indeedApplyable", "hasApplicationPreview", "hasInterviewNowAccess", "isJobUnSave", "selfReportedStatus", "Lcom/indeed/android/myjobs/data/model/UserJobStatus;", "candidateStatus", "userJobStatus", "isJobReported", "isJobExpired", "employerResponseTime", "", "applicationCount", "withdrawn", "jobFraudulent", "encryptedAdvCandId", "appTk", "isApplyUpdateStatusInProgress", "hasApplicationDraft", "event5722DTO", "Lcom/indeed/android/myjobs/data/model/dto/Event5722DTO;", "isJobMaybeApplied", "shouldShowCloseBubble", "employerStartedReview", "employerReplyLikelihood", "replyLikelihoodAdjusted", "shouldShowRedDot", "sortingTimeStamp", "partnerName", "isEmployerOftenReviewedEnabled", "percentageOfEmpViewed", "aiRecruiterWorkflowResumeUrl", "aiRecruiterWorkflowStartTimestampMs", "aiRecruiterWorkflowExpiresAtMs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZZLcom/indeed/android/myjobs/data/model/UserJobStatus;Lcom/indeed/android/myjobs/data/model/UserJobStatus;Lcom/indeed/android/myjobs/data/model/UserJobStatus;ZZLjava/lang/Integer;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZZLcom/indeed/android/myjobs/data/model/dto/Event5722DTO;ZZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getLocation", "getTimeStamp", "()J", "getApplyTime", "getJobkey", "getJobUrl", "getHasIaAppId", "()Z", "getEncryptedIaAppId", "getIndeedApplyable", "getHasApplicationPreview", "getHasInterviewNowAccess", "setJobUnSave", "(Z)V", "getSelfReportedStatus", "()Lcom/indeed/android/myjobs/data/model/UserJobStatus;", "getCandidateStatus", "getUserJobStatus", "getEmployerResponseTime", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getApplicationCount", "getWithdrawn", "getJobFraudulent", "getEncryptedAdvCandId", "getAppTk", "getHasApplicationDraft", "getEvent5722DTO", "()Lcom/indeed/android/myjobs/data/model/dto/Event5722DTO;", "getShouldShowCloseBubble", "getEmployerStartedReview", "getEmployerReplyLikelihood", "getReplyLikelihoodAdjusted", "getShouldShowRedDot", "getSortingTimeStamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPartnerName", "getPercentageOfEmpViewed", "getAiRecruiterWorkflowResumeUrl", "getAiRecruiterWorkflowStartTimestampMs", "getAiRecruiterWorkflowExpiresAtMs", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZZLcom/indeed/android/myjobs/data/model/UserJobStatus;Lcom/indeed/android/myjobs/data/model/UserJobStatus;Lcom/indeed/android/myjobs/data/model/UserJobStatus;ZZLjava/lang/Integer;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZZLcom/indeed/android/myjobs/data/model/dto/Event5722DTO;ZZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/indeed/android/myjobs/data/model/dto/SavedJobsDto;", "equals", "other", "hashCode", "toString", "Companion", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SavedJobsDto {
    private final Long aiRecruiterWorkflowExpiresAtMs;
    private final String aiRecruiterWorkflowResumeUrl;
    private final Long aiRecruiterWorkflowStartTimestampMs;
    private final String appTk;
    private final String applicationCount;
    private final long applyTime;
    private final UserJobStatus candidateStatus;
    private final String description;
    private final String employerReplyLikelihood;
    private final Integer employerResponseTime;
    private final boolean employerStartedReview;
    private final String encryptedAdvCandId;
    private final String encryptedIaAppId;
    private final Event5722DTO event5722DTO;
    private final boolean hasApplicationDraft;
    private final boolean hasApplicationPreview;
    private final boolean hasIaAppId;
    private final boolean hasInterviewNowAccess;
    private final boolean indeedApplyable;
    private final boolean isApplyUpdateStatusInProgress;
    private final String isEmployerOftenReviewedEnabled;
    private final boolean isJobExpired;
    private final boolean isJobMaybeApplied;
    private final boolean isJobReported;
    private boolean isJobUnSave;
    private final boolean jobFraudulent;
    private final String jobUrl;
    private final String jobkey;
    private final String location;
    private final String partnerName;
    private final String percentageOfEmpViewed;
    private final String replyLikelihoodAdjusted;
    private final UserJobStatus selfReportedStatus;
    private final boolean shouldShowCloseBubble;
    private final boolean shouldShowRedDot;
    private final Long sortingTimeStamp;
    private final long timeStamp;
    private final String title;
    private final UserJobStatus userJobStatus;
    private final boolean withdrawn;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ SavedJobsDto(java.lang.String r48, java.lang.String r49, java.lang.String r50, long r51, long r53, java.lang.String r55, java.lang.String r56, boolean r57, java.lang.String r58, boolean r59, boolean r60, boolean r61, boolean r62, com.indeed.android.myjobs.data.model.UserJobStatus r63, com.indeed.android.myjobs.data.model.UserJobStatus r64, com.indeed.android.myjobs.data.model.UserJobStatus r65, boolean r66, boolean r67, java.lang.Integer r68, java.lang.String r69, boolean r70, boolean r71, java.lang.String r72, java.lang.String r73, boolean r74, boolean r75, com.indeed.android.myjobs.data.model.dto.Event5722DTO r76, boolean r77, boolean r78, boolean r79, java.lang.String r80, java.lang.String r81, boolean r82, java.lang.Long r83, java.lang.String r84, java.lang.String r85, java.lang.String r86, java.lang.String r87, java.lang.Long r88, java.lang.Long r89, int r90, int r91, kotlin.jvm.internal.DefaultConstructorMarker r92) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.myjobs.data.model.dto.SavedJobsDto.<init>(java.lang.String, java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, boolean, boolean, boolean, com.indeed.android.myjobs.data.model.UserJobStatus, com.indeed.android.myjobs.data.model.UserJobStatus, com.indeed.android.myjobs.data.model.UserJobStatus, boolean, boolean, java.lang.Integer, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, boolean, boolean, com.indeed.android.myjobs.data.model.dto.Event5722DTO, boolean, boolean, boolean, java.lang.String, java.lang.String, boolean, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIndeedApplyable() {
        return this.indeedApplyable;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getHasApplicationPreview() {
        return this.hasApplicationPreview;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getHasInterviewNowAccess() {
        return this.hasInterviewNowAccess;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsJobUnSave() {
        return this.isJobUnSave;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final UserJobStatus getSelfReportedStatus() {
        return this.selfReportedStatus;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final UserJobStatus getCandidateStatus() {
        return this.candidateStatus;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final UserJobStatus getUserJobStatus() {
        return this.userJobStatus;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getIsJobReported() {
        return this.isJobReported;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getIsJobExpired() {
        return this.isJobExpired;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Integer getEmployerResponseTime() {
        return this.employerResponseTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getApplicationCount() {
        return this.applicationCount;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final boolean getWithdrawn() {
        return this.withdrawn;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final boolean getJobFraudulent() {
        return this.jobFraudulent;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getEncryptedAdvCandId() {
        return this.encryptedAdvCandId;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getAppTk() {
        return this.appTk;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final boolean getIsApplyUpdateStatusInProgress() {
        return this.isApplyUpdateStatusInProgress;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final boolean getHasApplicationDraft() {
        return this.hasApplicationDraft;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Event5722DTO getEvent5722DTO() {
        return this.event5722DTO;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final boolean getIsJobMaybeApplied() {
        return this.isJobMaybeApplied;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final boolean getShouldShowCloseBubble() {
        return this.shouldShowCloseBubble;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final boolean getEmployerStartedReview() {
        return this.employerStartedReview;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getEmployerReplyLikelihood() {
        return this.employerReplyLikelihood;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getReplyLikelihoodAdjusted() {
        return this.replyLikelihoodAdjusted;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final boolean getShouldShowRedDot() {
        return this.shouldShowRedDot;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final Long getSortingTimeStamp() {
        return this.sortingTimeStamp;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getPartnerName() {
        return this.partnerName;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getIsEmployerOftenReviewedEnabled() {
        return this.isEmployerOftenReviewedEnabled;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getPercentageOfEmpViewed() {
        return this.percentageOfEmpViewed;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getAiRecruiterWorkflowResumeUrl() {
        return this.aiRecruiterWorkflowResumeUrl;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final Long getAiRecruiterWorkflowStartTimestampMs() {
        return this.aiRecruiterWorkflowStartTimestampMs;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final Long getAiRecruiterWorkflowExpiresAtMs() {
        return this.aiRecruiterWorkflowExpiresAtMs;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getApplyTime() {
        return this.applyTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getJobkey() {
        return this.jobkey;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getJobUrl() {
        return this.jobUrl;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getHasIaAppId() {
        return this.hasIaAppId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getEncryptedIaAppId() {
        return this.encryptedIaAppId;
    }

    public final SavedJobsDto copy(String title, String description, String location, long timeStamp, long applyTime, String jobkey, String jobUrl, boolean hasIaAppId, String encryptedIaAppId, boolean indeedApplyable, boolean hasApplicationPreview, boolean hasInterviewNowAccess, boolean isJobUnSave, UserJobStatus selfReportedStatus, UserJobStatus candidateStatus, UserJobStatus userJobStatus, boolean isJobReported, boolean isJobExpired, Integer employerResponseTime, String applicationCount, boolean withdrawn, boolean jobFraudulent, String encryptedAdvCandId, String appTk, boolean isApplyUpdateStatusInProgress, boolean hasApplicationDraft, Event5722DTO event5722DTO, boolean isJobMaybeApplied, boolean shouldShowCloseBubble, boolean employerStartedReview, String employerReplyLikelihood, String replyLikelihoodAdjusted, boolean shouldShowRedDot, Long sortingTimeStamp, String partnerName, String isEmployerOftenReviewedEnabled, String percentageOfEmpViewed, String aiRecruiterWorkflowResumeUrl, Long aiRecruiterWorkflowStartTimestampMs, Long aiRecruiterWorkflowExpiresAtMs) {
        w20.p(title, description, location, jobkey, jobUrl);
        appTk.getClass();
        employerReplyLikelihood.getClass();
        replyLikelihoodAdjusted.getClass();
        return new SavedJobsDto(title, description, location, timeStamp, applyTime, jobkey, jobUrl, hasIaAppId, encryptedIaAppId, indeedApplyable, hasApplicationPreview, hasInterviewNowAccess, isJobUnSave, selfReportedStatus, candidateStatus, userJobStatus, isJobReported, isJobExpired, employerResponseTime, applicationCount, withdrawn, jobFraudulent, encryptedAdvCandId, appTk, isApplyUpdateStatusInProgress, hasApplicationDraft, event5722DTO, isJobMaybeApplied, shouldShowCloseBubble, employerStartedReview, employerReplyLikelihood, replyLikelihoodAdjusted, shouldShowRedDot, sortingTimeStamp, partnerName, isEmployerOftenReviewedEnabled, percentageOfEmpViewed, aiRecruiterWorkflowResumeUrl, aiRecruiterWorkflowStartTimestampMs, aiRecruiterWorkflowExpiresAtMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavedJobsDto)) {
            return false;
        }
        SavedJobsDto savedJobsDto = (SavedJobsDto) other;
        return wl7.b(this.title, savedJobsDto.title) && wl7.b(this.description, savedJobsDto.description) && wl7.b(this.location, savedJobsDto.location) && this.timeStamp == savedJobsDto.timeStamp && this.applyTime == savedJobsDto.applyTime && wl7.b(this.jobkey, savedJobsDto.jobkey) && wl7.b(this.jobUrl, savedJobsDto.jobUrl) && this.hasIaAppId == savedJobsDto.hasIaAppId && wl7.b(this.encryptedIaAppId, savedJobsDto.encryptedIaAppId) && this.indeedApplyable == savedJobsDto.indeedApplyable && this.hasApplicationPreview == savedJobsDto.hasApplicationPreview && this.hasInterviewNowAccess == savedJobsDto.hasInterviewNowAccess && this.isJobUnSave == savedJobsDto.isJobUnSave && wl7.b(this.selfReportedStatus, savedJobsDto.selfReportedStatus) && wl7.b(this.candidateStatus, savedJobsDto.candidateStatus) && wl7.b(this.userJobStatus, savedJobsDto.userJobStatus) && this.isJobReported == savedJobsDto.isJobReported && this.isJobExpired == savedJobsDto.isJobExpired && wl7.b(this.employerResponseTime, savedJobsDto.employerResponseTime) && wl7.b(this.applicationCount, savedJobsDto.applicationCount) && this.withdrawn == savedJobsDto.withdrawn && this.jobFraudulent == savedJobsDto.jobFraudulent && wl7.b(this.encryptedAdvCandId, savedJobsDto.encryptedAdvCandId) && wl7.b(this.appTk, savedJobsDto.appTk) && this.isApplyUpdateStatusInProgress == savedJobsDto.isApplyUpdateStatusInProgress && this.hasApplicationDraft == savedJobsDto.hasApplicationDraft && wl7.b(this.event5722DTO, savedJobsDto.event5722DTO) && this.isJobMaybeApplied == savedJobsDto.isJobMaybeApplied && this.shouldShowCloseBubble == savedJobsDto.shouldShowCloseBubble && this.employerStartedReview == savedJobsDto.employerStartedReview && wl7.b(this.employerReplyLikelihood, savedJobsDto.employerReplyLikelihood) && wl7.b(this.replyLikelihoodAdjusted, savedJobsDto.replyLikelihoodAdjusted) && this.shouldShowRedDot == savedJobsDto.shouldShowRedDot && wl7.b(this.sortingTimeStamp, savedJobsDto.sortingTimeStamp) && wl7.b(this.partnerName, savedJobsDto.partnerName) && wl7.b(this.isEmployerOftenReviewedEnabled, savedJobsDto.isEmployerOftenReviewedEnabled) && wl7.b(this.percentageOfEmpViewed, savedJobsDto.percentageOfEmpViewed) && wl7.b(this.aiRecruiterWorkflowResumeUrl, savedJobsDto.aiRecruiterWorkflowResumeUrl) && wl7.b(this.aiRecruiterWorkflowStartTimestampMs, savedJobsDto.aiRecruiterWorkflowStartTimestampMs) && wl7.b(this.aiRecruiterWorkflowExpiresAtMs, savedJobsDto.aiRecruiterWorkflowExpiresAtMs);
    }

    public final Long getAiRecruiterWorkflowExpiresAtMs() {
        return this.aiRecruiterWorkflowExpiresAtMs;
    }

    public final String getAiRecruiterWorkflowResumeUrl() {
        return this.aiRecruiterWorkflowResumeUrl;
    }

    public final Long getAiRecruiterWorkflowStartTimestampMs() {
        return this.aiRecruiterWorkflowStartTimestampMs;
    }

    public final String getAppTk() {
        return this.appTk;
    }

    public final String getApplicationCount() {
        return this.applicationCount;
    }

    public final long getApplyTime() {
        return this.applyTime;
    }

    public final UserJobStatus getCandidateStatus() {
        return this.candidateStatus;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEmployerReplyLikelihood() {
        return this.employerReplyLikelihood;
    }

    public final Integer getEmployerResponseTime() {
        return this.employerResponseTime;
    }

    public final boolean getEmployerStartedReview() {
        return this.employerStartedReview;
    }

    public final String getEncryptedAdvCandId() {
        return this.encryptedAdvCandId;
    }

    public final String getEncryptedIaAppId() {
        return this.encryptedIaAppId;
    }

    public final Event5722DTO getEvent5722DTO() {
        return this.event5722DTO;
    }

    public final boolean getHasApplicationDraft() {
        return this.hasApplicationDraft;
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

    public final boolean getJobFraudulent() {
        return this.jobFraudulent;
    }

    public final String getJobUrl() {
        return this.jobUrl;
    }

    public final String getJobkey() {
        return this.jobkey;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getPartnerName() {
        return this.partnerName;
    }

    public final String getPercentageOfEmpViewed() {
        return this.percentageOfEmpViewed;
    }

    public final String getReplyLikelihoodAdjusted() {
        return this.replyLikelihoodAdjusted;
    }

    public final UserJobStatus getSelfReportedStatus() {
        return this.selfReportedStatus;
    }

    public final boolean getShouldShowCloseBubble() {
        return this.shouldShowCloseBubble;
    }

    public final boolean getShouldShowRedDot() {
        return this.shouldShowRedDot;
    }

    public final Long getSortingTimeStamp() {
        return this.sortingTimeStamp;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final String getTitle() {
        return this.title;
    }

    public final UserJobStatus getUserJobStatus() {
        return this.userJobStatus;
    }

    public final boolean getWithdrawn() {
        return this.withdrawn;
    }

    public int hashCode() {
        int iF = ia.f(akb.d(akb.d(ia.d(ia.d(akb.d(akb.d(this.title.hashCode() * 31, 31, this.description), 31, this.location), 31, this.timeStamp), 31, this.applyTime), 31, this.jobkey), 31, this.jobUrl), 31, this.hasIaAppId);
        String str = this.encryptedIaAppId;
        int iF2 = ia.f(ia.f(ia.f(ia.f((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.indeedApplyable), 31, this.hasApplicationPreview), 31, this.hasInterviewNowAccess), 31, this.isJobUnSave);
        UserJobStatus userJobStatus = this.selfReportedStatus;
        int iHashCode = (iF2 + (userJobStatus == null ? 0 : userJobStatus.hashCode())) * 31;
        UserJobStatus userJobStatus2 = this.candidateStatus;
        int iHashCode2 = (iHashCode + (userJobStatus2 == null ? 0 : userJobStatus2.hashCode())) * 31;
        UserJobStatus userJobStatus3 = this.userJobStatus;
        int iF3 = ia.f(ia.f((iHashCode2 + (userJobStatus3 == null ? 0 : userJobStatus3.hashCode())) * 31, 31, this.isJobReported), 31, this.isJobExpired);
        Integer num = this.employerResponseTime;
        int iHashCode3 = (iF3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.applicationCount;
        int iF4 = ia.f(ia.f((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.withdrawn), 31, this.jobFraudulent);
        String str3 = this.encryptedAdvCandId;
        int iF5 = ia.f(ia.f(akb.d((iF4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.appTk), 31, this.isApplyUpdateStatusInProgress), 31, this.hasApplicationDraft);
        Event5722DTO event5722DTO = this.event5722DTO;
        int iF6 = ia.f(akb.d(akb.d(ia.f(ia.f(ia.f((iF5 + (event5722DTO == null ? 0 : event5722DTO.hashCode())) * 31, 31, this.isJobMaybeApplied), 31, this.shouldShowCloseBubble), 31, this.employerStartedReview), 31, this.employerReplyLikelihood), 31, this.replyLikelihoodAdjusted), 31, this.shouldShowRedDot);
        Long l = this.sortingTimeStamp;
        int iHashCode4 = (iF6 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.partnerName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.isEmployerOftenReviewedEnabled;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.percentageOfEmpViewed;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.aiRecruiterWorkflowResumeUrl;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l2 = this.aiRecruiterWorkflowStartTimestampMs;
        int iHashCode9 = (iHashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.aiRecruiterWorkflowExpiresAtMs;
        return iHashCode9 + (l3 != null ? l3.hashCode() : 0);
    }

    public final boolean isApplyUpdateStatusInProgress() {
        return this.isApplyUpdateStatusInProgress;
    }

    public final String isEmployerOftenReviewedEnabled() {
        return this.isEmployerOftenReviewedEnabled;
    }

    public final boolean isJobExpired() {
        return this.isJobExpired;
    }

    public final boolean isJobMaybeApplied() {
        return this.isJobMaybeApplied;
    }

    public final boolean isJobReported() {
        return this.isJobReported;
    }

    public final boolean isJobUnSave() {
        return this.isJobUnSave;
    }

    public final void setJobUnSave(boolean z) {
        this.isJobUnSave = z;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        String str3 = this.location;
        long j = this.timeStamp;
        long j2 = this.applyTime;
        String str4 = this.jobkey;
        String str5 = this.jobUrl;
        boolean z = this.hasIaAppId;
        String str6 = this.encryptedIaAppId;
        boolean z2 = this.indeedApplyable;
        boolean z3 = this.hasApplicationPreview;
        boolean z4 = this.hasInterviewNowAccess;
        boolean z5 = this.isJobUnSave;
        UserJobStatus userJobStatus = this.selfReportedStatus;
        UserJobStatus userJobStatus2 = this.candidateStatus;
        UserJobStatus userJobStatus3 = this.userJobStatus;
        boolean z6 = this.isJobReported;
        boolean z7 = this.isJobExpired;
        Integer num = this.employerResponseTime;
        String str7 = this.applicationCount;
        boolean z8 = this.withdrawn;
        boolean z9 = this.jobFraudulent;
        String str8 = this.encryptedAdvCandId;
        String str9 = this.appTk;
        boolean z10 = this.isApplyUpdateStatusInProgress;
        boolean z11 = this.hasApplicationDraft;
        Event5722DTO event5722DTO = this.event5722DTO;
        boolean z12 = this.isJobMaybeApplied;
        boolean z13 = this.shouldShowCloseBubble;
        boolean z14 = this.employerStartedReview;
        String str10 = this.employerReplyLikelihood;
        String str11 = this.replyLikelihoodAdjusted;
        boolean z15 = this.shouldShowRedDot;
        Long l = this.sortingTimeStamp;
        String str12 = this.partnerName;
        String str13 = this.isEmployerOftenReviewedEnabled;
        String str14 = this.percentageOfEmpViewed;
        String str15 = this.aiRecruiterWorkflowResumeUrl;
        Long l2 = this.aiRecruiterWorkflowStartTimestampMs;
        Long l3 = this.aiRecruiterWorkflowExpiresAtMs;
        StringBuilder sbF = u40.f("SavedJobsDto(title=", str, ", description=", str2, ", location=");
        sbF.append(str3);
        sbF.append(", timeStamp=");
        sbF.append(j);
        o6.p(sbF, ", applyTime=", j2, ", jobkey=");
        ia.r(sbF, str4, ", jobUrl=", str5, ", hasIaAppId=");
        k6.k(", encryptedIaAppId=", str6, ", indeedApplyable=", sbF, z);
        p6.j(sbF, z2, ", hasApplicationPreview=", z3, ", hasInterviewNowAccess=");
        p6.j(sbF, z4, ", isJobUnSave=", z5, ", selfReportedStatus=");
        sbF.append(userJobStatus);
        sbF.append(", candidateStatus=");
        sbF.append(userJobStatus2);
        sbF.append(", userJobStatus=");
        sbF.append(userJobStatus3);
        sbF.append(", isJobReported=");
        sbF.append(z6);
        sbF.append(", isJobExpired=");
        sbF.append(z7);
        sbF.append(", employerResponseTime=");
        sbF.append(num);
        sbF.append(", applicationCount=");
        akb.q(str7, ", withdrawn=", ", jobFraudulent=", sbF, z8);
        k6.k(", encryptedAdvCandId=", str8, ", appTk=", sbF, z9);
        akb.q(str9, ", isApplyUpdateStatusInProgress=", ", hasApplicationDraft=", sbF, z10);
        sbF.append(z11);
        sbF.append(", event5722DTO=");
        sbF.append(event5722DTO);
        sbF.append(", isJobMaybeApplied=");
        p6.j(sbF, z12, ", shouldShowCloseBubble=", z13, ", employerStartedReview=");
        k6.k(", employerReplyLikelihood=", str10, ", replyLikelihoodAdjusted=", sbF, z14);
        akb.q(str11, ", shouldShowRedDot=", ", sortingTimeStamp=", sbF, z15);
        sbF.append(l);
        sbF.append(", partnerName=");
        sbF.append(str12);
        sbF.append(", isEmployerOftenReviewedEnabled=");
        ia.r(sbF, str13, ", percentageOfEmpViewed=", str14, ", aiRecruiterWorkflowResumeUrl=");
        sbF.append(str15);
        sbF.append(", aiRecruiterWorkflowStartTimestampMs=");
        sbF.append(l2);
        sbF.append(", aiRecruiterWorkflowExpiresAtMs=");
        sbF.append(l3);
        sbF.append(")");
        return sbF.toString();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/indeed/android/myjobs/data/model/dto/SavedJobsDto$Companion;", "", "<init>", "()V", "init", "Lcom/indeed/android/myjobs/data/model/dto/SavedJobsDto;", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SavedJobsDto init() {
            return new SavedJobsDto("", "", "", 0L, 0L, "", "", false, null, false, false, false, false, null, null, null, false, false, null, null, false, false, null, "", false, false, null, false, false, false, null, null, false, null, null, null, null, null, null, null, -8585344, 255, null);
        }

        private Companion() {
        }
    }

    public SavedJobsDto(String str, String str2, String str3, long j, long j2, String str4, String str5, boolean z, String str6, boolean z2, boolean z3, boolean z4, boolean z5, UserJobStatus userJobStatus, UserJobStatus userJobStatus2, UserJobStatus userJobStatus3, boolean z6, boolean z7, Integer num, String str7, boolean z8, boolean z9, String str8, String str9, boolean z10, boolean z11, Event5722DTO event5722DTO, boolean z12, boolean z13, boolean z14, String str10, String str11, boolean z15, Long l, String str12, String str13, String str14, String str15, Long l2, Long l3) {
        w20.p(str, str2, str3, str4, str5);
        q6.m(str9, str10, str11);
        this.title = str;
        this.description = str2;
        this.location = str3;
        this.timeStamp = j;
        this.applyTime = j2;
        this.jobkey = str4;
        this.jobUrl = str5;
        this.hasIaAppId = z;
        this.encryptedIaAppId = str6;
        this.indeedApplyable = z2;
        this.hasApplicationPreview = z3;
        this.hasInterviewNowAccess = z4;
        this.isJobUnSave = z5;
        this.selfReportedStatus = userJobStatus;
        this.candidateStatus = userJobStatus2;
        this.userJobStatus = userJobStatus3;
        this.isJobReported = z6;
        this.isJobExpired = z7;
        this.employerResponseTime = num;
        this.applicationCount = str7;
        this.withdrawn = z8;
        this.jobFraudulent = z9;
        this.encryptedAdvCandId = str8;
        this.appTk = str9;
        this.isApplyUpdateStatusInProgress = z10;
        this.hasApplicationDraft = z11;
        this.event5722DTO = event5722DTO;
        this.isJobMaybeApplied = z12;
        this.shouldShowCloseBubble = z13;
        this.employerStartedReview = z14;
        this.employerReplyLikelihood = str10;
        this.replyLikelihoodAdjusted = str11;
        this.shouldShowRedDot = z15;
        this.sortingTimeStamp = l;
        this.partnerName = str12;
        this.isEmployerOftenReviewedEnabled = str13;
        this.percentageOfEmpViewed = str14;
        this.aiRecruiterWorkflowResumeUrl = str15;
        this.aiRecruiterWorkflowStartTimestampMs = l2;
        this.aiRecruiterWorkflowExpiresAtMs = l3;
    }
}

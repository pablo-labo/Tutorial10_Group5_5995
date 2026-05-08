package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.myjobs.data.model.AppStatusJob;
import com.indeed.android.myjobs.data.model.InferredApplicationStatus;
import com.indeed.android.myjobs.data.model.dto.DtoExtensionKt;
import com.indeed.android.myjobs.data.model.dto.JobTimestamp;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.domain.usecase.GetAppliedWithVisitedJobsUseCase$invoke$3", f = "GetAppliedWithVisitedJobsUseCase.kt", l = {}, m = "invokeSuspend")
public final class uz5 extends c1f implements xu5<List<? extends AppStatusJob>, List<? extends AppStatusJob>, List<? extends InferredApplicationStatus>, lu2<? super List<? extends SavedJobsDto>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ vz5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz5(vz5 vz5Var, lu2<? super uz5> lu2Var) {
        super(4, lu2Var);
        this.this$0 = vz5Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object next;
        List list = (List) this.L$0;
        List list2 = (List) this.L$1;
        List list3 = (List) this.L$2;
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        List<JobTimestamp> listE = this.this$0.a.e("myjobs_crossJobsTimeStamp");
        if (!list2.isEmpty()) {
            Function1<lx5, j6g> function1 = c05.a;
            c05.e(list2.size(), "nonIagrp3");
        }
        List list4 = list;
        ArrayList arrayList = new ArrayList(t92.r0(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList.add(DtoExtensionKt.toSavedJobDTO((AppStatusJob) it.next()));
        }
        List list5 = list2;
        ArrayList arrayList2 = new ArrayList(t92.r0(list5, 10));
        Iterator it2 = list5.iterator();
        while (true) {
            boolean z = false;
            if (!it2.hasNext()) {
                break;
            }
            AppStatusJob appStatusJob = (AppStatusJob) it2.next();
            List<JobTimestamp> list6 = listE;
            if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                Iterator<T> it3 = list6.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (wl7.b(((JobTimestamp) it3.next()).getJobKey(), appStatusJob.getJobKey())) {
                        z = true;
                        break;
                    }
                }
            }
            SavedJobsDto savedJobDTO = DtoExtensionKt.toSavedJobDTO(appStatusJob);
            arrayList2.add(savedJobDTO.copy(((-4097) & 1) != 0 ? savedJobDTO.title : null, ((-4097) & 2) != 0 ? savedJobDTO.description : null, ((-4097) & 4) != 0 ? savedJobDTO.location : null, ((-4097) & 8) != 0 ? savedJobDTO.timeStamp : 0L, ((-4097) & 16) != 0 ? savedJobDTO.applyTime : 0L, ((-4097) & 32) != 0 ? savedJobDTO.jobkey : null, ((-4097) & 64) != 0 ? savedJobDTO.jobUrl : null, ((-4097) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? savedJobDTO.hasIaAppId : false, ((-4097) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? savedJobDTO.encryptedIaAppId : null, ((-4097) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? savedJobDTO.indeedApplyable : false, ((-4097) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? savedJobDTO.hasApplicationPreview : false, ((-4097) & 2048) != 0 ? savedJobDTO.hasInterviewNowAccess : false, ((-4097) & 4096) != 0 ? savedJobDTO.isJobUnSave : false, ((-4097) & 8192) != 0 ? savedJobDTO.selfReportedStatus : null, ((-4097) & 16384) != 0 ? savedJobDTO.candidateStatus : null, ((-4097) & 32768) != 0 ? savedJobDTO.userJobStatus : null, ((-4097) & 65536) != 0 ? savedJobDTO.isJobReported : false, ((-4097) & 131072) != 0 ? savedJobDTO.isJobExpired : false, ((-4097) & 262144) != 0 ? savedJobDTO.employerResponseTime : null, ((-4097) & 524288) != 0 ? savedJobDTO.applicationCount : null, ((-4097) & 1048576) != 0 ? savedJobDTO.withdrawn : false, ((-4097) & 2097152) != 0 ? savedJobDTO.jobFraudulent : false, ((-4097) & 4194304) != 0 ? savedJobDTO.encryptedAdvCandId : null, ((-4097) & 8388608) != 0 ? savedJobDTO.appTk : null, ((-4097) & 16777216) != 0 ? savedJobDTO.isApplyUpdateStatusInProgress : false, ((-4097) & 33554432) != 0 ? savedJobDTO.hasApplicationDraft : false, ((-4097) & 67108864) != 0 ? savedJobDTO.event5722DTO : null, ((-4097) & 134217728) != 0 ? savedJobDTO.isJobMaybeApplied : false, ((-4097) & 268435456) != 0 ? savedJobDTO.shouldShowCloseBubble : !z, ((-4097) & 536870912) != 0 ? savedJobDTO.employerStartedReview : false, ((-4097) & 1073741824) != 0 ? savedJobDTO.employerReplyLikelihood : null, ((-4097) & Integer.MIN_VALUE) != 0 ? savedJobDTO.replyLikelihoodAdjusted : null, (255 & 1) != 0 ? savedJobDTO.shouldShowRedDot : false, (255 & 2) != 0 ? savedJobDTO.sortingTimeStamp : null, (255 & 4) != 0 ? savedJobDTO.partnerName : null, (255 & 8) != 0 ? savedJobDTO.isEmployerOftenReviewedEnabled : null, (255 & 16) != 0 ? savedJobDTO.percentageOfEmpViewed : null, (255 & 32) != 0 ? savedJobDTO.aiRecruiterWorkflowResumeUrl : null, (255 & 64) != 0 ? savedJobDTO.aiRecruiterWorkflowStartTimestampMs : null, (255 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? savedJobDTO.aiRecruiterWorkflowExpiresAtMs : null));
        }
        ArrayList<SavedJobsDto> arrayListH1 = z92.h1(arrayList, arrayList2);
        vz5 vz5Var = this.this$0;
        ArrayList arrayList3 = new ArrayList(t92.r0(arrayListH1, 10));
        for (SavedJobsDto savedJobsDto : arrayListH1) {
            Iterator it4 = list3.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
                if (wl7.b(((InferredApplicationStatus) next).getJobKey(), savedJobsDto.getJobkey())) {
                    String str = u63.E(savedJobsDto).a;
                    if (wl7.b(str, "APPLIED") || wl7.b(str, "VIEWED") || wl7.b(str, "REVIEWED") || wl7.b(str, "CONTACTING")) {
                        break;
                    }
                }
            }
            InferredApplicationStatus inferredApplicationStatus = (InferredApplicationStatus) next;
            if (inferredApplicationStatus != null) {
                Pair pairA = vz5.a(vz5Var, inferredApplicationStatus.getApplicationInsights());
                String str2 = (String) pairA.a();
                String str3 = (String) pairA.b();
                Boolean employerStartedReview = inferredApplicationStatus.getEmployerStartedReview();
                boolean zBooleanValue = employerStartedReview != null ? employerStartedReview.booleanValue() : false;
                String employerReplyLikelihood = inferredApplicationStatus.getEmployerReplyLikelihood();
                String str4 = employerReplyLikelihood == null ? "" : employerReplyLikelihood;
                String replyLikelihoodAdjusted = inferredApplicationStatus.getReplyLikelihoodAdjusted();
                SavedJobsDto savedJobsDtoCopy = savedJobsDto.copy(((-4097) & 1) != 0 ? savedJobsDto.title : null, ((-4097) & 2) != 0 ? savedJobsDto.description : null, ((-4097) & 4) != 0 ? savedJobsDto.location : null, ((-4097) & 8) != 0 ? savedJobsDto.timeStamp : 0L, ((-4097) & 16) != 0 ? savedJobsDto.applyTime : 0L, ((-4097) & 32) != 0 ? savedJobsDto.jobkey : null, ((-4097) & 64) != 0 ? savedJobsDto.jobUrl : null, ((-4097) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? savedJobsDto.hasIaAppId : false, ((-4097) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? savedJobsDto.encryptedIaAppId : null, ((-4097) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? savedJobsDto.indeedApplyable : false, ((-4097) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? savedJobsDto.hasApplicationPreview : false, ((-4097) & 2048) != 0 ? savedJobsDto.hasInterviewNowAccess : false, ((-4097) & 4096) != 0 ? savedJobsDto.isJobUnSave : false, ((-4097) & 8192) != 0 ? savedJobsDto.selfReportedStatus : null, ((-4097) & 16384) != 0 ? savedJobsDto.candidateStatus : null, ((-4097) & 32768) != 0 ? savedJobsDto.userJobStatus : null, ((-4097) & 65536) != 0 ? savedJobsDto.isJobReported : false, ((-4097) & 131072) != 0 ? savedJobsDto.isJobExpired : false, ((-4097) & 262144) != 0 ? savedJobsDto.employerResponseTime : null, ((-4097) & 524288) != 0 ? savedJobsDto.applicationCount : null, ((-4097) & 1048576) != 0 ? savedJobsDto.withdrawn : false, ((-4097) & 2097152) != 0 ? savedJobsDto.jobFraudulent : false, ((-4097) & 4194304) != 0 ? savedJobsDto.encryptedAdvCandId : null, ((-4097) & 8388608) != 0 ? savedJobsDto.appTk : null, ((-4097) & 16777216) != 0 ? savedJobsDto.isApplyUpdateStatusInProgress : false, ((-4097) & 33554432) != 0 ? savedJobsDto.hasApplicationDraft : false, ((-4097) & 67108864) != 0 ? savedJobsDto.event5722DTO : null, ((-4097) & 134217728) != 0 ? savedJobsDto.isJobMaybeApplied : false, ((-4097) & 268435456) != 0 ? savedJobsDto.shouldShowCloseBubble : false, ((-4097) & 536870912) != 0 ? savedJobsDto.employerStartedReview : zBooleanValue, ((-4097) & 1073741824) != 0 ? savedJobsDto.employerReplyLikelihood : str4, ((-4097) & Integer.MIN_VALUE) != 0 ? savedJobsDto.replyLikelihoodAdjusted : replyLikelihoodAdjusted == null ? "" : replyLikelihoodAdjusted, (255 & 1) != 0 ? savedJobsDto.shouldShowRedDot : false, (255 & 2) != 0 ? savedJobsDto.sortingTimeStamp : null, (255 & 4) != 0 ? savedJobsDto.partnerName : null, (255 & 8) != 0 ? savedJobsDto.isEmployerOftenReviewedEnabled : str2, (255 & 16) != 0 ? savedJobsDto.percentageOfEmpViewed : str3, (255 & 32) != 0 ? savedJobsDto.aiRecruiterWorkflowResumeUrl : null, (255 & 64) != 0 ? savedJobsDto.aiRecruiterWorkflowStartTimestampMs : null, (255 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? savedJobsDto.aiRecruiterWorkflowExpiresAtMs : null);
                if (savedJobsDtoCopy != null) {
                    savedJobsDto = savedJobsDtoCopy;
                }
            }
            arrayList3.add(savedJobsDto);
        }
        return arrayList3;
    }

    @Override // defpackage.xu5
    public final Object j(List<? extends AppStatusJob> list, List<? extends AppStatusJob> list2, List<? extends InferredApplicationStatus> list3, lu2<? super List<? extends SavedJobsDto>> lu2Var) {
        uz5 uz5Var = new uz5(this.this$0, lu2Var);
        uz5Var.L$0 = list;
        uz5Var.L$1 = list2;
        uz5Var.L$2 = list3;
        return uz5Var.invokeSuspend(j6g.a);
    }
}

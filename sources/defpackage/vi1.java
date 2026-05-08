package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.tare.logging.a;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.b5a;
import defpackage.hf3;
import defpackage.lx5;
import defpackage.pld;
import defpackage.sp7;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vi1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vi1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ss2 ss2Var = (ss2) obj;
                ss2Var.N1();
                gb4.i0(ss2Var, (v5b) obj3, (sn1) obj2, 0.0f, null, 60);
                break;
            case 1:
                ((String) obj).getClass();
                ((gu5) obj3).invoke();
                ((g4a) obj2).setValue(Boolean.FALSE);
                break;
            case 2:
                sp7.c cVar = (sp7.c) obj3;
                a aVar = (a) obj2;
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                sp7.c.a aVar2 = cVar.d;
                bVar.a("elementType", aVar2.name());
                Function1<hr7, j6g> function1 = cVar.a;
                if (function1 != null) {
                    function1.invoke(new wp7(cVar, bVar));
                }
                if (aVar2 == sp7.c.a.d) {
                    bVar.a("autoTrackedLastSubTab", aVar.e);
                    aVar.e = cVar.c;
                }
                break;
            case 3:
                gt8 gt8Var = (gt8) obj3;
                gt8Var.c.i(obj2);
                break;
            case 4:
                e13 e13Var = (e13) obj3;
                Map map = (Map) obj2;
                j7f j7fVar = (j7f) ((jz2) obj).a();
                if (j7fVar != null) {
                    u63.Y(e13Var, null, null, new l7a(map, j7fVar, null), 3);
                }
                break;
            case 5:
                String str = (String) obj;
                str.getClass();
                g3a<b5a> g3aVar = ((e8a) obj3).a0;
                String str2 = ((SavedJobsDto) obj2).getHasApplicationDraft() ? "myjobs-save-and-continue" : "myjobs-saved-jobs-direct-apply";
                URI uri = new URI(str);
                String query = uri.getQuery();
                String string = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), (query == null || query.length() == 0) ? "source=".concat(str2) : z3.m(uri.getQuery(), "&source=", str2), uri.getFragment()).toString();
                string.getClass();
                g3aVar.k(new b5a.c(string));
                break;
            default:
                pld pldVar = (pld) obj3;
                pld.c cVar2 = (pld.c) obj2;
                if (((hf3) obj) instanceof hf3.c) {
                    List<SavedJobsDto> list = pldVar.i().a;
                    if (list != null) {
                        List<SavedJobsDto> list2 = list;
                        ArrayList arrayList2 = new ArrayList(t92.r0(list2, 10));
                        for (SavedJobsDto savedJobsDtoCopy : list2) {
                            if (wl7.b(savedJobsDtoCopy.getJobkey(), ((pld.c.n) cVar2).a)) {
                                savedJobsDtoCopy = savedJobsDtoCopy.copy(((-4097) & 1) != 0 ? savedJobsDtoCopy.title : null, ((-4097) & 2) != 0 ? savedJobsDtoCopy.description : null, ((-4097) & 4) != 0 ? savedJobsDtoCopy.location : null, ((-4097) & 8) != 0 ? savedJobsDtoCopy.timeStamp : 0L, ((-4097) & 16) != 0 ? savedJobsDtoCopy.applyTime : 0L, ((-4097) & 32) != 0 ? savedJobsDtoCopy.jobkey : null, ((-4097) & 64) != 0 ? savedJobsDtoCopy.jobUrl : null, ((-4097) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? savedJobsDtoCopy.hasIaAppId : false, ((-4097) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? savedJobsDtoCopy.encryptedIaAppId : null, ((-4097) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? savedJobsDtoCopy.indeedApplyable : false, ((-4097) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? savedJobsDtoCopy.hasApplicationPreview : false, ((-4097) & 2048) != 0 ? savedJobsDtoCopy.hasInterviewNowAccess : false, ((-4097) & 4096) != 0 ? savedJobsDtoCopy.isJobUnSave : true, ((-4097) & 8192) != 0 ? savedJobsDtoCopy.selfReportedStatus : null, ((-4097) & 16384) != 0 ? savedJobsDtoCopy.candidateStatus : null, ((-4097) & 32768) != 0 ? savedJobsDtoCopy.userJobStatus : null, ((-4097) & 65536) != 0 ? savedJobsDtoCopy.isJobReported : false, ((-4097) & 131072) != 0 ? savedJobsDtoCopy.isJobExpired : false, ((-4097) & 262144) != 0 ? savedJobsDtoCopy.employerResponseTime : null, ((-4097) & 524288) != 0 ? savedJobsDtoCopy.applicationCount : null, ((-4097) & 1048576) != 0 ? savedJobsDtoCopy.withdrawn : false, ((-4097) & 2097152) != 0 ? savedJobsDtoCopy.jobFraudulent : false, ((-4097) & 4194304) != 0 ? savedJobsDtoCopy.encryptedAdvCandId : null, ((-4097) & 8388608) != 0 ? savedJobsDtoCopy.appTk : null, ((-4097) & 16777216) != 0 ? savedJobsDtoCopy.isApplyUpdateStatusInProgress : false, ((-4097) & 33554432) != 0 ? savedJobsDtoCopy.hasApplicationDraft : false, ((-4097) & 67108864) != 0 ? savedJobsDtoCopy.event5722DTO : null, ((-4097) & 134217728) != 0 ? savedJobsDtoCopy.isJobMaybeApplied : false, ((-4097) & 268435456) != 0 ? savedJobsDtoCopy.shouldShowCloseBubble : false, ((-4097) & 536870912) != 0 ? savedJobsDtoCopy.employerStartedReview : false, ((-4097) & 1073741824) != 0 ? savedJobsDtoCopy.employerReplyLikelihood : null, ((-4097) & Integer.MIN_VALUE) != 0 ? savedJobsDtoCopy.replyLikelihoodAdjusted : null, (255 & 1) != 0 ? savedJobsDtoCopy.shouldShowRedDot : false, (255 & 2) != 0 ? savedJobsDtoCopy.sortingTimeStamp : null, (255 & 4) != 0 ? savedJobsDtoCopy.partnerName : null, (255 & 8) != 0 ? savedJobsDtoCopy.isEmployerOftenReviewedEnabled : null, (255 & 16) != 0 ? savedJobsDtoCopy.percentageOfEmpViewed : null, (255 & 32) != 0 ? savedJobsDtoCopy.aiRecruiterWorkflowResumeUrl : null, (255 & 64) != 0 ? savedJobsDtoCopy.aiRecruiterWorkflowStartTimestampMs : null, (255 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? savedJobsDtoCopy.aiRecruiterWorkflowExpiresAtMs : null);
                            }
                            arrayList2.add(savedJobsDtoCopy);
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    pldVar.i();
                    old oldVarA = old.a(pldVar.i(), arrayList, null, false, 0, null, null, false, null, false, null, false, null, null, false, false, 0, 262142);
                    gse gseVar = pldVar.b;
                    gseVar.getClass();
                    gseVar.m(null, oldVarA);
                    Function1<lx5, j6g> function12 = c05.a;
                    pld.c.n nVar = (pld.c.n) cVar2;
                    String str3 = nVar.c;
                    String str4 = nVar.b;
                    str4.getClass();
                    c05.a.invoke(tx5.k(c05.b, "myjobs_native_screen", "unSaveJob", new w34(1, str3, str4), 4));
                }
                break;
        }
        return j6g.a;
    }
}

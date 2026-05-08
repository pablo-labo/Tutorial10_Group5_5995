package defpackage;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.myjobs.data.model.UserJobStatus;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import com.indeed.android.reactnative.rntarebridge.RNTareBridge;
import com.indeed.android.rnace.RNAceModule;
import defpackage.epg;
import defpackage.hf3;
import defpackage.jwa;
import defpackage.le0;
import defpackage.lx5;
import defpackage.pld;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wi1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wi1(pif pifVar, le0.c cVar, zx8 zx8Var) {
        this.a = 6;
        this.b = cVar;
        this.c = zx8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        rif rifVarB;
        rif rifVarB2;
        rif rifVarB3;
        int i = this.a;
        int i2 = 4;
        foeVarC = null;
        foe foeVarC = null;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ss2 ss2Var = (ss2) obj;
                ss2Var.N1();
                gb4.i0(ss2Var, ((jwa.a) obj3).a, (sn1) obj2, 0.0f, null, 60);
                return j6g.a;
            case 1:
                jhf jhfVar = (jhf) obj;
                jhfVar.getClass();
                ((g4a) obj3).setValue(jhfVar);
                ((g4a) obj2).setValue(jhfVar.a.b);
                return j6g.a;
            case 2:
                return RNAceModule.logGenericEvent$lambda$2((RNAceModule) obj3, (ReadableMap) obj2, (lx5.b) obj);
            case 3:
                return RNTareBridge.logLegacyGenericEvent$lambda$7((RNTareBridge) obj3, (ReadableMap) obj2, (lx5.b) obj);
            case 4:
                pld pldVar = (pld) obj3;
                pld.c cVar = (pld.c) obj2;
                if (((hf3) obj) instanceof hf3.c) {
                    List<SavedJobsDto> list = pldVar.i().a;
                    if (list != null) {
                        List<SavedJobsDto> list2 = list;
                        ArrayList arrayList2 = new ArrayList(t92.r0(list2, 10));
                        for (SavedJobsDto savedJobsDtoCopy : list2) {
                            if (wl7.b(savedJobsDtoCopy.getJobkey(), ((pld.c.l) cVar).a.getJobkey())) {
                                savedJobsDtoCopy = savedJobsDtoCopy.copy(((-4097) & 1) != 0 ? savedJobsDtoCopy.title : null, ((-4097) & 2) != 0 ? savedJobsDtoCopy.description : null, ((-4097) & 4) != 0 ? savedJobsDtoCopy.location : null, ((-4097) & 8) != 0 ? savedJobsDtoCopy.timeStamp : 0L, ((-4097) & 16) != 0 ? savedJobsDtoCopy.applyTime : 0L, ((-4097) & 32) != 0 ? savedJobsDtoCopy.jobkey : null, ((-4097) & 64) != 0 ? savedJobsDtoCopy.jobUrl : null, ((-4097) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? savedJobsDtoCopy.hasIaAppId : false, ((-4097) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? savedJobsDtoCopy.encryptedIaAppId : null, ((-4097) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? savedJobsDtoCopy.indeedApplyable : false, ((-4097) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? savedJobsDtoCopy.hasApplicationPreview : false, ((-4097) & 2048) != 0 ? savedJobsDtoCopy.hasInterviewNowAccess : false, ((-4097) & 4096) != 0 ? savedJobsDtoCopy.isJobUnSave : false, ((-4097) & 8192) != 0 ? savedJobsDtoCopy.selfReportedStatus : null, ((-4097) & 16384) != 0 ? savedJobsDtoCopy.candidateStatus : null, ((-4097) & 32768) != 0 ? savedJobsDtoCopy.userJobStatus : null, ((-4097) & 65536) != 0 ? savedJobsDtoCopy.isJobReported : false, ((-4097) & 131072) != 0 ? savedJobsDtoCopy.isJobExpired : false, ((-4097) & 262144) != 0 ? savedJobsDtoCopy.employerResponseTime : null, ((-4097) & 524288) != 0 ? savedJobsDtoCopy.applicationCount : null, ((-4097) & 1048576) != 0 ? savedJobsDtoCopy.withdrawn : false, ((-4097) & 2097152) != 0 ? savedJobsDtoCopy.jobFraudulent : false, ((-4097) & 4194304) != 0 ? savedJobsDtoCopy.encryptedAdvCandId : null, ((-4097) & 8388608) != 0 ? savedJobsDtoCopy.appTk : null, ((-4097) & 16777216) != 0 ? savedJobsDtoCopy.isApplyUpdateStatusInProgress : false, ((-4097) & 33554432) != 0 ? savedJobsDtoCopy.hasApplicationDraft : false, ((-4097) & 67108864) != 0 ? savedJobsDtoCopy.event5722DTO : null, ((-4097) & 134217728) != 0 ? savedJobsDtoCopy.isJobMaybeApplied : false, ((-4097) & 268435456) != 0 ? savedJobsDtoCopy.shouldShowCloseBubble : false, ((-4097) & 536870912) != 0 ? savedJobsDtoCopy.employerStartedReview : false, ((-4097) & 1073741824) != 0 ? savedJobsDtoCopy.employerReplyLikelihood : null, ((-4097) & Integer.MIN_VALUE) != 0 ? savedJobsDtoCopy.replyLikelihoodAdjusted : null, (255 & 1) != 0 ? savedJobsDtoCopy.shouldShowRedDot : false, (255 & 2) != 0 ? savedJobsDtoCopy.sortingTimeStamp : null, (255 & 4) != 0 ? savedJobsDtoCopy.partnerName : null, (255 & 8) != 0 ? savedJobsDtoCopy.isEmployerOftenReviewedEnabled : null, (255 & 16) != 0 ? savedJobsDtoCopy.percentageOfEmpViewed : null, (255 & 32) != 0 ? savedJobsDtoCopy.aiRecruiterWorkflowResumeUrl : null, (255 & 64) != 0 ? savedJobsDtoCopy.aiRecruiterWorkflowStartTimestampMs : null, (255 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? savedJobsDtoCopy.aiRecruiterWorkflowExpiresAtMs : null);
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
                    pldVar.j(cVar);
                    Function1<lx5, j6g> function1 = c05.a;
                    SavedJobsDto savedJobsDto = ((pld.c.l) cVar).a;
                    UserJobStatus userJobStatus = savedJobsDto.getUserJobStatus();
                    String status = userJobStatus != null ? userJobStatus.getStatus() : null;
                    String appTk = savedJobsDto.getAppTk();
                    appTk.getClass();
                    c05.a.invoke(tx5.k(c05.b, "myjobs_native_screen", "undoJob", new df(3, status, appTk), 4));
                }
                return j6g.a;
            case 5:
                u63.Y((e13) obj3, null, i13.d, new a3e((y72) obj2, (le0) obj, null), 1);
                return j6g.a;
            case 6:
                le0.c cVar2 = (le0.c) obj3;
                c3a c3aVar = ((zx8) obj2).b;
                gcf gcfVar = (gcf) obj;
                rx8 rx8Var = (rx8) cVar2.a;
                rif rifVarB4 = rx8Var.b();
                foe foeVar = rifVarB4 != null ? rifVarB4.a : null;
                foe foeVarC2 = ((1 & ((dme) c3aVar).e()) == 0 || (rifVarB3 = rx8Var.b()) == null) ? null : rifVarB3.b;
                if (foeVar != null) {
                    foeVarC2 = foeVar.c(foeVarC2);
                }
                foe foeVarC3 = ((((dme) c3aVar).e() & 2) == 0 || (rifVarB2 = rx8Var.b()) == null) ? null : rifVarB2.c;
                if (foeVarC2 != null) {
                    foeVarC3 = foeVarC2.c(foeVarC3);
                }
                if ((((dme) c3aVar).e() & 4) != 0 && (rifVarB = rx8Var.b()) != null) {
                    foeVarC = rifVarB.d;
                }
                if (foeVarC3 != null) {
                    foeVarC = foeVarC3.c(foeVarC);
                }
                gcfVar.getClass();
                gcfVar.b = gcfVar.a.e(new ad1(i2, new huc(), cVar2, foeVarC));
                return j6g.a;
            case 7:
                ((xm9) obj3).j(((dv5) obj2).apply(obj));
                return j6g.a;
            default:
                xzg xzgVar = (xzg) obj3;
                View view = (View) obj2;
                mf7 mf7Var = xzgVar.u;
                if (xzgVar.t == 0) {
                    WeakHashMap<View, prg> weakHashMap = epg.a;
                    epg.d.m(view, mf7Var);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(mf7Var);
                    epg.q(view, mf7Var);
                }
                xzgVar.t++;
                return new wzg(xzgVar, view);
        }
    }

    public /* synthetic */ wi1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}

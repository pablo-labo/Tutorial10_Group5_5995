package defpackage;

import android.util.Log;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.myjobs.data.model.APIError;
import com.indeed.android.myjobs.data.model.ApiResponse;
import com.indeed.android.myjobs.data.model.AppStatusJob;
import com.indeed.android.myjobs.data.model.Body;
import com.indeed.android.myjobs.data.model.UserJobStatus;
import com.indeed.android.myjobs.data.model.dto.BrandedAdsDto;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.hf3;
import defpackage.w56;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class fr0 extends xb1<old, b> {
    public final vz5 V;
    public final bkd W;
    public final tjd X;
    public final g26 Y;
    public final s0a Z;
    public final w56 a0;
    public final c39 b0;
    public final a06 c0;
    public final x29 d0;
    public final vjd e0;
    public final fp0 f;
    public final g06 f0;
    public final g85 g0;
    public final h39 h0;
    public boolean i0;
    public long l0;
    public final nde n0;
    public final pqc o0;
    public int j0 = -1;
    public Map<String, String> k0 = new HashMap();
    public final Set<String> m0 = ut0.I0(new String[]{"HIRED", "VIEWED", "REVIEWED", "INTERVIEW", "CONTACTING"});

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabViewModel$1", f = "AppliedTabViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: fr0$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabViewModel$1$1", f = "AppliedTabViewModel.kt", l = {283, 282}, m = "invokeSuspend")
        public static final class C0237a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            Object L$0;
            int label;
            final /* synthetic */ fr0 this$0;

            /* JADX INFO: renamed from: fr0$a$a$a, reason: collision with other inner class name */
            @uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabViewModel$1$1$1$1", f = "AppliedTabViewModel.kt", l = {}, m = "invokeSuspend")
            public static final class C0238a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
                final /* synthetic */ int $hasActionableNextStep;
                final /* synthetic */ List<SavedJobsDto> $it;
                int label;
                final /* synthetic */ fr0 this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0238a(fr0 fr0Var, List<SavedJobsDto> list, int i, lu2<? super C0238a> lu2Var) {
                    super(2, lu2Var);
                    this.this$0 = fr0Var;
                    this.$it = list;
                    this.$hasActionableNextStep = i;
                }

                @Override // defpackage.x81
                public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                    return new C0238a(this.this$0, this.$it, this.$hasActionableNextStep, lu2Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                    return ((C0238a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    ArrayList arrayList;
                    if (this.label != 0) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                    fr0 fr0Var = this.this$0;
                    List<SavedJobsDto> list = this.$it;
                    Set<String> set = fr0Var.m0;
                    Map<String, String> map = fr0Var.k0;
                    huc hucVar = new huc();
                    if (list != null) {
                        List<SavedJobsDto> list2 = list;
                        ArrayList arrayList2 = new ArrayList(t92.r0(list2, 10));
                        for (SavedJobsDto savedJobsDto : list2) {
                            i74 i74VarE = u63.E(savedJobsDto);
                            UserJobStatus candidateStatus = savedJobsDto.getCandidateStatus();
                            String status = candidateStatus != null ? candidateStatus.getStatus() : null;
                            boolean z = (wl7.b(i74VarE.c, "CANDIDATE") && !map.containsKey(savedJobsDto.getJobkey()) && z92.I0(set, status)) || (!wl7.b(status, map.get(savedJobsDto.getJobkey())) && z92.I0(set, status));
                            if (z) {
                                hucVar.element = true;
                            }
                            arrayList2.add(savedJobsDto.copy(((-4097) & 1) != 0 ? savedJobsDto.title : null, ((-4097) & 2) != 0 ? savedJobsDto.description : null, ((-4097) & 4) != 0 ? savedJobsDto.location : null, ((-4097) & 8) != 0 ? savedJobsDto.timeStamp : 0L, ((-4097) & 16) != 0 ? savedJobsDto.applyTime : 0L, ((-4097) & 32) != 0 ? savedJobsDto.jobkey : null, ((-4097) & 64) != 0 ? savedJobsDto.jobUrl : null, ((-4097) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? savedJobsDto.hasIaAppId : false, ((-4097) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? savedJobsDto.encryptedIaAppId : null, ((-4097) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? savedJobsDto.indeedApplyable : false, ((-4097) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? savedJobsDto.hasApplicationPreview : false, ((-4097) & 2048) != 0 ? savedJobsDto.hasInterviewNowAccess : false, ((-4097) & 4096) != 0 ? savedJobsDto.isJobUnSave : false, ((-4097) & 8192) != 0 ? savedJobsDto.selfReportedStatus : null, ((-4097) & 16384) != 0 ? savedJobsDto.candidateStatus : null, ((-4097) & 32768) != 0 ? savedJobsDto.userJobStatus : null, ((-4097) & 65536) != 0 ? savedJobsDto.isJobReported : false, ((-4097) & 131072) != 0 ? savedJobsDto.isJobExpired : false, ((-4097) & 262144) != 0 ? savedJobsDto.employerResponseTime : null, ((-4097) & 524288) != 0 ? savedJobsDto.applicationCount : null, ((-4097) & 1048576) != 0 ? savedJobsDto.withdrawn : false, ((-4097) & 2097152) != 0 ? savedJobsDto.jobFraudulent : false, ((-4097) & 4194304) != 0 ? savedJobsDto.encryptedAdvCandId : null, ((-4097) & 8388608) != 0 ? savedJobsDto.appTk : null, ((-4097) & 16777216) != 0 ? savedJobsDto.isApplyUpdateStatusInProgress : false, ((-4097) & 33554432) != 0 ? savedJobsDto.hasApplicationDraft : false, ((-4097) & 67108864) != 0 ? savedJobsDto.event5722DTO : null, ((-4097) & 134217728) != 0 ? savedJobsDto.isJobMaybeApplied : false, ((-4097) & 268435456) != 0 ? savedJobsDto.shouldShowCloseBubble : false, ((-4097) & 536870912) != 0 ? savedJobsDto.employerStartedReview : false, ((-4097) & 1073741824) != 0 ? savedJobsDto.employerReplyLikelihood : null, ((-4097) & Integer.MIN_VALUE) != 0 ? savedJobsDto.replyLikelihoodAdjusted : null, (255 & 1) != 0 ? savedJobsDto.shouldShowRedDot : z, (255 & 2) != 0 ? savedJobsDto.sortingTimeStamp : null, (255 & 4) != 0 ? savedJobsDto.partnerName : null, (255 & 8) != 0 ? savedJobsDto.isEmployerOftenReviewedEnabled : null, (255 & 16) != 0 ? savedJobsDto.percentageOfEmpViewed : null, (255 & 32) != 0 ? savedJobsDto.aiRecruiterWorkflowResumeUrl : null, (255 & 64) != 0 ? savedJobsDto.aiRecruiterWorkflowStartTimestampMs : null, (255 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? savedJobsDto.aiRecruiterWorkflowExpiresAtMs : null));
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    fr0Var.i().getClass();
                    old oldVarA = old.a(fr0Var.i(), null, null, false, 0, null, null, false, null, hucVar.element, null, false, null, null, false, false, 0, 261119);
                    gse gseVar = fr0Var.b;
                    gseVar.getClass();
                    gseVar.m(null, oldVarA);
                    fr0 fr0Var2 = this.this$0;
                    int i = this.$hasActionableNextStep;
                    fr0Var2.getClass();
                    fr0Var2.i();
                    old oldVarA2 = old.a(fr0Var2.i(), arrayList, null, false, 0, null, null, false, null, false, null, false, null, null, false, false, i, 130942);
                    gse gseVar2 = fr0Var2.b;
                    gseVar2.getClass();
                    gseVar2.m(null, oldVarA2);
                    return j6g.a;
                }
            }

            /* JADX INFO: renamed from: fr0$a$a$b */
            public static final class b<T> implements Comparator {
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ak2.i(Long.valueOf(((SavedJobsDto) t2).getTimeStamp()), Long.valueOf(((SavedJobsDto) t).getTimeStamp()));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0237a(fr0 fr0Var, lu2<? super C0237a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = fr0Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0237a(this.this$0, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0237a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
            
                if (defpackage.xb1.g((defpackage.vi5) r12, r6, r11) == r4) goto L22;
             */
            @Override // defpackage.x81
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    int r0 = r11.label
                    r1 = 0
                    r2 = 2
                    r3 = 1
                    g13 r4 = defpackage.g13.a
                    if (r0 == 0) goto L20
                    if (r0 == r3) goto L18
                    if (r0 != r2) goto L12
                    defpackage.r7d.b(r12)
                    goto L83
                L12:
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r11)
                    return r1
                L18:
                    java.lang.Object r0 = r11.L$0
                    fr0 r0 = (defpackage.fr0) r0
                    defpackage.r7d.b(r12)
                    goto L6c
                L20:
                    defpackage.r7d.b(r12)
                    fr0 r0 = r11.this$0
                    vz5 r12 = r0.V
                    lr7 r5 = defpackage.i6a.d()
                    int r5 = r5.a
                    r6 = 0
                    r7 = 3
                    if (r5 != r7) goto L33
                    r5 = r3
                    goto L34
                L33:
                    r5 = r6
                L34:
                    r11.L$0 = r0
                    r11.label = r3
                    r12.getClass()
                    f88 r8 = r12.a
                    if (r5 != 0) goto L4a
                    rqc r5 = r8.b()
                    tz5 r6 = new tz5
                    r6.<init>(r5, r12)
                    r12 = r6
                    goto L69
                L4a:
                    rqc r5 = r8.b()
                    rqc r9 = r8.z()
                    rqc r8 = r8.n()
                    uz5 r10 = new uz5
                    r10.<init>(r12, r1)
                    vi5[] r12 = new defpackage.vi5[r7]
                    r12[r6] = r5
                    r12[r3] = r9
                    r12[r2] = r8
                    rk5 r5 = new rk5
                    r5.<init>(r12, r10)
                    r12 = r5
                L69:
                    if (r12 != r4) goto L6c
                    goto L82
                L6c:
                    vi5 r12 = (defpackage.vi5) r12
                    fr0 r5 = r11.this$0
                    bt r6 = new bt
                    r6.<init>(r5, r3)
                    r11.L$0 = r1
                    r11.label = r2
                    r0.getClass()
                    java.lang.Object r11 = defpackage.xb1.g(r12, r6, r11)
                    if (r11 != r4) goto L83
                L82:
                    return r4
                L83:
                    j6g r11 = defpackage.j6g.a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: fr0.a.C0237a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabViewModel$1$2", f = "AppliedTabViewModel.kt", l = {330, 330}, m = "invokeSuspend")
        public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            int label;
            final /* synthetic */ fr0 this$0;

            /* JADX INFO: renamed from: fr0$a$b$a, reason: collision with other inner class name */
            public static final class C0239a<T> implements wi5 {
                public final /* synthetic */ fr0 a;

                public C0239a(fr0 fr0Var) {
                    this.a = fr0Var;
                }

                @Override // defpackage.wi5
                public final Object a(Object obj, lu2 lu2Var) {
                    List list = (List) obj;
                    fr0 fr0Var = this.a;
                    fr0Var.k(new gr0(0, fr0Var, list));
                    Function1<lx5, j6g> function1 = c05.a;
                    c05.e(list.size(), "nonIagrp2");
                    return j6g.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(fr0 fr0Var, lu2<? super b> lu2Var) {
                super(2, lu2Var);
                this.this$0 = fr0Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new b(this.this$0, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
            
                if (((defpackage.vi5) r5).e(r0, r4) != r3) goto L21;
             */
            @Override // defpackage.x81
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    int r0 = r4.label
                    r1 = 2
                    r2 = 1
                    g13 r3 = defpackage.g13.a
                    if (r0 == 0) goto L1b
                    if (r0 == r2) goto L17
                    if (r0 != r1) goto L10
                    defpackage.r7d.b(r5)
                    goto L55
                L10:
                    java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r4)
                    r4 = 0
                    return r4
                L17:
                    defpackage.r7d.b(r5)
                    goto L43
                L1b:
                    defpackage.r7d.b(r5)
                    lr7 r5 = defpackage.i6a.d()
                    int r5 = r5.a
                    if (r5 != r1) goto L55
                    boolean r5 = defpackage.i6a.p()
                    if (r5 == 0) goto L55
                    fr0 r5 = r4.this$0
                    g26 r5 = r5.Y
                    j6g r0 = defpackage.j6g.a
                    r4.label = r2
                    f88 r5 = r5.a
                    rqc r5 = r5.z()
                    f26 r0 = new f26
                    r0.<init>(r5)
                    if (r0 != r3) goto L42
                    goto L54
                L42:
                    r5 = r0
                L43:
                    vi5 r5 = (defpackage.vi5) r5
                    fr0$a$b$a r0 = new fr0$a$b$a
                    fr0 r2 = r4.this$0
                    r0.<init>(r2)
                    r4.label = r1
                    java.lang.Object r4 = r5.e(r0, r4)
                    if (r4 != r3) goto L55
                L54:
                    return r3
                L55:
                    j6g r4 = defpackage.j6g.a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: fr0.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = fr0.this.new a(lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            e13 e13Var = (e13) this.L$0;
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            u63.Y(e13Var, null, null, new C0237a(fr0.this, null), 3);
            u63.Y(e13Var, null, null, new b(fr0.this, null), 3);
            return j6g.a;
        }
    }

    public static abstract class c {

        public static final class a extends c {
            public final String a;

            public a(String str) {
                str.getClass();
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return l5.m("NavigateToAiRecruiter(url=", this.a, ")");
            }
        }

        public static final class b extends c {
            public final String a;
            public final String b;

            public b(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return wl7.b(this.a, bVar.a) && wl7.b(this.b, bVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return akb.k("NavigateToEbaAd(url=", this.a, ", from=", this.b, ")");
            }
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabViewModel$loadBrandedAd$1", f = "AppliedTabViewModel.kt", l = {485, 492}, m = "invokeSuspend")
    public static final class d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        @uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabViewModel$loadBrandedAd$1$1", f = "AppliedTabViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<hf3<BrandedAdsDto>, lu2<? super j6g>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ fr0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(fr0 fr0Var, lu2<? super a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = fr0Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                a aVar = new a(this.this$0, lu2Var);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(hf3<BrandedAdsDto> hf3Var, lu2<? super j6g> lu2Var) {
                return ((a) create(hf3Var, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                hf3 hf3Var = (hf3) this.L$0;
                if (this.label != 0) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                if (hf3Var instanceof hf3.c) {
                    BrandedAdsDto brandedAdsDto = (BrandedAdsDto) ((hf3.c) hf3Var).a;
                    boolean zB = wl7.b(brandedAdsDto.getCreativeKeyval(), this.this$0.i().m);
                    fr0 fr0Var = this.this$0;
                    if (zB) {
                        fr0Var.i();
                        fr0Var.b.setValue(old.a(fr0Var.i(), null, null, false, 0, null, null, false, null, false, null, false, null, null, false, false, 0, 229375));
                    } else {
                        fr0Var.i();
                        fr0Var.b.setValue(old.a(fr0Var.i(), null, null, false, 0, null, null, false, null, false, brandedAdsDto, false, null, brandedAdsDto.getCreativeKeyval(), false, false, 0, 210943));
                    }
                } else if (hf3Var instanceof hf3.a) {
                    ArrayList arrayList = lz2.a;
                    APIError aPIError = ((hf3.a) hf3Var).a;
                    lz2.c("AppliedTabViewModel", l5.l("Error loading branded ads: ", aPIError != null ? aPIError.getMessage() : null), false, null, 8);
                } else {
                    if (!(hf3Var instanceof hf3.b)) {
                        l.g();
                        return null;
                    }
                    ArrayList arrayList2 = lz2.a;
                    Log.d("AppliedTabViewModel", "Branded ads loading", null);
                }
                return j6g.a;
            }
        }

        public d(lu2<? super d> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return fr0.this.new d(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
        
            if (defpackage.wg2.q((defpackage.vi5) r9, r0, r8) == r4) goto L18;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                int r0 = r8.label
                r1 = 0
                r2 = 2
                r3 = 1
                g13 r4 = defpackage.g13.a
                if (r0 == 0) goto L1b
                if (r0 == r3) goto L17
                if (r0 != r2) goto L11
                defpackage.r7d.b(r9)     // Catch: java.lang.Exception -> L54
                goto L5f
            L11:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r8)
                return r1
            L17:
                defpackage.r7d.b(r9)     // Catch: java.lang.Exception -> L54
                goto L42
            L1b:
                defpackage.r7d.b(r9)
                fr0 r9 = defpackage.fr0.this     // Catch: java.lang.Exception -> L54
                a06 r9 = r9.c0     // Catch: java.lang.Exception -> L54
                a06$a r0 = new a06$a     // Catch: java.lang.Exception -> L54
                com.indeed.android.myjobs.data.model.BrandedAdsApiRequestParams r5 = new com.indeed.android.myjobs.data.model.BrandedAdsApiRequestParams     // Catch: java.lang.Exception -> L54
                java.lang.String r6 = "mobapptrackerappliedbottom"
                java.lang.String r7 = "native"
                r5.<init>(r6, r7)     // Catch: java.lang.Exception -> L54
                r0.<init>(r5)     // Catch: java.lang.Exception -> L54
                r8.label = r3     // Catch: java.lang.Exception -> L54
                r9.getClass()     // Catch: java.lang.Exception -> L54
                b06 r3 = new b06     // Catch: java.lang.Exception -> L54
                r3.<init>(r9, r0, r1)     // Catch: java.lang.Exception -> L54
                kjd r9 = new kjd     // Catch: java.lang.Exception -> L54
                r9.<init>(r3)     // Catch: java.lang.Exception -> L54
                if (r9 != r4) goto L42
                goto L53
            L42:
                vi5 r9 = (defpackage.vi5) r9     // Catch: java.lang.Exception -> L54
                fr0$d$a r0 = new fr0$d$a     // Catch: java.lang.Exception -> L54
                fr0 r3 = defpackage.fr0.this     // Catch: java.lang.Exception -> L54
                r0.<init>(r3, r1)     // Catch: java.lang.Exception -> L54
                r8.label = r2     // Catch: java.lang.Exception -> L54
                java.lang.Object r8 = defpackage.wg2.q(r9, r0, r8)     // Catch: java.lang.Exception -> L54
                if (r8 != r4) goto L5f
            L53:
                return r4
            L54:
                r8 = move-exception
                java.util.ArrayList r9 = defpackage.lz2.a
                java.lang.String r9 = "AppliedTabViewModel"
                java.lang.String r0 = "Exception in branded ads data handling"
                r1 = 0
                defpackage.lz2.b(r9, r0, r1, r8)
            L5f:
                j6g r8 = defpackage.j6g.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: fr0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabViewModel$loadData$1", f = "AppliedTabViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ boolean $isActiveTab;
        private /* synthetic */ Object L$0;
        int label;

        @uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabViewModel$loadData$1$1", f = "AppliedTabViewModel.kt", l = {347, 354}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ boolean $isActiveTab;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ fr0 this$0;

            /* JADX INFO: renamed from: fr0$e$a$a, reason: collision with other inner class name */
            @uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabViewModel$loadData$1$1$1", f = "AppliedTabViewModel.kt", l = {}, m = "invokeSuspend")
            public static final class C0241a extends c1f implements Function2<hf3<ApiResponse>, lu2<? super j6g>, Object> {
                final /* synthetic */ e13 $$this$launch;
                final /* synthetic */ boolean $isActiveTab;
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ fr0 this$0;

                /* JADX INFO: renamed from: fr0$e$a$a$a, reason: collision with other inner class name */
                @uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabViewModel$loadData$1$1$1$2", f = "AppliedTabViewModel.kt", l = {360}, m = "invokeSuspend")
                public static final class C0242a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
                    final /* synthetic */ hf3<ApiResponse> $it;
                    int label;
                    final /* synthetic */ fr0 this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0242a(hf3<ApiResponse> hf3Var, fr0 fr0Var, lu2<? super C0242a> lu2Var) {
                        super(2, lu2Var);
                        this.$it = hf3Var;
                        this.this$0 = fr0Var;
                    }

                    @Override // defpackage.x81
                    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                        return new C0242a(this.$it, this.this$0, lu2Var);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                        return ((C0242a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.x81
                    public final Object invokeSuspend(Object obj) {
                        List<AppStatusJob> appStatusJobs;
                        int i = this.label;
                        if (i == 0) {
                            r7d.b(obj);
                            Body body = ((ApiResponse) ((hf3.c) this.$it).a).getBody();
                            if (body != null && (appStatusJobs = body.getAppStatusJobs()) != null && (!appStatusJobs.isEmpty()) && (i6a.b().a >= 1 || i6a.a().a > 0)) {
                                g85 g85Var = this.this$0.g0;
                                j6g j6gVar = j6g.a;
                                this.label = 1;
                                Object objA = g85Var.a(this);
                                g13 g13Var = g13.a;
                                if (objA == g13Var) {
                                    return g13Var;
                                }
                            }
                        } else {
                            if (i != 1) {
                                r6.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r7d.b(obj);
                        }
                        return j6g.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0241a(fr0 fr0Var, e13 e13Var, boolean z, lu2<? super C0241a> lu2Var) {
                    super(2, lu2Var);
                    this.this$0 = fr0Var;
                    this.$$this$launch = e13Var;
                    this.$isActiveTab = z;
                }

                @Override // defpackage.x81
                public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                    C0241a c0241a = new C0241a(this.this$0, this.$$this$launch, this.$isActiveTab, lu2Var);
                    c0241a.L$0 = obj;
                    return c0241a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(hf3<ApiResponse> hf3Var, lu2<? super j6g> lu2Var) {
                    return ((C0241a) create(hf3Var, lu2Var)).invokeSuspend(j6g.a);
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    hf3 hf3Var = (hf3) this.L$0;
                    if (this.label != 0) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                    if (hf3Var instanceof hf3.c) {
                        fr0 fr0Var = this.this$0;
                        fr0Var.getClass();
                        fr0Var.i();
                        old oldVarA = old.a(fr0Var.i(), null, null, false, 0, null, null, false, null, false, null, false, null, null, false, false, 0, 261759);
                        gse gseVar = fr0Var.b;
                        gseVar.getClass();
                        gseVar.m(null, oldVarA);
                        u63.Y(this.$$this$launch, null, null, new C0242a(hf3Var, this.this$0, null), 3);
                        if (this.$isActiveTab) {
                            fr0 fr0Var2 = this.this$0;
                            fr0Var2.b0.a("Applied", ee3.p(fr0Var2), this.this$0.i().a, this.this$0.i().g);
                        }
                    } else if (hf3Var instanceof hf3.b) {
                        fr0 fr0Var3 = this.this$0;
                        fr0Var3.getClass();
                        fr0Var3.i();
                        old oldVarA2 = old.a(fr0Var3.i(), null, null, false, 0, null, null, true, null, false, null, false, null, null, false, false, 0, 261759);
                        gse gseVar2 = fr0Var3.b;
                        gseVar2.getClass();
                        gseVar2.m(null, oldVarA2);
                    } else if (hf3Var instanceof hf3.a) {
                        fr0 fr0Var4 = this.this$0;
                        fr0Var4.getClass();
                        fr0Var4.i();
                        old oldVarA3 = old.a(fr0Var4.i(), null, null, false, 0, null, null, false, ((hf3.a) hf3Var).a, false, null, false, null, null, false, false, 0, 261759);
                        gse gseVar3 = fr0Var4.b;
                        gseVar3.getClass();
                        gseVar3.m(null, oldVarA3);
                    }
                    return j6g.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(fr0 fr0Var, boolean z, lu2<? super a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = fr0Var;
                this.$isActiveTab = z;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                a aVar = new a(this.this$0, this.$isActiveTab, lu2Var);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
            
                if (defpackage.wg2.q((defpackage.vi5) r2, r4, r21) == r6) goto L23;
             */
            @Override // defpackage.x81
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r22) {
                /*
                    r21 = this;
                    r1 = r21
                    java.lang.Object r0 = r1.L$0
                    e13 r0 = (defpackage.e13) r0
                    int r2 = r1.label
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    g13 r6 = defpackage.g13.a
                    if (r2 == 0) goto L26
                    if (r2 == r4) goto L20
                    if (r2 != r3) goto L1a
                    defpackage.r7d.b(r22)     // Catch: java.lang.Exception -> L18
                    goto Lb3
                L18:
                    r0 = move-exception
                    goto L73
                L1a:
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r0)
                    return r5
                L20:
                    defpackage.r7d.b(r22)     // Catch: java.lang.Exception -> L18
                    r2 = r22
                    goto L5d
                L26:
                    defpackage.r7d.b(r22)
                    fr0 r2 = r1.this$0     // Catch: java.lang.Exception -> L18
                    fp0 r2 = r2.f     // Catch: java.lang.Exception -> L18
                    fp0$a r7 = new fp0$a     // Catch: java.lang.Exception -> L18
                    long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L18
                    r10 = 15552000000(0x39ef8b000, double:7.683708924E-314)
                    long r8 = r8 - r10
                    rqc r10 = defpackage.v0b.b     // Catch: java.lang.Exception -> L18
                    fse<T> r10 = r10.a     // Catch: java.lang.Exception -> L18
                    java.lang.Object r10 = r10.getValue()     // Catch: java.lang.Exception -> L18
                    java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L18
                    if (r10 != 0) goto L47
                    java.lang.String r10 = defpackage.ie7.Z     // Catch: java.lang.Exception -> L18
                L47:
                    r7.<init>(r8, r10)     // Catch: java.lang.Exception -> L18
                    r1.L$0 = r0     // Catch: java.lang.Exception -> L18
                    r1.label = r4     // Catch: java.lang.Exception -> L18
                    r2.getClass()     // Catch: java.lang.Exception -> L18
                    gp0 r4 = new gp0     // Catch: java.lang.Exception -> L18
                    r4.<init>(r2, r7, r5)     // Catch: java.lang.Exception -> L18
                    a22 r2 = defpackage.wg2.n(r4)     // Catch: java.lang.Exception -> L18
                    if (r2 != r6) goto L5d
                    goto L72
                L5d:
                    vi5 r2 = (defpackage.vi5) r2     // Catch: java.lang.Exception -> L18
                    fr0$e$a$a r4 = new fr0$e$a$a     // Catch: java.lang.Exception -> L18
                    fr0 r7 = r1.this$0     // Catch: java.lang.Exception -> L18
                    boolean r8 = r1.$isActiveTab     // Catch: java.lang.Exception -> L18
                    r4.<init>(r7, r0, r8, r5)     // Catch: java.lang.Exception -> L18
                    r1.L$0 = r5     // Catch: java.lang.Exception -> L18
                    r1.label = r3     // Catch: java.lang.Exception -> L18
                    java.lang.Object r0 = defpackage.wg2.q(r2, r4, r1)     // Catch: java.lang.Exception -> L18
                    if (r0 != r6) goto Lb3
                L72:
                    return r6
                L73:
                    fr0 r1 = r1.this$0
                    xo6 r2 = r1.i()
                    old r2 = (defpackage.old) r2
                    xo6 r2 = r1.i()
                    r3 = r2
                    old r3 = (defpackage.old) r3
                    com.indeed.android.myjobs.data.model.APIError r11 = new com.indeed.android.myjobs.data.model.APIError
                    r2 = -1
                    java.lang.String r4 = "Something went wrong"
                    r11.<init>(r2, r4)
                    r19 = 0
                    r20 = 261759(0x3fe7f, float:3.66802E-40)
                    r4 = 0
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    r10 = 0
                    r12 = 0
                    r13 = 0
                    r14 = 0
                    r15 = 0
                    r16 = 0
                    r17 = 0
                    r18 = 0
                    old r2 = defpackage.old.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                    gse r1 = r1.b
                    r1.setValue(r2)
                    java.util.ArrayList r1 = defpackage.lz2.a
                    java.lang.String r1 = "Exception in Data handling"
                    r2 = 0
                    java.lang.String r3 = "AppliedTabViewModel"
                    defpackage.lz2.b(r3, r1, r2, r0)
                Lb3:
                    j6g r0 = defpackage.j6g.a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: fr0.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z, lu2<? super e> lu2Var) {
            super(2, lu2Var);
            this.$isActiveTab = z;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            e eVar = fr0.this.new e(this.$isActiveTab, lu2Var);
            eVar.L$0 = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            e13 e13Var = (e13) this.L$0;
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            u63.Y(e13Var, null, null, new a(fr0.this, this.$isActiveTab, null), 3);
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabViewModel$loadData$2", f = "AppliedTabViewModel.kt", l = {397, DataOkHttpUploader.HTTP_UNAUTHORIZED}, m = "invokeSuspend")
    public static final class f extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        @uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabViewModel$loadData$2$1", f = "AppliedTabViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<hf3<List<? extends w56.b>>, lu2<? super j6g>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ fr0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(fr0 fr0Var, lu2<? super a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = fr0Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                a aVar = new a(this.this$0, lu2Var);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(hf3<List<? extends w56.b>> hf3Var, lu2<? super j6g> lu2Var) {
                return ((a) create(hf3Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                hf3 hf3Var = (hf3) this.L$0;
                if (this.label != 0) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                int i = 0;
                if (hf3Var instanceof hf3.c) {
                    fr0 fr0Var = this.this$0;
                    fr0Var.k(new lr0(i, fr0Var, hf3Var));
                } else if (hf3Var instanceof hf3.a) {
                    ArrayList arrayList = lz2.a;
                    APIError aPIError = ((hf3.a) hf3Var).a;
                    lz2.b("AppliedTabViewModel", "Error from getTopChoicesUseCase", false, new Exception(aPIError != null ? aPIError.getMessage() : null));
                }
                return j6g.a;
            }
        }

        public f(lu2<? super f> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return fr0.this.new f(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((f) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        
            if (defpackage.wg2.q((defpackage.vi5) r10, r0, r9) == r4) goto L18;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                int r0 = r9.label
                r1 = 0
                r2 = 2
                r3 = 1
                g13 r4 = defpackage.g13.a
                if (r0 == 0) goto L1b
                if (r0 == r3) goto L17
                if (r0 != r2) goto L11
                defpackage.r7d.b(r10)     // Catch: java.lang.Exception -> L55
                goto L60
            L11:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r9)
                return r1
            L17:
                defpackage.r7d.b(r10)     // Catch: java.lang.Exception -> L55
                goto L43
            L1b:
                defpackage.r7d.b(r10)
                fr0 r10 = defpackage.fr0.this     // Catch: java.lang.Exception -> L55
                w56 r10 = r10.a0     // Catch: java.lang.Exception -> L55
                w56$a r0 = new w56$a     // Catch: java.lang.Exception -> L55
                long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L55
                r7 = 15552000000(0x39ef8b000, double:7.683708924E-314)
                long r5 = r5 - r7
                r0.<init>(r5)     // Catch: java.lang.Exception -> L55
                r9.label = r3     // Catch: java.lang.Exception -> L55
                r10.getClass()     // Catch: java.lang.Exception -> L55
                x56 r3 = new x56     // Catch: java.lang.Exception -> L55
                r3.<init>(r10, r0, r1)     // Catch: java.lang.Exception -> L55
                kjd r10 = new kjd     // Catch: java.lang.Exception -> L55
                r10.<init>(r3)     // Catch: java.lang.Exception -> L55
                if (r10 != r4) goto L43
                goto L54
            L43:
                vi5 r10 = (defpackage.vi5) r10     // Catch: java.lang.Exception -> L55
                fr0$f$a r0 = new fr0$f$a     // Catch: java.lang.Exception -> L55
                fr0 r3 = defpackage.fr0.this     // Catch: java.lang.Exception -> L55
                r0.<init>(r3, r1)     // Catch: java.lang.Exception -> L55
                r9.label = r2     // Catch: java.lang.Exception -> L55
                java.lang.Object r9 = defpackage.wg2.q(r10, r0, r9)     // Catch: java.lang.Exception -> L55
                if (r9 != r4) goto L60
            L54:
                return r4
            L55:
                r9 = move-exception
                java.util.ArrayList r10 = defpackage.lz2.a
                java.lang.String r10 = "Exception in top choice data handling"
                r0 = 0
                java.lang.String r1 = "AppliedTabViewModel"
                defpackage.lz2.b(r1, r10, r0, r9)
            L60:
                j6g r9 = defpackage.j6g.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: fr0.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabViewModel$logBrandedAdEvent$1", f = "AppliedTabViewModel.kt", l = {530, 530}, m = "invokeSuspend")
    public static final class g extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ BrandedAdsDto $brandedAdsDto;
        final /* synthetic */ String $event;
        Object L$0;
        int label;
        final /* synthetic */ fr0 this$0;

        @uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabViewModel$logBrandedAdEvent$1$1", f = "AppliedTabViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<hf3<j6g>, lu2<? super j6g>, Object> {
            int label;

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new a(2, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(hf3<j6g> hf3Var, lu2<? super j6g> lu2Var) {
                return ((a) create(hf3Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    r7d.b(obj);
                    return j6g.a;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(BrandedAdsDto brandedAdsDto, String str, fr0 fr0Var, lu2<? super g> lu2Var) {
            super(2, lu2Var);
            this.$brandedAdsDto = brandedAdsDto;
            this.$event = str;
            this.this$0 = fr0Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new g(this.$brandedAdsDto, this.$event, this.this$0, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((g) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
        
            if (defpackage.wg2.q((defpackage.vi5) r7, r0, r6) == r4) goto L23;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                int r0 = r6.label
                r1 = 1
                r2 = 0
                r3 = 2
                g13 r4 = defpackage.g13.a
                if (r0 == 0) goto L25
                if (r0 == r1) goto L1d
                if (r0 != r3) goto L17
                java.lang.Object r0 = r6.L$0
                com.indeed.android.myjobs.data.model.BrandedAdsLoggingRequestParams r0 = (com.indeed.android.myjobs.data.model.BrandedAdsLoggingRequestParams) r0
                defpackage.r7d.b(r7)     // Catch: java.lang.Exception -> L15
                goto L78
            L15:
                r7 = move-exception
                goto L60
            L17:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r6)
                return r2
            L1d:
                java.lang.Object r0 = r6.L$0
                com.indeed.android.myjobs.data.model.BrandedAdsLoggingRequestParams r0 = (com.indeed.android.myjobs.data.model.BrandedAdsLoggingRequestParams) r0
                defpackage.r7d.b(r7)     // Catch: java.lang.Exception -> L15
                goto L4e
            L25:
                defpackage.r7d.b(r7)
                com.indeed.android.myjobs.data.model.dto.BrandedAdsDto r7 = r6.$brandedAdsDto     // Catch: java.lang.Exception -> L15
                java.lang.String r0 = r6.$event     // Catch: java.lang.Exception -> L15
                com.indeed.android.myjobs.data.model.BrandedAdsLoggingRequestParams r7 = defpackage.u63.p0(r7, r0)     // Catch: java.lang.Exception -> L15
                fr0 r0 = r6.this$0     // Catch: java.lang.Exception -> L15
                x29 r0 = r0.d0     // Catch: java.lang.Exception -> L15
                x29$a r5 = new x29$a     // Catch: java.lang.Exception -> L15
                r5.<init>(r7)     // Catch: java.lang.Exception -> L15
                r6.L$0 = r2     // Catch: java.lang.Exception -> L15
                r6.label = r1     // Catch: java.lang.Exception -> L15
                r0.getClass()     // Catch: java.lang.Exception -> L15
                y29 r7 = new y29     // Catch: java.lang.Exception -> L15
                r7.<init>(r0, r5, r2)     // Catch: java.lang.Exception -> L15
                kjd r0 = new kjd     // Catch: java.lang.Exception -> L15
                r0.<init>(r7)     // Catch: java.lang.Exception -> L15
                if (r0 != r4) goto L4d
                goto L5f
            L4d:
                r7 = r0
            L4e:
                vi5 r7 = (defpackage.vi5) r7     // Catch: java.lang.Exception -> L15
                fr0$g$a r0 = new fr0$g$a     // Catch: java.lang.Exception -> L15
                r0.<init>(r3, r2)     // Catch: java.lang.Exception -> L15
                r6.L$0 = r2     // Catch: java.lang.Exception -> L15
                r6.label = r3     // Catch: java.lang.Exception -> L15
                java.lang.Object r6 = defpackage.wg2.q(r7, r0, r6)     // Catch: java.lang.Exception -> L15
                if (r6 != r4) goto L78
            L5f:
                return r4
            L60:
                java.util.ArrayList r0 = defpackage.lz2.a
                java.lang.String r6 = r6.$event
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Exception in logging branded ad event: "
                r0.<init>(r1)
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                r0 = 0
                java.lang.String r1 = "AppliedTabViewModel"
                defpackage.lz2.b(r1, r6, r0, r7)
            L78:
                j6g r6 = defpackage.j6g.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: fr0.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabViewModel$onTriggerEvent$1", f = "AppliedTabViewModel.kt", l = {119, 119, 125, 125, 135, 135, 141, 141, 167, 221, 226, 231}, m = "invokeSuspend")
    public static final class h extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ b $event;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ fr0 this$0;

        @uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabViewModel$onTriggerEvent$1$15", f = "AppliedTabViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<j6g, lu2<? super j6g>, Object> {
            int label;

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new a(2, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(j6g j6gVar, lu2<? super j6g> lu2Var) {
                return ((a) create(j6gVar, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    r7d.b(obj);
                    return j6g.a;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        @uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabViewModel$onTriggerEvent$1$16", f = "AppliedTabViewModel.kt", l = {238, 238}, m = "invokeSuspend")
        public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ huc $isNewStatusFound;
            int label;
            final /* synthetic */ fr0 this$0;

            @uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabViewModel$onTriggerEvent$1$16$1", f = "AppliedTabViewModel.kt", l = {}, m = "invokeSuspend")
            public static final class a extends c1f implements Function2<Map<String, ? extends String>, lu2<? super j6g>, Object> {
                final /* synthetic */ huc $isNewStatusFound;
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ fr0 this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(fr0 fr0Var, huc hucVar, lu2<? super a> lu2Var) {
                    super(2, lu2Var);
                    this.this$0 = fr0Var;
                    this.$isNewStatusFound = hucVar;
                }

                @Override // defpackage.x81
                public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                    a aVar = new a(this.this$0, this.$isNewStatusFound, lu2Var);
                    aVar.L$0 = obj;
                    return aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Map<String, ? extends String> map, lu2<? super j6g> lu2Var) {
                    return ((a) create(map, lu2Var)).invokeSuspend(j6g.a);
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    ArrayList arrayList;
                    SavedJobsDto savedJobsDtoCopy;
                    Map<String, String> map = (Map) this.L$0;
                    if (this.label != 0) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                    fr0 fr0Var = this.this$0;
                    fr0Var.k0 = map;
                    List<SavedJobsDto> list = fr0Var.i().a;
                    if (list != null) {
                        List<SavedJobsDto> list2 = list;
                        fr0 fr0Var2 = this.this$0;
                        huc hucVar = this.$isNewStatusFound;
                        ArrayList arrayList2 = new ArrayList(t92.r0(list2, 10));
                        for (SavedJobsDto savedJobsDto : list2) {
                            i74 i74VarE = u63.E(savedJobsDto);
                            UserJobStatus candidateStatus = savedJobsDto.getCandidateStatus();
                            String status = candidateStatus != null ? candidateStatus.getStatus() : null;
                            Map<String, String> map2 = fr0Var2.k0;
                            Set<String> set = fr0Var2.m0;
                            String str = map2.get(savedJobsDto.getJobkey());
                            if (!(wl7.b(i74VarE.c, "CANDIDATE") && !fr0Var2.k0.containsKey(savedJobsDto.getJobkey()) && z92.I0(set, status)) && (wl7.b(status, str) || !z92.I0(set, status))) {
                                savedJobsDtoCopy = savedJobsDto.copy(((-4097) & 1) != 0 ? savedJobsDto.title : null, ((-4097) & 2) != 0 ? savedJobsDto.description : null, ((-4097) & 4) != 0 ? savedJobsDto.location : null, ((-4097) & 8) != 0 ? savedJobsDto.timeStamp : 0L, ((-4097) & 16) != 0 ? savedJobsDto.applyTime : 0L, ((-4097) & 32) != 0 ? savedJobsDto.jobkey : null, ((-4097) & 64) != 0 ? savedJobsDto.jobUrl : null, ((-4097) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? savedJobsDto.hasIaAppId : false, ((-4097) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? savedJobsDto.encryptedIaAppId : null, ((-4097) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? savedJobsDto.indeedApplyable : false, ((-4097) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? savedJobsDto.hasApplicationPreview : false, ((-4097) & 2048) != 0 ? savedJobsDto.hasInterviewNowAccess : false, ((-4097) & 4096) != 0 ? savedJobsDto.isJobUnSave : false, ((-4097) & 8192) != 0 ? savedJobsDto.selfReportedStatus : null, ((-4097) & 16384) != 0 ? savedJobsDto.candidateStatus : null, ((-4097) & 32768) != 0 ? savedJobsDto.userJobStatus : null, ((-4097) & 65536) != 0 ? savedJobsDto.isJobReported : false, ((-4097) & 131072) != 0 ? savedJobsDto.isJobExpired : false, ((-4097) & 262144) != 0 ? savedJobsDto.employerResponseTime : null, ((-4097) & 524288) != 0 ? savedJobsDto.applicationCount : null, ((-4097) & 1048576) != 0 ? savedJobsDto.withdrawn : false, ((-4097) & 2097152) != 0 ? savedJobsDto.jobFraudulent : false, ((-4097) & 4194304) != 0 ? savedJobsDto.encryptedAdvCandId : null, ((-4097) & 8388608) != 0 ? savedJobsDto.appTk : null, ((-4097) & 16777216) != 0 ? savedJobsDto.isApplyUpdateStatusInProgress : false, ((-4097) & 33554432) != 0 ? savedJobsDto.hasApplicationDraft : false, ((-4097) & 67108864) != 0 ? savedJobsDto.event5722DTO : null, ((-4097) & 134217728) != 0 ? savedJobsDto.isJobMaybeApplied : false, ((-4097) & 268435456) != 0 ? savedJobsDto.shouldShowCloseBubble : false, ((-4097) & 536870912) != 0 ? savedJobsDto.employerStartedReview : false, ((-4097) & 1073741824) != 0 ? savedJobsDto.employerReplyLikelihood : null, ((-4097) & Integer.MIN_VALUE) != 0 ? savedJobsDto.replyLikelihoodAdjusted : null, (255 & 1) != 0 ? savedJobsDto.shouldShowRedDot : false, (255 & 2) != 0 ? savedJobsDto.sortingTimeStamp : null, (255 & 4) != 0 ? savedJobsDto.partnerName : null, (255 & 8) != 0 ? savedJobsDto.isEmployerOftenReviewedEnabled : null, (255 & 16) != 0 ? savedJobsDto.percentageOfEmpViewed : null, (255 & 32) != 0 ? savedJobsDto.aiRecruiterWorkflowResumeUrl : null, (255 & 64) != 0 ? savedJobsDto.aiRecruiterWorkflowStartTimestampMs : null, (255 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? savedJobsDto.aiRecruiterWorkflowExpiresAtMs : null);
                            } else {
                                hucVar.element = true;
                                savedJobsDtoCopy = savedJobsDto.copy(((-4097) & 1) != 0 ? savedJobsDto.title : null, ((-4097) & 2) != 0 ? savedJobsDto.description : null, ((-4097) & 4) != 0 ? savedJobsDto.location : null, ((-4097) & 8) != 0 ? savedJobsDto.timeStamp : 0L, ((-4097) & 16) != 0 ? savedJobsDto.applyTime : 0L, ((-4097) & 32) != 0 ? savedJobsDto.jobkey : null, ((-4097) & 64) != 0 ? savedJobsDto.jobUrl : null, ((-4097) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? savedJobsDto.hasIaAppId : false, ((-4097) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? savedJobsDto.encryptedIaAppId : null, ((-4097) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? savedJobsDto.indeedApplyable : false, ((-4097) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? savedJobsDto.hasApplicationPreview : false, ((-4097) & 2048) != 0 ? savedJobsDto.hasInterviewNowAccess : false, ((-4097) & 4096) != 0 ? savedJobsDto.isJobUnSave : false, ((-4097) & 8192) != 0 ? savedJobsDto.selfReportedStatus : null, ((-4097) & 16384) != 0 ? savedJobsDto.candidateStatus : null, ((-4097) & 32768) != 0 ? savedJobsDto.userJobStatus : null, ((-4097) & 65536) != 0 ? savedJobsDto.isJobReported : false, ((-4097) & 131072) != 0 ? savedJobsDto.isJobExpired : false, ((-4097) & 262144) != 0 ? savedJobsDto.employerResponseTime : null, ((-4097) & 524288) != 0 ? savedJobsDto.applicationCount : null, ((-4097) & 1048576) != 0 ? savedJobsDto.withdrawn : false, ((-4097) & 2097152) != 0 ? savedJobsDto.jobFraudulent : false, ((-4097) & 4194304) != 0 ? savedJobsDto.encryptedAdvCandId : null, ((-4097) & 8388608) != 0 ? savedJobsDto.appTk : null, ((-4097) & 16777216) != 0 ? savedJobsDto.isApplyUpdateStatusInProgress : false, ((-4097) & 33554432) != 0 ? savedJobsDto.hasApplicationDraft : false, ((-4097) & 67108864) != 0 ? savedJobsDto.event5722DTO : null, ((-4097) & 134217728) != 0 ? savedJobsDto.isJobMaybeApplied : false, ((-4097) & 268435456) != 0 ? savedJobsDto.shouldShowCloseBubble : false, ((-4097) & 536870912) != 0 ? savedJobsDto.employerStartedReview : false, ((-4097) & 1073741824) != 0 ? savedJobsDto.employerReplyLikelihood : null, ((-4097) & Integer.MIN_VALUE) != 0 ? savedJobsDto.replyLikelihoodAdjusted : null, (255 & 1) != 0 ? savedJobsDto.shouldShowRedDot : true, (255 & 2) != 0 ? savedJobsDto.sortingTimeStamp : null, (255 & 4) != 0 ? savedJobsDto.partnerName : null, (255 & 8) != 0 ? savedJobsDto.isEmployerOftenReviewedEnabled : null, (255 & 16) != 0 ? savedJobsDto.percentageOfEmpViewed : null, (255 & 32) != 0 ? savedJobsDto.aiRecruiterWorkflowResumeUrl : null, (255 & 64) != 0 ? savedJobsDto.aiRecruiterWorkflowStartTimestampMs : null, (255 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? savedJobsDto.aiRecruiterWorkflowExpiresAtMs : null);
                            }
                            arrayList2.add(savedJobsDtoCopy);
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    fr0 fr0Var3 = this.this$0;
                    huc hucVar2 = this.$isNewStatusFound;
                    fr0Var3.i();
                    fr0Var3.b.setValue(old.a(fr0Var3.i(), null, null, false, 0, null, null, false, null, hucVar2.element, null, false, null, null, false, false, 0, 261119));
                    fr0 fr0Var4 = this.this$0;
                    fr0Var4.i();
                    fr0Var4.b.setValue(old.a(fr0Var4.i(), arrayList, null, false, 0, null, null, false, null, false, null, false, null, null, false, false, 0, 262142));
                    return j6g.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(fr0 fr0Var, huc hucVar, lu2<? super b> lu2Var) {
                super(2, lu2Var);
                this.this$0 = fr0Var;
                this.$isNewStatusFound = hucVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new b(this.this$0, this.$isNewStatusFound, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
            
                if (defpackage.wg2.q((defpackage.vi5) r7, r0, r6) == r4) goto L15;
             */
            @Override // defpackage.x81
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    int r0 = r6.label
                    r1 = 0
                    r2 = 2
                    r3 = 1
                    g13 r4 = defpackage.g13.a
                    if (r0 == 0) goto L1b
                    if (r0 == r3) goto L17
                    if (r0 != r2) goto L11
                    defpackage.r7d.b(r7)
                    goto L4a
                L11:
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r6)
                    return r1
                L17:
                    defpackage.r7d.b(r7)
                    goto L36
                L1b:
                    defpackage.r7d.b(r7)
                    fr0 r7 = r6.this$0
                    g06 r7 = r7.f0
                    j6g r0 = defpackage.j6g.a
                    r6.label = r3
                    r7.getClass()
                    f06 r0 = new f06
                    r0.<init>(r7, r1)
                    kjd r7 = new kjd
                    r7.<init>(r0)
                    if (r7 != r4) goto L36
                    goto L49
                L36:
                    vi5 r7 = (defpackage.vi5) r7
                    fr0$h$b$a r0 = new fr0$h$b$a
                    fr0 r3 = r6.this$0
                    huc r5 = r6.$isNewStatusFound
                    r0.<init>(r3, r5, r1)
                    r6.label = r2
                    java.lang.Object r6 = defpackage.wg2.q(r7, r0, r6)
                    if (r6 != r4) goto L4a
                L49:
                    return r4
                L4a:
                    j6g r6 = defpackage.j6g.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: fr0.h.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabViewModel$onTriggerEvent$1$2", f = "AppliedTabViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class c extends c1f implements Function2<j6g, lu2<? super j6g>, Object> {
            int label;

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new c(2, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(j6g j6gVar, lu2<? super j6g> lu2Var) {
                return ((c) create(j6gVar, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                Function1<lx5, j6g> function1 = c05.a;
                c05.f("didNotApply", "nonIagrp3");
                return j6g.a;
            }
        }

        @uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabViewModel$onTriggerEvent$1$3", f = "AppliedTabViewModel.kt", l = {127, 127}, m = "invokeSuspend")
        public static final class d extends c1f implements Function2<j6g, lu2<? super j6g>, Object> {
            Object L$0;
            int label;
            final /* synthetic */ fr0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(fr0 fr0Var, lu2<? super d> lu2Var) {
                super(2, lu2Var);
                this.this$0 = fr0Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new d(this.this$0, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(j6g j6gVar, lu2<? super j6g> lu2Var) {
                return ((d) create(j6gVar, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
            
                if (defpackage.xb1.g((defpackage.vi5) r11, r5, r10) == r4) goto L16;
             */
            @Override // defpackage.x81
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    int r0 = r10.label
                    r1 = 0
                    r2 = 2
                    r3 = 1
                    g13 r4 = defpackage.g13.a
                    if (r0 == 0) goto L1f
                    if (r0 == r3) goto L17
                    if (r0 != r2) goto L11
                    defpackage.r7d.b(r11)
                    goto L73
                L11:
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r10)
                    return r1
                L17:
                    java.lang.Object r0 = r10.L$0
                    fr0 r0 = (defpackage.fr0) r0
                    defpackage.r7d.b(r11)
                    goto L5c
                L1f:
                    defpackage.r7d.b(r11)
                    kotlin.jvm.functions.Function1<lx5, j6g> r11 = defpackage.c05.a
                    java.lang.String r11 = "crossIcon"
                    java.lang.String r0 = "nonIagrp3"
                    defpackage.c05.f(r11, r0)
                    fr0 r0 = r10.this$0
                    vz5 r11 = r0.V
                    r10.L$0 = r0
                    r10.label = r3
                    r11.getClass()
                    f88 r5 = r11.a
                    rqc r6 = r5.b()
                    rqc r7 = r5.z()
                    rqc r5 = r5.n()
                    uz5 r8 = new uz5
                    r8.<init>(r11, r1)
                    r11 = 3
                    vi5[] r11 = new defpackage.vi5[r11]
                    r9 = 0
                    r11[r9] = r6
                    r11[r3] = r7
                    r11[r2] = r5
                    rk5 r3 = new rk5
                    r3.<init>(r11, r8)
                    if (r3 != r4) goto L5b
                    goto L72
                L5b:
                    r11 = r3
                L5c:
                    vi5 r11 = (defpackage.vi5) r11
                    fr0 r3 = r10.this$0
                    or r5 = new or
                    r5.<init>(r3, r2)
                    r10.L$0 = r1
                    r10.label = r2
                    r0.getClass()
                    java.lang.Object r10 = defpackage.xb1.g(r11, r5, r10)
                    if (r10 != r4) goto L73
                L72:
                    return r4
                L73:
                    j6g r10 = defpackage.j6g.a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: fr0.h.d.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabViewModel$onTriggerEvent$1$4", f = "AppliedTabViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class e extends c1f implements Function2<j6g, lu2<? super j6g>, Object> {
            int label;

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new e(2, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(j6g j6gVar, lu2<? super j6g> lu2Var) {
                return ((e) create(j6gVar, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    r7d.b(obj);
                    return j6g.a;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        @uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabViewModel$onTriggerEvent$1$5", f = "AppliedTabViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class f extends c1f implements Function2<j6g, lu2<? super j6g>, Object> {
            int label;

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new f(2, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(j6g j6gVar, lu2<? super j6g> lu2Var) {
                return ((f) create(j6gVar, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    r7d.b(obj);
                    return j6g.a;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(b bVar, fr0 fr0Var, lu2<? super h> lu2Var) {
            super(2, lu2Var);
            this.$event = bVar;
            this.this$0 = fr0Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new h(this.$event, this.this$0, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((h) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:116:0x04d5, code lost:
        
            if (defpackage.wg2.q((defpackage.vi5) r2, r1, r55) != r9) goto L128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:121:0x04f1, code lost:
        
            if (r2.a(r3, r55) == r9) goto L122;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0181, code lost:
        
            if (defpackage.wg2.q((defpackage.vi5) r2, r1, r55) != r9) goto L128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x01b9, code lost:
        
            if (defpackage.wg2.q((defpackage.vi5) r2, r1, r55) != r9) goto L128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x01fb, code lost:
        
            if (defpackage.wg2.q((defpackage.vi5) r1, r2, r55) != r9) goto L128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x023d, code lost:
        
            if (defpackage.wg2.q((defpackage.vi5) r1, r2, r55) != r9) goto L128;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r56) {
            /*
                Method dump skipped, instruction units count: 1350
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: fr0.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public fr0(fp0 fp0Var, vz5 vz5Var, bkd bkdVar, tjd tjdVar, g26 g26Var, s0a s0aVar, w56 w56Var, c39 c39Var, a06 a06Var, x29 x29Var, vjd vjdVar, g06 g06Var, g85 g85Var, h39 h39Var) {
        this.f = fp0Var;
        this.V = vz5Var;
        this.W = bkdVar;
        this.X = tjdVar;
        this.Y = g26Var;
        this.Z = s0aVar;
        this.a0 = w56Var;
        this.b0 = c39Var;
        this.c0 = a06Var;
        this.d0 = x29Var;
        this.e0 = vjdVar;
        this.f0 = g06Var;
        this.g0 = g85Var;
        this.h0 = h39Var;
        u63.Y(ee3.p(this), null, null, new a(null), 3);
        nde ndeVarD = wg2.d(0, 0, null, 7);
        this.n0 = ndeVarD;
        this.o0 = wg2.i(ndeVarD);
    }

    @Override // defpackage.xb1
    public final xo6 h() {
        return new old(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bd, code lost:
    
        if (r1 == r7) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(defpackage.pu2 r27) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr0.l(pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(int r31, int r32, defpackage.pu2 r33) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr0.m(int, int, pu2):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
    
        if (r2 == r4) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(int r22, defpackage.pu2 r23) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr0.n(int, pu2):java.lang.Object");
    }

    public final void o() {
        if (i6a.k()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.l0;
            if (j < 2000) {
                ArrayList arrayList = lz2.a;
                Log.d("AppliedTabViewModel", u40.c(j, "Skip branded ad fetch, min interval not reached (elapsed: ", " ms)"), null);
            } else {
                this.l0 = jCurrentTimeMillis;
                u63.Y(ee3.p(this), null, null, new d(null), 3);
            }
        }
    }

    public final void p(boolean z) {
        boolean z2 = this.i0;
        this.i0 = true;
        this.j0 = -1;
        u63.Y(ee3.p(this), null, null, new e(z, null), 3);
        ra8 ra8Var = i6a.a;
        if (((kr7) cr8.p(kr7.class)).e("droid_native_myjobs_top_choice_features").a >= 1) {
            u63.Y(ee3.p(this), null, null, new f(null), 3);
        }
        if (z && z2) {
            this.b0.b("Applied", ee3.p(this));
        }
    }

    public final void q(BrandedAdsDto brandedAdsDto, String str) {
        brandedAdsDto.getClass();
        u63.Y(ee3.p(this), null, null, new g(brandedAdsDto, str, this, null), 3);
    }

    public final void r(b bVar) {
        bVar.getClass();
        u63.Y(ee3.p(this), null, null, new h(bVar, this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0051 -> B:21:0x0054). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(defpackage.pu2 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.mr0
            if (r0 == 0) goto L13
            r0 = r7
            mr0 r0 = (defpackage.mr0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            mr0 r0 = new mr0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            int r1 = r0.I$1
            int r3 = r0.I$0
            defpackage.r7d.b(r7)
            goto L54
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            r6 = 0
            return r6
        L30:
            defpackage.r7d.b(r7)
            r7 = 0
            r1 = 100
            r3 = r7
        L37:
            xo6 r7 = r6.i()
            old r7 = (defpackage.old) r7
            boolean r7 = r7.g
            if (r7 == 0) goto L56
            if (r3 >= r1) goto L56
            r0.I$0 = r3
            r0.I$1 = r1
            r0.label = r2
            r4 = 100
            java.lang.Object r7 = defpackage.ls3.b(r4, r0)
            g13 r4 = defpackage.g13.a
            if (r7 != r4) goto L54
            return r4
        L54:
            int r3 = r3 + r2
            goto L37
        L56:
            xo6 r6 = r6.i()
            old r6 = (defpackage.old) r6
            boolean r6 = r6.g
            r6 = r6 ^ r2
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr0.s(pu2):java.lang.Object");
    }

    public static abstract class b implements uo6 {

        /* JADX INFO: renamed from: fr0$b$b, reason: collision with other inner class name */
        public static final class C0240b extends b {
        }

        public static final class c extends b {
        }

        public static final class d extends b {
            public final s9 a;

            public d(s9 s9Var) {
                this.a = s9Var;
            }
        }

        public static final class e extends b {
            public final boolean a;

            public e(boolean z) {
                this.a = z;
            }
        }

        public static final class f extends b {
            public final String a;

            public f(String str) {
                str.getClass();
                this.a = str;
            }
        }

        public static final class g extends b {
            public static final g a = new g();
        }

        public static final class h extends b {
            public static final h a = new h();
        }

        public static final class i extends b {
            public final SavedJobsDto a;

            public i(SavedJobsDto savedJobsDto) {
                savedJobsDto.getClass();
                this.a = savedJobsDto;
            }
        }

        public static final class j extends b {
            public final String a;

            public j(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && wl7.b(this.a, ((j) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return l5.m("NavigateToAiRecruiter(url=", this.a, ")");
            }
        }

        public static final class k extends b {
            public final String a;

            public k(String str) {
                str.getClass();
                this.a = str;
            }
        }

        public static final class l extends b {
            public final String a;

            public l(String str) {
                str.getClass();
                this.a = str;
            }
        }

        public static final class m extends b {
            public final String a;

            public m(String str) {
                str.getClass();
                this.a = str;
            }
        }

        public static final class n extends b {
            public static final n a = new n();
        }

        public static final class o extends b {
            public final String a;
            public final boolean b;

            public o(String str, boolean z) {
                str.getClass();
                this.a = str;
                this.b = z;
            }
        }

        public static final class p extends b {
            public static final p a = new p();
        }

        public static final class a extends b {
            public final String a;

            public a(int i) {
                this.a = "myjobs-applied-tab";
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return l5.m("AdCardClick(source=", this.a, ")");
            }

            public a() {
                this(0);
            }
        }
    }
}

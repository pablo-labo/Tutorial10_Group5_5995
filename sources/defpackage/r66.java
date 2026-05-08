package defpackage;

import com.indeed.android.myjobs.data.model.ApiResponse;
import com.indeed.android.myjobs.data.model.AppStatusJob;
import com.indeed.android.myjobs.data.model.Body;
import com.indeed.android.myjobs.data.model.SelfReportedStatus;
import com.indeed.android.myjobs.data.model.UserJobStatus;
import com.indeed.android.myjobs.data.model.dto.DtoExtensionKt;
import com.indeed.android.myjobs.data.model.dto.JobTimestamp;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.hf3;
import defpackage.q66;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.domain.usecase.GetVisitedJobUseCase$invoke$2", f = "GetVisitedJobUseCase.kt", l = {31, 37}, m = "invokeSuspend")
public final class r66 extends c1f implements Function2<upb<? super List<? extends SavedJobsDto>>, lu2<? super j6g>, Object> {
    final /* synthetic */ q66.a $param;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ q66 this$0;

    @uh3(c = "com.indeed.android.myjobs.domain.usecase.GetVisitedJobUseCase$invoke$2$1", f = "GetVisitedJobUseCase.kt", l = {66}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<hf3<ApiResponse>, lu2<? super j6g>, Object> {
        final /* synthetic */ upb<List<SavedJobsDto>> $$this$channelFlow;
        final /* synthetic */ q66.a $param;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ q66 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(q66 q66Var, q66.a aVar, upb<? super List<SavedJobsDto>> upbVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.this$0 = q66Var;
            this.$param = aVar;
            this.$$this$channelFlow = upbVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.this$0, this.$param, this.$$this$channelFlow, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(hf3<ApiResponse> hf3Var, lu2<? super j6g> lu2Var) {
            return ((a) create(hf3Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r0v4, types: [zr4] */
        /* JADX WARN: Type inference failed for: r0v5 */
        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            ?? arrayList;
            List<AppStatusJob> appStatusJobs;
            hf3 hf3Var = (hf3) this.L$0;
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                if (hf3Var instanceof hf3.c) {
                    Body body = ((ApiResponse) ((hf3.c) hf3Var).a).getBody();
                    if (body == null || (appStatusJobs = body.getAppStatusJobs()) == null) {
                        arrayList = zr4.a;
                    } else {
                        arrayList = new ArrayList();
                        for (Object obj2 : appStatusJobs) {
                            SelfReportedStatus selfReportedStatus = ((AppStatusJob) obj2).getStatuses().getSelfReportedStatus();
                            if (wl7.b(selfReportedStatus != null ? selfReportedStatus.getStatus() : null, "MAYBE_APPLIED")) {
                                arrayList.add(obj2);
                            }
                        }
                    }
                    List<JobTimestamp> listE = this.this$0.b.e("myjobs_noJobsTimeStamp");
                    int iV = kc9.V(t92.r0(listE, 10));
                    if (iV < 16) {
                        iV = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iV);
                    for (JobTimestamp jobTimestamp : listE) {
                        Pair pair = new Pair(jobTimestamp.getJobKey(), new Long(jobTimestamp.getTimestamp()));
                        linkedHashMap.put(pair.d(), pair.e());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (AppStatusJob appStatusJob : (Iterable) arrayList) {
                        Long l = (Long) linkedHashMap.get(appStatusJob.getJobKey());
                        if (l != null) {
                            long jLongValue = l.longValue();
                            UserJobStatus userJobStatus = appStatusJob.getStatuses().getUserJobStatus();
                            if (jLongValue >= (userJobStatus != null ? userJobStatus.getTimestamp() : Long.MIN_VALUE)) {
                                appStatusJob = null;
                            }
                        }
                        if (appStatusJob != null) {
                            arrayList2.add(appStatusJob);
                        }
                    }
                    f88 f88Var = this.this$0.b;
                    this.$param.getClass();
                    f88Var.A(z92.q1(arrayList2, 10));
                    ArrayList arrayList3 = new ArrayList(t92.r0(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(DtoExtensionKt.toSavedJobDTO((AppStatusJob) it.next()));
                    }
                    List listQ1 = z92.q1(arrayList3, 10);
                    upb<List<SavedJobsDto>> upbVar = this.$$this$channelFlow;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 1;
                    Object objB = upbVar.b(this, listQ1);
                    g13 g13Var = g13.a;
                    if (objB == g13Var) {
                        return g13Var;
                    }
                } else if (hf3Var instanceof hf3.a) {
                    ArrayList arrayList4 = lz2.a;
                    w40.n("Error occurred while fetching visited jobs", "GetVisitedJobUseCase", "Error occurred while fetching visited jobs ", false);
                } else if (!(hf3Var instanceof hf3.b)) {
                    l.g();
                    return null;
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
    public r66(q66 q66Var, q66.a aVar, lu2<? super r66> lu2Var) {
        super(2, lu2Var);
        this.this$0 = q66Var;
        this.$param = aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        r66 r66Var = new r66(this.this$0, this.$param, lu2Var);
        r66Var.L$0 = obj;
        return r66Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(upb<? super List<? extends SavedJobsDto>> upbVar, lu2<? super j6g> lu2Var) {
        return ((r66) create(upbVar, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (defpackage.wg2.q((defpackage.vi5) r13, r12, r11) == r5) goto L15;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.L$0
            upb r0 = (defpackage.upb) r0
            int r1 = r12.label
            r2 = 2
            r3 = 1
            r4 = 0
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L19
            java.lang.Object r12 = r12.L$1
            vi5 r12 = (defpackage.vi5) r12
            defpackage.r7d.b(r13)
            goto L57
        L19:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r12)
            return r4
        L1f:
            defpackage.r7d.b(r13)
            r11 = r12
            goto L3f
        L24:
            defpackage.r7d.b(r13)
            q66 r13 = r12.this$0
            i88 r6 = r13.a
            q66$a r13 = r12.$param
            long r7 = r13.a
            r12.L$0 = r0
            r12.label = r3
            java.lang.String r10 = "true"
            java.lang.String r9 = "VISITED"
            r11 = r12
            vi5 r13 = r6.o(r7, r9, r10, r11)
            if (r13 != r5) goto L3f
            goto L56
        L3f:
            vi5 r13 = (defpackage.vi5) r13
            r66$a r12 = new r66$a
            q66 r1 = r11.this$0
            q66$a r3 = r11.$param
            r12.<init>(r1, r3, r0, r4)
            r11.L$0 = r4
            r11.L$1 = r4
            r11.label = r2
            java.lang.Object r12 = defpackage.wg2.q(r13, r12, r11)
            if (r12 != r5) goto L57
        L56:
            return r5
        L57:
            j6g r12 = defpackage.j6g.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r66.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

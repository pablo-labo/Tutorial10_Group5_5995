package defpackage;

import android.content.Context;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.myjobs.data.model.SelfReportedStatus;
import com.indeed.android.myjobs.data.model.Statuses;
import com.indeed.android.myjobs.data.model.UpdateJobsStatusUsecase;
import com.indeed.android.myjobs.data.model.UserJobStatus;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ude extends xb1<vde, c> {
    public final dfg f;

    public static abstract class a {

        /* JADX INFO: renamed from: ude$a$a, reason: collision with other inner class name */
        public static final class C0431a extends a {
            public final SavedJobsDto a;
            public final String b;
            public final String c;
            public final boolean d;

            public C0431a(int i, SavedJobsDto savedJobsDto, String str) {
                boolean z = (i & 8) != 0;
                savedJobsDto.getClass();
                this.a = savedJobsDto;
                this.b = str;
                this.c = "";
                this.d = z;
            }

            @Override // ude.a
            public final String a() {
                return this.c;
            }

            @Override // ude.a
            public final String b() {
                return this.b;
            }
        }

        public static final class b extends a {
            public final SavedJobsDto a;
            public final String b;
            public final String c;
            public final boolean d;

            public b(int i, SavedJobsDto savedJobsDto, String str) {
                boolean z = (i & 8) != 0;
                savedJobsDto.getClass();
                this.a = savedJobsDto;
                this.b = str;
                this.c = "";
                this.d = z;
            }

            @Override // ude.a
            public final String a() {
                return this.c;
            }

            @Override // ude.a
            public final String b() {
                return this.b;
            }
        }

        public static final class c extends a {
            public final SavedJobsDto a;
            public final String b;
            public final String c;

            public c(SavedJobsDto savedJobsDto, String str) {
                savedJobsDto.getClass();
                this.a = savedJobsDto;
                this.b = str;
                this.c = "";
            }

            @Override // ude.a
            public final String a() {
                return this.c;
            }

            @Override // ude.a
            public final String b() {
                return this.b;
            }
        }

        public static final class d extends a {
            public final SavedJobsDto a;
            public final String b;
            public final String c;

            public d(SavedJobsDto savedJobsDto, String str) {
                savedJobsDto.getClass();
                this.a = savedJobsDto;
                this.b = str;
                this.c = "";
            }

            @Override // ude.a
            public final String a() {
                return this.c;
            }

            @Override // ude.a
            public final String b() {
                return this.b;
            }
        }

        public static final class e extends a {
            public final SavedJobsDto a;
            public final String b;
            public final String c;
            public final boolean d;

            public e(int i, SavedJobsDto savedJobsDto, String str) {
                boolean z = (i & 8) != 0;
                savedJobsDto.getClass();
                this.a = savedJobsDto;
                this.b = str;
                this.c = "";
                this.d = z;
            }

            @Override // ude.a
            public final String a() {
                return this.c;
            }

            @Override // ude.a
            public final String b() {
                return this.b;
            }
        }

        public static final class f extends a {
            public final SavedJobsDto a;
            public final String b;
            public final String c;

            public f(SavedJobsDto savedJobsDto, String str, String str2) {
                savedJobsDto.getClass();
                this.a = savedJobsDto;
                this.b = str;
                this.c = str2;
            }

            @Override // ude.a
            public final String a() {
                return this.c;
            }

            @Override // ude.a
            public final String b() {
                return this.b;
            }
        }

        public static final class g extends a {
            public final SavedJobsDto a;
            public final String b;
            public final String c;

            public g(SavedJobsDto savedJobsDto, String str, String str2) {
                savedJobsDto.getClass();
                this.a = savedJobsDto;
                this.b = str;
                this.c = str2;
            }

            @Override // ude.a
            public final String a() {
                return this.c;
            }

            @Override // ude.a
            public final String b() {
                return this.b;
            }
        }

        public static final class h extends a {
            public final SavedJobsDto a;
            public final String b;
            public final String c;

            public h(SavedJobsDto savedJobsDto) {
                savedJobsDto.getClass();
                this.a = savedJobsDto;
                this.b = "";
                this.c = "";
            }

            @Override // ude.a
            public final String a() {
                return this.c;
            }

            @Override // ude.a
            public final String b() {
                return this.b;
            }
        }

        public static final class i extends a {
            public final SavedJobsDto a;
            public final String b;
            public final String c;

            public i(SavedJobsDto savedJobsDto, String str) {
                savedJobsDto.getClass();
                this.a = savedJobsDto;
                this.b = str;
                this.c = "";
            }

            @Override // ude.a
            public final String a() {
                return this.c;
            }

            @Override // ude.a
            public final String b() {
                return this.b;
            }
        }

        public static final class j extends a {
            public final SavedJobsDto a;
            public final String b;
            public final String c;

            public j(SavedJobsDto savedJobsDto) {
                savedJobsDto.getClass();
                this.a = savedJobsDto;
                this.b = "";
                this.c = "";
            }

            @Override // ude.a
            public final String a() {
                return this.c;
            }

            @Override // ude.a
            public final String b() {
                return this.b;
            }
        }

        public static final class k extends a {
            public final SavedJobsDto a;
            public final String b;
            public final String c;

            public k(SavedJobsDto savedJobsDto, String str, String str2) {
                savedJobsDto.getClass();
                this.a = savedJobsDto;
                this.b = str;
                this.c = str2;
            }

            @Override // ude.a
            public final String a() {
                return this.c;
            }

            @Override // ude.a
            public final String b() {
                return this.b;
            }
        }

        public static final class l extends a {
        }

        public String a() {
            return "Applied";
        }

        public String b() {
            return "Moved to";
        }
    }

    public static final class b extends a {
        public final SavedJobsDto a;
        public final String b;
        public final String c;

        public b(SavedJobsDto savedJobsDto, String str, String str2) {
            savedJobsDto.getClass();
            this.a = savedJobsDto;
            this.b = str;
            this.c = str2;
        }

        @Override // ude.a
        public final String a() {
            return this.c;
        }

        @Override // ude.a
        public final String b() {
            return this.b;
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.SharedViewModel$onTriggerEvent$1", f = "SharedViewModel.kt", l = {IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, 127}, m = "invokeSuspend")
    public static final class d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ c $event;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ ude this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar, ude udeVar, lu2<? super d> lu2Var) {
            super(2, lu2Var);
            this.$event = cVar;
            this.this$0 = udeVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new d(this.$event, this.this$0, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:229:0x0580, code lost:
        
            if (defpackage.xb1.g((defpackage.vi5) r1, r9, r26) != r6) goto L309;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instruction units count: 2299
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ude.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ude(dfg dfgVar) {
        this.f = dfgVar;
    }

    public static String l(SavedJobsDto savedJobsDto, String str) {
        String str2 = u63.E(savedJobsDto).a;
        if (qq0.i(savedJobsDto)) {
            return "JOB_CLOSED";
        }
        if (u63.a0("APPLIED", "REVIEWED").contains(str2)) {
            if ((i6a.m() || i6a.n()) && savedJobsDto.getEmployerStartedReview()) {
                return "REVIEWING_OTHERS";
            }
            if ((i6a.l() || i6a.m() || i6a.n()) && wl7.b(savedJobsDto.getReplyLikelihoodAdjusted(), "RESPONSE_UNLIKELY")) {
                return "RESPONSE_UNLIKELY";
            }
        }
        return str;
    }

    public static UpdateJobsStatusUsecase n(UserJobStatus userJobStatus, String str, String str2, String str3, SelfReportedStatus selfReportedStatus, String str4) {
        return new UpdateJobsStatusUsecase(new Statuses(null, selfReportedStatus, null, userJobStatus, 5, null), str, str2, "SELF_REPORTED", str3, str4, "SELF_REPORTED");
    }

    @Override // defpackage.xb1
    public final xo6 h() {
        return new vde(0);
    }

    public final void m(c cVar) {
        cVar.getClass();
        u63.Y(ee3.p(this), null, null, new d(cVar, this, null), 3);
    }

    public static abstract class c implements uo6 {

        public static final class a extends c {
            public static final a a = new a();
        }

        public static final class a0 extends c {
            public final String a;
            public final String b;
            public final String c;

            public a0(String str, String str2, String str3) {
                this.a = str;
                this.b = str2;
                this.c = str3;
            }
        }

        public static final class b extends c {
            public static final b a = new b();
        }

        public static final class b0 extends c {
            public final SavedJobsDto a;

            public b0(SavedJobsDto savedJobsDto) {
                savedJobsDto.getClass();
                this.a = savedJobsDto;
            }
        }

        public static final class c0 extends c {
            public final String a;
            public final a b;

            public c0(String str, String str2, String str3, a aVar) {
                str.getClass();
                this.a = str;
                this.b = aVar;
            }
        }

        public static final class d extends c {
            public final String a;
            public final String b;
            public final String c;

            public d(String str, String str2) {
                str2.getClass();
                this.a = "Saved";
                this.b = str;
                this.c = str2;
            }
        }

        public static final class d0 extends c {
            public final SavedJobsDto a;

            public d0(SavedJobsDto savedJobsDto) {
                savedJobsDto.getClass();
                this.a = savedJobsDto;
            }
        }

        public static final class e extends c {
            public static final e a = new e();
        }

        public static final class e0 extends c {
            public static final e0 a = new e0();
        }

        public static final class f extends c {
            public final String a = "Saved";
        }

        public static final class f0 extends c {
            public final String a;
            public final SavedJobsDto b;
            public final Context c;

            public f0(String str, SavedJobsDto savedJobsDto, Context context) {
                str.getClass();
                savedJobsDto.getClass();
                context.getClass();
                this.a = str;
                this.b = savedJobsDto;
                this.c = context;
            }
        }

        public static final class g extends c {
            public final String a;

            public g(String str) {
                this.a = str;
            }
        }

        public static final class g0 extends c {
            public final String a;
            public final SavedJobsDto b;
            public final boolean c;
            public final Context d;

            public g0(String str, SavedJobsDto savedJobsDto, boolean z, Context context) {
                str.getClass();
                savedJobsDto.getClass();
                context.getClass();
                this.a = str;
                this.b = savedJobsDto;
                this.c = z;
                this.d = context;
            }
        }

        public static final class h extends c {
            public final String a;

            public h(String str) {
                this.a = str;
            }
        }

        public static final class h0 extends c {
            public final String a;
            public final SavedJobsDto b;
            public final Context c;

            public h0(String str, SavedJobsDto savedJobsDto, Context context) {
                str.getClass();
                savedJobsDto.getClass();
                context.getClass();
                this.a = str;
                this.b = savedJobsDto;
                this.c = context;
            }
        }

        public static final class i extends c {
            public final String a;

            public i(String str) {
                this.a = str;
            }
        }

        public static final class i0 extends c {
            public final String a;
            public final SavedJobsDto b;
            public final Context c;

            public i0(String str, SavedJobsDto savedJobsDto, Context context) {
                str.getClass();
                savedJobsDto.getClass();
                context.getClass();
                this.a = str;
                this.b = savedJobsDto;
                this.c = context;
            }
        }

        public static final class j extends c {
            public final String a;

            public j(String str) {
                this.a = str;
            }
        }

        public static final class j0 extends c {
            public final String a;
            public final String b;

            public j0(String str, String str2) {
                this.a = str;
                this.b = str2;
            }
        }

        public static final class k extends c {
            public final il7 a;

            public k(il7 il7Var) {
                this.a = il7Var;
            }
        }

        public static final class l extends c {
            public final kl7 a;

            public l(kl7 kl7Var) {
                this.a = kl7Var;
            }
        }

        public static final class m extends c {
            public final String a;

            public m(String str) {
                this.a = str;
            }
        }

        public static final class n extends c {
            public final String a;
            public final String b;

            public n(String str, String str2) {
                str2.getClass();
                this.a = str;
                this.b = str2;
            }
        }

        public static final class o extends c {
            public final int a;

            public o(int i) {
                this.a = i;
            }
        }

        public static final class p extends c {
            public final String a;
            public final String b;

            public p(String str, String str2) {
                str.getClass();
                this.a = str;
                this.b = str2;
            }
        }

        public static final class q extends c {
            public final String a;
            public final String b;
            public final String c;

            public q(String str, String str2) {
                str2.getClass();
                this.a = "Applied";
                this.b = str;
                this.c = str2;
            }
        }

        public static final class r extends c {
            public final SavedJobsDto a;

            public r(SavedJobsDto savedJobsDto) {
                savedJobsDto.getClass();
                this.a = savedJobsDto;
            }
        }

        public static final class s extends c {
            public final String a;

            public s(String str) {
                this.a = str;
            }
        }

        public static final class t extends c {
            public static final t a = new t();
        }

        public static final class u extends c {
            public final String a;
            public final boolean b;

            public u(String str, boolean z) {
                str.getClass();
                this.a = str;
                this.b = z;
            }
        }

        public static final class v extends c {
            public static final v a = new v();
        }

        public static final class w extends c {
            public static final w a = new w();
        }

        public static final class x extends c {
            public final String a;
            public final String b;
            public final String c;

            public x(String str) {
                str.getClass();
                this.a = str;
                this.b = "";
                this.c = "";
            }
        }

        public static final class y extends c {
        }

        public static final class z extends c {
            public final String a;
            public final String b;

            public z(String str) {
                str.getClass();
                this.a = str;
                this.b = "";
            }
        }

        /* JADX INFO: renamed from: ude$c$c, reason: collision with other inner class name */
        public static final class C0432c extends c {
            public final String a;
            public final String b;
            public final String c;
            public final SavedJobsDto d;

            public C0432c(SavedJobsDto savedJobsDto, String str, String str2, String str3) {
                str3.getClass();
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = savedJobsDto;
            }

            public /* synthetic */ C0432c() {
                this(null, "Interview", null, "");
            }
        }
    }
}

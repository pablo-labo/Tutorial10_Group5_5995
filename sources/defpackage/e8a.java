package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import androidx.compose.runtime.p;
import androidx.compose.runtime.r;
import com.indeed.android.backendservices.data.IndeedAppDatabase;
import com.indeed.android.myjobs.data.model.dto.EmployerInvitationDto;
import com.indeed.android.myjobs.data.model.dto.InterviewJobsDto;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.xh8;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class e8a extends brg implements xh8 {
    public static boolean j0;
    public final g4a<j7f> V;
    public final g3a<jz2<j7f>> W;
    public final g3a X;
    public final int Y;
    public ve8<j6g> Z;
    public final g3a<b5a> a0;
    public final gsa b;
    public final g3a<Boolean> b0;
    public final c3a c;
    public final g3a c0;
    public final nde d;
    public final nde d0;
    public long e;
    public final pqc e0;
    public final long f;
    public final g3a<Boolean> f0;
    public final g3a g0;
    public final g3a<Boolean> h0;
    public final g3a i0;

    @uh3(c = "com.indeed.android.myjobs.MyJobsViewModel$openNextStepsDashboard$1", f = "MyJobsViewModel.kt", l = {235, 236, 237, 238, 249, 274}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ fr0 $appliedTabViewModel;
        final /* synthetic */ mk7 $interviewTabViewModel;
        final /* synthetic */ bn7 $invitationTabViewModel;
        final /* synthetic */ pld $savedTabViewModel;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;

        /* JADX INFO: renamed from: e8a$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.myjobs.MyJobsViewModel$openNextStepsDashboard$1$appliedJobsDeferred$1", f = "MyJobsViewModel.kt", l = {230}, m = "invokeSuspend")
        public static final class C0215a extends c1f implements Function2<e13, lu2<? super List<? extends SavedJobsDto>>, Object> {
            final /* synthetic */ fr0 $appliedTabViewModel;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0215a(fr0 fr0Var, lu2<? super C0215a> lu2Var) {
                super(2, lu2Var);
                this.$appliedTabViewModel = fr0Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0215a(this.$appliedTabViewModel, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super List<? extends SavedJobsDto>> lu2Var) {
                return ((C0215a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        r7d.b(obj);
                        return obj;
                    }
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                fr0 fr0Var = this.$appliedTabViewModel;
                this.label = 1;
                Object objN = fr0Var.n(3, this);
                g13 g13Var = g13.a;
                return objN == g13Var ? g13Var : objN;
            }
        }

        @uh3(c = "com.indeed.android.myjobs.MyJobsViewModel$openNextStepsDashboard$1$interviewsDeferred$1", f = "MyJobsViewModel.kt", l = {232}, m = "invokeSuspend")
        public static final class b extends c1f implements Function2<e13, lu2<? super List<? extends InterviewJobsDto>>, Object> {
            final /* synthetic */ mk7 $interviewTabViewModel;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(mk7 mk7Var, lu2<? super b> lu2Var) {
                super(2, lu2Var);
                this.$interviewTabViewModel = mk7Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new b(this.$interviewTabViewModel, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super List<? extends InterviewJobsDto>> lu2Var) {
                return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        r7d.b(obj);
                        return obj;
                    }
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                mk7 mk7Var = this.$interviewTabViewModel;
                this.label = 1;
                Object objP = mk7Var.p(3, this);
                g13 g13Var = g13.a;
                return objP == g13Var ? g13Var : objP;
            }
        }

        @uh3(c = "com.indeed.android.myjobs.MyJobsViewModel$openNextStepsDashboard$1$invitationsDeferred$1", f = "MyJobsViewModel.kt", l = {231}, m = "invokeSuspend")
        public static final class c extends c1f implements Function2<e13, lu2<? super EmployerInvitationDto>, Object> {
            final /* synthetic */ bn7 $invitationTabViewModel;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(bn7 bn7Var, lu2<? super c> lu2Var) {
                super(2, lu2Var);
                this.$invitationTabViewModel = bn7Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new c(this.$invitationTabViewModel, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super EmployerInvitationDto> lu2Var) {
                return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        r7d.b(obj);
                        return obj;
                    }
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                bn7 bn7Var = this.$invitationTabViewModel;
                this.label = 1;
                Object objM = bn7Var.m(3, this);
                g13 g13Var = g13.a;
                return objM == g13Var ? g13Var : objM;
            }
        }

        @uh3(c = "com.indeed.android.myjobs.MyJobsViewModel$openNextStepsDashboard$1$savedJobsDeferred$1", f = "MyJobsViewModel.kt", l = {229}, m = "invokeSuspend")
        public static final class d extends c1f implements Function2<e13, lu2<? super List<? extends SavedJobsDto>>, Object> {
            final /* synthetic */ pld $savedTabViewModel;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(pld pldVar, lu2<? super d> lu2Var) {
                super(2, lu2Var);
                this.$savedTabViewModel = pldVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new d(this.$savedTabViewModel, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super List<? extends SavedJobsDto>> lu2Var) {
                return ((d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        r7d.b(obj);
                        return obj;
                    }
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                pld pldVar = this.$savedTabViewModel;
                this.label = 1;
                Object objM = pldVar.m(3, this);
                g13 g13Var = g13.a;
                return objM == g13Var ? g13Var : objM;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pld pldVar, fr0 fr0Var, bn7 bn7Var, mk7 mk7Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$savedTabViewModel = pldVar;
            this.$appliedTabViewModel = fr0Var;
            this.$invitationTabViewModel = bn7Var;
            this.$interviewTabViewModel = mk7Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = e8a.this.new a(this.$savedTabViewModel, this.$appliedTabViewModel, this.$invitationTabViewModel, this.$interviewTabViewModel, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:62:0x0222, code lost:
        
            if (r13.a(r0, r12) != r7) goto L64;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x01a3 A[Catch: Exception -> 0x0046, CancellationException -> 0x0049, TRY_ENTER, TryCatch #2 {CancellationException -> 0x0049, Exception -> 0x0046, blocks: (B:8:0x0041, B:57:0x01d1, B:15:0x0068, B:42:0x0163, B:44:0x0173, B:46:0x0181, B:48:0x018f, B:54:0x01a3, B:59:0x01d4, B:18:0x0085, B:38:0x0142, B:21:0x00a1, B:34:0x0124, B:24:0x00b6, B:30:0x0106, B:27:0x00bd), top: B:68:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01d4 A[Catch: Exception -> 0x0046, CancellationException -> 0x0049, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0049, Exception -> 0x0046, blocks: (B:8:0x0041, B:57:0x01d1, B:15:0x0068, B:42:0x0163, B:44:0x0173, B:46:0x0181, B:48:0x018f, B:54:0x01a3, B:59:0x01d4, B:18:0x0085, B:38:0x0142, B:21:0x00a1, B:34:0x0124, B:24:0x00b6, B:30:0x0106, B:27:0x00bd), top: B:68:0x000f }] */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 580
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: e8a.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "com.indeed.android.myjobs.MyJobsViewModel$updateMyJobsPageBasedOnUrl$1", f = "MyJobsViewModel.kt", l = {181}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$url = str;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return e8a.this.new b(this.$url, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                nde ndeVar = e8a.this.d;
                Integer num = new Integer(e8a.l(this.$url));
                this.label = 1;
                Object objA = ndeVar.a(num, this);
                g13 g13Var = g13.a;
                if (objA == g13Var) {
                    return g13Var;
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

    public e8a(gsa gsaVar, IndeedAppDatabase indeedAppDatabase) {
        gsaVar.getClass();
        indeedAppDatabase.getClass();
        this.b = gsaVar;
        c3a c3aVarA = p.a(l(null));
        this.c = c3aVarA;
        this.d = wg2.d(0, 0, null, 7);
        wg2.d(0, 0, null, 7);
        this.f = 500L;
        this.V = r.f(u63.M(((dme) c3aVarA).e()));
        g3a<jz2<j7f>> g3aVar = new g3a<>();
        this.W = g3aVar;
        this.X = g3aVar;
        this.Y = 20;
        this.a0 = new g3a<>();
        Boolean bool = Boolean.FALSE;
        g3a<Boolean> g3aVar2 = new g3a<>(bool);
        this.b0 = g3aVar2;
        this.c0 = g3aVar2;
        nde ndeVarD = wg2.d(0, 1, null, 5);
        this.d0 = ndeVarD;
        this.e0 = wg2.i(ndeVarD);
        g3a<Boolean> g3aVar3 = new g3a<>(bool);
        this.f0 = g3aVar3;
        this.g0 = g3aVar3;
        g3a<Boolean> g3aVar4 = new g3a<>(bool);
        this.h0 = g3aVar4;
        this.i0 = g3aVar4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016f  */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [zr4] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.uha g(defpackage.e8a r18, java.util.List r19, java.util.List r20, com.indeed.android.myjobs.data.model.dto.EmployerInvitationDto r21, java.util.List r22) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e8a.g(e8a, java.util.List, java.util.List, com.indeed.android.myjobs.data.model.dto.EmployerInvitationDto, java.util.List):uha");
    }

    public static int l(String str) {
        String strSubstring;
        if (str != null) {
            String path = new URL(str).getPath();
            path.getClass();
            int length = path.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    strSubstring = "";
                    break;
                }
                if (path.charAt(i) != '/') {
                    strSubstring = path.substring(i);
                    break;
                }
                i++;
            }
            Locale locale = Locale.ROOT;
            locale.getClass();
            String lowerCase = strSubstring.toLowerCase(locale);
            lowerCase.getClass();
            if (!wve.K(lowerCase, "saved", false)) {
                String lowerCase2 = strSubstring.toLowerCase(locale);
                lowerCase2.getClass();
                if (!wve.K(lowerCase2, "invitations", false)) {
                    String lowerCase3 = strSubstring.toLowerCase(locale);
                    lowerCase3.getClass();
                    if (wve.K(lowerCase3, "applied", false)) {
                        return i6a.i() ? 2 : 1;
                    }
                    String lowerCase4 = strSubstring.toLowerCase(locale);
                    lowerCase4.getClass();
                    if (wve.K(lowerCase4, "interviews", false)) {
                        return i6a.i() ? 3 : 2;
                    }
                    String lowerCase5 = strSubstring.toLowerCase(locale);
                    lowerCase5.getClass();
                    if (wve.K(lowerCase5, "archived", false)) {
                        return i6a.i() ? 4 : 3;
                    }
                    if (i6a.p()) {
                        return i6a.i() ? 2 : 1;
                    }
                } else if (i6a.i()) {
                    return 1;
                }
            }
        } else if (i6a.p()) {
            return i6a.i() ? 2 : 1;
        }
        return 0;
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(String str, e13 e13Var, List<SavedJobsDto> list, boolean z) {
        e13Var.getClass();
        ((c39) (this instanceof ai8 ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(c39.class), null)).a(str, e13Var, list, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(String str, e13 e13Var) {
        e13Var.getClass();
        ((c39) (this instanceof ai8 ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(c39.class), null)).b(str, e13Var);
    }

    public final void j() {
        this.b0.k(Boolean.FALSE);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.e < this.f) {
            return;
        }
        this.e = jElapsedRealtime;
        ve8<j6g> ve8Var = this.Z;
        if (ve8Var != null) {
            if (ve8Var != null) {
                ((gu5) ve8Var).invoke();
            } else {
                wl7.g("onPageRefresh");
                throw null;
            }
        }
    }

    public final void k(pld pldVar, fr0 fr0Var, bn7 bn7Var, mk7 mk7Var) {
        pldVar.getClass();
        fr0Var.getClass();
        bn7Var.getClass();
        mk7Var.getClass();
        u63.Y(ee3.p(this), null, null, new a(pldVar, fr0Var, bn7Var, mk7Var, null), 3);
    }

    public final void m(String str) {
        str.getClass();
        ((dme) this.c).h(l(str));
        u63.Y(ee3.p(this), null, null, new b(str, null), 3);
        try {
            if (wl7.b(Uri.parse(str).getQueryParameter("view"), "next_steps_dashboard")) {
                ra8 ra8Var = i6a.a;
                boolean z = true;
                if (((kr7) cr8.p(kr7.class)).e("droidnative_myjobs_next_steps_dashboard").a < 1) {
                    z = false;
                }
                if (z) {
                    ArrayList arrayList = lz2.a;
                    lz2.d("MyJobsViewModel", "Next Steps Dashboard URL detected, triggering dashboard", false, null);
                    this.f0.k(Boolean.TRUE);
                }
            }
        } catch (Exception e) {
            ArrayList arrayList2 = lz2.a;
            lz2.b("MyJobsViewModel", "Error parsing URL for next steps dashboard: ".concat(str), false, e);
        }
    }
}

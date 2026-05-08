package defpackage;

import com.indeed.android.jobsearch.JobSearchApplication;
import defpackage.xh8;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class fpb implements xh8, uob {
    public final y03 a;
    public final au9 b;
    public final Lazy c;

    @uh3(c = "com.indeed.android.jobsearch.pulse.ProctorRefreshManager$onProctorGroupsUpdated$1", f = "ProctorRefreshManager.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        /* JADX INFO: renamed from: fpb$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.jobsearch.pulse.ProctorRefreshManager$onProctorGroupsUpdated$1$1", f = "ProctorRefreshManager.kt", l = {52}, m = "invokeSuspend")
        public static final class C0236a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ long $millisRemaining;
            int label;
            final /* synthetic */ fpb this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0236a(long j, fpb fpbVar, lu2<? super C0236a> lu2Var) {
                super(2, lu2Var);
                this.$millisRemaining = j;
                this.this$0 = fpbVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0236a(this.$millisRemaining, this.this$0, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0236a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    r7d.b(obj);
                    long j = this.$millisRemaining;
                    this.label = 1;
                    Object objB = ls3.b(j, this);
                    g13 g13Var = g13.a;
                    if (objB == g13Var) {
                        return g13Var;
                    }
                } else {
                    if (i != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                }
                ArrayList arrayList = lz2.a;
                lz2.d("ProctorRefreshManager", "publishing delayed proctor update", false, null);
                ((tob) this.this$0.c.getValue()).b();
                return j6g.a;
            }
        }

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return fpb.this.new a(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
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
                if (r0 != 0) goto La7
                defpackage.r7d.b(r12)
                java.util.ArrayList r12 = defpackage.lz2.a
                java.lang.String r12 = "onProctorGroupsUpdated()"
                java.lang.String r0 = "ProctorRefreshManager"
                r2 = 0
                defpackage.lz2.d(r0, r12, r2, r1)
                fpb r12 = defpackage.fpb.this
                au9 r12 = r12.b
                long r3 = r12.a
                r5 = -1
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                r7 = 0
                if (r3 == 0) goto L2a
                long r3 = java.lang.System.currentTimeMillis()
                r12.b = r3
                long r9 = r12.a
                long r3 = r3 - r9
                goto L2b
            L2a:
                r3 = r7
            L2b:
                java.lang.String r12 = "Proctor refresh elapsed time: "
                java.lang.String r9 = " ms"
                java.lang.String r12 = defpackage.u40.c(r3, r12, r9)
                defpackage.lz2.d(r0, r12, r2, r1)
                dd4 r12 = defpackage.dd4.a
                boolean r12 = defpackage.dd4.m()
                if (r12 == 0) goto L8a
                fpb r12 = defpackage.fpb.this
                au9 r12 = r12.b
                long r3 = r12.a
                int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r9 == 0) goto L51
                long r9 = r12.b
                long r9 = r9 - r3
                r3 = 2000(0x7d0, double:9.88E-321)
                int r12 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r12 <= 0) goto L53
            L51:
                r3 = r7
                goto L54
            L53:
                long r3 = r3 - r9
            L54:
                int r12 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                if (r12 <= 0) goto L77
                java.lang.String r12 = "sync refresh active: delaying proctor results "
                java.lang.String r7 = " ms..."
                java.lang.String r12 = defpackage.u40.c(r3, r12, r7)
                defpackage.lz2.d(r0, r12, r2, r1)
                fpb r12 = defpackage.fpb.this
                y03 r12 = r12.a
                eu2 r12 = defpackage.f13.a(r12)
                fpb$a$a r0 = new fpb$a$a
                fpb r2 = defpackage.fpb.this
                r0.<init>(r3, r2, r1)
                r2 = 3
                defpackage.u63.Y(r12, r1, r1, r0, r2)
                goto L9c
            L77:
                java.lang.String r12 = "sync refresh active: publishing proctor update"
                defpackage.lz2.d(r0, r12, r2, r1)
                fpb r12 = defpackage.fpb.this
                kotlin.Lazy r12 = r12.c
                java.lang.Object r12 = r12.getValue()
                tob r12 = (defpackage.tob) r12
                r12.b()
                goto L9c
            L8a:
                java.lang.String r12 = "publishing proctor update"
                defpackage.lz2.d(r0, r12, r2, r1)
                fpb r12 = defpackage.fpb.this
                kotlin.Lazy r12 = r12.c
                java.lang.Object r12 = r12.getValue()
                tob r12 = (defpackage.tob) r12
                r12.b()
            L9c:
                fpb r11 = defpackage.fpb.this
                au9 r11 = r11.b
                r11.a = r5
                r11.b = r5
                j6g r11 = defpackage.j6g.a
                return r11
            La7:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r11)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: fpb.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public fpb(int i) {
        eq3 eq3Var = a74.a;
        no3 no3Var = no3.c;
        no3Var.getClass();
        this.a = no3Var;
        au9 au9Var = new au9();
        au9Var.a = -1L;
        au9Var.b = -1L;
        this.b = au9Var;
        this.c = boa.E(qt8.a, new gpb(this));
    }

    @Override // defpackage.uob
    public final void a() {
        u63.Y(f13.a(this.a), null, null, new a(null), 3);
    }

    public final void b(zob zobVar) {
        ArrayList arrayList = lz2.a;
        lz2.d("ProctorRefreshManager", "kickoffRefresh()", false, null);
        au9 au9Var = this.b;
        au9Var.getClass();
        au9Var.a = System.currentTimeMillis();
        JobSearchApplication jobSearchApplication = JobSearchApplication.X;
        if (jobSearchApplication == null) {
            wl7.g("appInstance");
            throw null;
        }
        epb epbVar = jobSearchApplication.e;
        if (epbVar != null) {
            epbVar.a(zobVar, new fj(this, 13), this);
        } else {
            wl7.g("proctorLoaderWrapper");
            throw null;
        }
    }

    @Override // defpackage.uob
    public final String c() {
        return "ProctorRefreshManager";
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    public fpb() {
        this(0);
    }
}

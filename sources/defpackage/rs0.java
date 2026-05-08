package defpackage;

import com.indeed.android.myjobs.data.model.ApiResponse;
import defpackage.hf3;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class rs0 extends xb1<old, b> {
    public final yz5 V;
    public final c39 W;
    public boolean X;
    public int Y = -1;
    public final ds0 f;

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.ArchivedTabViewModel$1", f = "ArchivedTabViewModel.kt", l = {54, 54}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        Object L$0;
        int label;

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return rs0.this.new a(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (defpackage.xb1.g((defpackage.vi5) r8, r6, r7) == r4) goto L15;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                int r0 = r7.label
                r1 = 0
                r2 = 2
                r3 = 1
                g13 r4 = defpackage.g13.a
                if (r0 == 0) goto L1f
                if (r0 == r3) goto L17
                if (r0 != r2) goto L11
                defpackage.r7d.b(r8)
                goto L4c
            L11:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r7)
                return r1
            L17:
                java.lang.Object r0 = r7.L$0
                rs0 r0 = (defpackage.rs0) r0
                defpackage.r7d.b(r8)
                goto L35
            L1f:
                defpackage.r7d.b(r8)
                rs0 r0 = defpackage.rs0.this
                yz5 r8 = r0.V
                j6g r5 = defpackage.j6g.a
                r7.L$0 = r0
                r7.label = r3
                f88 r8 = r8.a
                rqc r8 = r8.i()
                if (r8 != r4) goto L35
                goto L4b
            L35:
                vi5 r8 = (defpackage.vi5) r8
                rs0 r5 = defpackage.rs0.this
                tv r6 = new tv
                r6.<init>(r5, r3)
                r7.L$0 = r1
                r7.label = r2
                r0.getClass()
                java.lang.Object r7 = defpackage.xb1.g(r8, r6, r7)
                if (r7 != r4) goto L4c
            L4b:
                return r4
            L4c:
                j6g r7 = defpackage.j6g.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: rs0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static abstract class b implements uo6 {

        public static final class a extends b {
            public static final a a = new a();
        }

        /* JADX INFO: renamed from: rs0$b$b, reason: collision with other inner class name */
        public static final class C0411b extends b {
            public static final C0411b a = new C0411b();
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.ArchivedTabViewModel$loadData$1", f = "ArchivedTabViewModel.kt", l = {78, 85}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        @uh3(c = "com.indeed.android.myjobs.presentation.tabs.ArchivedTabViewModel$loadData$1$1", f = "ArchivedTabViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<hf3<ApiResponse>, lu2<? super j6g>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ rs0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(rs0 rs0Var, lu2<? super a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = rs0Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                a aVar = new a(this.this$0, lu2Var);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(hf3<ApiResponse> hf3Var, lu2<? super j6g> lu2Var) {
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
                if (hf3Var instanceof hf3.c) {
                    rs0 rs0Var = this.this$0;
                    rs0Var.k(new mt(2, rs0Var, hf3Var));
                } else if (hf3Var instanceof hf3.b) {
                    rs0 rs0Var2 = this.this$0;
                    rs0Var2.i();
                    rs0Var2.b.setValue(old.a(rs0Var2.i(), null, null, false, 0, null, null, true, null, false, null, false, null, null, false, false, 0, 261759));
                } else {
                    if (!(hf3Var instanceof hf3.a)) {
                        l.g();
                        return null;
                    }
                    rs0 rs0Var3 = this.this$0;
                    rs0Var3.i();
                    rs0Var3.b.setValue(old.a(rs0Var3.i(), null, null, false, 0, null, null, false, ((hf3.a) hf3Var).a, false, null, false, null, null, false, false, 0, 261759));
                }
                return j6g.a;
            }
        }

        public c(lu2<? super c> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return rs0.this.new c(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
        
            if (defpackage.wg2.q((defpackage.vi5) r0, r4, r21) == r5) goto L23;
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
                int r0 = r1.label
                r2 = 0
                r3 = 2
                r4 = 1
                g13 r5 = defpackage.g13.a
                if (r0 == 0) goto L22
                if (r0 == r4) goto L1c
                if (r0 != r3) goto L16
                defpackage.r7d.b(r22)     // Catch: java.lang.Exception -> L14
                goto La9
            L14:
                r0 = move-exception
                goto L69
            L16:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r0)
                return r2
            L1c:
                defpackage.r7d.b(r22)     // Catch: java.lang.Exception -> L14
                r0 = r22
                goto L57
            L22:
                defpackage.r7d.b(r22)
                rs0 r0 = defpackage.rs0.this     // Catch: java.lang.Exception -> L14
                ds0 r0 = r0.f     // Catch: java.lang.Exception -> L14
                ds0$a r6 = new ds0$a     // Catch: java.lang.Exception -> L14
                long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L14
                r9 = 15552000000(0x39ef8b000, double:7.683708924E-314)
                long r7 = r7 - r9
                rqc r9 = defpackage.v0b.b     // Catch: java.lang.Exception -> L14
                fse<T> r9 = r9.a     // Catch: java.lang.Exception -> L14
                java.lang.Object r9 = r9.getValue()     // Catch: java.lang.Exception -> L14
                java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L14
                if (r9 != 0) goto L43
                java.lang.String r9 = defpackage.ie7.Z     // Catch: java.lang.Exception -> L14
            L43:
                r6.<init>(r7, r9)     // Catch: java.lang.Exception -> L14
                r1.label = r4     // Catch: java.lang.Exception -> L14
                r0.getClass()     // Catch: java.lang.Exception -> L14
                es0 r4 = new es0     // Catch: java.lang.Exception -> L14
                r4.<init>(r0, r6, r2)     // Catch: java.lang.Exception -> L14
                a22 r0 = defpackage.wg2.n(r4)     // Catch: java.lang.Exception -> L14
                if (r0 != r5) goto L57
                goto L68
            L57:
                vi5 r0 = (defpackage.vi5) r0     // Catch: java.lang.Exception -> L14
                rs0$c$a r4 = new rs0$c$a     // Catch: java.lang.Exception -> L14
                rs0 r6 = defpackage.rs0.this     // Catch: java.lang.Exception -> L14
                r4.<init>(r6, r2)     // Catch: java.lang.Exception -> L14
                r1.label = r3     // Catch: java.lang.Exception -> L14
                java.lang.Object r0 = defpackage.wg2.q(r0, r4, r1)     // Catch: java.lang.Exception -> L14
                if (r0 != r5) goto La9
            L68:
                return r5
            L69:
                rs0 r1 = defpackage.rs0.this
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
                java.lang.String r3 = "ArchivedTabViewModel"
                defpackage.lz2.b(r3, r1, r2, r0)
            La9:
                j6g r0 = defpackage.j6g.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: rs0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public rs0(ds0 ds0Var, yz5 yz5Var, c39 c39Var) {
        this.f = ds0Var;
        this.V = yz5Var;
        this.W = c39Var;
        u63.Y(ee3.p(this), null, null, new a(null), 3);
    }

    @Override // defpackage.xb1
    public final xo6 h() {
        return new old(0);
    }

    public final void l(boolean z) {
        boolean z2 = this.X;
        this.X = true;
        this.Y = -1;
        u63.Y(ee3.p(this), null, null, new c(null), 3);
        if (z && z2) {
            this.W.b("Archived", ee3.p(this));
        }
    }
}

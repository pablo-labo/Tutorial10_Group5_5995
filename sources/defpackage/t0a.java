package defpackage;

import com.indeed.android.myjobs.data.model.AppStatusJob;
import com.indeed.android.myjobs.data.model.Response;
import defpackage.hf3;
import defpackage.s0a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.domain.usecase.MoveVisitedJobToAppliedUseCase$invoke$2", f = "MoveVisitedJobToAppliedUseCase.kt", l = {35, 80}, m = "invokeSuspend")
public final class t0a extends c1f implements Function2<upb<? super j6g>, lu2<? super j6g>, Object> {
    final /* synthetic */ s0a.a $param;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ s0a this$0;

    @uh3(c = "com.indeed.android.myjobs.domain.usecase.MoveVisitedJobToAppliedUseCase$invoke$2$1", f = "MoveVisitedJobToAppliedUseCase.kt", l = {38, 64, 64}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<List<? extends AppStatusJob>, lu2<? super j6g>, Object> {
        final /* synthetic */ upb<j6g> $$this$channelFlow;
        final /* synthetic */ s0a.a $param;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        final /* synthetic */ s0a this$0;

        /* JADX INFO: renamed from: t0a$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.myjobs.domain.usecase.MoveVisitedJobToAppliedUseCase$invoke$2$1$1", f = "MoveVisitedJobToAppliedUseCase.kt", l = {}, m = "invokeSuspend")
        public static final class C0418a extends c1f implements Function2<hf3<Response>, lu2<? super j6g>, Object> {
            final /* synthetic */ s0a.a $param;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ s0a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0418a(s0a s0aVar, s0a.a aVar, lu2<? super C0418a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = s0aVar;
                this.$param = aVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                C0418a c0418a = new C0418a(this.this$0, this.$param, lu2Var);
                c0418a.L$0 = obj;
                return c0418a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(hf3<Response> hf3Var, lu2<? super j6g> lu2Var) {
                return ((C0418a) create(hf3Var, lu2Var)).invokeSuspend(j6g.a);
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
                    this.this$0.a.E(this.$param.a, "May be applied moved to applied");
                } else if (hf3Var instanceof hf3.a) {
                    ArrayList arrayList = lz2.a;
                    w40.n("Error occurred while updating status", "MoveVisitedJobToAppliedUseCase", "Error occurred while updating status", false);
                } else if (!(hf3Var instanceof hf3.b)) {
                    l.g();
                    return null;
                }
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(upb<? super j6g> upbVar, s0a s0aVar, s0a.a aVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$$this$channelFlow = upbVar;
            this.this$0 = s0aVar;
            this.$param = aVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$$this$channelFlow, this.this$0, this.$param, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends AppStatusJob> list, lu2<? super j6g> lu2Var) {
            return ((a) create(list, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00b3, code lost:
        
            if (r0.b(r22, r1) == r8) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x014a, code lost:
        
            if (defpackage.wg2.q((defpackage.vi5) r0, r1, r22) != r8) goto L35;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 336
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: t0a.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0a(s0a s0aVar, s0a.a aVar, lu2<? super t0a> lu2Var) {
        super(2, lu2Var);
        this.this$0 = s0aVar;
        this.$param = aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        t0a t0aVar = new t0a(this.this$0, this.$param, lu2Var);
        t0aVar.L$0 = obj;
        return t0aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(upb<? super j6g> upbVar, lu2<? super j6g> lu2Var) {
        return ((t0a) create(upbVar, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (r0.b(r8, r9) == r5) goto L15;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.L$0
            upb r0 = (defpackage.upb) r0
            int r1 = r8.label
            r2 = 2
            r3 = 1
            r4 = 0
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L27
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L19
            java.lang.Object r8 = r8.L$1
            vi5 r8 = (defpackage.vi5) r8
            defpackage.r7d.b(r9)
            goto L57
        L19:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r8)
            return r4
        L1f:
            java.lang.Object r1 = r8.L$1
            vi5 r1 = (defpackage.vi5) r1
            defpackage.r7d.b(r9)
            goto L48
        L27:
            defpackage.r7d.b(r9)
            s0a r9 = r8.this$0
            f88 r9 = r9.a
            rqc r9 = r9.z()
            t0a$a r1 = new t0a$a
            s0a r6 = r8.this$0
            s0a$a r7 = r8.$param
            r1.<init>(r0, r6, r7, r4)
            r8.L$0 = r0
            r8.L$1 = r4
            r8.label = r3
            java.lang.Object r9 = defpackage.wg2.q(r9, r1, r8)
            if (r9 != r5) goto L48
            goto L56
        L48:
            j6g r9 = defpackage.j6g.a
            r8.L$0 = r4
            r8.L$1 = r4
            r8.label = r2
            java.lang.Object r8 = r0.b(r8, r9)
            if (r8 != r5) goto L57
        L56:
            return r5
        L57:
            j6g r8 = defpackage.j6g.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t0a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package defpackage;

import com.indeed.android.myjobs.data.model.dto.EmployerInvitationDto;
import com.indeed.android.myjobs.data.model.dto.InvitedJobDto;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.tabs.InvitationTabViewModel$fetchInvitations$1", f = "InvitationTabViewModel.kt", l = {349, 349}, m = "invokeSuspend")
public final class en7 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ boolean $calculateActionableSteps;
    final /* synthetic */ boolean $shouldLog;
    int label;
    final /* synthetic */ bn7 this$0;

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.InvitationTabViewModel$fetchInvitations$1$2", f = "InvitationTabViewModel.kt", l = {357, 359, 372, 373}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<hf3<EmployerInvitationDto>, lu2<? super j6g>, Object> {
        final /* synthetic */ boolean $calculateActionableSteps;
        final /* synthetic */ boolean $shouldLog;
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ bn7 this$0;

        /* JADX INFO: renamed from: en7$a$a, reason: collision with other inner class name */
        public static final class C0219a<T> implements wi5 {
            public static final C0219a<T> a = new C0219a<>();

            @Override // defpackage.wi5
            public final Object a(Object obj, lu2 lu2Var) {
                return j6g.a;
            }
        }

        @uh3(c = "com.indeed.android.myjobs.presentation.tabs.InvitationTabViewModel$fetchInvitations$1$2$2", f = "InvitationTabViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class b extends c1f implements Function2<List<? extends InvitedJobDto>, lu2<? super j6g>, Object> {
            final /* synthetic */ boolean $calculateActionableSteps;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ bn7 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z, bn7 bn7Var, lu2<? super b> lu2Var) {
                super(2, lu2Var);
                this.$calculateActionableSteps = z;
                this.this$0 = bn7Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                b bVar = new b(this.$calculateActionableSteps, this.this$0, lu2Var);
                bVar.L$0 = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(List<? extends InvitedJobDto> list, lu2<? super j6g> lu2Var) {
                return ((b) create(list, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
            @Override // defpackage.x81
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = r12.L$0
                    java.util.List r0 = (java.util.List) r0
                    int r1 = r12.label
                    r2 = 0
                    if (r1 != 0) goto Lba
                    defpackage.r7d.b(r13)
                    boolean r13 = r12.$calculateActionableSteps
                    r1 = 0
                    if (r13 == 0) goto L63
                    com.indeed.android.myjobs.data.model.dto.EmployerInvitationDto r13 = new com.indeed.android.myjobs.data.model.dto.EmployerInvitationDto
                    r13.<init>(r0)
                    java.util.List r13 = r13.getInvitedJobs()
                    if (r13 == 0) goto L63
                    java.lang.Iterable r13 = (java.lang.Iterable) r13
                    boolean r3 = r13 instanceof java.util.Collection
                    if (r3 == 0) goto L2c
                    r3 = r13
                    java.util.Collection r3 = (java.util.Collection) r3
                    boolean r3 = r3.isEmpty()
                    if (r3 == 0) goto L2c
                    goto L63
                L2c:
                    java.util.Iterator r13 = r13.iterator()
                    r3 = r1
                L31:
                    boolean r4 = r13.hasNext()
                    if (r4 == 0) goto L64
                    java.lang.Object r4 = r13.next()
                    com.indeed.android.myjobs.data.model.dto.InvitedJobDto r4 = (com.indeed.android.myjobs.data.model.dto.InvitedJobDto) r4
                    com.indeed.android.myjobs.data.model.dto.InviteDto r4 = r4.getInvite()
                    java.lang.String r4 = r4.getStatus()
                    if (r4 == 0) goto L51
                    java.util.Locale r5 = java.util.Locale.ROOT
                    java.lang.String r4 = r4.toUpperCase(r5)
                    r4.getClass()
                    goto L52
                L51:
                    r4 = r2
                L52:
                    java.lang.String r5 = "INITIATED"
                    boolean r4 = defpackage.wl7.b(r4, r5)
                    if (r4 == 0) goto L31
                    int r3 = r3 + 1
                    if (r3 < 0) goto L5f
                    goto L31
                L5f:
                    defpackage.u63.n0()
                    throw r2
                L63:
                    r3 = r1
                L64:
                    if (r3 <= 0) goto L67
                    r1 = 1
                L67:
                    bn7 r13 = r12.this$0
                    boolean r3 = r12.$calculateActionableSteps
                    r13.getClass()
                    xo6 r4 = r13.i()
                    an7 r4 = (defpackage.an7) r4
                    xo6 r4 = r13.i()
                    r5 = r4
                    an7 r5 = (defpackage.an7) r5
                    com.indeed.android.myjobs.data.model.dto.EmployerInvitationDto r6 = new com.indeed.android.myjobs.data.model.dto.EmployerInvitationDto
                    r6.<init>(r0)
                    if (r3 == 0) goto L84
                L82:
                    r10 = r1
                    goto L8d
                L84:
                    xo6 r1 = r13.i()
                    an7 r1 = (defpackage.an7) r1
                    int r1 = r1.e
                    goto L82
                L8d:
                    r11 = 8
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    an7 r1 = defpackage.an7.a(r5, r6, r7, r8, r9, r10, r11)
                    gse r13 = r13.b
                    r13.getClass()
                    r13.m(r2, r1)
                    boolean r13 = r12.$calculateActionableSteps
                    if (r13 == 0) goto Lb7
                    boolean r13 = defpackage.i6a.q()
                    if (r13 == 0) goto Lb7
                    java.util.Collection r0 = (java.util.Collection) r0
                    boolean r13 = r0.isEmpty()
                    if (r13 != 0) goto Lb7
                    bn7 r12 = r12.this$0
                    bn7$a$c r13 = bn7.a.c.a
                    r12.n(r13)
                Lb7:
                    j6g r12 = defpackage.j6g.a
                    return r12
                Lba:
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r12)
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: en7.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(bn7 bn7Var, boolean z, boolean z2, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.this$0 = bn7Var;
            this.$shouldLog = z;
            this.$calculateActionableSteps = z2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.this$0, this.$shouldLog, this.$calculateActionableSteps, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(hf3<EmployerInvitationDto> hf3Var, lu2<? super j6g> lu2Var) {
            return ((a) create(hf3Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x00c4, code lost:
        
            if (defpackage.wg2.q((defpackage.vi5) r0, r1, r14) != r7) goto L39;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0086 A[PHI: r0
  0x0086: PHI (r0v9 com.indeed.android.myjobs.data.model.dto.EmployerInvitationDto) = 
  (r0v8 com.indeed.android.myjobs.data.model.dto.EmployerInvitationDto)
  (r0v21 com.indeed.android.myjobs.data.model.dto.EmployerInvitationDto)
 binds: [B:22:0x0083, B:12:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00af A[PHI: r0
  0x00af: PHI (r0v16 java.lang.Object) = (r0v13 java.lang.Object), (r0v24 java.lang.Object) binds: [B:28:0x00ac, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 265
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: en7.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en7(bn7 bn7Var, boolean z, boolean z2, lu2<? super en7> lu2Var) {
        super(2, lu2Var);
        this.this$0 = bn7Var;
        this.$shouldLog = z;
        this.$calculateActionableSteps = z2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new en7(this.this$0, this.$shouldLog, this.$calculateActionableSteps, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((en7) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        if (defpackage.wg2.q((defpackage.vi5) r13, r0, r12) == r4) goto L20;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.label
            r1 = 0
            r2 = 2
            r3 = 1
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L1b
            if (r0 != r2) goto L15
            defpackage.r7d.b(r13)     // Catch: java.lang.Exception -> L12
            goto Lb0
        L12:
            r0 = move-exception
            r13 = r0
            goto L75
        L15:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r12)
            return r1
        L1b:
            defpackage.r7d.b(r13)     // Catch: java.lang.Exception -> L12
            goto L5f
        L1f:
            defpackage.r7d.b(r13)
            bn7 r13 = r12.this$0     // Catch: java.lang.Exception -> L12
            r13.getClass()     // Catch: java.lang.Exception -> L12
            xo6 r0 = r13.i()     // Catch: java.lang.Exception -> L12
            an7 r0 = (defpackage.an7) r0     // Catch: java.lang.Exception -> L12
            xo6 r0 = r13.i()     // Catch: java.lang.Exception -> L12
            r5 = r0
            an7 r5 = (defpackage.an7) r5     // Catch: java.lang.Exception -> L12
            r10 = 0
            r11 = 25
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            an7 r0 = defpackage.an7.a(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L12
            gse r13 = r13.b     // Catch: java.lang.Exception -> L12
            r13.getClass()     // Catch: java.lang.Exception -> L12
            r13.m(r1, r0)     // Catch: java.lang.Exception -> L12
            bn7 r13 = r12.this$0     // Catch: java.lang.Exception -> L12
            c85 r13 = r13.f     // Catch: java.lang.Exception -> L12
            j6g r0 = defpackage.j6g.a     // Catch: java.lang.Exception -> L12
            r12.label = r3     // Catch: java.lang.Exception -> L12
            r13.getClass()     // Catch: java.lang.Exception -> L12
            b85 r0 = new b85     // Catch: java.lang.Exception -> L12
            r0.<init>(r13, r1)     // Catch: java.lang.Exception -> L12
            kjd r13 = new kjd     // Catch: java.lang.Exception -> L12
            r13.<init>(r0)     // Catch: java.lang.Exception -> L12
            if (r13 != r4) goto L5f
            goto L74
        L5f:
            vi5 r13 = (defpackage.vi5) r13     // Catch: java.lang.Exception -> L12
            en7$a r0 = new en7$a     // Catch: java.lang.Exception -> L12
            bn7 r3 = r12.this$0     // Catch: java.lang.Exception -> L12
            boolean r5 = r12.$shouldLog     // Catch: java.lang.Exception -> L12
            boolean r6 = r12.$calculateActionableSteps     // Catch: java.lang.Exception -> L12
            r0.<init>(r3, r5, r6, r1)     // Catch: java.lang.Exception -> L12
            r12.label = r2     // Catch: java.lang.Exception -> L12
            java.lang.Object r12 = defpackage.wg2.q(r13, r0, r12)     // Catch: java.lang.Exception -> L12
            if (r12 != r4) goto Lb0
        L74:
            return r4
        L75:
            bn7 r12 = r12.this$0
            r12.getClass()
            xo6 r0 = r12.i()
            an7 r0 = (defpackage.an7) r0
            xo6 r0 = r12.i()
            r2 = r0
            an7 r2 = (defpackage.an7) r2
            java.lang.String r0 = r13.getMessage()
            if (r0 != 0) goto L8f
            java.lang.String r0 = "Unknown error"
        L8f:
            com.indeed.android.myjobs.data.model.APIError r5 = new com.indeed.android.myjobs.data.model.APIError
            r9 = 0
            r5.<init>(r9, r0)
            r7 = 0
            r8 = 24
            r3 = 0
            r4 = 0
            r6 = 0
            an7 r0 = defpackage.an7.a(r2, r3, r4, r5, r6, r7, r8)
            gse r12 = r12.b
            r12.getClass()
            r12.m(r1, r0)
            java.util.ArrayList r12 = defpackage.lz2.a
            java.lang.String r12 = "InvitationTabViewModel"
            java.lang.String r0 = "Exception in loading invitations"
            defpackage.lz2.b(r12, r0, r9, r13)
        Lb0:
            j6g r12 = defpackage.j6g.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

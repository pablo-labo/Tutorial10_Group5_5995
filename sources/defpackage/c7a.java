package defpackage;

import defpackage.gka;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.MyJobsScreenKt$MyJobsScreen$11$3$1", f = "MyJobsScreen.kt", l = {}, m = "invokeSuspend")
public final class c7a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ hw9 $NonIABottomSheetModal;
    final /* synthetic */ gka $nonIaBottomSheetViewModel;
    private /* synthetic */ Object L$0;
    int label;

    @uh3(c = "com.indeed.android.myjobs.MyJobsScreenKt$MyJobsScreen$11$3$1$1", f = "MyJobsScreen.kt", l = {555}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ hw9 $NonIABottomSheetModal;
        final /* synthetic */ gka $nonIaBottomSheetViewModel;
        int label;

        /* JADX INFO: renamed from: c7a$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.myjobs.MyJobsScreenKt$MyJobsScreen$11$3$1$1$1", f = "MyJobsScreen.kt", l = {559, 560, 564}, m = "invokeSuspend")
        public static final class C0102a extends c1f implements Function2<gka.a, lu2<? super j6g>, Object> {
            final /* synthetic */ hw9 $NonIABottomSheetModal;
            final /* synthetic */ gka $nonIaBottomSheetViewModel;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0102a(gka gkaVar, hw9 hw9Var, lu2<? super C0102a> lu2Var) {
                super(2, lu2Var);
                this.$nonIaBottomSheetViewModel = gkaVar;
                this.$NonIABottomSheetModal = hw9Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                C0102a c0102a = new C0102a(this.$nonIaBottomSheetViewModel, this.$NonIABottomSheetModal, lu2Var);
                c0102a.L$0 = obj;
                return c0102a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(gka.a aVar, lu2<? super j6g> lu2Var) {
                return ((C0102a) create(aVar, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
            
                if (r0.d(r6) == r1) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
            
                if (r0.b(r6) == r1) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
            
                if (r7.b(r6) == r1) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
            
                return r1;
             */
            @Override // defpackage.x81
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = r6.L$0
                    gka$a r0 = (gka.a) r0
                    int r1 = r6.label
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r1 == 0) goto L1d
                    if (r1 == r4) goto L19
                    if (r1 == r3) goto L19
                    if (r1 != r2) goto L13
                    goto L19
                L13:
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r6)
                    return r5
                L19:
                    defpackage.r7d.b(r7)
                    goto L63
                L1d:
                    defpackage.r7d.b(r7)
                    boolean r7 = r0 instanceof gka.a.c
                    g13 r1 = defpackage.g13.a
                    if (r7 == 0) goto L52
                    gka r7 = r6.$nonIaBottomSheetViewModel
                    gse r7 = r7.c
                    java.lang.Object r7 = r7.getValue()
                    fka r7 = (defpackage.fka) r7
                    java.util.List<com.indeed.android.myjobs.data.model.dto.SavedJobsDto> r7 = r7.a
                    java.util.Collection r7 = (java.util.Collection) r7
                    boolean r7 = r7.isEmpty()
                    hw9 r0 = r6.$NonIABottomSheetModal
                    if (r7 != 0) goto L47
                    r6.L$0 = r5
                    r6.label = r4
                    java.lang.Object r6 = r0.d(r6)
                    if (r6 != r1) goto L63
                    goto L62
                L47:
                    r6.L$0 = r5
                    r6.label = r3
                    java.lang.Object r6 = r0.b(r6)
                    if (r6 != r1) goto L63
                    goto L62
                L52:
                    boolean r7 = r0 instanceof gka.a.C0250a
                    if (r7 == 0) goto L63
                    hw9 r7 = r6.$NonIABottomSheetModal
                    r6.L$0 = r5
                    r6.label = r2
                    java.lang.Object r6 = r7.b(r6)
                    if (r6 != r1) goto L63
                L62:
                    return r1
                L63:
                    j6g r6 = defpackage.j6g.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: c7a.a.C0102a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gka gkaVar, hw9 hw9Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$nonIaBottomSheetViewModel = gkaVar;
            this.$NonIABottomSheetModal = hw9Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$nonIaBottomSheetViewModel, this.$NonIABottomSheetModal, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                gka gkaVar = this.$nonIaBottomSheetViewModel;
                pqc pqcVar = gkaVar.e;
                C0102a c0102a = new C0102a(gkaVar, this.$NonIABottomSheetModal, null);
                this.label = 1;
                Object objQ = wg2.q(pqcVar, c0102a, this);
                g13 g13Var = g13.a;
                if (objQ == g13Var) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7a(gka gkaVar, hw9 hw9Var, lu2<? super c7a> lu2Var) {
        super(2, lu2Var);
        this.$nonIaBottomSheetViewModel = gkaVar;
        this.$NonIABottomSheetModal = hw9Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        c7a c7aVar = new c7a(this.$nonIaBottomSheetViewModel, this.$NonIABottomSheetModal, lu2Var);
        c7aVar.L$0 = obj;
        return c7aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((c7a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        e13 e13Var = (e13) this.L$0;
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        u63.Y(e13Var, null, null, new a(this.$nonIaBottomSheetViewModel, this.$NonIABottomSheetModal, null), 3);
        return j6g.a;
    }
}

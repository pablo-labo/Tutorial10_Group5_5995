package defpackage;

import android.content.Context;
import defpackage.ude;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.MyJobsScreenKt$MyJobsScreen$11$2$1", f = "MyJobsScreen.kt", l = {}, m = "invokeSuspend")
public final class b7a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ fr0 $appliedTabViewModel;
    final /* synthetic */ Context $context;
    final /* synthetic */ hw9 $infosheetState;
    final /* synthetic */ boolean $isMADSEnabled;
    final /* synthetic */ ude $sharedViewModel;
    final /* synthetic */ hw9 $sheetState;
    final /* synthetic */ hw9 $showEmployerUnlikeyStatusSheet;
    final /* synthetic */ hw9 $withDrawBottomSheetState;
    private /* synthetic */ Object L$0;
    int label;

    @uh3(c = "com.indeed.android.myjobs.MyJobsScreenKt$MyJobsScreen$11$2$1$1", f = "MyJobsScreen.kt", l = {496}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ fr0 $appliedTabViewModel;
        final /* synthetic */ Context $context;
        final /* synthetic */ hw9 $infosheetState;
        final /* synthetic */ boolean $isMADSEnabled;
        final /* synthetic */ ude $sharedViewModel;
        final /* synthetic */ hw9 $sheetState;
        final /* synthetic */ hw9 $showEmployerUnlikeyStatusSheet;
        final /* synthetic */ hw9 $withDrawBottomSheetState;
        int label;

        /* JADX INFO: renamed from: b7a$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.myjobs.MyJobsScreenKt$MyJobsScreen$11$2$1$1$1", f = "MyJobsScreen.kt", l = {515, 519, 520, 521, 525, 529, 530, 531, 544}, m = "invokeSuspend")
        public static final class C0087a extends c1f implements Function2<ude.c, lu2<? super j6g>, Object> {
            final /* synthetic */ fr0 $appliedTabViewModel;
            final /* synthetic */ Context $context;
            final /* synthetic */ hw9 $infosheetState;
            final /* synthetic */ boolean $isMADSEnabled;
            final /* synthetic */ ude $sharedViewModel;
            final /* synthetic */ hw9 $sheetState;
            final /* synthetic */ hw9 $showEmployerUnlikeyStatusSheet;
            final /* synthetic */ hw9 $withDrawBottomSheetState;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0087a(fr0 fr0Var, lu2 lu2Var, hw9 hw9Var, hw9 hw9Var2, hw9 hw9Var3, hw9 hw9Var4, ude udeVar, Context context, boolean z) {
                super(2, lu2Var);
                this.$isMADSEnabled = z;
                this.$sharedViewModel = udeVar;
                this.$context = context;
                this.$sheetState = hw9Var;
                this.$withDrawBottomSheetState = hw9Var2;
                this.$infosheetState = hw9Var3;
                this.$appliedTabViewModel = fr0Var;
                this.$showEmployerUnlikeyStatusSheet = hw9Var4;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                boolean z = this.$isMADSEnabled;
                ude udeVar = this.$sharedViewModel;
                Context context = this.$context;
                C0087a c0087a = new C0087a(this.$appliedTabViewModel, lu2Var, this.$sheetState, this.$withDrawBottomSheetState, this.$infosheetState, this.$showEmployerUnlikeyStatusSheet, udeVar, context, z);
                c0087a.L$0 = obj;
                return c0087a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ude.c cVar, lu2<? super j6g> lu2Var) {
                return ((C0087a) create(cVar, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:
            
                if (r5.b(r4) != r3) goto L69;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00ba, code lost:
            
                if (r5.d(r4) == r3) goto L68;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x00e9, code lost:
            
                if (r5.d(r4) != r3) goto L69;
             */
            /* JADX WARN: Code restructure failed: missing block: B:64:0x0111, code lost:
            
                if (r5.d(r4) == r3) goto L68;
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x011f, code lost:
            
                if (r5.d(r4) == r3) goto L68;
             */
            /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x00dd  */
            @Override // defpackage.x81
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    Method dump skipped, instruction units count: 318
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: b7a.a.C0087a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fr0 fr0Var, lu2 lu2Var, hw9 hw9Var, hw9 hw9Var2, hw9 hw9Var3, hw9 hw9Var4, ude udeVar, Context context, boolean z) {
            super(2, lu2Var);
            this.$sharedViewModel = udeVar;
            this.$isMADSEnabled = z;
            this.$context = context;
            this.$sheetState = hw9Var;
            this.$withDrawBottomSheetState = hw9Var2;
            this.$infosheetState = hw9Var3;
            this.$appliedTabViewModel = fr0Var;
            this.$showEmployerUnlikeyStatusSheet = hw9Var4;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            ude udeVar = this.$sharedViewModel;
            boolean z = this.$isMADSEnabled;
            Context context = this.$context;
            return new a(this.$appliedTabViewModel, lu2Var, this.$sheetState, this.$withDrawBottomSheetState, this.$infosheetState, this.$showEmployerUnlikeyStatusSheet, udeVar, context, z);
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
                ude udeVar = this.$sharedViewModel;
                pqc pqcVar = udeVar.e;
                boolean z = this.$isMADSEnabled;
                Context context = this.$context;
                C0087a c0087a = new C0087a(this.$appliedTabViewModel, null, this.$sheetState, this.$withDrawBottomSheetState, this.$infosheetState, this.$showEmployerUnlikeyStatusSheet, udeVar, context, z);
                this.label = 1;
                Object objQ = wg2.q(pqcVar, c0087a, this);
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
    public b7a(fr0 fr0Var, lu2 lu2Var, hw9 hw9Var, hw9 hw9Var2, hw9 hw9Var3, hw9 hw9Var4, ude udeVar, Context context, boolean z) {
        super(2, lu2Var);
        this.$sharedViewModel = udeVar;
        this.$isMADSEnabled = z;
        this.$context = context;
        this.$sheetState = hw9Var;
        this.$withDrawBottomSheetState = hw9Var2;
        this.$infosheetState = hw9Var3;
        this.$appliedTabViewModel = fr0Var;
        this.$showEmployerUnlikeyStatusSheet = hw9Var4;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        ude udeVar = this.$sharedViewModel;
        boolean z = this.$isMADSEnabled;
        Context context = this.$context;
        b7a b7aVar = new b7a(this.$appliedTabViewModel, lu2Var, this.$sheetState, this.$withDrawBottomSheetState, this.$infosheetState, this.$showEmployerUnlikeyStatusSheet, udeVar, context, z);
        b7aVar.L$0 = obj;
        return b7aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((b7a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        e13 e13Var = (e13) this.L$0;
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        ude udeVar = this.$sharedViewModel;
        boolean z = this.$isMADSEnabled;
        Context context = this.$context;
        u63.Y(e13Var, null, null, new a(this.$appliedTabViewModel, null, this.$sheetState, this.$withDrawBottomSheetState, this.$infosheetState, this.$showEmployerUnlikeyStatusSheet, udeVar, context, z), 3);
        return j6g.a;
    }
}

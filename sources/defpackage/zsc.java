package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {1159}, m = "invokeSuspend")
public final class zsc extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ wu5<e13, ky9, lu2<? super j6g>, Object> $block;
    final /* synthetic */ ky9 $parentFrameClock;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ xsc this$0;

    @uh3(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", l = {1159}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ wu5<e13, ky9, lu2<? super j6g>, Object> $block;
        final /* synthetic */ ky9 $parentFrameClock;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(wu5<? super e13, ? super ky9, ? super lu2<? super j6g>, ? extends Object> wu5Var, ky9 ky9Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$block = wu5Var;
            this.$parentFrameClock = ky9Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$block, this.$parentFrameClock, lu2Var);
            aVar.L$0 = obj;
            return aVar;
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
                e13 e13Var = (e13) this.L$0;
                wu5<e13, ky9, lu2<? super j6g>, Object> wu5Var = this.$block;
                ky9 ky9Var = this.$parentFrameClock;
                this.label = 1;
                Object objQ = wu5Var.q(e13Var, ky9Var, this);
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
    /* JADX WARN: Multi-variable type inference failed */
    public zsc(xsc xscVar, wu5<? super e13, ? super ky9, ? super lu2<? super j6g>, ? extends Object> wu5Var, ky9 ky9Var, lu2<? super zsc> lu2Var) {
        super(2, lu2Var);
        this.this$0 = xscVar;
        this.$block = wu5Var;
        this.$parentFrameClock = ky9Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        zsc zscVar = new zsc(this.this$0, this.$block, this.$parentFrameClock, lu2Var);
        zscVar.L$0 = obj;
        return zscVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((zsc) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zsc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

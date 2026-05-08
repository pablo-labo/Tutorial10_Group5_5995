package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.components.other.BrandedAdInfoSheetKt$BrandedAdInfoSheet$1$1", f = "BrandedAdInfoSheet.kt", l = {}, m = "invokeSuspend")
public final class zl1 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ e13 $coroutineScope;
    final /* synthetic */ boolean $isVisible;
    final /* synthetic */ hw9 $sheetState;
    int label;

    @uh3(c = "com.indeed.android.myjobs.presentation.components.other.BrandedAdInfoSheetKt$BrandedAdInfoSheet$1$1$1", f = "BrandedAdInfoSheet.kt", l = {66}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ hw9 $sheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(hw9 hw9Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$sheetState = hw9Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$sheetState, lu2Var);
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
                hw9 hw9Var = this.$sheetState;
                this.label = 1;
                Object objD = hw9Var.d(this);
                g13 g13Var = g13.a;
                if (objD == g13Var) {
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

    @uh3(c = "com.indeed.android.myjobs.presentation.components.other.BrandedAdInfoSheetKt$BrandedAdInfoSheet$1$1$2", f = "BrandedAdInfoSheet.kt", l = {68}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ hw9 $sheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(hw9 hw9Var, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$sheetState = hw9Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$sheetState, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                hw9 hw9Var = this.$sheetState;
                this.label = 1;
                Object objB = hw9Var.b(this);
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
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl1(boolean z, e13 e13Var, hw9 hw9Var, lu2<? super zl1> lu2Var) {
        super(2, lu2Var);
        this.$isVisible = z;
        this.$coroutineScope = e13Var;
        this.$sheetState = hw9Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new zl1(this.$isVisible, this.$coroutineScope, this.$sheetState, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((zl1) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        boolean z = this.$isVisible;
        e13 e13Var = this.$coroutineScope;
        hw9 hw9Var = this.$sheetState;
        if (z) {
            u63.Y(e13Var, null, null, new a(hw9Var, null), 3);
        } else {
            u63.Y(e13Var, null, null, new b(hw9Var, null), 3);
        }
        return j6g.a;
    }
}

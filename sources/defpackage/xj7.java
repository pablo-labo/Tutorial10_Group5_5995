package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class xj7 {

    @uh3(c = "com.indeed.android.myjobs.presentation.components.other.InterviewNowButtonKt$InterviewNowButton$1$1", f = "InterviewNowButton.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ c88 $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c88 c88Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$state = c88Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$state, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            Function1<lx5, j6g> function1 = c05.a;
            c05.a.invoke(tx5.e(c05.b, "interviewNowContent", "myjobs_native_screen", this.$state.D.c, 4));
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.components.other.InterviewNowButtonKt$InterviewNowButton$2$2$1$1", f = "InterviewNowButton.kt", l = {}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ mhg $localUriHandler;
        final /* synthetic */ c88 $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mhg mhgVar, c88 c88Var, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$localUriHandler = mhgVar;
            this.$state = c88Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$localUriHandler, this.$state, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            this.$localUriHandler.a(this.$state.D.b);
            Function1<lx5, j6g> function1 = c05.a;
            c05.a.invoke(tx5.k(c05.b, "myjobs_native_screen", "interviewNowButton", this.$state.D.c, 4));
            return j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.c88 r38, androidx.compose.runtime.b r39, int r40) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xj7.a(c88, androidx.compose.runtime.b, int):void");
    }
}

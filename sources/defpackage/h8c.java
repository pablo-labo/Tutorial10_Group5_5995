package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class h8c {

    @uh3(c = "com.indeed.android.push.PushPrimerBottomSheetKt$PushPrimerBottomSheet$2$1$1$1$1$1$1", f = "PushPrimerBottomSheet.kt", l = {116}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ hee $bottomSheetState;
        final /* synthetic */ Function1<String, j6g> $onSkipNotificationButtonClicked;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(hee heeVar, Function1<? super String, j6g> function1, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$bottomSheetState = heeVar;
            this.$onSkipNotificationButtonClicked = function1;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$bottomSheetState, this.$onSkipNotificationButtonClicked, lu2Var);
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
                hee heeVar = this.$bottomSheetState;
                this.label = 1;
                Object objB = heeVar.b(this);
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
            this.$onSkipNotificationButtonClicked.invoke("CloseButton");
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.push.PushPrimerBottomSheetKt$PushPrimerBottomSheet$2$1$2$1$1", f = "PushPrimerBottomSheet.kt", l = {176}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ hee $bottomSheetState;
        final /* synthetic */ Function1<String, j6g> $onSkipNotificationButtonClicked;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(hee heeVar, Function1<? super String, j6g> function1, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$bottomSheetState = heeVar;
            this.$onSkipNotificationButtonClicked = function1;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$bottomSheetState, this.$onSkipNotificationButtonClicked, lu2Var);
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
                hee heeVar = this.$bottomSheetState;
                this.label = 1;
                Object objB = heeVar.b(this);
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
            this.$onSkipNotificationButtonClicked.invoke("CloseButton");
            return j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final defpackage.gu5<defpackage.j6g> r21, final kotlin.jvm.functions.Function1<? super java.lang.String, defpackage.j6g> r22, defpackage.s8c r23, final defpackage.r8c r24, java.lang.String r25, java.lang.String r26, androidx.compose.runtime.b r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h8c.a(gu5, kotlin.jvm.functions.Function1, s8c, r8c, java.lang.String, java.lang.String, androidx.compose.runtime.b, int, int):void");
    }
}

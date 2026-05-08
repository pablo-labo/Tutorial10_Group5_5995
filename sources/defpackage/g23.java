package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class g23 {

    @uh3(c = "com.indeed.android.profile.components.CountryCodeSelectorSheetKt$CountryCodeSelectorSheet$1$1", f = "CountryCodeSelectorSheet.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ sm5 $focusRequester;
        final /* synthetic */ hne $keyboardController;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(hne hneVar, sm5 sm5Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$keyboardController = hneVar;
            this.$focusRequester = sm5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$keyboardController, this.$focusRequester, lu2Var);
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
            hne hneVar = this.$keyboardController;
            if (hneVar != null) {
                hneVar.c();
            }
            sm5.b(this.$focusRequester);
            return j6g.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0352  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(kotlin.jvm.functions.Function1<? super defpackage.z13, defpackage.j6g> r47, defpackage.z13 r48, defpackage.gu5<defpackage.j6g> r49, androidx.compose.runtime.b r50, int r51) {
        /*
            Method dump skipped, instruction units count: 1284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g23.a(kotlin.jvm.functions.Function1, z13, gu5, androidx.compose.runtime.b, int):void");
    }
}

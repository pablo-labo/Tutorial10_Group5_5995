package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class w7g {

    @uh3(c = "com.indeed.android.profile.screens.sheets.profilesubtab.additionalinformation.UpdateAdditionalInformationSheetKt$UpdateAdditionalInformationSheet$1$1", f = "UpdateAdditionalInformationSheet.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ sm5 $focusRequester;
        final /* synthetic */ String $screenName;
        final /* synthetic */ g4a<jhf> $textInput$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, sm5 sm5Var, g4a<jhf> g4aVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$screenName = str;
            this.$focusRequester = sm5Var;
            this.$textInput$delegate = g4aVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$screenName, this.$focusRequester, this.$textInput$delegate, lu2Var);
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
            dg3.g(dg3.b(rxb.a, this.$screenName, null, null, 12));
            sm5.b(this.$focusRequester);
            int length = this.$textInput$delegate.getValue().a.b.length();
            g4a<jhf> g4aVar = this.$textInput$delegate;
            g4aVar.setValue(jhf.a(g4aVar.getValue(), null, cr8.c(length, length), 5));
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.screens.sheets.profilesubtab.additionalinformation.UpdateAdditionalInformationSheetKt$UpdateAdditionalInformationSheet$5$1$3$1", f = "UpdateAdditionalInformationSheet.kt", l = {}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ sm5 $focusRequester;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(sm5 sm5Var, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$focusRequester = sm5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$focusRequester, lu2Var);
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
            sm5.b(this.$focusRequester);
            return j6g.a;
        }
    }

    public static final class c implements l74 {
        public final /* synthetic */ String a;

        public c(String str) {
            this.a = str;
        }

        @Override // defpackage.l74
        public final void dispose() {
            dg3.i(dg3.b(rxb.a, this.a, null, null, 12));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final boolean r28, final defpackage.gu5<defpackage.j6g> r29, final kotlin.jvm.functions.Function1<? super java.lang.String, defpackage.j6g> r30, final java.lang.String r31, final defpackage.b5g r32, androidx.compose.runtime.b r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w7g.a(boolean, gu5, kotlin.jvm.functions.Function1, java.lang.String, b5g, androidx.compose.runtime.b, int):void");
    }
}

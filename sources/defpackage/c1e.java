package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationScreenKt$InternalSelectedConversationScreen$8$1", f = "SelectedConversationScreen.kt", l = {}, m = "invokeSuspend")
public final class c1e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ hee $bottomSheetState;
    final /* synthetic */ e13 $scope;
    final /* synthetic */ x1e $uiState;
    int label;

    @uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationScreenKt$InternalSelectedConversationScreen$8$1$1", f = "SelectedConversationScreen.kt", l = {236, 238}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ hee $bottomSheetState;
        final /* synthetic */ x1e $uiState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x1e x1eVar, hee heeVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$uiState = x1eVar;
            this.$bottomSheetState = heeVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$uiState, this.$bottomSheetState, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        
            if (r0.e(r4) == r3) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        
            if (r0.b(r4) == r3) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
        
            return r3;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                int r0 = r4.label
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L16
                if (r0 == r2) goto L12
                if (r0 != r1) goto Lb
                goto L12
            Lb:
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r4)
                r4 = 0
                return r4
            L12:
                defpackage.r7d.b(r5)
                goto L35
            L16:
                defpackage.r7d.b(r5)
                x1e r5 = r4.$uiState
                boolean r5 = r5.h
                hee r0 = r4.$bottomSheetState
                g13 r3 = defpackage.g13.a
                if (r5 == 0) goto L2c
                r4.label = r2
                java.lang.Object r4 = r0.e(r4)
                if (r4 != r3) goto L35
                goto L34
            L2c:
                r4.label = r1
                java.lang.Object r4 = r0.b(r4)
                if (r4 != r3) goto L35
            L34:
                return r3
            L35:
                j6g r4 = defpackage.j6g.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: c1e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1e(e13 e13Var, x1e x1eVar, hee heeVar, lu2<? super c1e> lu2Var) {
        super(2, lu2Var);
        this.$scope = e13Var;
        this.$uiState = x1eVar;
        this.$bottomSheetState = heeVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new c1e(this.$scope, this.$uiState, this.$bottomSheetState, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((c1e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        u63.Y(this.$scope, null, null, new a(this.$uiState, this.$bottomSheetState, null), 3);
        return j6g.a;
    }
}

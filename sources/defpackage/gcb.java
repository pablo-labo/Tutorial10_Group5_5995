package defpackage;

import android.view.textclassifier.TextClassifier;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2", f = "PlatformSelectionBehaviors.android.kt", l = {351, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 265}, m = "invokeSuspend")
public final class gcb extends c1f implements Function2<e13, lu2<Object>, Object> {
    final /* synthetic */ Function2<TextClassifier, lu2<Object>, Object> $block;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ icb this$0;

    @uh3(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1", f = "PlatformSelectionBehaviors.android.kt", l = {266}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<Object>, Object> {
        final /* synthetic */ Function2<TextClassifier, lu2<Object>, Object> $block;
        final /* synthetic */ TextClassifier $textClassificationSession;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(TextClassifier textClassifier, Function2<? super TextClassifier, ? super lu2<Object>, ? extends Object> function2, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$textClassificationSession = textClassifier;
            this.$block = function2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$textClassificationSession, this.$block, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<Object> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    r7d.b(obj);
                    return obj;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            TextClassifier textClassifier = this.$textClassificationSession;
            if (textClassifier == null) {
                return null;
            }
            Function2<TextClassifier, lu2<Object>, Object> function2 = this.$block;
            this.label = 1;
            Object objInvoke = function2.invoke(textClassifier, this);
            g13 g13Var = g13.a;
            return objInvoke == g13Var ? g13Var : objInvoke;
        }
    }

    @uh3(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1", f = "PlatformSelectionBehaviors.android.kt", l = {}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super TextClassifier>, Object> {
        int label;
        final /* synthetic */ icb this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(icb icbVar, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.this$0 = icbVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.this$0, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super TextClassifier> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            icb icbVar = this.this$0;
            TextClassifier textClassifierA = ucf.a(icbVar.b, icbVar.c);
            this.this$0.f = textClassifierA;
            return textClassifierA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gcb(icb icbVar, Function2<? super TextClassifier, ? super lu2<Object>, ? extends Object> function2, lu2<? super gcb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = icbVar;
        this.$block = function2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new gcb(this.this$0, this.$block, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<Object> lu2Var) {
        return ((gcb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0088 A[RETURN] */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            int r0 = r9.label
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            g13 r5 = defpackage.g13.a
            if (r0 == 0) goto L32
            if (r0 == r3) goto L25
            if (r0 == r2) goto L1a
            if (r0 != r1) goto L14
            defpackage.r7d.b(r10)
            return r10
        L14:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r9)
            return r4
        L1a:
            java.lang.Object r0 = r9.L$0
            z4a r0 = (defpackage.z4a) r0
            defpackage.r7d.b(r10)     // Catch: java.lang.Throwable -> L22
            goto L6b
        L22:
            r9 = move-exception
            goto L89
        L25:
            java.lang.Object r0 = r9.L$1
            icb r0 = (defpackage.icb) r0
            java.lang.Object r3 = r9.L$0
            z4a r3 = (defpackage.z4a) r3
            defpackage.r7d.b(r10)
            r10 = r3
            goto L46
        L32:
            defpackage.r7d.b(r10)
            icb r0 = r9.this$0
            a5a r10 = r0.e
            r9.L$0 = r10
            r9.L$1 = r0
            r9.label = r3
            java.lang.Object r3 = r10.h(r9)
            if (r3 != r5) goto L46
            goto L87
        L46:
            android.view.textclassifier.TextClassifier r3 = r0.f     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto L54
            boolean r6 = r3.isDestroyed()     // Catch: java.lang.Throwable -> L51
            if (r6 == 0) goto L6f
            goto L54
        L51:
            r9 = move-exception
            r0 = r10
            goto L89
        L54:
            gcb$b r3 = new gcb$b     // Catch: java.lang.Throwable -> L51
            r3.<init>(r0, r4)     // Catch: java.lang.Throwable -> L51
            r9.L$0 = r10     // Catch: java.lang.Throwable -> L51
            r9.L$1 = r4     // Catch: java.lang.Throwable -> L51
            r9.label = r2     // Catch: java.lang.Throwable -> L51
            r6 = 300(0x12c, double:1.48E-321)
            java.lang.Object r0 = defpackage.ewa.P(r6, r3, r9)     // Catch: java.lang.Throwable -> L51
            if (r0 != r5) goto L68
            goto L87
        L68:
            r8 = r0
            r0 = r10
            r10 = r8
        L6b:
            r3 = r10
            android.view.textclassifier.TextClassifier r3 = (android.view.textclassifier.TextClassifier) r3     // Catch: java.lang.Throwable -> L22
            r10 = r0
        L6f:
            r10.p(r4)
            gcb$a r10 = new gcb$a
            kotlin.jvm.functions.Function2<android.view.textclassifier.TextClassifier, lu2<java.lang.Object>, java.lang.Object> r0 = r9.$block
            r10.<init>(r3, r0, r4)
            r9.L$0 = r4
            r9.L$1 = r4
            r9.label = r1
            r0 = 200(0xc8, double:9.9E-322)
            java.lang.Object r9 = defpackage.ewa.P(r0, r10, r9)
            if (r9 != r5) goto L88
        L87:
            return r5
        L88:
            return r9
        L89:
            r0.p(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gcb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

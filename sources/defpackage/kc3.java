package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60}, m = "invokeSuspend")
public final class kc3 extends c1f implements Function2<drf, lu2<Object>, Object> {
    final /* synthetic */ Function1 $block$inlined;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ boolean $isReadOnly;
    final /* synthetic */ xed $this_internalPerform;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    @uh3(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<crf<Object>, lu2<Object>, Object> {
        final /* synthetic */ Function1 $block$inlined;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, lu2 lu2Var) {
            super(2, lu2Var);
            this.$block$inlined = function1;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$block$inlined, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(crf<Object> crfVar, lu2<Object> lu2Var) {
            return ((a) create(crfVar, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            crf crfVar = (crf) this.L$0;
            crfVar.getClass();
            return this.$block$inlined.invoke(((tic) crfVar).d());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc3(lu2 lu2Var, xed xedVar, Function1 function1, boolean z, boolean z2) {
        super(2, lu2Var);
        this.$inTransaction = z;
        this.$isReadOnly = z2;
        this.$this_internalPerform = xedVar;
        this.$block$inlined = function1;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        kc3 kc3Var = new kc3(lu2Var, this.$this_internalPerform, this.$block$inlined, this.$inTransaction, this.$isReadOnly);
        kc3Var.L$0 = obj;
        return kc3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drf drfVar, lu2<Object> lu2Var) {
        return ((kc3) create(drfVar, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009e A[PHI: r0 r10
  0x009e: PHI (r0v11 drf) = (r0v8 drf), (r0v20 drf) binds: [B:35:0x009b, B:11:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x009e: PHI (r10v14 java.lang.Object) = (r10v13 java.lang.Object), (r10v0 java.lang.Object) binds: [B:35:0x009b, B:11:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8 A[RETURN] */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kc3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

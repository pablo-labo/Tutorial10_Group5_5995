package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2", f = "DBUtil.android.kt", l = {243}, m = "invokeSuspend")
public final class gc3 extends c1f implements Function1<lu2<Object>, Object> {
    final /* synthetic */ Function1<lu2<Object>, Object> $block;
    final /* synthetic */ xed $db;
    int label;

    @uh3(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60, 67}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<drf, lu2<Object>, Object> {
        final /* synthetic */ Function1 $block$inlined;
        final /* synthetic */ boolean $inTransaction;
        final /* synthetic */ boolean $isReadOnly;
        final /* synthetic */ xed $this_internalPerform;
        /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: gc3$a$a, reason: collision with other inner class name */
        @uh3(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {60}, m = "invokeSuspend")
        public static final class C0247a extends c1f implements Function2<crf<Object>, lu2<Object>, Object> {
            final /* synthetic */ Function1 $block$inlined;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0247a(Function1 function1, lu2 lu2Var) {
                super(2, lu2Var);
                this.$block$inlined = function1;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                C0247a c0247a = new C0247a(this.$block$inlined, lu2Var);
                c0247a.L$0 = obj;
                return c0247a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(crf<Object> crfVar, lu2<Object> lu2Var) {
                return ((C0247a) create(crfVar, lu2Var)).invokeSuspend(j6g.a);
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
                Function1 function1 = this.$block$inlined;
                this.label = 1;
                Object objInvoke = function1.invoke(this);
                g13 g13Var = g13.a;
                return objInvoke == g13Var ? g13Var : objInvoke;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lu2 lu2Var, xed xedVar, Function1 function1, boolean z, boolean z2) {
            super(2, lu2Var);
            this.$inTransaction = z;
            this.$isReadOnly = z2;
            this.$this_internalPerform = xedVar;
            this.$block$inlined = function1;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(lu2Var, this.$this_internalPerform, this.$block$inlined, this.$inTransaction, this.$isReadOnly);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(drf drfVar, lu2<Object> lu2Var) {
            return ((a) create(drfVar, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
        
            if (r10.b(r9) == r7) goto L51;
         */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00a4 A[PHI: r0 r10
  0x00a4: PHI (r0v10 drf) = (r0v7 drf), (r0v19 drf) binds: [B:36:0x00a1, B:14:0x0027] A[DONT_GENERATE, DONT_INLINE]
  0x00a4: PHI (r10v13 java.lang.Object) = (r10v12 java.lang.Object), (r10v0 java.lang.Object) binds: [B:36:0x00a1, B:14:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00ce A[RETURN] */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 219
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: gc3.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gc3(xed xedVar, Function1<? super lu2<Object>, ? extends Object> function1, lu2<? super gc3> lu2Var) {
        super(1, lu2Var);
        this.$db = xedVar;
        this.$block = function1;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new gc3(this.$db, this.$block, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<Object> lu2Var) {
        return ((gc3) create(lu2Var)).invokeSuspend(j6g.a);
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
        xed xedVar = this.$db;
        a aVar = new a(null, xedVar, this.$block, true, false);
        this.label = 1;
        Object objX = xedVar.x(false, aVar, this);
        g13 g13Var = g13.a;
        return objX == g13Var ? g13Var : objX;
    }
}

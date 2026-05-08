package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class pk5 implements vi5<Object> {
    public final /* synthetic */ vi5 a;
    public final /* synthetic */ Function2 b;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ wi5 a;
        public final /* synthetic */ Function2 b;

        /* JADX INFO: renamed from: pk5$a$a, reason: collision with other inner class name */
        @uh3(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {50, 51}, m = "emit")
        public static final class C0384a extends pu2 {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public C0384a(lu2 lu2Var) {
                super(lu2Var);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(wi5 wi5Var, Function2 function2) {
            this.a = wi5Var;
            this.b = function2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
        
            if (r6.a(r7, r0) == r5) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // defpackage.wi5
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(T r7, defpackage.lu2<? super defpackage.j6g> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof pk5.a.C0384a
                if (r0 == 0) goto L13
                r0 = r8
                pk5$a$a r0 = (pk5.a.C0384a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                pk5$a$a r0 = new pk5$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.result
                int r1 = r0.label
                r2 = 0
                r3 = 2
                r4 = 1
                g13 r5 = defpackage.g13.a
                if (r1 == 0) goto L3b
                if (r1 == r4) goto L31
                if (r1 != r3) goto L2b
                defpackage.r7d.b(r8)
                goto L5d
            L2b:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r6)
                return r2
            L31:
                java.lang.Object r6 = r0.L$1
                wi5 r6 = (defpackage.wi5) r6
                java.lang.Object r7 = r0.L$0
                defpackage.r7d.b(r8)
                goto L50
            L3b:
                defpackage.r7d.b(r8)
                r0.L$0 = r7
                wi5 r8 = r6.a
                r0.L$1 = r8
                r0.label = r4
                kotlin.jvm.functions.Function2 r6 = r6.b
                java.lang.Object r6 = r6.invoke(r7, r0)
                if (r6 != r5) goto L4f
                goto L5c
            L4f:
                r6 = r8
            L50:
                r0.L$0 = r2
                r0.L$1 = r2
                r0.label = r3
                java.lang.Object r6 = r6.a(r7, r0)
                if (r6 != r5) goto L5d
            L5c:
                return r5
            L5d:
                j6g r6 = defpackage.j6g.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: pk5.a.a(java.lang.Object, lu2):java.lang.Object");
        }
    }

    public pk5(vi5 vi5Var, Function2 function2) {
        this.a = vi5Var;
        this.b = function2;
    }

    @Override // defpackage.vi5
    public final Object e(wi5<? super Object> wi5Var, lu2 lu2Var) {
        Object objE = this.a.e(new a(wi5Var, this.b), lu2Var);
        return objE == g13.a ? objE : j6g.a;
    }
}

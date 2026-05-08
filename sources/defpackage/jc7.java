package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class jc7 {
    public final j4a<a<?, ?>> a = new j4a<>(new a[16]);
    public final g4a b = r.f(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final g4a d = r.f(Boolean.TRUE);

    public final class a<T, V extends ge0> implements ese<T> {
        public boolean V;
        public boolean W;
        public long X;
        public Number a;
        public Number b;
        public final mvf c;
        public final g4a d;
        public yd0<T> e;
        public aaf<T, V> f;

        public a(Number number, Number number2, mvf mvfVar, ic7 ic7Var) {
            this.a = number;
            this.b = number2;
            this.c = mvfVar;
            this.d = r.f(number);
            this.e = ic7Var;
            this.f = new aaf<>(ic7Var, mvfVar, this.a, this.b, null);
        }

        @Override // defpackage.ese
        public final T getValue() {
            return (T) ((gme) this.d).getValue();
        }
    }

    @uh3(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", f = "InfiniteTransition.kt", l = {172, 193}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ g4a<ese<Long>> $toolingOverride;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ jc7 this$0;

        @uh3(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", f = "InfiniteTransition.kt", l = {}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<Float, lu2<? super Boolean>, Object> {
            /* synthetic */ float F$0;
            int label;

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                a aVar = new a(2, lu2Var);
                aVar.F$0 = ((Number) obj).floatValue();
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Float f, lu2<? super Boolean> lu2Var) {
                return ((a) create(Float.valueOf(f.floatValue()), lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    r7d.b(obj);
                    return Boolean.valueOf(this.F$0 > 0.0f);
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g4a<ese<Long>> g4aVar, jc7 jc7Var, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$toolingOverride = g4aVar;
            this.this$0 = jc7Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            b bVar = new b(this.$toolingOverride, this.this$0, lu2Var);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            return g13.a;
        }

        /* JADX WARN: Path cross not found for [B:11:0x003d, B:16:0x005a], limit reached: 18 */
        /* JADX WARN: Path cross not found for [B:16:0x005a, B:11:0x003d], limit reached: 18 */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[PHI: r0 r9
  0x0053: PHI (r0v2 iuc) = (r0v3 iuc), (r0v5 iuc) binds: [B:12:0x0050, B:9:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0053: PHI (r9v3 e13) = (r9v4 e13), (r9v5 e13) binds: [B:12:0x0050, B:9:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0058 -> B:11:0x003d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0074 -> B:11:0x003d). Please report as a decompilation issue!!! */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                int r0 = r8.label
                r1 = 0
                r2 = 1
                r3 = 2
                g13 r4 = defpackage.g13.a
                if (r0 == 0) goto L2d
                if (r0 == r2) goto L20
                if (r0 != r3) goto L1a
                java.lang.Object r0 = r8.L$1
                iuc r0 = (defpackage.iuc) r0
                java.lang.Object r5 = r8.L$0
                e13 r5 = (defpackage.e13) r5
                defpackage.r7d.b(r9)
                r9 = r5
                goto L3d
            L1a:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r8)
                return r1
            L20:
                java.lang.Object r0 = r8.L$1
                iuc r0 = (defpackage.iuc) r0
                java.lang.Object r5 = r8.L$0
                e13 r5 = (defpackage.e13) r5
                defpackage.r7d.b(r9)
                r9 = r5
                goto L53
            L2d:
                defpackage.r7d.b(r9)
                java.lang.Object r9 = r8.L$0
                e13 r9 = (defpackage.e13) r9
                iuc r0 = new iuc
                r0.<init>()
                r5 = 1065353216(0x3f800000, float:1.0)
                r0.element = r5
            L3d:
                g4a<ese<java.lang.Long>> r5 = r8.$toolingOverride
                jc7 r6 = r8.this$0
                kc7 r7 = new kc7
                r7.<init>()
                r8.L$0 = r9
                r8.L$1 = r0
                r8.label = r2
                java.lang.Object r5 = defpackage.hc7.a(r7, r8)
                if (r5 != r4) goto L53
                goto L76
            L53:
                float r5 = r0.element
                r6 = 0
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 != 0) goto L3d
                zh r5 = new zh
                r6 = 12
                r5.<init>(r9, r6)
                kjd r5 = androidx.compose.runtime.r.h(r5)
                jc7$b$a r6 = new jc7$b$a
                r6.<init>(r3, r1)
                r8.L$0 = r9
                r8.L$1 = r0
                r8.label = r3
                java.lang.Object r5 = defpackage.wg2.C(r5, r6, r8)
                if (r5 != r4) goto L3d
            L76:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: jc7.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void a(int i, androidx.compose.runtime.b bVar) {
        c cVarH = bVar.h(-318043801);
        int i2 = (cVarH.x(this) ? 4 : 2) | i;
        int i3 = 1;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(null);
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            if (((Boolean) ((gme) this.d).getValue()).booleanValue() || ((Boolean) ((gme) this.b).getValue()).booleanValue()) {
                cVarH.L(-144783432);
                boolean zX = cVarH.x(this);
                Object objV2 = cVarH.v();
                if (zX || objV2 == c0020a) {
                    objV2 = new b(g4aVar, this, null);
                    cVarH.p(objV2);
                }
                to4.d(cVarH, this, (Function2) objV2);
                cVarH.U(false);
            } else {
                cVarH.L(-143396709);
                cVarH.U(false);
            }
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new zw4(this, i, i3);
        }
    }
}

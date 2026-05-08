package defpackage;

import androidx.navigation.d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material.navigation.BottomSheetNavigator$sheetContent$1$retainedEntry$2$1", f = "BottomSheetNavigator.kt", l = {171}, m = "invokeSuspend")
public final class uk1 extends c1f implements Function2<mpb<d>, lu2<? super j6g>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ pk1 this$0;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ mpb<d> a;

        public a(mpb<d> mpbVar) {
            this.a = mpbVar;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) {
            this.a.setValue((d) obj);
            return j6g.a;
        }
    }

    @uh3(c = "androidx.compose.material.navigation.BottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1", f = "BottomSheetNavigator.kt", l = {40}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<wi5<? super d>, lu2<? super j6g>, Object> {
        final /* synthetic */ vi5 $this_transform;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ pk1 this$0;

        public static final class a<T> implements wi5 {
            public final /* synthetic */ wi5<d> a;
            public final /* synthetic */ pk1 b;

            /* JADX INFO: renamed from: uk1$b$a$a, reason: collision with other inner class name */
            @uh3(c = "androidx.compose.material.navigation.BottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1", f = "BottomSheetNavigator.kt", l = {224, 229, 229, 229}, m = "emit")
            public static final class C0433a extends pu2 {
                Object L$0;
                Object L$1;
                int label;
                /* synthetic */ Object result;

                public C0433a(lu2 lu2Var) {
                    super(lu2Var);
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return a.this.a(null, this);
                }
            }

            public a(wi5 wi5Var, pk1 pk1Var) {
                this.b = pk1Var;
                this.a = wi5Var;
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
            
                if (r9.a(r10, r0) != r7) goto L41;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x009f, code lost:
            
                if (r9.a(r10, r0) == r7) goto L40;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // defpackage.wi5
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(T r10, defpackage.lu2<? super defpackage.j6g> r11) throws java.lang.Throwable {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof uk1.b.a.C0433a
                    if (r0 == 0) goto L13
                    r0 = r11
                    uk1$b$a$a r0 = (uk1.b.a.C0433a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    uk1$b$a$a r0 = new uk1$b$a$a
                    r0.<init>(r11)
                L18:
                    java.lang.Object r11 = r0.result
                    int r1 = r0.label
                    r2 = 4
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    r6 = 0
                    g13 r7 = defpackage.g13.a
                    if (r1 == 0) goto L51
                    if (r1 == r5) goto L40
                    if (r1 == r4) goto L3b
                    if (r1 == r3) goto L3b
                    if (r1 == r2) goto L33
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r9)
                    return r6
                L33:
                    java.lang.Object r9 = r0.L$0
                    java.lang.Throwable r9 = (java.lang.Throwable) r9
                    defpackage.r7d.b(r11)
                    goto L90
                L3b:
                    defpackage.r7d.b(r11)
                    goto La2
                L40:
                    java.lang.Object r9 = r0.L$1
                    wi5 r9 = (defpackage.wi5) r9
                    java.lang.Object r10 = r0.L$0
                    java.util.List r10 = (java.util.List) r10
                    defpackage.r7d.b(r11)     // Catch: java.lang.Throwable -> L4c java.util.concurrent.CancellationException -> L91
                    goto L6a
                L4c:
                    r11 = move-exception
                    r8 = r11
                    r11 = r9
                    r9 = r8
                    goto L7f
                L51:
                    defpackage.r7d.b(r11)
                    wi5<androidx.navigation.d> r11 = r9.a
                    java.util.List r10 = (java.util.List) r10
                    pk1 r9 = r9.b     // Catch: java.lang.Throwable -> L7b java.util.concurrent.CancellationException -> L7d
                    hw9 r9 = r9.c     // Catch: java.lang.Throwable -> L7b java.util.concurrent.CancellationException -> L7d
                    r0.L$0 = r10     // Catch: java.lang.Throwable -> L7b java.util.concurrent.CancellationException -> L7d
                    r0.L$1 = r11     // Catch: java.lang.Throwable -> L7b java.util.concurrent.CancellationException -> L7d
                    r0.label = r5     // Catch: java.lang.Throwable -> L7b java.util.concurrent.CancellationException -> L7d
                    java.lang.Object r9 = r9.b(r0)     // Catch: java.lang.Throwable -> L7b java.util.concurrent.CancellationException -> L7d
                    if (r9 != r7) goto L69
                    goto La1
                L69:
                    r9 = r11
                L6a:
                    java.lang.Object r10 = defpackage.z92.Z0(r10)
                    r0.L$0 = r6
                    r0.L$1 = r6
                    r0.label = r4
                    java.lang.Object r9 = r9.a(r10, r0)
                    if (r9 != r7) goto La2
                    goto La1
                L7b:
                    r9 = move-exception
                    goto L7f
                L7d:
                    r9 = r11
                    goto L91
                L7f:
                    java.lang.Object r10 = defpackage.z92.Z0(r10)
                    r0.L$0 = r9
                    r0.L$1 = r6
                    r0.label = r2
                    java.lang.Object r10 = r11.a(r10, r0)
                    if (r10 != r7) goto L90
                    goto La1
                L90:
                    throw r9
                L91:
                    java.lang.Object r10 = defpackage.z92.Z0(r10)
                    r0.L$0 = r6
                    r0.L$1 = r6
                    r0.label = r3
                    java.lang.Object r9 = r9.a(r10, r0)
                    if (r9 != r7) goto La2
                La1:
                    return r7
                La2:
                    j6g r9 = defpackage.j6g.a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: uk1.b.a.a(java.lang.Object, lu2):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vi5 vi5Var, lu2 lu2Var, pk1 pk1Var) {
            super(2, lu2Var);
            this.$this_transform = vi5Var;
            this.this$0 = pk1Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            b bVar = new b(this.$this_transform, lu2Var, this.this$0);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(wi5<? super d> wi5Var, lu2<? super j6g> lu2Var) {
            return ((b) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                wi5 wi5Var = (wi5) this.L$0;
                vi5 vi5Var = this.$this_transform;
                a aVar = new a(wi5Var, this.this$0);
                this.label = 1;
                Object objE = vi5Var.e(aVar, this);
                g13 g13Var = g13.a;
                if (objE == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk1(pk1 pk1Var, lu2<? super uk1> lu2Var) {
        super(2, lu2Var);
        this.this$0 = pk1Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        uk1 uk1Var = new uk1(this.this$0, lu2Var);
        uk1Var.L$0 = obj;
        return uk1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(mpb<d> mpbVar, lu2<? super j6g> lu2Var) {
        return ((uk1) create(mpbVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            mpb mpbVar = (mpb) this.L$0;
            pk1 pk1Var = this.this$0;
            kjd kjdVar = new kjd(new b(((Boolean) ((gme) pk1Var.d).getValue()).booleanValue() ? pk1Var.b().e : hh2.e(zr4.a), null, this.this$0));
            a aVar = new a(mpbVar);
            this.label = 1;
            Object objE = kjdVar.e(aVar, this);
            g13 g13Var = g13.a;
            if (objE == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        return j6g.a;
    }
}

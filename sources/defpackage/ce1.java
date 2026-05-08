package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ce1 implements PointerInputEventHandler {
    public final /* synthetic */ fe1 a;

    @uh3(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1", f = "BasicTooltip.kt", l = {162}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ fe1 $state;
        final /* synthetic */ efb $this_pointerInput;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: ce1$a$a, reason: collision with other inner class name */
        @uh3(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1", f = "BasicTooltip.kt", l = {166, 169, 175}, m = "invokeSuspend")
        public static final class C0103a extends n7d implements Function2<l61, lu2<? super j6g>, Object> {
            final /* synthetic */ e13 $$this$coroutineScope;
            final /* synthetic */ fe1 $state;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX INFO: renamed from: ce1$a$a$a, reason: collision with other inner class name */
            @uh3(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1", f = "BasicTooltip.kt", l = {172}, m = "invokeSuspend")
            public static final class C0104a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
                final /* synthetic */ fe1 $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0104a(fe1 fe1Var, lu2<? super C0104a> lu2Var) {
                    super(2, lu2Var);
                    this.$state = fe1Var;
                }

                @Override // defpackage.x81
                public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                    return new C0104a(this.$state, lu2Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                    return ((C0104a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    int i = this.label;
                    if (i == 0) {
                        r7d.b(obj);
                        fe1 fe1Var = this.$state;
                        this.label = 1;
                        Object objB = fe1Var.b(n4a.b, this);
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
                    return j6g.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0103a(e13 e13Var, fe1 fe1Var, lu2<? super C0103a> lu2Var) {
                super(2, lu2Var);
                this.$$this$coroutineScope = e13Var;
                this.$state = fe1Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                C0103a c0103a = new C0103a(this.$$this$coroutineScope, this.$state, lu2Var);
                c0103a.L$0 = obj;
                return c0103a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(l61 l61Var, lu2<? super j6g> lu2Var) {
                return ((C0103a) create(l61Var, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
            
                if (r9 == r5) goto L28;
             */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
            @Override // defpackage.x81
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    int r0 = r8.label
                    r1 = 2
                    r2 = 0
                    r3 = 3
                    r4 = 1
                    g13 r5 = defpackage.g13.a
                    if (r0 == 0) goto L33
                    if (r0 == r4) goto L27
                    if (r0 == r1) goto L1b
                    if (r0 != r3) goto L15
                    defpackage.r7d.b(r9)
                    goto L82
                L15:
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r8)
                    return r2
                L1b:
                    java.lang.Object r0 = r8.L$1
                    peb r0 = (defpackage.peb) r0
                    java.lang.Object r1 = r8.L$0
                    l61 r1 = (defpackage.l61) r1
                    defpackage.r7d.b(r9)
                    goto L63
                L27:
                    java.lang.Object r0 = r8.L$1
                    peb r0 = (defpackage.peb) r0
                    java.lang.Object r6 = r8.L$0
                    l61 r6 = (defpackage.l61) r6
                    defpackage.r7d.b(r9)
                    goto L4c
                L33:
                    defpackage.r7d.b(r9)
                    java.lang.Object r9 = r8.L$0
                    l61 r9 = (defpackage.l61) r9
                    r8.L$0 = r9
                    peb r0 = defpackage.peb.a
                    r8.L$1 = r0
                    r8.label = r4
                    java.lang.Object r6 = defpackage.i8f.c(r9, r8, r4)
                    if (r6 != r5) goto L49
                    goto L81
                L49:
                    r7 = r6
                    r6 = r9
                    r9 = r7
                L4c:
                    yeb r9 = (defpackage.yeb) r9
                    int r9 = r9.i
                    if (r9 != r4) goto L53
                    goto L55
                L53:
                    if (r9 != r3) goto L99
                L55:
                    r8.L$0 = r6
                    r8.L$1 = r0
                    r8.label = r1
                    java.lang.Object r9 = defpackage.i8f.h(r6, r0, r8)
                    if (r9 != r5) goto L62
                    goto L81
                L62:
                    r1 = r6
                L63:
                    m59 r9 = (defpackage.m59) r9
                    boolean r9 = r9 instanceof m59.c
                    if (r9 == 0) goto L99
                    e13 r9 = r8.$$this$coroutineScope
                    ce1$a$a$a r4 = new ce1$a$a$a
                    fe1 r6 = r8.$state
                    r4.<init>(r6, r2)
                    defpackage.u63.Y(r9, r2, r2, r4, r3)
                    r8.L$0 = r2
                    r8.L$1 = r2
                    r8.label = r3
                    java.lang.Object r9 = r1.B1(r0, r8)
                    if (r9 != r5) goto L82
                L81:
                    return r5
                L82:
                    neb r9 = (defpackage.neb) r9
                    java.util.List<yeb> r8 = r9.a
                    int r9 = r8.size()
                    r0 = 0
                L8b:
                    if (r0 >= r9) goto L99
                    java.lang.Object r1 = r8.get(r0)
                    yeb r1 = (defpackage.yeb) r1
                    r1.a()
                    int r0 = r0 + 1
                    goto L8b
                L99:
                    j6g r8 = defpackage.j6g.a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: ce1.a.C0103a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(efb efbVar, fe1 fe1Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$this_pointerInput = efbVar;
            this.$state = fe1Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$this_pointerInput, this.$state, lu2Var);
            aVar.L$0 = obj;
            return aVar;
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
                e13 e13Var = (e13) this.L$0;
                efb efbVar = this.$this_pointerInput;
                C0103a c0103a = new C0103a(e13Var, this.$state, null);
                this.label = 1;
                Object objC = ap5.c(efbVar, c0103a, this);
                g13 g13Var = g13.a;
                if (objC == g13Var) {
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

    public ce1(fe1 fe1Var) {
        this.a = fe1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(efb efbVar, lu2<? super j6g> lu2Var) {
        Object objD = f13.d(new a(efbVar, this.a, null), lu2Var);
        return objD == g13.a ? objD : j6g.a;
    }
}

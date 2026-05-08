package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {247}, m = "invokeSuspend")
public final class n8f extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ wu5<dmb, ooa, lu2<? super j6g>, Object> $onPress;
    final /* synthetic */ Function1<ooa, j6g> $onTap;
    final /* synthetic */ gmb $pressScope;
    final /* synthetic */ efb $this_detectTapAndPress;
    private /* synthetic */ Object L$0;
    int label;

    @uh3(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {251, 257}, m = "invokeSuspend")
    public static final class a extends n7d implements Function2<l61, lu2<? super j6g>, Object> {
        final /* synthetic */ e13 $$this$coroutineScope;
        final /* synthetic */ wu5<dmb, ooa, lu2<? super j6g>, Object> $onPress;
        final /* synthetic */ Function1<ooa, j6g> $onTap;
        final /* synthetic */ gmb $pressScope;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: n8f$a$a, reason: collision with other inner class name */
        @uh3(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {254}, m = "invokeSuspend")
        public static final class C0329a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ yeb $down;
            final /* synthetic */ wu5<dmb, ooa, lu2<? super j6g>, Object> $onPress;
            final /* synthetic */ gmb $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0329a(wu5<? super dmb, ? super ooa, ? super lu2<? super j6g>, ? extends Object> wu5Var, gmb gmbVar, yeb yebVar, lu2<? super C0329a> lu2Var) {
                super(2, lu2Var);
                this.$onPress = wu5Var;
                this.$pressScope = gmbVar;
                this.$down = yebVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0329a(this.$onPress, this.$pressScope, this.$down, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0329a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    r7d.b(obj);
                    wu5<dmb, ooa, lu2<? super j6g>, Object> wu5Var = this.$onPress;
                    gmb gmbVar = this.$pressScope;
                    ooa ooaVar = new ooa(this.$down.c);
                    this.label = 1;
                    Object objQ = wu5Var.q(gmbVar, ooaVar, this);
                    g13 g13Var = g13.a;
                    if (objQ == g13Var) {
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

        @uh3(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ gmb $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(gmb gmbVar, lu2<? super b> lu2Var) {
                super(2, lu2Var);
                this.$pressScope = gmbVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new b(this.$pressScope, lu2Var);
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
                this.$pressScope.d();
                return j6g.a;
            }
        }

        @uh3(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ gmb $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(gmb gmbVar, lu2<? super c> lu2Var) {
                super(2, lu2Var);
                this.$pressScope = gmbVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new c(this.$pressScope, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                this.$pressScope.g();
                return j6g.a;
            }
        }

        @uh3(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1", f = "TapGestureDetector.kt", l = {249}, m = "invokeSuspend")
        public static final class d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ gmb $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(gmb gmbVar, lu2<? super d> lu2Var) {
                super(2, lu2Var);
                this.$pressScope = gmbVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new d(this.$pressScope, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.label;
                if (i == 0) {
                    r7d.b(obj);
                    gmb gmbVar = this.$pressScope;
                    this.label = 1;
                    Object objK = gmbVar.k(this);
                    g13 g13Var = g13.a;
                    if (objK == g13Var) {
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
        /* JADX WARN: Multi-variable type inference failed */
        public a(e13 e13Var, wu5<? super dmb, ? super ooa, ? super lu2<? super j6g>, ? extends Object> wu5Var, Function1<? super ooa, j6g> function1, gmb gmbVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$$this$coroutineScope = e13Var;
            this.$onPress = wu5Var;
            this.$onTap = function1;
            this.$pressScope = gmbVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$$this$coroutineScope, this.$onPress, this.$onTap, this.$pressScope, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l61 l61Var, lu2<? super j6g> lu2Var) {
            return ((a) create(l61Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
        
            if (r11 == r4) goto L19;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                int r0 = r10.label
                r1 = 2
                r2 = 1
                r3 = 0
                g13 r4 = defpackage.g13.a
                if (r0 == 0) goto L27
                if (r0 == r2) goto L1b
                if (r0 != r1) goto L15
                java.lang.Object r0 = r10.L$0
                ex7 r0 = (defpackage.ex7) r0
                defpackage.r7d.b(r11)
                goto L76
            L15:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r10)
                return r3
            L1b:
                java.lang.Object r0 = r10.L$1
                ex7 r0 = (defpackage.ex7) r0
                java.lang.Object r2 = r10.L$0
                l61 r2 = (defpackage.l61) r2
                defpackage.r7d.b(r11)
                goto L50
            L27:
                defpackage.r7d.b(r11)
                java.lang.Object r11 = r10.L$0
                l61 r11 = (defpackage.l61) r11
                e13 r0 = r10.$$this$coroutineScope
                i8f$a r5 = defpackage.i8f.a
                n8f$a$d r5 = new n8f$a$d
                gmb r6 = r10.$pressScope
                r5.<init>(r6, r3)
                i13 r6 = defpackage.i13.d
                uqe r0 = defpackage.u63.Y(r0, r3, r6, r5, r2)
                r10.L$0 = r11
                r10.L$1 = r0
                r10.label = r2
                r2 = 3
                java.lang.Object r2 = defpackage.i8f.c(r11, r10, r2)
                if (r2 != r4) goto L4d
                goto L75
            L4d:
                r9 = r2
                r2 = r11
                r11 = r9
            L50:
                yeb r11 = (defpackage.yeb) r11
                r11.a()
                wu5<dmb, ooa, lu2<? super j6g>, java.lang.Object> r5 = r10.$onPress
                i8f$a r6 = defpackage.i8f.a
                if (r5 == r6) goto L67
                e13 r6 = r10.$$this$coroutineScope
                n8f$a$a r7 = new n8f$a$a
                gmb r8 = r10.$pressScope
                r7.<init>(r5, r8, r11, r3)
                defpackage.i8f.g(r6, r0, r7)
            L67:
                r10.L$0 = r0
                r10.L$1 = r3
                r10.label = r1
                peb r11 = defpackage.peb.b
                java.lang.Object r11 = defpackage.i8f.i(r2, r11, r10)
                if (r11 != r4) goto L76
            L75:
                return r4
            L76:
                yeb r11 = (defpackage.yeb) r11
                if (r11 != 0) goto L87
                e13 r11 = r10.$$this$coroutineScope
                n8f$a$b r1 = new n8f$a$b
                gmb r10 = r10.$pressScope
                r1.<init>(r10, r3)
                defpackage.i8f.g(r11, r0, r1)
                goto La4
            L87:
                r11.a()
                e13 r1 = r10.$$this$coroutineScope
                n8f$a$c r2 = new n8f$a$c
                gmb r4 = r10.$pressScope
                r2.<init>(r4, r3)
                defpackage.i8f.g(r1, r0, r2)
                kotlin.jvm.functions.Function1<ooa, j6g> r10 = r10.$onTap
                if (r10 == 0) goto La4
                long r0 = r11.c
                ooa r11 = new ooa
                r11.<init>(r0)
                r10.invoke(r11)
            La4:
                j6g r10 = defpackage.j6g.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: n8f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n8f(efb efbVar, wu5<? super dmb, ? super ooa, ? super lu2<? super j6g>, ? extends Object> wu5Var, Function1<? super ooa, j6g> function1, gmb gmbVar, lu2<? super n8f> lu2Var) {
        super(2, lu2Var);
        this.$this_detectTapAndPress = efbVar;
        this.$onPress = wu5Var;
        this.$onTap = function1;
        this.$pressScope = gmbVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        n8f n8fVar = new n8f(this.$this_detectTapAndPress, this.$onPress, this.$onTap, this.$pressScope, lu2Var);
        n8fVar.L$0 = obj;
        return n8fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((n8f) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            e13 e13Var = (e13) this.L$0;
            efb efbVar = this.$this_detectTapAndPress;
            a aVar = new a(e13Var, this.$onPress, this.$onTap, this.$pressScope, null);
            this.label = 1;
            Object objC = ap5.c(efbVar, aVar, this);
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

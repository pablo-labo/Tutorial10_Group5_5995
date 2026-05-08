package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {104}, m = "invokeSuspend")
public final class o8f extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Function1<ooa, j6g> $onDoubleTap;
    final /* synthetic */ Function1<ooa, j6g> $onLongPress;
    final /* synthetic */ wu5<dmb, ooa, lu2<? super j6g>, Object> $onPress;
    final /* synthetic */ Function1<ooa, j6g> $onTap;
    final /* synthetic */ efb $this_detectTapGestures;
    private /* synthetic */ Object L$0;
    int label;

    @uh3(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {105, 116, 119, 122, 149, 167, 169, 180}, m = "invokeSuspend")
    public static final class a extends n7d implements Function2<l61, lu2<? super j6g>, Object> {
        final /* synthetic */ e13 $$this$coroutineScope;
        final /* synthetic */ Function1<ooa, j6g> $onDoubleTap;
        final /* synthetic */ Function1<ooa, j6g> $onLongPress;
        final /* synthetic */ wu5<dmb, ooa, lu2<? super j6g>, Object> $onPress;
        final /* synthetic */ Function1<ooa, j6g> $onTap;
        final /* synthetic */ gmb $pressScope;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX INFO: renamed from: o8f$a$a, reason: collision with other inner class name */
        @uh3(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", l = {110}, m = "invokeSuspend")
        public static final class C0339a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ yeb $down;
            final /* synthetic */ wu5<dmb, ooa, lu2<? super j6g>, Object> $onPress;
            final /* synthetic */ gmb $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0339a(wu5<? super dmb, ? super ooa, ? super lu2<? super j6g>, ? extends Object> wu5Var, gmb gmbVar, yeb yebVar, lu2<? super C0339a> lu2Var) {
                super(2, lu2Var);
                this.$onPress = wu5Var;
                this.$pressScope = gmbVar;
                this.$down = yebVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0339a(this.$onPress, this.$pressScope, this.$down, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0339a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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

        @uh3(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
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
                this.$pressScope.g();
                return j6g.a;
            }
        }

        @uh3(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
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
                this.$pressScope.d();
                return j6g.a;
            }
        }

        @uh3(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
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

        @uh3(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", l = {157, 158}, m = "invokeSuspend")
        public static final class e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ ex7 $cancelOrReleaseJob;
            final /* synthetic */ gmb $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(ex7 ex7Var, gmb gmbVar, lu2<? super e> lu2Var) {
                super(2, lu2Var);
                this.$cancelOrReleaseJob = ex7Var;
                this.$pressScope = gmbVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new e(this.$cancelOrReleaseJob, this.$pressScope, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
            
                if (r5.k(r4) == r3) goto L15;
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
                    g13 r3 = defpackage.g13.a
                    if (r0 == 0) goto L1b
                    if (r0 == r2) goto L17
                    if (r0 != r1) goto L10
                    defpackage.r7d.b(r5)
                    goto L34
                L10:
                    java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r4)
                    r4 = 0
                    return r4
                L17:
                    defpackage.r7d.b(r5)
                    goto L29
                L1b:
                    defpackage.r7d.b(r5)
                    ex7 r5 = r4.$cancelOrReleaseJob
                    r4.label = r2
                    java.lang.Object r5 = r5.s0(r4)
                    if (r5 != r3) goto L29
                    goto L33
                L29:
                    gmb r5 = r4.$pressScope
                    r4.label = r1
                    java.lang.Object r4 = r5.k(r4)
                    if (r4 != r3) goto L34
                L33:
                    return r3
                L34:
                    j6g r4 = defpackage.j6g.a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: o8f.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @uh3(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", l = {161}, m = "invokeSuspend")
        public static final class f extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ wu5<dmb, ooa, lu2<? super j6g>, Object> $onPress;
            final /* synthetic */ gmb $pressScope;
            final /* synthetic */ yeb $secondDown;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public f(wu5<? super dmb, ? super ooa, ? super lu2<? super j6g>, ? extends Object> wu5Var, gmb gmbVar, yeb yebVar, lu2<? super f> lu2Var) {
                super(2, lu2Var);
                this.$onPress = wu5Var;
                this.$pressScope = gmbVar;
                this.$secondDown = yebVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new f(this.$onPress, this.$pressScope, this.$secondDown, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((f) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    r7d.b(obj);
                    wu5<dmb, ooa, lu2<? super j6g>, Object> wu5Var = this.$onPress;
                    gmb gmbVar = this.$pressScope;
                    ooa ooaVar = new ooa(this.$secondDown.c);
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

        @uh3(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        public static final class g extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ gmb $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(gmb gmbVar, lu2<? super g> lu2Var) {
                super(2, lu2Var);
                this.$pressScope = gmbVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new g(this.$pressScope, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((g) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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

        @uh3(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        public static final class h extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ gmb $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(gmb gmbVar, lu2<? super h> lu2Var) {
                super(2, lu2Var);
                this.$pressScope = gmbVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new h(this.$pressScope, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((h) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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

        @uh3(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$resetJob$1", f = "TapGestureDetector.kt", l = {108}, m = "invokeSuspend")
        public static final class i extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ gmb $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(gmb gmbVar, lu2<? super i> lu2Var) {
                super(2, lu2Var);
                this.$pressScope = gmbVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new i(this.$pressScope, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((i) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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

        @uh3(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        public static final class j extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ gmb $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(gmb gmbVar, lu2<? super j> lu2Var) {
                super(2, lu2Var);
                this.$pressScope = gmbVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new j(this.$pressScope, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((j) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e13 e13Var, wu5<? super dmb, ? super ooa, ? super lu2<? super j6g>, ? extends Object> wu5Var, Function1<? super ooa, j6g> function1, Function1<? super ooa, j6g> function12, Function1<? super ooa, j6g> function13, gmb gmbVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$$this$coroutineScope = e13Var;
            this.$onPress = wu5Var;
            this.$onLongPress = function1;
            this.$onDoubleTap = function12;
            this.$onTap = function13;
            this.$pressScope = gmbVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$$this$coroutineScope, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, this.$pressScope, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l61 l61Var, lu2<? super j6g> lu2Var) {
            return ((a) create(l61Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x010a, code lost:
        
            if (defpackage.i8f.a(r7, r13) == r6) goto L82;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0188  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0198  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01f1  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0220  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0232  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x024e  */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 650
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o8f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o8f(efb efbVar, wu5<? super dmb, ? super ooa, ? super lu2<? super j6g>, ? extends Object> wu5Var, Function1<? super ooa, j6g> function1, Function1<? super ooa, j6g> function12, Function1<? super ooa, j6g> function13, lu2<? super o8f> lu2Var) {
        super(2, lu2Var);
        this.$this_detectTapGestures = efbVar;
        this.$onPress = wu5Var;
        this.$onLongPress = function1;
        this.$onDoubleTap = function12;
        this.$onTap = function13;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        o8f o8fVar = new o8f(this.$this_detectTapGestures, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, lu2Var);
        o8fVar.L$0 = obj;
        return o8fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((o8f) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            e13 e13Var = (e13) this.L$0;
            gmb gmbVar = new gmb(this.$this_detectTapGestures);
            efb efbVar = this.$this_detectTapGestures;
            a aVar = new a(e13Var, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, gmbVar, null);
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

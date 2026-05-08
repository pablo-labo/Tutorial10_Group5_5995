package defpackage;

import defpackage.uk2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class nba {

    public static final class a extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function1<gba, j6g> $builder;
        final /* synthetic */ c20 $contentAlignment;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, lv4> $enterTransition;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, r25> $exitTransition;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ iba $navController;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, lv4> $popEnterTransition;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, r25> $popExitTransition;
        final /* synthetic */ String $route;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, sie> $sizeTransform;
        final /* synthetic */ String $startDestination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(iba ibaVar, String str, androidx.compose.ui.e eVar, c20 c20Var, String str2, Function1<dd0<androidx.navigation.d>, lv4> function1, Function1<dd0<androidx.navigation.d>, r25> function12, Function1<dd0<androidx.navigation.d>, lv4> function13, Function1<dd0<androidx.navigation.d>, r25> function14, Function1<dd0<androidx.navigation.d>, sie> function15, Function1<? super gba, j6g> function16, int i, int i2, int i3) {
            super(2);
            this.$navController = ibaVar;
            this.$startDestination = str;
            this.$modifier = eVar;
            this.$contentAlignment = c20Var;
            this.$route = str2;
            this.$enterTransition = function1;
            this.$exitTransition = function12;
            this.$popEnterTransition = function13;
            this.$popExitTransition = function14;
            this.$sizeTransform = function15;
            this.$builder = function16;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            nba.c(this.$navController, this.$startDestination, this.$modifier, this.$contentAlignment, this.$route, this.$enterTransition, this.$exitTransition, this.$popEnterTransition, this.$popExitTransition, this.$sizeTransform, this.$builder, bVar, ka2.L(this.$$changed | 1), ka2.L(this.$$changed1), this.$$default);
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function1<dd0<androidx.navigation.d>, lv4> {
        public static final b a = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final lv4 invoke(dd0<androidx.navigation.d> dd0Var) {
            return ku4.d(zd0.d(700, 0, null, 6), 2);
        }
    }

    public static final class c extends mj8 implements Function1<dd0<androidx.navigation.d>, r25> {
        public static final c a = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final r25 invoke(dd0<androidx.navigation.d> dd0Var) {
            return ku4.e(zd0.d(700, 0, null, 6), 2);
        }
    }

    public static final class d extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function1<gba, j6g> $builder;
        final /* synthetic */ c20 $contentAlignment;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, lv4> $enterTransition;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, r25> $exitTransition;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ iba $navController;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, lv4> $popEnterTransition;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, r25> $popExitTransition;
        final /* synthetic */ yd8<?> $route;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, sie> $sizeTransform;
        final /* synthetic */ Object $startDestination;
        final /* synthetic */ Map<zf8, androidx.navigation.r<?>> $typeMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(iba ibaVar, Object obj, androidx.compose.ui.e eVar, c20 c20Var, yd8<?> yd8Var, Map<zf8, androidx.navigation.r<?>> map, Function1<dd0<androidx.navigation.d>, lv4> function1, Function1<dd0<androidx.navigation.d>, r25> function12, Function1<dd0<androidx.navigation.d>, lv4> function13, Function1<dd0<androidx.navigation.d>, r25> function14, Function1<dd0<androidx.navigation.d>, sie> function15, Function1<? super gba, j6g> function16, int i, int i2, int i3) {
            super(2);
            this.$navController = ibaVar;
            this.$startDestination = obj;
            this.$modifier = eVar;
            this.$contentAlignment = c20Var;
            this.$route = yd8Var;
            this.$typeMap = map;
            this.$enterTransition = function1;
            this.$exitTransition = function12;
            this.$popEnterTransition = function13;
            this.$popExitTransition = function14;
            this.$sizeTransform = function15;
            this.$builder = function16;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            nba.b(this.$navController, this.$startDestination, this.$modifier, this.$contentAlignment, this.$route, this.$typeMap, this.$enterTransition, this.$exitTransition, this.$popEnterTransition, this.$popExitTransition, this.$sizeTransform, this.$builder, bVar, ka2.L(this.$$changed | 1), ka2.L(this.$$changed1), this.$$default);
            return j6g.a;
        }
    }

    public static final class e extends mj8 implements Function1<dd0<androidx.navigation.d>, lv4> {
        public static final e a = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final lv4 invoke(dd0<androidx.navigation.d> dd0Var) {
            return ku4.d(zd0.d(700, 0, null, 6), 2);
        }
    }

    public static final class f extends mj8 implements Function1<dd0<androidx.navigation.d>, r25> {
        public static final f a = new f(1);

        @Override // kotlin.jvm.functions.Function1
        public final r25 invoke(dd0<androidx.navigation.d> dd0Var) {
            return ku4.e(zd0.d(700, 0, null, 6), 2);
        }
    }

    @uh3(c = "androidx.navigation.compose.NavHostKt$NavHost$25$1", f = "NavHost.kt", l = {524}, m = "invokeSuspend")
    public static final class g extends c1f implements Function2<vi5<f71>, lu2<? super j6g>, Object> {
        final /* synthetic */ uk2 $composeNavigator;
        final /* synthetic */ ese<List<androidx.navigation.d>> $currentBackStack$delegate;
        final /* synthetic */ g4a<Boolean> $inPredictiveBack$delegate;
        final /* synthetic */ x2a $progress$delegate;
        /* synthetic */ Object L$0;
        int label;

        public static final class a<T> implements wi5 {
            public final /* synthetic */ ese<List<androidx.navigation.d>> a;
            public final /* synthetic */ g4a<Boolean> b;
            public final /* synthetic */ x2a c;

            /* JADX WARN: Multi-variable type inference failed */
            public a(ese<? extends List<androidx.navigation.d>> eseVar, g4a<Boolean> g4aVar, x2a x2aVar) {
                this.a = eseVar;
                this.b = g4aVar;
                this.c = x2aVar;
            }

            @Override // defpackage.wi5
            public final Object a(Object obj, lu2 lu2Var) {
                f71 f71Var = (f71) obj;
                if (this.a.getValue().size() > 1) {
                    this.b.setValue(Boolean.TRUE);
                    this.c.q(f71Var.c);
                }
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(uk2 uk2Var, ese<? extends List<androidx.navigation.d>> eseVar, x2a x2aVar, g4a<Boolean> g4aVar, lu2<? super g> lu2Var) {
            super(2, lu2Var);
            this.$composeNavigator = uk2Var;
            this.$currentBackStack$delegate = eseVar;
            this.$progress$delegate = x2aVar;
            this.$inPredictiveBack$delegate = g4aVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            g gVar = new g(this.$composeNavigator, this.$currentBackStack$delegate, this.$progress$delegate, this.$inPredictiveBack$delegate, lu2Var);
            gVar.L$0 = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vi5<f71> vi5Var, lu2<? super j6g> lu2Var) {
            return ((g) create(vi5Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            androidx.navigation.d dVar;
            int i = this.label;
            androidx.navigation.d dVar2 = null;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    vi5 vi5Var = (vi5) this.L$0;
                    if (this.$currentBackStack$delegate.getValue().size() > 1) {
                        this.$progress$delegate.q(0.0f);
                        dVar2 = (androidx.navigation.d) z92.Z0(this.$currentBackStack$delegate.getValue());
                        uk2 uk2Var = this.$composeNavigator;
                        dVar2.getClass();
                        uk2Var.b().f(dVar2);
                        this.$composeNavigator.b().f(this.$currentBackStack$delegate.getValue().get(this.$currentBackStack$delegate.getValue().size() - 2));
                    }
                    a aVar = new a(this.$currentBackStack$delegate, this.$inPredictiveBack$delegate, this.$progress$delegate);
                    this.L$0 = dVar2;
                    this.label = 1;
                    Object objE = vi5Var.e(aVar, this);
                    g13 g13Var = g13.a;
                    if (objE == g13Var) {
                        return g13Var;
                    }
                    dVar = dVar2;
                } else {
                    if (i != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dVar = (androidx.navigation.d) this.L$0;
                    r7d.b(obj);
                }
                if (this.$currentBackStack$delegate.getValue().size() > 1) {
                    this.$inPredictiveBack$delegate.setValue(Boolean.FALSE);
                    uk2 uk2Var2 = this.$composeNavigator;
                    dVar.getClass();
                    uk2Var2.i(dVar, false);
                }
            } catch (CancellationException unused) {
                if (this.$currentBackStack$delegate.getValue().size() > 1) {
                    this.$inPredictiveBack$delegate.setValue(Boolean.FALSE);
                }
            }
            return j6g.a;
        }
    }

    public static final class h extends mj8 implements Function1<m74, l74> {
        final /* synthetic */ zv8 $lifecycleOwner;
        final /* synthetic */ iba $navController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(iba ibaVar, zv8 zv8Var) {
            super(1);
            this.$navController = ibaVar;
            this.$lifecycleOwner = zv8Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final l74 invoke(m74 m74Var) {
            this.$navController.F(this.$lifecycleOwner);
            return new nh4(1);
        }
    }

    public static final class i extends mj8 implements Function1<m74, l74> {
        final /* synthetic */ uk2 $composeNavigator;
        final /* synthetic */ ese<List<androidx.navigation.d>> $visibleEntries$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(ese<? extends List<androidx.navigation.d>> eseVar, uk2 uk2Var) {
            super(1);
            this.$visibleEntries$delegate = eseVar;
            this.$composeNavigator = uk2Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final l74 invoke(m74 m74Var) {
            return new oba(this.$visibleEntries$delegate, this.$composeNavigator);
        }
    }

    @uh3(c = "androidx.navigation.compose.NavHostKt$NavHost$28$1", f = "NavHost.kt", l = {621}, m = "invokeSuspend")
    public static final class j extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ ese<List<androidx.navigation.d>> $currentBackStack$delegate;
        final /* synthetic */ x2a $progress$delegate;
        final /* synthetic */ cyd<androidx.navigation.d> $transitionState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(cyd<androidx.navigation.d> cydVar, ese<? extends List<androidx.navigation.d>> eseVar, x2a x2aVar, lu2<? super j> lu2Var) {
            super(2, lu2Var);
            this.$transitionState = cydVar;
            this.$currentBackStack$delegate = eseVar;
            this.$progress$delegate = x2aVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new j(this.$transitionState, this.$currentBackStack$delegate, this.$progress$delegate, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((j) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                androidx.navigation.d dVar = this.$currentBackStack$delegate.getValue().get(this.$currentBackStack$delegate.getValue().size() - 2);
                cyd<androidx.navigation.d> cydVar = this.$transitionState;
                float fG = this.$progress$delegate.g();
                this.label = 1;
                Object objM = cydVar.m(fG, dVar, this);
                g13 g13Var = g13.a;
                if (objM == g13Var) {
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

    @uh3(c = "androidx.navigation.compose.NavHostKt$NavHost$29$1", f = "NavHost.kt", l = {628, 635}, m = "invokeSuspend")
    public static final class k extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ androidx.navigation.d $backStackEntry;
        final /* synthetic */ csf<androidx.navigation.d> $transition;
        final /* synthetic */ cyd<androidx.navigation.d> $transitionState;
        private /* synthetic */ Object L$0;
        int label;

        public static final class a extends mj8 implements Function2<Float, Float, j6g> {
            final /* synthetic */ e13 $$this$LaunchedEffect;
            final /* synthetic */ androidx.navigation.d $backStackEntry;
            final /* synthetic */ cyd<androidx.navigation.d> $transitionState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e13 e13Var, cyd<androidx.navigation.d> cydVar, androidx.navigation.d dVar) {
                super(2);
                this.$$this$LaunchedEffect = e13Var;
                this.$transitionState = cydVar;
                this.$backStackEntry = dVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final j6g invoke(Float f, Float f2) {
                float fFloatValue = f.floatValue();
                f2.floatValue();
                u63.Y(this.$$this$LaunchedEffect, null, null, new pba(fFloatValue, this.$transitionState, this.$backStackEntry, null), 3);
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(cyd<androidx.navigation.d> cydVar, androidx.navigation.d dVar, csf<androidx.navigation.d> csfVar, lu2<? super k> lu2Var) {
            super(2, lu2Var);
            this.$transitionState = cydVar;
            this.$backStackEntry = dVar;
            this.$transition = csfVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            k kVar = new k(this.$transitionState, this.$backStackEntry, this.$transition, lu2Var);
            kVar.L$0 = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((k) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
        
            if (r13 == r4) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0095, code lost:
        
            if (defpackage.x0f.c(r7, 0.0f, r9, r10, r13, 4) == r4) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
        
            return r4;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                int r0 = r13.label
                r1 = 0
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L17
                if (r0 == r3) goto L12
                if (r0 != r2) goto Lc
                goto L12
            Lc:
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r13)
                return r1
            L12:
                defpackage.r7d.b(r14)
                goto L98
            L17:
                defpackage.r7d.b(r14)
                java.lang.Object r14 = r13.L$0
                e13 r14 = (defpackage.e13) r14
                cyd<androidx.navigation.d> r0 = r13.$transitionState
                g4a r0 = r0.c
                gme r0 = (defpackage.gme) r0
                java.lang.Object r0 = r0.getValue()
                androidx.navigation.d r4 = r13.$backStackEntry
                boolean r0 = defpackage.wl7.b(r0, r4)
                g13 r4 = defpackage.g13.a
                if (r0 != 0) goto L54
                cyd<androidx.navigation.d> r8 = r13.$transitionState
                androidx.navigation.d r10 = r13.$backStackEntry
                r13.label = r3
                csf<S> r9 = r8.e
                if (r9 != 0) goto L3f
                j6g r13 = defpackage.j6g.a
                goto L51
            L3f:
                u4a r14 = r8.k
                dyd r5 = new dyd
                r6 = 0
                r7 = 0
                r5.<init>(r6, r7, r8, r9, r10)
                java.lang.Object r13 = defpackage.u4a.a(r14, r5, r13)
                if (r13 != r4) goto L4f
                goto L51
            L4f:
                j6g r13 = defpackage.j6g.a
            L51:
                if (r13 != r4) goto L98
                goto L97
            L54:
                csf<androidx.navigation.d> r0 = r13.$transition
                az3 r0 = r0.l
                java.lang.Object r0 = r0.getValue()
                java.lang.Number r0 = (java.lang.Number) r0
                long r5 = r0.longValue()
                r7 = 1000000(0xf4240, double:4.940656E-318)
                long r5 = r5 / r7
                cyd<androidx.navigation.d> r0 = r13.$transitionState
                x2a r0 = r0.h
                cme r0 = (defpackage.cme) r0
                float r7 = r0.g()
                cyd<androidx.navigation.d> r0 = r13.$transitionState
                x2a r0 = r0.h
                cme r0 = (defpackage.cme) r0
                float r0 = r0.g()
                float r3 = (float) r5
                float r0 = r0 * r3
                int r0 = (int) r0
                r3 = 0
                r5 = 6
                dvf r9 = defpackage.zd0.d(r0, r3, r1, r5)
                nba$k$a r10 = new nba$k$a
                cyd<androidx.navigation.d> r0 = r13.$transitionState
                androidx.navigation.d r1 = r13.$backStackEntry
                r10.<init>(r14, r0, r1)
                r13.label = r2
                r8 = 0
                r12 = 4
                r11 = r13
                java.lang.Object r13 = defpackage.x0f.c(r7, r8, r9, r10, r11, r12)
                if (r13 != r4) goto L98
            L97:
                return r4
            L98:
                j6g r13 = defpackage.j6g.a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: nba.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class l extends mj8 implements Function1<dd0<androidx.navigation.d>, it2> {
        final /* synthetic */ uk2 $composeNavigator;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, lv4> $finalEnter;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, r25> $finalExit;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, sie> $finalSizeTransform;
        final /* synthetic */ g4a<Boolean> $inPredictiveBack$delegate;
        final /* synthetic */ ese<List<androidx.navigation.d>> $visibleEntries$delegate;
        final /* synthetic */ Map<String, Float> $zIndices;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(Map<String, Float> map, uk2 uk2Var, Function1<? super dd0<androidx.navigation.d>, ? extends lv4> function1, Function1<? super dd0<androidx.navigation.d>, ? extends r25> function12, Function1<? super dd0<androidx.navigation.d>, ? extends sie> function13, ese<? extends List<androidx.navigation.d>> eseVar, g4a<Boolean> g4aVar) {
            super(1);
            this.$zIndices = map;
            this.$composeNavigator = uk2Var;
            this.$finalEnter = function1;
            this.$finalExit = function12;
            this.$finalSizeTransform = function13;
            this.$visibleEntries$delegate = eseVar;
            this.$inPredictiveBack$delegate = g4aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final it2 invoke(dd0<androidx.navigation.d> dd0Var) {
            float fFloatValue;
            dd0<androidx.navigation.d> dd0Var2 = dd0Var;
            if (!this.$visibleEntries$delegate.getValue().contains(dd0Var2.b())) {
                return androidx.compose.animation.a.c(lv4.a, r25.a);
            }
            Float f = this.$zIndices.get(dd0Var2.b().f);
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                this.$zIndices.put(dd0Var2.b().f, Float.valueOf(0.0f));
                fFloatValue = 0.0f;
            }
            if (!wl7.b(dd0Var2.a().f, dd0Var2.b().f)) {
                fFloatValue = (((Boolean) ((gme) this.$composeNavigator.c).getValue()).booleanValue() || nba.d(this.$inPredictiveBack$delegate)) ? fFloatValue - 1.0f : fFloatValue + 1.0f;
            }
            this.$zIndices.put(dd0Var2.a().f, Float.valueOf(fFloatValue));
            return new it2(this.$finalEnter.invoke(dd0Var2), this.$finalExit.invoke(dd0Var2), fFloatValue, this.$finalSizeTransform.invoke(dd0Var2));
        }
    }

    public static final class m extends mj8 implements Function1<androidx.navigation.d, Object> {
        public static final m a = new m(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(androidx.navigation.d dVar) {
            return dVar.f;
        }
    }

    public static final class n extends mj8 implements xu5<bd0, androidx.navigation.d, androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ androidx.navigation.d $backStackEntry;
        final /* synthetic */ g4a<Boolean> $inPredictiveBack$delegate;
        final /* synthetic */ ekd $saveableStateHolder;
        final /* synthetic */ cyd<androidx.navigation.d> $transitionState;
        final /* synthetic */ ese<List<androidx.navigation.d>> $visibleEntries$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(cyd cydVar, androidx.navigation.d dVar, hkd hkdVar, g4a g4aVar, ese eseVar) {
            super(4);
            this.$transitionState = cydVar;
            this.$backStackEntry = dVar;
            this.$saveableStateHolder = hkdVar;
            this.$inPredictiveBack$delegate = g4aVar;
            this.$visibleEntries$delegate = eseVar;
        }

        @Override // defpackage.xu5
        public final j6g j(bd0 bd0Var, androidx.navigation.d dVar, androidx.compose.runtime.b bVar, Integer num) {
            androidx.navigation.d dVarPrevious;
            bd0 bd0Var2 = bd0Var;
            androidx.navigation.d dVar2 = dVar;
            androidx.compose.runtime.b bVar2 = bVar;
            num.intValue();
            boolean zB = wl7.b(((gme) this.$transitionState.c).getValue(), this.$backStackEntry);
            if (!nba.d(this.$inPredictiveBack$delegate) && !zB) {
                List<androidx.navigation.d> value = this.$visibleEntries$delegate.getValue();
                ListIterator<androidx.navigation.d> listIterator = value.listIterator(value.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        dVarPrevious = null;
                        break;
                    }
                    dVarPrevious = listIterator.previous();
                    if (wl7.b(dVar2, dVarPrevious)) {
                        break;
                    }
                }
                dVar2 = dVarPrevious;
            }
            if (dVar2 != null) {
                paa.a(dVar2, this.$saveableStateHolder, bh2.c(-1263531443, new qba(dVar2, bd0Var2), bVar2), bVar2, 384);
            }
            return j6g.a;
        }
    }

    @uh3(c = "androidx.navigation.compose.NavHostKt$NavHost$33$1", f = "NavHost.kt", l = {}, m = "invokeSuspend")
    public static final class o extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ uk2 $composeNavigator;
        final /* synthetic */ iba $navController;
        final /* synthetic */ csf<androidx.navigation.d> $transition;
        final /* synthetic */ ese<List<androidx.navigation.d>> $visibleEntries$delegate;
        final /* synthetic */ Map<String, Float> $zIndices;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o(csf<androidx.navigation.d> csfVar, iba ibaVar, Map<String, Float> map, ese<? extends List<androidx.navigation.d>> eseVar, uk2 uk2Var, lu2<? super o> lu2Var) {
            super(2, lu2Var);
            this.$transition = csfVar;
            this.$navController = ibaVar;
            this.$zIndices = map;
            this.$visibleEntries$delegate = eseVar;
            this.$composeNavigator = uk2Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new o(this.$transition, this.$navController, this.$zIndices, this.$visibleEntries$delegate, this.$composeNavigator, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((o) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            if (wl7.b(this.$transition.a.a(), ((gme) this.$transition.d).getValue()) && (this.$navController.g.j() == null || wl7.b(((gme) this.$transition.d).getValue(), this.$navController.g.j()))) {
                List<androidx.navigation.d> value = this.$visibleEntries$delegate.getValue();
                uk2 uk2Var = this.$composeNavigator;
                Iterator<T> it = value.iterator();
                while (it.hasNext()) {
                    uk2Var.b().b((androidx.navigation.d) it.next());
                }
                Map<String, Float> map = this.$zIndices;
                csf<androidx.navigation.d> csfVar = this.$transition;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, Float> entry : map.entrySet()) {
                    if (!wl7.b(entry.getKey(), ((androidx.navigation.d) ((gme) csfVar.d).getValue()).f)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Map<String, Float> map2 = this.$zIndices;
                Iterator it2 = linkedHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    map2.remove(((Map.Entry) it2.next()).getKey());
                }
            }
            return j6g.a;
        }
    }

    public static final class p extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ c20 $contentAlignment;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, lv4> $enterTransition;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, r25> $exitTransition;
        final /* synthetic */ androidx.navigation.l $graph;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ iba $navController;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, lv4> $popEnterTransition;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, r25> $popExitTransition;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, sie> $sizeTransform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(iba ibaVar, androidx.navigation.l lVar, androidx.compose.ui.e eVar, c20 c20Var, Function1<dd0<androidx.navigation.d>, lv4> function1, Function1<dd0<androidx.navigation.d>, r25> function12, Function1<dd0<androidx.navigation.d>, lv4> function13, Function1<dd0<androidx.navigation.d>, r25> function14, Function1<dd0<androidx.navigation.d>, sie> function15, int i, int i2) {
            super(2);
            this.$navController = ibaVar;
            this.$graph = lVar;
            this.$modifier = eVar;
            this.$contentAlignment = c20Var;
            this.$enterTransition = function1;
            this.$exitTransition = function12;
            this.$popEnterTransition = function13;
            this.$popExitTransition = function14;
            this.$sizeTransform = function15;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            nba.a(this.$navController, this.$graph, this.$modifier, this.$contentAlignment, this.$enterTransition, this.$exitTransition, this.$popEnterTransition, this.$popExitTransition, this.$sizeTransform, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class q extends mj8 implements Function1<dd0<androidx.navigation.d>, lv4> {
        public static final q a = new q(1);

        @Override // kotlin.jvm.functions.Function1
        public final lv4 invoke(dd0<androidx.navigation.d> dd0Var) {
            return ku4.d(zd0.d(700, 0, null, 6), 2);
        }
    }

    public static final class r extends mj8 implements Function1<dd0<androidx.navigation.d>, r25> {
        public static final r a = new r(1);

        @Override // kotlin.jvm.functions.Function1
        public final r25 invoke(dd0<androidx.navigation.d> dd0Var) {
            return ku4.e(zd0.d(700, 0, null, 6), 2);
        }
    }

    public static final class s extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ c20 $contentAlignment;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, lv4> $enterTransition;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, r25> $exitTransition;
        final /* synthetic */ androidx.navigation.l $graph;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ iba $navController;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, lv4> $popEnterTransition;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, r25> $popExitTransition;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, sie> $sizeTransform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(iba ibaVar, androidx.navigation.l lVar, androidx.compose.ui.e eVar, c20 c20Var, Function1<dd0<androidx.navigation.d>, lv4> function1, Function1<dd0<androidx.navigation.d>, r25> function12, Function1<dd0<androidx.navigation.d>, lv4> function13, Function1<dd0<androidx.navigation.d>, r25> function14, Function1<dd0<androidx.navigation.d>, sie> function15, int i, int i2) {
            super(2);
            this.$navController = ibaVar;
            this.$graph = lVar;
            this.$modifier = eVar;
            this.$contentAlignment = c20Var;
            this.$enterTransition = function1;
            this.$exitTransition = function12;
            this.$popEnterTransition = function13;
            this.$popExitTransition = function14;
            this.$sizeTransform = function15;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            nba.a(this.$navController, this.$graph, this.$modifier, this.$contentAlignment, this.$enterTransition, this.$exitTransition, this.$popEnterTransition, this.$popExitTransition, this.$sizeTransform, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class t extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ c20 $contentAlignment;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, lv4> $enterTransition;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, r25> $exitTransition;
        final /* synthetic */ androidx.navigation.l $graph;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ iba $navController;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, lv4> $popEnterTransition;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, r25> $popExitTransition;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, sie> $sizeTransform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(iba ibaVar, androidx.navigation.l lVar, androidx.compose.ui.e eVar, c20 c20Var, Function1<dd0<androidx.navigation.d>, lv4> function1, Function1<dd0<androidx.navigation.d>, r25> function12, Function1<dd0<androidx.navigation.d>, lv4> function13, Function1<dd0<androidx.navigation.d>, r25> function14, Function1<dd0<androidx.navigation.d>, sie> function15, int i, int i2) {
            super(2);
            this.$navController = ibaVar;
            this.$graph = lVar;
            this.$modifier = eVar;
            this.$contentAlignment = c20Var;
            this.$enterTransition = function1;
            this.$exitTransition = function12;
            this.$popEnterTransition = function13;
            this.$popExitTransition = function14;
            this.$sizeTransform = function15;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            nba.a(this.$navController, this.$graph, this.$modifier, this.$contentAlignment, this.$enterTransition, this.$exitTransition, this.$popEnterTransition, this.$popExitTransition, this.$sizeTransform, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class u extends mj8 implements Function1<dd0<androidx.navigation.d>, lv4> {
        final /* synthetic */ uk2 $composeNavigator;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, lv4> $enterTransition;
        final /* synthetic */ g4a<Boolean> $inPredictiveBack$delegate;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, lv4> $popEnterTransition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(uk2 uk2Var, Function1<dd0<androidx.navigation.d>, lv4> function1, Function1<dd0<androidx.navigation.d>, lv4> function12, g4a<Boolean> g4aVar) {
            super(1);
            this.$composeNavigator = uk2Var;
            this.$popEnterTransition = function1;
            this.$enterTransition = function12;
            this.$inPredictiveBack$delegate = g4aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final lv4 invoke(dd0<androidx.navigation.d> dd0Var) {
            dd0<androidx.navigation.d> dd0Var2 = dd0Var;
            androidx.navigation.k kVar = dd0Var2.a().b;
            kVar.getClass();
            uk2.a aVar = (uk2.a) kVar;
            boolean zBooleanValue = ((Boolean) ((gme) this.$composeNavigator.c).getValue()).booleanValue();
            androidx.navigation.j jVar = androidx.navigation.j.a;
            mv4 mv4Var = null;
            if (zBooleanValue || nba.d(this.$inPredictiveBack$delegate)) {
                int i = androidx.navigation.k.Z;
                Iterator it = v6e.O(aVar, jVar).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    androidx.navigation.k kVar2 = (androidx.navigation.k) it.next();
                    mv4 mv4Var2 = (!(kVar2 instanceof uk2.a) || ((uk2.a) kVar2).d0 == null) ? null : lv4.a;
                    if (mv4Var2 != null) {
                        mv4Var = mv4Var2;
                        break;
                    }
                }
                return mv4Var == null ? this.$popEnterTransition.invoke(dd0Var2) : mv4Var;
            }
            int i2 = androidx.navigation.k.Z;
            Iterator it2 = v6e.O(aVar, jVar).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                androidx.navigation.k kVar3 = (androidx.navigation.k) it2.next();
                mv4 mv4Var3 = (!(kVar3 instanceof uk2.a) || ((uk2.a) kVar3).b0 == null) ? null : lv4.a;
                if (mv4Var3 != null) {
                    mv4Var = mv4Var3;
                    break;
                }
            }
            return mv4Var == null ? this.$enterTransition.invoke(dd0Var2) : mv4Var;
        }
    }

    public static final class v extends mj8 implements Function1<dd0<androidx.navigation.d>, r25> {
        final /* synthetic */ uk2 $composeNavigator;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, r25> $exitTransition;
        final /* synthetic */ g4a<Boolean> $inPredictiveBack$delegate;
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, r25> $popExitTransition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(uk2 uk2Var, Function1<dd0<androidx.navigation.d>, r25> function1, Function1<dd0<androidx.navigation.d>, r25> function12, g4a<Boolean> g4aVar) {
            super(1);
            this.$composeNavigator = uk2Var;
            this.$popExitTransition = function1;
            this.$exitTransition = function12;
            this.$inPredictiveBack$delegate = g4aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final r25 invoke(dd0<androidx.navigation.d> dd0Var) {
            dd0<androidx.navigation.d> dd0Var2 = dd0Var;
            androidx.navigation.k kVar = dd0Var2.b().b;
            kVar.getClass();
            uk2.a aVar = (uk2.a) kVar;
            boolean zBooleanValue = ((Boolean) ((gme) this.$composeNavigator.c).getValue()).booleanValue();
            androidx.navigation.j jVar = androidx.navigation.j.a;
            s25 s25Var = null;
            if (zBooleanValue || nba.d(this.$inPredictiveBack$delegate)) {
                int i = androidx.navigation.k.Z;
                Iterator it = v6e.O(aVar, jVar).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    androidx.navigation.k kVar2 = (androidx.navigation.k) it.next();
                    s25 s25Var2 = (!(kVar2 instanceof uk2.a) || ((uk2.a) kVar2).e0 == null) ? null : r25.a;
                    if (s25Var2 != null) {
                        s25Var = s25Var2;
                        break;
                    }
                }
                return s25Var == null ? this.$popExitTransition.invoke(dd0Var2) : s25Var;
            }
            int i2 = androidx.navigation.k.Z;
            Iterator it2 = v6e.O(aVar, jVar).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                androidx.navigation.k kVar3 = (androidx.navigation.k) it2.next();
                s25 s25Var3 = (!(kVar3 instanceof uk2.a) || ((uk2.a) kVar3).c0 == null) ? null : r25.a;
                if (s25Var3 != null) {
                    s25Var = s25Var3;
                    break;
                }
            }
            return s25Var == null ? this.$exitTransition.invoke(dd0Var2) : s25Var;
        }
    }

    public static final class w extends mj8 implements Function1<dd0<androidx.navigation.d>, sie> {
        final /* synthetic */ Function1<dd0<androidx.navigation.d>, sie> $sizeTransform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(Function1<dd0<androidx.navigation.d>, sie> function1) {
            super(1);
            this.$sizeTransform = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final sie invoke(dd0<androidx.navigation.d> dd0Var) {
            dd0<androidx.navigation.d> dd0Var2 = dd0Var;
            androidx.navigation.k kVar = dd0Var2.a().b;
            kVar.getClass();
            int i = androidx.navigation.k.Z;
            for (androidx.navigation.k kVar2 : v6e.O((uk2.a) kVar, androidx.navigation.j.a)) {
            }
            Function1<dd0<androidx.navigation.d>, sie> function1 = this.$sizeTransform;
            if (function1 != null) {
                return function1.invoke(dd0Var2);
            }
            return null;
        }
    }

    public static final class x extends mj8 implements gu5<List<? extends androidx.navigation.d>> {
        final /* synthetic */ ese<List<androidx.navigation.d>> $allVisibleEntries$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(g4a g4aVar) {
            super(0);
            this.$allVisibleEntries$delegate = g4aVar;
        }

        @Override // defpackage.gu5
        public final List<? extends androidx.navigation.d> invoke() {
            List<androidx.navigation.d> value = this.$allVisibleEntries$delegate.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                if (wl7.b(((androidx.navigation.d) obj).b.a, "composable")) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:268:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f5  */
    @android.annotation.SuppressLint({"StateFlowValueCalledInComposition"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.iba r34, androidx.navigation.l r35, androidx.compose.ui.e r36, defpackage.c20 r37, kotlin.jvm.functions.Function1<defpackage.dd0<androidx.navigation.d>, defpackage.lv4> r38, kotlin.jvm.functions.Function1<defpackage.dd0<androidx.navigation.d>, defpackage.r25> r39, kotlin.jvm.functions.Function1<defpackage.dd0<androidx.navigation.d>, defpackage.lv4> r40, kotlin.jvm.functions.Function1<defpackage.dd0<androidx.navigation.d>, defpackage.r25> r41, kotlin.jvm.functions.Function1<defpackage.dd0<androidx.navigation.d>, defpackage.sie> r42, androidx.compose.runtime.b r43, int r44, int r45) {
        /*
            Method dump skipped, instruction units count: 1340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nba.a(iba, androidx.navigation.l, androidx.compose.ui.e, c20, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.iba r25, java.lang.Object r26, androidx.compose.ui.e r27, defpackage.c20 r28, defpackage.yd8<?> r29, java.util.Map<defpackage.zf8, androidx.navigation.r<?>> r30, kotlin.jvm.functions.Function1<defpackage.dd0<androidx.navigation.d>, defpackage.lv4> r31, kotlin.jvm.functions.Function1<defpackage.dd0<androidx.navigation.d>, defpackage.r25> r32, kotlin.jvm.functions.Function1<defpackage.dd0<androidx.navigation.d>, defpackage.lv4> r33, kotlin.jvm.functions.Function1<defpackage.dd0<androidx.navigation.d>, defpackage.r25> r34, kotlin.jvm.functions.Function1<defpackage.dd0<androidx.navigation.d>, defpackage.sie> r35, kotlin.jvm.functions.Function1<? super defpackage.gba, defpackage.j6g> r36, androidx.compose.runtime.b r37, int r38, int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nba.b(iba, java.lang.Object, androidx.compose.ui.e, c20, yd8, java.util.Map, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.b, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(defpackage.iba r25, java.lang.String r26, androidx.compose.ui.e r27, defpackage.c20 r28, java.lang.String r29, kotlin.jvm.functions.Function1<defpackage.dd0<androidx.navigation.d>, defpackage.lv4> r30, kotlin.jvm.functions.Function1<defpackage.dd0<androidx.navigation.d>, defpackage.r25> r31, kotlin.jvm.functions.Function1<defpackage.dd0<androidx.navigation.d>, defpackage.lv4> r32, kotlin.jvm.functions.Function1<defpackage.dd0<androidx.navigation.d>, defpackage.r25> r33, kotlin.jvm.functions.Function1<defpackage.dd0<androidx.navigation.d>, defpackage.sie> r34, kotlin.jvm.functions.Function1<? super defpackage.gba, defpackage.j6g> r35, androidx.compose.runtime.b r36, int r37, int r38, int r39) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nba.c(iba, java.lang.String, androidx.compose.ui.e, c20, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.b, int, int, int):void");
    }

    public static final boolean d(g4a<Boolean> g4aVar) {
        return g4aVar.getValue().booleanValue();
    }
}

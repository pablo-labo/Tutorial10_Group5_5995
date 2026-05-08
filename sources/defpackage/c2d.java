package defpackage;

import defpackage.kv8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class c2d {

    @uh3(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {83}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ Function2<e13, lu2<? super j6g>, Object> $block;
        final /* synthetic */ kv8.b $state;
        final /* synthetic */ kv8 $this_repeatOnLifecycle;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: c2d$a$a, reason: collision with other inner class name */
        @uh3(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {161}, m = "invokeSuspend")
        public static final class C0098a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ e13 $$this$coroutineScope;
            final /* synthetic */ Function2<e13, lu2<? super j6g>, Object> $block;
            final /* synthetic */ kv8.b $state;
            final /* synthetic */ kv8 $this_repeatOnLifecycle;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            Object L$5;
            int label;

            /* JADX INFO: renamed from: c2d$a$a$a, reason: collision with other inner class name */
            public static final class C0099a implements uv8 {
                public final /* synthetic */ Function2<e13, lu2<? super j6g>, Object> V;
                public final /* synthetic */ kv8.a a;
                public final /* synthetic */ luc<ex7> b;
                public final /* synthetic */ e13 c;
                public final /* synthetic */ kv8.a d;
                public final /* synthetic */ qw1 e;
                public final /* synthetic */ a5a f;

                /* JADX INFO: renamed from: c2d$a$a$a$a, reason: collision with other inner class name */
                @uh3(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {166, 110}, m = "invokeSuspend")
                public static final class C0100a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
                    final /* synthetic */ Function2<e13, lu2<? super j6g>, Object> $block;
                    final /* synthetic */ z4a $mutex;
                    Object L$0;
                    Object L$1;
                    int label;

                    /* JADX INFO: renamed from: c2d$a$a$a$a$a, reason: collision with other inner class name */
                    @uh3(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {110}, m = "invokeSuspend")
                    public static final class C0101a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
                        final /* synthetic */ Function2<e13, lu2<? super j6g>, Object> $block;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C0101a(Function2<? super e13, ? super lu2<? super j6g>, ? extends Object> function2, lu2<? super C0101a> lu2Var) {
                            super(2, lu2Var);
                            this.$block = function2;
                        }

                        @Override // defpackage.x81
                        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                            C0101a c0101a = new C0101a(this.$block, lu2Var);
                            c0101a.L$0 = obj;
                            return c0101a;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                            return ((C0101a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
                        }

                        @Override // defpackage.x81
                        public final Object invokeSuspend(Object obj) {
                            int i = this.label;
                            if (i == 0) {
                                r7d.b(obj);
                                e13 e13Var = (e13) this.L$0;
                                Function2<e13, lu2<? super j6g>, Object> function2 = this.$block;
                                this.label = 1;
                                Object objInvoke = function2.invoke(e13Var, this);
                                g13 g13Var = g13.a;
                                if (objInvoke == g13Var) {
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
                    public C0100a(z4a z4aVar, Function2<? super e13, ? super lu2<? super j6g>, ? extends Object> function2, lu2<? super C0100a> lu2Var) {
                        super(2, lu2Var);
                        this.$mutex = z4aVar;
                        this.$block = function2;
                    }

                    @Override // defpackage.x81
                    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                        return new C0100a(this.$mutex, this.$block, lu2Var);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                        return ((C0100a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
                    }

                    @Override // defpackage.x81
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        z4a z4aVar;
                        Function2<e13, lu2<? super j6g>, Object> function2;
                        Throwable th;
                        z4a z4aVar2;
                        int i = this.label;
                        g13 g13Var = g13.a;
                        try {
                            if (i == 0) {
                                r7d.b(obj);
                                z4aVar = this.$mutex;
                                function2 = this.$block;
                                this.L$0 = z4aVar;
                                this.L$1 = function2;
                                this.label = 1;
                                if (z4aVar.h(this) != g13Var) {
                                }
                                return g13Var;
                            }
                            if (i != 1) {
                                if (i != 2) {
                                    r6.g("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                z4aVar2 = (z4a) this.L$0;
                                try {
                                    r7d.b(obj);
                                    j6g j6gVar = j6g.a;
                                    z4aVar2.p(null);
                                    return j6g.a;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z4aVar2.p(null);
                                    throw th;
                                }
                            }
                            function2 = (Function2) this.L$1;
                            z4a z4aVar3 = (z4a) this.L$0;
                            r7d.b(obj);
                            z4aVar = z4aVar3;
                            C0101a c0101a = new C0101a(function2, null);
                            this.L$0 = z4aVar;
                            this.L$1 = null;
                            this.label = 2;
                            if (f13.d(c0101a, this) != g13Var) {
                                z4aVar2 = z4aVar;
                                j6g j6gVar2 = j6g.a;
                                z4aVar2.p(null);
                                return j6g.a;
                            }
                            return g13Var;
                        } catch (Throwable th3) {
                            z4a z4aVar4 = z4aVar;
                            th = th3;
                            z4aVar2 = z4aVar4;
                            z4aVar2.p(null);
                            throw th;
                        }
                    }
                }

                public C0099a(kv8.a aVar, luc lucVar, e13 e13Var, kv8.a aVar2, qw1 qw1Var, a5a a5aVar, Function2 function2) {
                    this.a = aVar;
                    this.b = lucVar;
                    this.c = e13Var;
                    this.d = aVar2;
                    this.e = qw1Var;
                    this.f = a5aVar;
                    this.V = function2;
                }

                /* JADX WARN: Type inference failed for: r3v3, types: [T, uqe] */
                @Override // defpackage.uv8
                public final void G(zv8 zv8Var, kv8.a aVar) {
                    kv8.a aVar2 = this.a;
                    luc<ex7> lucVar = this.b;
                    if (aVar == aVar2) {
                        lucVar.element = u63.Y(this.c, null, null, new C0100a(this.f, this.V, null), 3);
                        return;
                    }
                    if (aVar == this.d) {
                        ex7 ex7Var = lucVar.element;
                        if (ex7Var != null) {
                            ex7Var.h(null);
                        }
                        lucVar.element = null;
                    }
                    if (aVar == kv8.a.ON_DESTROY) {
                        this.e.resumeWith(j6g.a);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0098a(kv8 kv8Var, kv8.b bVar, e13 e13Var, Function2<? super e13, ? super lu2<? super j6g>, ? extends Object> function2, lu2<? super C0098a> lu2Var) {
                super(2, lu2Var);
                this.$this_repeatOnLifecycle = kv8Var;
                this.$state = bVar;
                this.$$this$coroutineScope = e13Var;
                this.$block = function2;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0098a(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0098a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00b9 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00cb  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x00dd  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
            /* JADX WARN: Removed duplicated region for block: B:60:? A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r2v6, types: [T, c2d$a$a$a, yv8] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.x81
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 236
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: c2d.a.C0098a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(kv8 kv8Var, kv8.b bVar, Function2<? super e13, ? super lu2<? super j6g>, ? extends Object> function2, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$this_repeatOnLifecycle = kv8Var;
            this.$state = bVar;
            this.$block = function2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$this_repeatOnLifecycle, this.$state, this.$block, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                e13 e13Var = (e13) this.L$0;
                eq3 eq3Var = a74.a;
                k89 k89VarJ1 = m89.a.J1();
                C0098a c0098a = new C0098a(this.$this_repeatOnLifecycle, this.$state, e13Var, this.$block, null);
                this.label = 1;
                Object objQ0 = u63.q0(k89VarJ1, c0098a, this);
                g13 g13Var = g13.a;
                if (objQ0 == g13Var) {
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

    public static final Object a(kv8 kv8Var, kv8.b bVar, Function2<? super e13, ? super lu2<? super j6g>, ? extends Object> function2, lu2<? super j6g> lu2Var) {
        Object objD;
        if (bVar != kv8.b.b) {
            return (kv8Var.b() != kv8.b.a && (objD = f13.d(new a(kv8Var, bVar, function2, null), lu2Var)) == g13.a) ? objD : j6g.a;
        }
        l5.q("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        return null;
    }

    public static final Object b(zv8 zv8Var, kv8.b bVar, Function2<? super e13, ? super lu2<? super j6g>, ? extends Object> function2, lu2<? super j6g> lu2Var) {
        Object objA = a(zv8Var.getLifecycle(), bVar, function2, lu2Var);
        return objA == g13.a ? objA : j6g.a;
    }
}

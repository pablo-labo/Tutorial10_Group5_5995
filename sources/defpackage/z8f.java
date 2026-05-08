package defpackage;

import defpackage.xh8;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class z8f implements xh8 {
    public final Lazy a = boa.E(qt8.a, new b(this));
    public boolean b;

    @uh3(c = "com.indeed.android.jobsearch.tare.TarePluginManager$handlePluginLifecycleMethod$1", f = "TarePluginManager.kt", l = {156}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ wu5<e13, jr7, lu2<? super j6g>, Object> $handler;
        final /* synthetic */ String $methodName;
        final /* synthetic */ Function2<jr7, Exception, j6g> $onPluginError;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: z8f$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.jobsearch.tare.TarePluginManager$handlePluginLifecycleMethod$1$1", f = "TarePluginManager.kt", l = {147}, m = "invokeSuspend")
        public static final class C0488a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ wu5<e13, jr7, lu2<? super j6g>, Object> $handler;
            final /* synthetic */ Function2<jr7, Exception, j6g> $onPluginError;
            final /* synthetic */ jr7 $plugin;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0488a(wu5<? super e13, ? super jr7, ? super lu2<? super j6g>, ? extends Object> wu5Var, jr7 jr7Var, Function2<? super jr7, ? super Exception, j6g> function2, lu2<? super C0488a> lu2Var) {
                super(2, lu2Var);
                this.$handler = wu5Var;
                this.$plugin = jr7Var;
                this.$onPluginError = function2;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                C0488a c0488a = new C0488a(this.$handler, this.$plugin, this.$onPluginError, lu2Var);
                c0488a.L$0 = obj;
                return c0488a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0488a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v7 */
            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                e13 e13Var = (e13) this.L$0;
                int i = this.label;
                try {
                    if (i == 0) {
                        r7d.b(obj);
                        wu5<e13, jr7, lu2<? super j6g>, Object> wu5Var = this.$handler;
                        jr7 jr7Var = this.$plugin;
                        this.L$0 = null;
                        this.label = 1;
                        Object objQ = wu5Var.q(e13Var, jr7Var, this);
                        g13 g13Var = g13.a;
                        this = objQ;
                        if (objQ == g13Var) {
                            return g13Var;
                        }
                    } else {
                        if (i != 1) {
                            r6.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r7d.b(obj);
                        this = this;
                    }
                } catch (Exception e) {
                    this.$onPluginError.invoke(this.$plugin, e);
                }
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, wu5<? super e13, ? super jr7, ? super lu2<? super j6g>, ? extends Object> wu5Var, Function2<? super jr7, ? super Exception, j6g> function2, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$methodName = str;
            this.$handler = wu5Var;
            this.$onPluginError = function2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = z8f.this.new a(this.$methodName, this.$handler, this.$onPluginError, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            e13 e13Var = (e13) this.L$0;
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    ArrayList arrayList = new ArrayList();
                    z8f.this.getClass();
                    Iterator it = ((qpd) xh8.a.a().a.b).b(fwc.a.b(jr7.class)).iterator();
                    while (it.hasNext()) {
                        arrayList.add(u63.l(e13Var, null, new C0488a(this.$handler, (jr7) it.next(), this.$onPluginError, null), 3));
                    }
                    ArrayList arrayList2 = lz2.a;
                    lz2.d("TarePluginManager", "requests kicked off", false, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    Object objI = ka2.i(arrayList, this);
                    g13 g13Var = g13.a;
                    if (objI == g13Var) {
                        return g13Var;
                    }
                } else {
                    if (i != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                }
                ArrayList arrayList3 = lz2.a;
                lz2.d("TarePluginManager", "requests completed", false, null);
            } catch (Exception e) {
                ArrayList arrayList4 = lz2.a;
                lz2.b("TarePluginManager", this.$methodName + " error", false, e);
            }
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements gu5<t49> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(z8f z8fVar) {
            super(0);
            this.$this_inject = z8fVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, t49] */
        @Override // defpackage.gu5
        public final t49 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(t49.class), a9cVar);
        }
    }

    public static void b(String str, jr7 jr7Var, Exception exc) {
        ArrayList arrayList = lz2.a;
        lz2.b("TarePluginManager", z3.m(str, " error in ", jr7Var.getClass().getName()), false, exc);
    }

    public final void a(String str, wu5<? super e13, ? super jr7, ? super lu2<? super j6g>, ? extends Object> wu5Var, Function2<? super jr7, ? super Exception, j6g> function2) {
        if (((qpd) xh8.a.a().a.b).b(fwc.a.b(jr7.class)).isEmpty()) {
            ArrayList arrayList = lz2.a;
            lz2.d("TarePluginManager", str.concat(" skipped: no registered plugins"), false, null);
        } else {
            ArrayList arrayList2 = lz2.a;
            lz2.d("TarePluginManager", str.concat(" start"), false, null);
            u63.Y(f13.b(), null, null, new a(str, wu5Var, function2, null), 3);
            lz2.d("TarePluginManager", str.concat(" end"), false, null);
        }
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}

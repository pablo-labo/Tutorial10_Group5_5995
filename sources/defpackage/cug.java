package defpackage;

import com.apollographql.apollo.exception.DefaultApolloException;
import defpackage.k15;
import defpackage.pua;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class cug implements ph0, uh0 {
    public final fl3 a;

    public static final class a implements vi5<Object> {
        public final /* synthetic */ jxe a;
        public final /* synthetic */ luc b;

        /* JADX INFO: renamed from: cug$a$a, reason: collision with other inner class name */
        public static final class C0200a<T> implements wi5 {
            public final /* synthetic */ wi5 a;
            public final /* synthetic */ luc b;

            /* JADX INFO: renamed from: cug$a$a$a, reason: collision with other inner class name */
            @uh3(c = "com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$filter$1$2", f = "WatcherInterceptor.kt", l = {50}, m = "emit", v = 1)
            public static final class C0201a extends pu2 {
                Object L$0;
                Object L$1;
                int label;
                /* synthetic */ Object result;

                public C0201a(lu2 lu2Var) {
                    super(lu2Var);
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return C0200a.this.a(null, this);
                }
            }

            public C0200a(wi5 wi5Var, luc lucVar) {
                this.a = wi5Var;
                this.b = lucVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // defpackage.wi5
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r5, defpackage.lu2 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof cug.a.C0200a.C0201a
                    if (r0 == 0) goto L13
                    r0 = r6
                    cug$a$a$a r0 = (cug.a.C0200a.C0201a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    cug$a$a$a r0 = new cug$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.result
                    int r1 = r0.label
                    r2 = 1
                    if (r1 == 0) goto L2c
                    if (r1 != r2) goto L25
                    defpackage.r7d.b(r6)
                    goto L5e
                L25:
                    java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r4)
                    r4 = 0
                    return r4
                L2c:
                    defpackage.r7d.b(r6)
                    boolean r6 = r5 instanceof java.util.Set
                    if (r6 == 0) goto L51
                    th0$a r6 = defpackage.th0.a
                    r6.getClass()
                    th0$a$a r6 = th0.a.b
                    if (r5 == r6) goto L51
                    luc r6 = r4.b
                    T r6 = r6.element
                    if (r6 == 0) goto L51
                    r1 = r5
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.lang.Iterable r6 = (java.lang.Iterable) r6
                    java.util.Set r6 = defpackage.z92.T0(r1, r6)
                    boolean r6 = r6.isEmpty()
                    if (r6 != 0) goto L5e
                L51:
                    r0.label = r2
                    wi5 r4 = r4.a
                    java.lang.Object r4 = r4.a(r5, r0)
                    g13 r5 = defpackage.g13.a
                    if (r4 != r5) goto L5e
                    return r5
                L5e:
                    j6g r4 = defpackage.j6g.a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: cug.a.C0200a.a(java.lang.Object, lu2):java.lang.Object");
            }
        }

        public a(jxe jxeVar, luc lucVar) {
            this.a = jxeVar;
            this.b = lucVar;
        }

        @Override // defpackage.vi5
        public final Object e(wi5<? super Object> wi5Var, lu2 lu2Var) {
            this.a.e(new C0200a(wi5Var, this.b), lu2Var);
            return g13.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    public static final class b<D> implements vi5<vi5<? extends sh0<D>>> {
        public final /* synthetic */ a a;
        public final /* synthetic */ rh0 b;
        public final /* synthetic */ qh0 c;
        public final /* synthetic */ luc d;
        public final /* synthetic */ cug e;
        public final /* synthetic */ lb3 f;

        public static final class a<T> implements wi5 {
            public final /* synthetic */ wi5 a;
            public final /* synthetic */ rh0 b;
            public final /* synthetic */ qh0 c;
            public final /* synthetic */ luc d;
            public final /* synthetic */ cug e;
            public final /* synthetic */ lb3 f;

            /* JADX INFO: renamed from: cug$b$a$a, reason: collision with other inner class name */
            @uh3(c = "com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$map$1$2", f = "WatcherInterceptor.kt", l = {50}, m = "emit", v = 1)
            public static final class C0202a extends pu2 {
                Object L$0;
                int label;
                /* synthetic */ Object result;

                public C0202a(lu2 lu2Var) {
                    super(lu2Var);
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return a.this.a(null, this);
                }
            }

            public a(wi5 wi5Var, rh0 rh0Var, qh0 qh0Var, luc lucVar, cug cugVar, lb3 lb3Var) {
                this.a = wi5Var;
                this.b = rh0Var;
                this.c = qh0Var;
                this.d = lucVar;
                this.e = cugVar;
                this.f = lb3Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
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
            @Override // defpackage.wi5
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r13, defpackage.lu2 r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof cug.b.a.C0202a
                    if (r0 == 0) goto L13
                    r0 = r14
                    cug$b$a$a r0 = (cug.b.a.C0202a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    cug$b$a$a r0 = new cug$b$a$a
                    r0.<init>(r14)
                L18:
                    java.lang.Object r14 = r0.result
                    int r1 = r0.label
                    r2 = 1
                    if (r1 == 0) goto L2c
                    if (r1 != r2) goto L25
                    defpackage.r7d.b(r14)
                    goto L7e
                L25:
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r12)
                    r12 = 0
                    return r12
                L2c:
                    defpackage.r7d.b(r14)
                    j6g r14 = defpackage.j6g.a
                    boolean r13 = defpackage.wl7.b(r13, r14)
                    rh0 r14 = r12.b
                    if (r13 == 0) goto L57
                    pua<D extends pua$a> r5 = r14.a
                    java.util.UUID r4 = r14.b
                    r5.getClass()
                    r4.getClass()
                    com.apollographql.apollo.exception.DefaultApolloException r8 = defpackage.eug.a
                    sh0 r3 = new sh0
                    r6 = 0
                    r7 = 0
                    bs4 r9 = defpackage.bs4.a
                    wr4 r10 = defpackage.wr4.a
                    r11 = 0
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                    gj5 r13 = new gj5
                    r13.<init>(r3)
                    goto L71
                L57:
                    qh0 r13 = r12.c
                    vi5 r13 = r13.a(r14)
                    cug$d r3 = new cug$d
                    lb3 r7 = r12.f
                    r8 = 0
                    luc r4 = r12.d
                    cug r5 = r12.e
                    rh0 r6 = r12.b
                    r3.<init>(r4, r5, r6, r7, r8)
                    pk5 r14 = new pk5
                    r14.<init>(r13, r3)
                    r13 = r14
                L71:
                    r0.label = r2
                    wi5 r12 = r12.a
                    java.lang.Object r12 = r12.a(r13, r0)
                    g13 r13 = defpackage.g13.a
                    if (r12 != r13) goto L7e
                    return r13
                L7e:
                    j6g r12 = defpackage.j6g.a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: cug.b.a.a(java.lang.Object, lu2):java.lang.Object");
            }
        }

        public b(a aVar, rh0 rh0Var, qh0 qh0Var, luc lucVar, cug cugVar, lb3 lb3Var) {
            this.a = aVar;
            this.b = rh0Var;
            this.c = qh0Var;
            this.d = lucVar;
            this.e = cugVar;
            this.f = lb3Var;
        }

        @Override // defpackage.vi5
        public final Object e(wi5 wi5Var, lu2 lu2Var) {
            Object objE = this.a.e(new a(wi5Var, this.b, this.c, this.d, this.e, this.f), lu2Var);
            return objE == g13.a ? objE : j6g.a;
        }
    }

    @uh3(c = "com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$2", f = "WatcherInterceptor.kt", l = {42}, m = "invokeSuspend", v = 1)
    public static final class c extends c1f implements Function2<wi5<? super Object>, lu2<? super j6g>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            c cVar = new c(2, lu2Var);
            cVar.L$0 = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(wi5<? super Object> wi5Var, lu2<? super j6g> lu2Var) {
            return ((c) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                wi5 wi5Var = (wi5) this.L$0;
                j6g j6gVar = j6g.a;
                this.label = 1;
                Object objA = wi5Var.a(j6gVar, this);
                g13 g13Var = g13.a;
                if (objA == g13Var) {
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

    /* JADX INFO: Add missing generic type declarations: [D] */
    @uh3(c = "com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$4$1", f = "WatcherInterceptor.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d<D> extends c1f implements Function2<sh0<D>, lu2<? super j6g>, Object> {
        final /* synthetic */ lb3 $customScalarAdapters;
        final /* synthetic */ rh0<D> $request;
        final /* synthetic */ luc<Set<String>> $watchedKeys;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ cug this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(luc<Set<String>> lucVar, cug cugVar, rh0<D> rh0Var, lb3 lb3Var, lu2<? super d> lu2Var) {
            super(2, lu2Var);
            this.$watchedKeys = lucVar;
            this.this$0 = cugVar;
            this.$request = rh0Var;
            this.$customScalarAdapters = lb3Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            d dVar = new d(this.$watchedKeys, this.this$0, this.$request, this.$customScalarAdapters, lu2Var);
            dVar.L$0 = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, lu2<? super j6g> lu2Var) {
            return ((d) create((sh0) obj, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            T tE1;
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            D d = ((sh0) this.L$0).c;
            if (d != 0) {
                luc<Set<String>> lucVar = this.$watchedKeys;
                fl3 fl3Var = this.this$0.a;
                pua<D> puaVar = this.$request.a;
                lb3 lb3Var = this.$customScalarAdapters;
                puaVar.getClass();
                lb3Var.getClass();
                Collection collectionValues = qua.a(puaVar, d, lb3Var, fl3Var.b).values();
                if (collectionValues != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        w92.w0(arrayList, ((gtc) it.next()).a());
                    }
                    tE1 = z92.E1(arrayList);
                } else {
                    tE1 = is4.a;
                }
                lucVar.element = tE1;
            }
            return j6g.a;
        }
    }

    public cug(fl3 fl3Var) {
        this.a = fl3Var;
    }

    @Override // defpackage.ph0
    public final <D extends pua.a> vi5<sh0<D>> a(rh0<D> rh0Var, qh0 qh0Var) {
        rh0Var.getClass();
        qh0Var.getClass();
        k15 k15Var = rh0Var.c;
        if (((bug) k15Var.c(bug.a)) == null) {
            return qh0Var.a(rh0Var);
        }
        if (!(rh0Var.a instanceof c9c)) {
            r6.g("It's impossible to watch a mutation or subscription");
            return null;
        }
        k15.a aVarC = k15Var.c(lb3.f);
        aVarC.getClass();
        lb3 lb3Var = (lb3) aVarC;
        luc lucVar = new luc();
        lucVar.element = null;
        pqc pqcVar = this.a.e;
        pqcVar.getClass();
        b bVar = new b(new a(new jxe(pqcVar, new c(2, null)), lucVar), rh0Var, qh0Var, lucVar, this, lb3Var);
        DefaultApolloException defaultApolloException = eug.a;
        return new kjd(new dug(bVar, null));
    }
}

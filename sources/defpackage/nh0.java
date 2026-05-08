package defpackage;

import defpackage.lh0;
import defpackage.rh0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.apollographql.apollo.ApolloClient$executeAsFlowInternal$flow$1", f = "ApolloClient.kt", l = {264}, m = "invokeSuspend", v = 1)
public final class nh0 extends c1f implements Function2<upb<? super sh0<Object>>, lu2<? super j6g>, Object> {
    final /* synthetic */ rh0<Object> $apolloRequest;
    final /* synthetic */ boolean $throwing;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ lh0 this$0;

    @uh3(c = "com.apollographql.apollo.ApolloClient$executeAsFlowInternal$flow$1$2", f = "ApolloClient.kt", l = {265}, m = "invokeSuspend", v = 1)
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ upb<sh0<Object>> $$this$channelFlow;
        final /* synthetic */ rh0<Object> $apolloRequest;
        final /* synthetic */ boolean $throwing;
        int label;
        final /* synthetic */ lh0 this$0;

        /* JADX INFO: renamed from: nh0$a$a, reason: collision with other inner class name */
        public static final class C0333a<T> implements wi5 {
            public final /* synthetic */ upb<sh0<Object>> a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0333a(upb<? super sh0<Object>> upbVar) {
                this.a = upbVar;
            }

            @Override // defpackage.wi5
            public final Object a(Object obj, lu2 lu2Var) {
                Object objB = this.a.b(lu2Var, (sh0) obj);
                return objB == g13.a ? objB : j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(lh0 lh0Var, rh0<Object> rh0Var, boolean z, upb<? super sh0<Object>> upbVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.this$0 = lh0Var;
            this.$apolloRequest = rh0Var;
            this.$throwing = z;
            this.$$this$channelFlow = upbVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.this$0, this.$apolloRequest, this.$throwing, this.$$this$channelFlow, lu2Var);
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
                lh0 lh0Var = this.this$0;
                rh0<Object> rh0Var = this.$apolloRequest;
                boolean z = this.$throwing;
                lh0.a aVar = lh0Var.a;
                rh0Var.getClass();
                rh0.a<D> aVarA = rh0Var.a();
                k15 k15VarD = lh0Var.b.d(lh0Var.e).d(lh0Var.W).d(aVarA.c);
                k15VarD.getClass();
                aVarA.c = k15VarD;
                sl6 sl6Var = aVarA.d;
                if (sl6Var == null) {
                    sl6Var = null;
                }
                aVarA.d = sl6Var;
                Boolean bool = aVarA.g;
                if (bool == null) {
                    bool = null;
                }
                aVarA.g = bool;
                Boolean bool2 = aVarA.h;
                if (bool2 == null) {
                    bool2 = null;
                }
                aVarA.h = bool2;
                Boolean bool3 = aVarA.f;
                if (bool3 == null) {
                    bool3 = null;
                }
                aVarA.f = bool3;
                iy8 iy8VarS = u63.s();
                List<nl6> list = lh0Var.X;
                List<nl6> list2 = zr4.a;
                if (list == null) {
                    list = list2;
                }
                iy8VarS.addAll(list);
                List<nl6> list3 = aVarA.e;
                if (list3 != null) {
                    list2 = list3;
                }
                iy8VarS.addAll(list2);
                aVarA.e = iy8VarS.l();
                Boolean bool4 = aVarA.i;
                if (bool4 == null) {
                    bool4 = null;
                }
                aVarA.i = bool4;
                Boolean bool5 = aVarA.j;
                if (bool5 == null) {
                    bool5 = null;
                }
                aVarA.j = bool5;
                aVarA.k = lh0Var.V;
                rh0 rh0VarB = aVarA.b();
                iy8 iy8VarS2 = u63.s();
                iy8VarS2.addAll(aVar.b);
                iy8VarS2.addAll(aVar.c);
                iy8VarS2.addAll(aVar.d);
                int i2 = ead.a;
                iy8VarS2.add(new com.apollographql.apollo.interceptor.a());
                iy8VarS2.addAll(aVar.e);
                iy8VarS2.add(lh0Var.Y);
                iy8 iy8VarL = iy8VarS2.l();
                iy8VarL.getClass();
                if (iy8VarL.a() <= 0) {
                    r6.g("Check failed.");
                    return null;
                }
                vi5 vi5VarA = ((ph0) iy8VarL.get(0)).a(rh0VarB, new lo3(iy8VarL, 1));
                if (z) {
                    vi5VarA = new pk5(vi5VarA, new mh0(2, null));
                }
                C0333a c0333a = new C0333a(this.$$this$channelFlow);
                this.label = 1;
                Object objE = vi5VarA.e(c0333a, this);
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
    public nh0(lh0 lh0Var, rh0<Object> rh0Var, boolean z, lu2<? super nh0> lu2Var) {
        super(2, lu2Var);
        this.this$0 = lh0Var;
        this.$apolloRequest = rh0Var;
        this.$throwing = z;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        nh0 nh0Var = new nh0(this.this$0, this.$apolloRequest, this.$throwing, lu2Var);
        nh0Var.L$0 = obj;
        return nh0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(upb<? super sh0<Object>> upbVar, lu2<? super j6g> lu2Var) {
        return ((nh0) create(upbVar, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.Iterator] */
    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                r7d.b(obj);
                upb upbVar = (upb) this.L$0;
                Iterator it = this.this$0.f.iterator();
                while (it.hasNext()) {
                    ((oh0) it.next()).b();
                }
                lh0 lh0Var = this.this$0;
                y03 y03Var = lh0Var.b.a;
                a aVar = new a(lh0Var, this.$apolloRequest, this.$throwing, upbVar, null);
                this.label = 1;
                Object objQ0 = u63.q0(y03Var, aVar, this);
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
            this = this.this$0.f.iterator();
            while (this.hasNext()) {
                ((oh0) this.next()).a();
            }
            return j6g.a;
        } catch (Throwable th) {
            Iterator it2 = this.this$0.f.iterator();
            while (it2.hasNext()) {
                ((oh0) it2.next()).a();
            }
            throw th;
        }
    }
}

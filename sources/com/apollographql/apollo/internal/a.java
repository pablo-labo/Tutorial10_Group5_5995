package com.apollographql.apollo.internal;

import defpackage.c1f;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.pu2;
import defpackage.r6;
import defpackage.r7d;
import defpackage.uh3;
import defpackage.vi5;
import defpackage.wi5;
import defpackage.wu5;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.apollographql.apollo.internal.FlowsKt$transformWhile$1", f = "flows.kt", l = {61}, m = "invokeSuspend", v = 1)
public final class a extends c1f implements Function2<wi5<Object>, lu2<? super j6g>, Object> {
    final /* synthetic */ vi5<Object> $this_transformWhile;
    final /* synthetic */ wu5<wi5<Object>, Object, lu2<? super Boolean>, Object> $transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: com.apollographql.apollo.internal.a$a, reason: collision with other inner class name */
    public static final class C0111a implements wi5<Object> {
        public final /* synthetic */ wu5 a;
        public final /* synthetic */ wi5 b;

        /* JADX INFO: renamed from: com.apollographql.apollo.internal.a$a$a, reason: collision with other inner class name */
        @uh3(c = "com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "flows.kt", l = {53}, m = "emit", v = 1)
        public static final class C0112a extends pu2 {
            int label;
            /* synthetic */ Object result;

            public C0112a(lu2 lu2Var) {
                super(lu2Var);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return C0111a.this.a(null, this);
            }
        }

        public C0111a(wu5 wu5Var, wi5 wi5Var) {
            this.a = wu5Var;
            this.b = wi5Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // defpackage.wi5
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(java.lang.Object r5, defpackage.lu2<? super defpackage.j6g> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.apollographql.apollo.internal.a.C0111a.C0112a
                if (r0 == 0) goto L13
                r0 = r6
                com.apollographql.apollo.internal.a$a$a r0 = (com.apollographql.apollo.internal.a.C0111a.C0112a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.apollographql.apollo.internal.a$a$a r0 = new com.apollographql.apollo.internal.a$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.result
                int r1 = r0.label
                r2 = 1
                if (r1 == 0) goto L2c
                if (r1 != r2) goto L25
                defpackage.r7d.b(r6)
                goto L3e
            L25:
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r4)
                r4 = 0
                return r4
            L2c:
                defpackage.r7d.b(r6)
                r0.label = r2
                wu5 r6 = r4.a
                wi5 r1 = r4.b
                java.lang.Object r6 = r6.q(r1, r5, r0)
                g13 r5 = defpackage.g13.a
                if (r6 != r5) goto L3e
                return r5
            L3e:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r5 = r6.booleanValue()
                if (r5 == 0) goto L49
                j6g r4 = defpackage.j6g.a
                return r4
            L49:
                com.apollographql.apollo.internal.AbortFlowException r5 = new com.apollographql.apollo.internal.AbortFlowException
                r5.<init>(r4)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.internal.a.C0111a.a(java.lang.Object, lu2):java.lang.Object");
        }
    }

    public static final class b<T> implements wi5 {
        public final /* synthetic */ C0111a a;

        public b(C0111a c0111a) {
            this.a = c0111a;
        }

        @Override // defpackage.wi5
        public final Object a(T t, lu2<? super j6g> lu2Var) {
            Object objA = this.a.a(t, lu2Var);
            return objA == g13.a ? objA : j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(vi5<Object> vi5Var, wu5<? super wi5<Object>, Object, ? super lu2<? super Boolean>, ? extends Object> wu5Var, lu2<? super a> lu2Var) {
        super(2, lu2Var);
        this.$this_transformWhile = vi5Var;
        this.$transform = wu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        a aVar = new a(this.$this_transformWhile, this.$transform, lu2Var);
        aVar.L$0 = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<Object> wi5Var, lu2<? super j6g> lu2Var) {
        return ((a) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        C0111a c0111a;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            wi5 wi5Var = (wi5) this.L$0;
            vi5<Object> vi5Var = this.$this_transformWhile;
            C0111a c0111a2 = new C0111a(this.$transform, wi5Var);
            try {
                b bVar = new b(c0111a2);
                this.L$0 = c0111a2;
                this.label = 1;
                Object objE = vi5Var.e(bVar, this);
                g13 g13Var = g13.a;
                if (objE == g13Var) {
                    return g13Var;
                }
            } catch (AbortFlowException e) {
                e = e;
                c0111a = c0111a2;
                e.a(c0111a);
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0111a = (C0111a) this.L$0;
            try {
                r7d.b(obj);
            } catch (AbortFlowException e2) {
                e = e2;
                e.a(c0111a);
            }
        }
        return j6g.a;
    }
}

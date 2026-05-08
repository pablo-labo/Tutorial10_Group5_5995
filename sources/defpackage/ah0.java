package defpackage;

import defpackage.c9c;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ah0 {
    public final lh0 a;

    @uh3(c = "com.indeed.android.myjobs.onegraph.tasks.ApolloApiExecutor", f = "ApolloApiExecutor.kt", l = {25}, m = "execute")
    public static final class a<D extends c9c.a> extends pu2 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(lu2<? super a> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ah0.this.b(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    @uh3(c = "com.indeed.android.myjobs.onegraph.tasks.ApolloApiExecutor$execute$response$1", f = "ApolloApiExecutor.kt", l = {26}, m = "invokeSuspend")
    public static final class b<D> extends c1f implements Function2<e13, lu2<? super sh0<D>>, Object> {
        final /* synthetic */ c9c<D> $query;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c9c<D> c9cVar, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$query = c9cVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return ah0.this.new b(this.$query, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, Object obj) {
            return ((b) create(e13Var, (lu2) obj)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    r7d.b(obj);
                    return obj;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            lh0 lh0Var = ah0.this.a;
            c9c<D> c9cVar = this.$query;
            lh0Var.getClass();
            c9cVar.getClass();
            kh0 kh0Var = new kh0(lh0Var, c9cVar);
            this.label = 1;
            Object objB = kh0Var.b(this);
            g13 g13Var = g13.a;
            return objB == g13Var ? g13Var : objB;
        }
    }

    public ah0(lh0 lh0Var) {
        lh0Var.getClass();
        this.a = lh0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.k43 r7, defpackage.pu2 r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.bh0
            if (r0 == 0) goto L13
            r0 = r8
            bh0 r0 = (defpackage.bh0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            bh0 r0 = new bh0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L2a
            java.lang.Object r6 = r0.L$0
            p4a r6 = (defpackage.p4a) r6
            defpackage.r7d.b(r8)     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            goto L49
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r3
        L30:
            defpackage.r7d.b(r8)
            eq3 r8 = defpackage.a74.a     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            no3 r8 = defpackage.no3.c     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            ch0 r1 = new ch0     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            r1.<init>(r6, r7, r3)     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            r0.L$0 = r3     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            r0.label = r2     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            java.lang.Object r8 = defpackage.u63.q0(r8, r1, r0)     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            g13 r6 = defpackage.g13.a
            if (r8 != r6) goto L49
            return r6
        L49:
            sh0 r8 = (defpackage.sh0) r8     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            D extends pua$a r6 = r8.c     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            java.util.List<iw4> r7 = r8.d
            if (r6 == 0) goto L67
            r6 = r7
            java.util.Collection r6 = (java.util.Collection) r6     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            if (r6 == 0) goto L5c
            boolean r6 = r6.isEmpty()     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            if (r6 == 0) goto L67
        L5c:
            ub6$c r6 = new ub6$c     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            D extends pua$a r7 = r8.c     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            r7.getClass()     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            r6.<init>(r7)     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            return r6
        L67:
            if (r7 == 0) goto L7c
            r0 = r7
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            dc r4 = new dc     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            r6 = 2
            r4.<init>(r6)     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            r5 = 31
            r1 = 0
            r2 = 0
            r3 = 0
            java.lang.String r6 = defpackage.z92.W0(r0, r1, r2, r3, r4, r5)     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            goto L7e
        L7c:
            java.lang.String r6 = "Unknown GraphQL error"
        L7e:
            ub6$a r7 = new ub6$a     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            r7.<init>(r6)     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            return r7
        L84:
            r0 = move-exception
            r6 = r0
            goto L8a
        L87:
            ub6$d r6 = ub6.d.a
            goto La3
        L8a:
            java.lang.Throwable r7 = r6.getCause()
            boolean r7 = r7 instanceof java.io.IOException
            if (r7 == 0) goto L95
            ub6$b r6 = ub6.b.a
            goto La3
        L95:
            ub6$a r7 = new ub6$a
            java.lang.String r8 = r6.getMessage()
            if (r8 != 0) goto L9f
            java.lang.String r8 = "ApolloException occurred"
        L9f:
            r7.<init>(r8, r6)
            r6 = r7
        La3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah0.a(k43, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <D extends c9c.a> java.lang.Object b(defpackage.c9c<D> r7, defpackage.lu2<? super defpackage.ub6<? extends D>> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ah0.a
            if (r0 == 0) goto L13
            r0 = r8
            ah0$a r0 = (ah0.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ah0$a r0 = new ah0$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L2a
            java.lang.Object r6 = r0.L$0
            c9c r6 = (defpackage.c9c) r6
            defpackage.r7d.b(r8)     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            goto L49
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r3
        L30:
            defpackage.r7d.b(r8)
            eq3 r8 = defpackage.a74.a     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            no3 r8 = defpackage.no3.c     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            ah0$b r1 = new ah0$b     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            r1.<init>(r7, r3)     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            r0.L$0 = r3     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            r0.label = r2     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            java.lang.Object r8 = defpackage.u63.q0(r8, r1, r0)     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            g13 r6 = defpackage.g13.a
            if (r8 != r6) goto L49
            return r6
        L49:
            sh0 r8 = (defpackage.sh0) r8     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            D extends pua$a r6 = r8.c     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            java.util.List<iw4> r7 = r8.d
            if (r6 == 0) goto L67
            r6 = r7
            java.util.Collection r6 = (java.util.Collection) r6     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            if (r6 == 0) goto L5c
            boolean r6 = r6.isEmpty()     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            if (r6 == 0) goto L67
        L5c:
            ub6$c r6 = new ub6$c     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            D extends pua$a r7 = r8.c     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            r7.getClass()     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            r6.<init>(r7)     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            return r6
        L67:
            if (r7 == 0) goto L7c
            r0 = r7
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            hs r4 = new hs     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            r6 = 2
            r4.<init>(r6)     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            r5 = 31
            r1 = 0
            r2 = 0
            r3 = 0
            java.lang.String r6 = defpackage.z92.W0(r0, r1, r2, r3, r4, r5)     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            goto L7e
        L7c:
            java.lang.String r6 = "Unknown GraphQL error"
        L7e:
            ub6$a r7 = new ub6$a     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            r7.<init>(r6)     // Catch: com.apollographql.apollo.exception.ApolloException -> L84 java.lang.Exception -> L87
            return r7
        L84:
            r0 = move-exception
            r6 = r0
            goto L8a
        L87:
            ub6$d r6 = ub6.d.a
            goto La3
        L8a:
            java.lang.Throwable r7 = r6.getCause()
            boolean r7 = r7 instanceof java.io.IOException
            if (r7 == 0) goto L95
            ub6$b r6 = ub6.b.a
            goto La3
        L95:
            ub6$a r7 = new ub6$a
            java.lang.String r8 = r6.getMessage()
            if (r8 != 0) goto L9f
            java.lang.String r8 = "ApolloException occurred"
        L9f:
            r7.<init>(r8, r6)
            r6 = r7
        La3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah0.b(c9c, lu2):java.lang.Object");
    }
}

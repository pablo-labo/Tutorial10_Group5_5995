package defpackage;

import com.apollographql.apollo.exception.ApolloException;
import defpackage.p4a;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$interceptMutation$1", f = "ApolloCacheInterceptor.kt", l = {144, 165, 182, 187}, m = "invokeSuspend", v = 1)
public final class dh0 extends c1f implements Function2<wi5<? super sh0<Object>>, lu2<? super j6g>, Object> {
    final /* synthetic */ qh0 $chain;
    final /* synthetic */ lb3 $customScalarAdapters;
    final /* synthetic */ rh0<Object> $request;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ih0 this$0;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ wi5<sh0<Object>> V;
        public final /* synthetic */ p4a.a a;
        public final /* synthetic */ luc<sh0<Object>> b;
        public final /* synthetic */ luc<Set<String>> c;
        public final /* synthetic */ ih0 d;
        public final /* synthetic */ rh0<Object> e;
        public final /* synthetic */ lb3 f;

        /* JADX INFO: renamed from: dh0$a$a, reason: collision with other inner class name */
        @uh3(c = "com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$interceptMutation$1$1", f = "ApolloCacheInterceptor.kt", l = {171, 176, 177}, m = "emit", v = 1)
        public static final class C0208a extends pu2 {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ a<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0208a(a<? super T> aVar, lu2<? super C0208a> lu2Var) {
                super(lu2Var);
                this.this$0 = aVar;
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.a(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(p4a.a aVar, luc<sh0<Object>> lucVar, luc<Set<String>> lucVar2, ih0 ih0Var, rh0<Object> rh0Var, lb3 lb3Var, wi5<? super sh0<Object>> wi5Var) {
            this.a = aVar;
            this.b = lucVar;
            this.c = lucVar2;
            this.d = ih0Var;
            this.e = rh0Var;
            this.f = lb3Var;
            this.V = wi5Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x00b4, code lost:
        
            if (r10.V.a(r11, r6) != r9) goto L43;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v15 */
        /* JADX WARN: Type inference failed for: r0v16 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r10v2, types: [wi5, wi5<sh0<java.lang.Object>>] */
        /* JADX WARN: Type inference failed for: r11v0, types: [T, java.lang.Object, sh0<java.lang.Object>] */
        /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v15 */
        /* JADX WARN: Type inference failed for: r11v16 */
        /* JADX WARN: Type inference failed for: r11v17 */
        /* JADX WARN: Type inference failed for: r11v18 */
        /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r1v1, types: [ih0] */
        /* JADX WARN: Type inference failed for: r3v1, types: [sh0] */
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
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(defpackage.sh0<java.lang.Object> r11, defpackage.lu2<? super defpackage.j6g> r12) {
            /*
                r10 = this;
                boolean r0 = r12 instanceof dh0.a.C0208a
                if (r0 == 0) goto L14
                r0 = r12
                dh0$a$a r0 = (dh0.a.C0208a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L14
                int r1 = r1 - r2
                r0.label = r1
            L12:
                r6 = r0
                goto L1a
            L14:
                dh0$a$a r0 = new dh0$a$a
                r0.<init>(r10, r12)
                goto L12
            L1a:
                java.lang.Object r12 = r6.result
                int r0 = r6.label
                luc<java.util.Set<java.lang.String>> r1 = r10.c
                r7 = 3
                r2 = 1
                r3 = 2
                r8 = 0
                g13 r9 = defpackage.g13.a
                if (r0 == 0) goto L4e
                if (r0 == r2) goto L42
                if (r0 == r3) goto L39
                if (r0 != r7) goto L33
                defpackage.r7d.b(r12)
                goto Lb7
            L33:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r10)
                return r8
            L39:
                java.lang.Object r11 = r6.L$0
                sh0 r11 = (defpackage.sh0) r11
                defpackage.r7d.b(r12)
                goto Laa
            L42:
                java.lang.Object r11 = r6.L$1
                luc r11 = (defpackage.luc) r11
                java.lang.Object r0 = r6.L$0
                sh0 r0 = (defpackage.sh0) r0
                defpackage.r7d.b(r12)
                goto L83
            L4e:
                defpackage.r7d.b(r12)
                luc<sh0<java.lang.Object>> r12 = r10.b
                p4a$a r0 = r10.a
                if (r0 == 0) goto L64
                T r4 = r12.element
                if (r4 != 0) goto L5c
                goto L64
            L5c:
                com.apollographql.apollo.exception.DefaultApolloException r10 = new com.apollographql.apollo.exception.DefaultApolloException
                java.lang.String r11 = "Apollo: optimistic updates can only be applied with one network response"
                r10.<init>(r11, r8)
                throw r10
            L64:
                r12.element = r11
                T r12 = r1.element
                if (r12 != 0) goto L8d
                if (r0 == 0) goto L86
                ih0 r12 = r10.d
                fl3 r12 = r12.a
                rh0<java.lang.Object> r0 = r10.e
                java.util.UUID r0 = r0.b
                r6.L$0 = r11
                r6.L$1 = r1
                r6.label = r2
                java.lang.Object r12 = r12.c(r0, r6)
                if (r12 != r9) goto L81
                goto Lb6
            L81:
                r0 = r11
                r11 = r1
            L83:
                java.util.Set r12 = (java.util.Set) r12
                goto L8a
            L86:
                is4 r12 = defpackage.is4.a
                r0 = r11
                r11 = r1
            L8a:
                r11.element = r12
                r11 = r0
            L8d:
                T r12 = r1.element
                r12.getClass()
                r5 = r12
                java.util.Set r5 = (java.util.Set) r5
                r6.L$0 = r11
                r6.L$1 = r8
                r6.label = r3
                ih0 r1 = r10.d
                rh0<java.lang.Object> r2 = r10.e
                lb3 r4 = r10.f
                r3 = r11
                java.lang.Object r11 = r1.b(r2, r3, r4, r5, r6)
                if (r11 != r9) goto La9
                goto Lb6
            La9:
                r11 = r3
            Laa:
                r6.L$0 = r8
                r6.label = r7
                wi5<sh0<java.lang.Object>> r10 = r10.V
                java.lang.Object r10 = r10.a(r11, r6)
                if (r10 != r9) goto Lb7
            Lb6:
                return r9
            Lb7:
                j6g r10 = defpackage.j6g.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: dh0.a.a(sh0, lu2):java.lang.Object");
        }
    }

    @uh3(c = "com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$interceptMutation$1$networkResponses$1", f = "ApolloCacheInterceptor.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends c1f implements Function2<sh0<Object>, lu2<? super j6g>, Object> {
        final /* synthetic */ luc<ApolloException> $networkException;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(lu2 lu2Var, luc lucVar) {
            super(2, lu2Var);
            this.$networkException = lucVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            b bVar = new b(lu2Var, this.$networkException);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sh0<Object> sh0Var, lu2<? super j6g> lu2Var) {
            return ((b) create(sh0Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [T, com.apollographql.apollo.exception.ApolloException] */
        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            sh0 sh0Var = (sh0) this.L$0;
            this.$networkException.element = sh0Var.e;
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh0(rh0<Object> rh0Var, ih0 ih0Var, lb3 lb3Var, qh0 qh0Var, lu2<? super dh0> lu2Var) {
        super(2, lu2Var);
        this.$request = rh0Var;
        this.this$0 = ih0Var;
        this.$customScalarAdapters = lb3Var;
        this.$chain = qh0Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        dh0 dh0Var = new dh0(this.$request, this.this$0, this.$customScalarAdapters, this.$chain, lu2Var);
        dh0Var.L$0 = obj;
        return dh0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<? super sh0<Object>> wi5Var, lu2<? super j6g> lu2Var) {
        return ((dh0) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f4, code lost:
    
        if (r2.a((java.util.Set) r1, r17) != r6) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dh0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

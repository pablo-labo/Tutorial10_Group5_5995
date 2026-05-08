package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class vj5<T> implements wi5 {
    public final /* synthetic */ huc a;
    public final /* synthetic */ wi5<T> b;
    public final /* synthetic */ Function2<T, lu2<? super Boolean>, Object> c;

    @uh3(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {34, 35, 37}, m = "emit")
    public static final class a extends pu2 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ vj5<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(vj5<? super T> vj5Var, lu2<? super a> lu2Var) {
            super(lu2Var);
            this.this$0 = vj5Var;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vj5(huc hucVar, wi5<? super T> wi5Var, Function2<? super T, ? super lu2<? super Boolean>, ? extends Object> function2) {
        this.a = hucVar;
        this.b = wi5Var;
        this.c = function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r7.b.a(r8, r0) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        if (r7.a(r8, r0) == r6) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
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
    public final java.lang.Object a(T r8, defpackage.lu2<? super defpackage.j6g> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof vj5.a
            if (r0 == 0) goto L13
            r0 = r9
            vj5$a r0 = (vj5.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            vj5$a r0 = new vj5$a
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            g13 r6 = defpackage.g13.a
            if (r1 == 0) goto L42
            if (r1 == r5) goto L3e
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2e
            defpackage.r7d.b(r9)
            goto L83
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r2
        L34:
            java.lang.Object r8 = r0.L$1
            java.lang.Object r7 = r0.L$0
            vj5 r7 = (defpackage.vj5) r7
            defpackage.r7d.b(r9)
            goto L68
        L3e:
            defpackage.r7d.b(r9)
            goto L56
        L42:
            defpackage.r7d.b(r9)
            huc r9 = r7.a
            boolean r9 = r9.element
            if (r9 == 0) goto L59
            r0.label = r5
            wi5<T> r7 = r7.b
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r6) goto L56
            goto L82
        L56:
            j6g r7 = defpackage.j6g.a
            return r7
        L59:
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            kotlin.jvm.functions.Function2<T, lu2<? super java.lang.Boolean>, java.lang.Object> r9 = r7.c
            java.lang.Object r9 = r9.invoke(r8, r0)
            if (r9 != r6) goto L68
            goto L82
        L68:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L86
            huc r9 = r7.a
            r9.element = r5
            wi5<T> r7 = r7.b
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r6) goto L83
        L82:
            return r6
        L83:
            j6g r7 = defpackage.j6g.a
            return r7
        L86:
            j6g r7 = defpackage.j6g.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vj5.a(java.lang.Object, lu2):java.lang.Object");
    }
}

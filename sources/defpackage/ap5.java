package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ap5 {

    @uh3(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", l = {102, 105, 110}, m = "invokeSuspend")
    public static final class a extends n7d implements Function2<l61, lu2<? super j6g>, Object> {
        final /* synthetic */ Function2<l61, lu2<? super j6g>, Object> $block;
        final /* synthetic */ v03 $currentContext;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(v03 v03Var, Function2<? super l61, ? super lu2<? super j6g>, ? extends Object> function2, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$currentContext = v03Var;
            this.$block = function2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$currentContext, this.$block, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l61 l61Var, lu2<? super j6g> lu2Var) {
            return ((a) create(l61Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
        
            if (r9 != r5) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
        
            if (r9 == r5) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v0, types: [int] */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, l61] */
        /* JADX WARN: Type inference failed for: r0v20 */
        /* JADX WARN: Type inference failed for: r0v21 */
        /* JADX WARN: Type inference failed for: r0v22 */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, l61] */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v7 */
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
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0058 -> B:12:0x0027). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x006f -> B:12:0x0027). Please report as a decompilation issue!!! */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                int r0 = r8.label
                peb r1 = defpackage.peb.c
                r2 = 3
                r3 = 2
                r4 = 1
                g13 r5 = defpackage.g13.a
                if (r0 == 0) goto L33
                if (r0 == r4) goto L2b
                if (r0 == r3) goto L20
                if (r0 != r2) goto L19
                java.lang.Object r0 = r8.L$0
                l61 r0 = (defpackage.l61) r0
                defpackage.r7d.b(r9)
                goto L27
            L19:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r8)
                r8 = 0
                return r8
            L20:
                java.lang.Object r0 = r8.L$0
                l61 r0 = (defpackage.l61) r0
                defpackage.r7d.b(r9)     // Catch: java.util.concurrent.CancellationException -> L29
            L27:
                r9 = r0
                goto L3a
            L29:
                r9 = move-exception
                goto L5f
            L2b:
                java.lang.Object r0 = r8.L$0
                l61 r0 = (defpackage.l61) r0
                defpackage.r7d.b(r9)     // Catch: java.util.concurrent.CancellationException -> L29
                goto L50
            L33:
                defpackage.r7d.b(r9)
                java.lang.Object r9 = r8.L$0
                l61 r9 = (defpackage.l61) r9
            L3a:
                v03 r0 = r8.$currentContext
                boolean r0 = defpackage.u63.U(r0)
                if (r0 == 0) goto L73
                kotlin.jvm.functions.Function2<l61, lu2<? super j6g>, java.lang.Object> r0 = r8.$block     // Catch: java.util.concurrent.CancellationException -> L5b
                r8.L$0 = r9     // Catch: java.util.concurrent.CancellationException -> L5b
                r8.label = r4     // Catch: java.util.concurrent.CancellationException -> L5b
                java.lang.Object r0 = r0.invoke(r9, r8)     // Catch: java.util.concurrent.CancellationException -> L5b
                if (r0 != r5) goto L4f
                goto L71
            L4f:
                r0 = r9
            L50:
                r8.L$0 = r0     // Catch: java.util.concurrent.CancellationException -> L29
                r8.label = r3     // Catch: java.util.concurrent.CancellationException -> L29
                java.lang.Object r9 = defpackage.ap5.b(r0, r1, r8)     // Catch: java.util.concurrent.CancellationException -> L29
                if (r9 != r5) goto L27
                goto L71
            L5b:
                r0 = move-exception
                r7 = r0
                r0 = r9
                r9 = r7
            L5f:
                v03 r6 = r8.$currentContext
                boolean r6 = defpackage.u63.U(r6)
                if (r6 == 0) goto L72
                r8.L$0 = r0
                r8.label = r2
                java.lang.Object r9 = defpackage.ap5.b(r0, r1, r8)
                if (r9 != r5) goto L27
            L71:
                return r5
            L72:
                throw r9
            L73:
                j6g r8 = defpackage.j6g.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ap5.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {48, 51, 56}, m = "forEachGesture")
    public static final class b extends pu2 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ap5.d(null, null, this);
        }
    }

    public static final boolean a(l61 l61Var) {
        List<yeb> list = l61Var.Q0().a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (list.get(i).d) {
                z = true;
                break;
            }
            i++;
        }
        return !z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (a(r6) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004c -> B:19:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.l61 r6, defpackage.peb r7, defpackage.x81 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.zo5
            if (r0 == 0) goto L13
            r0 = r8
            zo5 r0 = (defpackage.zo5) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zo5 r0 = new zo5
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L30
            java.lang.Object r6 = r0.L$1
            peb r6 = (defpackage.peb) r6
            java.lang.Object r7 = r0.L$0
            l61 r7 = (defpackage.l61) r7
            defpackage.r7d.b(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L4f
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            r6 = 0
            return r6
        L37:
            defpackage.r7d.b(r8)
            boolean r8 = a(r6)
            if (r8 != 0) goto L6b
        L40:
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r2
            java.lang.Object r8 = r6.B1(r7, r0)
            g13 r1 = defpackage.g13.a
            if (r8 != r1) goto L4f
            return r1
        L4f:
            neb r8 = (defpackage.neb) r8
            java.util.List<yeb> r8 = r8.a
            r1 = r8
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r3 = 0
        L5b:
            if (r3 >= r1) goto L6b
            java.lang.Object r4 = r8.get(r3)
            yeb r4 = (defpackage.yeb) r4
            boolean r4 = r4.d
            if (r4 == 0) goto L68
            goto L40
        L68:
            int r3 = r3 + 1
            goto L5b
        L6b:
            j6g r6 = defpackage.j6g.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ap5.b(l61, peb, x81):java.lang.Object");
    }

    public static final Object c(efb efbVar, Function2<? super l61, ? super lu2<? super j6g>, ? extends Object> function2, lu2<? super j6g> lu2Var) {
        Object objW0 = efbVar.w0(new a(lu2Var.getContext(), function2, null), lu2Var);
        return objW0 == g13.a ? objW0 : j6g.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
    
        if (r11 == r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bc, code lost:
    
        if (defpackage.j6g.a != r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x004f, code lost:
    
        if (defpackage.j6g.a == r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x004f, code lost:
    
        if (r11 != r3) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096 A[Catch: CancellationException -> 0x0052, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0052, blocks: (B:31:0x0082, B:34:0x0096, B:17:0x004c, B:22:0x0060), top: B:50:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, v03] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13, types: [efb] */
    /* JADX WARN: Type inference failed for: r1v15, types: [efb] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [efb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [efb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [efb] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13, types: [v03] */
    /* JADX WARN: Type inference failed for: r9v16, types: [v03] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, v03] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @defpackage.sy3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(defpackage.efb r9, kotlin.jvm.functions.Function2<? super defpackage.efb, ? super defpackage.lu2<? super defpackage.j6g>, ? extends java.lang.Object> r10, defpackage.lu2<? super defpackage.j6g> r11) {
        /*
            boolean r0 = r11 instanceof ap5.b
            if (r0 == 0) goto L13
            r0 = r11
            ap5$b r0 = (ap5.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ap5$b r0 = new ap5$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            int r1 = r0.label
            r2 = 0
            g13 r3 = defpackage.g13.a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L64
            if (r1 == r6) goto L54
            if (r1 == r5) goto L40
            if (r1 != r4) goto L3a
            java.lang.Object r9 = r0.L$2
            v03 r9 = (defpackage.v03) r9
            java.lang.Object r10 = r0.L$1
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            java.lang.Object r1 = r0.L$0
            efb r1 = (defpackage.efb) r1
            defpackage.r7d.b(r11)
            goto L4f
        L3a:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r9)
            return r2
        L40:
            java.lang.Object r9 = r0.L$2
            v03 r9 = (defpackage.v03) r9
            java.lang.Object r10 = r0.L$1
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            java.lang.Object r1 = r0.L$0
            efb r1 = (defpackage.efb) r1
            defpackage.r7d.b(r11)     // Catch: java.util.concurrent.CancellationException -> L52
        L4f:
            r11 = r9
            r9 = r1
            goto L6b
        L52:
            r11 = move-exception
            goto La0
        L54:
            java.lang.Object r9 = r0.L$2
            v03 r9 = (defpackage.v03) r9
            java.lang.Object r10 = r0.L$1
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            java.lang.Object r1 = r0.L$0
            efb r1 = (defpackage.efb) r1
            defpackage.r7d.b(r11)     // Catch: java.util.concurrent.CancellationException -> L52
            goto L82
        L64:
            defpackage.r7d.b(r11)
            v03 r11 = r0.getContext()
        L6b:
            boolean r1 = defpackage.u63.U(r11)
            if (r1 == 0) goto Lc0
            r0.L$0 = r9     // Catch: java.util.concurrent.CancellationException -> L9b
            r0.L$1 = r10     // Catch: java.util.concurrent.CancellationException -> L9b
            r0.L$2 = r11     // Catch: java.util.concurrent.CancellationException -> L9b
            r0.label = r6     // Catch: java.util.concurrent.CancellationException -> L9b
            java.lang.Object r1 = r10.invoke(r9, r0)     // Catch: java.util.concurrent.CancellationException -> L9b
            if (r1 != r3) goto L80
            goto Lbe
        L80:
            r1 = r9
            r9 = r11
        L82:
            r0.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L52
            r0.L$1 = r10     // Catch: java.util.concurrent.CancellationException -> L52
            r0.L$2 = r9     // Catch: java.util.concurrent.CancellationException -> L52
            r0.label = r5     // Catch: java.util.concurrent.CancellationException -> L52
            yo5 r11 = new yo5     // Catch: java.util.concurrent.CancellationException -> L52
            r11.<init>(r5, r2)     // Catch: java.util.concurrent.CancellationException -> L52
            java.lang.Object r11 = r1.w0(r11, r0)     // Catch: java.util.concurrent.CancellationException -> L52
            if (r11 != r3) goto L96
            goto L98
        L96:
            j6g r11 = defpackage.j6g.a     // Catch: java.util.concurrent.CancellationException -> L52
        L98:
            if (r11 != r3) goto L4f
            goto Lbe
        L9b:
            r1 = move-exception
            r8 = r1
            r1 = r9
            r9 = r11
            r11 = r8
        La0:
            boolean r7 = defpackage.u63.U(r9)
            if (r7 == 0) goto Lbf
            r0.L$0 = r1
            r0.L$1 = r10
            r0.L$2 = r9
            r0.label = r4
            yo5 r11 = new yo5
            r11.<init>(r5, r2)
            java.lang.Object r11 = r1.w0(r11, r0)
            if (r11 != r3) goto Lba
            goto Lbc
        Lba:
            j6g r11 = defpackage.j6g.a
        Lbc:
            if (r11 != r3) goto L4f
        Lbe:
            return r3
        Lbf:
            throw r11
        Lc0:
            j6g r9 = defpackage.j6g.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ap5.d(efb, kotlin.jvm.functions.Function2, lu2):java.lang.Object");
    }
}

package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$4", f = "ConnectionPoolImpl.kt", l = {147}, m = "invokeSuspend")
public final class vo2 extends c1f implements Function2<e13, lu2<Object>, Object> {
    final /* synthetic */ Function2<drf, lu2<Object>, Object> $block;
    final /* synthetic */ luc<egb> $connection;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vo2(Function2<? super drf, ? super lu2<Object>, ? extends Object> function2, luc<egb> lucVar, lu2<? super vo2> lu2Var) {
        super(2, lu2Var);
        this.$block = function2;
        this.$connection = lucVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new vo2(this.$block, this.$connection, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<Object> lu2Var) {
        return ((vo2) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to vo2 for r2v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.x81
    public final java.lang.Object invokeSuspend(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.label
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 != r1) goto Lb
            defpackage.r7d.b(r3)
            return r3
        Lb:
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r2)
            r2 = 0
            return r2
        L12:
            defpackage.r7d.b(r3)
            kotlin.jvm.functions.Function2<drf, lu2<java.lang.Object>, java.lang.Object> r3 = r2.$block
            luc<egb> r0 = r2.$connection
            T r0 = r0.element
            r2.label = r1
            java.lang.Object r2 = r3.invoke(r0, r2)
            g13 r3 = defpackage.g13.a
            if (r2 != r3) goto L26
            return r3
        L26:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vo2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class y5g<T> implements wi5<T> {
    public final v03 a;
    public final Object b;
    public final a c;

    @uh3(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {208}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<T, lu2<? super j6g>, Object> {
        final /* synthetic */ wi5<T> $downstream;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(wi5<? super T> wi5Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$downstream = wi5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$downstream, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, lu2<? super j6g> lu2Var) {
            return ((a) create(obj, lu2Var)).invokeSuspend(j6g.a);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type lu2 to y5g$a for r2v3 'this'  lu2
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
                goto L24
            Lb:
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r2)
                r2 = 0
                return r2
            L12:
                defpackage.r7d.b(r3)
                java.lang.Object r3 = r2.L$0
                wi5<T> r0 = r2.$downstream
                r2.label = r1
                java.lang.Object r2 = r0.a(r3, r2)
                g13 r3 = defpackage.g13.a
                if (r2 != r3) goto L24
                return r3
            L24:
                j6g r2 = defpackage.j6g.a
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: y5g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public y5g(wi5<? super T> wi5Var, v03 v03Var) {
        this.a = v03Var;
        this.b = rkf.b(v03Var);
        this.c = new a(wi5Var, null);
    }

    @Override // defpackage.wi5
    public final Object a(T t, lu2<? super j6g> lu2Var) {
        Object objH = web.H(this.a, t, this.b, this.c, lu2Var);
        return objH == g13.a ? objH : j6g.a;
    }
}

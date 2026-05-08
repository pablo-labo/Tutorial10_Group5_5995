package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nlf implements opb<vs4> {
    public final olf<vs4>[] a;

    public class a extends xs3<vs4, vs4> {
        public final ppb c;
        public final int d;
        public final x4d e;

        public a(xq2<vs4> xq2Var, ppb ppbVar, int i) {
            super(xq2Var);
            this.c = ppbVar;
            this.d = i;
            this.e = ppbVar.Q().h;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.xs3, defpackage.w81
        public final void d(Throwable th) {
            int i = this.d + 1;
            ppb ppbVar = this.c;
            nlf nlfVar = nlf.this;
            xq2<O> xq2Var = this.b;
            if (nlfVar.c(i, xq2Var, ppbVar)) {
                return;
            }
            xq2Var.t(th);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.w81
        public final void e(int i, Object obj) {
            vs4 vs4Var = (vs4) obj;
            xq2<O> xq2Var = this.b;
            if (vs4Var != null && (w81.b(i) || oie.m(vs4Var, this.e))) {
                xq2Var.v(i, vs4Var);
                return;
            }
            if (w81.a(i)) {
                vs4.h(vs4Var);
                if (nlf.this.c(this.d + 1, xq2Var, this.c)) {
                    return;
                }
                xq2Var.v(1, null);
            }
        }
    }

    public nlf(olf<vs4>... olfVarArr) {
        olf<vs4>[] olfVarArr2 = olfVarArr;
        this.a = olfVarArr2;
        int length = olfVarArr2.length;
        if (length <= 0) {
            if (length >= 0) {
                throw new IndexOutOfBoundsException(web.n("%s (%s) must be less than size (%s)", "index", 0, Integer.valueOf(length)));
            }
            l5.q(p6.c(length, "negative size: "));
            throw null;
        }
    }

    @Override // defpackage.opb
    public final void a(xq2<vs4> xq2Var, ppb ppbVar) {
        if (ppbVar.Q().h == null) {
            xq2Var.v(1, null);
        } else {
            if (c(0, xq2Var, ppbVar)) {
                return;
            }
            xq2Var.v(1, null);
        }
    }

    public final boolean c(int i, xq2<vs4> xq2Var, ppb ppbVar) {
        olf<vs4>[] olfVarArr;
        x4d x4dVar = ppbVar.Q().h;
        while (true) {
            olfVarArr = this.a;
            if (i >= olfVarArr.length) {
                i = -1;
                break;
            }
            if (olfVarArr[i].b(x4dVar)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return false;
        }
        olfVarArr[i].a(new a(xq2Var, ppbVar, i), ppbVar);
        return true;
    }
}

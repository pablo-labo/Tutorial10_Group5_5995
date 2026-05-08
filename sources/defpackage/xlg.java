package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xlg extends wlg {
    public sma<up2<?>> V;
    public gu5<sma<up2<?>>> W;
    public final boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xlg(aj3 aj3Var, lf0 lf0Var, n8a n8aVar, boolean z, qne qneVar) {
        super(aj3Var, lf0Var, n8aVar, null, qneVar);
        if (aj3Var == null) {
            D0(0);
            throw null;
        }
        if (lf0Var == null) {
            D0(1);
            throw null;
        }
        if (n8aVar == null) {
            D0(2);
            throw null;
        }
        if (qneVar == null) {
            D0(3);
            throw null;
        }
        this.f = z;
    }

    public static /* synthetic */ void D0(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "annotations";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public final void L0(sma<up2<?>> smaVar, gu5<sma<up2<?>>> gu5Var) {
        if (gu5Var == null) {
            D0(5);
            throw null;
        }
        this.W = gu5Var;
        if (smaVar == null) {
            smaVar = gu5Var.invoke();
        }
        this.V = smaVar;
    }

    @Override // defpackage.vlg
    public final boolean N() {
        return this.f;
    }

    @Override // defpackage.vlg
    public final up2<?> n0() {
        sma<up2<?>> smaVar = this.V;
        if (smaVar != null) {
            return smaVar.invoke();
        }
        return null;
    }
}

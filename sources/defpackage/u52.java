package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u52 extends x0 {
    public final aj3 e;
    public final qne f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u52(aue aueVar, aj3 aj3Var, n8a n8aVar, qne qneVar) {
        super(aueVar, n8aVar);
        if (aueVar == null) {
            D0(0);
            throw null;
        }
        if (aj3Var == null) {
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
        this.e = aj3Var;
        this.f = qneVar;
    }

    public static /* synthetic */ void D0(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.aj3
    public final aj3 d() {
        aj3 aj3Var = this.e;
        if (aj3Var != null) {
            return aj3Var;
        }
        D0(4);
        throw null;
    }

    @Override // defpackage.cj3
    public final qne g() {
        qne qneVar = this.f;
        if (qneVar != null) {
            return qneVar;
        }
        D0(5);
        throw null;
    }

    public boolean isExternal() {
        return false;
    }
}

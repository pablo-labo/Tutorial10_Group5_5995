package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dj3 extends bj3 implements cj3 {
    public final aj3 c;
    public final qne d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj3(aj3 aj3Var, lf0 lf0Var, n8a n8aVar, qne qneVar) {
        super(lf0Var, n8aVar);
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
        this.c = aj3Var;
        this.d = qneVar;
    }

    public static /* synthetic */ void D0(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5 && i != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.bj3, defpackage.aj3
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public cj3 a() {
        return this;
    }

    @Override // defpackage.aj3
    public aj3 d() {
        aj3 aj3Var = this.c;
        if (aj3Var != null) {
            return aj3Var;
        }
        D0(5);
        throw null;
    }

    @Override // defpackage.cj3
    public qne g() {
        qne qneVar = this.d;
        if (qneVar != null) {
            return qneVar;
        }
        D0(6);
        throw null;
    }
}

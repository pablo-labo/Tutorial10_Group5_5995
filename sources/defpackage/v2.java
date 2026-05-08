package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v2 extends e5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(aue aueVar, aj3 aj3Var, lf0 lf0Var, n8a n8aVar, ylg ylgVar, boolean z, int i, cze czeVar) {
        super(aueVar, aj3Var, lf0Var, n8aVar, ylgVar, z, i, czeVar);
        if (aueVar == null) {
            D0(0);
            throw null;
        }
        if (aj3Var == null) {
            D0(1);
            throw null;
        }
        if (n8aVar == null) {
            D0(3);
            throw null;
        }
        if (czeVar != null) {
        } else {
            D0(6);
            throw null;
        }
    }

    public static /* synthetic */ void D0(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.bj3
    public final String toString() {
        String str = "";
        String str2 = this.f ? "reified " : "";
        if (z() != ylg.INVARIANT) {
            str = z() + " ";
        }
        return str2 + str + getName();
    }
}

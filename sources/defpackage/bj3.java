package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bj3 extends ke0 implements aj3 {
    public final n8a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj3(lf0 lf0Var, n8a n8aVar) {
        super(lf0Var);
        if (lf0Var == null) {
            D0(0);
            throw null;
        }
        if (n8aVar == null) {
            D0(1);
            throw null;
        }
        this.b = n8aVar;
    }

    public static /* synthetic */ void D0(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (i != 5 && i != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static String G0(aj3 aj3Var) {
        try {
            return mz3.c.w(aj3Var) + "[" + aj3Var.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(aj3Var)) + "]";
        } catch (Throwable unused) {
            return aj3Var.getClass().getSimpleName() + " " + aj3Var.getName();
        }
    }

    @Override // defpackage.aj3
    public aj3 a() {
        return this;
    }

    @Override // defpackage.aj3
    public final n8a getName() {
        n8a n8aVar = this.b;
        if (n8aVar != null) {
            return n8aVar;
        }
        D0(2);
        throw null;
    }

    public String toString() {
        return G0(this);
    }
}

package defpackage;

import defpackage.lf0;

/* JADX INFO: loaded from: classes3.dex */
public final class en8 extends x3 {
    public final t52 c;
    public final k47 d;

    public en8(t52 t52Var) {
        super(lf0.a.a, toe.d);
        this.c = t52Var;
        this.d = new k47(t52Var);
    }

    public static /* synthetic */ void D0(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.aj3
    public final aj3 d() {
        t52 t52Var = this.c;
        if (t52Var != null) {
            return t52Var;
        }
        D0(2);
        throw null;
    }

    @Override // defpackage.hsc
    public final jsc getValue() {
        k47 k47Var = this.d;
        if (k47Var != null) {
            return k47Var;
        }
        D0(1);
        throw null;
    }

    @Override // defpackage.bj3
    public final String toString() {
        return "class " + this.c.getName() + "::this";
    }
}

package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y3 implements jsc {
    public final Object a;
    public Object b;

    public y3(ui8 ui8Var, jsc jscVar) {
        if (ui8Var == null) {
            c(0);
            throw null;
        }
        this.a = ui8Var;
        this.b = jscVar == null ? this : jscVar;
    }

    public static /* synthetic */ void c(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 1 && i != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.jsc
    public ui8 getType() {
        ui8 ui8Var = (ui8) this.a;
        if (ui8Var != null) {
            return ui8Var;
        }
        c(1);
        throw null;
    }

    public y3(Float f, af4 af4Var) {
        this.a = f;
        this.b = af4Var;
    }
}

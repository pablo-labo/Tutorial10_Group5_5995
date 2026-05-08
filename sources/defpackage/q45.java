package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q45 extends y3 {
    public final fv1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q45(fv1 fv1Var, ui8 ui8Var, jsc jscVar) {
        super(ui8Var, jscVar);
        if (ui8Var == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
        }
        this.c = fv1Var;
    }

    public final String toString() {
        return getType() + ": Ext {" + this.c + "}";
    }
}

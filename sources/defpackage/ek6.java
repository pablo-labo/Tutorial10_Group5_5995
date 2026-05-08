package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ek6 extends mj8 implements Function1<fk6, Boolean> {
    final /* synthetic */ luc<fk6> $hoverIconModifierNode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek6(luc<fk6> lucVar) {
        super(1);
        this.$hoverIconModifierNode = lucVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, fk6, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(fk6 fk6Var) {
        fk6 fk6Var2 = fk6Var;
        luc<fk6> lucVar = this.$hoverIconModifierNode;
        fk6 fk6Var3 = lucVar.element;
        if (fk6Var3 == null && fk6Var2.f0) {
            lucVar.element = fk6Var2;
        } else if (fk6Var3 != null) {
            fk6Var2.getClass();
        }
        return Boolean.TRUE;
    }
}

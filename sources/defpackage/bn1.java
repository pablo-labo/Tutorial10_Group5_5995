package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bn1 extends mj8 implements gu5<qtc> {
    final /* synthetic */ gu5<qtc> $bounds;
    final /* synthetic */ sl8 $layoutCoordinates;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn1(gu5 gu5Var, tia tiaVar) {
        super(0);
        this.$bounds = gu5Var;
        this.$layoutCoordinates = tiaVar;
    }

    @Override // defpackage.gu5
    public final qtc invoke() {
        qtc qtcVarInvoke;
        gu5<qtc> gu5Var = this.$bounds;
        if (gu5Var != null && (qtcVarInvoke = gu5Var.invoke()) != null) {
            return qtcVarInvoke;
        }
        sl8 sl8Var = this.$layoutCoordinates;
        if (!sl8Var.d()) {
            sl8Var = null;
        }
        if (sl8Var != null) {
            return web.a(0L, hh1.Y(sl8Var.a()));
        }
        return null;
    }
}

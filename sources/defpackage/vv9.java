package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vv9 extends mj8 implements gu5<Boolean> {
    final /* synthetic */ e13 $scope;
    final /* synthetic */ hee $sheetState;
    final /* synthetic */ hee $this_with;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv9(hee heeVar, e13 e13Var, hee heeVar2) {
        super(0);
        this.$this_with = heeVar;
        this.$scope = e13Var;
        this.$sheetState = heeVar2;
    }

    @Override // defpackage.gu5
    public final Boolean invoke() {
        if (this.$this_with.c.d.invoke(jee.b).booleanValue()) {
            u63.Y(this.$scope, null, null, new uv9(this.$sheetState, null), 3);
        }
        return Boolean.TRUE;
    }
}

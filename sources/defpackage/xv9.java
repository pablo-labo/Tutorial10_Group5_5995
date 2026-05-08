package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xv9 extends mj8 implements gu5<Boolean> {
    final /* synthetic */ e13 $scope;
    final /* synthetic */ hee $this_with;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv9(hee heeVar, e13 e13Var) {
        super(0);
        this.$this_with = heeVar;
        this.$scope = e13Var;
    }

    @Override // defpackage.gu5
    public final Boolean invoke() {
        if (this.$this_with.c.d.invoke(jee.c).booleanValue()) {
            u63.Y(this.$scope, null, null, new wv9(this.$this_with, null), 3);
        }
        return Boolean.TRUE;
    }
}

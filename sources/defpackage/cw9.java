package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cw9 extends mj8 implements gu5<Boolean> {
    final /* synthetic */ gu5<j6g> $onDismissRequest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw9(gu5<j6g> gu5Var) {
        super(0);
        this.$onDismissRequest = gu5Var;
    }

    @Override // defpackage.gu5
    public final Boolean invoke() {
        this.$onDismissRequest.invoke();
        return Boolean.TRUE;
    }
}

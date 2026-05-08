package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ipg extends mj8 implements gu5<j6g> {
    final /* synthetic */ jpg $listener;
    final /* synthetic */ lgb $poolingContainerListener;
    final /* synthetic */ n1 $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ipg(n1 n1Var, jpg jpgVar, hpg hpgVar) {
        super(0);
        this.$view = n1Var;
        this.$listener = jpgVar;
        this.$poolingContainerListener = hpgVar;
    }

    @Override // defpackage.gu5
    public final j6g invoke() {
        this.$view.removeOnAttachStateChangeListener(this.$listener);
        n1 n1Var = this.$view;
        lgb lgbVar = this.$poolingContainerListener;
        n1Var.getClass();
        lgbVar.getClass();
        pnb.C(n1Var).a.remove(lgbVar);
        return j6g.a;
    }
}

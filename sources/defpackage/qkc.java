package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qkc extends tpc {
    public final boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkc(mkf mkfVar) {
        super(mkfVar);
        mkfVar.getClass();
        this.a = an6.a(mkfVar);
    }

    @Override // defpackage.tpc, defpackage.wjc
    /* JADX INFO: renamed from: getRemoveClippedSubviews */
    public boolean get_removeClippedSubviews() {
        return super.get_removeClippedSubviews();
    }

    @Override // defpackage.tpc, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.a) {
            setLeft(0);
            setTop(i2);
            setRight(i3 - i);
            setBottom(i4);
        }
    }

    @Override // defpackage.tpc
    public void setRemoveClippedSubviews(boolean z) {
        if (this.a) {
            super.setRemoveClippedSubviews(false);
        } else {
            super.setRemoveClippedSubviews(z);
        }
    }
}

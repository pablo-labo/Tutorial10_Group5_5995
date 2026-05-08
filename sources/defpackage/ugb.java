package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ugb extends mj8 implements gu5<Boolean> {
    final /* synthetic */ tgb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugb(tgb tgbVar) {
        super(0);
        this.this$0 = tgbVar;
    }

    @Override // defpackage.gu5
    public final Boolean invoke() {
        sl8 parentLayoutCoordinates = this.this$0.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || !parentLayoutCoordinates.d()) {
            parentLayoutCoordinates = null;
        }
        return Boolean.valueOf((parentLayoutCoordinates == null || this.this$0.m37getPopupContentSizebOM6tXw() == null) ? false : true);
    }
}

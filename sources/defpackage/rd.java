package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rd implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;

    public /* synthetic */ rd(iba ibaVar, int i) {
        this.a = i;
        this.b = ibaVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        iba ibaVar = this.b;
        switch (i) {
            case 0:
                ibaVar.p("DATE_AWARDED");
                break;
            default:
                ibaVar.p("EDIT_ROOT_PAGE");
                break;
        }
        return j6g.a;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hd implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;

    public /* synthetic */ hd(iba ibaVar, int i) {
        this.a = i;
        this.b = ibaVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        iba ibaVar = this.b;
        switch (i) {
            case 0:
                ibaVar.p("DESCRIPTION");
                break;
            case 1:
                ibaVar.r();
                break;
            case 2:
                ibaVar.p("TITLE");
                break;
            case 3:
                ibaVar.r();
                break;
            default:
                ibaVar.r();
                break;
        }
        return j6g.a;
    }
}

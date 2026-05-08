package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m78 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;
    public final /* synthetic */ g4a c;

    public /* synthetic */ m78(iba ibaVar, g4a g4aVar, int i) {
        this.a = i;
        this.b = ibaVar;
        this.c = g4aVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.c.setValue("");
                this.b.p("JOB_TITLE_AUTOCOMPLETE");
                break;
            default:
                this.c.setValue("");
                this.b.p("LOCATION_AUTOCOMPLETE");
                break;
        }
        return j6g.a;
    }
}

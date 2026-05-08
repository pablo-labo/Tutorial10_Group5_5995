package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class og implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;
    public final /* synthetic */ g4a c;

    public /* synthetic */ og(iba ibaVar, g4a g4aVar, int i) {
        this.a = i;
        this.b = ibaVar;
        this.c = g4aVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.p("TIME_PERIOD");
                this.c.setValue("");
                break;
            default:
                this.b.p("DESCRIPTION");
                this.c.setValue(null);
                break;
        }
        return j6g.a;
    }
}

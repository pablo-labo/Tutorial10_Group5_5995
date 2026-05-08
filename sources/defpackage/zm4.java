package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zm4 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ zm4(int i, g4a g4aVar) {
        this.a = i;
        this.b = g4aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        g4a g4aVar = this.b;
        switch (i) {
            case 0:
                g4aVar.setValue(Boolean.FALSE);
                break;
            case 1:
                g4aVar.setValue(oy9.b);
                break;
            case 2:
                g4aVar.setValue(Boolean.valueOf(!((Boolean) g4aVar.getValue()).booleanValue()));
                break;
            default:
                g4aVar.setValue(Boolean.FALSE);
                break;
        }
        return j6g.a;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nr2 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x1c b;

    public /* synthetic */ nr2(x1c x1cVar, int i) {
        this.a = i;
        this.b = x1cVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        x1c x1cVar = this.b;
        switch (i) {
            case 0:
                yz7 yz7Var = x1cVar.o().c;
                if (yz7Var != null) {
                    ((gme) x1cVar.X).setValue(yz7.a(yz7Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383));
                }
                break;
            case 1:
                x1cVar.g();
                break;
            default:
                x1cVar.C(b5g.a);
                x1cVar.E(qr2.c);
                break;
        }
        return j6g.a;
    }
}

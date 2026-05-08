package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class or2 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x1c b;

    public /* synthetic */ or2(x1c x1cVar, int i) {
        this.a = i;
        this.b = x1cVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        x1c x1cVar = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(!wl7.b(x1cVar.m(), x1cVar.o().c));
            default:
                x1cVar.B(false);
                return j6g.a;
        }
    }
}

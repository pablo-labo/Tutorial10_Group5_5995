package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gl9 implements wq2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ gl9(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.wq2
    public final void accept(Object obj) {
        int i = this.a;
        boolean z = this.b;
        vdb vdbVar = (vdb) obj;
        switch (i) {
            case 0:
                vdbVar.I(z);
                break;
            default:
                vdbVar.X(z);
                break;
        }
    }
}

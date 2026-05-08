package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c8d implements l74 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ c8d(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.l74
    public final void dispose() {
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                if (z) {
                    dg3.i("Resume File Preview");
                }
                break;
            default:
                if (z) {
                    dg3.i(dg3.c(rxb.c));
                }
                break;
        }
    }
}

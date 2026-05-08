package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vk9 implements Runnable {
    public final /* synthetic */ vdb a;
    public final /* synthetic */ int b;

    public /* synthetic */ vk9(int i, vdb vdbVar) {
        this.a = vdbVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vdb vdbVar = this.a;
        if (vdbVar.O0(25) || vdbVar.O0(33)) {
            boolean zO0 = vdbVar.O0(33);
            int i = this.b;
            if (zO0) {
                vdbVar.h0(i, 1);
            } else {
                vdbVar.F0(i);
            }
        }
    }
}

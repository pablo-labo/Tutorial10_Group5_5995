package defpackage;

import okhttp3.WebSocket;

/* JADX INFO: loaded from: classes.dex */
public final class tr3 implements ewg {
    public final /* synthetic */ u12<String> a;
    public final /* synthetic */ WebSocket b;

    public tr3(u12<String> u12Var, WebSocket webSocket) {
        this.a = u12Var;
        this.b = webSocket;
    }

    @Override // defpackage.ewg
    public final void a(vr1 vr1Var) {
        vr1Var.getClass();
        if (this.b.a(vr1Var)) {
            return;
        }
        this.a.k(null);
    }

    @Override // defpackage.ewg
    public final Object b(m5h m5hVar) {
        return this.a.c(m5hVar);
    }

    @Override // defpackage.ewg
    public final void close() {
        this.b.e(1000, null);
    }

    @Override // defpackage.ewg
    public final void send(String str) {
        if (this.b.send(str)) {
            return;
        }
        this.a.k(null);
    }
}

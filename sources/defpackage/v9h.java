package defpackage;

import defpackage.o71;

/* JADX INFO: loaded from: classes2.dex */
public final class v9h implements o71.a {
    public final /* synthetic */ qa6 a;

    public v9h(qa6 qa6Var) {
        this.a = qa6Var;
    }

    @Override // o71.a
    public final void a(boolean z) {
        och ochVar = this.a.c0;
        ochVar.sendMessage(ochVar.obtainMessage(1, Boolean.valueOf(z)));
    }
}

package defpackage;

import defpackage.gdb;
import defpackage.lz8;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d35 implements lz8.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ d35(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // lz8.a
    public final void invoke(Object obj) {
        int i = this.a;
        boolean z = this.b;
        gdb.c cVar = (gdb.c) obj;
        switch (i) {
            case 0:
                cVar.v(z);
                break;
            default:
                cVar.I(z);
                break;
        }
    }
}

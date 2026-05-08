package defpackage;

import defpackage.gdb;
import defpackage.lz8;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class th9 implements lz8.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ cdb b;

    public /* synthetic */ th9(cdb cdbVar, int i) {
        this.a = i;
        this.b = cdbVar;
    }

    @Override // lz8.a
    public final void invoke(Object obj) {
        int i = this.a;
        cdb cdbVar = this.b;
        gdb.c cVar = (gdb.c) obj;
        switch (i) {
            case 0:
                cVar.o0(cdbVar);
                break;
            default:
                cVar.o0(cdbVar);
                break;
        }
    }
}

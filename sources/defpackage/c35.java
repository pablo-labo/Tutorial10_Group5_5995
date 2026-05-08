package defpackage;

import defpackage.gdb;
import defpackage.lz8;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c35 implements lz8.a, ru5 {
    public final /* synthetic */ int a;

    public /* synthetic */ c35(int i) {
        this.a = i;
    }

    @Override // defpackage.ru5
    public Object apply(Object obj) {
        return Integer.valueOf(this.a);
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        ((gdb.c) obj).m(this.a);
    }
}

package defpackage;

import defpackage.mja;

/* JADX INFO: loaded from: classes3.dex */
public final class lja implements mja.a {
    public final /* synthetic */ mja a;

    public lja(mja mjaVar) {
        this.a = mjaVar;
    }

    @Override // mja.a
    public final void a(String str, String str2) {
        str.getClass();
        mja mjaVar = this.a;
        mjaVar.f.add(str);
        mjaVar.g.add(str2);
    }

    @Override // mja.a
    public final void b(Long l) {
        mja mjaVar = this.a;
        mjaVar.h.add("lineNumber");
        mjaVar.i.add(l);
    }
}

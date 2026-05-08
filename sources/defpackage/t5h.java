package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t5h extends t implements u5h {
    public u a = u5h.s;
    public w b;

    public t5h(int i, int i2, int i3, int i4) {
        r rVar = new r();
        rVar.a(new s(i));
        if (i3 == 0) {
            if (i4 != 0) {
                l5.q("inconsistent k values");
                throw null;
            }
            rVar.a(u5h.t);
            rVar.a(new s(i2));
        } else {
            if (i3 <= i2 || i4 <= i3) {
                l5.q("inconsistent k values");
                throw null;
            }
            rVar.a(u5h.u);
            r rVar2 = new r();
            rVar2.a(new s(i2));
            rVar2.a(new s(i3));
            rVar2.a(new s(i4));
            rVar.a(new zc3(rVar2));
        }
        this.b = new zc3(rVar);
    }

    @Override // defpackage.q
    public final w a() {
        r rVar = new r();
        rVar.a(this.a);
        rVar.a(this.b);
        return new zc3(rVar);
    }
}

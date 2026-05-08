package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class so7 implements goa, ev5 {
    public final /* synthetic */ ji a;

    public so7(ji jiVar) {
        this.a = jiVar;
    }

    @Override // defpackage.ev5
    public final vu5<?> c() {
        return this.a;
    }

    @Override // defpackage.goa
    public final /* synthetic */ void d(Object obj) {
        this.a.invoke(obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof goa) && (obj instanceof ev5)) {
            return this.a == ((ev5) obj).c();
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

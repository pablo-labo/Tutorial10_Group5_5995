package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class arg extends ThreadLocal<Object[]> {
    public final /* synthetic */ int a;

    public arg(int i) {
        this.a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object[] initialValue() {
        return new Object[this.a];
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum wsg {
    Visible(0),
    Prerender(1),
    Hidden(2);

    private final int value;

    wsg(int i) {
        this.value = i;
    }

    public final int a() {
        return this.value;
    }
}

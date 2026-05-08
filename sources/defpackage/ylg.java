package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ylg {
    INVARIANT("", true, true, 0),
    IN_VARIANCE("in", true, false, -1),
    OUT_VARIANCE("out", false, true, 1);

    private final boolean allowsInPosition;
    private final boolean allowsOutPosition;
    private final String label;
    private final int superpositionFactor;

    ylg(String str, boolean z, boolean z2, int i) {
        this.label = str;
        this.allowsInPosition = z;
        this.allowsOutPosition = z2;
        this.superpositionFactor = i;
    }

    public final boolean a() {
        return this.allowsOutPosition;
    }

    public final String c() {
        return this.label;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.label;
    }
}

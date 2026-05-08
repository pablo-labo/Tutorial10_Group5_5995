package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum te0 {
    NO_ARGUMENTS(3),
    /* JADX INFO: Fake field, exist only in values array */
    UNLESS_EMPTY(2),
    /* JADX INFO: Fake field, exist only in values array */
    EF24(true, true);

    private final boolean includeAnnotationArguments;
    private final boolean includeEmptyAnnotationArguments;

    /* synthetic */ te0(int i) {
        this((i & 1) == 0, false);
    }

    public final boolean a() {
        return this.includeAnnotationArguments;
    }

    public final boolean c() {
        return this.includeEmptyAnnotationArguments;
    }

    te0(boolean z, boolean z2) {
        this.includeAnnotationArguments = z;
        this.includeEmptyAnnotationArguments = z2;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum g6h {
    LEFT(0),
    TOP(1),
    RIGHT(2),
    BOTTOM(3),
    START(4),
    END(5),
    HORIZONTAL(6),
    VERTICAL(7),
    ALL(8);

    private final int mIntValue;

    g6h(int i) {
        this.mIntValue = i;
    }

    public static g6h a(int i) {
        switch (i) {
            case 0:
                return LEFT;
            case 1:
                return TOP;
            case 2:
                return RIGHT;
            case 3:
                return BOTTOM;
            case 4:
                return START;
            case 5:
                return END;
            case 6:
                return HORIZONTAL;
            case 7:
                return VERTICAL;
            case 8:
                return ALL;
            default:
                l5.q(p6.c(i, "Unknown enum value: "));
                return null;
        }
    }

    public final int c() {
        return this.mIntValue;
    }
}

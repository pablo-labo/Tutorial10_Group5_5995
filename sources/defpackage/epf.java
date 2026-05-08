package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum epf {
    START("topTouchStart"),
    END("topTouchEnd"),
    MOVE("topTouchMove"),
    CANCEL("topTouchCancel");

    public static final a a = new a();
    private final String jsName;

    public static final class a {
    }

    epf(String str) {
        this.jsName = str;
    }

    public final String a() {
        return this.jsName;
    }
}

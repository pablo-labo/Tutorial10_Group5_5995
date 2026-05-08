package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b5g {
    public static final b5g a;
    public static final b5g b;
    public static final b5g c;
    public static final b5g d;
    public static final /* synthetic */ b5g[] e;

    static {
        b5g b5gVar = new b5g("READY", 0);
        a = b5gVar;
        b5g b5gVar2 = new b5g("LOADING", 1);
        b = b5gVar2;
        b5g b5gVar3 = new b5g("ERROR", 2);
        c = b5gVar3;
        b5g b5gVar4 = new b5g("FULL_SCREEN_HTTP_ERROR", 3);
        d = b5gVar4;
        e = new b5g[]{b5gVar, b5gVar2, b5gVar3, b5gVar4};
    }

    public b5g() {
        throw null;
    }

    public static b5g valueOf(String str) {
        return (b5g) Enum.valueOf(b5g.class, str);
    }

    public static b5g[] values() {
        return (b5g[]) e.clone();
    }
}

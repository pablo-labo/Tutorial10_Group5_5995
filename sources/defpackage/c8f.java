package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c8f {
    public static final /* synthetic */ c8f[] V;
    public static final c8f a;
    public static final c8f b;
    public static final c8f c;
    public static final c8f d;
    public static final c8f e;
    public static final c8f f;

    static {
        c8f c8fVar = new c8f("INFO", 0);
        a = c8fVar;
        c8f c8fVar2 = new c8f("SUCCESS", 1);
        b = c8fVar2;
        c8f c8fVar3 = new c8f("WARNING", 2);
        c = c8fVar3;
        c8f c8fVar4 = new c8f("ALERT", 3);
        d = c8fVar4;
        c8f c8fVar5 = new c8f("NEUTRAL", 4);
        e = c8fVar5;
        c8f c8fVar6 = new c8f("AI", 5);
        f = c8fVar6;
        V = new c8f[]{c8fVar, c8fVar2, c8fVar3, c8fVar4, c8fVar5, c8fVar6};
    }

    public c8f() {
        throw null;
    }

    public static c8f valueOf(String str) {
        return (c8f) Enum.valueOf(c8f.class, str);
    }

    public static c8f[] values() {
        return (c8f[]) V.clone();
    }
}

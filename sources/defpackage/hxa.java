package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class hxa {
    public static final hxa a;
    public static final hxa b;
    public static final /* synthetic */ hxa[] c;

    static {
        hxa hxaVar = new hxa("RENDER_OVERRIDE", 0);
        a = hxaVar;
        hxa hxaVar2 = new hxa("RENDER_OPEN", 1);
        b = hxaVar2;
        c = new hxa[]{hxaVar, hxaVar2, new hxa("RENDER_OPEN_OVERRIDE", 2)};
    }

    public hxa() {
        throw null;
    }

    public static hxa valueOf(String str) {
        return (hxa) Enum.valueOf(hxa.class, str);
    }

    public static hxa[] values() {
        return (hxa[]) c.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class d5h {
    public static final d5h a;
    public static final d5h b;
    public static final d5h c;
    public static final d5h d;
    public static final /* synthetic */ d5h[] e;
    public static final /* synthetic */ wv4 f;
    public final char begin;
    public final char end;

    static {
        d5h d5hVar = new d5h("OBJ", 0, '{', '}');
        a = d5hVar;
        d5h d5hVar2 = new d5h("LIST", 1, '[', ']');
        b = d5hVar2;
        d5h d5hVar3 = new d5h("MAP", 2, '{', '}');
        c = d5hVar3;
        d5h d5hVar4 = new d5h("POLY_OBJ", 3, '[', ']');
        d = d5hVar4;
        d5h[] d5hVarArr = {d5hVar, d5hVar2, d5hVar3, d5hVar4};
        e = d5hVarArr;
        f = new wv4(d5hVarArr);
    }

    public d5h(String str, int i, char c2, char c3) {
        this.begin = c2;
        this.end = c3;
    }

    public static d5h valueOf(String str) {
        return (d5h) Enum.valueOf(d5h.class, str);
    }

    public static d5h[] values() {
        return (d5h[]) e.clone();
    }
}

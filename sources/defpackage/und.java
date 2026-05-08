package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class und {
    public static final a a;
    public static final und b;
    public static final /* synthetic */ und[] c;
    public static final /* synthetic */ wv4 d;
    private final String value;

    public static final class a {
    }

    static {
        und undVar = new und("VALID", 0, "valid");
        und undVar2 = new und("INVALID", 1, "invalid");
        b = undVar2;
        und[] undVarArr = {undVar, undVar2};
        c = undVarArr;
        d = new wv4(undVarArr);
        a = new a();
    }

    public und(String str, int i, String str2) {
        this.value = str2;
    }

    public static und valueOf(String str) {
        return (und) Enum.valueOf(und.class, str);
    }

    public static und[] values() {
        return (und[]) c.clone();
    }

    public final String a() {
        return this.value;
    }
}

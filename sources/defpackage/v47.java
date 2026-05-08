package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class v47 {
    public static final v47 a;
    public static final v47 b;
    public static final /* synthetic */ v47[] c;

    static {
        v47 v47Var = new v47("FOLDER_SELECTOR", 0);
        a = v47Var;
        v47 v47Var2 = new v47("LONG_PRESS_ACTION_SELECTOR", 1);
        b = v47Var2;
        c = new v47[]{v47Var, v47Var2};
    }

    public v47() {
        throw null;
    }

    public static v47 valueOf(String str) {
        return (v47) Enum.valueOf(v47.class, str);
    }

    public static v47[] values() {
        return (v47[]) c.clone();
    }
}

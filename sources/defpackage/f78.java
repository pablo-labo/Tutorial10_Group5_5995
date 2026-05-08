package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f78 {
    public static final f78 a;
    public static final f78 b;
    public static final /* synthetic */ f78[] c;

    static {
        f78 f78Var = new f78("DESIRED_JOB_TITLES", 0);
        a = f78Var;
        f78 f78Var2 = new f78("JOB_TITLE_AUTOCOMPLETE", 1);
        b = f78Var2;
        c = new f78[]{f78Var, f78Var2};
    }

    public f78() {
        throw null;
    }

    public static f78 valueOf(String str) {
        return (f78) Enum.valueOf(f78.class, str);
    }

    public static f78[] values() {
        return (f78[]) c.clone();
    }
}

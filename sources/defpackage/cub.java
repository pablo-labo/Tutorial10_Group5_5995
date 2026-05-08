package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class cub {
    public static final cub a;
    public static final cub b;
    public static final /* synthetic */ cub[] c;

    static {
        cub cubVar = new cub("EmployersCanFindYou", 0);
        a = cubVar;
        cub cubVar2 = new cub("EmployersCannotFindYou", 1);
        b = cubVar2;
        c = new cub[]{cubVar, cubVar2};
    }

    public cub() {
        throw null;
    }

    public static cub valueOf(String str) {
        return (cub) Enum.valueOf(cub.class, str);
    }

    public static cub[] values() {
        return (cub[]) c.clone();
    }
}

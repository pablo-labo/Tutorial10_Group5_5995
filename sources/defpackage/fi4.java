package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class fi4 {
    public static final fi4 a;
    public static final fi4 b;
    public static final /* synthetic */ fi4[] c;

    /* JADX INFO: Fake field, exist only in values array */
    fi4 EF0;

    static {
        fi4 fi4Var = new fi4("HOME", 0);
        fi4 fi4Var2 = new fi4("LICENSE_TYPE_SELECTOR", 1);
        a = fi4Var2;
        fi4 fi4Var3 = new fi4("STATE_SELECTOR", 2);
        b = fi4Var3;
        c = new fi4[]{fi4Var, fi4Var2, fi4Var3};
    }

    public fi4() {
        throw null;
    }

    public static fi4 valueOf(String str) {
        return (fi4) Enum.valueOf(fi4.class, str);
    }

    public static fi4[] values() {
        return (fi4[]) c.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class jnb {
    public static final jnb a;
    public static final jnb b;
    public static final jnb c;
    public static final /* synthetic */ jnb[] d;

    static {
        jnb jnbVar = new jnb("DEFAULT", 0);
        a = jnbVar;
        jnb jnbVar2 = new jnb("VERY_LOW", 1);
        b = jnbVar2;
        jnb jnbVar3 = new jnb("HIGHEST", 2);
        c = jnbVar3;
        d = new jnb[]{jnbVar, jnbVar2, jnbVar3};
    }

    public jnb() {
        throw null;
    }

    public static jnb valueOf(String str) {
        return (jnb) Enum.valueOf(jnb.class, str);
    }

    public static jnb[] values() {
        return (jnb[]) d.clone();
    }
}

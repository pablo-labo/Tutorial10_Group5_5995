package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class x5c {
    public static final x5c a;
    public static final x5c b;
    public static final /* synthetic */ x5c[] c;

    static {
        x5c x5cVar = new x5c("PROTO2", 0);
        a = x5cVar;
        x5c x5cVar2 = new x5c("PROTO3", 1);
        b = x5cVar2;
        c = new x5c[]{x5cVar, x5cVar2};
    }

    public x5c() {
        throw null;
    }

    public static x5c valueOf(String str) {
        return (x5c) Enum.valueOf(x5c.class, str);
    }

    public static x5c[] values() {
        return (x5c[]) c.clone();
    }
}

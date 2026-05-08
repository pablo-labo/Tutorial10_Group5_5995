package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f6c {
    public static final f6c a;
    public static final f6c b;
    public static final /* synthetic */ f6c[] c;

    static {
        f6c f6cVar = new f6c("HTTP", 0);
        a = f6cVar;
        f6c f6cVar2 = new f6c("HTTPS", 1);
        b = f6cVar2;
        c = new f6c[]{f6cVar, f6cVar2};
    }

    public f6c() {
        throw null;
    }

    public static f6c valueOf(String str) {
        return (f6c) Enum.valueOf(f6c.class, str);
    }

    public static f6c[] values() {
        return (f6c[]) c.clone();
    }
}

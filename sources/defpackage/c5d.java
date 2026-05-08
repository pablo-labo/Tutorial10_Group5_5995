package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c5d {
    public static final b a;
    public static final /* synthetic */ c5d[] b;

    /* JADX INFO: Fake field, exist only in values array */
    c5d EF0;

    public enum b extends c5d {
        public b() {
            super("MEMOS", 1);
        }
    }

    static {
        c5d c5dVar = new c5d() { // from class: c5d.a
        };
        b bVar = new b();
        a = bVar;
        b = new c5d[]{c5dVar, bVar, new c5d() { // from class: c5d.c
        }, new c5d() { // from class: c5d.d
        }, new c5d() { // from class: c5d.e
        }};
    }

    public c5d() {
        throw null;
    }

    public static c5d valueOf(String str) {
        return (c5d) Enum.valueOf(c5d.class, str);
    }

    public static c5d[] values() {
        return (c5d[]) b.clone();
    }
}

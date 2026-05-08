package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class xmf {
    public static final a a;
    public static final b b;
    public static final /* synthetic */ xmf[] c;

    public enum a extends xmf {
        public a() {
            super("DOUBLE", 0);
        }
    }

    public enum b extends xmf {
        public b() {
            super("LAZILY_PARSED_NUMBER", 1);
        }
    }

    static {
        a aVar = new a();
        a = aVar;
        b bVar = new b();
        b = bVar;
        c = new xmf[]{aVar, bVar, new xmf() { // from class: xmf.c
        }, new xmf() { // from class: xmf.d
        }};
    }

    public xmf() {
        throw null;
    }

    public static xmf valueOf(String str) {
        return (xmf) Enum.valueOf(xmf.class, str);
    }

    public static xmf[] values() {
        return (xmf[]) c.clone();
    }
}

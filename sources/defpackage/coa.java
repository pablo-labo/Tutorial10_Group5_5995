package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class coa {
    public final ReentrantLock a = new ReentrantLock();
    public final long[] b;
    public final boolean[] c;
    public boolean d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("NO_OP", 0);
            a = aVar;
            a aVar2 = new a("ADD", 1);
            b = aVar2;
            a aVar3 = new a("REMOVE", 2);
            c = aVar3;
            d = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    public coa(int i) {
        this.b = new long[i];
        this.c = new boolean[i];
    }
}

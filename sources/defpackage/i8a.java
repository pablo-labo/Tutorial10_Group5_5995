package defpackage;

import java.util.Hashtable;

/* JADX INFO: loaded from: classes3.dex */
public final class i8a {
    public static final Hashtable a = new Hashtable();
    public static final Hashtable b = new Hashtable();

    static {
        a(uhd.E, "B-571");
        a(uhd.C, "B-409");
        a(uhd.m, "B-283");
        a(uhd.s, "B-233");
        a(uhd.k, "B-163");
        a(uhd.D, "K-571");
        a(uhd.B, "K-409");
        a(uhd.l, "K-283");
        a(uhd.r, "K-233");
        a(uhd.a, "K-163");
        a(uhd.A, "P-521");
        a(uhd.z, "P-384");
        a(uhd.G, "P-256");
        a(uhd.y, "P-224");
        a(uhd.F, "P-192");
    }

    public static void a(u uVar, String str) {
        a.put(str, uVar);
        b.put(uVar, str);
    }
}

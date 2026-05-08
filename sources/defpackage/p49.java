package defpackage;

import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public class p49 {
    public static final String[] b = {"avro.java.string", "java-class", "java-key-class", "java-element-class"};
    public final String a;

    public p49(String str) {
        this.a = str.intern();
    }

    public void a(g gVar) {
        b(gVar);
        gVar.o("logicalType", this.a);
        gVar.Y(this);
    }

    public void b(g gVar) {
        for (int i = 0; i < 4; i++) {
            String str = b[i];
            if (gVar.e(str) != null) {
                l5.q(l5.l("logicalType cannot be used with ", str));
                return;
            }
        }
    }
}

package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class l7f {
    public int a;
    public ByteBuffer b;
    public int c;
    public int d;

    public l7f() {
        if (a6g.a == null) {
            a6g.a = new a6g();
        }
    }

    public final int a(int i) {
        if (i < this.d) {
            return this.b.getShort(this.c + i);
        }
        return 0;
    }
}

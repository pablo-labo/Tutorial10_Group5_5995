package defpackage;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class wn1<V> {
    public final int a;
    public final int b;
    public final LinkedList c;
    public int d;

    public wn1(int i, int i2, int i3) {
        web.i(i > 0);
        web.i(i2 >= 0);
        web.i(i3 >= 0);
        this.a = i;
        this.b = i2;
        this.c = new LinkedList();
        this.d = i3;
    }

    public V a() {
        return (V) this.c.poll();
    }
}

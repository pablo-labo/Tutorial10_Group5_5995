package defpackage;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class a6 {
    public Serializable a;
    public final Serializable b;

    /* JADX WARN: Type inference failed for: r2v4, types: [int[], java.io.Serializable] */
    public a6(int i) {
        switch (i) {
            case 1:
                this.a = new ConcurrentHashMap();
                this.b = new AtomicInteger(0);
                break;
            default:
                this.b = new int[2];
                break;
        }
    }

    public abstract int[] a(int i);

    public int[] b(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public String c() {
        String str = (String) this.a;
        if (str != null) {
            return str;
        }
        wl7.g("text");
        throw null;
    }

    public abstract int[] d(int i);
}

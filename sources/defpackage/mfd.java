package defpackage;

import android.annotation.SuppressLint;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"WrongConstant"})
public final class mfd implements xze, wze {
    public static final TreeMap<Integer, mfd> X = new TreeMap<>();
    public final int[] V;
    public int W;
    public final int a;
    public volatile String b;
    public final long[] c;
    public final double[] d;
    public final String[] e;
    public final byte[][] f;

    public static final class a {
        public static mfd a(int i, String str) {
            str.getClass();
            TreeMap<Integer, mfd> treeMap = mfd.X;
            synchronized (treeMap) {
                Map.Entry<Integer, mfd> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
                if (entryCeilingEntry == null) {
                    j6g j6gVar = j6g.a;
                    mfd mfdVar = new mfd(i);
                    mfdVar.b = str;
                    mfdVar.W = i;
                    return mfdVar;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                mfd value = entryCeilingEntry.getValue();
                value.getClass();
                value.b = str;
                value.W = i;
                return value;
            }
        }
    }

    public mfd(int i) {
        this.a = i;
        int i2 = i + 1;
        this.V = new int[i2];
        this.c = new long[i2];
        this.d = new double[i2];
        this.e = new String[i2];
        this.f = new byte[i2][];
    }

    @Override // defpackage.xze
    public final int a() {
        return this.W;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.wze
    public final void e(int i, double d) {
        this.V[i] = 3;
        this.d[i] = d;
    }

    @Override // defpackage.xze
    public final String h() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        r6.g("Required value was null.");
        return null;
    }

    @Override // defpackage.wze
    public final void n(int i, String str) {
        str.getClass();
        this.V[i] = 4;
        this.e[i] = str;
    }

    @Override // defpackage.xze
    public final void p(wze wzeVar) {
        int i = this.W;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.V[i2];
            if (i3 == 1) {
                wzeVar.u(i2);
            } else if (i3 == 2) {
                wzeVar.q(i2, this.c[i2]);
            } else if (i3 == 3) {
                wzeVar.e(i2, this.d[i2]);
            } else if (i3 == 4) {
                String str = this.e[i2];
                if (str == null) {
                    l5.q("Required value was null.");
                    return;
                }
                wzeVar.n(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.f[i2];
                if (bArr == null) {
                    l5.q("Required value was null.");
                    return;
                }
                wzeVar.r(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // defpackage.wze
    public final void q(int i, long j) {
        this.V[i] = 2;
        this.c[i] = j;
    }

    @Override // defpackage.wze
    public final void r(int i, byte[] bArr) {
        this.V[i] = 5;
        this.f[i] = bArr;
    }

    public final void s() {
        TreeMap<Integer, mfd> treeMap = X;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                it.getClass();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
            j6g j6gVar = j6g.a;
        }
    }

    @Override // defpackage.wze
    public final void u(int i) {
        this.V[i] = 1;
    }
}

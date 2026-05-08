package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xpf {
    public static final xpf d = new xpf(new wpf[0]);
    public static final String e;
    public final int a;
    public final qyc b;
    public int c;

    static {
        String str = vjg.a;
        e = Integer.toString(0, 36);
    }

    public xpf(wpf... wpfVarArr) {
        qyc qycVarK = e47.k(wpfVarArr);
        this.b = qycVarK;
        this.a = wpfVarArr.length;
        int i = 0;
        while (i < qycVarK.d) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < qycVarK.d; i3++) {
                if (((wpf) qycVarK.get(i)).equals(qycVarK.get(i3))) {
                    zkd.x("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final wpf a(int i) {
        return (wpf) this.b.get(i);
    }

    public final int b(wpf wpfVar) {
        int iIndexOf = this.b.indexOf(wpfVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xpf.class != obj.getClass()) {
            return false;
        }
        xpf xpfVar = (xpf) obj;
        return this.a == xpfVar.a && this.b.equals(xpfVar.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }

    public final String toString() {
        return this.b.toString();
    }
}

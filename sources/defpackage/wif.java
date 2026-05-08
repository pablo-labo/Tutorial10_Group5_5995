package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wif {
    public static final wif c = new wif(2, false);
    public static final wif d = new wif(1, true);
    public final int a;
    public final boolean b;

    @fd8
    public static final class a {
        public final int a;

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.a == ((a) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            int i = this.a;
            return i == 1 ? "Linearity.Linear" : i == 2 ? "Linearity.FontHinting" : i == 3 ? "Linearity.None" : "Invalid";
        }
    }

    public wif(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wif)) {
            return false;
        }
        wif wifVar = (wif) obj;
        return this.a == wifVar.a && this.b == wifVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return equals(c) ? "TextMotion.Static" : equals(d) ? "TextMotion.Animated" : "Invalid";
    }
}

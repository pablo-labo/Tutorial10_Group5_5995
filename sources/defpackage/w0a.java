package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class w0a {
    public final int a;

    public static final class a extends w0a {
        public final long b;
        public final ArrayList c;
        public final ArrayList d;

        public a(int i, long j) {
            super(i);
            this.b = j;
            this.c = new ArrayList();
            this.d = new ArrayList();
        }

        public final a b(int i) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = (a) arrayList.get(i2);
                if (aVar.a == i) {
                    return aVar;
                }
            }
            return null;
        }

        public final b c(int i) {
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = (b) arrayList.get(i2);
                if (bVar.a == i) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // defpackage.w0a
        public final String toString() {
            return w0a.a(this.a) + " leaves: " + Arrays.toString(this.c.toArray()) + " containers: " + Arrays.toString(this.d.toArray());
        }
    }

    public static final class b extends w0a {
        public final g4b b;

        public b(int i, g4b g4bVar) {
            super(i);
            this.b = g4bVar;
        }
    }

    public w0a(int i) {
        this.a = i;
    }

    public static String a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public String toString() {
        return a(this.a);
    }
}

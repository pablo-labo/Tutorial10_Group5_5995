package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface jd6 {

    public static final class a implements jd6 {
        @Override // defpackage.jd6
        public final ArrayList a(int i, int i2) {
            int i3 = i - i2;
            int i4 = i3 / 2;
            int i5 = i3 % 2;
            ArrayList arrayList = new ArrayList(2);
            int i6 = 0;
            while (i6 < 2) {
                arrayList.add(Integer.valueOf((i6 < i5 ? 1 : 0) + i4));
                i6++;
            }
            return arrayList;
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return -2;
        }
    }

    ArrayList a(int i, int i2);
}

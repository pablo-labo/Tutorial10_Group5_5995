package defpackage;

import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ra4 {
    public final Object a;

    public ra4(long[] jArr) {
        j3a j3aVar;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            j3aVar = new j3a(jArrCopyOf.length);
            int i = j3aVar.b;
            if (i < 0) {
                l5.s("");
                throw null;
            }
            if (jArrCopyOf.length != 0) {
                int length = jArrCopyOf.length + i;
                long[] jArr2 = j3aVar.a;
                if (jArr2.length < length) {
                    j3aVar.a = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                }
                long[] jArr3 = j3aVar.a;
                int i2 = j3aVar.b;
                if (i != i2) {
                    pyd.i(jArrCopyOf.length + i, i, i2, jArr3, jArr3);
                }
                pyd.i(i, 0, jArrCopyOf.length, jArrCopyOf, jArr3);
                j3aVar.b += jArrCopyOf.length;
            }
        } else {
            j3aVar = new j3a(16);
        }
        this.a = j3aVar;
    }

    public void a(Enum r1, float f) {
        ((LinkedHashMap) this.a).put(r1, Float.valueOf(f));
    }

    public ra4() {
        this.a = new LinkedHashMap();
    }
}

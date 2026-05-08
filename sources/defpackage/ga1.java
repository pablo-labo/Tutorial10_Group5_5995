package defpackage;

import androidx.media3.exoplayer.source.o;
import defpackage.l42;

/* JADX INFO: loaded from: classes.dex */
public final class ga1 implements l42.a {
    public final int[] a;
    public final o[] b;

    public ga1(int[] iArr, o[] oVarArr) {
        this.a = iArr;
        this.b = oVarArr;
    }

    public final zpf a(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                zkd.w("BaseMediaChunkOutput", "Unmatched track of type: " + i);
                return new u54();
            }
            if (i == iArr[i2]) {
                return this.b[i2];
            }
            i2++;
        }
    }
}

package defpackage;

import android.util.SparseIntArray;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes2.dex */
public final class ufb {
    public final wfb a;
    public final mia b;
    public final wfb c;
    public final lia d;
    public final wfb e;
    public final mia f;
    public final wfb g;
    public final mia h;
    public final String i;
    public final int j;

    public static final class a {
    }

    public ufb(a aVar) {
        it5.a();
        this.a = tl3.a();
        this.b = mia.a();
        int i = jn3.a;
        int i2 = i * 4194304;
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (int i3 = 131072; i3 <= 4194304; i3 *= 2) {
            sparseIntArray.put(i3, i);
        }
        this.c = new wfb(4194304, i2, sparseIntArray, jn3.a);
        this.d = lia.a();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.put(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, 5);
        sparseIntArray2.put(2048, 5);
        sparseIntArray2.put(4096, 5);
        sparseIntArray2.put(8192, 5);
        sparseIntArray2.put(16384, 5);
        sparseIntArray2.put(32768, 5);
        sparseIntArray2.put(65536, 5);
        sparseIntArray2.put(131072, 5);
        sparseIntArray2.put(262144, 2);
        sparseIntArray2.put(524288, 2);
        sparseIntArray2.put(1048576, 2);
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int i4 = iMin < 16777216 ? 3145728 : iMin < 33554432 ? 6291456 : 12582912;
        int iMin2 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        this.e = new wfb(i4, iMin2 < 16777216 ? iMin2 / 2 : (iMin2 / 4) * 3, sparseIntArray2, -1);
        this.f = mia.a();
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        sparseIntArray3.put(16384, 5);
        this.g = new wfb(81920, 1048576, sparseIntArray3, -1);
        this.h = mia.a();
        this.i = "legacy";
        this.j = 4194304;
        it5.a();
    }
}

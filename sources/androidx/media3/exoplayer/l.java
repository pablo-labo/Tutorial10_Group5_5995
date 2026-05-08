package androidx.media3.exoplayer;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
public interface l {

    public interface a {
    }

    static boolean d(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    static int f(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT | i4;
    }

    int a(androidx.media3.common.a aVar);

    String getName();

    int y();
}

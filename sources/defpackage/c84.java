package defpackage;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes2.dex */
public final class c84 extends elg {
    public final d9a h;
    public final int[] i;

    public c84(ReadableMap readableMap, d9a d9aVar) {
        int[] iArr;
        super(null);
        this.h = d9aVar;
        ReadableArray array = readableMap.getArray("input");
        if (array == null) {
            iArr = new int[0];
        } else {
            int size = array.size();
            int[] iArr2 = new int[size];
            for (int i = 0; i < size; i++) {
                iArr2[i] = array.getInt(i);
            }
            iArr = iArr2;
        }
        this.i = iArr;
    }

    @Override // defpackage.elg, defpackage.hd0
    public final String d() {
        return "DivisionAnimatedNode[" + this.d + "]: input nodes: " + this.i + " - super: " + super.d();
    }

    @Override // defpackage.hd0
    public final void e() {
        int[] iArr = this.i;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            hd0 hd0VarJ = this.h.j(iArr[i]);
            if (hd0VarJ == null || !(hd0VarJ instanceof elg)) {
                throw new JSApplicationCausedNativeException(p6.c(this.d, "Illegal node ID set as an input for Animated.divide node with Animated ID "));
            }
            double d = ((elg) hd0VarJ).e;
            if (i2 == 0) {
                this.e = d;
            } else {
                if (d == 0.0d) {
                    throw new JSApplicationCausedNativeException(p6.c(this.d, "Detected a division by zero in Animated.divide node with Animated ID "));
                }
                this.e /= d;
            }
            i++;
            i2 = i3;
        }
    }
}

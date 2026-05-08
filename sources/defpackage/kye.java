package defpackage;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes2.dex */
public final class kye extends elg {
    public final d9a h;
    public final int[] i;

    public kye(ReadableMap readableMap, d9a d9aVar) {
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
        return "SubtractionAnimatedNode[" + this.d + "]: input nodes: " + this.i + " - super: " + super.d();
    }

    @Override // defpackage.hd0
    public final void e() {
        int[] iArr = this.i;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            hd0 hd0VarJ = this.h.j(iArr[i]);
            if (hd0VarJ == null || !(hd0VarJ instanceof elg)) {
                throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.subtract node");
            }
            double dG = ((elg) hd0VarJ).g();
            if (i == 0) {
                this.e = dG;
            } else {
                this.e -= dG;
            }
        }
    }
}

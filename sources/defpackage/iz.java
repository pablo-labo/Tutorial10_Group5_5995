package defpackage;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes2.dex */
public final class iz extends elg {
    public final d9a h;
    public final int[] i;

    public iz(ReadableMap readableMap, d9a d9aVar) {
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
        int i = this.d;
        String strR0 = ut0.r0(null, this.i, 63);
        String strD = super.d();
        StringBuilder sbJ = m6.j(i, "AdditionAnimatedNode[", "]: input nodes: ", strR0, " - super: ");
        sbJ.append(strD);
        return sbJ.toString();
    }

    @Override // defpackage.hd0
    public final void e() {
        this.e = 0.0d;
        double dG = 0.0d;
        for (int i : this.i) {
            hd0 hd0VarJ = this.h.j(i);
            if (!(hd0VarJ instanceof elg)) {
                throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.Add node");
            }
            dG += ((elg) hd0VarJ).g();
        }
        this.e = 0.0d + dG;
    }
}

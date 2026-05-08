package defpackage;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes2.dex */
public final class iy9 extends elg {
    public final d9a h;
    public final int i;
    public final double j;

    public iy9(ReadableMap readableMap, d9a d9aVar) {
        super(null);
        this.h = d9aVar;
        this.i = readableMap.getInt("input");
        this.j = readableMap.getDouble("modulus");
    }

    @Override // defpackage.elg, defpackage.hd0
    public final String d() {
        int i = this.d;
        String strD = super.d();
        StringBuilder sbF = uz.f("NativeAnimatedNodesManager[", i, "] inputNode: ", this.i, " modulus: ");
        sbF.append(this.j);
        sbF.append(" super: ");
        sbF.append(strD);
        return sbF.toString();
    }

    @Override // defpackage.hd0
    public final void e() {
        hd0 hd0VarJ = this.h.j(this.i);
        if (!(hd0VarJ instanceof elg)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.modulus node");
        }
        double dG = ((elg) hd0VarJ).g();
        double d = this.j;
        this.e = ((dG % d) + d) % d;
    }
}

package defpackage;

import com.facebook.react.bridge.WritableMap;
import com.swmansion.gesturehandler.core.i;

/* JADX INFO: loaded from: classes3.dex */
public final class xfd extends pz5<i> {
    public final double e;
    public final float f;
    public final float g;
    public final double h;

    public xfd(i iVar) {
        super(iVar);
        this.e = iVar.N;
        this.f = iVar.P;
        this.g = iVar.Q;
        this.h = iVar.O;
    }

    @Override // defpackage.pz5
    public final void a(WritableMap writableMap) {
        super.a(writableMap);
        writableMap.putDouble("rotation", this.e);
        writableMap.putDouble("anchorX", nn2.C(this.f));
        writableMap.putDouble("anchorY", nn2.C(this.g));
        writableMap.putDouble("velocity", this.h);
    }
}

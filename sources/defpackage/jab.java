package defpackage;

import com.facebook.react.bridge.WritableMap;
import com.swmansion.gesturehandler.core.g;

/* JADX INFO: loaded from: classes3.dex */
public final class jab extends pz5<g> {
    public final double e;
    public final float f;
    public final float g;
    public final double h;

    public jab(g gVar) {
        super(gVar);
        this.e = gVar.M;
        this.f = gVar.O;
        this.g = gVar.P;
        this.h = gVar.N;
    }

    @Override // defpackage.pz5
    public final void a(WritableMap writableMap) {
        super.a(writableMap);
        writableMap.putDouble("scale", this.e);
        writableMap.putDouble("focalX", nn2.C(this.f));
        writableMap.putDouble("focalY", nn2.C(this.g));
        writableMap.putDouble("velocity", this.h);
    }
}

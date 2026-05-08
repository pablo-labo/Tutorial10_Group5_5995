package defpackage;

import com.facebook.react.bridge.WritableMap;
import com.swmansion.gesturehandler.core.f;
import com.swmansion.gesturehandler.core.k;

/* JADX INFO: loaded from: classes3.dex */
public final class e3b extends pz5<f> {
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final k m;

    public e3b(f fVar) {
        super(fVar);
        this.e = fVar.t;
        this.f = fVar.u;
        this.g = fVar.n();
        this.h = fVar.o();
        this.i = (fVar.h0 - fVar.d0) + fVar.f0;
        this.j = (fVar.i0 - fVar.e0) + fVar.g0;
        this.k = fVar.M;
        this.l = fVar.N;
        this.m = fVar.o0;
    }

    @Override // defpackage.pz5
    public final void a(WritableMap writableMap) {
        super.a(writableMap);
        writableMap.putDouble("x", nn2.C(this.e));
        writableMap.putDouble("y", nn2.C(this.f));
        writableMap.putDouble("absoluteX", nn2.C(this.g));
        writableMap.putDouble("absoluteY", nn2.C(this.h));
        writableMap.putDouble("translationX", nn2.C(this.i));
        writableMap.putDouble("translationY", nn2.C(this.j));
        writableMap.putDouble("velocityX", nn2.C(this.k));
        writableMap.putDouble("velocityY", nn2.C(this.l));
        k kVar = this.m;
        if (kVar.e == -1.0d) {
            return;
        }
        writableMap.putMap("stylusData", kVar.a());
    }
}

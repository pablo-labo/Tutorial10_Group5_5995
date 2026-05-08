package defpackage;

import com.facebook.react.bridge.WritableMap;
import com.swmansion.gesturehandler.core.a;

/* JADX INFO: loaded from: classes3.dex */
public final class qh5 extends pz5<a> {
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public qh5(a aVar) {
        super(aVar);
        this.e = aVar.t;
        this.f = aVar.u;
        this.g = aVar.n();
        this.h = aVar.o();
    }

    @Override // defpackage.pz5
    public final void a(WritableMap writableMap) {
        super.a(writableMap);
        writableMap.putDouble("x", nn2.C(this.e));
        writableMap.putDouble("y", nn2.C(this.f));
        writableMap.putDouble("absoluteX", nn2.C(this.g));
        writableMap.putDouble("absoluteY", nn2.C(this.h));
    }
}

package defpackage;

import com.facebook.react.bridge.WritableMap;
import com.swmansion.gesturehandler.core.l;

/* JADX INFO: loaded from: classes3.dex */
public final class t8f extends pz5<l> {
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public t8f(l lVar) {
        super(lVar);
        this.e = lVar.t;
        this.f = lVar.u;
        this.g = lVar.n();
        this.h = lVar.o();
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

package defpackage;

import com.facebook.react.bridge.WritableMap;
import com.swmansion.gesturehandler.core.c;

/* JADX INFO: loaded from: classes3.dex */
public final class l59 extends pz5<c> {
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;

    public l59(c cVar) {
        super(cVar);
        this.e = cVar.t;
        this.f = cVar.u;
        this.g = cVar.n();
        this.h = cVar.o();
        this.i = (int) (cVar.T - cVar.S);
    }

    @Override // defpackage.pz5
    public final void a(WritableMap writableMap) {
        super.a(writableMap);
        writableMap.putDouble("x", nn2.C(this.e));
        writableMap.putDouble("y", nn2.C(this.f));
        writableMap.putDouble("absoluteX", nn2.C(this.g));
        writableMap.putDouble("absoluteY", nn2.C(this.h));
        writableMap.putInt("duration", this.i);
    }
}

package defpackage;

import com.facebook.react.bridge.WritableMap;
import com.swmansion.gesturehandler.core.b;
import com.swmansion.gesturehandler.core.k;

/* JADX INFO: loaded from: classes3.dex */
public final class dk6 extends pz5<b> {
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final k i;

    public dk6(b bVar) {
        super(bVar);
        this.e = bVar.t;
        this.f = bVar.u;
        this.g = bVar.n();
        this.h = bVar.o();
        this.i = bVar.O;
    }

    @Override // defpackage.pz5
    public final void a(WritableMap writableMap) {
        super.a(writableMap);
        writableMap.putDouble("x", nn2.C(this.e));
        writableMap.putDouble("y", nn2.C(this.f));
        writableMap.putDouble("absoluteX", nn2.C(this.g));
        writableMap.putDouble("absoluteY", nn2.C(this.h));
        k kVar = this.i;
        if (kVar.e == -1.0d) {
            return;
        }
        writableMap.putMap("stylusData", kVar.a());
    }
}

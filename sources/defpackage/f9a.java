package defpackage;

import com.facebook.react.bridge.WritableMap;
import com.swmansion.gesturehandler.core.e;

/* JADX INFO: loaded from: classes3.dex */
public final class f9a extends pz5<e> {
    public final boolean e;

    public f9a(e eVar) {
        super(eVar);
        this.e = eVar.i;
    }

    @Override // defpackage.pz5
    public final void a(WritableMap writableMap) {
        super.a(writableMap);
        writableMap.putBoolean("pointerInside", this.e);
    }
}

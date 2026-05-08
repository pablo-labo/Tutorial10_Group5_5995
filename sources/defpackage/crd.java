package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* JADX INFO: loaded from: classes3.dex */
public final class crd extends ox4<crd> {
    public final float a;
    public final boolean b;
    public final boolean c;
    public final short d;

    public crd(int i, int i2, float f, boolean z, boolean z2, short s) {
        super(i, i2);
        this.a = f;
        this.b = z;
        this.c = z2;
        this.d = s;
    }

    @Override // defpackage.ox4
    public final short getCoalescingKey() {
        return this.d;
    }

    @Override // defpackage.ox4
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, this.a);
        writableMapCreateMap.putInt("closing", this.b ? 1 : 0);
        writableMapCreateMap.putInt("goingForward", this.c ? 1 : 0);
        return writableMapCreateMap;
    }

    @Override // defpackage.ox4
    public final String getEventName() {
        return "topTransitionProgress";
    }
}

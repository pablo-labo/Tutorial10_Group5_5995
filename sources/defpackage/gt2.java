package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes2.dex */
@sy3
public final class gt2 extends ox4<gt2> {
    public final int a;
    public final int b;

    @sy3
    public gt2(int i, int i2, int i3) {
        super(-1, i);
        this.a = i2;
        this.b = i3;
    }

    @Override // defpackage.ox4
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        writableMapCreateMap.putDouble("width", nn2.C(this.a));
        writableMapCreateMap.putDouble("height", nn2.C(this.b));
        return writableMapCreateMap;
    }

    @Override // defpackage.ox4
    public final String getEventName() {
        return "topContentSizeChange";
    }
}

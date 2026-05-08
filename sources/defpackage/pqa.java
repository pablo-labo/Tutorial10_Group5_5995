package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes2.dex */
public final class pqa extends ox4<pqa> {
    public static final pgb<pqa> e = new pgb<>(20);
    public int a;
    public int b;
    public int c;
    public int d;

    @Override // defpackage.ox4
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("x", nn2.C(this.a));
        readableMapBuilder.put("y", nn2.C(this.b));
        readableMapBuilder.put("width", nn2.C(this.c));
        readableMapBuilder.put("height", nn2.C(this.d));
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap("layout", writableMapCreateMap);
        writableMapCreateMap2.putInt("target", getViewTag());
        return writableMapCreateMap2;
    }

    @Override // defpackage.ox4
    public final String getEventName() {
        return "topLayout";
    }

    @Override // defpackage.ox4
    public final void onDispose() {
        e.a(this);
    }
}

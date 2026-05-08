package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes2.dex */
public final class akc extends ox4<yoc> {
    public final float a;
    public final float b;

    public akc(float f, float f2, int i, int i2) {
        super(i, i2);
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.ox4
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("width", this.a);
        readableMapBuilder.put("height", this.b);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.getClass();
        writableMapCreateMap2.putMap("contentSize", writableMapCreateMap);
        writableMapCreateMap2.putInt("target", getViewTag());
        return writableMapCreateMap2;
    }

    @Override // defpackage.ox4
    public final String getEventName() {
        return "topContentSizeChange";
    }
}

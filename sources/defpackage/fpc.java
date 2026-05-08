package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes2.dex */
public final class fpc extends ox4<fpc> {
    public final int a;
    public final int b;

    public fpc(int i, int i2, int i3, int i4) {
        super(i, i2);
        this.a = i3;
        this.b = i4;
    }

    @Override // defpackage.ox4
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("start", this.a);
        readableMapBuilder.put("end", this.b);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.getClass();
        writableMapCreateMap2.putMap("selection", writableMapCreateMap);
        return writableMapCreateMap2;
    }

    @Override // defpackage.ox4
    public final String getEventName() {
        return "topSelectionChange";
    }
}

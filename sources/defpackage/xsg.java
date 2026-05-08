package defpackage;

import android.graphics.Rect;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes2.dex */
public final class xsg extends ox4<xsg> {
    public final wsg a;
    public final boolean b;
    public final WritableMap c;
    public final WritableMap d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsg(int i, int i2, wsg wsgVar, Rect rect, Rect rect2, boolean z) {
        super(i, i2);
        rect.getClass();
        rect2.getClass();
        this.a = wsgVar;
        this.b = z;
        this.c = zkd.q(rect);
        this.d = zkd.q(rect2);
    }

    @Override // defpackage.ox4
    public final boolean experimental_isSynchronous() {
        return this.b;
    }

    @Override // defpackage.ox4
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        writableMapCreateMap.putInt("mode", this.a.a());
        writableMapCreateMap.putMap("targetRect", this.c);
        writableMapCreateMap.putMap("thresholdRect", this.d);
        return writableMapCreateMap;
    }

    @Override // defpackage.ox4
    public final String getEventName() {
        return "modeChange";
    }
}

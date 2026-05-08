package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes3.dex */
public final class lf7 extends ox4<lf7> {
    public final gf4 a;
    public final ptc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf7(int i, int i2, gf4 gf4Var, ptc ptcVar) {
        super(i, i2);
        gf4Var.getClass();
        ptcVar.getClass();
        this.a = gf4Var;
        this.b = ptcVar;
    }

    @Override // defpackage.ox4
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        writableMapCreateMap.putMap("insets", hh2.p(this.a));
        this.b.getClass();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.getClass();
        writableMapCreateMap2.putDouble("x", nn2.C(r5.a));
        writableMapCreateMap2.putDouble("y", nn2.C(r5.b));
        writableMapCreateMap2.putDouble("width", nn2.C(r5.c));
        writableMapCreateMap2.putDouble("height", nn2.C(r5.d));
        writableMapCreateMap.putMap("frame", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    @Override // defpackage.ox4
    public final String getEventName() {
        return "topInsetsChange";
    }
}

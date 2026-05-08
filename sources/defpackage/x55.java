package defpackage;

import android.view.ViewGroup;
import com.facebook.react.bridge.WritableNativeMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x55 extends ViewGroup {
    public vse a;
    public float b;
    public float c;
    public float d;

    public final void b(int i, int i2, int i3) {
        float fC = nn2.C(i);
        float fC2 = nn2.C(i2);
        float fC3 = nn2.C(i3);
        if (Math.abs(this.b - fC) >= 0.9f || Math.abs(this.c - fC2) >= 0.9f || Math.abs(this.d - fC3) >= 0.9f) {
            this.b = fC;
            this.c = fC2;
            this.d = fC3;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("frameWidth", fC);
            writableNativeMap.putDouble("frameHeight", fC2);
            writableNativeMap.putDouble("contentOffsetX", 0.0d);
            writableNativeMap.putDouble("contentOffsetY", fC3);
            vse vseVar = this.a;
            if (vseVar != null) {
                vseVar.updateState(writableNativeMap);
            }
        }
    }

    public final void setStateWrapper(vse vseVar) {
        this.a = vseVar;
    }
}

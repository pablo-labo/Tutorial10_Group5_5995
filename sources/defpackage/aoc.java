package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener;
import com.facebook.react.bridge.WritableNativeMap;
import defpackage.epg;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class aoc extends ViewGroup {
    public final mkf a;
    public vse b;

    public aoc(mkf mkfVar) {
        super(mkfVar);
        this.a = mkfVar;
    }

    public final mkf getReactContext() {
        return this.a;
    }

    public final vse getStateWrapper$ReactAndroid_release() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        tpa tpaVar = new tpa() { // from class: ync
            @Override // defpackage.tpa
            public final rzg b(View view, rzg rzgVar) {
                view.getClass();
                kf7 kf7VarG = rzgVar.a.g(135);
                kf7VarG.getClass();
                aoc aocVar = this.a;
                vse vseVar = aocVar.b;
                if (vseVar != null) {
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putDouble(GesturesListener.SCROLL_DIRECTION_LEFT, nn2.C(kf7VarG.a));
                    writableNativeMap.putDouble("top", nn2.C(kf7VarG.b));
                    writableNativeMap.putDouble("bottom", nn2.C(kf7VarG.d));
                    writableNativeMap.putDouble(GesturesListener.SCROLL_DIRECTION_RIGHT, nn2.C(kf7VarG.c));
                    vseVar.updateState(writableNativeMap);
                } else {
                    mkf mkfVar = aocVar.a;
                    mkfVar.runOnNativeModulesQueueThread(new znc(aocVar, kf7VarG, mkfVar));
                }
                return rzg.b;
            }
        };
        WeakHashMap<View, prg> weakHashMap = epg.a;
        epg.d.m(this, tpaVar);
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void setStateWrapper$ReactAndroid_release(vse vseVar) {
        this.b = vseVar;
    }
}

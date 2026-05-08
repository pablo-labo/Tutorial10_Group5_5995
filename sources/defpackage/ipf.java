package defpackage;

import android.view.MotionEvent;
import com.datadog.android.ndk.internal.NdkCrashLog;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* JADX INFO: loaded from: classes2.dex */
public final class ipf {
    public static WritableMap[] a(cpf cpfVar) {
        MotionEvent motionEvent = cpfVar.a;
        hh1.n(motionEvent);
        WritableMap[] writableMapArr = new WritableMap[motionEvent.getPointerCount()];
        float x = motionEvent.getX() - cpfVar.d;
        float y = motionEvent.getY() - cpfVar.e;
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.getClass();
            writableMapCreateMap.putDouble("pageX", nn2.C(motionEvent.getX(i)));
            writableMapCreateMap.putDouble("pageY", nn2.C(motionEvent.getY(i)));
            float x2 = motionEvent.getX(i) - x;
            float y2 = motionEvent.getY(i) - y;
            writableMapCreateMap.putDouble("locationX", nn2.C(x2));
            writableMapCreateMap.putDouble("locationY", nn2.C(y2));
            writableMapCreateMap.putInt("targetSurface", cpfVar.getSurfaceId());
            writableMapCreateMap.putInt("target", cpfVar.getViewTag());
            writableMapCreateMap.putDouble(NdkCrashLog.TIMESTAMP_KEY_NAME, cpfVar.getTimestampMs());
            writableMapCreateMap.putDouble("identifier", motionEvent.getPointerId(i));
            writableMapArr[i] = writableMapCreateMap;
        }
        return writableMapArr;
    }

    public static WritableArray b(boolean z, WritableMap[] writableMapArr) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.getClass();
        for (WritableMap writableMapCopy : writableMapArr) {
            if (writableMapCopy != null) {
                if (z) {
                    writableMapCopy = writableMapCopy.copy();
                }
                writableArrayCreateArray.pushMap(writableMapCopy);
            }
        }
        return writableArrayCreateArray;
    }

    public static final void c(RCTEventEmitter rCTEventEmitter, cpf cpfVar) {
        rCTEventEmitter.getClass();
        epf epfVar = cpfVar.b;
        hh1.n(epfVar);
        WritableArray writableArrayB = b(false, a(cpfVar));
        MotionEvent motionEvent = cpfVar.a;
        hh1.n(motionEvent);
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.getClass();
        if (epfVar == epf.MOVE || epfVar == epf.CANCEL) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 0; i < pointerCount; i++) {
                writableArrayCreateArray.pushInt(i);
            }
        } else {
            if (epfVar != epf.START && epfVar != epf.END) {
                j6.f(epfVar, "Unknown touch type: ");
                return;
            }
            writableArrayCreateArray.pushInt(motionEvent.getActionIndex());
        }
        epf.a.getClass();
        rCTEventEmitter.receiveTouches(epfVar.a(), writableArrayB, writableArrayCreateArray);
    }
}

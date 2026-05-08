package defpackage;

import com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class ojc {
    public static final Map<Integer, String> c = lc9.a0(new Pair(23, "select"), new Pair(66, "select"), new Pair(62, "select"), new Pair(85, "playPause"), new Pair(89, "rewind"), new Pair(90, "fastForward"), new Pair(86, "stop"), new Pair(87, "next"), new Pair(88, "previous"), new Pair(19, GesturesListener.SCROLL_DIRECTION_UP), new Pair(22, GesturesListener.SCROLL_DIRECTION_RIGHT), new Pair(20, GesturesListener.SCROLL_DIRECTION_DOWN), new Pair(21, GesturesListener.SCROLL_DIRECTION_LEFT), new Pair(165, "info"), new Pair(82, "menu"));
    public final wnc a;
    public int b = -1;

    public ojc(wnc wncVar) {
        this.a = wncVar;
    }

    public final void a(int i, int i2, String str) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("eventType", str);
        writableNativeMap.putInt("eventKeyAction", i2);
        if (i != -1) {
            writableNativeMap.putInt("tag", i);
        }
        this.a.m("onHWKeyEvent", writableNativeMap);
    }
}

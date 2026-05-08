package defpackage;

import android.net.Uri;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptValue;
import java.io.File;
import java.net.URI;
import java.net.URL;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class tf0 {
    public static final hb9 a;

    static {
        hb9 hb9Var = new hb9();
        iwc iwcVar = fwc.a;
        for (yd8 yd8Var : u63.a0(iwcVar.b(Integer.TYPE), iwcVar.b(Float.TYPE), iwcVar.b(Double.TYPE), iwcVar.b(Long.TYPE), iwcVar.b(Boolean.TYPE), iwcVar.b(String.class), iwcVar.b(byte[].class), iwcVar.b(long[].class), iwcVar.b(int[].class), iwcVar.b(boolean[].class), iwcVar.b(float[].class), iwcVar.b(double[].class), iwcVar.b(JavaScriptValue.class), iwcVar.b(JavaScriptObject.class), iwcVar.b(pyf.class), iwcVar.b(xg7.class), iwcVar.b(pg7.class), iwcVar.b(sg7.class), iwcVar.b(n5g.class), iwcVar.b(q5g.class), iwcVar.b(h5g.class), iwcVar.b(k5g.class), iwcVar.b(th5.class), iwcVar.b(wh5.class), iwcVar.b(cf1.class), iwcVar.b(hf1.class), iwcVar.b(ReadableArray.class), iwcVar.b(ReadableMap.class), iwcVar.b(URL.class), iwcVar.b(Uri.class), iwcVar.b(URI.class), iwcVar.b(File.class), iwcVar.b(Object.class), iwcVar.b(j6g.class), iwcVar.b(kqc.class))) {
            hb9Var.put(new Pair(yd8Var, Boolean.FALSE), new rf0(new yr4(yd8Var, false), null));
            hb9Var.put(new Pair(yd8Var, Boolean.TRUE), new rf0(new yr4(yd8Var, true), null));
        }
        a = hb9Var.j();
    }

    public static hb9 a() {
        return a;
    }
}

package defpackage;

import android.net.Uri;
import com.facebook.imagepipeline.request.a;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class gt5 extends xm8 {
    public final a2<?, a, ?, ?> o0;
    public final Object p0;
    public Uri q0;
    public ReadableMap r0;
    public String t0;
    public int v0;
    public float s0 = Float.NaN;
    public float u0 = Float.NaN;

    public gt5(a2<?, a, ?, ?> a2Var, Object obj) {
        this.o0 = a2Var;
        this.p0 = obj;
    }

    @Override // defpackage.loc, defpackage.koc
    public final boolean E() {
        return true;
    }

    @snc(name = "headers")
    public final void setHeaders(ReadableMap readableMap) {
        this.r0 = readableMap;
    }

    @Override // defpackage.xm8
    public final void setHeight(Dynamic dynamic) {
        dynamic.getClass();
        if (dynamic.getType() == ReadableType.Number) {
            this.u0 = (float) dynamic.asDouble();
        } else {
            s55.n("ReactNative", "Inline images must not have percentage based height");
            this.u0 = Float.NaN;
        }
    }

    @snc(name = "resizeMode")
    public final void setResizeMode(String str) {
        this.t0 = str;
    }

    @snc(name = "src")
    public final void setSource(ReadableArray readableArray) {
        String string;
        Uri uri;
        Uri uriBuild = null;
        if (readableArray == null || readableArray.size() == 0 || readableArray.getType(0) != ReadableType.Map) {
            string = null;
        } else {
            ReadableMap map = readableArray.getMap(0);
            if (map == null) {
                r6.g("Required value was null.");
                return;
            }
            string = map.getString("uri");
        }
        if (string != null) {
            try {
                uri = Uri.parse(string);
            } catch (Exception unused) {
            }
            try {
                if (uri.getScheme() == null) {
                    uri = null;
                }
            } catch (Exception unused2) {
            }
            if (uri == null) {
                mkf mkfVar = this.d;
                hh1.n(mkfVar);
                if (string.length() != 0) {
                    Locale locale = Locale.getDefault();
                    locale.getClass();
                    String lowerCase = string.toLowerCase(locale);
                    lowerCase.getClass();
                    uriBuild = new Uri.Builder().scheme("res").path(String.valueOf(mkfVar.getResources().getIdentifier(wve.I(lowerCase, "-", "_"), "drawable", mkfVar.getPackageName()))).build();
                }
            } else {
                uriBuild = uri;
            }
        }
        if (!wl7.b(uriBuild, this.q0)) {
            b0();
        }
        this.q0 = uriBuild;
    }

    @snc(customType = "Color", name = "tintColor")
    public final void setTintColor(int i) {
        this.v0 = i;
    }

    @Override // defpackage.xm8
    public final void setWidth(Dynamic dynamic) {
        dynamic.getClass();
        if (dynamic.getType() == ReadableType.Number) {
            this.s0 = (float) dynamic.asDouble();
        } else {
            s55.n("ReactNative", "Inline images must not have percentage based width");
            this.s0 = Float.NaN;
        }
    }
}

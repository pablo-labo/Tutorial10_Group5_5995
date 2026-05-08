package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.imagepipeline.request.a;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import defpackage.aga;
import defpackage.lpa;
import java.util.HashMap;
import java.util.Map;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;

/* JADX INFO: loaded from: classes2.dex */
public final class enc extends lpa {
    @Override // defpackage.lpa, defpackage.ka6
    /* JADX INFO: renamed from: L1 */
    public final void e0(lpa.a aVar, aga.a aVar2) {
        HashMap map;
        HashMap map2;
        aVar.getClass();
        aVar.f = SystemClock.elapsedRealtime();
        ppb ppbVar = aVar.b;
        Uri uri = ppbVar.Q().b;
        uri.getClass();
        CacheControl.Builder builder = new CacheControl.Builder();
        if (ppbVar.Q() instanceof dnc) {
            a aVarQ = ppbVar.Q();
            aVarQ.getClass();
            dnc dncVar = (dnc) aVarQ;
            ReadableMap readableMap = dncVar.r;
            if (readableMap == null) {
                map2 = null;
            } else {
                ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
                map2 = new HashMap();
                while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                    String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                    String string = readableMap.getString(strNextKey);
                    if (string != null) {
                        map2.put(strNextKey, string);
                    }
                }
            }
            int iOrdinal = dncVar.s.ordinal();
            if (iOrdinal == 0) {
                builder.b = true;
                map = map2;
            } else if (iOrdinal == 1) {
                builder.b = true;
                builder.a = true;
                map = map2;
            } else if (iOrdinal == 2) {
                builder.b();
                map = map2;
            } else if (iOrdinal != 3) {
                l.g();
                return;
            } else {
                builder.d = true;
                builder.b();
                map = map2;
            }
        } else {
            builder.b = true;
            map = null;
        }
        Headers.Companion companion = Headers.b;
        Map map3 = map;
        if (map == null) {
            map3 = bs4.a;
        }
        companion.getClass();
        Headers headersA = Headers.Companion.a(map3);
        Request.Builder builder2 = new Request.Builder();
        builder2.c = headersA.d();
        builder2.c(builder.a());
        String string2 = uri.toString();
        string2.getClass();
        builder2.g(string2);
        builder2.e("GET", null);
        M1(aVar, aVar2, builder2.b());
    }
}

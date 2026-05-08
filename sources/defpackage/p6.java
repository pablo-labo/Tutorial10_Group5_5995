package defpackage;

import android.net.Uri;
import androidx.media3.exoplayer.source.g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.runtime.ReactInstance;
import com.facebook.react.uimanager.UIConstantsProviderBinding;
import defpackage.fr6;
import defpackage.lz8;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p6 implements ru5, lz8.a, fr6.a, p55, UIConstantsProviderBinding.DefaultEventTypesProvider {
    public final /* synthetic */ int a;

    public static String c(int i, String str) {
        return str + i;
    }

    public static String d(Uri uri, String str) {
        return str + uri;
    }

    public static void f(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static /* synthetic */ void g(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i));
    }

    public static void j(StringBuilder sb, boolean z, String str, boolean z2, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
    }

    @Override // defpackage.ru5
    public Object apply(Object obj) {
        switch (this.a) {
            case 5:
                long j = ((s83) obj).b;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
            default:
                return e47.j(nz8.b(new k6(), ((g) obj).q().b));
        }
    }

    @Override // fr6.a
    public boolean b(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) {
            return true;
        }
        if (i2 == 77 && i3 == 76 && i4 == 76) {
            return i5 == 84 || i == 2;
        }
        return false;
    }

    @Override // com.facebook.react.uimanager.UIConstantsProviderBinding.DefaultEventTypesProvider
    public NativeMap getDefaultEventTypes() {
        ReactInstance.b bVar = ReactInstance.h;
        WritableNativeMap writableNativeMapMakeNativeMap = Arguments.makeNativeMap((Map<String, Object>) lc9.a0(new Pair("bubblingEventTypes", m0g.a), new Pair("directEventTypes", m0g.b)));
        writableNativeMapMakeNativeMap.getClass();
        return writableNativeMapMakeNativeMap;
    }

    @Override // defpackage.p55
    public m55[] h() {
        return new m55[]{new yoa()};
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        ((v20) obj).getClass();
    }

    public /* synthetic */ p6(int i) {
        this.a = i;
    }
}

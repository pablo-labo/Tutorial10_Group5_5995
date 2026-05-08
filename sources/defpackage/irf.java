package defpackage;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class irf extends hd0 {
    public final d9a e;
    public final List<c> f;

    public final class a extends c {
        public int b;
    }

    public final class b extends c {
        public double b;

        public b() {
            throw null;
        }
    }

    public class c {
        public String a;

        public c() {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [irf$b, irf$c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [irf$a, irf$c, java.lang.Object] */
    public irf(ReadableMap readableMap, d9a d9aVar) {
        List<c> list;
        ?? bVar;
        this.e = d9aVar;
        ReadableArray array = readableMap.getArray("transforms");
        if (array == null) {
            list = zr4.a;
        } else {
            int size = array.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                ReadableMap map = array.getMap(i);
                if (map == null) {
                    r6.g("Required value was null.");
                    throw null;
                }
                String string = map.getString("property");
                if (wl7.b(map.getString("type"), "animated")) {
                    bVar = new a();
                    bVar.a = string;
                    bVar.b = map.getInt("nodeTag");
                } else {
                    bVar = new b();
                    bVar.a = string;
                    bVar.b = map.getDouble("value");
                }
                arrayList.add(bVar);
            }
            list = arrayList;
        }
        this.f = list;
    }

    @Override // defpackage.hd0
    public final String d() {
        return "TransformAnimatedNode[" + this.d + "]: transformConfigs: " + this.f;
    }
}

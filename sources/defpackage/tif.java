package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class tif implements sif {
    public final Map<String, String> a;

    public tif(Map<String, String> map) {
        this.a = map;
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<String, String>> iterator() {
        return this.a.entrySet().iterator();
    }
}

package defpackage;

import java.util.LinkedHashMap;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes2.dex */
public interface eu4 {
    void a(cpe cpeVar, int i);

    default boolean b(g gVar) {
        return wl7.b(gVar.E(), getFullName());
    }

    void c(LinkedHashMap linkedHashMap, String str);

    String getFullName();
}

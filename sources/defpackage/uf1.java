package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.avro.g;
import org.apache.avro.h;

/* JADX INFO: loaded from: classes3.dex */
public final class uf1<D> extends lp9<D> {
    public static final wkf a = new wkf(new sf1());

    static {
        dmc.n(new tf1());
    }

    public uf1(zoe zoeVar, g gVar) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Long lValueOf = Long.valueOf(h.b(h.c(gVar).getBytes(StandardCharsets.UTF_8)));
        wic wicVar = new wic();
        zoeVar.c(gVar, gVar);
        concurrentHashMap.put(lValueOf, wicVar);
    }
}

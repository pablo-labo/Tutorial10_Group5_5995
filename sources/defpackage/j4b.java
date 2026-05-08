package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j4b implements Function {
    public final /* synthetic */ Map a;

    public /* synthetic */ j4b(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return (g) this.a.get((String) obj);
    }
}

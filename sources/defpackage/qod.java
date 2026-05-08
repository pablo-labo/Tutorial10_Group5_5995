package defpackage;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.Set;
import java.util.function.Consumer;
import org.apache.avro.b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qod implements Consumer {
    public final /* synthetic */ Set a;
    public final /* synthetic */ b b;
    public final /* synthetic */ JsonNode c;

    public /* synthetic */ qod(Set set, b bVar, JsonNode jsonNode) {
        this.a = set;
        this.b = bVar;
        this.c = jsonNode;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        String str = (String) obj;
        if (this.a.contains(str)) {
            return;
        }
        this.b.a(this.c.get(str), str);
    }
}

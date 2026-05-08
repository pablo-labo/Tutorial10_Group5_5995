package defpackage;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.function.Predicate;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tod implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tod(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((g) obj).P((JsonNode) obj2);
            default:
                return ((Boolean) ((ui) obj2).invoke(obj)).booleanValue();
        }
    }
}

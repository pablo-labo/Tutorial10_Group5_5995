package defpackage;

import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.introspect.AnnotatedAndMetadata;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tte implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return StdKeyDeserializers.lambda$findStringBasedKeyDeserializer$0((AnnotatedAndMetadata) obj);
    }
}

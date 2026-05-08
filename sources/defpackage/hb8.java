package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final class hb8 extends t2 {
    public JsonElement g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb8(s98 s98Var, Function1<? super JsonElement, j6g> function1) {
        super(s98Var, function1);
        s98Var.getClass();
        function1.getClass();
        ((ArrayList) this.a).add("primitive");
    }

    @Override // defpackage.t2
    public final JsonElement W() {
        JsonElement jsonElement = this.g;
        if (jsonElement != null) {
            return jsonElement;
        }
        l5.q("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
        return null;
    }

    @Override // defpackage.t2
    public final void X(String str, JsonElement jsonElement) {
        str.getClass();
        jsonElement.getClass();
        if (str != "primitive") {
            l5.q("This output can only consume primitives with 'primitive' tag");
        } else if (this.g != null) {
            l5.q("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
        } else {
            this.g = jsonElement;
            this.c.invoke(jsonElement);
        }
    }
}

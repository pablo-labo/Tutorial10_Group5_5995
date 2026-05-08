package defpackage;

import java.util.ArrayList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final class gb8 extends p2 {
    public final JsonElement V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb8(s98 s98Var, JsonElement jsonElement, String str) {
        super(s98Var, jsonElement, str);
        s98Var.getClass();
        jsonElement.getClass();
        this.V = jsonElement;
        ((ArrayList) this.c).add("primitive");
    }

    @Override // defpackage.p2
    public final JsonElement m0(String str) {
        str.getClass();
        if (str == "primitive") {
            return this.V;
        }
        l5.q("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    @Override // defpackage.p2
    public final JsonElement o0() {
        return this.V;
    }

    @Override // defpackage.ul2
    public final int p(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return 0;
    }
}

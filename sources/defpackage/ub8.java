package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public class ub8 extends t2 {
    public final LinkedHashMap g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub8(s98 s98Var, Function1<? super JsonElement, j6g> function1) {
        super(s98Var, function1);
        s98Var.getClass();
        function1.getClass();
        this.g = new LinkedHashMap();
    }

    @Override // defpackage.t2
    public JsonElement W() {
        return new JsonObject(this.g);
    }

    @Override // defpackage.t2
    public void X(String str, JsonElement jsonElement) {
        str.getClass();
        jsonElement.getClass();
        this.g.put(str, jsonElement);
    }

    @Override // defpackage.dl2, defpackage.vl2
    public final <T> void k(SerialDescriptor serialDescriptor, int i, r7e<? super T> r7eVar, T t) {
        serialDescriptor.getClass();
        r7eVar.getClass();
        if (t != null || this.d.c) {
            super.k(serialDescriptor, i, r7eVar, t);
        }
    }
}

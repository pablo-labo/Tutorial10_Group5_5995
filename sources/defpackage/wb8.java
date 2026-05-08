package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final class wb8 extends t2 {
    public final ArrayList<JsonElement> g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb8(s98 s98Var, Function1<? super JsonElement, j6g> function1) {
        super(s98Var, function1);
        s98Var.getClass();
        function1.getClass();
        this.g = new ArrayList<>();
    }

    @Override // defpackage.t2, defpackage.dl2
    public final String F(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return String.valueOf(i);
    }

    @Override // defpackage.t2
    public final JsonElement W() {
        return new JsonArray(this.g);
    }

    @Override // defpackage.t2
    public final void X(String str, JsonElement jsonElement) {
        str.getClass();
        jsonElement.getClass();
        this.g.add(Integer.parseInt(str), jsonElement);
    }
}

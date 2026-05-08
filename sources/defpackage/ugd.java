package defpackage;

import androidx.navigation.b;
import androidx.navigation.c;
import androidx.navigation.r;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class ugd extends mj8 implements Function1<c, j6g> {
    final /* synthetic */ int $index;
    final /* synthetic */ String $name;
    final /* synthetic */ KSerializer<Object> $this_generateNavArguments;
    final /* synthetic */ Map<zf8, r<?>> $typeMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ugd(KSerializer<Object> kSerializer, int i, Map<zf8, ? extends r<?>> map, String str) {
        super(1);
        this.$this_generateNavArguments = kSerializer;
        this.$index = i;
        this.$typeMap = map;
        this.$name = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(c cVar) {
        c cVar2 = cVar;
        cVar2.getClass();
        b.a aVar = cVar2.a;
        SerialDescriptor serialDescriptorH = this.$this_generateNavArguments.getDescriptor().h(this.$index);
        boolean zB = serialDescriptorH.b();
        r<Object> rVarA = ygd.a(serialDescriptorH, this.$typeMap);
        if (rVarA == null) {
            l5.q(ygd.e(this.$name, serialDescriptorH.getA(), this.$this_generateNavArguments.getDescriptor().getA(), this.$typeMap.toString()));
            return null;
        }
        aVar.a = rVarA;
        aVar.b = zB;
        if (this.$this_generateNavArguments.getDescriptor().j(this.$index)) {
            aVar.e = true;
        }
        return j6g.a;
    }
}

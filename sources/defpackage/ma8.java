package defpackage;

import kotlin.jvm.functions.Function2;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class ma8 {
    public final hp4 a;
    public boolean b;

    public /* synthetic */ class a extends qv5 implements Function2<SerialDescriptor, Integer, Boolean> {
        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(SerialDescriptor serialDescriptor, Integer num) {
            SerialDescriptor serialDescriptor2 = serialDescriptor;
            int iIntValue = num.intValue();
            serialDescriptor2.getClass();
            ma8 ma8Var = (ma8) this.receiver;
            ma8Var.getClass();
            boolean z = !serialDescriptor2.j(iIntValue) && serialDescriptor2.h(iIntValue).b();
            ma8Var.b = z;
            return Boolean.valueOf(z);
        }
    }

    public ma8(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        this.a = new hp4(serialDescriptor, new a(2, this, ma8.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0));
    }
}

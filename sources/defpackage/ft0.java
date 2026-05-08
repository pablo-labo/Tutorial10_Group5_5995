package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class ft0 extends zy8 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ft0(SerialDescriptor serialDescriptor, int i) {
        super(serialDescriptor);
        this.b = i;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String i() {
        switch (this.b) {
            case 0:
                return "kotlin.collections.ArrayList";
            default:
                return "kotlin.collections.HashSet";
        }
    }
}

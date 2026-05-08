package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class wmb extends zy8 {
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmb(SerialDescriptor serialDescriptor) {
        super(serialDescriptor);
        serialDescriptor.getClass();
        this.b = serialDescriptor.i() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String i() {
        return this.b;
    }
}

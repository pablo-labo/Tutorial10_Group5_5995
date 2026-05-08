package defpackage;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class wd7 extends PluginGeneratedSerialDescriptor {
    public final boolean m;

    public wd7(String str, xd7 xd7Var) {
        super(str, xd7Var, 1);
        this.m = true;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wd7) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.a.equals(serialDescriptor.getA())) {
                wd7 wd7Var = (wd7) obj;
                if (wd7Var.m && Arrays.equals((SerialDescriptor[]) this.k.getValue(), (SerialDescriptor[]) wd7Var.k.getValue())) {
                    int c = serialDescriptor.getC();
                    int i = this.c;
                    if (i == c) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (wl7.b(h(i2).getA(), serialDescriptor.h(i2).getA()) && wl7.b(h(i2).f(), serialDescriptor.h(i2).f())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.m;
    }
}

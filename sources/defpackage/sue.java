package defpackage;

import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class sue {
    public static final Set<SerialDescriptor> a = ut0.I0(new SerialDescriptor[]{j4g.b, p4g.b, yzf.b, y4g.b});

    public static final boolean a(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return serialDescriptor.isInline() && a.contains(serialDescriptor);
    }
}

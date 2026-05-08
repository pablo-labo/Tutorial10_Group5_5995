package defpackage;

import com.datadog.android.core.internal.CoreFeature;
import defpackage.m7e;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class jca {
    public static final Class<?> a(SerialDescriptor serialDescriptor) {
        String strI = wve.I(serialDescriptor.getA(), CoreFeature.DEFAULT_APP_VERSION, "");
        try {
            return Class.forName(strI);
        } catch (ClassNotFoundException unused) {
            if (zve.L(strI, ".", false)) {
                return Class.forName(new pxc("(\\.+)(?!.*\\.)").e(strI, "\\$"));
            }
            bg.l("Cannot find class with name \"", serialDescriptor.getA(), "\". Ensure that the serialName for this argument is the default fully qualified name");
            return null;
        }
    }

    public static final cj7 b(SerialDescriptor serialDescriptor) {
        String strI = wve.I(serialDescriptor.getA(), CoreFeature.DEFAULT_APP_VERSION, "");
        if (wl7.b(serialDescriptor.f(), m7e.b.a)) {
            return serialDescriptor.b() ? cj7.j0 : cj7.i0;
        }
        if (strI.equals("kotlin.Int")) {
            return serialDescriptor.b() ? cj7.b : cj7.a;
        }
        if (strI.equals("kotlin.Boolean")) {
            return serialDescriptor.b() ? cj7.d : cj7.c;
        }
        if (strI.equals("kotlin.Double")) {
            if (serialDescriptor.b()) {
                return cj7.f;
            }
        } else if (!strI.equals("kotlin.Double")) {
            return strI.equals("kotlin.Float") ? serialDescriptor.b() ? cj7.W : cj7.V : strI.equals("kotlin.Long") ? serialDescriptor.b() ? cj7.Y : cj7.X : strI.equals("kotlin.String") ? serialDescriptor.b() ? cj7.a0 : cj7.Z : strI.equals("kotlin.IntArray") ? cj7.b0 : strI.equals("kotlin.DoubleArray") ? cj7.d0 : strI.equals("kotlin.BooleanArray") ? cj7.c0 : strI.equals("kotlin.FloatArray") ? cj7.e0 : strI.equals("kotlin.LongArray") ? cj7.f0 : strI.equals("kotlin.Array") ? cj7.g0 : wve.K(strI, "kotlin.collections.ArrayList", false) ? cj7.h0 : cj7.k0;
        }
        return cj7.e;
    }
}

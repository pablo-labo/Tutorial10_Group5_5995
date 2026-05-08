package defpackage;

import defpackage.gwe;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class eb8 {
    public Object[] a;
    public int[] b;
    public int c;

    public static final class a {
        public static final a a = new a();
    }

    public final String a() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.c + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.a[i2];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                boolean zB = wl7.b(serialDescriptor.f(), gwe.b.a);
                int[] iArr = this.b;
                if (!zB) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(serialDescriptor.e(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(this.b[i2]);
                    sb.append("]");
                }
            } else if (obj != a.a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return a();
    }
}

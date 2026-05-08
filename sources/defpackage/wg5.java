package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class wg5 {

    public static final class a {
        public long a;
    }

    public static boolean a(g4b g4bVar, ah5 ah5Var, int i, a aVar) {
        long jZ = g4bVar.z();
        long j = jZ >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i2 = (int) ((jZ >> 12) & 15);
        int i3 = (int) ((jZ >> 8) & 15);
        int i4 = (int) ((jZ >> 4) & 15);
        int i5 = (int) ((jZ >> 1) & 7);
        boolean z2 = (jZ & 1) == 1;
        if (i4 <= 7) {
            if (i4 != ah5Var.g - 1) {
                return false;
            }
        } else if (i4 > 10 || ah5Var.g != 2) {
            return false;
        }
        if (!(i5 == 0 || i5 == ah5Var.i) || z2) {
            return false;
        }
        try {
            long jE = g4bVar.E();
            if (!z) {
                jE *= (long) ah5Var.b;
            }
            aVar.a = jE;
            int iB = b(i2, g4bVar);
            if (iB == -1 || iB > ah5Var.b) {
                return false;
            }
            int i6 = ah5Var.e;
            if (i3 != 0) {
                if (i3 <= 11) {
                    if (i3 != ah5Var.f) {
                        return false;
                    }
                } else if (i3 != 12) {
                    if (i3 > 14) {
                        return false;
                    }
                    int iD = g4bVar.D();
                    if (i3 == 14) {
                        iD *= 10;
                    }
                    if (iD != i6) {
                        return false;
                    }
                } else if (g4bVar.x() * 1000 != i6) {
                    return false;
                }
            }
            int iX = g4bVar.x();
            int i7 = g4bVar.b;
            byte[] bArr = g4bVar.a;
            int i8 = i7 - 1;
            int i9 = 0;
            for (int i10 = g4bVar.b; i10 < i8; i10++) {
                i9 = vjg.m[i9 ^ (bArr[i10] & 255)];
            }
            String str = vjg.a;
            return iX == i9;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static int b(int i, g4b g4bVar) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return g4bVar.x() + 1;
            case 7:
                return g4bVar.D() + 1;
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
            case 12:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
                return IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER << (i - 8);
            default:
                return -1;
        }
    }
}

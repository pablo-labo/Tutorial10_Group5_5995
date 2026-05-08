package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class mvh implements ovh {
    public static void a(int i) {
        boolean z = true;
        if (i != 100 && i != 102 && i != 104) {
            if (i == 105) {
                i = 105;
            } else {
                z = false;
            }
        }
        fib.c(z, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i));
    }

    public static String c(int i) {
        if (i == 100) {
            return "HIGH_ACCURACY";
        }
        if (i == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i == 104) {
            return "LOW_POWER";
        }
        if (i == 105) {
            return "PASSIVE";
        }
        o6.h();
        return null;
    }

    @Override // defpackage.ovh
    public byte[] b(int i, byte[] bArr, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }
}

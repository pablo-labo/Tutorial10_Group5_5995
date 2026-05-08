package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qbb {
    public static final String a(so5 so5Var, Context context) {
        boolean z;
        float fA;
        ArrayList arrayList = so5Var.a;
        ky3 ky3VarB = h4.b(context);
        int i = 0;
        int i2 = (Build.VERSION.SDK_INT < 31 || context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE) ? 0 : context.getResources().getConfiguration().fontWeightAdjustment;
        if (i2 == 0) {
            return fz8.b(31, null, arrayList, new wa(ky3VarB));
        }
        int size = arrayList.size();
        String strConcat = "";
        boolean z2 = false;
        while (i < size) {
            po5 po5Var = (po5) arrayList.get(i);
            if (wl7.b(po5Var.b(), "wght")) {
                fA = nic.B(po5Var.a() + i2, 1.0f, 1000.0f);
                z = true;
            } else {
                z = z2;
                fA = po5Var.a();
            }
            if (i != 0) {
                strConcat = strConcat.concat(",");
            }
            strConcat = strConcat + '\'' + po5Var.b() + "' " + fA;
            i++;
            z2 = z;
        }
        if (z2) {
            return strConcat;
        }
        float fB = nic.B(i2 + 400.0f, 1.0f, 1000.0f);
        if (!arrayList.isEmpty()) {
            strConcat = strConcat.concat(",");
        }
        return strConcat + "'wght' " + fB;
    }
}

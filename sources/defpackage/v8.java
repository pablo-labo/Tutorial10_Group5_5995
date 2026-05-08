package defpackage;

import android.content.Context;
import android.content.Intent;
import defpackage.o8;

/* JADX INFO: loaded from: classes.dex */
public final class v8 extends o8<String, Boolean> {
    @Override // defpackage.o8
    public final Intent a(Object obj, Context context) {
        String str = (String) obj;
        str.getClass();
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    @Override // defpackage.o8
    public final o8.a b(Object obj, Context context) {
        String str = (String) obj;
        str.getClass();
        if (ot2.a(context, str) == 0) {
            return new o8.a(Boolean.TRUE);
        }
        return null;
    }

    @Override // defpackage.o8
    public final Object c(Intent intent, int i) {
        if (intent == null || i != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z = false;
        if (intArrayExtra != null) {
            int length = intArrayExtra.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (intArrayExtra[i2] == 0) {
                    z = true;
                    break;
                }
                i2++;
            }
        }
        return Boolean.valueOf(z);
    }
}

package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import defpackage.o8;

/* JADX INFO: loaded from: classes.dex */
public final class p8 extends o8<String, Uri> {
    public final String a;

    public p8(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.o8
    public final Intent a(Object obj, Context context) {
        String str = (String) obj;
        str.getClass();
        Intent intentPutExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.a).putExtra("android.intent.extra.TITLE", str);
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    @Override // defpackage.o8
    public final o8.a b(Object obj, Context context) {
        ((String) obj).getClass();
        return null;
    }

    @Override // defpackage.o8
    public final Object c(Intent intent, int i) {
        if (i != -1) {
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }
}

package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import defpackage.o8;

/* JADX INFO: loaded from: classes.dex */
public final class y8 extends o8<Uri, Boolean> {
    @Override // defpackage.o8
    public final Intent a(Object obj, Context context) {
        Uri uri = (Uri) obj;
        uri.getClass();
        Intent intentPutExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri);
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    @Override // defpackage.o8
    public final o8.a b(Object obj, Context context) {
        ((Uri) obj).getClass();
        return null;
    }

    @Override // defpackage.o8
    public final Object c(Intent intent, int i) {
        return Boolean.valueOf(i == -1);
    }
}

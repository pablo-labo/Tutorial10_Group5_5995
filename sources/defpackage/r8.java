package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import defpackage.o8;

/* JADX INFO: loaded from: classes.dex */
public final class r8 extends o8<String[], Uri> {
    @Override // defpackage.o8
    public final Intent a(Object obj, Context context) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
        type.getClass();
        return type;
    }

    @Override // defpackage.o8
    public final o8.a b(Object obj, Context context) {
        ((String[]) obj).getClass();
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

package defpackage;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class ohg implements kh8<Uri> {
    @Override // defpackage.kh8
    public final String a(Uri uri, qva qvaVar) {
        Uri uri2 = uri;
        if (!wl7.b(uri2.getScheme(), "android.resource")) {
            return uri2.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri2);
        sb.append('-');
        Configuration configuration = qvaVar.a.getResources().getConfiguration();
        Bitmap.Config[] configArr = m.a;
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }
}

package defpackage;

import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class cb5 implements fc9<Uri, File> {
    @Override // defpackage.fc9
    public final File a(Uri uri, qva qvaVar) {
        String scheme;
        Uri uriBuild = uri;
        if (!m.c(uriBuild) && ((scheme = uriBuild.getScheme()) == null || scheme.equals("file"))) {
            String path = uriBuild.getPath();
            if (path == null) {
                path = "";
            }
            if (zve.m0(path, '/') && ((String) z92.Q0(uriBuild.getPathSegments())) != null) {
                if (uriBuild.getScheme() != null) {
                    uriBuild = uriBuild.buildUpon().scheme(null).build();
                }
                return new File(uriBuild.toString());
            }
        }
        return null;
    }
}

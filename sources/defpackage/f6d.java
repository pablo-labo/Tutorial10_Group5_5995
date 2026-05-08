package defpackage;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f6d implements fc9<Uri, Uri> {
    @Override // defpackage.fc9
    public final Uri a(Uri uri, qva qvaVar) throws PackageManager.NameNotFoundException {
        String authority;
        Uri uri2 = uri;
        if (wl7.b(uri2.getScheme(), "android.resource") && (authority = uri2.getAuthority()) != null && !zve.U(authority) && uri2.getPathSegments().size() == 2) {
            String authority2 = uri2.getAuthority();
            if (authority2 == null) {
                authority2 = "";
            }
            Resources resourcesForApplication = qvaVar.a.getPackageManager().getResourcesForApplication(authority2);
            List<String> pathSegments = uri2.getPathSegments();
            int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
            if (identifier != 0) {
                Uri uri3 = Uri.parse("android.resource://" + authority2 + '/' + identifier);
                uri3.getClass();
                return uri3;
            }
            akb.n(p6.d(uri2, "Invalid android.resource URI: "));
        }
        return null;
    }
}

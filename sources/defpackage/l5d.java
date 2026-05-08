package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.datadog.android.core.internal.CoreFeature;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l5d implements j5d<Uri, Drawable> {
    public static final fva<Resources.Theme> b = new fva<>("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, fva.e);
    public final Context a;

    public l5d(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.j5d
    public final boolean a(Uri uri, ova ovaVar) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    @Override // defpackage.j5d
    public final /* bridge */ /* synthetic */ f5d<Drawable> b(Uri uri, int i, int i2, ova ovaVar) {
        return c(uri, ovaVar);
    }

    public final f5d c(Uri uri, ova ovaVar) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            r6.g(z3.l("Package name for ", " is null or empty", uri));
            return null;
        }
        Context context = this.a;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException(p6.d(uri, "Failed to obtain context or unrecognized Uri format for: "), e);
                }
                contextCreatePackageContext = context;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, CoreFeature.DEFAULT_SOURCE_NAME);
            }
            if (identifier == 0) {
                l5.q(p6.d(uri, "Failed to find resource id for: "));
                return null;
            }
        } else {
            if (pathSegments.size() != 1) {
                l5.q(p6.d(uri, "Unrecognized Uri format: "));
                return null;
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException(p6.d(uri, "Unrecognized Uri format: "), e2);
            }
        }
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) ovaVar.c(b) : null;
        Drawable drawableA = theme == null ? mb4.a(context, contextCreatePackageContext, identifier, null) : mb4.a(context, context, identifier, theme);
        if (drawableA != null) {
            return new lka(drawableA);
        }
        return null;
    }
}

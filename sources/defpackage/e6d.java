package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import defpackage.fx9;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e6d<DataT> implements fx9<Uri, DataT> {
    public final Context a;
    public final fx9<Integer, DataT> b;

    public static final class a implements gx9<Uri, AssetFileDescriptor> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // defpackage.gx9
        public final fx9<Uri, AssetFileDescriptor> c(n1a n1aVar) {
            return new e6d(this.a, n1aVar.a(Integer.class, AssetFileDescriptor.class));
        }
    }

    public static final class b implements gx9<Uri, InputStream> {
        public final Context a;

        public b(Context context) {
            this.a = context;
        }

        @Override // defpackage.gx9
        public final fx9<Uri, InputStream> c(n1a n1aVar) {
            return new e6d(this.a, n1aVar.a(Integer.class, InputStream.class));
        }
    }

    public e6d(Context context, fx9<Integer, DataT> fx9Var) {
        this.a = context.getApplicationContext();
        this.b = fx9Var;
    }

    @Override // defpackage.fx9
    public final fx9.a a(Uri uri, int i, int i2, ova ovaVar) {
        Uri uri2 = uri;
        List<String> pathSegments = uri2.getPathSegments();
        int size = pathSegments.size();
        fx9<Integer, DataT> fx9Var = this.b;
        if (size == 1) {
            try {
                int i3 = Integer.parseInt(uri2.getPathSegments().get(0));
                if (i3 != 0) {
                    return fx9Var.a(Integer.valueOf(i3), i, i2, ovaVar);
                }
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri2);
                    return null;
                }
            } catch (NumberFormatException e) {
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri2, e);
                }
            }
        } else if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri2.getPathSegments();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            Context context = this.a;
            int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
            if (identifier != 0) {
                return fx9Var.a(Integer.valueOf(identifier), i, i2, ovaVar);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri2);
                return null;
            }
        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
            Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri2);
        }
        return null;
    }

    @Override // defpackage.fx9
    public final boolean b(Uri uri) {
        Uri uri2 = uri;
        return "android.resource".equals(uri2.getScheme()) && this.a.getPackageName().equals(uri2.getAuthority());
    }
}

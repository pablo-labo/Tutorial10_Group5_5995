package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import defpackage.fx9;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class fve<Data> implements fx9<String, Data> {
    public final fx9<Uri, Data> a;

    public static final class a implements gx9<String, AssetFileDescriptor> {
        @Override // defpackage.gx9
        public final fx9<String, AssetFileDescriptor> c(n1a n1aVar) {
            return new fve(n1aVar.a(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements gx9<String, ParcelFileDescriptor> {
        @Override // defpackage.gx9
        public final fx9<String, ParcelFileDescriptor> c(n1a n1aVar) {
            return new fve(n1aVar.a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements gx9<String, InputStream> {
        @Override // defpackage.gx9
        public final fx9<String, InputStream> c(n1a n1aVar) {
            return new fve(n1aVar.a(Uri.class, InputStream.class));
        }
    }

    public fve(fx9<Uri, Data> fx9Var) {
        this.a = fx9Var;
    }

    @Override // defpackage.fx9
    public final fx9.a a(String str, int i, int i2, ova ovaVar) {
        Uri uriFromFile;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            uriFromFile = null;
        } else if (str2.charAt(0) == '/') {
            uriFromFile = Uri.fromFile(new File(str2));
        } else {
            Uri uri = Uri.parse(str2);
            uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str2)) : uri;
        }
        if (uriFromFile != null) {
            fx9<Uri, Data> fx9Var = this.a;
            if (fx9Var.b(uriFromFile)) {
                return fx9Var.a(uriFromFile, i, i2, ovaVar);
            }
        }
        return null;
    }

    @Override // defpackage.fx9
    public final /* bridge */ /* synthetic */ boolean b(String str) {
        return true;
    }
}

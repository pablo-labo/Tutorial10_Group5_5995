package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import defpackage.fx9;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class v5d<Data> implements fx9<Integer, Data> {
    public final fx9<Uri, Data> a;
    public final Resources b;

    public static final class a implements gx9<Integer, AssetFileDescriptor> {
        public final Resources a;

        public a(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.gx9
        public final fx9<Integer, AssetFileDescriptor> c(n1a n1aVar) {
            return new v5d(this.a, n1aVar.a(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements gx9<Integer, InputStream> {
        public final Resources a;

        public b(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.gx9
        public final fx9<Integer, InputStream> c(n1a n1aVar) {
            return new v5d(this.a, n1aVar.a(Uri.class, InputStream.class));
        }
    }

    public static class c implements gx9<Integer, Uri> {
        public final Resources a;

        public c(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.gx9
        public final fx9<Integer, Uri> c(n1a n1aVar) {
            return new v5d(this.a, m6g.a);
        }
    }

    public v5d(Resources resources, fx9<Uri, Data> fx9Var) {
        this.b = resources;
        this.a = fx9Var;
    }

    @Override // defpackage.fx9
    public final fx9.a a(Integer num, int i, int i2, ova ovaVar) {
        Uri uri;
        Integer num2 = num;
        Resources resources = this.b;
        try {
            uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + '/' + resources.getResourceTypeName(num2.intValue()) + '/' + resources.getResourceEntryName(num2.intValue()));
        } catch (Resources.NotFoundException e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num2, e);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.a.a(uri, i, i2, ovaVar);
    }

    @Override // defpackage.fx9
    public final /* bridge */ /* synthetic */ boolean b(Integer num) {
        return true;
    }
}

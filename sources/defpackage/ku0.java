package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import defpackage.fx9;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class ku0<Data> implements fx9<Uri, Data> {
    public final AssetManager a;
    public final a<Data> b;

    public interface a<Data> {
        ke3<Data> a(AssetManager assetManager, String str);
    }

    public static class b implements gx9<Uri, AssetFileDescriptor>, a<AssetFileDescriptor> {
        public final AssetManager a;

        public b(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // ku0.a
        public final ke3<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new j95(assetManager, str);
        }

        @Override // defpackage.gx9
        public final fx9<Uri, AssetFileDescriptor> c(n1a n1aVar) {
            return new ku0(this.a, this);
        }
    }

    public static class c implements gx9<Uri, InputStream>, a<InputStream> {
        public final AssetManager a;

        public c(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // ku0.a
        public final ke3<InputStream> a(AssetManager assetManager, String str) {
            return new hue(assetManager, str);
        }

        @Override // defpackage.gx9
        public final fx9<Uri, InputStream> c(n1a n1aVar) {
            return new ku0(this.a, this);
        }
    }

    public ku0(AssetManager assetManager, a<Data> aVar) {
        this.a = assetManager;
        this.b = aVar;
    }

    @Override // defpackage.fx9
    public final fx9.a a(Uri uri, int i, int i2, ova ovaVar) {
        Uri uri2 = uri;
        return new fx9.a(new nna(uri2), this.b.a(this.a, uri2.toString().substring(22)));
    }

    @Override // defpackage.fx9
    public final boolean b(Uri uri) {
        Uri uri2 = uri;
        return "file".equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0));
    }
}

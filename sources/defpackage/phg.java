package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import defpackage.fx9;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class phg<Data> implements fx9<Uri, Data> {
    public static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));
    public final c<Data> a;

    public static final class a implements gx9<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {
        public final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // phg.c
        public final ke3<AssetFileDescriptor> a(Uri uri) {
            return new eu0(this.a, uri);
        }

        @Override // defpackage.gx9
        public final fx9<Uri, AssetFileDescriptor> c(n1a n1aVar) {
            return new phg(this);
        }
    }

    public static class b implements gx9<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {
        public final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // phg.c
        public final ke3<ParcelFileDescriptor> a(Uri uri) {
            return new m95(this.a, uri);
        }

        @Override // defpackage.gx9
        public final fx9<Uri, ParcelFileDescriptor> c(n1a n1aVar) {
            return new phg(this);
        }
    }

    public interface c<Data> {
        ke3<Data> a(Uri uri);
    }

    public static class d implements gx9<Uri, InputStream>, c<InputStream> {
        public final ContentResolver a;

        public d(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // phg.c
        public final ke3<InputStream> a(Uri uri) {
            return new lue(this.a, uri);
        }

        @Override // defpackage.gx9
        public final fx9<Uri, InputStream> c(n1a n1aVar) {
            return new phg(this);
        }
    }

    public phg(c<Data> cVar) {
        this.a = cVar;
    }

    @Override // defpackage.fx9
    public final fx9.a a(Uri uri, int i, int i2, ova ovaVar) {
        Uri uri2 = uri;
        return new fx9.a(new nna(uri2), this.a.a(uri2));
    }

    @Override // defpackage.fx9
    public final boolean b(Uri uri) {
        return b.contains(uri.getScheme());
    }
}

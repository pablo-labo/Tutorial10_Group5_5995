package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.imagepipeline.request.a;
import defpackage.f94;
import defpackage.inb;
import defpackage.r07;
import defpackage.rhg;
import defpackage.vhb;
import defpackage.x4d;
import defpackage.xr1;
import defpackage.yfd;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ImageRequestBuilder {
    public static final HashSet n = new HashSet();
    public Uri a;
    public a.c b;
    public int c;
    public x4d d;
    public yfd e;
    public r07 f;
    public a.b g;
    public boolean h;
    public boolean i;
    public inb j;
    public vhb k;
    public xr1 l;
    public f94 m;

    public static class BuilderException extends RuntimeException {
        public BuilderException(String str) {
            super("Invalid request builder: ".concat(str));
        }
    }

    public static ImageRequestBuilder b(a aVar) {
        ImageRequestBuilder imageRequestBuilderD = d(aVar.b);
        imageRequestBuilderD.f = aVar.g;
        imageRequestBuilderD.l = aVar.j;
        imageRequestBuilderD.g = aVar.a;
        imageRequestBuilderD.i = aVar.a();
        imageRequestBuilderD.b = aVar.l;
        imageRequestBuilderD.c = aVar.m;
        imageRequestBuilderD.k = aVar.p;
        imageRequestBuilderD.h = aVar.e;
        imageRequestBuilderD.j = aVar.k;
        imageRequestBuilderD.d = aVar.h;
        imageRequestBuilderD.e = aVar.i;
        imageRequestBuilderD.m = aVar.q;
        return imageRequestBuilderD;
    }

    public static boolean c(Uri uri) {
        HashSet hashSet = n;
        if (hashSet == null || uri == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(uri.getScheme())) {
                return true;
            }
        }
        return false;
    }

    public static ImageRequestBuilder d(Uri uri) {
        ImageRequestBuilder imageRequestBuilder = new ImageRequestBuilder();
        imageRequestBuilder.a = null;
        imageRequestBuilder.b = a.c.FULL_FETCH;
        imageRequestBuilder.c = 0;
        imageRequestBuilder.d = null;
        imageRequestBuilder.e = null;
        imageRequestBuilder.f = r07.c;
        imageRequestBuilder.g = a.b.b;
        imageRequestBuilder.h = false;
        imageRequestBuilder.i = false;
        imageRequestBuilder.j = inb.d;
        imageRequestBuilder.k = null;
        imageRequestBuilder.l = null;
        imageRequestBuilder.m = null;
        uri.getClass();
        imageRequestBuilder.a = uri;
        return imageRequestBuilder;
    }

    public final a a() {
        Uri uri = this.a;
        if (uri == null) {
            throw new BuilderException("Source must be set!");
        }
        if ("res".equals(rhg.b(uri))) {
            if (!this.a.isAbsolute()) {
                throw new BuilderException("Resource URI path must be absolute.");
            }
            if (this.a.getPath().isEmpty()) {
                throw new BuilderException("Resource URI must not be empty");
            }
            try {
                Integer.parseInt(this.a.getPath().substring(1));
            } catch (NumberFormatException unused) {
                throw new BuilderException("Resource URI path must be a resource id.");
            }
        }
        if (!"asset".equals(rhg.b(this.a)) || this.a.isAbsolute()) {
            return new a(this);
        }
        throw new BuilderException("Asset URI path must be absolute.");
    }
}

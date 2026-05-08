package com.facebook.imagepipeline.request;

import android.net.Uri;
import android.os.Build;
import defpackage.f94;
import defpackage.inb;
import defpackage.ot1;
import defpackage.r07;
import defpackage.rhg;
import defpackage.vhb;
import defpackage.wab;
import defpackage.wm9;
import defpackage.wna;
import defpackage.wve;
import defpackage.x4d;
import defpackage.xr1;
import defpackage.yfd;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public final b a;
    public final Uri b;
    public final int c;
    public File d;
    public final boolean e;
    public final boolean f;
    public final r07 g;
    public final x4d h;
    public final yfd i;
    public final xr1 j;
    public final inb k;
    public final c l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final vhb p;
    public final f94 q;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.request.a$a, reason: collision with other inner class name */
    public class C0128a {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final /* synthetic */ b[] d;

        static {
            b bVar = new b("SMALL", 0);
            a = bVar;
            b bVar2 = new b("DEFAULT", 1);
            b = bVar2;
            b bVar3 = new b("DYNAMIC", 2);
            c = bVar3;
            d = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }
    }

    public enum c {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);

        private int mValue;

        c(int i) {
            this.mValue = i;
        }

        public static c a(c cVar, c cVar2) {
            return cVar.mValue > cVar2.mValue ? cVar : cVar2;
        }

        public final int c() {
            return this.mValue;
        }
    }

    public a(ImageRequestBuilder imageRequestBuilder) {
        this.a = imageRequestBuilder.g;
        Uri uri = imageRequestBuilder.a;
        this.b = uri;
        int i = -1;
        if (uri != null) {
            if (rhg.c(uri)) {
                i = 0;
            } else if (uri.getPath() != null && "file".equals(rhg.b(uri))) {
                String strA = wm9.a(uri.getPath());
                i = strA != null ? wve.K(strA, "video/", false) : false ? 2 : 3;
            } else if ("content".equals(rhg.b(uri))) {
                i = 4;
            } else if ("asset".equals(rhg.b(uri))) {
                i = 5;
            } else if ("res".equals(rhg.b(uri))) {
                i = 6;
            } else if ("data".equals(uri.getScheme())) {
                i = 7;
            } else if ("android.resource".equals(rhg.b(uri))) {
                i = 8;
            }
        }
        this.c = i;
        this.e = imageRequestBuilder.h;
        this.f = imageRequestBuilder.i;
        this.g = imageRequestBuilder.f;
        this.h = imageRequestBuilder.d;
        yfd yfdVar = imageRequestBuilder.e;
        this.i = yfdVar == null ? yfd.c : yfdVar;
        this.j = imageRequestBuilder.l;
        this.k = imageRequestBuilder.j;
        this.l = imageRequestBuilder.b;
        boolean z = (imageRequestBuilder.c & 48) == 0 && (rhg.c(imageRequestBuilder.a) || ImageRequestBuilder.c(imageRequestBuilder.a));
        this.n = z;
        int i2 = imageRequestBuilder.c;
        this.m = !z ? i2 | 48 : i2;
        this.o = (i2 & 15) == 0;
        this.p = imageRequestBuilder.k;
        this.q = imageRequestBuilder.m;
    }

    public final boolean a() {
        return Build.VERSION.SDK_INT >= 29 && this.f;
    }

    public final synchronized File b() {
        try {
            if (this.d == null) {
                this.b.getPath().getClass();
                this.d = new File(this.b.getPath());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.d;
    }

    public final boolean c(int i) {
        return (this.m & i) == 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.n != aVar.n || this.o != aVar.o || !wna.a(this.b, aVar.b) || !wna.a(this.a, aVar.a)) {
            return false;
        }
        if (!wna.a(null, null) || !wna.a(this.d, aVar.d) || !wna.a(this.j, aVar.j) || !wna.a(this.g, aVar.g) || !wna.a(this.h, aVar.h) || !wna.a(this.k, aVar.k) || !wna.a(this.l, aVar.l) || !wna.a(Integer.valueOf(this.m), Integer.valueOf(aVar.m)) || !wna.a(null, null) || !wna.a(null, null) || !wna.a(this.q, aVar.q) || !wna.a(this.i, aVar.i) || this.f != aVar.f) {
            return false;
        }
        vhb vhbVar = this.p;
        ot1 ot1VarC = vhbVar != null ? vhbVar.c() : null;
        vhb vhbVar2 = aVar.p;
        return wna.a(ot1VarC, vhbVar2 != null ? vhbVar2.c() : null);
    }

    public final int hashCode() {
        vhb vhbVar = this.p;
        return wab.m(wab.m(wab.m(wab.m(wab.m(wab.m(wab.m(wab.m(wab.m(wab.m(wab.m(wab.m(wab.m(wab.m(wab.m(wab.m(wab.m(wab.m(0, this.a), this.b), Boolean.FALSE), this.j), this.k), this.l), Integer.valueOf(this.m)), Boolean.valueOf(this.n)), Boolean.valueOf(this.o)), this.g), null), this.h), this.i), vhbVar != null ? vhbVar.c() : null), null), this.q), 0), Boolean.valueOf(this.f));
    }

    public final String toString() {
        wna.a aVarB = wna.b(this);
        aVarB.b(this.b, "uri");
        aVarB.b(this.a, "cacheChoice");
        aVarB.b(this.g, "decodeOptions");
        aVarB.b(this.p, "postprocessor");
        aVarB.b(this.k, "priority");
        aVarB.b(this.h, "resizeOptions");
        aVarB.b(this.i, "rotationOptions");
        aVarB.b(this.j, "bytesRange");
        aVarB.b(null, "resizingAllowedOverride");
        aVarB.b(this.q, "downsampleOverride");
        aVarB.a("progressiveRenderingEnabled", this.e);
        aVarB.a("localThumbnailPreviewsEnabled", false);
        aVarB.a("loadThumbnailOnly", this.f);
        aVarB.b(this.l, "lowestPermittedRequestLevel");
        aVarB.b(String.valueOf(this.m), "cachesDisabled");
        aVarB.a("isDiskCacheEnabled", this.n);
        aVarB.a("isMemoryCacheEnabled", this.o);
        aVarB.b(null, "decodePrefetches");
        aVarB.b(String.valueOf(0), "delayMs");
        return aVarB.toString();
    }
}

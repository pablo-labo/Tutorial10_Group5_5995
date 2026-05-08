package defpackage;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Size;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class w09 implements opb<n82<l82>> {
    public final Executor a;
    public final ContentResolver b;

    public class a extends xse<n82<l82>> {
        public final /* synthetic */ ppb V;
        public final /* synthetic */ com.facebook.imagepipeline.request.a W;
        public final /* synthetic */ CancellationSignal X;
        public final /* synthetic */ tpb f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xq2 xq2Var, tpb tpbVar, ppb ppbVar, tpb tpbVar2, ppb ppbVar2, com.facebook.imagepipeline.request.a aVar, CancellationSignal cancellationSignal) {
            super(xq2Var, tpbVar, ppbVar, "LocalThumbnailBitmapSdk29Producer");
            this.f = tpbVar2;
            this.V = ppbVar2;
            this.W = aVar;
            this.X = cancellationSignal;
        }

        @Override // defpackage.xse
        public final void b(Object obj) {
            n82.G((n82) obj);
        }

        @Override // defpackage.xse
        public final Map c(n82<l82> n82Var) {
            return g47.d("createdThumbnail", String.valueOf(n82Var != null));
        }

        @Override // defpackage.xse
        public final Object d() throws IOException {
            String strA;
            Bitmap bitmapLoadThumbnail;
            ContentResolver contentResolver = w09.this.b;
            com.facebook.imagepipeline.request.a aVar = this.W;
            x4d x4dVar = aVar.h;
            int i = x4dVar != null ? x4dVar.a : 2048;
            Uri uri = aVar.b;
            Size size = new Size(i, x4dVar != null ? x4dVar.b : 2048);
            try {
                strA = rhg.a(contentResolver, uri);
            } catch (IllegalArgumentException unused) {
                strA = null;
            }
            CancellationSignal cancellationSignal = this.X;
            if (strA != null) {
                String strA2 = wm9.a(strA);
                bitmapLoadThumbnail = strA2 != null ? wve.K(strA2, "video/", false) : false ? ThumbnailUtils.createVideoThumbnail(new File(strA), size, cancellationSignal) : ThumbnailUtils.createImageThumbnail(new File(strA), size, cancellationSignal);
            } else {
                bitmapLoadThumbnail = null;
            }
            if (bitmapLoadThumbnail == null) {
                bitmapLoadThumbnail = contentResolver.loadThumbnail(uri, size, cancellationSignal);
            }
            if (bitmapLoadThumbnail == null) {
                return null;
            }
            if (msb.a == null) {
                msb.a = new msb();
            }
            msb msbVar = msb.a;
            h47 h47Var = h47.d;
            int i2 = jm3.X;
            jm3 jm3Var = new jm3(bitmapLoadThumbnail, msbVar, h47Var);
            ig6 ig6Var = this.V;
            ig6Var.f0("thumbnail", "image_format");
            jm3Var.W(ig6Var.getExtras());
            return n82.b0(jm3Var);
        }

        @Override // defpackage.xse
        public final void e() {
            super.e();
            this.X.cancel();
        }

        @Override // defpackage.xse
        public final void f(Exception exc) {
            super.f(exc);
            tpb tpbVar = this.f;
            ppb ppbVar = this.V;
            tpbVar.c(ppbVar, "LocalThumbnailBitmapSdk29Producer", false);
            ppbVar.p("local", "thumbnail_bitmap");
        }

        @Override // defpackage.xse
        public final void g(n82<l82> n82Var) {
            n82<l82> n82Var2 = n82Var;
            super.g(n82Var2);
            boolean z = n82Var2 != null;
            tpb tpbVar = this.f;
            ppb ppbVar = this.V;
            tpbVar.c(ppbVar, "LocalThumbnailBitmapSdk29Producer", z);
            ppbVar.p("local", "thumbnail_bitmap");
        }
    }

    public class b extends pa1 {
        public final /* synthetic */ a a;

        public b(a aVar) {
            this.a = aVar;
        }

        @Override // defpackage.qpb
        public final void b() {
            this.a.a();
        }
    }

    public w09(Executor executor, ContentResolver contentResolver) {
        this.a = executor;
        this.b = contentResolver;
    }

    @Override // defpackage.opb
    public final void a(xq2<n82<l82>> xq2Var, ppb ppbVar) {
        tpb tpbVarG = ppbVar.G();
        com.facebook.imagepipeline.request.a aVarQ = ppbVar.Q();
        ppbVar.p("local", "thumbnail_bitmap");
        a aVar = new a(xq2Var, tpbVarG, ppbVar, tpbVarG, ppbVar, aVarQ, new CancellationSignal());
        ppbVar.v(new b(aVar));
        this.a.execute(aVar);
    }
}

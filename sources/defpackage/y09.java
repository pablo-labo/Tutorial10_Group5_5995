package defpackage;

import android.content.ContentResolver;
import java.util.Map;
import java.util.concurrent.Executor;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes2.dex */
public final class y09 implements opb<n82<l82>> {
    public final Executor a;
    public final ContentResolver b;

    public class a extends xse<n82<l82>> {
        public final /* synthetic */ ppb V;
        public final /* synthetic */ com.facebook.imagepipeline.request.a W;
        public final /* synthetic */ tpb f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xq2 xq2Var, tpb tpbVar, ppb ppbVar, tpb tpbVar2, ppb ppbVar2, com.facebook.imagepipeline.request.a aVar) {
            super(xq2Var, tpbVar, ppbVar, "VideoThumbnailProducer");
            this.f = tpbVar2;
            this.V = ppbVar2;
            this.W = aVar;
        }

        @Override // defpackage.xse
        public final void b(Object obj) {
            n82.G((n82) obj);
        }

        @Override // defpackage.xse
        public final Map c(n82<l82> n82Var) {
            return g47.d("createdThumbnail", String.valueOf(n82Var != null));
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0028  */
        @Override // defpackage.xse
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object d() throws java.lang.Throwable {
            /*
                r8 = this;
                y09 r0 = defpackage.y09.this
                android.content.ContentResolver r0 = r0.b
                com.facebook.imagepipeline.request.a r1 = r8.W
                r2 = 0
                android.net.Uri r3 = r1.b     // Catch: java.lang.IllegalArgumentException -> Le
                java.lang.String r3 = defpackage.rhg.a(r0, r3)     // Catch: java.lang.IllegalArgumentException -> Le
                goto Lf
            Le:
                r3 = r2
            Lf:
                if (r3 == 0) goto L2e
                x4d r4 = r1.h
                r5 = 2048(0x800, float:2.87E-42)
                if (r4 == 0) goto L1a
                int r6 = r4.a
                goto L1b
            L1a:
                r6 = r5
            L1b:
                r7 = 96
                if (r6 > r7) goto L28
                if (r4 == 0) goto L23
                int r5 = r4.b
            L23:
                if (r5 <= r7) goto L26
                goto L28
            L26:
                r4 = 3
                goto L29
            L28:
                r4 = 1
            L29:
                android.graphics.Bitmap r3 = android.media.ThumbnailUtils.createVideoThumbnail(r3, r4)
                goto L2f
            L2e:
                r3 = r2
            L2f:
                if (r3 != 0) goto L67
                android.net.Uri r1 = r1.b
                java.lang.String r3 = "r"
                android.os.ParcelFileDescriptor r0 = r0.openFileDescriptor(r1, r3)     // Catch: java.lang.Throwable -> L56 java.io.FileNotFoundException -> L58
                r0.getClass()     // Catch: java.lang.Throwable -> L56 java.io.FileNotFoundException -> L58
                android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever     // Catch: java.lang.Throwable -> L56 java.io.FileNotFoundException -> L58
                r1.<init>()     // Catch: java.lang.Throwable -> L56 java.io.FileNotFoundException -> L58
                java.io.FileDescriptor r0 = r0.getFileDescriptor()     // Catch: java.lang.Throwable -> L53 java.io.FileNotFoundException -> L60
                r1.setDataSource(r0)     // Catch: java.lang.Throwable -> L53 java.io.FileNotFoundException -> L60
                r3 = -1
                android.graphics.Bitmap r0 = r1.getFrameAtTime(r3)     // Catch: java.lang.Throwable -> L53 java.io.FileNotFoundException -> L60
                r1.release()     // Catch: java.io.IOException -> L51
            L51:
                r3 = r0
                goto L67
            L53:
                r8 = move-exception
                r2 = r1
                goto L5a
            L56:
                r8 = move-exception
                goto L5a
            L58:
                r1 = r2
                goto L60
            L5a:
                if (r2 == 0) goto L5f
                r2.release()     // Catch: java.io.IOException -> L5f
            L5f:
                throw r8
            L60:
                if (r1 == 0) goto L65
                r1.release()     // Catch: java.io.IOException -> L65
            L65:
                r0 = r2
                goto L51
            L67:
                if (r3 != 0) goto L6a
                goto L94
            L6a:
                msb r0 = defpackage.msb.a
                if (r0 != 0) goto L75
                msb r0 = new msb
                r0.<init>()
                defpackage.msb.a = r0
            L75:
                msb r0 = defpackage.msb.a
                h47 r1 = defpackage.h47.d
                int r2 = defpackage.jm3.X
                jm3 r2 = new jm3
                r2.<init>(r3, r0, r1)
                java.lang.String r0 = "image_format"
                java.lang.String r1 = "thumbnail"
                ppb r8 = r8.V
                r8.f0(r1, r0)
                java.util.Map r8 = r8.getExtras()
                r2.W(r8)
                im3 r2 = defpackage.n82.b0(r2)
            L94:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: y09.a.d():java.lang.Object");
        }

        @Override // defpackage.xse
        public final void f(Exception exc) {
            super.f(exc);
            tpb tpbVar = this.f;
            ppb ppbVar = this.V;
            tpbVar.c(ppbVar, "VideoThumbnailProducer", false);
            ppbVar.p("local", MediaStreamTrack.VIDEO_TRACK_KIND);
        }

        @Override // defpackage.xse
        public final void g(n82<l82> n82Var) {
            n82<l82> n82Var2 = n82Var;
            super.g(n82Var2);
            boolean z = n82Var2 != null;
            tpb tpbVar = this.f;
            ppb ppbVar = this.V;
            tpbVar.c(ppbVar, "VideoThumbnailProducer", z);
            ppbVar.p("local", MediaStreamTrack.VIDEO_TRACK_KIND);
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

    public y09(Executor executor, ContentResolver contentResolver) {
        this.a = executor;
        this.b = contentResolver;
    }

    @Override // defpackage.opb
    public final void a(xq2<n82<l82>> xq2Var, ppb ppbVar) {
        tpb tpbVarG = ppbVar.G();
        com.facebook.imagepipeline.request.a aVarQ = ppbVar.Q();
        ppbVar.p("local", MediaStreamTrack.VIDEO_TRACK_KIND);
        a aVar = new a(xq2Var, tpbVarG, ppbVar, tpbVarG, ppbVar, aVarQ);
        ppbVar.v(new b(aVar));
        this.a.execute(aVar);
    }
}

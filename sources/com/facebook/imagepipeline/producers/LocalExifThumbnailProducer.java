package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.d84;
import defpackage.g47;
import defpackage.oie;
import defpackage.olf;
import defpackage.pa1;
import defpackage.ppb;
import defpackage.tpb;
import defpackage.vs4;
import defpackage.x4d;
import defpackage.xq2;
import defpackage.xse;
import defpackage.yn9;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalExifThumbnailProducer implements olf<vs4> {
    public final Executor a;
    public final yn9 b;
    public final ContentResolver c;

    @d84
    public class Api24Utils {
    }

    public class a extends xse<vs4> {
        public final /* synthetic */ com.facebook.imagepipeline.request.a f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xq2 xq2Var, tpb tpbVar, ppb ppbVar, com.facebook.imagepipeline.request.a aVar) {
            super(xq2Var, tpbVar, ppbVar, "LocalExifThumbnailProducer");
            this.f = aVar;
        }

        @Override // defpackage.xse
        public final void b(Object obj) {
            vs4.h((vs4) obj);
        }

        @Override // defpackage.xse
        public final Map c(vs4 vs4Var) {
            return g47.d("createdThumbnail", Boolean.toString(vs4Var != null));
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003e A[Catch: IOException -> 0x000f, StackOverflowError -> 0x004c, TRY_ENTER, TRY_LEAVE, TryCatch #7 {IOException -> 0x000f, StackOverflowError -> 0x004c, blocks: (B:5:0x0011, B:7:0x001c, B:9:0x0022, B:10:0x0028, B:12:0x0034, B:16:0x003e), top: B:71:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:4:0x000f  */
        @Override // defpackage.xse
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object d() {
            /*
                Method dump skipped, instruction units count: 307
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.LocalExifThumbnailProducer.a.d():java.lang.Object");
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

    public LocalExifThumbnailProducer(Executor executor, yn9 yn9Var, ContentResolver contentResolver) {
        this.a = executor;
        this.b = yn9Var;
        this.c = contentResolver;
    }

    @Override // defpackage.opb
    public final void a(xq2<vs4> xq2Var, ppb ppbVar) {
        tpb tpbVarG = ppbVar.G();
        com.facebook.imagepipeline.request.a aVarQ = ppbVar.Q();
        ppbVar.p("local", "exif");
        a aVar = new a(xq2Var, tpbVarG, ppbVar, aVarQ);
        ppbVar.v(new b(aVar));
        this.a.execute(aVar);
    }

    @Override // defpackage.olf
    public final boolean b(x4d x4dVar) {
        return oie.l(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, x4dVar);
    }
}

package com.canhub.cropper;

import android.graphics.Bitmap;
import android.net.Uri;
import com.canhub.cropper.CropImageView;
import com.canhub.cropper.d;
import defpackage.c1f;
import defpackage.e13;
import defpackage.f13;
import defpackage.huc;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r6;
import defpackage.r7d;
import defpackage.uh3;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.canhub.cropper.BitmapLoadingWorkerJob$onPostExecute$2", f = "BitmapLoadingWorkerJob.kt", l = {}, m = "invokeSuspend")
public final class e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ d.a $result;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, d.a aVar, lu2<? super e> lu2Var) {
        super(2, lu2Var);
        this.this$0 = dVar;
        this.$result = aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        e eVar = new e(this.this$0, this.$result, lu2Var);
        eVar.L$0 = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        CropImageView cropImageView;
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        e13 e13Var = (e13) this.L$0;
        huc hucVar = new huc();
        if (f13.e(e13Var) && (cropImageView = this.this$0.e.get()) != null) {
            d.a aVar = this.$result;
            hucVar.element = true;
            aVar.getClass();
            Uri uri = aVar.a;
            cropImageView.C0 = null;
            cropImageView.i();
            Exception exc = aVar.g;
            if (exc == null) {
                int i = aVar.d;
                cropImageView.b0 = i;
                cropImageView.d0 = aVar.e;
                cropImageView.e0 = aVar.f;
                cropImageView.g(aVar.b, 0, uri, aVar.c, i);
            }
            CropImageView.i iVar = cropImageView.s0;
            if (iVar != null) {
                iVar.l(cropImageView, uri, exc);
            }
        }
        if (!hucVar.element && (bitmap = this.$result.b) != null) {
            bitmap.recycle();
        }
        return j6g.a;
    }
}

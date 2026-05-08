package com.canhub.cropper;

import android.graphics.Bitmap;
import com.canhub.cropper.CropImageView;
import com.canhub.cropper.a;
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
@uh3(c = "com.canhub.cropper.BitmapCroppingWorkerJob$onPostExecute$2", f = "BitmapCroppingWorkerJob.kt", l = {}, m = "invokeSuspend")
public final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ a.C0119a $result;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, a.C0119a c0119a, lu2<? super b> lu2Var) {
        super(2, lu2Var);
        this.this$0 = aVar;
        this.$result = c0119a;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        b bVar = new b(this.this$0, this.$result, lu2Var);
        bVar.L$0 = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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
        if (f13.e(e13Var) && (cropImageView = this.this$0.b.get()) != null) {
            a.C0119a c0119a = this.$result;
            hucVar.element = true;
            c0119a.getClass();
            cropImageView.D0 = null;
            cropImageView.i();
            CropImageView.e eVar = cropImageView.t0;
            if (eVar != null) {
                eVar.h(cropImageView, new CropImageView.b(cropImageView.imageUri, c0119a.b, c0119a.c, cropImageView.getCropPoints(), cropImageView.getCropRect(), cropImageView.getWholeImageRect(), cropImageView.getC0(), c0119a.d));
            }
        }
        if (!hucVar.element && (bitmap = this.$result.a) != null) {
            bitmap.recycle();
        }
        return j6g.a;
    }
}

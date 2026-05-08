package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import androidx.core.content.FileProvider;
import defpackage.ide;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.components.other.HiredCelebrationContentKt$HiredCelebrationContent$2$3$1$3$1$1", f = "HiredCelebrationContent.kt", l = {}, m = "invokeSuspend")
public final class hi6 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ g4a<Bitmap> $shareBitmap$delegate;
    final /* synthetic */ String $shareSubject;
    final /* synthetic */ String $shareText;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi6(String str, g4a<Bitmap> g4aVar, Context context, String str2, lu2<? super hi6> lu2Var) {
        super(2, lu2Var);
        this.$shareText = str;
        this.$shareBitmap$delegate = g4aVar;
        this.$context = context;
        this.$shareSubject = str2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        hi6 hi6Var = new hi6(this.$shareText, this.$shareBitmap$delegate, this.$context, this.$shareSubject, lu2Var);
        hi6Var.L$0 = obj;
        return hi6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((hi6) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Uri uriD;
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        String strK = t40.k(this.$shareText, " https://go.indeed.com/GGHXMT\n");
        Bitmap value = this.$shareBitmap$delegate.getValue();
        Context context = this.$context;
        if (value != null) {
            String str = this.$shareSubject;
            context.getClass();
            try {
                File file = new File(context.getCacheDir(), "images");
                file.mkdirs();
                File file2 = new File(file, "indeed_job_share".concat(".jpg"));
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    value.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    fileOutputStream.close();
                    uriD = FileProvider.d(context, context.getPackageName(), file2);
                } finally {
                }
            } catch (Exception unused) {
                ArrayList arrayList = lz2.a;
                lz2.c("ImageSaveAndShareUtils", "Error saving bitmap to cache", false, null, 12);
                uriD = null;
            }
            if (uriD != null) {
                str.getClass();
                try {
                    InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriD);
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream.close();
                    }
                    ArrayList arrayList2 = lz2.a;
                    Log.d("ImageSaveAndShareUtils", "Sharing URI: " + uriD, null);
                    ide.a aVar = new ide.a(context);
                    Intent intent = aVar.b;
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.TEXT", (CharSequence) strK);
                    intent.putExtra("android.intent.extra.SUBJECT", str);
                    aVar.d = null;
                    ArrayList<Uri> arrayList3 = new ArrayList<>();
                    aVar.d = arrayList3;
                    arrayList3.add(uriD);
                    aVar.c = "Share via";
                    aVar.a();
                } catch (Exception unused2) {
                    ArrayList arrayList4 = lz2.a;
                    lz2.c("ImageSaveAndShareUtils", "Error in shareWithUri", false, null, 12);
                    e37.d(context, strK);
                }
            } else {
                e37.d(context, strK);
            }
        } else {
            e37.d(context, strK);
        }
        return j6g.a;
    }
}

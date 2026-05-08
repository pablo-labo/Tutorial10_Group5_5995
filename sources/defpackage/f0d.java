package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
public final class f0d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ s69 $composition;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $imageAssetsFolder;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0d(s69 s69Var, Context context, String str, lu2<? super f0d> lu2Var) {
        super(2, lu2Var);
        this.$composition = s69Var;
        this.$context = context;
        this.$imageAssetsFolder = str;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new f0d(this.$composition, this.$context, this.$imageAssetsFolder, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((f0d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmapDecodeStream;
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        for (n79 n79Var : ((HashMap) this.$composition.c()).values()) {
            n79Var.getClass();
            String str = n79Var.d;
            if (n79Var.f == null && wve.K(str, "data:", false) && zve.S(str, "base64,", 0, false, 6) > 0) {
                try {
                    byte[] bArrDecode = Base64.decode(str.substring(zve.R(str, ',', 0, false, 6) + 1), 0);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    n79Var.f = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                } catch (IllegalArgumentException e) {
                    a49.c("data URL did not have correct base64 format.", e);
                }
            }
            Context context = this.$context;
            String str2 = this.$imageAssetsFolder;
            if (n79Var.f == null && str2 != null) {
                try {
                    InputStream inputStreamOpen = context.getAssets().open(str2 + str);
                    inputStreamOpen.getClass();
                    try {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inScaled = true;
                        options2.inDensity = 160;
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen, null, options2);
                    } catch (IllegalArgumentException e2) {
                        a49.c("Unable to decode image.", e2);
                        bitmapDecodeStream = null;
                    }
                    if (bitmapDecodeStream != null) {
                        n79Var.f = ckg.d(bitmapDecodeStream, n79Var.a, n79Var.b);
                    }
                } catch (IOException e3) {
                    a49.c("Unable to open asset.", e3);
                }
            }
        }
        return j6g.a;
    }
}

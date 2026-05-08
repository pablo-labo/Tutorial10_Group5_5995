package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadFontsFromAssets$2", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
public final class e0d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ s69 $composition;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $fontAssetsFolder;
    final /* synthetic */ String $fontFileExtension;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0d(s69 s69Var, Context context, String str, String str2, lu2<? super e0d> lu2Var) {
        super(2, lu2Var);
        this.$composition = s69Var;
        this.$context = context;
        this.$fontAssetsFolder = str;
        this.$fontFileExtension = str2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new e0d(this.$composition, this.$context, this.$fontAssetsFolder, this.$fontFileExtension, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((e0d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        for (kn5 kn5Var : this.$composition.f.values()) {
            Context context = this.$context;
            kn5Var.getClass();
            String str = kn5Var.a;
            String str2 = this.$fontAssetsFolder;
            String str3 = this.$fontFileExtension;
            String str4 = kn5Var.c;
            try {
                Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), z3.m(str2, str, str3));
                try {
                    typefaceCreateFromAsset.getClass();
                    str4.getClass();
                    int i = 0;
                    boolean zL = zve.L(str4, "Italic", false);
                    boolean zL2 = zve.L(str4, "Bold", false);
                    if (zL && zL2) {
                        i = 3;
                    } else if (zL) {
                        i = 2;
                    } else if (zL2) {
                        i = 1;
                    }
                    if (typefaceCreateFromAsset.getStyle() != i) {
                        typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i);
                    }
                    kn5Var.d = typefaceCreateFromAsset;
                } catch (Exception unused) {
                    a49.a.getClass();
                }
            } catch (Exception unused2) {
                a49.a.getClass();
            }
        }
        return j6g.a;
    }
}

package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.File;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "expo.modules.imagepicker.contracts.CropImageContract$parseResult$1", f = "CropImageContract.kt", l = {73}, m = "invokeSuspend")
public final class g73 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ ContentResolver $contentResolver;
    final /* synthetic */ h73 $input;
    final /* synthetic */ Uri $targetUri;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g73(h73 h73Var, Uri uri, ContentResolver contentResolver, lu2<? super g73> lu2Var) {
        super(2, lu2Var);
        this.$input = h73Var;
        this.$targetUri = uri;
        this.$contentResolver = contentResolver;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new g73(this.$input, this.$targetUri, this.$contentResolver, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((g73) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            Uri uri = Uri.parse(this.$input.b());
            File fileK = ojd.k(this.$targetUri);
            ContentResolver contentResolver = this.$contentResolver;
            contentResolver.getClass();
            this.label = 1;
            Object objS = ypd.S(new bx(2, fileK, uri, contentResolver), this);
            g13 g13Var = g13.a;
            if (objS == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        return j6g.a;
    }
}

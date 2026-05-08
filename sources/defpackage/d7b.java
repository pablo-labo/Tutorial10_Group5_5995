package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.preview.PdfPreviewKt$PdfPreview$1$1", f = "PdfPreview.kt", l = {}, m = "invokeSuspend")
public final class d7b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ File $file;
    final /* synthetic */ p9d $resumePreviewViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7b(p9d p9dVar, File file, lu2<? super d7b> lu2Var) {
        super(2, lu2Var);
        this.$resumePreviewViewModel = p9dVar;
        this.$file = file;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new d7b(this.$resumePreviewViewModel, this.$file, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((d7b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        p9d p9dVar = this.$resumePreviewViewModel;
        Uri uriFromFile = Uri.fromFile(this.$file);
        uriFromFile.getClass();
        String name = this.$file.getName();
        name.getClass();
        p9dVar.j(uriFromFile, name);
        return j6g.a;
    }
}

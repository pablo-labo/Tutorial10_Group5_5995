package defpackage;

import android.content.ContentResolver;
import com.facebook.imagepipeline.request.a;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class z8c extends q09 {
    public final ContentResolver c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8c(Executor executor, yn9 yn9Var, ContentResolver contentResolver) {
        super(executor, yn9Var);
        executor.getClass();
        yn9Var.getClass();
        contentResolver.getClass();
        this.c = contentResolver;
    }

    @Override // defpackage.q09
    public final vs4 d(a aVar) throws FileNotFoundException {
        aVar.getClass();
        InputStream inputStreamOpenInputStream = this.c.openInputStream(aVar.b);
        if (inputStreamOpenInputStream != null) {
            return c(inputStreamOpenInputStream, -1);
        }
        r6.g("ContentResolver returned null InputStream");
        return null;
    }

    @Override // defpackage.q09
    public final String e() {
        return "QualifiedResourceFetchProducer";
    }
}

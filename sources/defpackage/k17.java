package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import defpackage.w5b;
import defpackage.x54;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class k17 extends mj8 implements gu5<x54> {
    final /* synthetic */ n17 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k17(n17 n17Var) {
        super(0);
        this.this$0 = n17Var;
    }

    @Override // defpackage.gu5
    public final x54 invoke() {
        vqc vqcVarA;
        zhe zheVar = zhe.a;
        Context context = this.this$0.a;
        synchronized (zheVar) {
            vqcVarA = zhe.b;
            if (vqcVarA == null) {
                x54.a aVar = new x54.a();
                Bitmap.Config[] configArr = m.a;
                File cacheDir = context.getCacheDir();
                cacheDir.mkdirs();
                File fileU = hb5.U(cacheDir);
                String str = w5b.b;
                aVar.a = w5b.a.b(fileU);
                vqcVarA = aVar.a();
                zhe.b = vqcVarA;
            }
        }
        return vqcVarA;
    }
}

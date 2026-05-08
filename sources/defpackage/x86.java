package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class x86 implements prf<v86> {
    public final prf<Bitmap> b;

    public x86(prf<Bitmap> prfVar) {
        beb.e(prfVar, "Argument must not be null");
        this.b = prfVar;
    }

    @Override // defpackage.prf
    public final f5d<v86> a(Context context, f5d<v86> f5dVar, int i, int i2) {
        v86 v86Var = f5dVar.get();
        dh1 dh1Var = new dh1(a.a(context).a, v86Var.a.a.l);
        prf<Bitmap> prfVar = this.b;
        f5d<Bitmap> f5dVarA = prfVar.a(context, dh1Var, i, i2);
        if (dh1Var != f5dVarA) {
            dh1Var.recycle();
        }
        v86Var.a.a.c(prfVar, f5dVarA.get());
        return f5dVar;
    }

    @Override // defpackage.kg8
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    @Override // defpackage.kg8
    public final boolean equals(Object obj) {
        if (obj instanceof x86) {
            return this.b.equals(((x86) obj).b);
        }
        return false;
    }

    @Override // defpackage.kg8
    public final int hashCode() {
        return this.b.hashCode();
    }
}

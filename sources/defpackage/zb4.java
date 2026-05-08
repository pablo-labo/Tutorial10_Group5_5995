package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class zb4 implements prf<Drawable> {
    public final prf<Bitmap> b;

    public zb4(prf prfVar) {
        this.b = prfVar;
    }

    @Override // defpackage.prf
    public final f5d<Drawable> a(Context context, f5d<Drawable> f5dVar, int i, int i2) {
        bh1 bh1Var = a.a(context).a;
        Drawable drawable = f5dVar.get();
        dh1 dh1VarA = yb4.a(bh1Var, drawable, i, i2);
        if (dh1VarA == null) {
            w40.m("Unable to convert ", drawable, " to a Bitmap");
            return null;
        }
        f5d<Bitmap> f5dVarA = this.b.a(context, dh1VarA, i, i2);
        if (!f5dVarA.equals(dh1VarA)) {
            return new dn8(context.getResources(), f5dVarA);
        }
        f5dVarA.recycle();
        return f5dVar;
    }

    @Override // defpackage.kg8
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    @Override // defpackage.kg8
    public final boolean equals(Object obj) {
        if (obj instanceof zb4) {
            return this.b.equals(((zb4) obj).b);
        }
        return false;
    }

    @Override // defpackage.kg8
    public final int hashCode() {
        return this.b.hashCode();
    }
}

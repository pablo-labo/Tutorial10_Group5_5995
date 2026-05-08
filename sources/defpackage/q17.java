package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import defpackage.o17;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q17 implements ui7, o17 {
    public final Context a;

    public static final class a extends wb3<Bitmap> {
        public final /* synthetic */ o17.a d;

        public a(o17.a aVar) {
            this.d = aVar;
        }

        @Override // defpackage.wb3, defpackage.y9f
        public final void b() {
            this.d.onFailure(new Exception("Loading bitmap failed"));
        }

        @Override // defpackage.y9f
        public final void d(Object obj) {
            this.d.a((Bitmap) obj);
        }

        @Override // defpackage.y9f
        public final void g() {
        }
    }

    public q17(Context context) {
        context.getClass();
        this.a = context;
    }

    @Override // defpackage.o17
    public final void a(String str, o17.a aVar) {
        str.getClass();
        if (wve.K(str, "asset:///", false)) {
            str = t40.i(z92.Y0(zve.k0(str, new String[]{"/"})), "file:///android_asset/");
        }
        Context context = this.a;
        beb.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        j4d j4dVarB = com.bumptech.glide.a.a(context).e.b(context);
        j4dVarB.getClass();
        ((t3d) new t3d(j4dVarB.a, j4dVarB, j4dVarB.b).c(j4d.Z).f(d64.a).m()).w(str).v(new a(aVar));
    }

    @Override // defpackage.o17
    public final jge b(String str) {
        str.getClass();
        jge jgeVar = new jge();
        a(str, new p17(jgeVar));
        return jgeVar;
    }

    @Override // defpackage.ui7
    public final List<Class<?>> f() {
        return u63.Z(o17.class);
    }
}

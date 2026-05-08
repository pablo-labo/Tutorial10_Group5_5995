package defpackage;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tl2 extends LayerDrawable {
    public final Drawable V;
    public final List<Drawable> W;
    public final kwa X;
    public r7i Y;
    public aj1 Z;
    public final Context a;
    public final Drawable b;
    public final List<Drawable> c;
    public final cs1 d;
    public final p71 e;
    public final ri1 f;

    /* JADX WARN: Multi-variable type inference failed */
    public tl2(Context context, Drawable drawable, List<? extends Drawable> list, cs1 cs1Var, p71 p71Var, ri1 ri1Var, Drawable drawable2, List<? extends Drawable> list2, kwa kwaVar, r7i r7iVar, aj1 aj1Var) {
        context.getClass();
        list.getClass();
        list2.getClass();
        ArrayList arrayList = new ArrayList();
        if (drawable != null) {
            arrayList.add(drawable);
        }
        arrayList.addAll(new xad(list));
        if (cs1Var != null) {
            arrayList.add(cs1Var);
        }
        if (p71Var != null) {
            arrayList.add(p71Var);
        }
        if (ri1Var != null) {
            arrayList.add(ri1Var);
        }
        if (drawable2 != null) {
            arrayList.add(drawable2);
        }
        arrayList.addAll(new xad(list2));
        if (kwaVar != null) {
            arrayList.add(kwaVar);
        }
        super((Drawable[]) arrayList.toArray(new Drawable[0]));
        this.a = context;
        this.b = drawable;
        this.c = list;
        this.d = cs1Var;
        this.e = p71Var;
        this.f = ri1Var;
        this.V = drawable2;
        this.W = list2;
        this.X = kwaVar;
        this.Y = r7iVar;
        this.Z = aj1Var;
        setPaddingMode(1);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.getClass();
        aj1 aj1Var = this.Z;
        if (aj1Var == null || !aj1Var.b()) {
            outline.setRect(getBounds());
            return;
        }
        Path path = new Path();
        aj1 aj1Var2 = this.Z;
        Context context = this.a;
        cn2 cn2VarC = aj1Var2 != null ? aj1Var2.c(getLayoutDirection(), context, getBounds().width(), getBounds().height()) : null;
        r7i r7iVar = this.Y;
        RectF rectFJ = r7iVar != null ? r7iVar.j(context, getLayoutDirection()) : null;
        if (cn2VarC != null) {
            q03 q03Var = cn2VarC.c;
            q03 q03Var2 = cn2VarC.d;
            q03 q03Var3 = cn2VarC.b;
            q03 q03Var4 = cn2VarC.a;
            path.addRoundRect(new RectF(getBounds()), new float[]{nn2.G(q03Var4.a + (rectFJ != null ? rectFJ.left : 0.0f)), nn2.G(q03Var4.b + (rectFJ != null ? rectFJ.top : 0.0f)), nn2.G(q03Var3.a + (rectFJ != null ? rectFJ.right : 0.0f)), nn2.G(q03Var3.b + (rectFJ != null ? rectFJ.top : 0.0f)), nn2.G(q03Var2.a + (rectFJ != null ? rectFJ.right : 0.0f)), nn2.G(q03Var2.b + (rectFJ != null ? rectFJ.bottom : 0.0f)), nn2.G(q03Var.a + (rectFJ != null ? rectFJ.left : 0.0f)), nn2.G(q03Var.b + (rectFJ != null ? rectFJ.bottom : 0.0f))}, Path.Direction.CW);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(path);
        } else {
            outline.setConvexPath(path);
        }
    }
}

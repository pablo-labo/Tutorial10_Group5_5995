package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qce extends z91<ice, Path> {
    public final ice h;
    public final Path i;
    public Path j;
    public Path k;
    public ArrayList l;

    public qce(List<lh8<ice>> list) {
        super(list);
        this.h = new ice();
        this.i = new Path();
    }

    @Override // defpackage.z91
    public final Path f(lh8<ice> lh8Var, float f) {
        ice iceVar = lh8Var.b;
        ice iceVar2 = lh8Var.c;
        if (iceVar2 == null) {
            iceVar2 = iceVar;
        }
        ice iceVarD = this.h;
        ArrayList arrayList = iceVarD.a;
        if (iceVarD.b == null) {
            iceVarD.b = new PointF();
        }
        boolean z = iceVar.c;
        ArrayList arrayList2 = iceVar.a;
        boolean z2 = true;
        iceVarD.c = z || iceVar2.c;
        int size = arrayList2.size();
        ArrayList arrayList3 = iceVar2.a;
        if (size != arrayList3.size()) {
            a49.b("Curves must have the same number of control points. Shape 1: " + arrayList2.size() + "\tShape 2: " + arrayList3.size());
        }
        int iMin = Math.min(arrayList2.size(), arrayList3.size());
        if (arrayList.size() < iMin) {
            for (int size2 = arrayList.size(); size2 < iMin; size2++) {
                arrayList.add(new m83());
            }
        } else if (arrayList.size() > iMin) {
            for (int size3 = arrayList.size() - 1; size3 >= iMin; size3--) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        PointF pointF = iceVar.b;
        PointF pointF2 = iceVar2.b;
        iceVarD.a(du9.e(pointF.x, pointF2.x, f), du9.e(pointF.y, pointF2.y, f));
        int size4 = arrayList.size() - 1;
        while (size4 >= 0) {
            m83 m83Var = (m83) arrayList2.get(size4);
            m83 m83Var2 = (m83) arrayList3.get(size4);
            PointF pointF3 = m83Var.a;
            PointF pointF4 = m83Var.b;
            PointF pointF5 = m83Var.c;
            PointF pointF6 = m83Var2.a;
            PointF pointF7 = m83Var2.b;
            PointF pointF8 = m83Var2.c;
            ((m83) arrayList.get(size4)).a.set(du9.e(pointF3.x, pointF6.x, f), du9.e(pointF3.y, pointF6.y, f));
            ((m83) arrayList.get(size4)).b.set(du9.e(pointF4.x, pointF7.x, f), du9.e(pointF4.y, pointF7.y, f));
            ((m83) arrayList.get(size4)).c.set(du9.e(pointF5.x, pointF8.x, f), du9.e(pointF5.y, pointF8.y, f));
            size4--;
            z2 = z2;
        }
        ArrayList arrayList4 = this.l;
        if (arrayList4 != null) {
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                iceVarD = ((sce) this.l.get(size5)).d(iceVarD);
            }
        }
        Path path = this.i;
        path.reset();
        PointF pointF9 = iceVarD.b;
        ArrayList arrayList5 = iceVarD.a;
        path.moveTo(pointF9.x, pointF9.y);
        PointF pointF10 = du9.a;
        pointF10.set(pointF9.x, pointF9.y);
        for (int i = 0; i < arrayList5.size(); i++) {
            m83 m83Var3 = (m83) arrayList5.get(i);
            PointF pointF11 = m83Var3.a;
            PointF pointF12 = m83Var3.b;
            PointF pointF13 = m83Var3.c;
            if (pointF11.equals(pointF10) && pointF12.equals(pointF13)) {
                path.lineTo(pointF13.x, pointF13.y);
            } else {
                path.cubicTo(pointF11.x, pointF11.y, pointF12.x, pointF12.y, pointF13.x, pointF13.y);
            }
            pointF10.set(pointF13.x, pointF13.y);
        }
        if (iceVarD.c) {
            path.close();
        }
        return path;
    }

    @Override // defpackage.z91
    public final boolean i() {
        ArrayList arrayList = this.l;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }
}

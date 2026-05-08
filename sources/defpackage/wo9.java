package defpackage;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Path;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA)
public final class wo9 implements a6b, hd6 {
    public final Path a = new Path();
    public final Path b = new Path();
    public final Path c = new Path();
    public final ArrayList d = new ArrayList();
    public final vo9 e;

    public wo9(vo9 vo9Var) {
        this.e = vo9Var;
    }

    @TargetApi(BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA)
    public final void a(Path.Op op) {
        Path path = this.b;
        path.reset();
        Path path2 = this.a;
        path2.reset();
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            a6b a6bVar = (a6b) arrayList.get(size);
            if (a6bVar instanceof ts2) {
                ts2 ts2Var = (ts2) a6bVar;
                ArrayList arrayList2 = (ArrayList) ts2Var.f();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path pathC = ((a6b) arrayList2.get(size2)).c();
                    Matrix matrixD = ts2Var.d;
                    lrf lrfVar = ts2Var.k;
                    if (lrfVar != null) {
                        matrixD = lrfVar.d();
                    } else {
                        matrixD.reset();
                    }
                    pathC.transform(matrixD);
                    path.addPath(pathC);
                }
            } else {
                path.addPath(a6bVar.c());
            }
        }
        int i = 0;
        a6b a6bVar2 = (a6b) arrayList.get(0);
        if (a6bVar2 instanceof ts2) {
            ts2 ts2Var2 = (ts2) a6bVar2;
            List<a6b> listF = ts2Var2.f();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listF;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path pathC2 = ((a6b) arrayList3.get(i)).c();
                Matrix matrixD2 = ts2Var2.d;
                lrf lrfVar2 = ts2Var2.k;
                if (lrfVar2 != null) {
                    matrixD2 = lrfVar2.d();
                } else {
                    matrixD2.reset();
                }
                pathC2.transform(matrixD2);
                path2.addPath(pathC2);
                i++;
            }
        } else {
            path2.set(a6bVar2.c());
        }
        this.c.op(path2, path, op);
    }

    @Override // defpackage.ks2
    public final void b(List<ks2> list, List<ks2> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((a6b) arrayList.get(i)).b(list, list2);
            i++;
        }
    }

    @Override // defpackage.a6b
    public final Path c() {
        Path path = this.c;
        path.reset();
        vo9 vo9Var = this.e;
        if (!vo9Var.b) {
            int iOrdinal = vo9Var.a.ordinal();
            if (iOrdinal == 0) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.d;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((a6b) arrayList.get(i)).c());
                    i++;
                }
            } else {
                if (iOrdinal == 1) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (iOrdinal == 2) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (iOrdinal == 3) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (iOrdinal == 4) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }

    @Override // defpackage.hd6
    public final void f(ListIterator<ks2> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            ks2 ks2VarPrevious = listIterator.previous();
            if (ks2VarPrevious instanceof a6b) {
                this.d.add((a6b) ks2VarPrevious);
                listIterator.remove();
            }
        }
    }
}

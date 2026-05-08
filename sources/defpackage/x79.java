package defpackage;

import android.graphics.Bitmap;
import defpackage.xn1;
import java.util.HashSet;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public final class x79 implements ah1 {
    public final zpd a = new zpd();
    public final int b;
    public final xfb c;
    public int d;

    public x79(int i, mia miaVar) {
        this.b = i;
        this.c = miaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.a6d
    public final void a(Object obj) {
        boolean zAdd;
        Bitmap bitmap = (Bitmap) obj;
        this.a.getClass();
        bitmap.getClass();
        int iD = eh1.d(bitmap);
        if (iD <= this.b) {
            this.c.getClass();
            zpd zpdVar = this.a;
            zpdVar.getClass();
            bitmap.getClass();
            if (zpd.d(bitmap)) {
                synchronized (zpdVar) {
                    zAdd = ((HashSet) zpdVar.a).add(bitmap);
                }
                if (zAdd) {
                    xn1 xn1Var = (xn1) zpdVar.b;
                    int iD2 = eh1.d(bitmap);
                    synchronized (xn1Var) {
                        try {
                            xn1.a aVar = (xn1.a) xn1Var.a.get(iD2);
                            xn1.a aVar2 = aVar;
                            if (aVar == null) {
                                LinkedList<I> linkedList = new LinkedList<>();
                                xn1.a aVar3 = new xn1.a();
                                aVar3.a = null;
                                aVar3.b = iD2;
                                aVar3.c = linkedList;
                                aVar3.d = null;
                                xn1Var.a.put(iD2, (xn1.a<T>) aVar3);
                                aVar2 = aVar3;
                            }
                            aVar2.c.addLast((I) bitmap);
                            if (xn1Var.b != aVar2) {
                                xn1Var.a(aVar2);
                                xn1.a aVar4 = xn1Var.b;
                                if (aVar4 == null) {
                                    xn1Var.b = aVar2;
                                    xn1Var.c = aVar2;
                                } else {
                                    aVar2.d = aVar4;
                                    aVar4.a = aVar2;
                                    xn1Var.b = aVar2;
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            synchronized (this) {
                this.d += iD;
            }
        }
    }

    @Override // defpackage.sfb
    public final Bitmap get(int i) {
        Bitmap bitmap;
        synchronized (this) {
            if (this.d > 0) {
                synchronized (this) {
                    while (this.d > 0 && (bitmap = (Bitmap) this.a.e()) != null) {
                        this.a.getClass();
                        this.d -= eh1.d(bitmap);
                        this.c.getClass();
                    }
                }
            }
            Bitmap bitmapC = this.a.c(i);
            if (bitmapC == null) {
                this.c.getClass();
                return Bitmap.createBitmap(1, i, Bitmap.Config.ALPHA_8);
            }
            this.a.getClass();
            this.d -= eh1.d(bitmapC);
            this.c.getClass();
            return bitmapC;
        }
    }
}

package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.a;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class jce implements tlg<ice> {
    public static final jce a = new jce();
    public static final a.C0108a b = a.C0108a.a("c", "v", "i", "o");

    @Override // defpackage.tlg
    public final ice a(a aVar, float f) {
        if (aVar.v() == a.b.a) {
            aVar.a();
        }
        aVar.h();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zNextBoolean = false;
        while (aVar.hasNext()) {
            int iN = aVar.N(b);
            if (iN == 0) {
                zNextBoolean = aVar.nextBoolean();
            } else if (iN == 1) {
                arrayListC = ec8.c(aVar, f);
            } else if (iN == 2) {
                arrayListC2 = ec8.c(aVar, f);
            } else if (iN != 3) {
                aVar.P();
                aVar.I();
            } else {
                arrayListC3 = ec8.c(aVar, f);
            }
        }
        aVar.s();
        if (aVar.v() == a.b.b) {
            aVar.p();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            l5.q("Shape data was missing information.");
            return null;
        }
        if (arrayListC.isEmpty()) {
            return new ice(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayListC.get(i);
            int i2 = i - 1;
            arrayList.add(new m83(du9.a((PointF) arrayListC.get(i2), (PointF) arrayListC3.get(i2)), du9.a(pointF2, (PointF) arrayListC2.get(i)), pointF2));
        }
        if (zNextBoolean) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i3 = size - 1;
            arrayList.add(new m83(du9.a((PointF) arrayListC.get(i3), (PointF) arrayListC3.get(i3)), du9.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new ice(pointF, zNextBoolean, arrayList);
    }
}

package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ec8 {
    public static final a.C0108a a = a.C0108a.a("x", "y");

    public static int a(a aVar) {
        aVar.a();
        int iNextDouble = (int) (aVar.nextDouble() * 255.0d);
        int iNextDouble2 = (int) (aVar.nextDouble() * 255.0d);
        int iNextDouble3 = (int) (aVar.nextDouble() * 255.0d);
        while (aVar.hasNext()) {
            aVar.I();
        }
        aVar.p();
        return Color.argb(255, iNextDouble, iNextDouble2, iNextDouble3);
    }

    public static PointF b(a aVar, float f) {
        int iOrdinal = aVar.v().ordinal();
        if (iOrdinal == 0) {
            aVar.a();
            float fNextDouble = (float) aVar.nextDouble();
            float fNextDouble2 = (float) aVar.nextDouble();
            while (aVar.v() != a.b.b) {
                aVar.I();
            }
            aVar.p();
            return new PointF(fNextDouble * f, fNextDouble2 * f);
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 6) {
                bg.m(aVar.v(), "Unknown point starts with ");
                return null;
            }
            float fNextDouble3 = (float) aVar.nextDouble();
            float fNextDouble4 = (float) aVar.nextDouble();
            while (aVar.hasNext()) {
                aVar.I();
            }
            return new PointF(fNextDouble3 * f, fNextDouble4 * f);
        }
        aVar.h();
        float fD = 0.0f;
        float fD2 = 0.0f;
        while (aVar.hasNext()) {
            int iN = aVar.N(a);
            if (iN == 0) {
                fD = d(aVar);
            } else if (iN != 1) {
                aVar.P();
                aVar.I();
            } else {
                fD2 = d(aVar);
            }
        }
        aVar.s();
        return new PointF(fD * f, fD2 * f);
    }

    public static ArrayList c(a aVar, float f) {
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.v() == a.b.a) {
            aVar.a();
            arrayList.add(b(aVar, f));
            aVar.p();
        }
        aVar.p();
        return arrayList;
    }

    public static float d(a aVar) {
        a.b bVarV = aVar.v();
        int iOrdinal = bVarV.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 6) {
                return (float) aVar.nextDouble();
            }
            akb.o(bVarV, "Unknown value for token of type ");
            return 0.0f;
        }
        aVar.a();
        float fNextDouble = (float) aVar.nextDouble();
        while (aVar.hasNext()) {
            aVar.I();
        }
        aVar.p();
        return fNextDouble;
    }
}

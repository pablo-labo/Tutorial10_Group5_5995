package defpackage;

import defpackage.d04;
import defpackage.hv1;

/* JADX INFO: loaded from: classes3.dex */
public final class w5c {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[c5c.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
            int[] iArr2 = new int[hv1.a.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[q5c.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[4] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[2] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[3] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[5] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            b = iArr3;
        }
    }

    public static final ws3 a(q5c q5cVar) {
        switch (q5cVar == null ? -1 : a.b[q5cVar.ordinal()]) {
            case 1:
                d04.g gVar = d04.d;
                gVar.getClass();
                return gVar;
            case 2:
                d04.d dVar = d04.a;
                dVar.getClass();
                return dVar;
            case 3:
                d04.e eVar = d04.b;
                eVar.getClass();
                return eVar;
            case 4:
                d04.f fVar = d04.c;
                fVar.getClass();
                return fVar;
            case 5:
                d04.h hVar = d04.e;
                hVar.getClass();
                return hVar;
            case 6:
                d04.i iVar = d04.f;
                iVar.getClass();
                return iVar;
            default:
                d04.d dVar2 = d04.a;
                dVar2.getClass();
                return dVar2;
        }
    }
}

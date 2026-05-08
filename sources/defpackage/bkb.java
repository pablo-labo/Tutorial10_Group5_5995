package defpackage;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.p;
import defpackage.rjb;
import defpackage.xjb;
import defpackage.yge;
import defpackage.yjb;
import defpackage.zjb;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class bkb {
    public static final bkb a = new bkb();

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[8];
            System.arraycopy(akb.a, 0, iArr, 0, 8);
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = 1;
            iArr2[1] = 2;
            iArr2[6] = 3;
            iArr2[2] = 4;
            iArr2[3] = 5;
            iArr2[4] = 6;
            iArr2[5] = 7;
            iArr2[7] = 8;
            a = iArr2;
        }
    }

    public final s3a a(FileInputStream fileInputStream) throws CorruptionException {
        int i;
        try {
            xjb xjbVarR = xjb.r(fileInputStream);
            s3a s3aVar = new s3a(1, false);
            rjb.b[] bVarArr = (rjb.b[]) Arrays.copyOf(new rjb.b[0], 0);
            if (s3aVar.b.get()) {
                r6.g("Do mutate preferences once returned to DataStore.");
                return null;
            }
            if (bVarArr.length > 0) {
                bVarArr[0].getClass();
                s3aVar.c(null, null);
                throw null;
            }
            Map<String, zjb> mapP = xjbVarR.p();
            mapP.getClass();
            for (Map.Entry<String, zjb> entry : mapP.entrySet()) {
                String key = entry.getKey();
                zjb value = entry.getValue();
                key.getClass();
                value.getClass();
                int iD = value.D();
                if (iD == 0) {
                    i = -1;
                } else {
                    int[] iArr = a.a;
                    if (iD == 0) {
                        throw null;
                    }
                    i = iArr[iD - 1];
                }
                switch (i) {
                    case -1:
                        throw new CorruptionException("Value case is null.", null);
                    case 0:
                    default:
                        l.g();
                        return null;
                    case 1:
                        s3aVar.c(new rjb.a<>(key), Boolean.valueOf(value.v()));
                        break;
                    case 2:
                        s3aVar.c(new rjb.a<>(key), Float.valueOf(value.y()));
                        break;
                    case 3:
                        s3aVar.c(new rjb.a<>(key), Double.valueOf(value.x()));
                        break;
                    case 4:
                        s3aVar.c(new rjb.a<>(key), Integer.valueOf(value.z()));
                        break;
                    case 5:
                        s3aVar.c(new rjb.a<>(key), Long.valueOf(value.A()));
                        break;
                    case 6:
                        rjb.a<?> aVar = new rjb.a<>(key);
                        String strB = value.B();
                        strB.getClass();
                        s3aVar.c(aVar, strB);
                        break;
                    case 7:
                        rjb.a<?> aVar2 = new rjb.a<>(key);
                        p.c cVarQ = value.C().q();
                        cVarQ.getClass();
                        s3aVar.c(aVar2, z92.E1(cVarQ));
                        break;
                    case 8:
                        throw new CorruptionException("Value not set.", null);
                }
            }
            return new s3a(new LinkedHashMap(s3aVar.a()), true);
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Unable to parse preferences proto.", e);
        }
    }

    public final j6g b(Object obj, yge.b bVar) {
        zjb zjbVarH;
        Map<rjb.a<?>, Object> mapA = ((rjb) obj).a();
        xjb.a aVarQ = xjb.q();
        for (Map.Entry<rjb.a<?>, Object> entry : mapA.entrySet()) {
            rjb.a<?> key = entry.getKey();
            Object value = entry.getValue();
            String str = key.a;
            if (value instanceof Boolean) {
                zjb.a aVarE = zjb.E();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                aVarE.j();
                zjb.s((zjb) aVarE.b, zBooleanValue);
                zjbVarH = aVarE.h();
            } else if (value instanceof Float) {
                zjb.a aVarE2 = zjb.E();
                float fFloatValue = ((Number) value).floatValue();
                aVarE2.j();
                zjb.t((zjb) aVarE2.b, fFloatValue);
                zjbVarH = aVarE2.h();
            } else if (value instanceof Double) {
                zjb.a aVarE3 = zjb.E();
                double dDoubleValue = ((Number) value).doubleValue();
                aVarE3.j();
                zjb.q((zjb) aVarE3.b, dDoubleValue);
                zjbVarH = aVarE3.h();
            } else if (value instanceof Integer) {
                zjb.a aVarE4 = zjb.E();
                int iIntValue = ((Number) value).intValue();
                aVarE4.j();
                zjb.u((zjb) aVarE4.b, iIntValue);
                zjbVarH = aVarE4.h();
            } else if (value instanceof Long) {
                zjb.a aVarE5 = zjb.E();
                long jLongValue = ((Number) value).longValue();
                aVarE5.j();
                zjb.n((zjb) aVarE5.b, jLongValue);
                zjbVarH = aVarE5.h();
            } else if (value instanceof String) {
                zjb.a aVarE6 = zjb.E();
                aVarE6.j();
                zjb.o((zjb) aVarE6.b, (String) value);
                zjbVarH = aVarE6.h();
            } else {
                if (!(value instanceof Set)) {
                    r6.g(wl7.f(value.getClass().getName(), "PreferencesSerializer does not support type: "));
                    return null;
                }
                zjb.a aVarE7 = zjb.E();
                yjb.a aVarR = yjb.r();
                aVarR.j();
                yjb.o((yjb) aVarR.b, (Set) value);
                aVarE7.j();
                zjb.p((zjb) aVarE7.b, aVarR);
                zjbVarH = aVarE7.h();
            }
            aVarQ.getClass();
            aVarQ.j();
            xjb.o((xjb) aVarQ.b).put(str, zjbVarH);
        }
        xjb xjbVarH = aVarQ.h();
        int iE = xjbVarH.e();
        Logger logger = CodedOutputStream.e;
        if (iE > 4096) {
            iE = 4096;
        }
        CodedOutputStream.c cVar = new CodedOutputStream.c(bVar, iE);
        xjbVarH.g(cVar);
        if (cVar.i > 0) {
            cVar.x2();
        }
        return j6g.a;
    }
}

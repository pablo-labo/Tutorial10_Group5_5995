package defpackage;

import android.os.Build;
import defpackage.s98;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonElement;
import org.apache.avro.AvroMissingFieldException;
import org.apache.avro.AvroRuntimeException;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes2.dex */
public final class fu4 implements eu4 {
    public final /* synthetic */ hz4 a;

    public fu4(hz4 hz4Var) {
        this.a = hz4Var;
    }

    @Override // defpackage.eu4
    public final void a(cpe cpeVar, int i) {
        cpeVar.getClass();
        cpeVar.c(i, d());
    }

    @Override // defpackage.eu4
    public final boolean b(g gVar) {
        return wl7.b(gVar.E(), getFullName());
    }

    @Override // defpackage.eu4
    public final void c(LinkedHashMap linkedHashMap, String str) {
        str.getClass();
        s98.a aVar = s98.d;
        String str2 = "{\"" + getFullName() + "\": " + d() + "}";
        aVar.getClass();
        linkedHashMap.put(str, (JsonElement) aVar.c(na8.a, str2));
    }

    public final p34 d() {
        g gVar = p34.a;
        zoe zoeVar = p34.b;
        g.f[] fVarArr = (g.f[]) gVar.C().toArray(new g.f[0]);
        boolean[] zArr = new boolean[fVarArr.length];
        zcb zcbVar = zcb.a;
        g.f fVar = fVarArr[0];
        zArr[0] = true;
        String str = Build.MANUFACTURER;
        htc.b(fVarArr[1], str);
        zArr[1] = true;
        String str2 = Build.PRODUCT;
        htc.b(fVarArr[2], str2);
        zArr[2] = true;
        String str3 = this.a.o;
        htc.b(fVarArr[3], str3);
        zArr[3] = true;
        try {
            p34 p34Var = new p34();
            if (!zArr[0]) {
                g.f fVar2 = fVarArr[0];
                zcbVar = (zcb) zoeVar.g(zoeVar.j(fVar2), fVar2.d);
            }
            p34Var.platform = zcbVar;
            if (!zArr[1]) {
                g.f fVar3 = fVarArr[1];
                str = (String) zoeVar.g(zoeVar.j(fVar3), fVar3.d);
            }
            p34Var.manufacturer = str;
            if (!zArr[2]) {
                g.f fVar4 = fVarArr[2];
                str2 = (String) zoeVar.g(zoeVar.j(fVar4), fVar4.d);
            }
            p34Var.model = str2;
            if (!zArr[3]) {
                g.f fVar5 = fVarArr[3];
                str3 = (String) zoeVar.g(zoeVar.j(fVar5), fVar5.d);
            }
            p34Var.advertisingId = str3;
            return p34Var;
        } catch (AvroMissingFieldException e) {
            throw e;
        } catch (Exception e2) {
            throw new AvroRuntimeException(e2);
        }
    }

    @Override // defpackage.eu4
    public final String getFullName() {
        String strE = p34.a.E();
        strE.getClass();
        return strE;
    }
}

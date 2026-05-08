package defpackage;

import android.content.Context;
import com.wlappdebug.r;
import defpackage.cd4;
import defpackage.xh8;
import kotlin.Lazy;
import org.apache.avro.AvroMissingFieldException;
import org.apache.avro.AvroRuntimeException;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes2.dex */
public final class g00 implements xh8 {
    public final gse V;
    public final Context a;
    public final e13 b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final gse f;

    public g00(Context context) {
        eq3 eq3Var = a74.a;
        eu2 eu2VarA = f13.a(no3.c);
        this.a = context;
        this.b = eu2VarA;
        d00 d00Var = new d00(this);
        qt8 qt8Var = qt8.a;
        this.c = boa.E(qt8Var, d00Var);
        this.d = boa.E(qt8Var, new e00(this));
        this.e = boa.E(qt8Var, new f00(this));
        gse gseVarE = hh2.e(null);
        this.f = gseVarE;
        this.V = gseVarE;
        u63.Y(eu2VarA, null, null, new yz(this, null), 3);
        u63.Y(f13.b(), null, null, new a00(this, null), 3);
    }

    public static boolean c(i00 i00Var) {
        i00Var.getClass();
        dd4 dd4Var = dd4.a;
        ad4 ad4Var = dd4.n().a;
        ad4Var.getClass();
        if (ad4Var.e(cd4.a.Z2) != cd4.z.a.getValue()) {
            return false;
        }
        Integer numE = i00Var.e();
        if (numE != null && numE.intValue() == 3) {
            return true;
        }
        Integer numE2 = i00Var.e();
        return numE2 != null && numE2.intValue() == 2;
    }

    public final Object a(c1f c1fVar) {
        jjd jjdVar = new jjd(ewa.v(c1fVar), g13.b);
        ((r.b) this.e.getValue()).c("ageSignalsUtils.forceRestrictedResult");
        try {
            new md2(new o0i(this.a)).d(new wab(16)).addOnSuccessListener(new h00(new b00(jjdVar, 0))).addOnFailureListener(new c00(jjdVar)).getClass();
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c("AgeSignalUtils", "Failed call ageSignalsManager.checkAgeSignals", false, e);
            jjdVar.resumeWith(null);
        }
        return jjdVar.a();
    }

    public final void b(i00 i00Var) {
        pn6 pn6Var;
        Integer numE;
        tp7 tp7Var = (tp7) cr8.p(tp7.class);
        g gVar = a9a.a;
        zoe zoeVar = a9a.b;
        g.f[] fVarArr = (g.f[]) gVar.C().toArray(new g.f[0]);
        boolean[] zArr = new boolean[fVarArr.length];
        g gVar2 = xz.a;
        zoe zoeVar2 = xz.b;
        g.f[] fVarArr2 = (g.f[]) gVar2.C().toArray(new g.f[0]);
        boolean[] zArr2 = new boolean[fVarArr2.length];
        Integer numA = i00Var.a();
        htc.b(fVarArr2[0], numA);
        zArr2[0] = true;
        Integer numB = i00Var.b();
        htc.b(fVarArr2[1], numB);
        zArr2[1] = true;
        try {
            xz xzVar = new xz();
            if (!zArr2[0]) {
                g.f fVar = fVarArr2[0];
                numA = (Integer) zoeVar2.g(zoeVar2.j(fVar), fVar.d);
            }
            xzVar.lowerBound = numA;
            if (!zArr2[1]) {
                g.f fVar2 = fVarArr2[1];
                numB = (Integer) zoeVar2.g(zoeVar2.j(fVar2), fVar2.d);
            }
            xzVar.upperBound = numB;
            g.f fVar3 = fVarArr[1];
            zArr[1] = true;
            String str = (String) ((nl0) this.c.getValue()).d.getValue();
            htc.b(fVarArr[0], str);
            zArr[0] = true;
            g gVar3 = i40.a;
            zoe zoeVar3 = i40.b;
            g.f[] fVarArr3 = (g.f[]) gVar3.C().toArray(new g.f[0]);
            boolean[] zArr3 = new boolean[fVarArr3.length];
            Integer numE2 = i00Var.e();
            h40 h40Var = (numE2 != null && numE2.intValue() == 0) ? h40.e : (numE2 != null && numE2.intValue() == 1) ? h40.a : (numE2 != null && numE2.intValue() == 3) ? h40.b : (numE2 != null && numE2.intValue() == 2) ? h40.c : (numE2 != null && numE2.intValue() == 4) ? h40.d : h40.d;
            g.f fVar4 = fVarArr3[0];
            zArr3[0] = true;
            try {
                i40 i40Var = new i40();
                if (!zArr3[0]) {
                    g.f fVar5 = fVarArr3[0];
                    h40Var = (h40) zoeVar3.g(zoeVar3.j(fVar5), fVar5.d);
                }
                i40Var.ageRangeEligibility = h40Var;
                g.f fVar6 = fVarArr[2];
                zArr[2] = true;
                try {
                    a9a a9aVar = new a9a();
                    if (!zArr[0]) {
                        g.f fVar7 = fVarArr[0];
                        str = (String) zoeVar.g(zoeVar.j(fVar7), fVar7.d);
                    }
                    a9aVar.appInstallId = str;
                    if (!zArr[1]) {
                        g.f fVar8 = fVarArr[1];
                        xzVar = (xz) zoeVar.g(zoeVar.j(fVar8), fVar8.d);
                    }
                    a9aVar.ageRange = xzVar;
                    if (!zArr[2]) {
                        g.f fVar9 = fVarArr[2];
                        i40Var = (i40) zoeVar.g(zoeVar.j(fVar9), fVar9.d);
                    }
                    a9aVar.androidAgeSignal = i40Var;
                    if (zArr[3]) {
                        pn6Var = null;
                    } else {
                        g.f fVar10 = fVarArr[3];
                        pn6Var = (pn6) zoeVar.g(zoeVar.j(fVar10), fVar10.d);
                    }
                    a9aVar.iosAgeSignal = pn6Var;
                    tp7Var.c(a9aVar);
                    Integer numB2 = i00Var.b();
                    String strA = bu8.a.a();
                    if (numB2 == null || numB2.intValue() >= 16 || strA == null || (numE = i00Var.e()) == null || numE.intValue() != 1) {
                        return;
                    }
                    tp7 tp7Var2 = (tp7) cr8.p(tp7.class);
                    int iIntValue = numB2.intValue();
                    g gVar4 = vh0.a;
                    zoe zoeVar4 = vh0.b;
                    g.f[] fVarArr4 = (g.f[]) gVar4.C().toArray(new g.f[0]);
                    boolean[] zArr4 = new boolean[fVarArr4.length];
                    g.f fVar11 = fVarArr4[0];
                    zArr4[0] = true;
                    int i = iIntValue < 13 ? 1 : iIntValue < 16 ? 2 : -1;
                    g.f fVar12 = fVarArr4[1];
                    zArr4[1] = true;
                    try {
                        vh0 vh0Var = new vh0();
                        if (!zArr4[0]) {
                            g.f fVar13 = fVarArr4[0];
                            strA = (String) zoeVar4.g(zoeVar4.j(fVar13), fVar13.d);
                        }
                        vh0Var.accountId = strA;
                        if (!zArr4[1]) {
                            g.f fVar14 = fVarArr4[1];
                            i = (Integer) zoeVar4.g(zoeVar4.j(fVar14), fVar14.d);
                        }
                        vh0Var.group = i;
                        tp7Var2.c(vh0Var);
                    } catch (AvroMissingFieldException e) {
                        throw e;
                    } catch (Exception e2) {
                        throw new AvroRuntimeException(e2);
                    }
                } catch (AvroMissingFieldException e3) {
                    throw e3;
                } catch (Exception e4) {
                    throw new AvroRuntimeException(e4);
                }
            } catch (AvroMissingFieldException e5) {
                throw e5;
            } catch (Exception e6) {
                throw new AvroRuntimeException(e6);
            }
        } catch (AvroMissingFieldException e7) {
            throw e7;
        } catch (Exception e8) {
            throw new AvroRuntimeException(e8);
        }
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
